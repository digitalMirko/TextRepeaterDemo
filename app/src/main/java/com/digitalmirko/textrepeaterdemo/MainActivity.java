package com.digitalmirko.textrepeaterdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_input, et_number, et_output;
    Button btn_enable;
    String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_input = (EditText) findViewById(R.id.et_input);
        et_number = (EditText) findViewById(R.id.et_number);
        et_output = (EditText) findViewById(R.id.et_output);

        btn_enable = (Button) findViewById(R.id.btn_enable);

        btn_enable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = et_input.getText().toString();
                String tempNumber = et_number.getText().toString();

                if(!tempNumber.equals("")) {
                    int number = Integer.parseInt(et_number.getText().toString());
                    text = "";
                    for (int i = 0; i < number; i++) {
                        text = text + input + "\n";
                    }
                    et_output.setText(text);
                }
            }
        });
    }
}
