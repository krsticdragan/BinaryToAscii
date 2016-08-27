package model;

import java.nio.charset.Charset;

public class BinaryToAscii {
	
	public BinaryToAscii() {

	}
	
	public String binaryToString(byte[] input) {
		String output = "";
		for(int i=0;i<input.length;i++) {
			output += (char) Integer.parseInt(String.valueOf(input[i]));
		}
		return output;
	}
	
	public byte[] stringToBinary(String input) {
		return input.getBytes();
	}

}
