package com.simplescript;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by Nypro on 1/8/2016.
 */
public class Parser
{

	public static void parseSource(String filePathString) throws IOException
	{
		Path filePath = Paths.get(filePathString);
		try (Scanner inFile = new Scanner (filePath, "UTF-8"))
		{
			//
		}
		catch(FileNotFoundException fnfe)
		{
			System.err.println("File not found dude!\nCheck under the bed");
			fnfe.printStackTrace();
		}
	}
}
