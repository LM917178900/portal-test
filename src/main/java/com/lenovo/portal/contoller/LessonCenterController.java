package com.lenovo.portal.contoller;

import com.lenovo.portal.mapper.LessonCenterMapper;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @DESCRIPTION: xxx
 * @AUTHOR: leimin
 * @TIME: 2020/5/25 14:44
 * @VERSION: 1.0
 **/
@RestController
public class LessonCenterController {

    /**
     * 引入mapper接口
     */
    @Resource
    private LessonCenterMapper lessonCenterMapper;

    /**
     * 1. 解析需求，解析数据字段
     * 2. 确定数据库表/数据来源于ElasticSearch,
     * 3. 确定接口,只有查询你操作？
     * 4. 解析接口业务逻辑
     */

    /**
     * 接口一
     * 类型：查询
     * 需求： 统计lesson_center中所有数据，并统计每种分类下各种类型的数量。
     * 1.查询所有数据，
     * 2.按分类统计，然后汇总；
     * 3.统计一种分类下所有的分类，发现有++；发现0，初始化1；
     * 4.汇总统计的数据
     */

    public Map<String, Map<String, Integer>> countByType(){

        return null;
    }

    /**
     * 接口二
     *
     * 类型：查询
     * 需求：按条件分页查询，条件可能是标题或内容。获取在某一个分类下查询
     * 1.拼接查询条件，拼接1=1、拼接类型、拼接标题、拼接内容，条件没有内统就不拼接；
     * 2.查询的是内容和标题、人物字段；
     * 3.连表统计处favorite、share的数量;(直接维护？)
     * 4.每张表中的人物保存外键？
     */

    /**
     * 接口三
     *
     * 类型：查询
     * 需求：点击进入一条数据的所以字段
     * 1.通过id关联查询出该条数据的所有字段（被喜爱、被点赞、被分享（单独表））
     */


    /**
     * 接口四
     * 需求：上传附件
     * 1.附件上传到oss、xxx,获取直接保存为二进制数组；
     * 2.如果是上传返回url保存；
     */


    /**
     * 接口五
     * 需求：修改单条数据
     * 1.获取到所有的数据后，直接保存到数据库；
     *
     */

    /**
     * 接口六
     * 类型：查询
     *
     * 需求：按分类类型和类型名称或其他，查询条件下的所有数据的name
     * 1.获取分类类型、分类类型名称、
     * 2.拼接查询条件，查询结果；
     * 3.排除本条数据；（可前端做）
     * 接口统一：可以和第一个接口合并为一个接口
     */

    /**
     * 接口七
     *
     * 类型：查询
     * 需求：链表统计不同分类下的所有lesson的数量
     *
     * 1.可以是favorite（收藏）、share_by、share_to（分享）、praise（点赞）
     */

    /**
     * 接口八
     *
     * 类型：查询
     * 需求：连表表查询不同分类下的所有lesson的数据
     *
     * 1.可以是favorite（收藏）、share_by、share_to（分享）、praise（点赞）
     */

    /**
     * 接口九
     * 需求：收藏，取消收藏
     *
     * 1. 根据issue_id查询统计当前收藏数据；
     * 2. 当前表查询有无被收藏过，
     * 3. 查询原表字段；
     * 5. 没有收藏过 ，原表冗余字段加一，本表数据加一，返回加一后的数据；
     * 6. 已经收藏过，不操作，原表字段返回；
     */


    /**
     * 接口十
     * 需求：点赞，取消点赞
     *
     * 1. 逻辑同理；
     */


    /**
     * 接口十一
     * 需求：分享，取消分享；
     *
     * 1. 逻辑同理；
     */
}
