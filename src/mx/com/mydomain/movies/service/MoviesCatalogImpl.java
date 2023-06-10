package mx.com.mydomain.movies.business;

import mx.com.mydomain.movies.domain.Movie;

public class MoviesCatalogImpl implements MoviesCatalog{

  @Override
  public void addMovie(String movieName, String fileName) {
    var movie = new Movie(movieName);
    movie.setName(movieName);
    System.out.println("Movie added successfully: " + movie);
  }

  @Override
  public void listMovies(String fileName) {
    var movies = new Movie();
    
  }

  @Override
  public void searchMovie(String fileName, String search) {

  }

  @Override
  public void initializeFile(String fileName) {

  }
}
