package com.base.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestLambda {
	public static void main(String[] args) {
		Thread t2 = new Thread(() -> System.out.println("use lambda"));
		t2.run();
		List<Integer> integers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> evens = integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()); // 过滤出偶数列表
																										// [4,6,8,8,10]<br>
		SyList(evens);
		List<Integer> sortIntegers = integers.stream().sorted().limit(5).collect(Collectors.toList());// 排序并且提取出前5个元素
																										// [1,2,3,4,5]
		SyList(sortIntegers);
		List<Integer> squareList = integers.stream().map(i -> i * i).collect(Collectors.toList());// 转成平方列表
		SyList(squareList);
		int sum = integers.stream().mapToInt(Integer::intValue).sum();// 求和
		System.out.println(sum);
		Set<Integer> integersSet = integers.stream().collect(Collectors.toSet());// 转成其它数据结构比如set
		SyList(integers);
		Map<Boolean, List<Integer>> listMap = integers.stream().collect(Collectors.groupingBy(i -> i % 2 == 0)); // 根据奇偶性分组
		List<Integer> list = integers.stream().filter(i -> i % 2 == 0).map(i -> i * i).distinct()
				.collect(Collectors.toList());// 复合操作
		SyList(list);
	}

	private static void SyList(List<Integer> list) {
		for (Integer in : list) {
			System.out.print(in + " ");
		}
		System.out.println();
	}
}
