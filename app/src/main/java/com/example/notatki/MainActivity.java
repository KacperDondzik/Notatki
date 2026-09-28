package com.example.notatki;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Notatka> listaNotatek;
    private NotatkaAdapter adapter;

    private ListView listViewNotatki;
    private EditText etTytul;
    private EditText etTresc;
    private Button btnDodaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewNotatki = findViewById(R.id.listViewNotatki);
        etTytul = findViewById(R.id.etTytul);
        etTresc = findViewById(R.id.etTresc);
        btnDodaj = findViewById(R.id.btnDodaj);

        listaNotatek = new ArrayList<>();
        listaNotatek.add(new Notatka("tenis", "Gra z Ewą w poniedziałek"));

        adapter = new NotatkaAdapter(this, listaNotatek);
        listViewNotatki.setAdapter(adapter);

        btnDodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tytul = etTytul.getText().toString().trim();
                String tresc = etTresc.getText().toString().trim();

                if (!tytul.isEmpty() && !tresc.isEmpty()) {
                    listaNotatek.add(new Notatka(tytul, tresc));
                    adapter.notifyDataSetChanged();

                    etTytul.setText("");
                    etTresc.setText("");
                }
            }
        });
    }
}