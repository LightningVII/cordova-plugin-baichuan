package com.enet6688.alibc;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class AliBC extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    /**
     * @param view
     * 打开指定链接
     */
    // public void openDetail(View view) {

    //     String text = etUrl.getText().toString();
    //     if(TextUtils.isEmpty(text)) {
    //         Toast.makeText(AliSdkTransactionActivity.this, "URL为空",
    //                 Toast.LENGTH_SHORT).show();
    //         return;
    //     }

    //     alibcTaokeParams = new AlibcTaokeParams(); // 若非淘客taokeParams设置为null即可
    //     alibcTaokeParams.adzoneid = "57328044";
    //     alibcTaokeParams.pid = "mm_26632322_6858406_23810104";
    //     alibcTaokeParams.subPid = "mm_26632322_6858406_23810104";
    //     alibcTaokeParams.extraParams = new HashMap<>();
    //     alibcTaokeParams.extraParams.put("taokeAppkey","23373400");

    //     AlibcTrade.show(this, new AlibcPage(text), alibcShowParams, alibcTaokeParams, exParams , new DemoTradeCallback());
    // }
}
