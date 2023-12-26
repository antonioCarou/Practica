package com.uoc.practica.controller;

import com.uoc.practica.model.New;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewsController {
  @Autowired private JdbcTemplate jdbcTemplate;

  @GetMapping("/news")
  public String showNew(@RequestParam(value = "id") Long id, Model modelView) {
    //Typamos el id como Long, esto nos permite evitar cualquier tipo de inserción de cadenas de caracteres en el parámetro
    //De manera adicional parametrizamos la query
    String sql = "SELECT * FROM news WHERE id = ?";
    List<New> newsList =
        jdbcTemplate.query(
            sql,
            //La parametrización de la query nos permite especificar el tipo de datos que vamos a utilizar para el id
            new Long[] {id},
            (rs, rowNum) ->
                New.builder()
                    .id(rs.getLong("id"))
                    .title(rs.getString("title"))
                    .body(rs.getString("body"))
                    .dateTime(rs.getTimestamp("date_time").toLocalDateTime())
                    .build());
    if (!newsList.isEmpty()) {
      modelView.addAttribute("news", newsList.get(0));
      return "news";
    } else {
      return "news-not-found";
    }
  }
}
