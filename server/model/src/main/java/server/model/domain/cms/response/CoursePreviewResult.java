package server.model.domain.cms.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import server.common.model.response.ResponseResult;
import server.common.model.response.ResultCode;

/**
 * Created by admin on 2018/3/5.
 */
@Data
@ToString
@NoArgsConstructor
public class CoursePreviewResult extends ResponseResult {
    public CoursePreviewResult(ResultCode resultCode, String url) {
        super(resultCode);
        this.url = url;
    }

    String url;
}
