package com.futbolmanagement.service;

import com.futbolmanagement.model.Jugador;
import com.futbolmanagement.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    // Crear un jugador
    public Jugador guardarJugador(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    // Obtener todos los jugadores
    public List<Jugador> obtenerTodosLosJugadores() {
        return jugadorRepository.findAll();
    }

    // Actualizar un jugador
    public Jugador actualizarJugador(Long id, Jugador jugador) {
        Jugador existente = jugadorRepository.findById(id).orElseThrow(() -> new RuntimeException("Jugador no encontrado"));
        existente.setNombre(jugador.getNombre());
        existente.setEdad(jugador.getEdad());
        existente.setPosicion(jugador.getPosicion());
        existente.setTelefono(jugador.getTelefono());
        existente.setEmail(jugador.getEmail());
        return jugadorRepository.save(existente);
    }

    // Eliminar un jugador
    public void eliminarJugador(Long id) {
        jugadorRepository.deleteById(id);
    }
}
