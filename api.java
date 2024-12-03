package com.futbolmanagement.controller;

import com.futbolmanagement.model.Jugador;
import com.futbolmanagement.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jugadores")
public class JugadorController {

    @Autowired
    private JugadorService jugadorService;

    // Crear un jugador
    @PostMapping
    public Jugador crearJugador(@RequestBody Jugador jugador) {
        return jugadorService.guardarJugador(jugador);
    }

    // Obtener todos los jugadores
    @GetMapping
    public List<Jugador> obtenerJugadores() {
        return jugadorService.obtenerTodosLosJugadores();
    }

    // Actualizar un jugador
    @PutMapping("/{id}")
    public Jugador actualizarJugador(@PathVariable Long id, @RequestBody Jugador jugador) {
        return jugadorService.actualizarJugador(id, jugador);
    }

    // Eliminar un jugador
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarJugador(@PathVariable Long id) {
        jugadorService.eliminarJugador(id);
        return ResponseEntity.noContent().build();
    }
}
