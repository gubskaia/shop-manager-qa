package kg.itacademy.QA.service;

import kg.itacademy.QA.dto.StreetDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StreetService {
    List<StreetDto> getAllByCityId(Long id);
}
