package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    int num;
    long fact;
    String S;
    TextView t2, t3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edittext);
        t2 = findViewById(R.id.textView2);
        t3 = findViewById(R.id.textView3);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fact = 1;
                S = editText.getText().toString().trim();
                num = Integer.parseInt(S);
                if (num > 1 && num<=20) {
                    for (int i = num; i > 1; i--) {
                        fact = fact * i;
                    }
                }
                S = String.valueOf(fact);
                if (num>20)
                {
                    S="Out Of Range";
                }

                t3.setText(S);
            }
        });
    }
}
