package com.example.tumen_drive.Review;

class Review {
    private String reviewName;
    private String reviewStatus;
    private String pointsForReview;
    private String reviewAddress;

    public String getReviewName() {
        return reviewName;
    }

    public void setReviewName(String reviewName) {
        this.reviewName = reviewName;
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getPointsForReview() {
        return pointsForReview;
    }

    public void setPointsForReview(String pointsForReview) {
        this.pointsForReview = pointsForReview;
    }

    public Review(String reviewName, String reviewAddress, String reviewStatus,  int pointsForReview) {
        this.reviewName = reviewName;
        this.reviewStatus = reviewStatus;
        this.pointsForReview = String.valueOf(pointsForReview);
        this.reviewAddress = reviewAddress;
    }

    public String getReviewAddress() {
        return reviewAddress;
    }

    public void setReviewAddress(String reviewAddress) {
        this.reviewAddress = reviewAddress;
    }
}
