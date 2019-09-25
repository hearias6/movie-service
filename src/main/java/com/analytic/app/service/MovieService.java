package com.analytic.app.service;

import com.analytic.app.entities.Movie;
import com.analytic.app.response.Response;

public interface MovieService {

    Response save(Movie movie);
    Response deleteById(Long id);
    Response update(Movie movie);
	Response findAll();
	Response findById(Long id);
	
}
