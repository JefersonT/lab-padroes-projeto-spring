package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.EnderecoService;
import one.digitalinnovation.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoServiceImpl implements EnderecoService{

    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Endereco> findAllEnd() {
        return enderecoRepository.findAll();
    }

    @Override
    public Optional<Endereco> findEndByCep(String id) {
        return enderecoRepository.findById(id);
    }

    @Override
    public void createEnd(Endereco endereco) {
        Endereco novoEndereco = viaCepService.consultarCep(endereco.getCep());
        enderecoRepository.save(novoEndereco);
    }

    @Override
    public void updateEnd(Endereco endereco) {
        Endereco novoEndereco = viaCepService.consultarCep(endereco.getCep());
        enderecoRepository.save(novoEndereco);
    }

    @Override
    public void deleteEnd(String id) {
        enderecoRepository.deleteById(id);
    }
}
