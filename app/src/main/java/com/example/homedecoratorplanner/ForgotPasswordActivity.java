package com.example.homedecoratorplanner;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPasswordActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        findViewById(R.id.btnContinue).setOnClickListener(v -> {
            Toast.makeText(this, "Demo only: no email is sent.", Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, ResetPasswordActivity.class));
        });
        findViewById(R.id.btnBackLogin).setOnClickListener(v -> finish());
    }
}
