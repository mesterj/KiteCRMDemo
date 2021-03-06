package com.kite.joco.kitecrmdemo;

import android.nfc.Tag;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.kite.joco.entities.Partner;

import java.util.List;

/**
 * Created by Joco on 2015.04.12..
 */
public class ContactRecycleAdapter extends RecyclerView.Adapter<ContactRecycleAdapter.ContactViewHolder>  {

    List<Partner> mDataset;
    public static final String TAG = "KITECRMDEMO";

    // Provide a suitable constructor (depends on the kind of dataset)
    public ContactRecycleAdapter(List<Partner> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public ContactRecycleAdapter.ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contactLayoutView;
        contactLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_main,null);

        ContactViewHolder contactViewHolder = new ContactViewHolder(contactLayoutView);

        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.tvId.setText(mDataset.get(position).getId().toString());
        holder.tvNev.setText(mDataset.get(position).getKapcsolatnev());
        holder.tvPhoneNumber.setText(mDataset.get(position).getMaganMobilTelefonszam());


    }



    @Override
    public int getItemCount() {
        return mDataset.size();
    }



    // inner class to hold a reference to each item of RecyclerView
    public static class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView tvId;
        public TextView tvNev;
        public TextView tvPhoneNumber;

        public ContactViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            tvId = (TextView) itemLayoutView.findViewById(R.id.tvId);
            tvNev = (TextView) itemLayoutView.findViewById(R.id.tvNev);
            tvPhoneNumber = (TextView) itemLayoutView.findViewById(R.id.tvNumber);
            itemLayoutView.setClickable(true);
            tvId.setOnClickListener(this);
            tvNev.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            long pos = getAdapterPosition();
            Partner partneradat = Partner.findById(Partner.class, pos);
            String telszam ="Nincs céges mobil szám";
            try {
                if (partneradat.getCegMobilTelefonszam() != null) {
                    telszam = partneradat.getCegMobilTelefonszam();
                }
            } catch (NullPointerException nex){
                Log.i(TAG,"Nincs céges mobil szám");
            }


            Toast.makeText(v.getContext(),telszam,Toast.LENGTH_SHORT).show();
        }
    }


}
