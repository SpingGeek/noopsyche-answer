package com.spring.noopsycheanswer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.noopsycheanswer.domain.Question;
import com.spring.noopsycheanswer.service.QuestionService;
import com.spring.noopsycheanswer.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author spring
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2024-12-09 01:34:43
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




