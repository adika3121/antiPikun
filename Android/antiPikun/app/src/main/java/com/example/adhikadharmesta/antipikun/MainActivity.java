package com.example.adhikadharmesta.antipikun;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.adhikadharmesta.antipikun.API.APIClient;
import com.example.adhikadharmesta.antipikun.API.APIService;

public class MainActivity extends AppCompatActivity {

    protected TextView nama_pengguna, email_pengguna;

    APIService service;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        service = APIClient.getService();

        nama_pengguna = findViewById(R.id.nama_pengguna);
        email_pengguna = findViewById(R.id.email_pengguna);



        SharedPreferences sharedPreferences = getSharedPreferences("dataPengguna", MODE_PRIVATE);
        Boolean status_login = sharedPreferences.getBoolean("status_login",false);
        String nama_user = sharedPreferences.getString("nama_user","");
        String email_user = sharedPreferences.getString("email_user", "");

        nama_pengguna.setText(nama_user);
        email_pengguna.setText(email_user);


    }
}
