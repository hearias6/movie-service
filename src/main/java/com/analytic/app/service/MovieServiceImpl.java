package com.analytic.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.analytic.app.dao.MovieDao;
import com.analytic.app.entities.Movie;
import com.analytic.app.response.Response;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;
	
	private String mensaje = "";
	
	@Override
	public Response save(Movie movie) {

		try {
			movieDao.save(movie);
			mensaje = "Se ha guardao con exito";
			return new Response(HttpStatus.OK.value(), mensaje);
		} catch (Exception e) {
			mensaje = "Error en el save(), " + e.getMessage().toString();
			return new Response(HttpStatus.INTERNAL_SERVER_ERROR.value(), mensaje);
		}
		
	}

	@Override
	public Response deleteById(Long id) {
		try {
			movieDao.deleteById(id);
			mensaje = "Se ha eliminado con exito";
			return new Response(HttpStatus.OK.value(), mensaje);
		} catch (Exception e) {
			mensaje = "Error en el deleteById(), " + e.getMessage().toString();
			return new Response(HttpStatus.INTERNAL_SERVER_ERROR.value(), mensaje);
		}
	}

	@Override
	public Response update(Movie movie) {
		try {
			movieDao.save(movie);
			mensaje = "Se ha Actualizado con exito";
			return new Response(HttpStatus.OK.value(), mensaje);
		} catch (Exception e) {
			mensaje = "Error en el update(), " + e.getMessage().toString();
			return new Response(HttpStatus.INTERNAL_SERVER_ERROR.value(), mensaje);
		}
	}

	@Override
	public Response findAll() {
		
		List<Movie> movies = new ArrayList<Movie>();
		
		try {
			movies = movieDao.findAll();
			return new Response(HttpStatus.OK.value(), movies);
		} catch (Exception e) {
			mensaje = "Error en el findAll(), " + e.getMessage().toString();
			return new Response(HttpStatus.INTERNAL_SERVER_ERROR.value(), mensaje);
		}
	}

	@Override
	public Response findById(Long id) {
		
		Movie movie = new Movie();
		
		try {
			movie = movieDao.findById(id).get();
			return new Response(HttpStatus.OK.value(), movie);
		} catch (Exception e) {
			e.printStackTrace();
			mensaje = "Error en el findById(), " + e.getMessage().toString();
			return new Response(HttpStatus.INTERNAL_SERVER_ERROR.value(), mensaje);
		}
	}

}
