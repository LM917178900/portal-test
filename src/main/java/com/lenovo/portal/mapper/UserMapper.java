package com.lenovo.portal.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lenovo.portal.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @DESCRIPTION: xxx
 * @AUTHOR: leimin
 * @TIME: 2020/5/25 13:50
 * @VERSION: 1.0
 **/
@Repository
public interface UserMapper extends BaseMapper<User> {


    User getById(@Param("id") Long id);
}
