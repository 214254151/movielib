/**
 * CategoryFactory.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.factory.generic;

import za.ac.cput.entity.generic.Category;

import java.util.Random;

public class CategoryFactory {
    /**
     * Instructions:
     *  > Do NOT modify the method signature.
     *  > generate a unique key for the id of the category
     *  > genre parameter must not be empty, null or "null".
     *
     * Tasks:
     *  > Replace the throw exception (line 25) with your attempt of the factory method.
     *
     * @param genre
     * @return
     */
    public static Category createCategory(String genre) { // DO NOT MODIFY THIS LINE
        Random random = new Random();
        String ID = "X"+random.nextInt(8888);

        if(genre.trim().isEmpty()){
           return null;
        }
        else{
            Category category = new Category.Builder()

                    .setGenre(genre)
                    .build();
            return category;

        }



    }
}