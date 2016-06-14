/**
 * Created by gfox on 10/11/2014.
 */
public class TryCatch {

}
class E1 extends Exception{ }
class E2 extends E1 { }
class Test{
    public static void main(String[] args){
        try{
            throw new E2();
        }
        catch(E1 e){
            System.out.println("E1");
        }
        catch(Exception e){
            System.out.println("E");
        }
        finally{
            System.out.println("Finally");
        }
    }
}