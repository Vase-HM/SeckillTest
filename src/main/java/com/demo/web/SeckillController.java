package com.demo.web;

import com.demo.entity.Seckill;
import com.demo.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author XiaoBai
 * Create by XiaoBai on 2020/1/12.
 **/
@Controller
/**
 * url:模块/资源/{id}/细分
 */
@RequestMapping("/seckill")
public class SeckillController {

    @Autowired
    private SeckillService seckillService;

    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public String list(Model model) {
        //获取列表页
        List<Seckill> list = seckillService.getSeckillList();
        model.addAttribute("list" , list);
        return "list";
    }

    @RequestMapping(value = "/{seckillId}/detail" , method = RequestMethod.GET)
    public String detail(@PathVariable("seckillId") Long seckillId , Model model){
        if (seckillId == null){
            return "redirect:/seckill/list";
        }
        Seckill seckill = seckillService.getById(seckillId);
        if (seckill == null){
            return "forward:/seckill/list";
        }
        model.addAttribute("seckill" , seckill);
        return "detail";
    }

}
