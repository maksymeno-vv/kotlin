package com.example.lab1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {

    List<User> spisok;
    Context context;
    User curent ;

    public UserAdapter(List<User> spisok , Context context) {
        this.spisok = spisok;
        this.context = context;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
       View view1= layoutInflater.inflate(R.layout.iteam_user, parent,false);
        return new UserHolder(view1) ;

    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {
            curent = spisok.get(position);
            holder.login.setText(curent.login);

    }

    @Override
    public int getItemCount() {
        return spisok.size();
    }

    class UserHolder extends RecyclerView.ViewHolder {
        TextView login;
        public UserHolder(@NonNull View itemView) {
            super(itemView);
            login = itemView.findViewById(R.id.textView_iteamlogin);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context , curent.toString() , Toast.LENGTH_SHORT).show();
                }
            });
        }

    }
}

