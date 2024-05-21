package com.example.tugasday11;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView btn1 = findViewById(R.id.btn1);
        ImageView btn2 = findViewById(R.id.btn2);
        ImageView btn3 = findViewById(R.id.btn3);
        ImageView btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(v -> navigateTo(HomeActivity.class));
        btn2.setOnClickListener(v -> navigateTo(InformationActivity.class));
        btn3.setOnClickListener(v -> navigateTo(HistoryActivity.class));
        btn4.setOnClickListener(v -> {

       });
    }

    private void navigateTo(Class<?> cls) {
        Intent intent = new Intent(ProfileActivity.this, cls);
        startActivity(intent);
    }
}
