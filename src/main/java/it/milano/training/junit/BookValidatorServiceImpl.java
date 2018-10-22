package it.milano.training.junit;

import java.util.List;

public class BookValidatorServiceImpl implements BookValidatorService {

	private BookService bookservice= new BookServiceImpl();
	
	
    public boolean isValid(Book book) {
    	List<Book> books= bookservice.findBookByName(book.getName());
    	
        if (books.isEmpty()) {
            return false;
        }
        
        if(book.getName().equalsIgnoreCase("NA")){
        	return false;
        }else {	
            return true;
        }

    }

}
