package com.oop.inter;

public class Businessman implements Richman, SocialWorker {

	@Override
	public void earnMoney() {
		System.out.println("Businessman earnMoney");
	}

	@Override
	public void donation() {
		System.out.println("Businessman donation");
	}

	@Override
	public void party() {
		System.out.println("Businessman party");
	}

	@Override
	public void helpToOthers() {
		System.out.println("Businessman helpToOthers");
	}

}
