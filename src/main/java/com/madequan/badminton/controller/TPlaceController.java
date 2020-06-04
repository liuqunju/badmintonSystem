package com.madequan.badminton.controller;

import com.madequan.badminton.entity.TPlace;
import com.madequan.badminton.service.TPlaceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TPlace)表控制层
 *
 * @author makejava
 * @since 2020-06-03 22:54:47
 */
@RestController
@RequestMapping("tPlace")
public class TPlaceController {
    /**
     * 服务对象
     */
    @Resource
    private TPlaceService tPlaceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @ResponseBody
    public TPlace selectOne(String id) {
        TPlace tPlace = this.tPlaceService.queryById(id);
        return tPlace;
    }

}