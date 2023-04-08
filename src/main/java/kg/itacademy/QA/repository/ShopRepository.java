package kg.itacademy.QA.repository;

import kg.itacademy.QA.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {
    List<Shop> getShopsByCity_Id(Long id);
    List<Shop> getShopsByStreet_Id(Long id);
    List<Shop> getShopsByCity_Name(String name);
    List<Shop> getShopsByStreet_Name(String name);
}
