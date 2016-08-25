package com.gustavodelosriosalatorregmail.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
final Button button_calc=(Button) findViewById(R.id.button_calc);
        final EditText editWeight=(EditText)findViewById(R.id.editWeight);
        final EditText Height=(EditText) findViewById(R.id.Height);
        final TextView viewResult=(TextView) findViewById(R.id.viewResult);
        final TextView view_msg=(TextView) findViewById(R.id.view_msg);

        assert button_calc != null;
        button_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double weight;
                double height;
                double bmi;
                String msg="";

                if(Height.getText().toString().equals("")||editWeight.getText().toString().equals("")){

                }else {

                weight=Double.parseDouble(editWeight.getText().toString());
                height=Double.parseDouble(Height.getText().toString());


                    Toast.makeText(getApplicationContext(),"No valid values",Toast.LENGTH_LONG);

                bmi=height*height;
                bmi=weight/bmi;

                viewResult.setText(String.valueOf(bmi));

                if (bmi<18.5) {
                    msg="Underweight. How 'bout eating some more?";
                } else if(bmi>18.5 && bmi<25){
                    msg="Normal. You're doing just fine!";

                }else if (bmi>25){
                    msg="Overweight. Time to hit the Gym!";
                }
                view_msg.setText(msg);

            }
        }
    });
}}
