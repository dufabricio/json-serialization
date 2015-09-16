import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize;

public class CustomObjectMapperWrapper extends ObjectMapper {

    public CustomObjectMapperWrapper() {
    super();
    super.configure(SerializationConfig.Feature.WRAP_ROOT_VALUE, true);
    super.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
    }

}