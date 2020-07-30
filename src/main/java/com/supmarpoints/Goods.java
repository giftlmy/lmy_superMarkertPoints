package com.supmarpoints;

import java.util.List;

public class Goods {
    private String goodsType;
    private int price;

    public Goods(String goodsType, int price) {
        this.goodsType = goodsType;
        this.price = price;
    }

    public boolean isSales(){
        for(GoodsType gt:GoodsType.values()){
            if(goodsType.equals(gt.toString())){
                return true;
            }
        }
        return false;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public int getPrice() {
        return price;
    }
}
