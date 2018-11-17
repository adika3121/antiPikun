package com.example.adhikadharmesta.antipikun.model;


import com.google.gson.annotations.SerializedName;


public class Success{

	@SerializedName("token")
	private String token;

	public void setToken(String token){
		this.token = token;
	}

	public String getToken(){
		return token;
	}

	@Override
 	public String toString(){
		return 
			"Success{" + 
			"token = '" + token + '\'' + 
			"}";
		}
}