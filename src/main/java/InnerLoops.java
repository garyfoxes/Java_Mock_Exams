/**
 * Created by gfox on 20/10/2014.
 */
public class InnerLoops {

    public static void main(String[] args) {
      /*  int i = 0;
        one:for(int a = 0;a < 3;a++)
            two:for(int b = 0; b< 6;b++)
                three:for(int c = 0; c <b;c++){
                    i++;
                    if(c%3 ==0){
                        continue two;
                    }
                }
        System.out.println(i);*/

        int c =0;
        for(int i =0;i < 5;i++)
            for(int j =0;j<2;j++){
                c++;
                if((i+j) < 3){
                    continue;
                }
                else{
                    System.out.println("About to break");
                    break;
                }
            }
        System.out.println(c);

    }

}
