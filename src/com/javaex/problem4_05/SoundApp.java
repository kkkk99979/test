package com.javaex.problem4_05;

public class SoundApp {

	public static void main(String[] args) {
		printsound(new Cat());
		printsound(new Dog());
		printsound(new Sparrow());
		printsound(new Duck());
	}

	public static void printsound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
}