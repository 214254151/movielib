/**
 * MovieCategory.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.entity.library;

/**
 * Instructions:
 *  > Do NOT modify class instance variable declaration.
 *
 * Tasks:
 *  > Add private default constructor
 *  > Add private constructor that accepts a Builder object
 *  > Add getters and toString methods
 *  > Implement class using Builder Pattern ONLY.
 *
 */
public class MovieCategory {
    private String movieId, categoryId; // DO NOT MODIFY THIS LINE.



    //private constructor
    public MovieCategory() {
    }
    //private constructor no arguments
    public MovieCategory(Builder builder) {
        this.movieId=builder.movieId;
        this.categoryId=builder.category;
    }

    //getter
    public String getMovieId() {
        return movieId;
    }

    public String getCategoryId() {
        return categoryId;
    }
    
    //toString

    @Override
    public String toString() {
        return "MovieCategory{" +
                "movieId='" + movieId + '\'' +
                ", categoryId='" + categoryId + '\'' +
                '}';
    }
    
    public static class Builder{
        private String movieId, category;

        public Builder setMovieId(String movieId) {
            this.movieId = movieId;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }
        public Builder copy(MovieCategory movieCategory){
            this.movieId=movieCategory.movieId;
            this.category=movieCategory.categoryId;
            return this;
        }
        public MovieCategory build(){
            return new MovieCategory(this);
        }
    }

}