package com.springboot.apirest.controllers;

import javax.validation.Valid;

import com.springboot.apirest.models.Player;
import com.springboot.apirest.services.PlayerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController {

	private PlayerService service;

	@Autowired
	public PlayerController(PlayerService service) {
		this.service = service;
	}

	@GetMapping
	@ResponseBody
	public Page<Player> findAll(Pageable pageable) {
		return this.service.findAll(pageable);
	}

	@GetMapping("/all")
	@ResponseBody
	public Iterable<Player> findAll() {
		return this.service.findAll();
	}

	@PostMapping
	@ResponseBody
	public ResponseEntity<Player> create(@Valid @RequestBody Player player) {
		Player savedPlayer = this.service.create(player);

		return new ResponseEntity<>(savedPlayer, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Player> update(@PathVariable(value = "id") Integer id, @RequestBody Player player) {
		Player savedPlayer = this.service.update(id, player);

		return new ResponseEntity<>(savedPlayer, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Player> delete(@PathVariable(value = "id") Integer id) {
		this.service.delete(id);

		return new ResponseEntity<>(null, HttpStatus.OK);
	}

}