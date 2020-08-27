package com.project_work.foodies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    public ArrayList<Item> item;
    onItemSelected activity;
    interface onItemSelected
    {
        void onItemClicked(int index);
    }

    public ItemAdapter(Context context,ArrayList<Item> list)
    {
        item=list;
        activity=(onItemSelected) context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView item_num,item_name,item_variety;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_num=itemView.findViewById(R.id.item_num);
            item_name=itemView.findViewById(R.id.item_name);
            item_variety=itemView.findViewById(R.id.item_variety);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.onItemClicked(item.indexOf((Item) v.getTag()));
                }
            });
        }
    }

    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.items_list_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(item.get(position));
        holder.item_name.setText(item.get(position).getItem_name());
        holder.item_variety.setText(item.get(position).getItem_variety());
        //holder.item_num.setText(position+1+": ");
    }

    @Override
    public int getItemCount() {
        return item.size();
    }
}
