package com.geely.design.pattern.behavioral.strategy;

import org.apache.commons.lang3.StringUtils;

/**
 * 策略模式并不决定在何时使用何种算法。在什么情况下使用什么算法是由客户端决定的。
 */
public class StrategyTest {
    // public static void main(String[] args) {
    //     PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
    //     PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
    //
    //     promotionActivity618.executePromotionStrategy();
    //     promotionActivity1111.executePromotionStrategy();
    // }

    //    public static void main(String[] args) {
    //        PromotionActivity promotionActivity = null;
    //        String  promotionKey = "LIJIAN";
    //        if(StringUtils.equals(promotionKey,"LIJIAN")){
    //            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
    //        } else if(StringUtils.equals(promotionKey,"FANXIAN")) {
    //             promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
    //        }
    //
    //     promotionActivity.executePromotionStrategy();
    // }
    public static void main(String[] args) {
      String  promotionKey = "LIJIAN";
      PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
promotionActivity.executePromotionStrategy();
    }
}
