package com.madequan.badminton.controller;

import com.madequan.badminton.constant.Constants;
import com.madequan.badminton.entity.Pager;
import com.madequan.badminton.entity.TPlace;
import com.madequan.badminton.placeenum.PageEnum;
import com.madequan.badminton.service.TPlaceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TPlace)表控制层
 *
 * @author makejava
 * @since 2020-06-03 22:54:47
 */
@Controller
@RequestMapping("tPlace")
public class TPlaceController {
    private static final int PAGE_SIZE = 10;
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

    @GetMapping("selecPlaceList")
    public String selecPlaceList(Model model, @RequestParam(defaultValue = "1", required = true, value
            = "pageNo") Integer pageNo, @RequestParam(defaultValue = Constants.PAGE_SIZE, required = false, value
            = "pageSize") Integer pageSize, TPlace tPlace) {
        Pager pageTools = tPlaceService.queryAllByLimit(pageNo, pageSize, tPlace);
        model.addAttribute("pageData", pageTools);
        model.addAttribute("place", tPlace);
        return "page/place/placelist";
    }

    @GetMapping("reservePlace")
    public String reservePlace(Model model, @RequestParam(required = true, value = "placeId") String placeId){
        TPlace tPlace = tPlaceService.queryById(placeId);

        model.addAttribute("place", tPlace);
        return "page/place/reservePlace";
    }

    /**
     * 添加场地
     *
     * @param tPlace
     */
    @PostMapping("addOne")
    public void addOne(TPlace tPlace) {
        tPlaceService.insert(tPlace);
    }


}