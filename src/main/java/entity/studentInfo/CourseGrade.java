package entity.studentInfo;

/**
 * Created by shaobo.su on 2017/7/31.
 */
public class CourseGrade {
    private int id;
    private String studentNo;//就是student_id
    private String courseNo;
    private int grade;
    private String message;

    @Override
    public String toString() {
        return "CourseGrade{" +
                "id=" + id +
                ", studentNo='" + studentNo + '\'' +
                ", courseNo='" + courseNo + '\'' +
                ", grade=" + grade +
                ", message='" + message + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
