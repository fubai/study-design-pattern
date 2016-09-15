package com.dp.facade;

public class Facade {
	public static void main(String[] args) {
		DrawerFacade drawer = new DrawerFacade();
		drawer.open();
	}
}

class DrawerOne {
	public void open() {
		System.out.println("打开第一个抽屉");
		getKey();
	}

	public void getKey() {
		System.out.println("拿到钥匙");
	}
}

class DrawerTwo {
	public void open() {
		System.out.println("打开第二个抽屉");
		getFile();
	}

	public void getFile() {
		System.out.println("拿到文件");
	}
}

class DrawerFacade {
	DrawerOne darwerOne = new DrawerOne();
	DrawerTwo darwerTwo = new DrawerTwo();

	public void open() {
		darwerOne.open();
		darwerTwo.open();
	}
}
