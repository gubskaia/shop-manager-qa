package kg.itacademy.QA.service;

import kg.itacademy.QA.dto.CityDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CityService {
    List<CityDto> getAll();
    CityDto getById(Long id);

}
