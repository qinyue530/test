package src.com.base.lambda;

import java.util.ArrayList;
import java.util.TreeSet;

public class lambdaJUC {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(9);
        //集合排序
        arrayList.sort((a ,b )-> a-b);
        System.out.println(arrayList);
        TreeSet<Integer> treeSet = new TreeSet<Integer>((a,b)->a-b);
        //TreeSet   删掉去重 并排序
        TreeSet<Integer> treeSetA = new TreeSet<Integer>((a,b)-> {
            if(a-b>=0)return -1;else
                return 1;
        });
        //集合便利
        arrayList.forEach(System.out::print);
        System.out.println();
        arrayList.forEach(a ->{
            if(a%2==0) System.out.print(a);
        });


    }
}
