package com.ciant.techgallery.sample.service.model;

import java.util.ArrayList;
import java.util.List;

/**
 * TechnologyResponse entity.
 * 
 * @author Felipe Goncalves de Castro
 *
 */
public class TechnologyResponse extends Response {

  private Long id;
  private String name;
  private List<RecommendationResponse> recommendations = new ArrayList<RecommendationResponse>();

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<RecommendationResponse> getRecommendationsResponse() {
    return recommendations;
  }

  public void setRecommendations(List<RecommendationResponse> recommendations) {
    this.recommendations = recommendations;
  }
  
}
