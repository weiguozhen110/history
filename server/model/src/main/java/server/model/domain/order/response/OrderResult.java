package server.model.domain.order.response;

import lombok.Data;
import lombok.ToString;
import server.common.model.response.ResponseResult;
import server.common.model.response.ResultCode;
import server.model.domain.order.XcOrders;

/**
 * Created by mrt on 2018/3/26.
 */
@Data
@ToString
public class OrderResult extends ResponseResult {
    private XcOrders xcOrders;
    public OrderResult(ResultCode resultCode, XcOrders xcOrders) {
        super(resultCode);
        this.xcOrders = xcOrders;
    }


}
