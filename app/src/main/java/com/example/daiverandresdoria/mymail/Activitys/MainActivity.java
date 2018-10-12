package com.example.daiverandresdoria.mymail.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.daiverandresdoria.mymail.Fragments.DetailsFragment;
import com.example.daiverandresdoria.mymail.Fragments.ListFragment;
import com.example.daiverandresdoria.mymail.Models.Mails;
import com.example.daiverandresdoria.mymail.R;

public class MainActivity extends AppCompatActivity implements ListFragment.Comunication{
    private Boolean isMultiPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMultiPanel();
    }
    @Override
    public void onClickLisener(Mails mail) {
        if (isMultiPanel){
            DetailsFragment detailsFragments = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.DetailsFragment);
            detailsFragments.renderMail(mail);
        }else{
            Intent intent = new Intent(this,DetailsActivity.class);
            intent.putExtra("subject", mail.getSubject());
            intent.putExtra("sender",mail.getSenderName());
            intent.putExtra("message",mail.getMessaje());
            startActivity(intent);
        }
    }
    public void setMultiPanel(){
        isMultiPanel = (getSupportFragmentManager().findFragmentById(R.id.DetailsFragment) != null);
    }

}
