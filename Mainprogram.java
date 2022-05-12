package com.area;

import org.openqa.selenium.Rectangle;

public class Mainprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle1();
        
        obj.Area(30, 20);
        obj.Area(12.5, 4.5);
        
        Circle obj1 = new Circle();
        obj1.Area(3);
        obj1.Area(5.5);
        
        Square obj2 = new Square();
        obj2.Area(20);
        obj2.Area(5.2);

	}

	}


