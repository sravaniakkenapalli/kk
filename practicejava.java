package javaproject;

import java.util.Scanner;

public class practicejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i= 5;
		//System.out.println(i);
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your name");
		String name = sc.nextLine();
		System.out.println("Hello "+name);
		System.out.println("What is  your age");
		int age = sc.nextInt();
		System.out.println("Your age is" +age
				);
		sc.close();

	}

}
