package br.org.fiergs.grp.service;

import br.org.fiergs.grp.dto.ReuniaoRequestDTO;
import br.org.fiergs.grp.dto.ReuniaoResponseDTO;
import br.org.fiergs.grp.entity.Reuniao;
import br.org.fiergs.grp.repository.ReuniaoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReuniaoService {

    ReuniaoRepository repository;

    public ReuniaoService(ReuniaoRepository repository) {
        this.repository = repository;
    }

    public Reuniao addReuniao(ReuniaoRequestDTO reuniaoRequestDTO) {
        return repository.save(reuniaoRequestDTO.transformaParaObjeto());
    }

    public List<ReuniaoResponseDTO> findAll() {
        List<Reuniao> reuniao = repository.findAll();
        List<ReuniaoResponseDTO> reuniaoResponseDTOList = new ArrayList<ReuniaoResponseDTO>();
        ReuniaoResponseDTO reuniaoResponseDTO;
        for (int i = 0; i < reuniao.size(); i++) {
            reuniaoResponseDTO = ReuniaoResponseDTO.transformaEmDTO(reuniao.get(i));
            reuniaoResponseDTOList.add(reuniaoResponseDTO);
        }
        return reuniaoResponseDTOList;
    }

}
