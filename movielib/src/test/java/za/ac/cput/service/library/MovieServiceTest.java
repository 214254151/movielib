///**
// * MovieServiceTest.java
// * @Author: your-student-name (student-number)
// * Date: 30 August 2021
// */
//
//package za.ac.cput.service.library;
//
//import org.junit.jupiter.api.Test;
//import za.ac.cput.entity.library.Movie;
//import za.ac.cput.repository.library.IMovieRepository;
//import za.ac.cput.repository.library.MovieRepository;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
///**
// * Instructions:
// *  > Make sure you have completed the task(s) in MovieService.java before attempting tasks below.
// *  > Use JUNIT testing framework ONLY.
// *  > Use appropriate assert method(s).
// *
// * Tasks:
// *  > Replace the throw exception with test case for the create method.
// *  > Replace the throw exception with test case for the read method.
// *  > Replace the throw exception with test case for the update method.
// *  > Replace the throw exception with test case for the delete method.
// *  > Write a test case for the getall method.
// *  > Ensure your tests run in a right order (Hint: method name ascending).
// *
// */
//class MovieServiceTest {
//  private static IMovieService service = MovieService.getService();
//    @Test
//    void create() {
//        assertNotNull(service.create(movie));
//        System.out.println(service.create(movie));
//    }
//
//    @Test
//    void read() {
//        Movie readMovie = service.read(movie.getId());
//
//        assertEquals("Tisetso", readMovie.getId());
//        System.out.println("Read: " + readMovie.toString());
//    }
//
//    @Test
//    void update() {
//        System.out.println("Before update "+ movie.toString());
//
//        Movie newMovie = new Movie.Builder().copy(movie).setTitle("ADPII").build();
//        Movie updatedMovie = service.update(newMovie);
//
//        assertEquals("Damien", updatedMovie.getTitle());
//
//        System.out.println("Post-update: "+ updatedMovie.toString());
//        System.out.println("Get all: ");
//        a_getAll();
//    }
//
//    @Test
//    void delete() {
//
//        void delete() {
//
//            service.delete(movie.getId()).setTitle("ADPO").build();
//            System.out.println(service.getAll());
//        }
//    }
//
//    // missing test(s)
//    public void a_getAll(){
//        assertNotNull(service.getAll());
//        System.out.println(service.getAll());
//    }
//}