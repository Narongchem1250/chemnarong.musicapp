package com.chemnarong.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {
    private EditText EmailAddress;
    private EditText Password;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EmailAddress = findViewById(R.id.txtEmailAddress);
        Password = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnloginlayout);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = EmailAddress.getText().toString();
                String Pass = Password.getText().toString();
                if (Email.isEmpty()) {
                    EmailAddress.setError("Please enter email");
                } else {
                    if (Pass.isEmpty()) {
                        Password.setError("Please enter password");
                    } else {
                        // Perform login logic here
                        // Check if the username and password are valid
                        // and navigate to the appropriate screen
                        Intent intent = new Intent(login.this, home.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}