package ru.kpfu.itis.ibragimov.models;

public class Response {
  private TimeBuses[] response;

  public Response(TimeBuses[] response) {
    this.response = response;
  }

  public TimeBuses[] getResponse() {
    return response;
  }

  public void setResponse(TimeBuses[] response) {
    this.response = response;
  }
}
