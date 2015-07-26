package com.example.chrismclean.universitytechmeetups;

public class Meetup {
  private String org;
  private String name;
  private String date;

  public Meetup(String org, String name, String date) {
    this.org = org;
    this.name = name;
    this.date = date;
  }

  public String getName() {
    if(this.name == "") {
      return "Coming Soon";
    }
    return this.name;
  }

  public String getDate() {
    if(this.date == "") {
      return "Coming Soon";
    }
    return DateTranslator.fromDateTime(this.date);
  }

  public String getOrg() {
    return this.org;
  }

  public Integer getColor() {
    Integer color;

    switch(this.org) {
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
