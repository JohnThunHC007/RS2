package it.milano.training.junit;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

	private List<Book> bookListbyAuthor= new ArrayList<Book>();
	private List<Book> bookListbyName= new ArrayList<Book>();
	
	// init database
	// Connect to DB for data
	
    public List<Book> findBookByAuthor(String name) {
		
		
        // DB search
        // return data
    	
    	return this.bookListbyAuthor;
    }

    public List<Book> findBookByName(String name) {
		
		
    	// DB search
        // return data
    	
    	return this.bookListbyName;
    }



}
