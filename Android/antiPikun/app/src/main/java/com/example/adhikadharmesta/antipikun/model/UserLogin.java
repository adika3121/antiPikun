package com.example.adhikadharmesta.antipikun.model;

import com.google.gson.annotations.SerializedName;


public class UserLogin{

	@SerializedName("success")
	private Success success;

	@SerializedName("status")
	private boolean status;

	@SerializedName("dataPengguna")
	private DataPengguna dataPengguna;

	public void setSuccess(Success success){
		this.success = success;
	}

	public Success getSuccess(){
		return success;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}

	public void setDataPengguna(DataPengguna dataPengguna){
		this.dataPengguna = dataPengguna;
	}

	public DataPengguna getDataPengguna(){
		return dataPengguna;
	}

	@Override
 	public String toString(){
		return 
			"UserLogin{" + 
			"success = '" + success + '\'' + 
			",status = '" + status + '\'' + 
			",dataPengguna = '" + dataPengguna + '\'' + 
			"}";
		}
}