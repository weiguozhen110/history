package server.model.domain.ucenter.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import server.common.model.response.ResponseResult;
import server.common.model.response.ResultCode;

/**
 * Created by mrt on 2018/5/21.
 */
@Data
@ToString
@NoArgsConstructor
public class LoginResult extends ResponseResult {
    public LoginResult(ResultCode resultCode, String token) {
        super(resultCode);
        this.token = token;
    }
    private String token;
}
