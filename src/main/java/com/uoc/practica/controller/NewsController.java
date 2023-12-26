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

    String sql = "select * from news where id = " + id;
    List<New> newsList =
        jdbcTemplate.query(
            sql,
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
