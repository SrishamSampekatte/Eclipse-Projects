package com.xworkz.crudop.boot;

import java.time.LocalDateTime;

import com.xworkz.crudop.dto.IplDto;
import com.xworkz.crudop.repository.IplRepository;
import com.xworkz.crudop.repository.IplTeamImpli;

public class IplRunner {

	public static void main(String[] args) {

		IplRepository repo = new IplTeamImpli();

		IplDto team1 = new IplDto();
		team1.setCreatedBy("Srisham");
		team1.setCreatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team1.setUpdatedBy("System");
		team1.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team1.setTeamName("csk");
		team1.setCaptainName("Dhoni");
		team1.setOwnerAlive(true);
		team1.setPurse(100);
		team1.setWins(121);
		team1.setDefeats(86);
		repo.iplTeam(team1);
		System.out.println(repo.total());
		//team1.showOff();
		repo.toString();

		System.out.println(" ");

		IplDto team2 = new IplDto();

		team2.setCreatedBy("Srisham");
		team2.setCreatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team2.setUpdatedBy("System");
		team2.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team2.setTeamName("Hydrabad");
		team2.setCaptainName("Williomson");
		team2.setOwnerAlive(true);
		team2.setPurse(96);
		team2.setWins(101);
		team2.setDefeats(118);
		repo.iplTeam(team2);
		System.out.println(repo.total());
		team2.showOff();

		System.out.println(" ");

		IplDto team3 = new IplDto();

		team3.setCreatedBy("Srisham");
		team3.setCreatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team3.setUpdatedBy("System");
		team3.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team3.setTeamName("Mumbai");
		team3.setCaptainName("Rohit");
		team3.setOwnerAlive(true);
		team3.setPurse(85);
		team3.setWins(129);
		team3.setDefeats(117);
		repo.iplTeam(team3);
		System.out.println(repo.total());
		team3.showOff();

		System.out.println(" ");

		IplDto team4 = new IplDto();

		team4.setCreatedBy("Srisham");
		team4.setCreatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team4.setUpdatedBy("System");
		team4.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team4.setTeamName("Gujarath");
		team4.setCaptainName("Pandya");
		team4.setOwnerAlive(true);
		team4.setPurse(96);
		team4.setWins(11);
		team4.setDefeats(3);
		repo.iplTeam(team4);
		System.out.println(repo.total());
		team4.showOff();

		System.out.println(" ");

		IplDto team5 = new IplDto();

		team5.setCreatedBy("Srisham");
		team5.setCreatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team5.setUpdatedBy("System");
		team5.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team5.setTeamName("Punjab");
		team5.setCaptainName("Rahul");
		team5.setOwnerAlive(true);
		team5.setPurse(76);
		team5.setWins(96);
		team5.setDefeats(127);
		repo.iplTeam(team5);
		System.out.println(repo.total());
		team5.showOff();

		System.out.println(" ");

		IplDto team6 = new IplDto();

		team6.setCreatedBy("Srisham");
		team6.setCreatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team6.setUpdatedBy("System");
		team6.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team6.setTeamName("RCB");
		team6.setCaptainName("Virat");
		team6.setOwnerAlive(true);
		team6.setPurse(103);
		team6.setWins(98);
		team6.setDefeats(131);
		repo.iplTeam(team6);
		System.out.println(repo.total());
		team6.showOff();

		System.out.println(" ");

		IplDto team7 = new IplDto();

		team7.setCreatedBy("Srisham");
		team7.setCreatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team7.setUpdatedBy("System");
		team7.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team7.setTeamName("Rajasthan");
		team7.setCaptainName("Samson");
		team7.setOwnerAlive(true);
		team7.setPurse(98);
		team7.setWins(107);
		team7.setDefeats(130);
		repo.iplTeam(team7);
		System.out.println(repo.total());
		team7.showOff();

		System.out.println(" ");

		IplDto team8 = new IplDto();

		team8.setCreatedBy("Srisham");
		team8.setCreatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team8.setUpdatedBy("System");
		team8.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team8.setTeamName("KKR");
		team8.setCaptainName("Gambir");
		team8.setOwnerAlive(true);
		team8.setPurse(75);
		team8.setWins(106);
		team8.setDefeats(128);
		repo.iplTeam(team8);
		System.out.println(repo.total());
		team8.showOff();

		System.out.println(" ");

		IplDto team9 = new IplDto();

		team9.setCreatedBy("Srisham");
		team9.setCreatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team9.setUpdatedBy("System");
		team9.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team9.setTeamName("Delhi");
		team9.setCaptainName("Dhawan");
		team9.setOwnerAlive(true);
		team9.setPurse(85);
		team9.setWins(101);
		team9.setDefeats(129);
		repo.iplTeam(team9);
		System.out.println(repo.total());
		team9.showOff();

		System.out.println(" ");

		IplDto team10 = new IplDto();

		team10.setCreatedBy("Srisham");
		team10.setCreatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team10.setUpdatedBy("System");
		team10.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team10.setTeamName("Lucknow");
		team10.setCaptainName("K L");
		team10.setOwnerAlive(true);
		team10.setPurse(86);
		team10.setWins(7);
		team10.setDefeats(12);
		repo.iplTeam(team10);
		System.out.println(repo.total());
		team10.showOff();

		System.out.println(" ");

		IplDto team11 = new IplDto();

		team11.setCreatedBy("Srisham");
		team11.setCreatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team11.setUpdatedBy("System");
		team11.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 9, 44));
		team11.setTeamName("cs");
		team11.setCaptainName("Dhoni");
		team11.setOwnerAlive(true);
		team11.setPurse(100);
		team11.setWins(121);
		team11.setDefeats(107);
		repo.iplTeam(team11);
		System.out.println(repo.total());

	}

}
