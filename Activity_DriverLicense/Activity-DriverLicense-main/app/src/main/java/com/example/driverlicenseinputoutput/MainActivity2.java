package com.example.driverlicenseinputoutput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tViewName, tViewAddress, tViewBirthday, tViewGender, tViewHeight, tViewWeight, tViewNationality, tViewRestrictions, tViewConditions, tViewAgy, tViewExpires, tViewLicense, tViewDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tViewName=findViewById(R. id. textViewName);
        tViewAddress = findViewById(R. id. textViewAddress);
        tViewBirthday=findViewById(R. id. textViewBirthdate);
        tViewGender=findViewById(R. id. textViewGender);
        tViewHeight=findViewById(R. id. textViewHeight);
        tViewWeight=findViewById(R. id. textViewWeight);
        tViewNationality=findViewById(R. id. textViewNationality);
        tViewRestrictions=findViewById(R. id. textViewRestrictions);
        tViewConditions=findViewById(R. id. textViewConditions);
        tViewAgy=findViewById(R. id. textViewAgy);
        tViewExpires=findViewById(R. id. textViewExpires);
        tViewLicense=findViewById(R. id. textViewLicense);
        tViewDate=findViewById(R. id. textViewDate);

        String textName = getIntent().getExtras().getString("keyName");
        String textAddress = getIntent().getExtras().getString("keyAdd");
        String textBday = getIntent().getExtras().getString("keyBday");
        String textGender = getIntent().getExtras().getString("keyGen");
        String textHeight = getIntent().getExtras().getString("keyHt");
        String textWeight = getIntent().getExtras().getString("keyWt");
        String textNationality = getIntent().getExtras().getString("keyNat");
        String textRestrictions = getIntent().getExtras().getString("keyRes");
        String textCondition = getIntent().getExtras().getString("keyCon");
        String textAgy = getIntent().getExtras().getString("keyA");
        String textExpires = getIntent().getExtras().getString("keyExp");
        String textLicense = getIntent().getExtras().getString("keyLcns");
        String textDate = getIntent().getExtras().getString("keyDte");

        tViewName.setText(textName);
        tViewAddress.setText(textAddress);
        tViewBirthday.setText(textBday);
        tViewGender.setText(textGender);
        tViewHeight.setText(textHeight);
        tViewWeight.setText(textWeight);
        tViewNationality.setText(textNationality);
        tViewRestrictions.setText(textRestrictions);
        tViewConditions.setText(textCondition);
        tViewAgy.setText(textAgy);
        tViewExpires.setText(textExpires);
        tViewLicense.setText(textLicense);
        tViewDate.setText(textDate);


    }
}