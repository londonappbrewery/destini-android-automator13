package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView firstStory;
    private Button path1;
    private Button path2;
    private int mStoryindex = 1;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        final TextView firstStory = findViewById(R.id.storyTextView);
        final Button path1 = findViewById(R.id.buttonTop);
        final Button path2 = findViewById(R.id.buttonBottom);
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        path1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryindex == 1) {
                    firstStory.setText(R.string.T3_Story);
                    path1.setText(R.string.T3_Ans1);
                    path2.setText(R.string.T3_Ans2);
                    mStoryindex = 2;
                }else if (mStoryindex == 2) {
                    firstStory.setText(R.string.T3_Story);
                    path1.setText(R.string.T3_Ans1);
                    path2.setText(R.string.T3_Ans2);
                    mStoryindex = 4;
                } else if (mStoryindex == 4) {
                    firstStory.setText(R.string.T6_End);
                    path1.setVisibility(View.GONE);
                    path2.setVisibility(View.GONE);
                }  else if (mStoryindex == 3) {
                    firstStory.setText(R.string.T6_End);
                    path1.setVisibility(View.GONE);
                    path2.setVisibility(View.GONE);


                }

            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        path2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryindex == 1) {
                    firstStory.setText(R.string.T2_Story);
                    path1.setText(R.string.T2_Ans1);
                    path2.setText(R.string.T2_Ans2);
                    mStoryindex = 2;
                } else if (mStoryindex == 2) {
                    firstStory.setText(R.string.T4_End);
                    path1.setVisibility(View.GONE);
                    path2.setVisibility(View.GONE);
                } else if (mStoryindex == 3) {
                    firstStory.setText(R.string.T5_End);
                    path1.setVisibility(View.GONE);
                    path2.setVisibility(View.GONE);
                } else if (mStoryindex == 4) {
                    firstStory.setText(R.string.T5_End);
                    path1.setVisibility(View.GONE);
                    path2.setVisibility(View.GONE);
                }
            }
        });
    }}
