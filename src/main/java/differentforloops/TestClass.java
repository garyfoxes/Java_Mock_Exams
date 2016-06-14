package differentforloops;

/**
 * Created by gfox on 26/08/2014.
 */
public class TestClass {

    public static void main(String[] args) {

        //only loops once as once incremented math.random is greater than 1
        for(;Math.random()<0.5;){
            System.out.println("true");

        }

      /*  for(;;)
        {
            if(Math.random()<.05) break;
        }*/
      /*  boolean b = false;
        int i = 1;
        do{
            i++ ;
        } while (b = !b);
        System.out.println( i );
*/
    /*    int i = 0, j = 5;

        for (; ; i++) {
            lab1:
            for (; ; --j) {
                if (i > j)
                    continue lab1;
                System.out.println("hello");
            }
        }*/
    }
}
        //System.out.println(" i = " + i + ", j = " + j);






