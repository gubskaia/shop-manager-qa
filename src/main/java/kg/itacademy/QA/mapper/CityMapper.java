package kg.itacademy.QA.mapper;

import kg.itacademy.QA.dto.CityDto;
import kg.itacademy.QA.entity.City;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityMapper {
    CityDto map(City entity);

    CityDto map(CityDto dto);

    List<CityDto> map(List<City> entities);

}
