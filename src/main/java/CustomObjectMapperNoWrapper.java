import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize;

public class CustomObjectMapperNoWrapper extends ObjectMapper {

    public CustomObjectMapperNoWrapper() {
    super();
    super.configure(SerializationConfig.Feature.WRAP_ROOT_VALUE, false);
    super.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
    }

}