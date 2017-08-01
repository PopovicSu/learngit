package entity.studentInfo;

import java.util.List;

/**
 * Created by shaobo.su on 2017/7/28.
 */
public class Student {
    private String studentId;//主键
    private String studentName;
    private String sex;
    private String message;

    //每张学生证和学生是一一对应的，可以通过studentId得到identityCard，这样可以实现association级联
    private IdentityCard identityCard;

    //每个学生有一个课程成绩表，可以通过studentId查找
    private List<CourseGrade> courseGradeList;

    public List<CourseGrade> getCourseGradeList() {
        return courseGradeList;
    }

    public void setCourseGradeList(List<CourseGrade> courseGradeList) {
        this.courseGradeList = courseGradeList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", sex='" + sex + '\'' +
                ", message='" + message + '\'' +
                ", identityCard=" + identityCard +
                ", courseGradeList=" + listToString(courseGradeList) +
                '}';
    }
    private String listToString(List<CourseGrade> courseGrades){
        if(courseGrades==null)
            return "";
        String str="嗯嗯嗯";
        for(int ii=0;ii<courseGrades.size();ii++){
            str += courseGrades.get(ii);
        }
        return str;
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(IdentityCard identityCard) {
        this.identityCard = identityCard;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
