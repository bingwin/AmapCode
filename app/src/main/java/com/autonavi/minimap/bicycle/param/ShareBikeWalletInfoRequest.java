package com.autonavi.minimap.bicycle.param;

import com.amap.bundle.aosservice.request.AosPostRequest;
import com.amap.bundle.blutils.app.ConfigerHelper;

public class ShareBikeWalletInfoRequest extends AosPostRequest {
    public static final String a;
    public String b = null;
    public String c = null;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(dkp.a(ConfigerHelper.AOS_SNS_URL_KEY));
        sb.append("ws/valueadded/sharebike/walletinfo");
        a = sb.toString();
    }
}
