package mapper;

import entity.studentInfo.CourseGrade;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by shaobo.su on 2017/7/31.
 */
public interface ICourseGradeOperationMapper {
    List<CourseGrade> findCourseGradeListByStudentId(@Param(value = "sId") String studentId);
}
