package com.zr.greendaodemo.util;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;

/**
 * @author : yushiwo
 * @e-mail : zhengrui@otcbtc.com
 * @time : 2018/08/28
 * @desc :
 */
public class ModelParser {

    private static final String TAG = ModelParser.class.getSimpleName();

    protected Gson mGson;

    public ModelParser() {
        mGson = new Gson();
    }

    public <T> T fromJson(final String json, Class<T> classOfT) {
        T t = null;
        try {
            if (json == null) {
                return null;
            }
            t = mGson.fromJson(json, classOfT);
        } catch (IllegalModelException e) {
//            NTLog.e(TAG, e.getMessage());
        } catch (Exception e) {
//            NTLog.e(TAG, e.getMessage());
        }
        return t;
    }

    public <T> T fromJson(String json, Type typeOfT) {
        T t = null;
        try {
            t = mGson.fromJson(json, typeOfT);
        } catch (IllegalModelException e) {
//            NTLog.e(TAG, e.getMessage());
        } catch (Exception e) {
//            NTLog.e(TAG, e.getMessage());
        }
        return t;
    }

    public <T> T fromJson(JsonElement jsonElement, Type type) {
        T t = null;
        try {
            t = mGson.fromJson(jsonElement, type);
        } catch (IllegalModelException e) {
//            NTLog.e(TAG, e.getMessage());
        } catch (Exception e) {
//            NTLog.e(TAG, e.getMessage());
        }
        return t;
    }

    public String toJson(Object src) {
        String jsonString = null;
        try {
            jsonString = mGson.toJson(src);
        } catch (IllegalModelException e) {
//            NTLog.e(TAG, e.getMessage());
        } catch (Exception e) {
//            NTLog.e(TAG, e.getMessage());
        }
        return jsonString;
    }

    public String toJson(Object src, Type typeOfSrc) {
        String jsonString = null;
        try {
            jsonString = mGson.toJson(src, typeOfSrc);
        } catch (IllegalModelException e) {
//            NTLog.e(TAG, e.getMessage());
        } catch (Exception e) {
//            NTLog.e(TAG, e.getMessage());
        }
        return jsonString;
    }

    public String toJson(JsonElement jsonElement) {
        String jsonString = null;
        try {
            jsonString = mGson.toJson(jsonElement);
        } catch (IllegalModelException e) {
//            NTLog.e(TAG, e.getMessage());
        } catch (Exception e) {
//            NTLog.e(TAG, e.getMessage());
        }
        return jsonString;
    }
}

