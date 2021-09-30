/**
 * MovieFactory.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.factory.library;

import za.ac.cput.entity.library.Movie;
import za.ac.cput.entity.library.MovieCategory;
import za.ac.cput.helper.GenericHelper;

import java.util.Random;

public class MovieFactory {
    /**
     * Instructions:
     * > Do NOT modify the method signature.
     * > generate a unique key for the id of the movie
     * > year parameter must be 4 digits.
     * > year parameter must not be older than 1900 and/or in the future.
     * > title parameter must not be empty, null or "null".
     * <p>
     * Tasks:
     * > Replace the throw exception (line 28) with your attempt of the factory method.
     *
     * @param title
     * @param year
     * @return
     */
    public static Movie createMovie(String title, int year) { // DO NOT MODIFY THIS LINE.

        // throw new UnsupportedOperationException();

        String id = GenericHelper.generateId();

        if (year >= 1900 && year <= 2020 && !title.isEmpty()) {
            Movie movie = new Movie.Builder()
                    .setId(id)
                    .setTitle(title)
                    .setYear(year)
                    .build();
            return movie;
        }

        return null;
    }
}