package com.chamodshehanka.pizzaHutCommon.service.custom;

import com.chamodshehanka.pizzaHutCommon.dto.ItemDTO;
import com.chamodshehanka.pizzaHutCommon.service.SuperService;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public interface ItemService extends SuperService{

    public ItemDTO searchItem(String code)throws Exception;

}
