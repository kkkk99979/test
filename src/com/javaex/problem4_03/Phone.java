package com.javaex.problem4_03;

public class Phone {

    public void execute(String str){
        if("��ȭ".equals(str)) {
        	call();
        }else {
        	System.out.println("����");
        }
    }
    
    private void call(){
        System.out.println("��ȭ��ɽ���");
    }
}
