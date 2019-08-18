package server.model.domain.cms.ext;

import lombok.Data;
import lombok.ToString;
import server.model.domain.cms.CmsPage;

/**
 * @Author: mrt.
 * @Description:
 * @Date:Created in 2018/1/24 10:04.
 * @Modified By:
 */
@Data
@ToString
public class CmsPageExt extends CmsPage {
    private String htmlValue;

}
