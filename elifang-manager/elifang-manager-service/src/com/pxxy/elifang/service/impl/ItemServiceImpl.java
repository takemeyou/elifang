package com.pxxy.elifang.service.impl;

import com.pxxy.elifang.mapper.TbItemMapper;
import com.pxxy.elifang.pojo.TbItem;
import com.pxxy.elifang.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//"itemService"
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    //查询商品
    public TbItem getItemById(long itemId) {
        //根据主键查询
        TbItem tbItem = tbItemMapper.selectByPrimaryKey(itemId);

        //根据条件查询
        //TbItemExample


        if(tbItem != null ){
            return tbItem;
        }

        return tbItem;
    }
}
