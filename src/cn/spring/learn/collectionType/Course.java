package cn.spring.learn.collectionType;

/**
 * @author Pi
 * @date 2021-04-26 16:07
 */
public class Course {
    private String courseName;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}
