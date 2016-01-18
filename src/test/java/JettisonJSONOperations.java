import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class JettisonJSONOperations {

    JSONObject jsonObject = new JSONObject();

    @Before
    public void preCreateJsonObject (){

        try {

            jsonObject.put("groupName","administrators");

            JSONArray members = new JSONArray();
            members.put("edward");
            members.put("richard");
            members.put("john");

            jsonObject.put("members", members);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        System.out.println(jsonObject.toString());
    }

    @Test
    public void addingElementToJSONArray (){

        try {

            jsonObject.append("members", "batman");

        } catch (JSONException e) {
            e.printStackTrace();
        }

        System.out.println(jsonObject.toString());
    }
}
