/**
 * MovieCategoryFactory.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.factory.library;

import za.ac.cput.entity.library.MovieCategory;
import za.ac.cput.helper.GenericHelper;

import java.util.Random;

public class MovieCategoryFactory {
    /**
     * Instructions:
     * > Do NOT modify the method signature.
     * > movieId & categoryId parameters must not be empty, null or "null"
     * <p>
     * Tasks:
     * > Replace the throw exception (line 25) with your attempt of the factory method.
     *
     * @param movieId
     * @param categoryId
     * @return
     */
    public static MovieCategory createMovieCategory(String movieId, String categoryId) { // DO NOT MODIFY THIS LINE.
        String id = GenericHelper.generateId();

        //throw new UnsupportedOperationException();
        if (movieId.isEmpty() || categoryId.isEmpty()) {
            return null;
        }

        return new MovieCategory.Builder()
                .setMovieId(id)
                .setCategory(categoryId)
                .build();


    }
}
