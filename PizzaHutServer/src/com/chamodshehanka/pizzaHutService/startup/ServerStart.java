package com.chamodshehanka.pizzaHutService.startup;

import com.chamodshehanka.pizzaHutService.service.ServiceFactoryImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class ServerStart {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(5050);
            System.out.println("Server is starting.....");
            registry.rebind("PizzaServer", ServiceFactoryImpl.getInstance());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
