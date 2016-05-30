/**
 * Created by gfox on 05/09/2014.
 */
public class Inheritance {

    public static void main(String[] args) {
        System.out.println('a' + 1 );
        Base b1 = new Base2();
        b1.getValue();
    }



    }



class Base{
    public Object getValue(){ return new Object(); } //1
}

class Base2 extends Base{
    public String getValue1(){ return "hello"; } //2
}
