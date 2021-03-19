package com.javaex.problem5_04;

import java.util.ArrayList;


public class ShapeApp{

	public static void main(String[] args) {
		ArrayList<Object> list = new  ArrayList<Object>();
		Shape r = new Rectangle(6,5);
		Shape t = new RectTriangle(2,6);
		list.add(r);
		list.add(t);
		for (int i =0 ;i<list.size();i++) {
			if(list.get(i) instanceof Rectangle) {
			}
			System.out.println("Area:"+((Rectangle) list.get(i)).getArea());
			System.out.println("Perimeter:"+((Rectangle) list.get(i)).getPerimeter());
		}
	}
	}


