package entity.person;

/**
 * Created by shaobo.su on 2017/7/28.
 */
public class NewPerson {
    private int newId;
    private String newUserName;
    private int newAge;
    private String newMobilePhone;

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public String getNewUserName() {
        return newUserName;
    }

    public void setNewUserName(String newUserName) {
        this.newUserName = newUserName;
    }

    public int getNewAge() {
        return newAge;
    }

    public void setNewAge(int newAge) {
        this.newAge = newAge;
    }

    public String getNewMobilePhone() {
        return newMobilePhone;
    }

    public void setNewMobilePhone(String newMobilePhone) {
        this.newMobilePhone = newMobilePhone;
    }

    @Override
    public String toString() {
        return "NewPerson{" +
                "newId=" + newId +
                ", newUserName='" + newUserName + '\'' +
                ", newAge=" + newAge +
                ", newMobilePhone='" + newMobilePhone + '\'' +
                '}';
    }
}
