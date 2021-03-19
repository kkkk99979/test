package com.javaex.problem5_02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Friend> info = new ArrayList<Friend>();
		System.out.println("친구를 3명 등록해주세요");
		for (int i = 0; i < 3; i++) {
			String temp = sc.nextLine();
			String[] a = temp.split(" ");
			info.add(new Friend(a[0], a[1], a[2]));
		}
		for (int i = 0; i < info.size(); i++) {
			(info.get(i)).showInfo();
		}
		sc.close();
	}
}
