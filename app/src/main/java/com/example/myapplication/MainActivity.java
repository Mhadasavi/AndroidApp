package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Login(View view){
    Log.e("msg","button pressed");
        EditText username=findViewById(R.id.editUserName);
        EditText password=findViewById((R.id.editPassword));
        Log.e("Username",username.getText().toString());
        Log.e("Password",password.getText().toString());
        String msg="Hi "+username.getText().toString();
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
}
    ImageView imageView;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(findViewById(R.id.imageView));
        btn=findViewById(R.id.loginButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.android);
            }
        });
    }
}