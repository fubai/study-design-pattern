package com.pd.builder;
/**
 * Created by zhang on 2017/3/28.
 */
public class Builder {

    private Business business = new Business();

    public Builder field1(String field1){
        this.business.setField1(field1);
        return this;
    }
    public Builder field2(String field2){
        this.business.setField2(field2);
        return this;
    }
    public Builder field3(String field3){
        this.business.setField3(field3);
        return this;
    }
    public Builder field4(String field4){
        this.business.setField4(field4);
        return this;
    }
    public Builder field5(String field5){
        this.business.setField5(field5);
        return this;
    }

    public Business buid(){
        return business;
    }
}
