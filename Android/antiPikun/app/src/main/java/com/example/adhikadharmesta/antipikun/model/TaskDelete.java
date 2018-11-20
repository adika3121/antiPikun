package com.example.adhikadharmesta.antipikun.model;


import com.google.gson.annotations.SerializedName;


public class TaskDelete{

	@SerializedName("dataDeleteTask")
	private DataDeleteTask dataDeleteTask;

	@SerializedName("deleteTask")
	private String deleteTask;

	public void setDataDeleteTask(DataDeleteTask dataDeleteTask){
		this.dataDeleteTask = dataDeleteTask;
	}

	public DataDeleteTask getDataDeleteTask(){
		return dataDeleteTask;
	}

	public void setDeleteTask(String deleteTask){
		this.deleteTask = deleteTask;
	}

	public String getDeleteTask(){
		return deleteTask;
	}

	@Override
 	public String toString(){
		return 
			"TaskDelete{" + 
			"dataDeleteTask = '" + dataDeleteTask + '\'' + 
			",deleteTask = '" + deleteTask + '\'' + 
			"}";
		}
}