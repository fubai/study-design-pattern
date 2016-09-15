package com.pd.adapter;

/**
 * 教练
 * @author zhang
 *
 */
public class Coach {
	
	public static void main(String[] args) {
		Player 奥尼尔 = new Center();
		奥尼尔.attack();
		奥尼尔.defense();
		
		Player 姚明 = new TranslateAdapter();
		姚明.attack();
		姚明.defense();
	}
}