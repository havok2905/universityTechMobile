package com.example.chrismclean.universitytechmeetups;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

  private Meetup[] meetups = {
    new Meetup("University JavaScript", "My JavaScript Event" ,"10/10/10"),
    new Meetup("University Ruby", "My Ruby Event", "10/10/10"),
    new Meetup("University CSS", "My CSS Event", "10/10/10"),
    new Meetup("University Mobile", "My Mobile Event", "10/10/10")
  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ListView meetupsList = (ListView) findViewById(R.id.meetups_list);
    meetupsList.setAdapter(new MeetupAdapter(this, meetups));
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
