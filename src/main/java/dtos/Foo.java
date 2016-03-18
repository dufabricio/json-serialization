package dtos;

public class Foo {

    @Apelido(valor = "Natan")
    private String name;

    @FaseIdade(valor = "Adulto")
    private Integer age;

    public Foo() {
    }

    public Foo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
