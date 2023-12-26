package com.uoc.practica.controller;

import com.uoc.practica.model.New;
import java.util.List;

import com.uoc.practica.model.NewsRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewsController {
  @Autowired NewsRepository newsRepository;

  @GetMapping("/news")
  public String showNew(@RequestParam(value = "id") Long id, Model modelView) {

    New aNew = newsRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    modelView.addAttribute("news", aNew);
    return "news";
  }
}
