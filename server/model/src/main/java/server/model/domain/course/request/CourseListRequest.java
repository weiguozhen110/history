package server.model.domain.course.request;

import lombok.Data;
import lombok.ToString;
import server.common.model.request.RequestData;

/**
 * Created by mrt on 2018/4/13.
 */
@Data
@ToString
public class CourseListRequest extends RequestData {
    //公司Id
    private String companyId;
}
