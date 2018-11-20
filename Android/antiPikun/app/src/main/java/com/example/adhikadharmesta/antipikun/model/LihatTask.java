package com.example.adhikadharmesta.antipikun.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class LihatTask{

	@SerializedName("lihatTask")
	private List<LihatTaskItem> lihatTask;

	public void setLihatTask(List<LihatTaskItem> lihatTask){
		this.lihatTask = lihatTask;
	}

	public List<LihatTaskItem> getLihatTask(){
		return lihatTask;
	}

	@Override
 	public String toString(){
		return 
			"LihatTask{" + 
			"lihatTask = '" + lihatTask + '\'' + 
			"}";
		}
}