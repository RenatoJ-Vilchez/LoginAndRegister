package com.example.loginandregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    Note that MainActivity should be treated as the choices activity of the project folder

    private Button loginButton,
            registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.loginButton);

//        Login Button is set to be found through findViewById
        registerButton = (Button) findViewById(R.id.registerButton);

//        Register Button is set to be found through findViewById

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Login button has been clicked", Toast.LENGTH_SHORT).show();
            }
        });
//Since the login button will require the use of a database, for this puprose of the project, we will leave a message to the user
// that indicates that the button they are pressing works
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
                finish();
            }
        });
    }
}