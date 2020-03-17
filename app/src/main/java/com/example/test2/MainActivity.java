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

    public void plus(View view) {
        TextView set_view = (TextView) findViewById(R.id.textView1);
        String countView = new String((set_view.getText()).toString());
        if(isNumber(countView) == true) {
            int mCount = Integer.parseInt(countView);
            mCount++;
            set_view.setText(String.valueOf(mCount));
        }
    }
    public void minus(View view) {
        TextView set_view = (TextView) findViewById(R.id.textView1);
        String countView = new String((set_view.getText()).toString());
        if(isNumber(countView) == true) {
            int mCount = Integer.parseInt(countView);
            mCount--;
            set_view.setText(String.valueOf(mCount));
        }
    }

    private static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
