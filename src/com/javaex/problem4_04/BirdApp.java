package com.javaex.problem4_04;

public class BirdApp {

    public static void main(String[] args) {
        Bird bird01 = new Duck();
        bird01.setName("�в���");
        bird01.fly();
        bird01.sing();
        bird01.showName();

        Bird bird02 = new Sparrow();
        bird02.setName("±±��");
        bird02.fly();
        bird02.sing();
        bird02.showName();
        
    }

		
	
    
}
