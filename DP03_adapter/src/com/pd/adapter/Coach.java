package com.pd.adapter;

/**
 * ½ÌÁ·
 * @author zhang
 *
 */
public class Coach {
	
	public static void main(String[] args) {
		Player °ÂÄá¶û = new Center();
		°ÂÄá¶û.attack();
		°ÂÄá¶û.defense();
		
		Player Ò¦Ã÷ = new TranslateAdapter();
		Ò¦Ã÷.attack();
		Ò¦Ã÷.defense();
	}
}
