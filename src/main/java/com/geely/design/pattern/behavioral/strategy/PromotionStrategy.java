package com.geely.design.pattern.behavioral.strategy;

/**
 * 在策略模式中，定义一些独立的类来封装不同的算法，每一个类封装一个具体的算法，在这里，每一个封装算法的类我们都可以称之为策略(Strategy)，为了保证这些策略的一致性，一般会用一个抽象的策略类来做算法的定义，而具体每种算法则对应于一个具体策略类
 */
public interface PromotionStrategy {
    void doPromotion();
}
