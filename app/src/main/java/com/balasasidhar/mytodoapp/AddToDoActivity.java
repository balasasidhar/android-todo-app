package com.balasasidhar.mytodoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddToDoActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText todoTitle;
    private EditText todoDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_do);

        getSupportActionBar().setTitle("Add New ToDo");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        todoTitle = findViewById(R.id.todoTitle);
        todoDescription = findViewById(R.id.todoDescription);
        Button saveToDo = findViewById(R.id.saveToDo);

        saveToDo.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        String title = todoTitle.getText().toString().trim();
        String description = todoDescription.getText().toString().trim();
        Toast.makeText(this, title, Toast.LENGTH_SHORT).show();
    }
}
