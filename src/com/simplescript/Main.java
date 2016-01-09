package com.simplescript;


import java.util.Scanner;

// 08/01/16 Nypro
public class Main {
	public static void main(String[] args)
	{
		System.out.print("Enter a valid file path: ");

		Scanner filePath = new Scanner(System.in); // Scanner object used to get filePath from console

		String input = filePath.nextLine();

		Parser.parseSource(input); // The filePath leads to the source file that the Parser class parses

    }
}
