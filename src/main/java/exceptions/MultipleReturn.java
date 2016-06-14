package exceptions;

/**
 * Created by gfox on 29/08/2014.
 */
public class MultipleReturn {

    float amount = 1000.0f;
       static int getInt() {
            int returnVal = 10;
            try {
                String[] students = {"Harry", "Paul"};
                System.out.println(students[5]);
            }
            catch (Exception e) {
                System.out.println("About to return :" + returnVal);
                return returnVal += 10;
            }
            finally {
                returnVal += 10;
                return 40;

            }


       }
        public static void main(String args[]) {

            System.out.println("In Main:" + getInt());
        }
    }

