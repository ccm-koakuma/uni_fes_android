import org.json.JSONObject
import org.json.JSONArray

var json_content
var json_content_array
var returnString

fun feedParse(feed: String): String{
	try{
		json_content = JSONObject(feed) as JSONObject
		returnString = json_content.getString("id") + 
						json_content.getString("title") +
						json_content.getString("link") + 
						json_content.getString("picture")
	}catch(e: Exception){
		returnString = "Failed to get data"
	}
}

fun timetableParse(timetable: String): String{
	try{
		json_content = JSONObject(timetable) as JSONObject
		returnString = json_content.getString("id") + 
						json_content.getString("title") + 
						json_content.getString("time") + 
						json_content.getString("till") + 
						json_content.getString("genre") +
						json_content.getString("detail") + 
						json_content.getString("location")
	}catch(e: Exception){
		returnString = "Failed to get data"
	}
}

fun stallsParse(stalls: String): String{
	try{
		json_content = JSONObject(stalls) as JSONObject
		json_content_array = json_content.getJSONObject("menu")
		returnString = json_content.getString("id") + 
						json_content.getString("stname") +
						json_content.getString("slname") + 
						json_content.getString("picture") + 
						json_content.getString("detail") + 
						json_content.getString("location") + 
						json_content.getString("menu") + 
						json_content_array.getString("pname") + 
						json_content_array.getString("price")

	}
}