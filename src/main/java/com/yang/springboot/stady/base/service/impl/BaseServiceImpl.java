/**
 * CacheServiceImpl.java
 * Created at 2019-6-18
 * Created by yang
 * Copyright (C) 2019 SAIC VOLKSWAGEN, All rights reserved.
 */
package com.yang.springboot.stady.base.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;

import com.yang.springboot.stady.base.mapper.IBaseMapper;
import com.yang.springboot.stady.base.model.system.PageParam;
import com.yang.springboot.stady.base.service.IBaseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * ClassName: CacheServiceImpl
 * </p>
 * <p>
 * Description: 二级缓存实现类
 * </p>
 * <p>
 * Author: yang
 * </p>
 * <p>
 * Date: 2019年9月16日
 * </p>
 * @author yang
 */
public class BaseServiceImpl<M extends IBaseMapper<T>, T> extends ServiceImpl<M, T> implements IBaseService<T> {

    /**
     * 
     * <p>
     * Description: baseMapper
     * </p>
     */
    @Autowired
    protected M baseMapper;


    @Override
    public List<T> queryPage(PageParam pageParam, T t) {
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), pageParam.getOrderBy());
        return this.baseMapper.queryPage(pageParam, t);
    }

    @Override
    public List<T> offsetPage(PageParam pageParam, T t) {
        PageHelper.offsetPage(pageParam.getStart(), pageParam.getLimit());
        PageHelper.orderBy(pageParam.getOrderBy());
        return this.baseMapper.queryPage(pageParam, t);
    }

}
