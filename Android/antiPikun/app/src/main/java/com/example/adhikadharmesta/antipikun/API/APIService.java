package com.example.adhikadharmesta.antipikun.API;

import com.example.adhikadharmesta.antipikun.model.DataTask;
import com.example.adhikadharmesta.antipikun.model.LihatTask;
import com.example.adhikadharmesta.antipikun.model.TaskDelete;
import com.example.adhikadharmesta.antipikun.model.TaskUpdate;
import com.example.adhikadharmesta.antipikun.model.User;
import com.example.adhikadharmesta.antipikun.model.UserLogin;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIService {

    @FormUrlEncoded
    @POST("register")
    Call<User> saveRegisterPost(@Field("name") String name,
                                @Field("email") String email,
                                @Field("password") String password,
                                @Field("c_password") String c_password
                        );

    @FormUrlEncoded
    @POST("login")
    Call<UserLogin> loginPost(@Field("email") String email,
                              @Field("password") String password
                              );

    @FormUrlEncoded
    @POST("create_task")
    Call<DataTask> createTask(@Field("id_user") String id_user,
                              @Field("nama_task") String nama_task,
                              @Field("deskripsi") String deskripsi,
                              @Field("tanggal_deadline") String tanggal_deadline,
                              @Field("waktu_deadline") int waktu_deadline,
                              @Field("repeat") String repeat,
                              @Field("repeat_number") int repeat_number,
                              @Field("repeat_type") String repeat_type,
                              @Field("status") String status
    );

    @GET("see_task/{id}")
    Call<LihatTask> showDataTaskByUser(@Path("id") int id_user);

    @FormUrlEncoded
    @POST("update_task/{id_task}")
    Call<TaskUpdate> updateDataTask(@Path("id_task") int id_task,
                                    @Field("nama_task") String nama_task,
                                    @Field("deskripsi") String deskripsi,
                                    @Field("tanggal_deadline") String tanggal_deadline,
                                    @Field("waktu_deadline") int waktu_deadline,
                                    @Field("repeat") String repeat,
                                    @Field("repeat_number") int repeat_number,
                                    @Field("repeat_type") String repeat_type,
                                    @Field("status") String status
    );

    @DELETE("delete_task/{id_task}")
    Call<TaskDelete> deleteDataTask(@Path("id_task") int id_task);



}
