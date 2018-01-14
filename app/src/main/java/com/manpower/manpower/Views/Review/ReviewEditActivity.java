package com.manpower.manpower.Views.Review;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import com.manpower.manpower.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ReviewEditActivity extends AppCompatActivity {

    @BindView(R.id.ratingBar)
    RatingBar ratingBar;
    @BindView(R.id.titleTextView)
    TextView titleTextView;
    @BindView(R.id.reviewContentEditText)
    EditText reviewContentEditText;
    @BindView(R.id.confirmButton)
    Button confirmButton;
    @BindView(R.id.root)
    ConstraintLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_edit);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.confirmButton)
    public void onViewClicked() {


        String message = ""+ ratingBar.getRating()+ " / " + "REVIEW CONTENT::" + reviewContentEditText.getText();

        Snackbar snackbar = Snackbar.make(root, "", Snackbar.LENGTH_SHORT);
        snackbar.show();


    }
}
