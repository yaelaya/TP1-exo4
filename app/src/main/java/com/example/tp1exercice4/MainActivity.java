package com.example.tp1exercice4;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editNom, editEmail, editPhone, editAdresse;
    private Spinner editVille;
    private Button buttonEnvoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNom = findViewById(R.id.edit_nom);
        editEmail = findViewById(R.id.edit_email);
        editPhone = findViewById(R.id.edit_phone);
        editAdresse = findViewById(R.id.edit_adresse);
        editVille = findViewById(R.id.edit_ville);
        buttonEnvoyer = findViewById(R.id.button);

        buttonEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nom = editNom.getText().toString().trim();
                String email = editEmail.getText().toString().trim();
                String phone = editPhone.getText().toString().trim();
                String adresse = editAdresse.getText().toString().trim();
                String ville = editVille.getSelectedItem().toString();

                if (TextUtils.isEmpty(nom) || TextUtils.isEmpty(email) || TextUtils.isEmpty(phone) ||
                        TextUtils.isEmpty(adresse)) {
                    Toast.makeText(MainActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent(MainActivity.this, DisplayInfoActivity.class);
                intent.putExtra("nom", nom);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                intent.putExtra("adresse", adresse);
                intent.putExtra("ville", ville);
                startActivity(intent);
            }
        });
    }
}
