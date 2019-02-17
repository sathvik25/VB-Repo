package com.sample;

import com.sample.model.LiquorType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kasun on 5/24/17.
 */
public class LiquorService {

    public List getAvailableBrands(LiquorType type){

        List brands = new ArrayList();

        if(type.equals(LiquorType.WINE)){
            brands.add("Adrianna Vineyard");
            brands.add(("J. P. Chenet"));

        }else if(type.equals(LiquorType.WHISKY)){
            brands.add("Glenfiddich");
            brands.add("Johnnie Walker");
			brands.add("RoyalStag");
			brands.add("BlendersPride");

        }else if(type.equals(LiquorType.BEER)){
            brands.add("Corona");
			brands.add("Carlsberg");
			brands.add("BudWeiser");
			brands.add("KingFisher");
			brands.add("Heineken");
         

        }
        else if(type.equals(LiquorType.RUM)){
            brands.add("XXX");
            brands.add("Old Monk");

        }else {
            brands.add("No Brand Available");
        }
    return brands;
    }
}
