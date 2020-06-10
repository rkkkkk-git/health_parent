package com.itheima.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.dao.CheckItemDao;
import com.itheima.pojo.CheckItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName CheckItemServiceImpl
 * @Description TODO
 * @Author 19138
 * @Date 9/6/2020 下午9:02
 * @Version 1.0
 */
@Service(interfaceClass = CheckItemService.class)
@Transactional
public class CheckItemServiceImpl  implements CheckItemService{
    @Autowired
    private CheckItemDao checkItemDao;

    @Override
    public void add(CheckItem checkItem) {
        checkItemDao.add(checkItem);
    }
}
