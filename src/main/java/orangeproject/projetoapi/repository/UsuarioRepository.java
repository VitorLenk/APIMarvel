package orangeproject.projetoapi.repository;

import orangeproject.projetoapi.dto.UsuarioAccDTO;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioAccDTO, String> {
}
