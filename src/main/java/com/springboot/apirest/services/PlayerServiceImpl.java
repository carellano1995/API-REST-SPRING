package com.springboot.apirest.services;

import java.util.Optional;

import com.springboot.apirest.models.Player;
import com.springboot.apirest.repositories.PlayerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {

    private PlayerRepository repository;

    @Autowired
    public PlayerServiceImpl(PlayerRepository repository) {
        this.repository = repository;

    }

    @Override
    public Iterable<Player> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Page<Player> findAll(Pageable pageable) {
        return this.repository.findAll(pageable);
    }

    @Override
    public Player create(Player player) {
        return this.repository.save(player);
    }

    @Override
    public Player update(Integer id, Player player) {
        Player savedPlayer = this.findById(id);
        savedPlayer.setName(player.getName());
        savedPlayer.setRut(player.getRut());
        return this.repository.save(savedPlayer);
    }

    @Override
    public void delete(Integer id) {
        Player deletePlayer = this.findById(id);
        this.repository.delete(deletePlayer);
    }

    @Override
    public Player findById(Integer id) {
        Optional<Player> possiblePlayer = this.repository.findById(id);

        if (!possiblePlayer.isPresent()) {
            // throw new TeamNotFoundException();
        }

        return possiblePlayer.get();
    }

}