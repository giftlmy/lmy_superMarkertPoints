package com.supmarpoints;

import java.math.BigDecimal;

public class Points {
    private Goods goods;
    private int count;

    public Points(Goods goods, int count) {
        this.goods = goods;
        this.count = count;
    }

    public int getPoints(){
        if(goods.isSales()){
            return goods.getPrice()*count*2;
        }else{
            return goods.getPrice()*count;
        }
    }
}
