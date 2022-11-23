package com.xworkz.equal.thing;

public class Institution {
	private String name;
	private String type;
	private long fees;
	private int totalStaffs;
	private String batch;
	private String ownerName;
	private String location;
	private long totalRevenue;
	private boolean rating;
	private int totalBranches;

	public Institution(String name, String type, long fees, int totalStaffs, String batch, String principalName,
			String location, long totalRevenue, boolean rating, int totalBranches) {
		super();
		this.name = name;
		this.type = type;
		this.fees = fees;
		this.totalStaffs = totalStaffs;
		this.batch=batch;
		this.ownerName = principalName;
		this.location = location;
		this.totalRevenue = totalRevenue;
		this.rating = rating;
		this.totalBranches = totalBranches;
	}

	@Override
	public String toString() {
		return "Institution [name=" + name + ", type=" + type + ", fees=" + fees + ", totalStaffs=" + totalStaffs
				+ ", batch=" + batch + ", Name=" + ownerName + ", location=" + location + ", totalRevenue="
				+ totalRevenue + ", rating=" + rating + ", totalBranches=" + totalBranches + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Institution) {
			Institution institution3=(Institution)obj;
			System.out.println("obj is instance of institution");
			if (this.ownerName.equals(institution3.ownerName) && this.type.equals(institution3.type)&& this.location.equals(institution3.location) ) {
				System.out.println("same");
				return true;
			} else {
				System.err.println(" not same ");
				return false;
			}
		} else {
			System.err.println("can not check");
		}

		return false;


	}

}
