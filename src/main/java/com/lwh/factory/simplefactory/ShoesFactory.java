package com.lwh.factory.simplefactory;

import com.lwh.factory.AdidasShoes;
import com.lwh.factory.IShoes;
import com.lwh.factory.NikeShoes;

public class ShoesFactory {

    public IShoes createByBrandName(String brandName){
        if ("Nike".equals(brandName)){
            return new NikeShoes();
        } else if ("Adidas".equals(brandName)){
            return new AdidasShoes();
        } else {
            return null;
        }
    }

    public IShoes createByClass(Class<? extends IShoes> clazz){
        try{
            if (null != clazz){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
