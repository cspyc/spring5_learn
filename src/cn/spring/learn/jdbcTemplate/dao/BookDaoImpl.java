package cn.spring.learn.jdbcTemplate.dao;

import cn.spring.learn.jdbcTemplate.entity.Book;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Pi
 * @date 2021-04-30 10:49
 */
@Repository
public class BookDaoImpl implements BookDao {
    private JdbcTemplate jdbcTemplate;

    //构造器注入：如果只有一个构造器，且参数为IOC容器中的Bean，将会执行自动注入
    public BookDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void add(Book book) {
        try {
            //创建sql语句
            String addSql = "insert into book(id,isbn,name,author) values(?,?,?,?)";
            Object[] args = {book.getId(), book.getISBN(), book.getName(), book.getAuthor()};
            jdbcTemplate.update(addSql, args);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        System.out.println("插入数据成功");
    }

    @Override
    public void update(Book book) {
        try {
            //创建sql语句
            String updateSql = "update book set name = ? where id = ?";
            Object[] args = {book.getName(), book.getId()};
            jdbcTemplate.update(updateSql, args);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        System.out.println("更新数据成功");
    }

    @Override
    public void delete(Book book) {
        try {
            //删除sql语句
            String deleteSql = "delete from book where id = ?";
            Object[] args = {book.getId()};
            jdbcTemplate.update(deleteSql, args);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        System.out.println("删除数据成功");
    }

    @Override
    public int queryDataCount() {
        String countSql = "select count(*) from book";
        int count = jdbcTemplate.queryForObject(countSql, Integer.class);
        return count;
    }

    @Override
    public Book queryBookById(Integer id) {
        String queryBookCount = "select * from book where id = ?";
        Object[] args = {id};
        Book book = jdbcTemplate.queryForObject(queryBookCount, new BeanPropertyRowMapper<Book>(Book.class), args);
        return book;
    }

    @Override
    public List<Book> queryAllBooks() {
        String queryBookList = "select * from book";
        List<Book> books = jdbcTemplate.query(queryBookList, new BeanPropertyRowMapper<Book>(Book.class));
        return books;
    }

    @Override
    public int[] batchAdd(List<Object[]> addList) {
        //创建sql语句
        String addSql = "insert into book(id,isbn,name,author) values(?,?,?,?)";
        int[] executeResult = jdbcTemplate.batchUpdate(addSql, addList);
        return executeResult;
    }

    @Override
    public int[] batchUpdate(List<Object[]> updateList) {
        String updateSql = "update book set name=? where id=?";
        int[] batchUpdateResult = jdbcTemplate.batchUpdate(updateSql, updateList);
        return batchUpdateResult;
    }

    @Override
    public int[] batchDelete(List<Object[]> deleteList) {
        String deleteSql = "delete from book where id = ?";
        int[] batchDeleteResult = jdbcTemplate.batchUpdate(deleteSql, deleteList);
        return batchDeleteResult;
    }


}
