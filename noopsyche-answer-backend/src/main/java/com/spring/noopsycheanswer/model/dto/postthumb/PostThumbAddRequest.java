
package com.spring.noopsycheanswer.model.dto.postthumb;

import java.io.Serializable;
import lombok.Data;


/**
 * @author spring
 * 帖子点赞请求
 */
@Data
public class PostThumbAddRequest implements Serializable {

    /**
     * 帖子 id
     */
    private Long postId;

    private static final long serialVersionUID = 1L;
}