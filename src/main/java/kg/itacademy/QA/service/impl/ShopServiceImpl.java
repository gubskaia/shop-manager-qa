package kg.itacademy.QA.service.impl;

import kg.itacademy.QA.dto.ShopCreateDto;
import kg.itacademy.QA.dto.ShopDto;
import kg.itacademy.QA.entity.Shop;
import kg.itacademy.QA.mapper.ShopMapper;
import kg.itacademy.QA.repository.ShopRepository;
import kg.itacademy.QA.service.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@AllArgsConstructor
public class ShopServiceImpl implements ShopService {
    private final ShopRepository repo;
    private final ShopMapper mapper;

    @Override
    public Long create(ShopCreateDto shopCreateDto) {
        Shop shop = mapper.mapForCreate(shopCreateDto);
        return repo.save(shop).getId();
    }

    @Override
    public ShopDto getById(Long id) {
        return repo.findById(id)
                .map(mapper::map)
                .orElseThrow();
    }

    @Override
    public List<ShopDto> getAllByStreetId(Long id) {
        return mapper.map(repo.getShopsByStreet_Id(id));
    }

    @Override
    public List<ShopDto> getAllByCityId(Long id) {
        return mapper.map(repo.getShopsByCity_Id(id));
    }

    @Override
    public List<ShopDto> getShopsByFilter(Long streetId, Long cityId, Integer open) {
        List<ShopDto> shops = mapper.map(repo.findAll());
        if (streetId != null) {
            shops = getAllByStreetId(streetId);
        }
        if (cityId != null) {
            shops = getAllByCityId(cityId);
        }
        if (open != null && open == 1) {
            shops = getAllOpen(shops);
        }
        if (open != null && open == 0) {
            shops = getAllClose(shops);
        }
        return shops;
    }

    private List<ShopDto> getAllOpen(List<ShopDto> shops) {
        LocalTime currentTime = LocalTime.now();
        return shops.stream()
                .filter(shop -> shop.getOpenTime().isBefore(currentTime) && shop.getCloseTime().isAfter(currentTime))
                .collect(Collectors.toList());
    }

    private List<ShopDto> getAllClose(List<ShopDto> shops) {
        LocalTime currentTime = LocalTime.now();
        return shops.stream()
                .filter(shop -> shop.getOpenTime().isAfter(currentTime) || shop.getCloseTime().isBefore(currentTime))
                .collect(Collectors.toList());
    }
}
