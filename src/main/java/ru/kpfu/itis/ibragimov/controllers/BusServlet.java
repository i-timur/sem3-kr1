package ru.kpfu.itis.ibragimov.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.kpfu.itis.ibragimov.client.HttpClient;
import ru.kpfu.itis.ibragimov.client.HttpClientImpl;
import ru.kpfu.itis.ibragimov.models.Bus;
import ru.kpfu.itis.ibragimov.models.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bus")
public class BusServlet extends HttpServlet {

  private final static String URL = "http://data.kzn.ru:8082/api/v0/dynamic_datasets/bus.json";

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    HttpClient client = new HttpClientImpl();
    String busResponse = client.get(URL, null, null);

    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();
    Response parsedBusResponse = gson.fromJson(busResponse, Response.class);

    resp.setContentType("text/plain");
    resp.setCharacterEncoding("UTF-8");

    String marsh = req.getParameter("text");

    for (Bus bus : parsedBusResponse.getResponse()[0].getBuses()) {
      if (marsh.equals(bus.getMarsh())) {
        resp.getWriter().write( bus.getLatitude() + " " + bus.getLongitude());
        return;
      }
    }
  }

}
