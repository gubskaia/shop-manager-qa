package kg.itacademy.QA.mapper;

import kg.itacademy.QA.dto.ShopCreateDto;
import kg.itacademy.QA.dto.ShopDto;
import kg.itacademy.QA.entity.Shop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShopMapper {
   /* @Mapping(source = "city.id", target = "city_id")
    @Mapping(source = "street.id", target = "street_id")
    ShopCreateDto mapForCreate(Shop entity);*/

    @Mapping(source = "city_id", target = "city.id")
    @Mapping(source = "street_id", target = "street.id")
    Shop mapForCreate(ShopCreateDto dto);


    @Mapping(source = "city.name", target = "city_name")
    @Mapping(source = "street.name", target = "street_name")
    ShopDto map(Shop entity);

    @Mapping(source = "city_name", target = "city.name")
    @Mapping(source = "street_name", target = "street.name")
    Shop map(ShopDto dto);

    List<ShopDto> map(List<Shop> entities);

}
