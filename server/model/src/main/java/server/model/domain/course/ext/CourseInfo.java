package server.model.domain.course.ext;

import server.model.domain.course.CourseBase;
import lombok.Data;
import lombok.ToString;

/**
 * Created by admin on 2018/2/10.
 */
@Data
@ToString
public class CourseInfo extends CourseBase {

    //课程图片
    private String pic;

}
