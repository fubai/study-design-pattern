package com.pd.proxy;

/**
 * 代理
 * @author zhang
 *
 */
public class Proxy extends KindObject{

	public RealObject realObject;
	
	@Override
	public void doKindThing() {
		if(null == realObject){
			realObject = new RealObject();
		}
		realObject.doKindThing();
	}
	
}
