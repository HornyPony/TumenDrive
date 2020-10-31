package com.example.tumen_drive.Review;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tumen_drive.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ReviewsActivity extends AppCompatActivity implements ReviewAdapter.OnReviewListener {
    private List<Review> reviewList;
    private ReviewAdapter reviewAdapter;
    private RecyclerView recyclerView;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);
        reviewList = new ArrayList<>();

        floatingActionButton = findViewById(R.id.addNewReview);
        recyclerView = findViewById(R.id.recyclerView);
        reviewList.add(new Review("Слишком узкая велодорожка", "ул. Николая Чаплина, д 117","Заявка принята",  300));
        reviewList.add(new Review("Нужно поменять местами полосу движения для пешеходов и велосипедистов",
                "ул. 50 лет Октября, д 180",   "Мотивированный отказ",  0));
        reviewList.add(new Review("Разбитая велодорожка", "ул. 50 лет Октября, д 182","Запланировано",  300));
        reviewAdapter = new ReviewAdapter(reviewList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(reviewAdapter);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createNewReview();
            }
        });
    }

    private void createNewReview() {
        startActivity(new Intent(this, CreateNewReviewActivity.class));
    }

    @Override
    public void onReviewClick(int position) {
        reviewList.get(position);
        startActivity(new Intent(ReviewsActivity.this, ReviewInfoActivity.class));
    }
}