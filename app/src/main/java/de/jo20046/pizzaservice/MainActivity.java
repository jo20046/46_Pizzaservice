package de.jo20046.pizzaservice;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSalami = findViewById(R.id.btnSalami);
        Button btnTonno = findViewById(R.id.btnTonno);
        Button btnMargherita = findViewById(R.id.btnMargherita);

        btnSalami.setOnClickListener(v -> Toast.makeText(MainActivity.this, R.string.salami, Toast.LENGTH_SHORT).show());
        btnTonno.setOnClickListener(v -> Toast.makeText(MainActivity.this, R.string.tonno, Toast.LENGTH_SHORT).show());
        btnMargherita.setOnClickListener(v -> Toast.makeText(MainActivity.this, R.string.margherita, Toast.LENGTH_SHORT).show());
    }
}