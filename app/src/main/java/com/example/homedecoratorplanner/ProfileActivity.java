package com.example.homedecoratorplanner;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class ProfileActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        findViewById(R.id.btnSaveProfile).setOnClickListener(v ->
            Toast.makeText(this, "Profile saved for this demo only.", Toast.LENGTH_SHORT).show());
        findViewById(R.id.btnHome).setOnClickListener(v -> finish());
    }
}
