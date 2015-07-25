package com.example.chrismclean.universitytechmeetups;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTranslator {

  public static String fromDateTime(String datetime) {
    Date date;
    String dateString;

    try {
      date = fromDatetimeFormatter().parse(datetime);
      dateString = prettyFormatter().format(date);
    }
    catch (ParseException e) {
      dateString = "N/A";
    }

    return dateString;
  }

  private static SimpleDateFormat fromDatetimeFormatter() {
    return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH);
  }

  private static SimpleDateFormat prettyFormatter() {
    return new SimpleDateFormat("MM/dd/yyyy hh:mm", Locale.ENGLISH);
  }
}