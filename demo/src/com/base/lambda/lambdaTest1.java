package src.com.base.lambda;

/**
 * 一个参数可以省略括号
 */
public class lambdaTest1 {
    public static void main(String[] args) {
        ReturnOneParameter comparetor = a ->{
            return  a ;
        };
        comparetor.compare(1);
    }

}