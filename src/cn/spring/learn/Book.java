package cn.spring.learn;

/**
 * @author Pi
 * @date 2021-04-26 11:28
 */
//创建类，定义属性和对应的setter方法
public class Book {
    private String name;
    private String author;
    private String address;

    //setter方法注入属性
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    public static void main(String[] args) {
    }
}
