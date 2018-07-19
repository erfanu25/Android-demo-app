package com.example.erfan.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class worldcup extends AppCompatActivity {

    private TextView progress,res;
    private RadioGroup radiogroup;
    private RadioButton radiobutton;
    private SeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worldcup);

        radiogroup=findViewById(R.id.radio);
        seekbar = findViewById(R.id.seekbar);
        progress = findViewById(R.id.progress);

        //progress.setText(seekbar.getProgress());

        res = findViewById(R.id.res);
    }

    public void predict(View v)
    {
        try{
            int take=radiogroup.getCheckedRadioButtonId();
            radiobutton=findViewById(take);

            res.setText("You Support "+radiobutton.getText() +" "+seekbar.getProgress()+"%");
        }
        catch (Exception e)
        {
            Toast.makeText(worldcup.this,"select an option",Toast.LENGTH_SHORT).show();
        }


    }
}
