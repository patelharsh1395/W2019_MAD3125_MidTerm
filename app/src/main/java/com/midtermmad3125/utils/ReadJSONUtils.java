package com.midtermmad3125.utils;

import android.content.Context;

import com.midtermmad3125.model.RootElementJson;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ReadJSONUtils
{
    public static RootElementJson format(String json)
    {


        return  null;
    }




    public static String loadJSONFromAsset(Context context, String jsonFileName) {
        String jsonString;
        try {
            InputStream is = context.getAssets().open(jsonFileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            int count = is.read(buffer);
            is.close();
            jsonString = new String(buffer, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return jsonString;
    }
}
