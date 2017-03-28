package com.pd.builder;

/**
 * Created by zhang on 2017/3/28.
 */
public class SMSBusiness extends Business {

    private Builder builder = new Builder();

    public Business createBusiness(){
        return builder.field1("11").field2("12").field3("13").field4("14").field5("15").buid();
    }
}
