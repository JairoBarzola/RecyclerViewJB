package com.example.android.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import static android.R.string.no;

/**
 * Created by Jair Barzola on 04-Jan-17.
 */
//necistamos hacer esto declarar el adapter con el extends RecyclerView.Adapter
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private String[] myData;
    //declaramos un constructor
    public RecyclerAdapter (String[] data){
    myData=data;
    }
    // encargado de crear los ViewHolder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }
    //actualizar los datos que tenemos
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
            holder.textView.setText(myData[position]);
    }
    // indica el nro de elementos
    @Override
    public int getItemCount() {
        return myData.length;
    }

    //Tenemos que crear un ViewHolder extends RecyclerView.ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.title);
        }



    }

}
