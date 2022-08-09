package com.example.pruebatv;

import java.util.ArrayList;

public final class MovieList {
    public static ArrayList<android.graphics.Movie> list;
    private static Movie buildMovieInfo(
            String titulo,
            String descripcion,
            String videoUrl,
            String categoria,
            String poster
    ){
        Movie movie = new Movie();
        movie.setTitulo(titulo);
        movie.setDescripcion(descripcion);
        movie.setCategoria(categoria);
        movie.setVideoUrl(videoUrl);
        movie.setPoster(poster);
        return movie;
    }

}
