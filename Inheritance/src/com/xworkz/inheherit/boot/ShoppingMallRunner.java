package com.xworkz.inheherit.boot;

import com.xworkz.inheherit.child.OrionMall;
import com.xworkz.inheherit.thing.ShoppingMall;

public class ShoppingMallRunner {

	public static void main(String[] args) {
		ShoppingMall mall=new ShoppingMall("Bangalore ",59, 577452);
		mall.display();
		
		OrionMall oreo=new OrionMall("Srirampura",59,577418,8975985);
		oreo.display();

	}

}

