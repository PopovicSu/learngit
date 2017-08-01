package mapper;

import entity.studentInfo.IdentityCard;
import org.apache.ibatis.annotations.Param;

/**
 * Created by shaobo.su on 2017/7/28.
 */
public interface IIdentityCardOperationMapper {
    IdentityCard findIdentityCardByStudentId(@Param(value = "studentId") String studentId);
}
