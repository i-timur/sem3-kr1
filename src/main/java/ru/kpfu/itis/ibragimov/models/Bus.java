package ru.kpfu.itis.ibragimov.models;

public class Bus {
  private String garagNumb;
  private String azimuth;
  private String graph;
  private String latitude;
  private String longitude;
  private String marsh;
  private String smena;
  private String speed;
  private String timeNav;

  public Bus(String garagNumb, String azimuth, String graph, String latitude, String longitude, String marsh, String smena, String speed, String timeNav) {
    this.garagNumb = garagNumb;
    this.azimuth = azimuth;
    this.graph = graph;
    this.latitude = latitude;
    this.longitude = longitude;
    this.marsh = marsh;
    this.smena = smena;
    this.speed = speed;
    this.timeNav = timeNav;
  }

  public String getGaragNumb() {
    return garagNumb;
  }

  public void setGaragNumb(String garagNumb) {
    this.garagNumb = garagNumb;
  }

  public String getAzimuth() {
    return azimuth;
  }

  public void setAzimuth(String azimuth) {
    this.azimuth = azimuth;
  }

  public String getGraph() {
    return graph;
  }

  public void setGraph(String graph) {
    this.graph = graph;
  }

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public String getMarsh() {
    return marsh;
  }

  public void setMarsh(String marsh) {
    this.marsh = marsh;
  }

  public String getSmena() {
    return smena;
  }

  public void setSmena(String smena) {
    this.smena = smena;
  }

  public String getSpeed() {
    return speed;
  }

  public void setSpeed(String speed) {
    this.speed = speed;
  }

  public String getTimeNav() {
    return timeNav;
  }

  public void setTimeNav(String timeNav) {
    this.timeNav = timeNav;
  }
}
