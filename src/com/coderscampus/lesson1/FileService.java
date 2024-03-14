package com.coderscampus.lesson1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


// a defined interface is a contract. You have to outline the functionality exactluy as it is outlined in the interface when you impliment the interface.


public interface FileService {
	
	//methods have to be delcared public 
	
	//do not define body
	
	String standardFileName = "data.txt";

	String readLine (File file) throws FileNotFoundException, IOException;
	
	void writeLine(File file, String line);
	
	
} 
