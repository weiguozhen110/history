package server.model.domain.cms.response;

import lombok.Data;
import server.common.model.response.ResponseResult;
import server.common.model.response.ResultCode;

/**
 * Created by mrt on 2018/3/31.
 */
@Data
public class GenerateHtmlResult extends ResponseResult {
    String html;
    public GenerateHtmlResult(ResultCode resultCode, String html) {
        super(resultCode);
        this.html = html;
    }
}
