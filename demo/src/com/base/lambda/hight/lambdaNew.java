package src.com.base.lambda.hight;

import src.com.base.lambda.model.Persion;

public class lambdaNew {

    public static void main(String[] args) {

        /**
         * 构造方法引用
         */
        PersionCreateNoParameter persionCreateNoParameter = Persion::new;
        PersionCreate persionCreate = Persion::new;

    }
}

interface PersionCreateNoParameter{
    Persion newPersion();
}
interface PersionCreate{
    Persion newPersion(String name , String age);
}
