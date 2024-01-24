package com.example.democourse;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.democourse.R;
import com.example.democourse.adapter1;


public class adapter extends RecyclerView.Adapter<adapter.ViewHolder>{
    private adapter1[] listdata;

    // RecyclerView recyclerView;
    private OnItemClickListener listener;

    public adapter(adapter1[] listdata, OnItemClickListener listener) {
        this.listdata = listdata;
        this.listener = listener;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.course, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position) {
        final adapter1 myListData = listdata[position];
        holder.courseName.setText(listdata[position].getCourseName());
        holder.courseDuration.setText(listdata[position].getDuration());
        holder.courseAmount.setText(listdata[position].getAmount());
        holder.courseCompany.setImageResource(listdata[position].getImgId());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null) {
                    listener.onItemClick(holder.getAdapterPosition());
                }
            }


        });
    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView courseCompany;
        public TextView courseName,courseDuration,courseAmount;
        CardView cardView;
        public ViewHolder(View itemView) {
            super(itemView);
            this.courseName = (TextView) itemView.findViewById(R.id.courseName);
            this.courseDuration = (TextView) itemView.findViewById(R.id.duration);
            this.courseAmount = (TextView) itemView.findViewById(R.id.amount);
            this.cardView = (CardView) itemView.findViewById(R.id.androiodCourse);
            this.courseCompany = (ImageView) itemView.findViewById(R.id.company);
        }
    }
    private void gotoCoursrContentPage() {

    }
}