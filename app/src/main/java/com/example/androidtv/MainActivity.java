package com.example.androidtv;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends FragmentActivity {
    ArrayList<Model> movies = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, movies);
        recyclerView.setAdapter(adapter);
    }

    private void setData() {
        movies.add(new Model(R.drawable.qq, "Семейка Аддамс: Горящий тур"));
        movies.add(new Model(R.drawable.ee, "Человек-паук: Нет пути домой"));
        movies.add(new Model(R.drawable.ww, "Веном 2"));
        movies.add(new Model(R.drawable.ww, "Веном 2"));
        movies.add(new Model(R.drawable.ww, "Веном 2"));
        movies.add(new Model(R.drawable.ww, "Веном 2"));
        movies.add(new Model(R.drawable.ww, "Веном 2"));
        movies.add(new Model(R.drawable.ww, "Веном 2"));
        movies.add(new Model(R.drawable.ww, "Веном 2"));
        movies.add(new Model(R.drawable.ww, "Веном 2"));
        movies.add(new Model(R.drawable.ww, "Веном 2"));
    }
}