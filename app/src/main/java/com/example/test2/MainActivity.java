package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //plis
    public void plus(View view) {
        TextView setView = (TextView) findViewById(R.id.textView1);
        String countView = new String((setView.getText()).toString());
        if(isNumber(countView) == true) {
            int count = Integer.parseInt(countView);
            count++;
            setView.setText(String.valueOf(count));
        }
    }

    //minus as a bonus
    public void minus(View view) {
        TextView setView = (TextView) findViewById(R.id.textView1);
        String countView = new String((setView.getText()).toString());
        if(isNumber(countView) == true) {
            int count = Integer.parseInt(countView);
            count--;
            setView.setText(String.valueOf(count));
        }
    }

    //is input number or not?
    private static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
