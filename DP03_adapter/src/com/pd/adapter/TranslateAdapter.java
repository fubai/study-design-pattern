package com.pd.adapter;

/**
 * ����������
 * @author zhang
 *
 */
public class TranslateAdapter extends Player{

	private ForeignCenter foreignCenter = new ForeignCenter();
	
	@Override
	public void attack() {
		foreignCenter.foreignAttack();
	}

	@Override
	public void defense() {
		foreignCenter.foreignDefense();
	}

}
