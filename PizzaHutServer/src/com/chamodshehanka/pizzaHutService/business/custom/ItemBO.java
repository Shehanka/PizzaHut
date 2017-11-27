package com.chamodshehanka.pizzaHutService.business.custom;

import com.chamodshehanka.pizzaHutCommon.dto.ItemDTO;
import com.chamodshehanka.pizzaHutService.business.SuperBO;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public interface ItemBO extends SuperBO{
    public ItemDTO searchItem(String code)throws Exception;
}
