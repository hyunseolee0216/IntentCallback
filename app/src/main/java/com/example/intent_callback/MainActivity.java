package com.example.intent_callback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultText;
    private EditText editText;
    private Button moveButton;

    private static final int REQUEST_CODE = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setListeners();
    }

    private void setListeners() {
        moveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", editText.getText().toString());
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    private void init() {
        resultText = findViewById(R.id.resultText);
        editText = findViewById(R.id.editText);
        moveButton = findViewById(R.id.moveButton);
    }
}
