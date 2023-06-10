package mx.com.mydomain.movies.business;

public interface MoviesCatalog {

  public void addMovie(String movieName, String fileName);

  public void listMovies(String fileName);

  public void searchMovie(String fileName, String search);

  public void initializeFile(String fileName);

}
