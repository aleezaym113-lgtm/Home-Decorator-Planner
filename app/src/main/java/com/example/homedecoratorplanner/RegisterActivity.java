package com.example.homedecoratorplanner;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        findViewById(R.id.btnRegister).setOnClickListener(v -> {
            Toast.makeText(this, "Demo registration complete. Connect a backend for real accounts.", Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        });
        findViewById(R.id.btnBackLogin).setOnClickListener(v -> finish());
    }
}
