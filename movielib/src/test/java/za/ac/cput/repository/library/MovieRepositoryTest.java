/**
 * MovieRepositoryTest.java
 * @Author: your-student-name (student-number)
 * Date: 30 August 2021
 */

package za.ac.cput.repository.library;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.core.annotation.Order;
import za.ac.cput.entity.library.Movie;
import za.ac.cput.factory.library.MovieFactory;

/**
 * Instructions:
 *  > Make sure you have completed the task(s) in MovieRepository.java before attempting tasks below.
 *  > Use JUNIT testing framework ONLY.
 *  > Use appropriate assert method(s).
 *
 * Tasks:
 *  > Replace the throw exception with test case for the create method.
 *  > Replace the throw exception with test case for the read method.
 *  > Replace the throw exception with test case for the update method.
 *  > Replace the throw exception with test case for the delete method.
 *  > Write a test case for the getall method.
 *  > Ensure your tests run in a right order (Hint: method name ascending).
 *
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MovieRepositoryTest {
    private static MovieRepository repository = MovieRepository.getRepository();
    private static Movie movie = MovieFactory.createMovie("Anaconda", 2010);

    @Order(1)
    @Test
    void createTest(){
        Movie created = repository.create(movie);
        assertEquals(created.getId(),movie.getTitle());
        System.out.println("Movie Created: " + created);
    }

    @Order(2)
    @Test
    void readTest(){
        Movie read = repository.read(movie.getId());
        assertNotNull(read);
        System.out.println("Read"+read);
    }
    @Order(3)
    @Test
    void updateTest(){
    }
    @Order(5)
    @Test
    void deleteTest() {
        repository.delete(movie.getId());
        assertNotNull(repository);
    }

    @Order(4)
    @Test
    void getAllTest() {
        System.out.println("Movie: \n" + repository.getAll());
    }

}