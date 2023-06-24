package kz.bitlab.techordaspringajax.repositores;

import kz.bitlab.techordaspringajax.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
