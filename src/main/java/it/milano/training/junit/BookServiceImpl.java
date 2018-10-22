package it.milano.training.junit;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookDao bookDao= new BookDaoImpl();

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<Book> findBookByAuthor(String name) {
        return bookDao.findBookByAuthor(name);
    }
    
    public List<Book> findBookByName(String name) {
        return bookDao.findBookByName(name);
    }

}
