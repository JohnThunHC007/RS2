package it.milano.training.junit;

import java.util.List;

public class MockBookValidatorServiceImpl implements BookValidatorService {

	private BookService bookservice= new BookServiceImpl();
	
	
    public boolean isValid(Book book) {
    	
        if (book==null) {
            return false;
        }
        
        if(book.getName().equalsIgnoreCase("NA")){
        	return false;
        }else {	
            return true;
        }

    }

}
