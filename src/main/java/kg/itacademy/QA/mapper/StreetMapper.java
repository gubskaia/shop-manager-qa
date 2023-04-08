package kg.itacademy.QA.mapper;

import kg.itacademy.QA.dto.StreetDto;
import kg.itacademy.QA.entity.City;
import kg.itacademy.QA.entity.Street;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StreetMapper {
    StreetDto map(Street entity);
    StreetDto map(StreetDto dto);
    List<StreetDto> map(List<Street> entities);
}
