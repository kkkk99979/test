package com.javaex.problem4_03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
    	
        if("��".equals(str)){
            playApp();
        }else{
            super.execute(str);
        }
    }
    public void playApp() {
    	System.out.println("�۽���");
    }
 

    
 
    
    
    
}
