package com.springboot.apirest.services;

import org.springframework.data.domain.Pageable;

import com.springboot.apirest.models.Player;

import org.springframework.data.domain.Page;

public interface PlayerService {

    Iterable<Player> findAll();

    Page<Player> findAll(Pageable pageable);

    Player create(Player player);

    Player update(Integer id, Player player);

    void delete(Integer id);

    Player findById(Integer id);

}