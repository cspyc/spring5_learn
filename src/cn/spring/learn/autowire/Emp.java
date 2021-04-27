package cn.spring.learn.autowire;

/**
 * @author Pi
 * @date 2021-04-26 20:04
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
}
