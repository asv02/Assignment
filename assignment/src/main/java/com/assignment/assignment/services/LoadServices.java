package com.assignment.assignment.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.assignment.entities.Load;

@Service
public interface LoadServices {
  public void addLoad(Load load);
//  public List<Load> listgetbyId(String id);
  public Load getbyId(int id);
//  public void deletebyId(String id);
//  public Load updatebyId(Load load, String id);
}
