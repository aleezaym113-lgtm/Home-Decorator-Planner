package com.example.homedecoratorplanner;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPasswordActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        findViewById(R.id.btnSavePassword).setOnClickListener(v -> {
            Toast.makeText(this, "Demo only: password is not stored.", Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        });
        findViewById(R.id.btnBackLogin).setOnClickListener(v -> finish());
    }
}
