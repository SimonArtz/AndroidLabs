package com.cst2355.artz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.CompoundButton;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText em, pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Context context = MainActivity.this;
        SharedPreferences sharedPref = context.getSharedPreferences("emailFile", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        em = (EditText) findViewById(R.id.emailText);
        String emT = em.getText().toString();
        editor.putString("Email", emT);
        editor.commit();
    }

    public void toastMSG(String str) {
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();
    }

    public void toastView(View view) {
        String str = MainActivity.this.getResources().getString(R.string.toastText);
        this.toastMSG(str);
    }
}