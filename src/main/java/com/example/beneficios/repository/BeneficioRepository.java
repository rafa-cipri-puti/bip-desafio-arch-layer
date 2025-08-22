
package com.example.beneficios.repository;

import com.example.beneficios.domain.Beneficio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficioRepository extends JpaRepository<Beneficio, Long> {
}
