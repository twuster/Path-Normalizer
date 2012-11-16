import java.io.*;
import java.util.*;

public class normalize {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> splitOut = new ArrayList<String>();
		String total = "";
		String line = "";

		System.out.println("Please input the string to be normalized");
		while((line = scanner.nextLine())!= null){
			total ="";
			splitOut = new ArrayList<String>();
			String[] splitLine= line.split("/");

			for (int i =0; i<splitLine.length; i++){
				if(splitLine[i].equals(".")){
					continue;
				}
				else if(splitLine[i].equals("..")){
					if (splitOut.size() != 0){
						splitOut.remove(splitOut.size() -1);
					}
					continue;
				}
				splitOut.add(splitLine[i]);
			}
			for (int j=0; j <splitOut.size(); j++){
				total += splitOut.get(j);
				if(j!=splitOut.size()-1){
					total += "/";
				}
			}
			System.out.println(total);
		}

	}

}
