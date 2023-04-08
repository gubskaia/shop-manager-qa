package kg.itacademy.QA.service.impl;

import kg.itacademy.QA.dto.StreetDto;
import kg.itacademy.QA.mapper.StreetMapper;
import kg.itacademy.QA.repository.StreetRepository;
import kg.itacademy.QA.service.StreetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class StreetServiceImpl implements StreetService {
    private final StreetRepository repo;
    private final StreetMapper mapper;

    @Override
    public List<StreetDto> getAllByCityId(Long id) {
        return mapper.map(repo.getAllByCity_Id(id));
    }
}
