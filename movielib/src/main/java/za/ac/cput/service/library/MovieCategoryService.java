/**
 * MovieCategoryService.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.service.library;

import za.ac.cput.entity.library.MovieCategory;

/**
 * Instructions
 *  > Make sure you have read the instructions on IService.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in IMovieCategoryService.java before attempting the tasks below.
 *  > Note that no Update operation is needed here.
 *
 * Tasks:
 *  > Implement service using singleton with a link to your repository.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete method.
 *  > Write an implementation of the getall method you declared in the interface.
 *  > Write an implementation of the method you declared in the interface that returns all
 *      moviecategory entities given movieid.
 *  > Write an implementation of the method you declared in the interface that returns all
 *      moviecategory entities given categoryid.
 *
 */
public class MovieCategoryService implements IMovieCategoryService {
    @Override
    public MovieCategory create(MovieCategory movieCategory) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MovieCategory read(String movieId, String categoryId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(String movieId, String categoryId) {
        throw new UnsupportedOperationException();
    }
}
