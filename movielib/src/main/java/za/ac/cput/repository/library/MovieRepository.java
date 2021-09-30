/**
 * MovieRepository.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */
package za.ac.cput.repository.library;
import za.ac.cput.entity.library.Movie;

import java.util.Set;
/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in IMovieRepository.java before attempting the tasks below.
 * Tasks:
 *  > Implement repository using singleton and your chosen Java data structure.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the update method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete method.
 *  > Write an implementation of the getAll method you declared in the interface.
 */
public class MovieRepository implements IMovieRepository {

    private Set<Movie> movieList;
    private static MovieRepository repository = null;

    public static MovieRepository getRepository() {
        if (repository == null){
            return repository = new MovieRepository();
        }
        return repository;
    }

    @Override
    public Movie create(Movie movie) {
        boolean pass = movieList.add(movie);
        if(pass){
            return movie;
        }
        return null;
    }
    @Override
    public Movie read(String movieId){
        for (Movie movie: this.movieList){
            if (movie.getId().equalsIgnoreCase(movieId)) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie update( Movie movie){
        delete(movie.getId());
        this.movieList.add(movie);
        return movie;
    }

    @Override
    public boolean delete (String movieId){
        Movie delete = read(movieId);
        if (delete == null)
        return false;
        else
            movieList.remove(delete);
        return true;
    }
    @Override
    public Set<Movie>getAll(){
        return movieList;
    }
    // missing method(s)
}
