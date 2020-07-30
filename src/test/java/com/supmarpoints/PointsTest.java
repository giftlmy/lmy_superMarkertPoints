package com.supmarpoints;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PointsTest {
    @Test
    public void should_return_100points_when__given_goods_apple_and_watermelon_and_laundry(){
        //given
        Goods goodsApple = new Goods(GoodsType.APPLE.toString(),10);
        Points pointsApple = new Points(goodsApple,1);
        Goods goodsWaterMelon = new Goods(GoodsType.WATERMELON.toString(),15);
        Points pointsWalerMelon = new Points(goodsWaterMelon,2);
        Goods goodsLaundry = new Goods("laundry",20);
        Points pointsLaundry = new Points(goodsLaundry,1);
        //when
        int total = pointsApple.getPoints()+pointsWalerMelon.getPoints()+pointsLaundry.getPoints();
        //then
        assertEquals(100,total);

    }
}
