package com.spring.noopsycheanswer.model.dto.file;

import java.io.Serializable;
import lombok.Data;

/**
 * @program: noopsyche-answer
 * @author: spring
 * @create: 2024-12-09
 * 文件上传请求
 */
@Data
public class UploadFileRequest implements Serializable {

    /**
     * 业务
     */
    private String biz;

    private static final long serialVersionUID = 1L;


}
