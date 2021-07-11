package orangeproject.projetoapi.repository;

import orangeproject.projetoapi.dto.ComicsDTO;
import org.springframework.data.repository.CrudRepository;

public interface ComicsRepository extends CrudRepository<ComicsDTO, String> {
}
