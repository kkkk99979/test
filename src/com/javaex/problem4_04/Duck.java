package com.javaex.problem4_04;

public class Duck extends Bird {

    public void sing() {
    	System.out.printf("����(%s)�� �Ҹ����� ��ϴ�.\n",super.getName());
    }

    public void fly() {
    	System.out.printf("����(%s)�� ���� �ʽ��ϴ�.\n",super.getName());
    }
    
    public void showName() {
    	System.out.printf("������ �̸��� %s �Դϴ�.\n",super.getName());
    }

}
