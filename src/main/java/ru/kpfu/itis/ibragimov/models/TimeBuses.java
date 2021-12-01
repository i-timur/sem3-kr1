package ru.kpfu.itis.ibragimov.models;

public class TimeBuses {
  private String updated_at;
  private Bus[] buses;

  public TimeBuses(String updated_at, Bus[] buses) {
    this.updated_at = updated_at;
    this.buses = buses;
  }

  public String getUpdated_at() {
    return updated_at;
  }

  public void setUpdated_at(String updated_at) {
    this.updated_at = updated_at;
  }

  public Bus[] getBuses() {
    return buses;
  }

  public void setBuses(Bus[] buses) {
    this.buses = buses;
  }
}
