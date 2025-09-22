package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {

    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);

        t1 = findViewById(R.id.t1); t2 = findViewById(R.id.t2); t3 = findViewById(R.id.t3); t4 = findViewById(R.id.t4); t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6); t7 = findViewById(R.id.t7); t8 = findViewById(R.id.t8); t9 = findViewById(R.id.t9); t10 = findViewById(R.id.t10);

        Intent i = getIntent();
        Bundle b = i.getExtras();
        Double n = b.getDouble("n");

        t1.setText(Double.toString(n * 1));
        t2.setText(Double.toString(n * 2));
        t3.setText(Double.toString(n * 3));
        t4.setText(Double.toString(n * 4));
        t5.setText(Double.toString(n * 5));
        t6.setText(Double.toString(n * 6));
        t7.setText(Double.toString(n * 7));
        t8.setText(Double.toString(n * 8));
        t9.setText(Double.toString(n * 9));
        t10.setText(Double.toString(n * 10));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}