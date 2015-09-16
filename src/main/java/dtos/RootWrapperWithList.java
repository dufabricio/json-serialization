package dtos;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class RootWrapperWithList {

  @JsonProperty("fooList")
  private List<Foo> foos;


  public List<Foo> getFoos() {
    return foos;
  }


  public void setFoos(List<Foo> foos) {
    this.foos = foos;
  }
 }