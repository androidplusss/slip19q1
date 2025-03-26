package com.example.slip19q1;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    ImageView bulbImage;
    ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bulbImage = findViewById(R.id.bulbImage);
        toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                bulbImage.setImageResource(R.drawable.bulb_on);
            } else {
                bulbImage.setImageResource(R.drawable.bulb_off);
            }
        });
    }
}
