package com.day02;

public class SwitchString {
    
    public static void main(String[] args){
        String name = "te";

		switch (name.toLowerCase()) 
		{
		case "author":
			System.out.println("Vikas");
			break;
		case "team":
			System.out.println("Team Java Full Stack");
			break;
		case "editor":
			System.out.println("Vishnu & Krishna");
			break;
		default:
			System.out.println("Invalid entry");
			break;
	}

    }
}
