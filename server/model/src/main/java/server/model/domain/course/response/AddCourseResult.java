package server.model.domain.course.response;

import server.common.model.response.ResultCode;
import lombok.Data;
import lombok.ToString;
import server.common.model.response.ResponseResult;

/**
 * Created by mrt on 2018/3/20.
 */
@Data
@ToString
public class AddCourseResult extends ResponseResult {
    public AddCourseResult(ResultCode resultCode,String courseid) {
        super(resultCode);
        this.courseid = courseid;
    }
    private String courseid;

}
