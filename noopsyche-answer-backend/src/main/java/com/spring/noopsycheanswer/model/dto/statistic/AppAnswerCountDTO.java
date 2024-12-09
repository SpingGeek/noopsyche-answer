package com.spring.noopsycheanswer.model.dto.statistic;

import lombok.Data;

/**
 * App 用户提交答案书统计
 *
 * @author spring
 */
@Data
public class AppAnswerCountDTO {

    private Long appId;

    /**
     * 用户提交答案数
     */
    private Long answerCount;
}