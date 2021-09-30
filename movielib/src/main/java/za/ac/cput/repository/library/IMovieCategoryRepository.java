/**
 * IMovieCategoryRepository.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.repository.library;

import za.ac.cput.entity.library.MovieCategory;

import java.util.Set;

/**
 * Instructions
 *  > Your repository should be implemented using any Java data structure of your choosing.
 *  > Note that this repository interface does NOT (and should NOT) extend the IRepository.java.
 *
 * Tasks:
 *  > Declare a getall method suitable for your choice of data structure.
 *  > Declare a method that returns all moviecategory entities given a movieid.
 *  > Declare a method that returns all moviecategory entities given a categoryid.
 *
 */
public interface IMovieCategoryRepository {
    MovieCategory create(MovieCategory movieCategory);
    MovieCategory read(String movieId, String categoryId);
    Set<MovieCategory> getAll();

    Set<MovieCategory> getMovieId(String movieId);
    Set<MovieCategory> getMovieCategory(String categoryId);

    boolean delete(String movieId, String categoryId);
}