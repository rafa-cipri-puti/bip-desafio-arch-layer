
package com.example.beneficios.controller;

import com.example.beneficios.domain.Beneficio;
import com.example.beneficios.service.BeneficioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/beneficios")
public class BeneficioController {

    private final BeneficioService service;

    public BeneficioController(BeneficioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Beneficio> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Beneficio> getById(@PathVariable Long id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Beneficio create(@RequestBody Beneficio beneficio) {
        return service.create(beneficio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Beneficio> update(@PathVariable Long id, @RequestBody Beneficio beneficio) {
        return ResponseEntity.ok(service.update(id, beneficio));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
