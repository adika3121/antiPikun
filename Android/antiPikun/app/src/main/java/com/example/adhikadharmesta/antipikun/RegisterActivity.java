package com.example.adhikadharmesta.antipikun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.adhikadharmesta.antipikun.API.APIClient;
import com.example.adhikadharmesta.antipikun.API.APIService;
import com.example.adhikadharmesta.antipikun.model.User;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    protected EditText etName, etEmail, etPassword, etC_Password;
    protected Button btn_register;

    APIService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        service = APIClient.getService();

        etName = findViewById(R.id.Nama);
        etEmail = findViewById(R.id.email);
        etPassword = findViewById(R.id.password);
        etC_Password = findViewById(R.id.c_password);
        btn_register = findViewById(R.id.btn_register);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //user pengguna = new user(
                  String name = etName.getText().toString();
                  String email = etEmail.getText().toString();
                  String password= etPassword.getText().toString();
                  String c_password = etC_Password.getText().toString();
                //);
                service.saveRegisterPost(name, email, password, c_password)
                       .enqueue(new Callback<User>() {
                           @Override
                           public void onResponse(Call<User> call, Response<User> response) {
                               if (response.isSuccessful()){
                                   Toast.makeText(RegisterActivity.this,"Sukses",Toast.LENGTH_LONG).show();
                                   Intent tampilanLogin = new Intent(getApplicationContext(),LoginActivity.class);
                                   startActivity(tampilanLogin);

                               }
                               else {
                                   Toast.makeText(RegisterActivity.this,"Gagal nyet",Toast.LENGTH_LONG).show();
                               }
                           }

                           @Override
                           public void onFailure(Call<User> call, Throwable t) {
                               Toast.makeText(RegisterActivity.this,"Gagal"+t,Toast.LENGTH_LONG).show();
                           }
                       });


            }
        });


    }
}
