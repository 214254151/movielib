/**
 * MovieCategoryRepository.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.repository.library;

import za.ac.cput.entity.library.MovieCategory;

import java.util.HashSet;
import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in IMovieCategoryRepository.java before attempting the tasks below.
 *  > Note that no Update operation is needed here.
 *
 * Tasks:
 *  > Implement repository using singleton and your chosen Java data structure.
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

public class MovieCategoryRepository implements IMovieCategoryRepository {
    private Set<MovieCategory> categoryList;

    @Override
    public MovieCategory create(MovieCategory movieCategory) {
       this.categoryList.add(movieCategory);
       return movieCategory;
    }

    @Override
    public MovieCategory read(String movieId, String categoryId) {

        for(MovieCategory movieCategory : this.categoryList){
            return movieCategory;
        }
        return null;
    }


    @Override
    public boolean delete(String movieId, String categoryId) {

        MovieCategory movieCategory = read(movieId,categoryId);
        if(movieCategory==null)
            return false;
        categoryList.remove(movieCategory);
        return true;
    }

    @Override
    public Set<MovieCategory> getAll() {
        return null;
    }

    @Override
    public Set<MovieCategory> getMovieId(String movieId) {
     Set<MovieCategory> movieCategories = new HashSet<>();
     for(MovieCategory movieCategory : this.categoryList){
         if(movieCategory.getMovieId().trim().equalsIgnoreCase(movieId)){
             movieCategories.add(movieCategory);
         }
     }
     return movieCategories;
    }

    @Override
    public Set<MovieCategory> getMovieCategory(String categoryId) {
        Set<MovieCategory> movieCategories = new HashSet<>();
        for(MovieCategory movieCategory: this.categoryList){
            if(movieCategory.getCategoryId().trim().equalsIgnoreCase(categoryId)){
                movieCategories.add(movieCategory);

            }
        }
        return movieCategories;
    }
}