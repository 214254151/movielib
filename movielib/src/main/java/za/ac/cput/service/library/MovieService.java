/**
 * MovieService.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.service.library;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.library.Movie;
import za.ac.cput.repository.library.MovieRepository;

import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IService.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in IMovieService.java before attempting the tasks below.
 *
 * Tasks:
 *  > Implement service using singleton with a link to your repository.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the update method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete method.
 *  > Write an implementation of the getall method you declared in the interface.
 *
 */

@Service
public class MovieService implements IMovieService {

    private static Movie movieService;
    private MovieRepository movieRepository;

    private MovieService(){
        this.movieRepository = (MovieRepository) MovieRepository.getRepository();
    }

    public static Movie getMovieService(){
        if (movieService == null){
            movieService = new Movie();
        }
        return movieService;
    }


    @Override
    public Movie create(Movie movie) {
        return this.movieRepository.create(movie);
    }

    @Override
    public Movie read(String id) {
        return this.movieRepository.read(id);
    }

    @Override
    public Movie update(Movie movie) {
        return this.movieRepository.update(movie);
    }

    @Override
    public boolean delete(String id) {
        return this.movieRepository.delete(id);
    }

    @Override
    public Set<Movie> getAll() {
        return this.movieRepository.getAll();
    }

    // missing method(s)
}
