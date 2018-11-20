package com.example.adhikadharmesta.antipikun.model;


import com.google.gson.annotations.SerializedName;


public class DataTask{

	@SerializedName("buatTask")
	private BuatTask buatTask;

	public void setBuatTask(BuatTask buatTask){
		this.buatTask = buatTask;
	}

	public BuatTask getBuatTask(){
		return buatTask;
	}

	@Override
 	public String toString(){
		return
			"DataTask{" +
			"buatTask = '" + buatTask + '\'' +
			"}";
		}
}