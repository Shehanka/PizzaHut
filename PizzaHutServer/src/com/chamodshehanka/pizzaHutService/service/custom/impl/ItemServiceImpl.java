package com.chamodshehanka.pizzaHutService.service.custom.impl;

import com.chamodshehanka.pizzaHutCommon.dto.ItemDTO;
import com.chamodshehanka.pizzaHutCommon.service.custom.ItemService;
import com.chamodshehanka.pizzaHutService.business.BOFactory;
import com.chamodshehanka.pizzaHutService.business.custom.ItemBO;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class ItemServiceImpl extends UnicastRemoteObject implements ItemService{

    private ItemBO itemBO;

    public ItemServiceImpl() throws RemoteException {
        itemBO = (ItemBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ITEM);
    }

    @Override
    public ItemDTO searchItem(String code) throws Exception {
        return itemBO.searchItem(code);
    }
}
