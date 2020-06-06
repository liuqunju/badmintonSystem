package com.madequan.badminton.controller;

import com.madequan.badminton.entity.TReserveMessage;
import com.madequan.badminton.service.TReserveMessageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TReserveMessage)表控制层
 *
 * @author makejava
 * @since 2020-06-06 18:49:14
 */
@RestController
@RequestMapping("tReserveMessage")
public class TReserveMessageController {
    /**
     * 服务对象
     */
    @Resource
    private TReserveMessageService tReserveMessageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TReserveMessage selectOne(String id) {
        return this.tReserveMessageService.queryById(id);
    }

}