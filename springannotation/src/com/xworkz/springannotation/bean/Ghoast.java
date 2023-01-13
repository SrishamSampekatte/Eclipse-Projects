package com.xworkz.springannotation.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghoast {
	private String ghostName;
	private String ghostLastName;
	private int ghostAge;
	private LocalDate deathDate;
	private String ghostLocation;
	private boolean isScary;
	private String ghostFriendName;
	private String ghostFavFood;
	private String ghostFavSports;
	private String gender;
	@Autowired
	@Qualifier("ghostFullName")
	private String ghostFullName;
	@Autowired
	@Qualifier("since")
	private int since;
	@Autowired
	@Qualifier("hasLover")
	private boolean hasLover;
	@Autowired
	@Qualifier("numberOfLegs")
	private int numberOfLegs;
	@Autowired
	@Qualifier("isSucide")
	private boolean isSucide;
	@Autowired
	@Qualifier("bad")
	private boolean bad;
	@Autowired
	@Qualifier("good")
	private boolean good;
	@Autowired
	@Qualifier("weight")
	private double weight;
	@Autowired
	@Qualifier("thin")
	private boolean thin;
	@Autowired
	@Qualifier("fat")
	private boolean fat;

	@Autowired
	public Ghoast(@Qualifier("ghostName") String ghostName, @Qualifier("ghostLastName") String ghostLastName,
			@Qualifier("ghostAge") int ghostAge, @Qualifier("deathDate") LocalDate deathDate,
			@Qualifier("ghostLocation") String ghostLocation, @Qualifier("isScary") boolean isScary,
			@Qualifier("ghostFriendName") String ghostFriendName, @Qualifier("ghostFavFood") String ghostFavFood,
			@Qualifier("ghostFavSports") String ghostFavSports, @Qualifier("gender") String gender) {
		super();
		this.ghostName = ghostName;
		this.ghostLastName = ghostLastName;
		this.ghostAge = ghostAge;
		this.deathDate = deathDate;
		this.ghostLocation = ghostLocation;
		this.isScary = isScary;
		this.ghostFriendName = ghostFriendName;
		this.ghostFavFood = ghostFavFood;
		this.ghostFavSports = ghostFavSports;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Ghoast [ghostName=" + ghostName + ", ghostLastName=" + ghostLastName + ", ghostAge=" + ghostAge
				+ ", deathDate=" + deathDate + ", ghostLocation=" + ghostLocation + ", isScary=" + isScary
				+ ", ghostFriendName=" + ghostFriendName + ", ghostFavFood=" + ghostFavFood + ", ghostFavSports="
				+ ghostFavSports + ", gender=" + gender + ", ghostFullName=" + ghostFullName + ", since=" + since
				+ ", hasLover=" + hasLover + ", numberLegs=" + numberOfLegs + ", isSucide=" + isSucide + ", bad=" + bad
				+ ", good=" + good + ", weight=" + weight + ", thin=" + thin + ", fat=" + fat + "]";
	}

}
