package instanceOf;

import java.io.IOException;

/**
 * Created by gfox on 06/11/2014.
 */
public class InstanceOf {

    public static void main(String[] args) {
      int x = 1;
        int y = 0;
        System.out.println(x/y);
    }
}

class A {

    public void test() throws IOException {

    }
}

class B extends A {

   /* @Override
    public void test() throws Exception {//not allowed, can be a subclass of IOException

    }*/
}
