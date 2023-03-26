package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView m_recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Model [] data = new Model[]{
                new Model("ORC" , "Orcs are brutish, aggressive at low level, at high level, strong and know about honor as warrior.",R.drawable.orc),
                new Model("KNIGHT","Humans are weak  at low level, at high level can conduct the most efficient teamwork.",R.drawable.knight),
                new Model("DRAGON","Dragons are very strong from the start, but do not have high quantity, tend to be pushed at late game.",R.drawable.dragon)
    };
        m_recyclerview = findViewById(R.id.my_recycler_view);
        Adapter myadapter= new Adapter(data);
        m_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        m_recyclerview.setAdapter(myadapter);
}

}