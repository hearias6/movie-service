package com.analytic.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.analytic.app.entities.Movie;
import com.analytic.app.response.Response;
import com.analytic.app.service.MovieService;


@RestController
@CrossOrigin("*")
@RequestMapping("items")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@PostMapping("")
	public Response save(@RequestBody Movie movie) {
		return movieService.save(movie);
	}
	
	@PutMapping
	private Response update(@RequestBody Movie movie) {
		return movieService.update(movie);
	}
	
	@GetMapping("")
	private Response findAll() {
		return movieService.findAll();
	}
	
	@GetMapping("/{id}")
	private Response findById(@PathVariable Long id) {
		return movieService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	private Response deleteById(@PathVariable Long id) {
		return movieService.deleteById(id);
	}
	
}
