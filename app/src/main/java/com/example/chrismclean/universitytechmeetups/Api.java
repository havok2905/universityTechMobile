package com.example.chrismclean.universitytechmeetups;

import android.content.Context;

import com.google.gson.JsonArray;
import com.koushikdutta.ion.Ion;
import com.koushikdutta.async.future.Future;
import com.google.gson.JsonObject;

import java.util.ArrayList;

public class Api {
  private static String route = "http://www.universitytechmeetups.com/home.json";

  public static Future<JsonObject> getMeetups(Context context) {
    return Ion.with(context).load(route).asJsonObject();
  }

  public static ArrayList<Meetup> jsonToMeetups(JsonObject json) {
    ArrayList<Meetup> meetups = new ArrayList<>();

    JsonArray events = json.getAsJsonArray("events");

    for (int x = 0; x < events.size(); x++) {
      String orgString;
      String dateString;
      String nameString;

      JsonObject event = events.get(x).getAsJsonObject();

      try {
        JsonObject info = event.getAsJsonObject("info");
        nameString = info.getAsJsonObject().getAsJsonPrimitive("name").getAsString();
        dateString = info.getAsJsonObject().getAsJsonPrimitive("start_date").getAsString();
      }
      catch(Exception e) {
        nameString = "";
        dateString = "";
      }

      try {
        JsonObject org = event.getAsJsonObject("org");
        orgString = org.getAsJsonObject().getAsJsonPrimitive("name").getAsString();
      }
      catch(Exception e) {
        orgString = "";
      }

      meetups.add(new Meetup(orgString, nameString, dateString));
    }

    return meetups;
  }
}
