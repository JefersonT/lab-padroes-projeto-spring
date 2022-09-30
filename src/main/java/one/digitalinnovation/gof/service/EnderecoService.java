package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Endereco;

import java.util.Optional;

public interface EnderecoService {
    Iterable<Endereco> findAllEnd();

    Optional<Endereco> findEndByCep(String id);

    void createEnd(Endereco endereco);

    void updateEnd(Endereco endereco);

    void deleteEnd(String id);
}
