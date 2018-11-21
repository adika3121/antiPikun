package com.example.adhikadharmesta.antipikun.model;


import com.google.gson.annotations.SerializedName;


public class UserUpdate{

	@SerializedName("updateUser")
	private UpdateUser updateUser;

	public void setUpdateUser(UpdateUser updateUser){
		this.updateUser = updateUser;
	}

	public UpdateUser getUpdateUser(){
		return updateUser;
	}

	@Override
 	public String toString(){
		return 
			"UserUpdate{" + 
			"updateUser = '" + updateUser + '\'' + 
			"}";
		}
}