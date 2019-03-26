  package com.example.task3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

  public class MainActivity extends AppCompatActivity {
      RadioButton r1_answer;
      RadioButton r2_answer;
      RadioButton r3_answer;
      RadioButton r4_answer;
      RadioButton r5_answer;
      RadioButton r6_answer;
      EditText text;
      CheckBox ch1_answer;
      CheckBox ch2_answer;
      CheckBox ch3_answer;
      CheckBox ch4_answer;
      CheckBox ch5_answer;
      CheckBox ch6_answer;
      Button button_submit;
      RadioGroup group1;
      RadioGroup group2;
      int i = 0;
      int scoreq2;
      int scoreq4;
      int j = 0;
      @Override
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
          group2 = findViewById(R.id.rg);
          r1_answer = findViewById(R.id.r1);
          r2_answer = findViewById(R.id.r2);
          r3_answer = findViewById(R.id.r3);
          r4_answer = findViewById(R.id.r4);
          r5_answer = findViewById(R.id.r5);
          r6_answer = findViewById(R.id.r6);
          group1 = findViewById(R.id.rg1);
          button_submit = findViewById(R.id.b);
          ch1_answer = findViewById(R.id.ch1);
          ch2_answer = findViewById(R.id.ch2);
          ch3_answer = findViewById(R.id.ch3);
          ch4_answer = findViewById(R.id.ch4);
          ch5_answer = findViewById(R.id.ch5);
          ch6_answer = findViewById(R.id.ch6);
          text = findViewById(R.id.et1);
          group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(RadioGroup group, int checkedId) {
                  switch (checkedId) {
                      case R.id.r1:
                          i += 4;

                          break;
                      case R.id.r2:
                          i -= 4;
                          break;
                      case R.id.r3:
                          i -= 4;
                          break;
                  }
              }
          });

          group2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(RadioGroup group, int checkedId) {
                  switch (checkedId) {
                      case R.id.r4:
                          i += 4;
                          break;

                      case R.id.r5:
                          i -= 4;
                          break;
                      case R.id.r6:
                          i -= 4;
                          break;
                  }
              }
          });
          button_submit.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  if (ch1_answer.isChecked()&&ch2_answer.isChecked()&&!ch3_answer.isChecked()){
                      scoreq2+=8;
                  }
                  else if(ch4_answer.isChecked()&&ch5_answer.isChecked()&&!ch6_answer.isChecked()){
                      scoreq4+=8;
                  }
                  else if(text.getText().toString().equals("mos")){
                      j+=4;
                  }


                  Toast.makeText(MainActivity.this, (i +scoreq4+scoreq2 + j)+"/" +28+ "", Toast.LENGTH_LONG).show();
              }
          });

      }



    }