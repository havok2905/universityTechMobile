package com.example.chrismclean.universitytechmeetups;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MeetupAdapter extends ArrayAdapter<Meetup> {
  public MeetupAdapter(Context context, ArrayList<Meetup> data) {
    super(context, R.layout.meetup_item, data);
  }

  @Override
  public View getView(int position, View view, ViewGroup parent) {
    TextView nameView;
    TextView dateView;
    TextView orgView;

    Context context = this.getContext();
    LayoutInflater inflater = LayoutInflater.from(context);

    if(view == null) {
      Meetup meetup = getItem(position);
      view = inflater.inflate(R.layout.meetup_item, null, false);
      nameView = (TextView)view.findViewById(R.id.meetup_name);
      dateView = (TextView)view.findViewById(R.id.meetup_date);
      orgView = (TextView)view.findViewById(R.id.meetup_org);

      nameView.setText(meetup.getName());
      dateView.setText(meetup.getDate());
      orgView.setText(meetup.getOrg());

      view.setBackgroundColor(meetup.getColor());
    }

    return view;
  }
}
