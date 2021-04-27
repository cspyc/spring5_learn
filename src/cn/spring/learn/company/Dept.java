package cn.spring.learn.company;

/**
 * @author Pi
 * @date 2021-04-26 14:16
 */
public class Dept {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }
}
