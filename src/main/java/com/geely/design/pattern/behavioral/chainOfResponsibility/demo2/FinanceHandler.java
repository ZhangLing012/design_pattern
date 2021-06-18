package com.geely.design.pattern.behavioral.chainOfResponsibility.demo2;

import com.geely.design.pattern.behavioral.chainOfResponsibility.demo2.abs.Handler;

public class FinanceHandler extends Handler {

	private int moneny;

    @Override
    public int getLevel() {
        return this.moneny;
    }

    @Override
    public String getnName() {
        return "Financer";
    }

	public int getMoneny() {
		return moneny;
	}
	public void setMoneny(int moneny) {
		this.moneny = moneny;
	}

	public FinanceHandler(int moneny) {
		super();
		this.moneny = moneny;
	}



}
