package com.xworkz.variables.boot;

import com.xworkz.variables.Book;

public class BookRunner {

	public static void main(String[] args) {
		String[] color={"white","red","blue","black","grey","silver"};
		int[] price={700,750,800,850,900,950};
		int[] noOfPages = {400,450,560,510,580,600,720};
		String[] types= {"story","songs","cooking","jokes","syllabus","general knowladge"};
		String[] publications= {"jeevit","NCERT","akash","sudha","chitanya"};
		int[]  noOfChapters= {8,9,10,13,14,15,20};
		
		
		Book book=new Book("kuvempu",color,price,noOfPages,true,types,publications,noOfChapters,true);
		book.display();

	}

}
