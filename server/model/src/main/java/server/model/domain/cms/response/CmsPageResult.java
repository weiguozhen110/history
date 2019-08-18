package server.model.domain.cms.response;

import lombok.Data;
import server.common.model.response.ResponseResult;
import server.common.model.response.ResultCode;
import server.model.domain.cms.CmsPage;

/**
 * Created by mrt on 2018/3/31.
 */
@Data
public class CmsPageResult extends ResponseResult {
    CmsPage cmsPage;
    public CmsPageResult(ResultCode resultCode, CmsPage cmsPage) {
        super(resultCode);
        this.cmsPage = cmsPage;
    }
}
