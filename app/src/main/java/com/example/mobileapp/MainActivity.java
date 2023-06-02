package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;
public class MainActivity extends AppCompatActivity {

    private EditText editBaseAmount;

    private SeekBar seekBarAmount;

    private TextView tipPercentAmount;
    private TextView tipAmount;
    private TextView tipTotalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editBaseAmount = findViewById(R.id.baseAmount);
        seekBarAmount = findViewById(R.id.seekBarAmount);
        tipPercentAmount = findViewById(R.id.percentLabel);
        tipAmount = findViewById(R.id.tipAmount);
        tipTotalAmount = findViewById(R.id.totalAmount);

        seekBarAmount.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                Log.i("MainActivity", String.format("the change is %s", progress));
                tipPercentAmount.setText(String.format("%s", progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });

        editBaseAmount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}