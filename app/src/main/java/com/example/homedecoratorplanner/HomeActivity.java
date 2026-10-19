package com.example.homedecoratorplanner;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViewById(R.id.btnProfile).setOnClickListener(v -> startActivity(new Intent(this, ProfileActivity.class)));
        findViewById(R.id.btnLogout).setOnClickListener(v -> {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        });
        int[] ids = {R.id.cardRooms, R.id.cardStyles, R.id.cardColors, R.id.cardFurniture,
            R.id.cardDecor, R.id.cardBudget, R.id.cardPlans, R.id.cardFavorites};
        for (int id : ids) {
            TextView card = findViewById(id);
            card.setOnClickListener(v -> Toast.makeText(this,
                card.getText().toString().replace("\n", " ") + " screen can be added next",
                Toast.LENGTH_SHORT).show());
        }
    }
}
