package cn.spring.learn.jdbcTemplate.test;

import cn.spring.learn.jdbcTemplate.entity.Book;
import cn.spring.learn.jdbcTemplate.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Pi
 * @date 2021-04-30 11:13
 */
public class BookTest {

    @Test
    public void test_add() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);

        Book book = new Book();
        book.setId(2);
        book.setISBN("6923432432");
        book.setName("spring精通");
        book.setAuthor("spring专家组");

        bookService.add(book);
    }

    @Test
    public void test_update() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);

        Book book = new Book();
        book.setId(2);
        book.setName("sprigBoot全集");

        bookService.update(book);
    }

    @Test
    public void test_delete() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);

        Book book = new Book();
        book.setId(2);

        bookService.delete(book);
    }

    @Test
    public void test_query_count() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);

        int count = bookService.queryDataCount();
        System.out.println(count);
    }

    @Test
    public void test_query_book_by_id() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);

        Book book = bookService.queryBookById(2);
        System.out.println(book);
    }

    @Test
    public void test_query_book_list() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);

        List<Book> books = bookService.queryAllBooks();
        System.out.println(books);
    }

    @Test
    public void test_batch_add() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);

        List<Object[]> addList = new ArrayList<>();
        Object[] o1 = {7, "22222", "JUC", "步步高"};
        Object[] o2 = {8, "33333", "jvm", "小天才"};
        addList.add(o1);
        addList.add(o2);

        int[] result = bookService.batchAdd(addList);
        System.out.println(Arrays.toString(result));
    }


    @Test
    public void test_batch_update() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);

        List<Object[]> updateList = new ArrayList<>();
        Object[] o1 = {"Tdd", 5};
        Object[] o2 = {"Bdd", 6};
        updateList.add(o1);
        updateList.add(o2);

        int[] result = bookService.batchUpdate(updateList);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test_batch_delete() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);

        List<Object[]> deleteList = new ArrayList<>();
        Object[] o1 = {7};
        Object[] o2 = {8};
        deleteList.add(o1);
        deleteList.add(o2);

        int[] result = bookService.batchDelete(deleteList);
        System.out.println(Arrays.toString(result));
    }


}
