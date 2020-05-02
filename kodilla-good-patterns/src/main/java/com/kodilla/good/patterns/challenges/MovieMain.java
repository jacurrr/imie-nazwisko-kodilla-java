package com.kodilla.good.patterns.challenges;

public class MovieMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().values().stream().
                map(e->e+"!").
                forEach(System.out::print);
    }
}
