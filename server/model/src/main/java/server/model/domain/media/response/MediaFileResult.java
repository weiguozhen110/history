package server.model.domain.media.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import server.common.model.response.ResponseResult;
import server.common.model.response.ResultCode;
import server.model.domain.media.MediaFile;

/**
 * Created by mrt on 2018/3/31.
 */
@Data
@NoArgsConstructor
public class MediaFileResult extends ResponseResult {
    MediaFile mediaFile;
    public MediaFileResult(ResultCode resultCode, MediaFile mediaFile) {
        super(resultCode);
        this.mediaFile = mediaFile;
    }
}
