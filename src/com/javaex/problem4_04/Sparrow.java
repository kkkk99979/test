package com.javaex.problem4_04;

public class Sparrow extends Bird {
	public void sing() {
		System.out.printf("����(%s)�� �Ҹ����� ��ϴ�.\n",super.getName());
	}
	public void fly() {
		System.out.printf("����(%s)�� ���� �ٴմϴ�.\n",super.getName());
	}
	public void showName() {
		System.out.printf("������ �̸��� %s �Դϴ�.\n",super.getName());
	}

}
