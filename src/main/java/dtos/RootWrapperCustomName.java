package dtos;

import org.codehaus.jackson.map.annotate.JsonRootName;

import java.util.List;

@JsonRootName("CustomRootNameWrapper")
public class RootWrapperCustomName {
  private List<Foo> foos;

  public List<Foo> getFoos() {
    return foos;
  }

  public void setFoos(List<Foo> foos) {
    this.foos = foos;
  }
 }