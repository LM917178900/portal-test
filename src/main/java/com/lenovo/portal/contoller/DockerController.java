package com.lenovo.portal.contoller;

import com.lenovo.portal.mapper.LessonCenterMapper;
import com.lenovo.portal.mapper.UserMapper;
import com.lenovo.portal.model.LessonCenter;
import com.lenovo.portal.service.IDockerService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @DESCRIPTION: xxx
 * @AUTHOR: leimin
 * @TIME: 2020/5/25 11:13
 * @VERSION: 1.0
 **/

@RestController
public class DockerController {
    /**
     * mybatis查询mysql数据库
     */
    @Resource
    private IDockerService dockerService;
    @Resource
    private UserMapper userMapper;
    @Resource
    private LessonCenterMapper lessonCenterMapper;

    @GetMapping("user/id")
    @ApiOperation(value = "getById", notes = "getById")
    public LessonCenter getById(@ApiParam(value = "Id") @RequestParam(value = "id", required = false) Long id) {

        System.out.println("===================>hello world");
        return lessonCenterMapper.selectById(id);
    }

    @GetMapping("users")
    @ApiOperation(value = "getUsers", notes = "getUsers")
    public List<LessonCenter> getById() {

        System.out.println("===================>hello world");
        return lessonCenterMapper.selectList(null);
    }
}
