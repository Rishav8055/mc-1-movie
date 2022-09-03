package com.jap;

import java.util.*;

public class MovieService {

    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        Map<Movie, Integer> map = movieService.getMovieWithRating();
        Set set = movieService.getMovieNameWithRating4(map, 4);
        System.out.println("Rating 4" + set);
        Map map1 = movieService.getAllMoviesWithComedy(map);
        System.out.println("Comedy Movie " + map1);
        List list = movieService.getMovieWithHighestRating(map);
        System.out.println("--------------");
        System.out.println("Highest Rating " + list);
    }

    public Map<Movie, Integer> getMovieWithRating() {
        Map<Movie, Integer> map = new HashMap<>();

        //create five movie object by calling Movie class parameterized constructor
        Movie movie1 = new Movie(2442, "Thor", "love", "23-3-2022");
        Movie movie2 = new Movie(2423, "iron man", "action", "4-02-2018");
        Movie movie3 = new Movie(3423, "Avenger", "action", "23-2-2018");
        Movie movie4 = new Movie(2345, "raw", "action", "22-7-2022");
        Movie movie5 = new Movie(5432, "jadugar", "comedy", "21-5-2019");
        //create HashMap object and add all the Movie object inside it
        map.put(movie1, 1);
        map.put(movie2, 2);
        map.put(movie3, 3);
        map.put(movie4, 4);
        map.put(movie5, 5);

        //Key will be movie object and value will be rating ranging from 1 to 5

        //return the HashMap object

        return map;
    }

    public Set<String> getMovieNameWithRating4(Map<Movie, Integer> map, int rating) {
        //Create a TreeSet object
        Set<String> stringSet = new HashSet<>();

        //Use entrySet() method to iterate through the map object
        for (Map.Entry<Movie, Integer> entry : map.entrySet()) {
            if (entry.getValue() == rating) {
                stringSet.add(entry.getKey().getMovieName());
            }
        }

        //retrieve all the movies name having rating as 4

        //Store the movie name in TreeSet object

        //return the TreeSet object

        return stringSet;
    }

    public List<String> getMovieWithHighestRating(Map<Movie, Integer> map) {
        //Create a ArrayList object of type String
        List<String> list = new ArrayList<>();
        //get the first value from the map and store it in the variable max
        // Use entrySet().iterator().next() method to retrieve the first value of Map object
        //get the name of the movie with the highest rating and add it in the List created
        for (Map.Entry<Movie, Integer> l : map.entrySet())
            if (l.getValue() == 5) {
                list.add(l.getKey().getMovieName());
            }

        //return the List object

        return list;
    }

    public Map<String, String> getAllMoviesWithComedy(Map<Movie, Integer> map) {
        //Create a Map object
        Map<String, String> map1 = new HashMap<>();

        //use entrySet to iterate through the Map object


        //get all the movies name and their released date for the movie of genre "comedy"

        //store movie name with release date in the above created Map object and return the Map object
        for (Map.Entry<Movie, Integer> entry : map.entrySet()) {
            if (entry.getKey().getGenre().equals("comedy")) {
                map1.put(entry.getKey().getMovieName(), entry.getKey().getReleaseDate());
            }
        }


        return map1;

    }
}
