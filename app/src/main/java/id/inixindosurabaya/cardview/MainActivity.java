package id.inixindosurabaya.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // 1. inisialisasi
    private RecyclerView recyclerView;
    private PersonAdapter adapter;
    private ArrayList<Persons> personsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // membuat array list
        createArrayList();

        // 2. mengenali komponen
        recyclerView = findViewById(R.id.recycler_view);
        adapter = new PersonAdapter(personsArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void createArrayList() {
        personsArrayList = new ArrayList<>();
        personsArrayList.add(new Persons("Angelica", "angelica@abc.com", "12345678"));
        personsArrayList.add(new Persons("Henry", "henry@abc.com", "0981234567"));
        personsArrayList.add(new Persons("Charles", "charles@abc.com", "123098345"));
        personsArrayList.add(new Persons("Queen", "queen@abc.com", "432156780"));
        personsArrayList.add(new Persons("George", "george@abc.com", "0981235412"));
    }
}
