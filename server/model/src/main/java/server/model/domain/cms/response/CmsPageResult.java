package server.model.domain.cms.response;

import lombok.Data;
import server.common.model.response.ResponseResult;
import server.common.model.response.ResultCode;
import server.model.domain.cms.CmsPage;


@Data
public class CmsPageResult extends ResponseResult {
    CmsPage cmsPage;
    public CmsPageResult(ResultCode resultCode, CmsPage cmsPage) {
        super(resultCode);
        this.cmsPage = cmsPage;
    }
}
