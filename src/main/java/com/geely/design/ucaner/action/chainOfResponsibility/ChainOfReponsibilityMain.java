package com.geely.design.ucaner.action.chainOfResponsibility;

import com.geely.design.ucaner.action.chainOfResponsibility.abs.Handler;

public class ChainOfReponsibilityMain {

    public static void main(String[] args) {
    	/**
    	 * 我要报销的钱数
    	 */
        int money=295;

        /**
         * 初始化各个处理者
         */
        Handler manager = new ManagerHandler(200);
        Handler finance = new FinanceHandler(500);
        Handler boss = new BossHandler(1000);

        //manager -> finace -> boss

        /**
         * 设置链中的顺序
         */
        manager.setNextHandler(finance);

        finance.setNextHandler(boss);

        //do
        System.out.println("I want 报销 "+money+" yuan.");
        if (manager.handlerRequst(money)) {
            System.out.println("报销Success!");
        } else {
            System.out.println("报销Fail!");
        }
    }

}
//Outputs
//I want 报销 5 yuan.
//Manager向Financer递交请求
//Financer向BOSS递交请求
//BOSS :可以审批
//Financer :BOSS说可以审批
//Manager :Financer说可以审批
//报销Success!
