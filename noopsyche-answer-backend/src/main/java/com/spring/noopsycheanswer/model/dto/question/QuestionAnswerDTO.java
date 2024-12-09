package com.spring.noopsycheanswer.model.dto.question;

import lombok.Data;

/**
 * 题目答案封装类（用于 AI 评分）
 * @author spring
 */
@Data
public class QuestionAnswerDTO {

    /**
     * 题目
     */
    private String title;

    /**
     * 用户答案
     */
    private String userAnswer;
}
