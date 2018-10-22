package it.milano.training.junit;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AuthorServiceTest {

	    @Test
	    public void test_total_book_by_mockito() {

			//1. Setup
	        List<Book> books = Arrays.asList(
	                new Book("MBA","Learner","NY Times"),
	                new Book("CFA","Learner","NY Post"),
	                new Book("Coding","Learner","NY Mail"),
	                new Book("NA","NA","NA"));

	        BookServiceImpl mockito = mock(BookServiceImpl.class);

	        //if the author is "Learner", then return a 'books' object.
	        when(mockito.findBookByAuthor("Learner")).thenReturn(books);

	        AuthorServiceImpl obj = new AuthorServiceImpl();
	        obj.setBookService(mockito);
	        obj.setBookValidatorService(new MockBookValidatorServiceImpl());

			//2. Test method
	        int qty = obj.getTotalBooks("Learner");
	
			//3. Verify result
	        assertThat(qty, is(3));

	    }

}
