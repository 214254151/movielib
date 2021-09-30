/**
 * CategoryRepository.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.repository.generic;

import za.ac.cput.entity.generic.Category;

import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in ICategoryRepository.java before attempting the tasks below.
 *
 * Tasks:
 *  > Implement repository using singleton and your chosen Java data structure.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the update method.
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete method.
 *  > Write an implementation of the getall method you declared in the interface.
 *
 */
public class CategoryRepository implements ICategoryRepository {

    private Set<Category> genreList;
    @Override
    public Category create(Category category) {

       this.genreList.add(category);
       return category;
    }

    @Override
    public Category read(String categoryId) {

       for(Category category : this.genreList){
           if(category.getId().equalsIgnoreCase(categoryId)){
               return category;
           }

       }
        return null;
    }

    @Override
    public Category update(Category category) {

      delete(category.getId());
      this.genreList.add(category);
      return category;
    }

    @Override
    public boolean delete(String categoryId) {
        Category deleteCategory = read(categoryId);
        if(deleteCategory==null)
            return false;
        genreList.remove(deleteCategory);
        return true;
    }

    // missing method(s)

    public Set<Category> getAll() {
        return genreList;
    }
}