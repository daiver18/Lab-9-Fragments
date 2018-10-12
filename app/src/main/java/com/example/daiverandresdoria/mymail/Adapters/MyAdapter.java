package com.example.daiverandresdoria.mymail.Adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.daiverandresdoria.mymail.Models.Mails;
import com.example.daiverandresdoria.mymail.R;
import com.example.daiverandresdoria.mymail.Utils.Utils;

import java.util.List;
import java.util.zip.Inflater;

public class MyAdapter extends BaseAdapter {
    private int layout;
    private Context context;
    private List<Mails> listMail;
    private final int SUBJECT_MAX = 40;


    public MyAdapter(int layout, Context context, List<Mails> listMail) {
        this.layout = layout;
        this.context = context;
        this.listMail = listMail;
    }

    @Override
    public int getCount() {
        return listMail.size();
    }

    @Override
    public Mails getItem(int position) {
        return listMail.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(this.layout,null);
            holder = new ViewHolder();
            holder.Fab = (TextView)convertView.findViewById(R.id.FAB);
            holder.sendName = (TextView)convertView.findViewById(R.id.SendName);
            holder.subject = (TextView)convertView.findViewById(R.id.Subject);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        final Mails mails = getItem(position);
        holder.Fab.setText(mails.getSenderName().substring(0,1));
        holder.Fab.setTextSize(20);
        holder.Fab.getBackground().setColorFilter(mails.getColor(), PorterDuff.Mode.SRC);
        String currentSubjet = mails.getSubject();
        if (currentSubjet.length() > SUBJECT_MAX){
            String shortSubjet = currentSubjet.substring(0,SUBJECT_MAX)+"...";
            holder.subject.setText(shortSubjet);
        }else{
            holder.subject.setText(mails.getSubject());
        }
        holder.sendName.setText(mails.getSenderName());
        return convertView;
    }

    static class ViewHolder{
        private TextView Fab;
        private TextView sendName;
        private TextView subject;
    }
}
