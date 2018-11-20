package com.example.adhikadharmesta.antipikun.model;


import com.google.gson.annotations.SerializedName;


public class DataDeleteTask{

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("repeat_type")
	private String repeatType;

	@SerializedName("repeat")
	private String repeat;

	@SerializedName("active")
	private String active;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id_task")
	private int idTask;

	@SerializedName("nama_task")
	private String namaTask;

	@SerializedName("id_user")
	private int idUser;

	@SerializedName("deskripsi")
	private String deskripsi;

	@SerializedName("repeat_number")
	private int repeatNumber;

	@SerializedName("tanggal_deadline")
	private String tanggalDeadline;

	@SerializedName("waktu_deadline")
	private String waktuDeadline;

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setRepeatType(String repeatType){
		this.repeatType = repeatType;
	}

	public String getRepeatType(){
		return repeatType;
	}

	public void setRepeat(String repeat){
		this.repeat = repeat;
	}

	public String getRepeat(){
		return repeat;
	}

	public void setActive(String active){
		this.active = active;
	}

	public String getActive(){
		return active;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setIdTask(int idTask){
		this.idTask = idTask;
	}

	public int getIdTask(){
		return idTask;
	}

	public void setNamaTask(String namaTask){
		this.namaTask = namaTask;
	}

	public String getNamaTask(){
		return namaTask;
	}

	public void setIdUser(int idUser){
		this.idUser = idUser;
	}

	public int getIdUser(){
		return idUser;
	}

	public void setDeskripsi(String deskripsi){
		this.deskripsi = deskripsi;
	}

	public String getDeskripsi(){
		return deskripsi;
	}

	public void setRepeatNumber(int repeatNumber){
		this.repeatNumber = repeatNumber;
	}

	public int getRepeatNumber(){
		return repeatNumber;
	}

	public void setTanggalDeadline(String tanggalDeadline){
		this.tanggalDeadline = tanggalDeadline;
	}

	public String getTanggalDeadline(){
		return tanggalDeadline;
	}

	public void setWaktuDeadline(String waktuDeadline){
		this.waktuDeadline = waktuDeadline;
	}

	public String getWaktuDeadline(){
		return waktuDeadline;
	}

	@Override
 	public String toString(){
		return 
			"DataDeleteTask{" + 
			"updated_at = '" + updatedAt + '\'' + 
			",repeat_type = '" + repeatType + '\'' + 
			",repeat = '" + repeat + '\'' + 
			",active = '" + active + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",id_task = '" + idTask + '\'' + 
			",nama_task = '" + namaTask + '\'' + 
			",id_user = '" + idUser + '\'' + 
			",deskripsi = '" + deskripsi + '\'' + 
			",repeat_number = '" + repeatNumber + '\'' + 
			",tanggal_deadline = '" + tanggalDeadline + '\'' + 
			",waktu_deadline = '" + waktuDeadline + '\'' + 
			"}";
		}
}