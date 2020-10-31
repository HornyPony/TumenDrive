package com.example.tumen_drive;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tumen_drive.databinding.CompanionItemBinding;

import java.util.List;

class CompanionAdapter extends RecyclerView.Adapter<CompanionAdapter.ViewHolder> {
    private List<Companion> companionList;
    private String fragment;

    CompanionAdapter(List<Companion> companionList, String fragment){
        this.fragment = fragment;
        this.companionList = companionList;
    }

    @NonNull
    @Override
    public CompanionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        CompanionItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.companion_item, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CompanionAdapter.ViewHolder holder, int position) {
Companion companion = companionList.get(position);
        holder.companionNameTV.setText(companion.getCompanionName());
        holder.companionsAmountTV.setText(companion.getCompanionsAmount());
        holder.rideDistanceTV.setText(companion.getRideDistance());
       holder.locationTV.setText(companion.getLocation());
        holder.timeTV.setText(companion.getTime());

        if(!(fragment.equals(CompanionsRequestsFragment.class.toString()))) {
            holder.addButton.setVisibility(View.GONE);
            holder.denyButton.setVisibility(View.GONE);
        } else {
            holder.divider.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return companionList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CompanionItemBinding binding;

        final TextView companionNameTV, companionsAmountTV, rideDistanceTV, locationTV, timeTV;
        private Button addButton, denyButton;
        private View divider;
        public ViewHolder(CompanionItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

            companionNameTV = binding.companionNameTV;
            companionsAmountTV = binding.companionsAmountTV;
            rideDistanceTV = binding.rideDistanceTV;
            locationTV = binding.locationTV;
            timeTV = binding.timeTV;
            addButton = binding.Accept;
            denyButton = binding.Deny;
            divider = binding.dividerItem;
        }
    }
}
