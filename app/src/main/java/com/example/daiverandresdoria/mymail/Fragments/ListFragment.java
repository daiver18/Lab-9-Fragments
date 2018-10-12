package com.example.daiverandresdoria.mymail.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.daiverandresdoria.mymail.Adapters.MyAdapter;
import com.example.daiverandresdoria.mymail.Models.Mails;
import com.example.daiverandresdoria.mymail.R;
import com.example.daiverandresdoria.mymail.Utils.Utils;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {
    private ListView listView;
    private List<Mails> listMail;
    private MyAdapter myAdapter;

    private Comunication callback;

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        listView = view.findViewById(R.id.ListView);
        listMail = Utils.getDummyData();
        myAdapter = new MyAdapter(R.layout.list_view_item,getContext(),listMail);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                callback.onClickLisener(listMail.get(position));
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Comunication){
            callback = (Comunication) context;
        }else{
            throw new RuntimeException(context.toString()+"must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        callback = null;
    }

    public interface Comunication{
        void onClickLisener(Mails mail);
    }
}
