package kg.itacademy.QA.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalTime;

@Entity
@Data
@Table(name = "shops")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "street_id")
    private Street street;

    @NotBlank
    private String house;

    @DateTimeFormat
    private LocalTime openTime;

    @DateTimeFormat
    private LocalTime closeTime;
}
