package io.swagger;

import com.fasterxml.jackson.databind.util.StdDateFormat;

import java.text.FieldPosition;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.TimeZone;
import java.util.Locale;

@SuppressWarnings("serial")
public class RFC3339DateFormat extends DateFormat {

  public RFC3339DateFormat() {
    System.out.print("RFC3339DateFormat");
  }

  @Override
  public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
    this._formatter.format(date, toAppendTo, fieldPosition);
    return toAppendTo;
  }

  @Override
  public Date parse(String dateStr) throws ParseException {
    return this._formatter.parse(dateStr);
  }

  @Override
  public Date parse(String dateStr, ParsePosition pos) {
    return this._formatter.parse(dateStr, pos);
  }

  @Override
  public void setTimeZone(TimeZone tz) {
    this._formatter.setTimeZone(tz);
  }

  @Override
  public RFC3339DateFormat clone() {
    RFC3339DateFormat c = new RFC3339DateFormat();
    c._formatter = this._formatter.clone();
    return c;
  }

  private StdDateFormat _formatter = new StdDateFormat();
}

/*
@SuppressWarnings("serial")
public class RFC3339DateFormat extends StdDateFormat {

  public RFC3339DateFormat() {
    System.out.print("RFC3339DateFormat");
  }

  public RFC3339DateFormat(TimeZone tz, Locale loc, Boolean lenient,
  boolean formatTzOffsetWithColon) {
    super(tz, loc, lenient, formatTzOffsetWithColon);
  }

  @Override
  public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
    super.format(date, toAppendTo, fieldPosition);
    return toAppendTo;
  }

  @Override
  public Date parse(String dateStr) throws ParseException {
    return super.parse(dateStr);
  }

  @Override
  public Date parse(String dateStr, ParsePosition pos) {
    return super.parse(dateStr, pos);
  }

  @Override
  public RFC3339DateFormat clone() {
    return new RFC3339DateFormat(_timezone, _locale, _lenient, this.isColonIncludedInTimeZone());
  }

  public RFC3339DateFormat withTimeZone(TimeZone tz) {
    if (tz == null) {
        tz = DEFAULT_TIMEZONE;
    }
    if ((tz == _timezone) || tz.equals(_timezone)) {
        return this;
    }
    return new RFC3339DateFormat(tz, _locale, _lenient, this.isColonIncludedInTimeZone());
}  
}*/