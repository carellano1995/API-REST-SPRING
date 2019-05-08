package com.springboot.apirest.repositories;

import com.springboot.apirest.models.Player;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends PagingAndSortingRepository<Player, Integer> {

}