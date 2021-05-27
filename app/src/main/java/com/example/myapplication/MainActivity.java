package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.util.Log;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("appStartup", "app launched.");
    }

    public void disable(View v) {
        v.setEnabled(false);
        Log.d("success", "Button was disabled.");
        buttonTextChange(v);
        changeText();
    }

    public void buttonTextChange(View v) {
        Button b = (Button) v;
        b.setText("Disabled");
        Log.d("success", "Button was renamed");
    }

    public void changeText() {
        TextView t = findViewById(R.id.hello); // is static at the moment
        String text = ((EditText)findViewById(R.id.change)).getText().toString();
        t.setText(text);
        Log.d("success", "hello text was changed to " + text);
    }

}