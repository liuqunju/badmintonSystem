package com.madequan.badminton.utils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Description:
 * @Date: 2020/06/06/13:46
 */
public class PageUtil<T> {

    private static final int PAGE_SIZE = 30;

    public PageUtil() {
    }

    public PageInfo<T> calculatePage(Integer pageNo, List dataList){
        PageHelper.startPage(pageNo, PAGE_SIZE);
        PageInfo<T> pageInfo=new PageInfo<T>(dataList);
        return pageInfo;
    }
}
