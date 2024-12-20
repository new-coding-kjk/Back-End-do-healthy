package gangdong.diet.domain.nutrient.repository;

import gangdong.diet.domain.nutrient.entity.Nutrient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutrientRepository extends JpaRepository<Nutrient, Long> {
}
