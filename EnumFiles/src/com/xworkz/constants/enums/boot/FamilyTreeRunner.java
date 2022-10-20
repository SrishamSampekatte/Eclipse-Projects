package com.xworkz.constants.enums.boot;

import com.xworkz.constants.Childrens;
import com.xworkz.constants.enums.FamilyTree;

public class FamilyTreeRunner {

	public static void main(String[] args) {
		System.out.println("Accessing data types from methods");
		
		
		FamilyTree tree=new FamilyTree ("Sunkada Laxmi Narayana","Sampekatte",1,Childrens.SL_SATHYA);
		
		tree.vamshavruksha();

	}

}
