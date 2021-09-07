package application.tables;

public class Courses {

    private int courseId;
    private String courseName;
    private boolean isDaytime;
    private int lengthWeek;

    public Courses() {
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public boolean isDaytime() {
        return isDaytime;
    }

    public void setDaytime(boolean daytime) {
        isDaytime = daytime;
    }

    public int getLengthWeek() {
        return lengthWeek;
    }

    public void setLengthWeek(int lengthWeek) {
        this.lengthWeek = lengthWeek;
    }
}
