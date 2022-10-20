package com.xworkz.constants;

public enum Type {
		GENERAL(4,150),SLEEPER(6,225),AC(9,350);
	
		public int no;
		public int price;
		
		
		private Type(int no,int price) {
			this.no=no;
			this.price=price;
		}

}
