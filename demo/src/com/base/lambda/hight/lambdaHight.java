package src.com.base.lambda.hight;

import src.com.base.lambda.ReturnOneParameter;

public class lambdaHight {
    public static void main(String[] args) {
        lambdaHight newLambdaHighta = new lambdaHight();
        /**
         * 方法引用
         */
        ReturnOneParameter returnOneParameter = a -> changeStatic(a);
        System.out.println(returnOneParameter.compare(2));
        /**
         * 方法引用进阶
         * 注意：
         * 1 参数类型 参数数量 返回值类型 保持一致
         * static  和 非static 引用区别
         */
        ReturnOneParameter returnOneParameterHightStatic  = lambdaHight::changeStatic;
        ReturnOneParameter returnOneParameterHight  = newLambdaHighta::change;
        System.out.println(returnOneParameterHight.compare(3));


    }

    private int change(int a){
        return a*2;
    }

    private static int changeStatic(int a){
        return a*2;
    }
}
