package com.Xworkz.power.boot;
import com.Xworkz.power.Song;

public class SongRunner {

	public static void main(String[] args) {
		Song music=new Song();
		System.out.println(music.name);
		System.out.println(music.lang);
		System.out.println(music.singer);
		System.out.println(music.lyricst);
		System.out.println(music.type);
		
		music.name="Singara siriye";
		music.lang="kannada";
		music.singer="V P";
		music.lyricst="Ajaneesh";
		music.type="Melody";
		System.out.println("Song name is :"+music.name);
		System.out.println("Language is "+music.lang);
		System.out.println("Singer is "+music.singer);
		System.out.println("Written by "+music.lyricst);
		System.out.println("it is "+music.type);

	}

}
