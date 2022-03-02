package com.example.BS9.RestTemplateFeign.persona.application.feign;

import com.example.BS9.RestTemplateFeign.profesor.application.service.impl.ProfesorServiceImpl;
import com.example.BS9.RestTemplateFeign.profesor.domain.dto.output.ProfesorOutputDto;
import com.example.BS9.RestTemplateFeign.profesor.domain.entity.Profesor;
import feign.FeignException;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FeignFallbackFactory implements FallbackFactory<IFeignServer> {

    @Override
    public IFeignServer create(Throwable cause) {
        return new FeingFallback(cause);
    }

    class FeingFallback implements IFeignServer{
        int code;
        String msg;

        ProfesorServiceImpl ps = new ProfesorServiceImpl();

        @Override
        public ResponseEntity<ProfesorOutputDto> callServer(int idProfesor) throws Exception {
            //return ResponseEntity.status(code).body(new ProfesorOutputDto(ps.buscarPorId(idProfesor).getPersona().getProfesor()));
            return ResponseEntity.status(code).body(ps.buscarPorId(idProfesor));
        }

        FeingFallback(Throwable cause){
            if(cause instanceof FeignException){
                FeignException feignException = (FeignException) cause;
                code = feignException.status();
            }
            msg= cause.getLocalizedMessage();
        }
    }
}
