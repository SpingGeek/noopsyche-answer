package com.spring.noopsycheanswer.model.dto.question;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * 编辑题目请求
 * @author spring
 */
@Data
public class QuestionEditRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 题目内容（json格式）
     */
    private List<QuestionContentDTO> questionContent;

    private static final long serialVersionUID = 1L;
}