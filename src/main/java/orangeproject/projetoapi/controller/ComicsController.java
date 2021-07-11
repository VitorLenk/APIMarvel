package orangeproject.projetoapi.controller;


import orangeproject.projetoapi.dto.ComicsDTO;
import orangeproject.projetoapi.repository.ComicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ComicsController {

    @Autowired
    private ComicsRepository repository;

    @GetMapping(path = "/api/comics/{comicID}")
    public ResponseEntity consultar(@PathVariable("comicID") String comicID) {
        return repository.findById(comicID)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());

    }

    @PostMapping(path = "/api/comics/salvar")
    public ComicsDTO salvar(@RequestBody ComicsDTO comics) {
        return repository.save(comics);

    }

}
