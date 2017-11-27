package com.chamodshehanka.pizzaHutService.business.custom.impl;

import com.chamodshehanka.pizzaHutCommon.dto.ItemDTO;
import com.chamodshehanka.pizzaHutService.business.custom.ItemBO;
import com.chamodshehanka.pizzaHutService.entity.Item;
import com.chamodshehanka.pizzaHutService.repository.RepositoryFactory;
import com.chamodshehanka.pizzaHutService.repository.custom.ItemRepository;
import com.chamodshehanka.pizzaHutService.resources.DBConnection;

import java.sql.Connection;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class ItemBOImpl implements ItemBO{

    private ItemRepository itemRepository;

    public ItemBOImpl(){
        itemRepository = (ItemRepository) RepositoryFactory
                .getInstance().getRepository(RepositoryFactory.RepositoryTypes.ITEM);
    }

    @Override
    public ItemDTO searchItem(String code) throws Exception {
        Connection connection = DBConnection.getConnection();
        itemRepository.setConnection(connection);
        Item item = itemRepository.getById(code);
        return new ItemDTO(
                item.getCode(),
                item.getDescription(),
                item.getUnitPrice()
        );
    }
}
