package kg.itacademy.QA.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShopCreateDto {
    private String name;
    private Long city_id;
    private Long street_id;
    private String house;
    private LocalTime openTime;
    private LocalTime closeTime;
}
