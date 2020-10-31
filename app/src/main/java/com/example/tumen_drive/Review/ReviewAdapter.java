package com.example.tumen_drive.Review;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tumen_drive.CompanionsRequestsFragment;
import com.example.tumen_drive.R;
import com.example.tumen_drive.databinding.CompanionItemBinding;
import com.example.tumen_drive.databinding.ReviewItemBinding;

import java.util.List;

class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder> {
    private List<Review> reviewList;
    private OnReviewListener onReviewListener;

    ReviewAdapter(List<Review> reviewList, OnReviewListener onReviewListener){
        this.reviewList = reviewList;
        this.onReviewListener = onReviewListener;
    }

    @NonNull
    @Override
    public ReviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ReviewItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.review_item, parent, false);
        return new ReviewAdapter.ViewHolder(binding, onReviewListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewAdapter.ViewHolder holder, int position) {
        Review review = reviewList.get(position);
        holder.reviewNameTV.setText(review.getReviewName());
        holder.reviewStatusTV.setText(review.getReviewStatus());
        holder.pointsForReviewTV.setText(review.getPointsForReview());
        holder.reviewAddressTV.setText(review.getReviewAddress());
    }

    @Override
    public int getItemCount() {
        return reviewList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ReviewItemBinding binding;
        OnReviewListener onReviewListener;

        final TextView reviewNameTV, reviewStatusTV, reviewAddressTV, pointsForReviewTV;
        public ViewHolder(ReviewItemBinding binding, OnReviewListener onReviewListener) {
            super(binding.getRoot());
            this.binding = binding;
            this.onReviewListener = onReviewListener;

            reviewNameTV = binding.reviewNameTV;
            reviewStatusTV = binding.reviewStatusTV;
            pointsForReviewTV = binding.pointsForReviewTV;
            reviewAddressTV = binding.streetTV;


            binding.getRoot().setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
onReviewListener.onReviewClick(getAdapterPosition());
        }
    }

    public interface OnReviewListener{
        void onReviewClick(int position);
    }
}
