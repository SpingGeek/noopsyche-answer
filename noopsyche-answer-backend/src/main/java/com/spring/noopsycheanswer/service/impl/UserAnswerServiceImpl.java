package com.spring.noopsycheanswer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.noopsycheanswer.service.UserAnswerService;
import com.spring.noopsycheanswer.domain.UserAnswer;
import com.spring.noopsycheanswer.mapper.UserAnswerMapper;
import org.springframework.stereotype.Service;

/**
* @author spring
* @description 针对表【user_answer(用户答题记录)】的数据库操作Service实现
* @createDate 2024-12-09 01:34:43
*/
@Service
public class UserAnswerServiceImpl extends ServiceImpl<UserAnswerMapper, UserAnswer>
    implements UserAnswerService {

}




