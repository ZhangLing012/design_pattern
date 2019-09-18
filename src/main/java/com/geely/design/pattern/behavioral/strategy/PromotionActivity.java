package com.geely.design.pattern.behavioral.strategy;

/**
 * 就是一个上下文类，该类的定义体现了多用组合，少用继承、针对接口编程，不针对实现编程两个设计原则
 * 由于这里采用了组合+接口的方式，后面我们在推出其他策略类。只要再定义一个类实现PromotionStrategy接口 就可以了。
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy() {
        promotionStrategy.doPromotion();
    }

}
