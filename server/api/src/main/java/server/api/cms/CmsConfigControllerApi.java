package server.api.cms;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import server.model.domain.cms.CmsConfig;

/**
 * Created by Administrator on 2018/9/15.
 */
@Api(value="cms配置管理接口",description = "cms配置管理接口，提供数据模型的管理、查询接口")
public interface CmsConfigControllerApi {
    @ApiOperation("根据id查询CMS配置信息")
    public CmsConfig getmodel(String id);
}
