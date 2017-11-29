/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171129;
import org.json.*;
/**
 *
 * @author Tanulo
 */
public class jSonRead {

  public static void main(String[] args) {
    
 

publicJSONObject obj = new JSONObject(" .... ");
String pageName = obj.getJSONObject("pageInfo").getString("pageName");

JSONArray arr = obj.getJSONArray("posts");
for (int i = 0; i < arr.length(); i++)
{
    String post_id = arr.getJSONObject(i).getString("post_id");
    ......
}
  
  
  
   }
  
  
  
  
  
  
  
  
}
