import org.json.JSONArray;
import org.json.JSONObject;

public class FilterJSONByAge {
    public static void main(String[] args) {
        String json = "[{\"name\":\"Eve\",\"age\":24},{\"name\":\"Mike\",\"age\":26}]";
        JSONArray jsonArray = new JSONArray(json);
        JSONArray filteredArray = new JSONArray();

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            if (obj.getInt("age") > 25) {
                filteredArray.put(obj);
            }
        }

        System.out.println(filteredArray.toString());
    }
}

