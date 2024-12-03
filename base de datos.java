package com.futbolmanagement.repository;

import com.futbolmanagement.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {
    // Métodos personalizados (si son necesarios)
}
