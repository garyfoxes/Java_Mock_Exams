/**
 * Created by gfox on 10/11/2014.
 */

public class StaticInitilizer{
    public static void main(String[] args){
        One o = null;
        Two t = new Two();
    }
}

class Super{
    static{ System.out.print("super "); }
}
class One{
    static {  System.out.print("one "); }
}
class Two extends Super{
    static {  System.out.print("two "); }
}
