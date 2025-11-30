package com.example.demo.controller

import com.example.demo.response.MovieResponse
import com.example.demo.service.MovieService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestController
@RestControllerAdvice("/movie")
class MovieController(
    private val movieService: MovieService
    //private val database:DataBASE


): MovieResponse {

    @GetMapping("api/") //henter alle filmer
    fun getMovies(): String?>{
        //return movieService.allMovies
    }

    @GetMapping("/movies/{id}") //henter spesifikk film
    fun getMovie(): String?{
        return movieService.getMovieByID
    }

    @PostMapping("/movies") //opprette ny film
    fun addMovie(): String?{
        val movie = db.add(id)
    }

    @PatchMapping("/movies/{id}") /oppdaterer film
    fun updateMovie(): String? {
        return movieService?
    }

    @DeleteMapping("/movies{id}") /sletter film
    fun deleteMovie(): String? {
        return movieService.deleteMovie
    }







}