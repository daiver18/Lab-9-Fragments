package com.example.daiverandresdoria.mymail.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.daiverandresdoria.mymail.Fragments.DetailsFragment;
import com.example.daiverandresdoria.mymail.Models.Mails;
import com.example.daiverandresdoria.mymail.R;

import java.util.List;

public class DetailsActivity extends AppCompatActivity {
    private String sender;
    private String subject;
    private String messge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        if (getIntent().getExtras() != null){
            sender = getIntent().getStringExtra("sender");
            subject = getIntent().getStringExtra("subject");
            messge = getIntent().getStringExtra("message");


            Mails mail = new Mails(subject,messge,sender);
            DetailsFragment detailsFragments = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.DetailsFragment);
            detailsFragments.renderMail(mail);
        }
    }
}
