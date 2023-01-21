package br.org.fiergs.grp.controller;


import br.org.fiergs.grp.dto.ReuniaoRequestDTO;
import br.org.fiergs.grp.dto.ReuniaoResponseDTO;
import br.org.fiergs.grp.entity.Reuniao;
import br.org.fiergs.grp.service.ReuniaoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = "application/json")
public class ReuniaoController {

    private ReuniaoService reuniaoService;

    public ReuniaoController(ReuniaoService service) {
        this.reuniaoService = service;
    }

    @PostMapping(value = "/reuniao")
//    @PreAuthorize("hasRole('AGEPE_ADM[*]')")
    public ResponseEntity<?> addReuniao(@RequestBody ReuniaoRequestDTO reuniaoRequestDTO) {

        reuniaoService.addReuniao(reuniaoRequestDTO);
        return new ResponseEntity("Reunião adicionada com sucesso", HttpStatus.OK);
    }

    @GetMapping(path = "/reunioes")
//    @PreAuthorize("hasRole('AGEPE_ADM[*]')")
    public ResponseEntity<List<ReuniaoResponseDTO>> findAll() {
        return ResponseEntity.ok().body(reuniaoService.findAll());
    }

}
