package com.chamodshehanka.pizzaHutService.other;

import java.sql.SQLException;

/**
 * @author chamodshehanka on 11/26/2017
 * @project PizzaHut
 **/
public class IDGenerator {
    public static String getAvailableID(String tblName,String colName,String prefix)throws SQLException,ClassNotFoundException{
        String lastID = IDController.getLastID(tblName,colName);
        String newID;
        if (lastID != null){
            StringBuilder Id= new StringBuilder();
            char[] reg=lastID.toCharArray();
            for(int i=1;i<reg.length;i++){
                Id.append(reg[i]);
            }
            int r=Integer.parseInt(Id.toString());
            if(r<9){
                newID= prefix+"00"+(r+1);
            }else if(r<99){
                newID= prefix+"0"+(r+1);
            }else
                newID= prefix+(r+1);
        }else {
            newID = prefix + "001";
        }
        return newID;
    }
}
