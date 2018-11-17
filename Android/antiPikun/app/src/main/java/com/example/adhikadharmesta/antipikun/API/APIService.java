package com.example.adhikadharmesta.antipikun.API;

import com.example.adhikadharmesta.antipikun.model.User;
import com.example.adhikadharmesta.antipikun.model.UserLogin;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

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


}
