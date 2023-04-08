package kg.itacademy.QA.controller;

import kg.itacademy.QA.dto.CityDto;
import kg.itacademy.QA.dto.ShopCreateDto;
import kg.itacademy.QA.dto.ShopDto;
import kg.itacademy.QA.dto.StreetDto;
import kg.itacademy.QA.service.CityService;
import kg.itacademy.QA.service.ShopService;
import kg.itacademy.QA.service.StreetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class MyRestController {
    private final CityService cityService;
    private final StreetService streetService;
    private final ShopService shopService;

    @GetMapping("/city")
    public List<CityDto> getAllCities() {
        return cityService.getAll();
    }

    @GetMapping("/city/street/{city_id}")
    public List<StreetDto> getStreetsByCityId(@PathVariable Long city_id) {
        return streetService.getAllByCityId(city_id);
    }

    @PostMapping("/shop")
    public Long createShop(@RequestBody ShopCreateDto shop) {
        return shopService.create(shop);
    }

    @GetMapping("/shop/")
    public List<ShopDto> getAllByFilter(@RequestParam(name = "street", required = false) Long street,
                                        @RequestParam(name = "city", required = false) Long city,
                                        @RequestParam(name = "open", required = false) Integer open) {
        return shopService.getShopsByFilter(street, city, open);
    }

}
