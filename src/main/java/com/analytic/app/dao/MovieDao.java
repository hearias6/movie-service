package com.analytic.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.analytic.app.entities.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, Long> {

}
