package com.example.adhikadharmesta.antipikun;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adhikadharmesta.antipikun.API.APIClient;
import com.example.adhikadharmesta.antipikun.API.APIService;
import com.example.adhikadharmesta.antipikun.model.UserLogin;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    protected EditText etEmail, etPassword;
    protected Button btn_login;
    protected TextView btn_daftar;

    APIService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        service = APIClient.getService();

        etEmail = findViewById(R.id.emailLogin);
        etPassword = findViewById(R.id.passwordLogin);
        btn_login=findViewById(R.id.btn_login);
        btn_daftar=findViewById(R.id.daftar);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etEmail.getText().toString();
                String password= etPassword.getText().toString();

                service.loginPost(email, password)
                        .enqueue(new Callback<UserLogin>() {
                            @Override
                            public void onResponse(Call<UserLogin> call, Response<UserLogin> response) {
                                if (response.isSuccessful()){
                                    Toast.makeText(LoginActivity.this,"Sukses",Toast.LENGTH_LONG).show();

                                    SharedPreferences sharedPreferences = getSharedPreferences("dataPengguna", MODE_PRIVATE);
                                    final String nama = ".....";
                                    final String email = "......";

                                    SharedPreferences.Editor editor = sharedPreferences.edit();
                                    editor.putString(nama, "Adhika");
                                    editor.putString(email, "sebastian@gmail.com");
                                    editor.putBoolean("status_login", response.body().isStatus());
                                    editor.putString("nama_user", String.valueOf(response.body().getDataPengguna().getName()));
                                    editor.putString("email_user", String.valueOf(response.body().getDataPengguna().getEmail()));
                                    editor.apply();

                                    Intent tampilanUtama = new Intent(getApplicationContext(),MainActivity.class);
                                    startActivity(tampilanUtama);
                                    finish();

                                }
                                else {
                                    Toast.makeText(LoginActivity.this,"Gagal ada masalah pengisian",Toast.LENGTH_LONG).show();
                                }
                            }

                            @Override
                            public void onFailure(Call<UserLogin> call, Throwable t) {
                                Toast.makeText(LoginActivity.this,"Gagal"+t,Toast.LENGTH_LONG).show();
                            }
                        });
            }
        });

        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inDaftar = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(inDaftar);
            }
        });
    }
}
