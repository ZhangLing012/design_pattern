package com.geely.design.pattern.behavioral.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class PromotionStrategyFactory {
    private static final Map<String,PromotionStrategy> strategyMap = new ConcurrentHashMap<>();
    static {
        strategyMap.put(PromotionKey.FANXIAN,new FanXianPromotionStrategy());
        strategyMap.put(PromotionKey.LIJIAN,new LiJianPromotionStrategy());
        strategyMap.put(PromotionKey.MANJIAN,new ManJianPromotionStrategy());
    }
   private PromotionStrategyFactory(){}

   public static PromotionStrategy getPromotionStrategy(String promotion){
        PromotionStrategy promotionStrategy = strategyMap.get(promotion);
        return promotionStrategy == null ? null: promotionStrategy;
   }
   private interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
   }
}
