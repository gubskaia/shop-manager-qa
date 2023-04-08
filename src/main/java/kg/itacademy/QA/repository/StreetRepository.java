package kg.itacademy.QA.repository;

import kg.itacademy.QA.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreetRepository extends JpaRepository<Street, Long> {
    List<Street> getAllByCity_Id(Long cityId);
}
