package com.balasasidhar.mytodoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ToDoModel[] toDos = new ToDoModel[]{
            new ToDoModel("Test title", "Test description"),
            new ToDoModel("Test title", "Test description"),
            new ToDoModel("Test title", "Test description"),
            new ToDoModel("Test title", "Test description")
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fabAddToDo = findViewById(R.id.fabAddToDo);
        fabAddToDo.setOnClickListener(this);

        RecyclerView mRecyclerView = findViewById(R.id.myToDoRecyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        DataAdapter myDataAdapter = new DataAdapter(toDos);
        mRecyclerView.setAdapter(myDataAdapter);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, AddToDoActivity.class);
        startActivity(intent);
    }
}
