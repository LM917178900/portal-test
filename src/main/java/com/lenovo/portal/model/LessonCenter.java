package com.lenovo.portal.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @DESCRIPTION: xxx
 * @AUTHOR: leimin
 * @TIME: 2020/5/25 14:17
 * @VERSION: 1.0
 **/

@Data
@Accessors(chain = true)
@TableName(value = "lesson_center")
@ApiModel(value = "user", description = "用户")
public class LessonCenter {

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;
}
