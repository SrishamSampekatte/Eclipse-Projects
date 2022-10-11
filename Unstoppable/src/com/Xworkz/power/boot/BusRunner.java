package com.Xworkz.power.boot;
import com.Xworkz.power.Bus;
public class BusRunner {

	public static void main(String[] args)
	{
    Bus busRoute=new Bus();
    
    System.out.println(busRoute.no);
    System.out.println(busRoute.starting);
    System.out.println(busRoute.destination);
    
    busRoute.no="KA 42F 1391";
    busRoute.starting="Kollur";
    busRoute.destination="Chintamani";
    
    System.out.println("Bus Number is "+ busRoute.no);
    System.out.println("Starting point of Bus is "+busRoute.starting);
    System.out.println("End point of Bus is "+busRoute.destination);
    
   
	}
}
