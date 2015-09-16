import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestJacksonSerialization {




    @Test
    public void writeToNoWrapper() throws Exception {

        RootWrapper rootWrapper = new RootWrapper();
        ArrayList<Foo> foos = new ArrayList<Foo>();
        foos.add(new Foo("Chuck Norris"));
        foos.add(new Foo("Silvester Stallone"));
        rootWrapper.setFoos(foos);

        ObjectMapper mapperWrapper = new CustomObjectMapperWrapper();
        String jsonResult = mapperWrapper.writeValueAsString(rootWrapper);
        Assert.assertTrue(jsonResult.contains("RootWrapper"));
        System.out.println(jsonResult);

        ObjectMapper mapperNoWrapper = new CustomObjectMapperNoWrapper();
        jsonResult = mapperNoWrapper.writeValueAsString(rootWrapper);
        Assert.assertFalse(jsonResult.contains("RootWrapper"));
        System.out.println(jsonResult);
    }

    @Test
    public void writeToCustomRootNameWrapper() throws Exception {

        RootWrapperCustomName rootWrapper = new RootWrapperCustomName();
        ArrayList<Foo> foos = new ArrayList<Foo>();
        foos.add(new Foo("Chuck Norris"));
        foos.add(new Foo("Silvester Stallone"));
        rootWrapper.setFoos(foos);

        ObjectMapper mapperWrapper = new CustomObjectMapperWrapper();
        String jsonResult = mapperWrapper.writeValueAsString(rootWrapper);
//        Assert.assertTrue(jsonResult.contains("RootWrapper"));
        System.out.println(jsonResult);

        ObjectMapper mapperNoWrapper = new CustomObjectMapperNoWrapper();
        jsonResult = mapperNoWrapper.writeValueAsString(rootWrapper);
//        Assert.assertFalse(jsonResult.contains("RootWrapper"));
        System.out.println(jsonResult);
    }



}
