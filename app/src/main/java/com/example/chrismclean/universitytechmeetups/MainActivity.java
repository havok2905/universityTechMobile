package com.example.chrismclean.universitytechmeetups;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.JsonObject;

import com.koushikdutta.async.future.FutureCallback;

public class MainActivity extends ActionBarActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);

    final ListView meetupsList = (ListView) findViewById(R.id.meetups_list);
    final MeetupAdapter meetupAdapter = new MeetupAdapter(this, new ArrayList<Meetup>());

    meetupsList.setAdapter(meetupAdapter);

    Api.getMeetups(this).setCallback(new FutureCallback<JsonObject>() {
      @Override
      public void onCompleted(Exception e, JsonObject result) {
        if (e != null) {
          Toast.makeText(getApplicationContext(), "Error loading meetups", Toast.LENGTH_LONG).show();
          return;
        }

        meetupAdapter.addAll(Api.jsonToMeetups(result));
      }
    });
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
        return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
