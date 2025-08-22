
package com.example.beneficios.service;

import com.example.beneficios.domain.Beneficio;
import com.example.beneficios.repository.BeneficioRepository;
import com.example.beneficios.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeneficioService {

    private final BeneficioRepository repository;

    public BeneficioService(BeneficioRepository repository) {
        this.repository = repository;
    }

    public List<Beneficio> getAll() {
        return repository.findAll();
    }

    public Optional<Beneficio> getById(Long id) {
        return repository.findById(id);
    }

    public Beneficio create(Beneficio beneficio) {
        return repository.save(beneficio);
    }

    public Beneficio update(Long id, Beneficio beneficio) {
        return repository.findById(id)
                .map(b -> {
                    b.setNome(beneficio.getNome());
                    b.setDescricao(beneficio.getDescricao());
                    b.setValor(beneficio.getValor());
                    return repository.save(b);
                })
                .orElseThrow(() -> new ResourceNotFoundException("Benefício não encontrado"));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
