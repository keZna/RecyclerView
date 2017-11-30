package com.example.codetride.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by CodeTride on 2017/08/14.
 */


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {



    Context context;
    List<ContactRecycler> contactRecyclersList;

    public RecyclerAdapter() {
    }

    public RecyclerAdapter(Context context, List<ContactRecycler> contactRecyclersList) {
        this.context = context;
        this.contactRecyclersList = contactRecyclersList;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_view,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        //allows us to take on of textviews
        final ContactRecycler contactRecycler;
        contactRecycler = contactRecyclersList.get(position);

        holder.name.setText(contactRecycler.getName());
        holder.surname.setText(contactRecycler.getSurname());
        holder.phone.setText(contactRecycler.getPhone());
        holder.email.setText(contactRecycler.getEmail());
        holder.gender.setText(contactRecycler.getGender());
        holder.height.setText(contactRecycler.getHeight());
        holder.weight.setText(contactRecycler.getWeight());
        holder.cards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Second.class);
                intent.putExtra("Hola",contactRecycler);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return contactRecyclersList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, surname, email, phone, gender, height, weight;
        CardView cards;
        public ViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.name);
            surname = (TextView) itemView.findViewById(R.id.surname);
            email = (TextView) itemView.findViewById(R.id.email);
            phone = (TextView) itemView.findViewById(R.id.phone);
            gender = (TextView) itemView.findViewById(R.id.gender);
            height = (TextView) itemView.findViewById(R.id.height);
            weight = (TextView) itemView.findViewById(R.id.weight);
            cards = (CardView) itemView.findViewById(R.id.cardViewTwo);
        }
    }
}
