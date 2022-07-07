package com.fa.jsonparser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        writeData()

    }

    fun writeData() {
        try {
            val jsondata = "{\"kelimeler\":[{\"kelime_id\":\"1\",\"ingilizce\":\"apple\",\"turkce\":\"elma\"},{\"kelime_id\":\"2\",\"ingilizce\":\"door\",\"turkce\":\"kap\\u0131\"},{\"kelime_id\":\"3\",\"ingilizce\":\"pencil\",\"turkce\":\"kalem\"},{\"kelime_id\":\"4\",\"ingilizce\":\"window\",\"turkce\":\"pencere\"},{\"kelime_id\":\"5\",\"ingilizce\":\"table\",\"turkce\":\"masa\"},{\"kelime_id\":\"6\",\"ingilizce\":\"chair\",\"turkce\":\"sandalye\"},{\"kelime_id\":\"7\",\"ingilizce\":\"lock\",\"turkce\":\"kilit\"},{\"kelime_id\":\"8\",\"ingilizce\":\"box\",\"turkce\":\"kutu\"},{\"kelime_id\":\"9\",\"ingilizce\":\"night\",\"turkce\":\"gece\"},{\"kelime_id\":\"10\",\"ingilizce\":\"day\",\"turkce\":\"g\\u00fcn\"},{\"kelime_id\":\"11\",\"ingilizce\":\"morning\",\"turkce\":\"sabah\"},{\"kelime_id\":\"12\",\"ingilizce\":\"cable\",\"turkce\":\"kablo\"},{\"kelime_id\":\"13\",\"ingilizce\":\"room\",\"turkce\":\"oda\"},{\"kelime_id\":\"14\",\"ingilizce\":\"phone\",\"turkce\":\"telefon\"},{\"kelime_id\":\"15\",\"ingilizce\":\"sun\",\"turkce\":\"g\\u00fcne\\u015f\"},{\"kelime_id\":\"16\",\"ingilizce\":\"moon\",\"turkce\":\"ay\"},{\"kelime_id\":\"17\",\"ingilizce\":\"world\",\"turkce\":\"d\\u00fcnya\"},{\"kelime_id\":\"18\",\"ingilizce\":\"book\",\"turkce\":\"kitap\"},{\"kelime_id\":\"19\",\"ingilizce\":\"light\",\"turkce\":\"\\u0131\\u015f\\u0131k\"},{\"kelime_id\":\"20\",\"ingilizce\":\"red\",\"turkce\":\"k\\u0131rm\\u0131z\\u0131\"},{\"kelime_id\":\"21\",\"ingilizce\":\"green\",\"turkce\":\"ye\\u015fil\"},{\"kelime_id\":\"22\",\"ingilizce\":\"grey\",\"turkce\":\"gri\"},{\"kelime_id\":\"23\",\"ingilizce\":\"yellow\",\"turkce\":\"sar\\u0131\"},{\"kelime_id\":\"24\",\"ingilizce\":\"home\",\"turkce\":\"ev\"},{\"kelime_id\":\"25\",\"ingilizce\":\"garden\",\"turkce\":\"bah\\u00e7e\"},{\"kelime_id\":\"26\",\"ingilizce\":\"kitchen\",\"turkce\":\"mutfak\"},{\"kelime_id\":\"27\",\"ingilizce\":\"breakfast\",\"turkce\":\"kahvalt\\u0131\"},{\"kelime_id\":\"28\",\"ingilizce\":\"dinner\",\"turkce\":\"ak\\u015fam yeme\\u011fi\"},{\"kelime_id\":\"29\",\"ingilizce\":\"word\",\"turkce\":\"kelime\"},{\"kelime_id\":\"30\",\"ingilizce\":\"school\",\"turkce\":\"okul\"},{\"kelime_id\":\"31\",\"ingilizce\":\"doctor\",\"turkce\":\"doktor\"},{\"kelime_id\":\"32\",\"ingilizce\":\"order\",\"turkce\":\"sipari\\u015f\"},{\"kelime_id\":\"33\",\"ingilizce\":\"lesson\",\"turkce\":\"ders\"},{\"kelime_id\":\"34\",\"ingilizce\":\"page\",\"turkce\":\"sayfa\"},{\"kelime_id\":\"35\",\"ingilizce\":\"city\",\"turkce\":\"\\u015fehir\"},{\"kelime_id\":\"36\",\"ingilizce\":\"country\",\"turkce\":\"\\u00fclke\"},{\"kelime_id\":\"37\",\"ingilizce\":\"flag\",\"turkce\":\"bayrak\"},{\"kelime_id\":\"38\",\"ingilizce\":\"homework\",\"turkce\":\"\\u00f6dev\"},{\"kelime_id\":\"39\",\"ingilizce\":\"teacher\",\"turkce\":\"\\u00f6\\u011fretmen\"},{\"kelime_id\":\"40\",\"ingilizce\":\"week\",\"turkce\":\"hafta\"}],\"success\":1}"

            val jsonObject = JSONObject(jsondata)
            val jsonArray = jsonObject.getJSONArray("kelimeler")

            for (i in 0 until jsonArray.length()) {
                val jsonObj = jsonArray.getJSONObject(i)

                Log.e("Word id", jsonObj.getInt("kelime_id").toString())
                Log.e("English", jsonObj.getString("ingilizce").toString())
                Log.e("Turkish", jsonObj.getString("turkce").toString())
            }

        }catch (e: JSONException) {
            e.printStackTrace()
        }
    }

}