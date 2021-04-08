package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] itens = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_list_item_1,
                        android.R.id.text1,
                        itens
                );

        listLocais.setAdapter(adaptador);

        listLocais.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView,
                                            View view, int i, long l) {
                        String valorSelecionado =
                                listLocais.getItemAtPosition(i).toString();
                        Toast.makeText(getApplicationContext(),
                                "Você Selecionou " +
                                        valorSelecionado,
                                Toast.LENGTH_LONG).show();
                    }});


    }
}