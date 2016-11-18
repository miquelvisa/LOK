package com.variables;

public class LoginData {
	
	private String[] user1 = {"krum","14041994"};
	
	public LoginData() {
	}

	public String[] getUser1() {
		return user1;
	}
	
	public int compare(String user,String pass){
		if(user1[0].equals(user)){
			if(user1[1].equals(pass)){
				return 1;
			}else{
				return 0;
			}
		}else{
			return -1;
		}
	}

}
