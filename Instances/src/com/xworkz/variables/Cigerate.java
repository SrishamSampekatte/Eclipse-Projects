package com.xworkz.variables;

public class Cigerate {
	public String brand;
	public String name;
	public double size;
	public String availabe;
	public boolean healthy;
	public String[] brands;
	public String[] bestCmbo;
	public int[] sizes ;
	public String[] colors;
	public String[] Smokepartners;
	public double[]radius;
	
	
	
	public Cigerate(String brand,String name,double size,String available,boolean healthy,String[]brands,String[]bestCombo,int[] sizes,String[] colors,String[] Smokepartners,double[]radius)
	{
		this.brand=brand;
		this.name=name;
		this.size=size;
		this.availabe=available;
		this.healthy=healthy;
		this.brands=brands;
		this.bestCmbo=bestCombo;
		this.sizes=sizes;
		this.colors=colors;
		this.Smokepartners=Smokepartners;
		this.radius=radius;
		
	}
	 
		public void Display() 
		{
			System.out.println(this.brand);
			System.out.println(this.name);
			System.out.println(this.size);
			System.out.println(this.availabe);
			System.out.println(this.healthy);
			
			for (int i = 0; i < brands.length; i++) {
				String string = brands[i];
				System.out.println(string);
			}
			
			for (int i = 0; i < bestCmbo.length; i++) {
				String string = bestCmbo[i];
				System.out.println(string);
				
			}
			
			for (int i = 0; i < sizes.length; i++) {
				int string = sizes[i];
				System.out.println(string);
			}
			
			for (int i = 0; i < colors.length; i++) {
				String string = colors[i];
				System.out.println(string);
			}
			for (int i = 0; i < Smokepartners.length; i++) {
				String string = Smokepartners[i];
				System.out.println(string);
			}
			
			for (int i = 0; i < radius.length; i++) {
				double string = radius[i];
				System.out.println(string);
			}
			
		}

}
