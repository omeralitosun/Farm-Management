package com.farmmanagement.springbootfarmerproject.helpers;

public final class CreatId {
	private static String[] characters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","R","S","T","W","V","Y","Z","1","2","3","4","5","6","7","8","9","0"};
	
	public static String creatRandomId() {
		String id ="";
		for(int i= 0;i<16;i++) {
			int random = (int)(Math.random()*characters.length);
			id=id+characters[random];
		}
		return id;
	}
}
