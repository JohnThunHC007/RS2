package it.milano.training.junit;

import java.util.List;

public interface BookDao {

	List<Book> findBookByAuthor(String author);
	List<Book> findBookByName(String name);
	
}
