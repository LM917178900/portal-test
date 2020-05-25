package com.lenovo.portal.service.impl;

import com.lenovo.portal.mapper.UserMapper;
import com.lenovo.portal.model.User;
import com.lenovo.portal.service.IDockerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @DESCRIPTION: xxx
 * @AUTHOR: leimin
 * @TIME: 2020/5/25 11:15
 * @VERSION: 1.0
 **/
@Service
public class DockerServiceImpl implements IDockerService {

    // @Resource
    // private IUserRepository userRepository;

    @Resource
    private UserMapper userMapper;

    @Override
    public User getById(Long id) {
        User user = userMapper.getById(id);

        return user;
    }
}
