package digital.direkshan.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {
    private static final String TOTAL_COUNT = "total_count";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }
    public void showRandomNumber () {
        // Get the text view where the random number will be displayed
        TextView randomView = findViewById(R.id.textview_random);

        // Get the text view where the heading is displayed
        TextView headingView = findViewById(R.id.textview_label);

        // Get the count from the intent extras
        int count = getIntent().getIntExtra(TOTAL_COUNT, 0);

        // Generate the random number
        Random random = new Random();
        int randomInt = 0;
        if (count>0) {
            randomInt = random.nextInt(count);
        }

        // Display the random number.
        randomView.setText(String.format("%1$d",randomInt));

        // Substitute the max value into the string resource
        // for the heading, and update the heading
        headingView.setText(getString(R.string.random_heading, count));
    }
}
