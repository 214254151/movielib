/**
 * IMovieService.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.service.library;

import za.ac.cput.entity.library.Movie;
import za.ac.cput.service.IService;

import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IService.java before attempting the tasks below.
 *
 * Tasks:
 *  > Declare a getall method suitable corresponding to your repository.
 */
public interface IMovieService extends IService<Movie, String> {
     Set<Movie>getAll();
}
