package com.example.chrismclean.universitytechmeetups;

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

  public String getColor() {
    String color;

    switch(this.name) {
      case "University JavaScript":
        color = "blue";
        break;
      case "University Ruby":
        color = "red";
        break;
      case "University CSS":
        color = "purple";
        break;
      case "University Mobile":
        color = "green";
        break;
      default:
        color = "blue";
        break;
    }

    return color;
  }
}
