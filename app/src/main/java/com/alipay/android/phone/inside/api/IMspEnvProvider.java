package com.alipay.android.phone.inside.api;

import org.json.JSONObject;

public interface IMspEnvProvider {
    String getBizFrom();

    String getSessionId() throws Exception;

    JSONObject mtop(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6, boolean z3) throws Exception;
}
