package net.orhanakgul.simplecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        result = (TextView) findViewById(R.id.resultText);


        }

        // TOPLA
        public void sum (View view){
            int a = Integer.parseInt(editText1.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resultInt = a + b;

            result.setText("Result : " + resultInt);
        }

        // ÇIKAR
        public void deduct (View view){
            int a = Integer.parseInt(editText1.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resultInt = a - b;

            result.setText("Result : " + resultInt);
        }

        // ÇARP
        public void multiply (View view){
            int a = Integer.parseInt(editText1.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resultInt = a * b;

            result.setText("Result : " + resultInt);
        }

        // BÖL
        public void divide (View view){
            int a = Integer.parseInt(editText1.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resultInt = a / b;

            result.setText("Result : " + resultInt);
        }
}
