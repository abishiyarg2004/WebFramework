// PlayerController.java
package com.example.bankingappd15cw2.controller;

import com.example.bankingappd15cw2.model.AbiPlayer;
import com.example.bankingappd15cw2.service.AbiPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class AbiPlayerController {

    private final AbiPlayerService playerService;

    @Autowired
    public AbiPlayerController(AbiPlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping
    public ResponseEntity<AbiPlayer> createPlayer(@RequestBody AbiPlayer player) {
        AbiPlayer createdPlayer = playerService.createPlayer(player);
        return new ResponseEntity<>(createdPlayer, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AbiPlayer>> getAllPlayers() {
        List<AbiPlayer> players = playerService.getAllPlayers();
        return new ResponseEntity<>(players, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AbiPlayer> getPlayerById(@PathVariable int id) {
        AbiPlayer player = playerService.getPlayerById(id);
        if (player != null) {
            return new ResponseEntity<>(player, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayerById(@PathVariable int id) {
        playerService.deletePlayerById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
