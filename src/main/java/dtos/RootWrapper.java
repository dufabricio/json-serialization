package dtos;

import java.util.List;

public class RootWrapper {
  private List<Foo> foos;

  public List<Foo> getFoos() {
    return foos;
  }

  public void setFoos(List<Foo> foos) {
    this.foos = foos;
  }
 }