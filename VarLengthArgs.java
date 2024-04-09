import java.lang.reflect.Array;
import java.util.Arrays;

public class VarLengthArgs {
    public static void main(String[] args) {
        fun(2,4,5,3,5,7,8,55,4,3556,3);
    }

    static void fun(int ...v){                        //it takes array of a particular datatype
        System.out.println(Arrays.toString(v));          //variable length argument
    }

//    static void fun(int a, int ...v,int b){                        // it givs error
//        System.out.println(Arrays.toString(v));
//    }
}
