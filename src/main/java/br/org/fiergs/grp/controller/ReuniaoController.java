package br.org.fiergs.grp.controller;


import br.org.fiergs.grp.dto.ReuniaoRequestDTO;
import br.org.fiergs.grp.dto.ReuniaoResponseDTO;
import br.org.fiergs.grp.entity.Reuniao;
import br.org.fiergs.grp.service.ReuniaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = "application/json")
public class ReuniaoController {

    private ReuniaoService reuniaoService;

    public ReuniaoController(ReuniaoService service) {
        this.reuniaoService = service;
    }

    @PostMapping(path = "/reuniao")
//    @PreAuthorize("hasRole('AGEPE_ADM[*]')")
    public ResponseEntity<?> addReuniao(@RequestBody @Valid ReuniaoRequestDTO reuniaoRequestDTO) {

        Reuniao reuniao = reuniaoService.addReuniao(reuniaoRequestDTO);
//        return new ResponseEntity("Reunião adicionada com sucesso", HttpStatus.OK);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(reuniao.getId()).toUri();
        return ResponseEntity.created(uri).body(reuniao);
    }

    @GetMapping(path = "/reunioes")
//    @PreAuthorize("hasRole('AGEPE_ADM[*]')")
    public ResponseEntity<List<ReuniaoResponseDTO>> findAll() {
        List<ReuniaoResponseDTO> reuniaoResponseDTOList = reuniaoService.findAll();
        return ResponseEntity.ok().body(reuniaoResponseDTOList);
    }

}
