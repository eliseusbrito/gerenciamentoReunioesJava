package br.org.fiergs.grp.service;

import br.org.fiergs.grp.dto.DiretorRequestDTO;
import br.org.fiergs.grp.dto.DiretorResponseDTO;
import br.org.fiergs.grp.entity.Diretor;
import br.org.fiergs.grp.repository.DiretorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiretorService {

    DiretorRepository repository;

    public DiretorService(DiretorRepository repository) {
        this.repository = repository;
    }

    public Diretor addDiretor(DiretorRequestDTO diretorRequestDTO) {
        return repository.save(diretorRequestDTO.transformaParaObjeto());
    }

    public List<DiretorResponseDTO> findAll() {
        List<Diretor> diretor = repository.findAll();
        List<DiretorResponseDTO> diretorResponseDTOList = new ArrayList<DiretorResponseDTO>();
        DiretorResponseDTO diretorResponseDTO;
        for (int i = 0; i < diretor.size(); i++) {
            diretorResponseDTO = DiretorResponseDTO.transformaEmDTO(diretor.get(i));
            diretorResponseDTOList.add(diretorResponseDTO);
        }
        return diretorResponseDTOList;
    }

}
