package com.example.android.ikewahyuningwulandari_1202154360_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SigninActivity extends AppCompatActivity {
    EditText username, password;
    Button masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        username = (EditText)findViewById(R.id.user);
        password = (EditText)findViewById(R.id.pass);
        masuk = (Button)findViewById(R.id.button);

    }
    public void login(View view) {
        String userkey = username.getText().toString();
        String passkey = password.getText().toString();

        if (userkey.equals("EAD") && passkey.equals("MOBILE")) {
            Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(SigninActivity.this, AirActivity.class);
            SigninActivity.this.startActivity(intent);


        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(SigninActivity.this);
            builder.setMessage("Username atau Password anda salah.....!").setNegativeButton("Retry...", null).create().show();
        }
    }
}
