package com.xworkz.variables;

public class Book {
	public String authorName;
	public String[] color;
	public int[] price;
	public int[] noOfPages;
	public boolean knowladge;
	public String[] types;
	public String[] publications;
	public int[] noOfChapters;
	public boolean barcode;
	
	public Book(String authorName,String[] color,int[] price,int[] noOfPages,boolean knowladge,String[] types,String[] publications,int[] noOfChapters,boolean barcode){
		this.authorName=authorName;
		this.color=color;
		this.price=price;
		this.noOfPages=noOfPages;
		this.knowladge=knowladge;
		this.types=types;
		this.noOfChapters=noOfChapters;
		this.publications= publications;
		this.barcode=barcode;
	}
		public void display() {
			System.out.println(this.authorName);
			System.out.println(this.knowladge);
			System.out.println(this.barcode);
		
			
			for (int i = 0; i < color.length; i++) {
				String string = color[i];
				System.out.println(string);
			}
			for (int i = 0; i < price.length; i++) {
				int string = price[i];
				System.out.println(string);
			}
			for (int i = 0; i < noOfPages.length; i++) {
				int string = noOfPages[i];
				System.out.println(string);
			}
			for (int i = 0; i < types.length; i++) {
				String string = types[i];
				System.out.println(string);
			}
			for (int i = 0; i < publications.length; i++) {
				String string = publications[i];
				System.out.println(string);
			}
			for (int i = 0; i <  noOfChapters.length; i++) {
				int string =  noOfChapters[i];
				System.out.println(string);
			}
		}

}
