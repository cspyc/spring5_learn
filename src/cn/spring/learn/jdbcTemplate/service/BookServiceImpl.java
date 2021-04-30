package cn.spring.learn.jdbcTemplate.service;

import cn.spring.learn.jdbcTemplate.dao.BookDao;
import cn.spring.learn.jdbcTemplate.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Pi
 * @date 2021-04-30 10:48
 */
@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void add(Book book) {
        bookDao.add(book);
    }

    @Override
    public void update(Book book) {
        bookDao.update(book);
    }

    @Override
    public void delete(Book book) {
        bookDao.delete(book);
    }

    @Override
    public int queryDataCount() {
        return bookDao.queryDataCount();
    }

    @Override
    public Book queryBookById(Integer id) {
        return bookDao.queryBookById(id);
    }

    @Override
    public List<Book> queryAllBooks() {
        return bookDao.queryAllBooks();
    }

    @Override
    public int[] batchAdd(List<Object[]> addList) {
        return bookDao.batchAdd(addList);
    }

    @Override
    public int[] batchUpdate(List<Object[]> updateList) {
        return bookDao.batchUpdate(updateList);
    }

    @Override
    public int[] batchDelete(List<Object[]> deleteList) {
       return bookDao.batchDelete(deleteList);
    }
}
