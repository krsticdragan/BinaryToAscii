public class App {
    static byte[] inputByte = new byte[] {0b01100001,0b01100001,0b01100001,0b01100001};
    static String inputString = "aaaa";
    static byte[] outputByte = new byte[inputString.length()];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryToAscii bta = new BinaryToAscii();
		System.out.println(bta.binaryToString(inputByte));
		System.out.println(bta.stringToBinary(inputString));
	}
}
