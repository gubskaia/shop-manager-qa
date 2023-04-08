package kg.itacademy.QA.service;


import kg.itacademy.QA.dto.ShopCreateDto;
import kg.itacademy.QA.dto.ShopDto;
import kg.itacademy.QA.entity.Shop;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ShopService {
    Long create(ShopCreateDto shop);
    ShopDto getById(Long id);
    List<ShopDto> getAllByStreetId(Long id);
    List<ShopDto> getAllByCityId(Long id);
    List<ShopDto> getShopsByFilter(Long streetId, Long cityId, Integer open);

}
