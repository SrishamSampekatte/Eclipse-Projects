package com.xworkz.springannotation.bean;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyWish {
	@Autowired
	@Qualifier("myName")
	private String name;
	@Autowired
	@Qualifier("myAge")
	private byte age;
	@Autowired
	@Qualifier("myHeight")
	private short height;
	@Autowired
	@Qualifier("myPinCode")
	private int pincode;
	@Autowired
	@Qualifier("myMobileNo")
	private long mobileNo;
	@Autowired
	@Qualifier("myWeight")
	private float weight;
	@Autowired
	@Qualifier("myPocketMoney")
	private double pocketMoney;
	@Autowired
	@Qualifier("myShirtSize")
	private char shirtSize;
	@Autowired
	@Qualifier("isCommitted")
	private boolean committed;
	
	//private LocalDate specialDate;

	public MyWish() {
		System.out.println("My Code My data");
	}

	@Override
	public String toString() {
		return "MyWish [name=" + name + ", age=" + age + ", height=" + height + ", pincode=" + pincode + ", mobileNo="
				+ mobileNo + ", weight=" + weight + ", pocketMoney=" + pocketMoney + ", shirtSize=" + shirtSize
				+ ", committed=" + committed + "]";
	}

}
