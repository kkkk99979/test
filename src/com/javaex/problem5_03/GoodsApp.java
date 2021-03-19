package com.javaex.problem5_03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		int sum = 0;
		int j;
		int h;
		Scanner sc = new Scanner(System.in);
		ArrayList<Goods> goods = new ArrayList<Goods>();
		System.out.println("상품 3개를 입력해주세요");
		for (int i = 0; i < 3; i++) {
			String temp = sc.nextLine();
			String[] a = temp.split(" ");
			try {
				j = Integer.parseInt(a[1]);
				h = Integer.parseInt(a[2]);
			} catch (Exception e) {
				System.out.println("다시 입력하세요");
				i--;
				continue;
			}
			goods.add(new Goods(a[0], j, h));
			sum += h;
		}
		for (int i = 0; i < goods.size(); i++) {
			goods.get(i).showInfo();
		}
		System.out.println("상품의 총갯수는 " + sum + "입니다.");
		sc.close();
	}
}
