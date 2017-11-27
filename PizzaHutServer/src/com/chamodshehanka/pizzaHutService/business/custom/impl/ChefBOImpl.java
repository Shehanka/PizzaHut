package com.chamodshehanka.pizzaHutService.business.custom.impl;

import com.chamodshehanka.pizzaHutCommon.dto.ChefDTO;
import com.chamodshehanka.pizzaHutService.business.custom.ChefBO;
import com.chamodshehanka.pizzaHutService.entity.Chef;
import com.chamodshehanka.pizzaHutService.repository.RepositoryFactory;
import com.chamodshehanka.pizzaHutService.repository.custom.ChefRepository;
import com.chamodshehanka.pizzaHutService.resources.DBConnection;

import java.sql.Connection;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class ChefBOImpl implements ChefBO{

    private ChefRepository chefRepository;

    public ChefBOImpl(){
        chefRepository = (ChefRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.CHEF);
    }

    @Override
    public ChefDTO searchChef(String id) throws Exception {
        Connection connection = DBConnection.getConnection();
        chefRepository.setConnection(connection);
        Chef chef = chefRepository.getById(id);
        return new ChefDTO(
                chef.getChefID(),
                chef.getOrderID()
        );
    }
}
