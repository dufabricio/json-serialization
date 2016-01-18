import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class ORGJSONOperations {

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
