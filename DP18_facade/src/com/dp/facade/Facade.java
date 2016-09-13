package com.dp.facade;

public class Facade {
	public static void main(String[] args) {
		DrawerFacade drawer = new DrawerFacade();
		drawer.open();
	}
}

class DrawerOne {
	public void open() {
		System.out.println("��һ�����뱻����");
		getKey();
	}

	public void getKey() {
		System.out.println("�õ��ڶ��������Կ��");
	}
}

class DrawerTwo {
	public void open() {
		System.out.println("�ڶ������뱻����");
		getFile();
	}

	public void getFile() {
		System.out.println("�õ������Ҫ�ļ�");
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
