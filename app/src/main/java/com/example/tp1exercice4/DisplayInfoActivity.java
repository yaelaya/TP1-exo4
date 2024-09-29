package com.example.tp1exercice4;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        TextView textViewInfo = findViewById(R.id.text_view_info);

        String nom = getIntent().getStringExtra("nom");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        String adresse = getIntent().getStringExtra("adresse");
        String ville = getIntent().getStringExtra("ville");

        String info = "Nom & Prénom: " + nom + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone + "\n" +
                "Adresse: " + adresse + "\n" +
                "Ville: " + ville;

        textViewInfo.setText(info);
    }
}
