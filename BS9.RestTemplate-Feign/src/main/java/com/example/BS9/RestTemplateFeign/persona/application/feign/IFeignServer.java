package com.example.BS9.RestTemplateFeign.persona.application.feign;

import com.example.BS9.RestTemplateFeign.profesor.domain.dto.output.ProfesorOutputDto;
import com.example.BS9.RestTemplateFeign.profesor.domain.entity.Profesor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "simpleFeign", url = "http://localhost:8081/profesor/getId", fallbackFactory = FeignFallbackFactory.class)
public interface IFeignServer {
    @GetMapping("{id}")
    ResponseEntity<ProfesorOutputDto> callServer(@PathVariable("id") int idProfesor) throws Exception;
}
