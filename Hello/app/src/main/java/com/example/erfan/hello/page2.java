package com.example.erfan.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class page2 extends AppCompatActivity {
    private EditText editText;
    private TextView text,display;
    private Button add,sub,mul,div,submit,clear;

    String dis="";
    float mValueOne, mValueTwo;
    boolean Calculation,Addition,Subtract,Multiplication,Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        editText = findViewById(R.id.editText);
        text =findViewById(R.id.text);
        display =findViewById(R.id.display);

        add =findViewById(R.id.add);
        sub =findViewById(R.id.sub);
        mul =findViewById(R.id.mul);
        div =findViewById(R.id.div);
        submit =findViewById(R.id.submit);
        clear =findViewById(R.id.clear);

        Calculation=false;
        Addition=false;
        Subtract=false;
        Multiplication=false;
        Division=false;


    }


    public void ans(View ve)
    {


       try{
           //String sen=editText.getText().toString();
           //double num1 = Double.parseDouble(editText.getText().toString());
           //editText.setText(editText.getText()+"+");

           if(ve.getId()==R.id.add)
           {
               if (Calculation == false){
                   if (editText == null) {
                       editText.setText("");
                   } else {
                       mValueOne = Float.parseFloat(editText.getText() + "");
                       Calculation = true;
                       Addition = true;
                       editText.setText(null);

                       dis = String.valueOf(mValueOne)+ " + ";
                       display.setText(dis);
                   }
               }
               else if(Addition==true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne + mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne + mValueTwo;
                   Calculation = true;
                   Addition = true;

                   dis = dis+ String.valueOf(mValueTwo)+ " + ";
                   display.setText(dis);
               }
               else if(Subtract==true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne - mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne - mValueTwo;
                   Calculation = true;
                   Subtract=false;
                   Addition=true;

                   dis = dis+ String.valueOf(mValueTwo)+ " + ";
                   display.setText(dis);
               }
               else if(Multiplication==true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne * mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne * mValueTwo;
                   Calculation = true;
                   Multiplication=false;
                   Addition=true;

                   dis = dis+ String.valueOf(mValueTwo)+ " + ";
                   display.setText(dis);

               }
               else if(Division==true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne / mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne / mValueTwo;
                   Calculation = true;
                   Division=false;
                   Addition=true;

                   dis = dis+ String.valueOf(mValueTwo)+ " + ";
                   display.setText(dis);
               }

           }
           else if(ve.getId()==R.id.sub)
           {
               if(Calculation==false)
               {
                   if (editText == null) {
                       editText.setText("");
                   } else {
                       mValueOne = Float.parseFloat(editText.getText() + "");
                       Calculation = true;
                       Subtract =true;
                       editText.setText(null);

                       dis = dis+ String.valueOf(mValueOne)+ " - ";
                       display.setText(dis);
                   }
               }
               else if(Addition==true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne + mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne + mValueTwo;
                   Calculation = true;
                   Addition = false;
                   Subtract =true;

                   dis = dis+ String.valueOf(mValueTwo)+ " - ";
                   display.setText(dis);
               }
               else if(Subtract== true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne - mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne - mValueTwo;
                   Calculation = true;
                   Subtract=true;

                   dis = dis+ String.valueOf(mValueTwo)+ " - ";
                   display.setText(dis);
               }
               else if(Multiplication==true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne * mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne * mValueTwo;
                   Calculation = true;
                   Multiplication=false;
                   Subtract=true;

                   dis = dis+ String.valueOf(mValueTwo)+ " - ";
                   display.setText(dis);
               }
               else if(Division==true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne / mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne / mValueTwo;
                   Calculation = true;
                   Division=false;
                   Subtract=true;

                   dis = dis+ String.valueOf(mValueTwo)+ " - ";
                   display.setText(dis);
               }

           }
           else if(ve.getId()==R.id.mul)
           {
               if(Calculation==false)
               {
                   if (editText == null) {
                       editText.setText("");
                   } else {
                       mValueOne = Float.parseFloat(editText.getText() + "");
                       Calculation = true;
                       Multiplication=true;
                       editText.setText(null);

                       dis = dis+ String.valueOf(mValueOne)+ " * ";
                       display.setText(dis);
                   }
               }
              else if(Multiplication==true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne * mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne * mValueTwo;
                   Calculation = true;
                   Multiplication=true;

                   dis = dis+ String.valueOf(mValueTwo)+ " * ";
                   display.setText(dis);
               }
               else if(Addition==true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne + mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne + mValueTwo;
                   Calculation = true;
                   Addition = false;
                   Multiplication =true;

                   dis = dis+ String.valueOf(mValueTwo)+ " * ";
                   display.setText(dis);
               }
               else if(Subtract== true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne - mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne - mValueTwo;
                   Calculation = true;
                   Subtract=false;
                   Multiplication=true;

                   dis = dis+ String.valueOf(mValueTwo)+ " * ";
                   display.setText(dis);
               }
               else if(Division==true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne / mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne / mValueTwo;
                   Calculation = true;
                   Division=false;
                   Multiplication=true;

                   dis = dis+ String.valueOf(mValueTwo)+ " * ";
                   display.setText(dis);
               }

           }
           else if(ve.getId()==R.id.div)
           {
               if(Calculation==false)
               {
                   if (editText == null) {
                       editText.setText("");
                   } else {
                       mValueOne = Float.parseFloat(editText.getText() + "");
                       Calculation = true;
                       Division=true;
                       editText.setText(null);

                       dis = dis+ String.valueOf(mValueOne)+ " / ";
                       display.setText(dis);
                   }
               }
               else if(Division==true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne / mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne / mValueTwo;
                   Calculation = true;
                   Division=true;

                   dis = dis+ String.valueOf(mValueTwo)+ " / ";
                   display.setText(dis);
               }
               else if(Addition==true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne + mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne + mValueTwo;
                   Calculation = true;
                   Addition = false;
                   Division =true;

                   dis = dis+ String.valueOf(mValueTwo)+ " / ";
                   display.setText(dis);
               }
               else if(Subtract== true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne - mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne - mValueTwo;
                   Calculation = true;
                   Subtract=false;
                   Division=true;

                   dis = dis+ String.valueOf(mValueTwo)+ " / ";
                   display.setText(dis);
               }
               else if(Multiplication==true)
               {
                   mValueTwo = Float.parseFloat(editText.getText() + "");
                   text.setText(mValueOne * mValueTwo + "");
                   editText.setText("");
                   mValueOne=mValueOne * mValueTwo;
                   Calculation = true;
                   Multiplication=false;
                   Division=true;

                   dis = dis+ String.valueOf(mValueTwo)+ " / ";
                   display.setText(dis);
               }

           }
       }
       catch (Exception e)
       {
           Toast.makeText(page2.this,"Please Enter Numbers",Toast.LENGTH_SHORT).show();
       }

    }

    public void sub(View v)
    {
        try
        {
            mValueTwo = Float.parseFloat(editText.getText() + "");

            if (Addition == true) {
                text.setText(mValueOne + mValueTwo + "");
                editText.setText("");
                Calculation = false;
            }
            if (Subtract == true) {
                text.setText(mValueOne - mValueTwo + "");
                editText.setText("");
                Calculation = false;

                dis = dis+ String.valueOf(mValueTwo);
                display.setText(dis);
            }
            if (Multiplication == true) {
                text.setText(mValueOne * mValueTwo + "");
                editText.setText("");
                Calculation = false;

                dis = dis+ String.valueOf(mValueTwo);
                display.setText(dis);
            }
            if (Division == true) {
                text.setText(mValueOne / mValueTwo + "");
                editText.setText("");
                Calculation = false;

                dis = dis+ String.valueOf(mValueTwo);
                display.setText(dis);
            }


        }
        catch (Exception e)
        {
            Toast.makeText(page2.this,"Please Enter Numbers",Toast.LENGTH_SHORT).show();
        }
    }

    public void clear(View v)
    {
        mValueOne=0;
        mValueTwo=0;
        editText.setText("");
        text.setText("");
        Calculation = false;
        Addition=false;
        Subtract=false;
        Multiplication=false;
        Division=false;
        dis="";
        display.setText(dis);

    }

    public void world(View v)
    {
        Intent intent3 = new Intent(this,worldcup.class);
        startActivity(intent3);
    }

}
