package com.geely.design.pattern.behavioral.chainOfResponsibility.demo2;

import com.geely.design.pattern.behavioral.chainOfResponsibility.demo2.abs.Handler;

public class BossHandler extends Handler {

	private int moneny;

    @Override
    public int getLevel() {
        return this.moneny;
    }

    @Override
    public String getnName() {
        return "BOSS";
    }

	public int getMoneny() {
		return moneny;
	}

	public void setMoneny(int moneny) {
		this.moneny = moneny;
	}

	/**
	* BossHandler.
	* @param moneny
	*/
	public BossHandler(int moneny) {
		super();
		this.moneny = moneny;
	}

	public static class ChainOfReponsibilityMain {

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
}
