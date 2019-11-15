package com.example.cricketthermometer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etChirps;
    Button btnCalc;
    TextView tvAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        etChirps=findViewById(R.id.etChirps);
        btnCalc=findViewById(R.id.btnCalc);
        tvAns=findViewById(R.id.tvAns);
        tvAns.setVisibility(View.GONE);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                if (etChirps.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this,"Enter a number, please.",Toast.LENGTH_SHORT).show();
                else {
                    int chirps = Integer.parseInt(etChirps.getText().toString());
                    int temp = chirps + 40;
                    String text = ("It is approximately " + temp + " " + getString(R.string.answer));
                    tvAns.setText(text);
                    tvAns.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
