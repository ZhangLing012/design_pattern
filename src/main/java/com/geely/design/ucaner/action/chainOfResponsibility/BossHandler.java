package com.geely.design.ucaner.action.chainOfResponsibility;

import com.geely.design.ucaner.action.chainOfResponsibility.abs.Handler;

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

}
