import dtos.Apelido;
import dtos.FaseIdade;
import dtos.Foo;
import org.junit.Test;

import java.lang.reflect.Field;

public class TesteReflectExample {


    @Test
    public void testReflectionGetFieldValues() throws Exception {

        Foo nataniel = new Foo();
        nataniel.setName("Nataniel");
        nataniel.setAge(19);

        Field[] atributos = nataniel.getClass().getDeclaredFields();

        for(int i = 0; i < atributos.length ; i++){

            Field atributo = atributos[i];
            String atributoNome = atributo.getName();
            Class atributoTipo = atributo.getType();

            atributo.setAccessible(true);

            if(atributoTipo.isAssignableFrom(String.class)){
                String valor = (String)atributo.get(nataniel);
                System.out.println(atributoTipo+" "+atributoNome+" "+valor);
            }else if(atributoTipo.isAssignableFrom(Integer.class)){
                Integer valor = (Integer)atributo.get(nataniel);
                System.out.println(atributoTipo+" "+atributoNome+" "+valor);
            }

        }
    }


    @Test
    public void testAnnotations() throws Exception {

        Foo nataniel = new Foo();
        nataniel.setName("Nataniel");
        nataniel.setAge(19);

        Field[] atributos = nataniel.getClass().getDeclaredFields();

        for(int i = 0; i < atributos.length ; i++){

            Field atributo = atributos[i];
            String atributoNome = atributo.getName();
            Class atributoTipo = atributo.getType();

            atributo.setAccessible(true);

            if(atributoTipo.isAssignableFrom(String.class)){
                String valor = (String)atributo.get(nataniel);

                Apelido apelido = atributo.getAnnotation(Apelido.class);
                System.out.println(atributoTipo + " " + atributoNome + " " + valor + ", pode me chamar de " + apelido.valor());
            }else if(atributoTipo.isAssignableFrom(Integer.class)){
                Integer valor = (Integer)atributo.get(nataniel);

                FaseIdade fase = atributo.getAnnotation(FaseIdade.class);
                System.out.println(atributoTipo + " " + atributoNome + " " + valor + ", eu sou " + fase.valor());
            }

        }
    }
}
