package kg.itacademy.QA.service.impl;

import kg.itacademy.QA.dto.CityDto;
import kg.itacademy.QA.mapper.CityMapper;
import kg.itacademy.QA.repository.CityRepository;
import kg.itacademy.QA.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityRepository repo;
    private final CityMapper mapper;

    @Override
    public List<CityDto> getAll() {
        return mapper.map(repo.findAll());
    }

    @Override
    public CityDto getById(Long id) {
        return repo.findById(id)
                .map(mapper::map)
                .orElseThrow();
    }
}
