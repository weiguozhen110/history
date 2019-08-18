package server.model.domain.course.ext;

import lombok.Data;
import lombok.ToString;
import server.model.domain.course.Category;

import java.util.List;

/**
 * Created by admin on 2018/2/7.
 */
@Data
@ToString
public class CategoryNode extends Category {

    List<CategoryNode> children;

}
