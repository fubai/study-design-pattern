/**
 * Created by zhang on 2017/3/28.
 */
public class EmailBusiness extends Business {

    private Builder builder = new Builder();

    public Business createBusiness(){
        return builder.field1("1").field2("2").field3("3").field4("4").field5("5").buid();
    }
}
