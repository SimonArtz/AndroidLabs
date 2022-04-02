package com.cst2355.artz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.CompoundButton;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity{

    Context context = MainActivity.this;
    String emT;
    EditText em, pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        SharedPreferences sharedPref = context.getSharedPreferences("emailFile", Context.MODE_PRIVATE);
        String defaultEmail = "";
        emT = sharedPref.getString("Email", defaultEmail);
        login = (Button) findViewById(R.id.loginButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewActivity();
            }
        });
    }

    public void openNewActivity(){
        Intent intent = new Intent(this, ChatRoomActivity.class);
        startActivity(intent);
    }

    public void toastMSG(String str) {
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();
    }

    public void toastView(View view) {
        String str = MainActivity.this.getResources().getString(R.string.toastText);
        this.toastMSG(str);
    }
}