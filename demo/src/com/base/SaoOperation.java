package src.com.base;

public class SaoOperation {

    public static void main(String[] args) {
        //使用左移运算符 << 迅速得出2的次方
        System.out.println(1<<1);
        System.out.println(1<<10);
        //使用 ^ 切换变量 0 或 1
        System.out.println(0^1);
        System.out.println(1^1);
        System.out.println(1^0);
        System.out.println(0^0);
        // 使用 &
        System.out.println(17&1);
        System.out.println(18&1);
    }

}
