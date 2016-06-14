/**
 * Created by gfox on 10/11/2014.
 */
public class WrapperClasses {
    int value = 1;
    WrapperClasses link;
    public WrapperClasses(int val){ this.value = val; }


    public static WrapperClasses setIt(final WrapperClasses x, final WrapperClasses y){
        x.link = y.link;
        return x;
    }

        public static void main(String[] args){
           int i = 1234567890;
            float f = i;
            System.out.println((int)f);
            System.out.println(i - (int) f);
        }


    }






