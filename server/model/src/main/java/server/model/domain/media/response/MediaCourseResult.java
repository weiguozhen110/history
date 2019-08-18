package server.model.domain.media.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import server.common.model.response.ResponseResult;
import server.common.model.response.ResultCode;
import server.model.domain.media.MediaFile;
import server.model.domain.media.MediaVideoCourse;

/**
 * Created by admin on 2018/3/5.
 */
@Data
@ToString
@NoArgsConstructor
public class MediaCourseResult extends ResponseResult {
    public MediaCourseResult(ResultCode resultCode, MediaVideoCourse mediaVideoCourse) {
        super(resultCode);
        this.mediaVideoCourse = mediaVideoCourse;
    }

    MediaFile mediaVideo;
    MediaVideoCourse mediaVideoCourse;
}
