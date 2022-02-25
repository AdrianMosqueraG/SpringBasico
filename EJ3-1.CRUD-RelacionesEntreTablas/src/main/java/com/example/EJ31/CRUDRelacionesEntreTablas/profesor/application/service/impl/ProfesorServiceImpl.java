package com.example.EJ31.CRUDRelacionesEntreTablas.profesor.application.service.impl;

import com.example.EJ31.CRUDRelacionesEntreTablas.profesor.application.service.interfaz.ProfesorService;
import com.example.EJ31.CRUDRelacionesEntreTablas.profesor.domain.dto.output.ProfesorOutputDto;
import com.example.EJ31.CRUDRelacionesEntreTablas.profesor.domain.entity.Profesor;
import com.example.EJ31.CRUDRelacionesEntreTablas.profesor.infrastructure.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    private ProfesorOutputDto converToDto(Profesor profesor){return new ProfesorOutputDto(profesor);}

    @Override
    public ProfesorOutputDto buscarPorId(int id) throws Exception {
        ProfesorOutputDto profesorOutputDto = new ProfesorOutputDto(profesorRepository.findById(id));

        if (profesorOutputDto != null){
            return profesorOutputDto;
        }else {
            throw new Exception("No existe ningun profesor con ese ID");
        }
    }

    @Override
    public List<ProfesorOutputDto> buscarPorBranch(String branch) {
        return profesorRepository.findByBranch(branch)
                .stream()
                .map(this::converToDto)
                .collect(Collectors.toList());
    }
}
