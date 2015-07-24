package com.example.chrismclean.universitytechmeetups;

import android.graphics.Color;

public class Meetup {
  private String name;
  private String date;

  public Meetup(String name, String date) {
    this.name = name;
    this.date = date;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Integer getColor() {
    Integer color;

    switch(this.name) {
      case "University JavaScript":
        color = 0xFF2196F3;
        break;
      case "University Ruby":
        color = 0xFFF44336;
        break;
      case "University CSS":
        color = 0xFF9C27B0;
        break;
      case "University Mobile":
        color = 0xFF8BC34A;
        break;
      default:
        color = 0xFF2196F3;
        break;
    }

    return color;
  }
}
