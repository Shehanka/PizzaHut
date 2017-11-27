package com.chamodshehanka.pizzaHutService.business.custom;

import com.chamodshehanka.pizzaHutCommon.dto.ChefDTO;
import com.chamodshehanka.pizzaHutService.business.SuperBO;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public interface ChefBO extends SuperBO{
    public ChefDTO searchChef(String id)throws Exception;
}
