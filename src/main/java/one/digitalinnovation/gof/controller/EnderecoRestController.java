package one.digitalinnovation.gof.controller;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("enderecos")
public class EnderecoRestController {
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public ResponseEntity<Iterable<Endereco>> findAllEnd(){
        return ResponseEntity.ok(enderecoService.findAllEnd());
    }

    @GetMapping("/{id}")
    public Optional<Endereco> findAllEndById(@PathVariable String id){
        return enderecoService.findEndByCep(id);
    }

    @PostMapping
    public void createEnd(@RequestBody Endereco endereco){
        enderecoService.createEnd(endereco);
    }

    @PutMapping("/{id}")
    public void updateEnd(@RequestBody Endereco endereco){
        enderecoService.updateEnd(endereco);
    }

    @DeleteMapping("/{id}")
    public void deleteEnd(@PathVariable String id){
        enderecoService.deleteEnd(id);
    }
}
