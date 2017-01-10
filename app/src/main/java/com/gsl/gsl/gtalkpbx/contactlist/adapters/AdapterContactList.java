package com.gsl.gsl.gtalkpbx.contactlist.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gsl.gsl.gtalkpbx.R;

import java.util.List;

/**
 * Created by gsl on 10-Jan-17.
 */

public class AdapterContactList extends RecyclerView.Adapter<AdapterContactList.CustomViewHolder>  {
    private List<String> mDataSet;
    private Context mContext;
    private static customInterface customInterface;

    public AdapterContactList(Context context, List<String>mDataSet) {
        this.mDataSet = mDataSet;
        mContext  = context;
        Log.d("recycler :",mDataSet.size()+"");


    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_contact_list_layout,parent,false);
      CustomViewHolder customViewHolder = new CustomViewHolder(view);
        return customViewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.mNameTextView.setText(mDataSet.get(position));

    }


    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public static class  CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mNameTextView;
        public CustomViewHolder(View itemView) {
            super(itemView);
            mNameTextView = (TextView) itemView.findViewById(R.id.textViewContactName);
            itemView.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {
            customInterface.onItemClick(getAdapterPosition(),v);

        }
    }

    public void setOnItemClickListener(customInterface clickListener){
        this.customInterface = clickListener;
    }

    public interface customInterface{
        void onItemClick(int position, View v);
    }
}