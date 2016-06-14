/**
 * Created by gfox on 27/11/2014.
 */
public class passingInheritanceParameters {

    public static void main(String[] args) {
        topLevel test = new topLevel();
        subclass test1 = new subclass();
        interfacetest test2 = new topLevel();
        test2 = test;
        passSuperclass(test);
        passSuperclass(test1);
        //passSuperclass(test2);
    }

    /**
     * You can pass a subclass parameter to a method defined with a superclass parameter. This does not work the opposite way around.
     * @param s is a superclass reference variable.
     */
    public static void passSuperclass(topLevel s){
        System.out.println("Passing Object In");
    }
}


interface interfacetest{

}
class topLevel implements interfacetest{

}
class subclass extends topLevel{

}