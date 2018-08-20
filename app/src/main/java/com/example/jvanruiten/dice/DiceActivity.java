package com.example.jvanruiten.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DiceActivity extends AppCompatActivity {

    int currentDice;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        final Button button_roll = findViewById(R.id.button_roll);
        final Button button_d4 = findViewById(R.id.button_d4);
        final Button button_d6 = findViewById(R.id.button_d6);
        final Button button_d8 = findViewById(R.id.button_d8);
        final Button button_d10 = findViewById(R.id.button_d10);
        final Button button_d12 = findViewById(R.id.button_d12);
        final Button button_d20 = findViewById(R.id.button_d20);


        button_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentDice > 0) {
                    button_roll.setTextSize(80);
                    button_roll.setText(String.valueOf(rollDice(currentDice)));
                }
            }

        });


        button_d4.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                button_d4.setTextColor(getResources().getColor(R.color.activeDice));
                button_d6.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d8.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d10.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d12.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d20.setTextColor(getResources().getColor(R.color.inactiveDice));
                currentDice = 4;
                button_roll.setText("Roll D4");
                button_roll.setTextSize(40);
            }
        });

        button_d6.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                button_d4.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d6.setTextColor(getResources().getColor(R.color.activeDice));
                button_d8.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d10.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d12.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d20.setTextColor(getResources().getColor(R.color.inactiveDice));
                currentDice = 6;
                button_roll.setText("Roll D6");
                button_roll.setTextSize(40);
            }
        });
        button_d8.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                button_d4.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d6.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d8.setTextColor(getResources().getColor(R.color.activeDice));
                button_d10.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d12.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d20.setTextColor(getResources().getColor(R.color.inactiveDice));
                currentDice = 8;
                button_roll.setText("Roll D8");
                button_roll.setTextSize(40);
            }
        });
        button_d10.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                button_d4.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d6.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d8.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d10.setTextColor(getResources().getColor(R.color.activeDice));
                button_d12.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d20.setTextColor(getResources().getColor(R.color.inactiveDice));
                currentDice = 10;
                button_roll.setText("Roll D10");
                button_roll.setTextSize(40);
            }
        });
        button_d12.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                button_d4.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d6.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d8.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d10.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d12.setTextColor(getResources().getColor(R.color.activeDice));
                button_d20.setTextColor(getResources().getColor(R.color.inactiveDice));
                currentDice = 12;
                button_roll.setText("Roll D12");
                button_roll.setTextSize(40);
            }
        });
        button_d20.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                button_d4.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d6.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d8.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d10.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d12.setTextColor(getResources().getColor(R.color.inactiveDice));
                button_d20.setTextColor(getResources().getColor(R.color.activeDice));
                currentDice = 20;
                button_roll.setText("Roll D20");
                button_roll.setTextSize(40);
            }
        });

    }

    public int rollDice(int bound) {
        Random resultD4 = new Random();
        return resultD4.nextInt(bound) + 1;
    }
}