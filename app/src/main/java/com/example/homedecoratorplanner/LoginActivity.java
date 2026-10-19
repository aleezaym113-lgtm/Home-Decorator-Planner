package com.example.homedecoratorplanner;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText email = findViewById(R.id.etEmail);
        EditText password = findViewById(R.id.etPassword);
        findViewById(R.id.btnLogin).setOnClickListener(v -> {
            if (email.getText().toString().trim().isEmpty() || password.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show();
            } else {
                startActivity(new Intent(this, HomeActivity.class));
                finish();
            }
        });
        findViewById(R.id.btnRegister).setOnClickListener(v -> startActivity(new Intent(this, RegisterActivity.class)));
        findViewById(R.id.btnForgot).setOnClickListener(v -> startActivity(new Intent(this, ForgotPasswordActivity.class)));
    }
}
