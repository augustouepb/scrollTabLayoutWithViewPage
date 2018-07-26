package com.example.augusto.testcollapse;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolderData> {

    private String dado;

    public DataAdapter(int dado){
        this.dado = String.valueOf(dado);
    }

    @NonNull
    @Override
    public ViewHolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        String data = this.dado;
        View view = layoutInflater.inflate(R.layout.data_layout, parent, false);

        ViewHolderData viewHolderData = new ViewHolderData(view, parent.getContext());

        return viewHolderData;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderData holder, int position) {

        String data = this.dado;
        if(!data.equals("") && data != null){
            holder.textData.setText(data);
        }

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public static class ViewHolderData extends RecyclerView.ViewHolder{

        public TextView textData;
        public static View itemView;

        public ViewHolderData(View itemView, final Context context) {
            super(itemView);

            this.itemView = itemView;
            textData      = (TextView) itemView.findViewById(R.id.textData);
        }

    }

}
