package com.lenovo.portal.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lenovo.portal.service.IBaseService;

/**
 * @DESCRIPTION: xxx
 * @AUTHOR: leimin
 * @TIME: 2020/5/25 13:02
 * @VERSION: 1.0
 **/
public abstract class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements IBaseService<T> {

}
