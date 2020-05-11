package com.balasasidhar.mytodoapp;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataAdapter extends RecyclerView.Adapter<MyViewHolder> {

    ToDoModel[] myToDos;

    public DataAdapter(ToDoModel[] toDos){
        this.myToDos = toDos;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItemView = layoutInflater.inflate(R.layout.todo_list_item,parent, false);
        return new MyViewHolder(listItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ToDoModel currentToDo = myToDos[position];
        String title = currentToDo.getTitle();
        holder.mTextViewTitle.setText(title);
        holder.mTextViewDescription.setText(currentToDo.getDescription());
        holder.mTextViewInitial.setText(""+title.charAt(0));
    }

    @Override
    public int getItemCount() {
        return myToDos.length;
    }
}

class MyViewHolder extends RecyclerView.ViewHolder {
    TextView mTextViewTitle;
    TextView mTextViewDescription;
    TextView mTextViewInitial;

    MyViewHolder(@NonNull View itemView) {
        super(itemView);
        this.mTextViewTitle = itemView.findViewById(R.id.todoTitle);
        this.mTextViewDescription = itemView.findViewById(R.id.todoDescription);
        this.mTextViewInitial = itemView.findViewById(R.id.todoInitial);
    }
}