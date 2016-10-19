package com.jredthree.jsandandroiddemo;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * author: smart
 * time: 2016/10/19
 */

public class JSKit {
    /*
         * 绑定的object对象
         * */
    private Context context;
    public JSKit(Context context){
        this.context = context;
    }

    /*
     * JS调用android的方法
     * @JavascriptInterface仍然必不可少
     *
     * */
    @JavascriptInterface
    public String  JsCallAndroid(){
        Toast.makeText(context, "JsCallAndroid", Toast.LENGTH_SHORT).show();
        return "JS call Andorid";
    }
}
