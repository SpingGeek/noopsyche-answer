package com.spring.noopsycheanswer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.noopsycheanswer.model.entity.App;
import com.spring.noopsycheanswer.service.AppService;
import com.spring.noopsycheanswer.mapper.AppMapper;
import org.springframework.stereotype.Service;

/**
 * @author spring
 * @description 针对表【app(应用)】的数据库操作Service实现
 * @createDate 2024-12-09 01:34:43
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App>
        implements AppService {

}




