package exceptions;

/**
 * Created by gfox on 01/09/2014.
 */
public class ThrowingExceptions {
    public static void main(String args[]) throws MyException {

         ThrowingExceptions tc = new ThrowingExceptions();
        try{
            tc.m1();
        }
        catch (MyException e){
            tc.m1();
        }
        finally{
            tc.m2();
        }


    }

    public void m1() throws MyException{
        throw new MyException();
    }
    public void m2() throws RuntimeException {
        throw new RuntimeException();
    }
}

class MyException extends Exception {}
