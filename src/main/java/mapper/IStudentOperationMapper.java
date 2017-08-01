package mapper;

import entity.studentInfo.CourseGrade;
import entity.studentInfo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by shaobo.su on 2017/7/28.
 */
public interface IStudentOperationMapper {
    List<Student> findStudentByStudentId(@Param(value = "sId") String studentId);


}
