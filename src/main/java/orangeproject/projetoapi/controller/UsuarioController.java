package orangeproject.projetoapi.controller;


import orangeproject.projetoapi.dto.UsuarioAccDTO;
import orangeproject.projetoapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping(path = "/api/usuario/{cpf}")
    public ResponseEntity consultar(@PathVariable("cpf") String cpf) {
        return repository.findById(cpf)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());

    }

    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioAccDTO salvar(@RequestBody UsuarioAccDTO usuario) {
        return repository.save(usuario);

    }

}
