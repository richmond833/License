package com.example.driverlicenseinputoutput;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.driverlicenseinputoutput.MainActivity2;


public class MainActivity extends AppCompatActivity {
    EditText name, address, birthday, gender, height, weight, nationality, restrictions, conditions, agy, expires, license, date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R. id. name);
        address = findViewById(R. id. address);
        birthday=findViewById(R. id. bday);
        gender = findViewById(R. id. sex);
        height=findViewById(R. id. height);
        weight = findViewById(R. id. weight);
        nationality=findViewById(R. id. nationality);
        restrictions = findViewById(R. id. restrictions);
        conditions=findViewById(R. id. condition);
        agy = findViewById(R. id. agy);
        expires=findViewById(R. id. expires);
        license = findViewById(R. id. lnum);
        date = findViewById(R. id. date);
    }

    public void btnGo(View view) {
        String nme = name.getText().toString();
        String add = address.getText().toString();
        String bday = birthday.getText().toString();
        String gen = gender.getText().toString();
        String ht = height.getText().toString();
        String wt = weight.getText().toString();
        String nat = nationality.getText().toString();
        String res = restrictions.getText().toString();
        String con = conditions.getText().toString();
        String a = agy.getText().toString();
        String exp = expires.getText().toString();
        String lcns = license.getText().toString();
        String dte = date.getText().toString();

        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        intent.putExtra("keyName" , nme);
        intent.putExtra("keyAdd", add);
        intent.putExtra("keyBday" , bday);
        intent.putExtra("keyGen", gen);
        intent.putExtra("keyHt" , ht);
        intent.putExtra("keyWt", wt);
        intent.putExtra("keyNat" , nat);
        intent.putExtra("keyRes", res);
        intent.putExtra("ketCon" , con);
        intent.putExtra("keyA", a);
        intent.putExtra("keyExp" , exp);
        intent.putExtra("keyLcns", lcns);
        intent.putExtra("keyDte", dte);
        startActivity(intent);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


    }
}
