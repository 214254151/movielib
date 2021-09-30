/**
 * IMovieRepository.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.repository.library;

import za.ac.cput.entity.library.Movie;
import za.ac.cput.repository.IRepository;

import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *
 * Tasks:
 *  > Declare a getall method suitable for your choice of data structure.
 */
public interface IMovieRepository extends IRepository<Movie, String>{
    Set<Movie>getAll();
}
