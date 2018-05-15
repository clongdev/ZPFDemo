package com.zpf.demo;

import java.util.Scanner;

public class SumTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("如果输入exit，那么退出。输入10个数字，用空格隔开");
			
			String temp = input.nextLine();//10个数字在一行内，回车的时候就结束了
			
			//回车跳出循环，程序结束
			if (temp.trim().equals("exit")) {
				break;
			}
			
			//统计和 的变量
			int sum = 0;
			
			//将输入的字符串 分隔成 字符串数组
			String[] ss = temp.trim().split(" ");

			
			if (ss.length != 10) {//判断分割的数组大小是否为10
				System.out.println("输入有误！请输入10个数字，用空格隔开");
			} else {
				//如果为10 则遍历 数组 计算和
				for (int i = 0, len = ss.length; i < len; i++) {
					sum += Integer.parseInt(ss[i]); // 字符串转int数字,累加
				}
				//输出结果
				System.out.println("输入的数字的和是：" + sum);
			}
		}
		input.close();
	}

}