package cn.spring.learn.jdbcTemplate.dao;

import cn.spring.learn.jdbcTemplate.entity.Book;

import java.util.List;

/**
 * @author Pi
 * @date 2021-04-30 10:49
 */
public interface BookDao {
    void add(Book book);

    void update(Book book);

    void delete(Book book);

    int queryDataCount();

    Book queryBookById(Integer id);

    List<Book> queryAllBooks();

    int[] batchAdd(List<Object[]> addList);

    int[] batchUpdate(List<Object[]> updateList);

    int[] batchDelete(List<Object[]> deleteList);
}
