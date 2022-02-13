package com.cst2355.artz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.CompoundButton;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);
    }

    public void toastMSG(String str) {
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();
    }

    public void toastView(View view) {
        String str = MainActivity.this.getResources().getString(R.string.toastText);
        this.toastMSG(str);
    }
}