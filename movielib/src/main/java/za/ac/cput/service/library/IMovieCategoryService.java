/**
 * IMovieCategoryService.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.service.library;

import za.ac.cput.entity.library.MovieCategory;

/**
 * Instructions
 *   > Your service should be implemented based on your repository.
 *  > Note that this service interface does NOT (and should NOT) extend the IService.java.
 *
 * Tasks:
 *  > Declare a getall method suitable corresponding to your repository.
 *  > Declare a method that returns all moviecategory entities given a movieid.
 *  > Declare a method that returns all moviecategory entities given a categoryid.
 *
 */
public interface IMovieCategoryService {
    MovieCategory create(MovieCategory movieCategory);
    MovieCategory read(String movieId, String categoryId);
    boolean delete(String movieId, String categoryId);
}
