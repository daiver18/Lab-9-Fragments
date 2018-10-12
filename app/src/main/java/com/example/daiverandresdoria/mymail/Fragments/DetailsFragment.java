package com.example.daiverandresdoria.mymail.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.daiverandresdoria.mymail.Models.Mails;
import com.example.daiverandresdoria.mymail.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {
    private TextView sender;
    private TextView subject;
    private TextView message;

    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        sender = view.findViewById(R.id.sender);
        subject = view.findViewById(R.id.subject);
        message = view.findViewById(R.id.message);

        return view;
    }

    public void renderMail(Mails mail){
        sender.setText(mail.getSenderName());
        subject.setText(mail.getSubject());
        message.setText(mail.getMessaje());
    }

}
