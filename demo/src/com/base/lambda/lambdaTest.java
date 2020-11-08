package src.com.base.lambda;
/**
 * lambda 基本语法
 * lambda 是一个匿名函数
 * （） 用来描述参数列表
 *  {} 函数方法体
 *  -> lambda运算符  ， 读作 goes to
 */
public class lambdaTest {
    public static void main(String[] args) {
        /**
         * 可以省略参数类型
         */
        ReturnTwoParameter returnTwoParameter = (a , b) -> a-b;
        System.out.println(returnTwoParameter.compare(1,2));
        /**
         * 一个参数可以省略括号
         */
        ReturnOneParameter returnOneParameter = a ->{
            return  a ;
        };
        returnOneParameter.compare(1);
        /**
         * 函数方法只有一句 可以省略 {} , 如果是return  语句  同时省略return
         */
        NoReturnOneParameter noReturnOneParameter = a ->System.out.println(a);
        ReturnOneParameter returnOneParameter1 = a -> 1;
    }
}