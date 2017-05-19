package com.example.sakshi.loginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail, pass;
                mail=email.getText().toString();
                pass=password.getText().toString();
                String id="bansalsanchi77.sb@gmail.com";    //actual email id
                String password="hello";                    //password
                if(mail.equals(id) && pass.equals(password)){
                    Intent i= new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(i);
                }else if(mail.equals(id) && !pass.equals(password)){
                    Toast.makeText(MainActivity.this, "password does not match", Toast.LENGTH_SHORT).show();
                }else if(!mail.equals(id) && pass.equals(password)) {
                    Toast.makeText(MainActivity.this, "check your Email Id", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "check your credentials once again", Toast.LENGTH_SHORT).show();
                }
                }
        });
    }
}
