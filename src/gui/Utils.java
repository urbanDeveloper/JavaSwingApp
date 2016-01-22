package gui;

public class Utils {
	public static String getFileExtention(String name){
		
		int pointIndex = name.lastIndexOf(".");
		
		if(pointIndex == -1){
			return null;
		}
		
		// if the file extention got a dot in the end then return null else
		if(pointIndex == name.length()-1){
			return null;
		}
		// return first character of the string and the last character in the end.
		return name.substring(pointIndex+1, name.length());
	}

}
