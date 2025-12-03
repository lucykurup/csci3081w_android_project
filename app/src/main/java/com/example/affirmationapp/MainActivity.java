package com.example.affirmationapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView affirmationText;
    private Button getAffirmationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        affirmationText = findViewById(R.id.affirmationText);
        getAffirmationButton = findViewById(R.id.getAffirmationButton);

        getAffirmationButton.setOnClickListener(v -> displayNewAffirmation());

        // Display initial affirmation
        displayNewAffirmation();
    }

    private void displayNewAffirmation() {
        String affirmation = AffirmationData.getRandomAffirmation();
        affirmationText.setText(affirmation);
    }
}
