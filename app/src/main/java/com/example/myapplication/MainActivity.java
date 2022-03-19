package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void Login(View view){
    Log.e("msg","button pressed");
        EditText username=findViewById(R.id.editUserName);
        EditText password=findViewById((R.id.editPassword));
        Log.e("Username",username.getText().toString());
        Log.e("Password",password.getText().toString());
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}