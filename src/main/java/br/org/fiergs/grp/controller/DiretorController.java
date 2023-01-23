package br.org.fiergs.grp.controller;


import br.org.fiergs.grp.dto.DiretorRequestDTO;
import br.org.fiergs.grp.dto.DiretorResponseDTO;
import br.org.fiergs.grp.entity.Diretor;
import br.org.fiergs.grp.service.DiretorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = "application/json")
public class DiretorController {

    private DiretorService diretorService;

    public DiretorController(DiretorService service) {
        this.diretorService = service;
    }

    @PostMapping(path = "/diretor")
//    @PreAuthorize("hasRole('AGEPE_ADM[*]')")
    public ResponseEntity<DiretorResponseDTO> addDiretor(@RequestBody @Valid DiretorRequestDTO diretorRequestDTO) {
        Diretor diretor = diretorService.addDiretor(diretorRequestDTO);
        DiretorResponseDTO diretorResponseDTO = new DiretorResponseDTO();
        return ResponseEntity.ok().body(diretorResponseDTO.transformaEmDTO(diretor));
    }

    @GetMapping(path = "/diretores")
//    @PreAuthorize("hasRole('AGEPE_ADM[*]')")
    public ResponseEntity<List<DiretorResponseDTO>> findAll() {
        return ResponseEntity.ok().body(diretorService.findAll());
    }

}
