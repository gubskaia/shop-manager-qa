package kg.itacademy.QA.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShopDto {
    private String name;
    private String city_name;
    private String street_name;
    private String house;
    private LocalTime openTime;
    private LocalTime closeTime;
}
