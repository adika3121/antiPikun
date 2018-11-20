package com.example.adhikadharmesta.antipikun.model;


import com.google.gson.annotations.SerializedName;


public class TaskUpdate{

	@SerializedName("updateTask")
	private UpdateTask updateTask;

	public void setUpdateTask(UpdateTask updateTask){
		this.updateTask = updateTask;
	}

	public UpdateTask getUpdateTask(){
		return updateTask;
	}

	@Override
 	public String toString(){
		return 
			"TaskUpdate{" + 
			"updateTask = '" + updateTask + '\'' + 
			"}";
		}
}