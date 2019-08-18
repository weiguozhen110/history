package server.model.domain.order.response;

import lombok.Data;
import lombok.ToString;
import server.common.model.response.ResponseResult;
import server.common.model.response.ResultCode;

/**
 * Created by mrt on 2018/3/27.
 */
@Data
@ToString
public class PayQrcodeResult extends ResponseResult {
    public PayQrcodeResult(ResultCode resultCode){
        super(resultCode);
    }
    private String codeUrl;
    private Float money;
    private String orderNumber;

}
