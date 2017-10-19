import org.json.JSONObject
import org.json.JSONArray

open class jsonParser {
	fun articleParse(article: String, number: Int): String {
		var returnString = ""
		try {
			val jsonarray = JSONArray(article) as JSONArray
			val jsonobj = jsonarray.getJSONObject(number) as JSONObject
			returnString = jsonobj.getString("id") + "," +
					jsonobj.getString("title") + "," +
					jsonobj.getString("link") + "," +
					jsonobj.getString("picture")
		} catch(e: Exception) {
			returnString = "Failed to get data"
		}
		return returnString
	}

	fun timetableParse(timetable: String): String {
		var returnString = ""
		try {
			returnString = ""
		} catch(e: Exception) {
			returnString = "Failed to get data"
		}
		return returnString
	}

	fun stallsParse(stalls: String): String {
		var returnString = ""
		try {
			returnString = ""
		} catch(e: Exception) {
			returnString = "Failed to get data"
		}
		return returnString
	}
}