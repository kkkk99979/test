package com.javaex.problem5_01;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int j;
		int i;
		while (true) {
			System.out.print(">> ");
			String name = sc.nextLine();
			String[] a = name.split(" ");
			if (a[0].equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}
			try {
				i = Integer.parseInt(a[0]);
				j = Integer.parseInt(a[2]);
			} catch (Exception e) {
				System.out.println("알 수 없는 수입니다.");
				continue;
			}
			switch (a[1]) {
			case "+": {
				Add temp = new Add();
				temp.setValue(i, j);
				System.out.println(">> " + temp.calculate());
				break;
			}
			case "-": {
				Sub temp = new Sub();
				temp.setValue(i, j);
				System.out.println(">> " + temp.calculate());
				break;
			}
			case "*": {
				Mul temp = new Mul();
				temp.setValue(i, j);
				System.out.println(">> " + temp.calculate());
				break;
			}
			case "/": {
				if (j == 0) {
					System.out.println("0으로 나눌수는 없습니다.");
					break;
				}
				Div temp = new Div();
				temp.setValue(i, j);
				System.out.println(">> " + temp.calculate());
				break;
			}
			default: {
				System.out.println("알 수 없는 연산기호입니다.");
			}
			}
		}
		sc.close();
	}
}