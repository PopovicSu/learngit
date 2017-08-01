package entity.studentInfo;

import java.util.Date;

/**
 * Created by shaobo.su on 2017/7/28.
 */
public class IdentityCard {
    private int id;
    private String studentId;
    private String area;
    private Date validDate;
    private Date invalidDate;

    @Override
    public String toString() {
        return "IdentityCard{" +
                "id=" + id +
                ", studentId='" + studentId + '\'' +
                ", area='" + area + '\'' +
                ", validDate=" + validDate +
                ", invalidDate=" + invalidDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Date getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }
}
