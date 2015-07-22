package com.example.chrismclean.universitytechmeetups;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MeetupAdapter extends BaseAdapter {
  private Context mContext;

  private String[] meetups = {
    "University JavaScript",
    "University CSS",
    "University Ruby",
    "University iOS",
    "University Android"
  };

  public MeetupAdapter(Context c) {
    mContext = c;
  }

  public int getCount() {
    return meetups.length;
  }

  public Object getItem(int position) {
    return meetups[position];
  }

  public long getItemId(int position) {
    return 0;
  }

  public View getView(int position, View convertView, ViewGroup parent) {
    TextView meetupText;

    if(convertView == null) {
      meetupText = new TextView(mContext);
    }
    else {
      meetupText = (TextView) convertView;
    }

    meetupText.setText(meetups[position]);

    return meetupText;
  }
}
