package com.xworkz.constants.things;
import com.xworkz.constants.things.association.Company;
import com.xworkz.constants.Shape;

public class Pillar {
	public int id;
	public String place;
	public Shape shape;
	public double height;
	public boolean supporting;
	public Company company 
	=new Company("Larsen &Turbo","Construction");
	
	
	
	
	public Pillar(int id, String place,double height, boolean supporting) {
		super();
		this.id = id;
		this.place = place;
		
		this.height = height;
		this.supporting = supporting;
		
		
	}
	public void showOff() {
		System.out.println(this.id);
		System.out.println(this.place);
		System.out.println(Shape.CYLINDRICAL);
		System.out.println(this.height);
		System.out.println(this.supporting);
		
		
		company.showOff();
		
	
	}

}
