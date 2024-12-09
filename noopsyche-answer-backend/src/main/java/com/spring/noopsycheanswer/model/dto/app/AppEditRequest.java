package com.spring.noopsycheanswer.model.dto.app;

import java.io.Serializable;
import lombok.Data;

/**
 * @program: noopsyche-answer
 * @author: spring
 * @create: 2024-12-09
 * 编辑应用请求
 */
@Data
public class AppEditRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 应用名
     */
    private String appName;

    /**
     * 应用描述
     */
    private String appDesc;

    /**
     * 应用图标
     */
    private String appIcon;

    /**
     * 应用类型（0-得分类，1-测评类）
     */
    private Integer appType;

    /**
     * 评分策略（0-自定义，1-AI）
     */
    private Integer scoringStrategy;

    private static final long serialVersionUID = 1L;


}