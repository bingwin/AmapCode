package com.amap.bundle.drive.result.driveresult.result.suspend;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.amap.bundle.aosservice.request.AosRequest;
import com.amap.bundle.aosservice.response.AosResponse;
import com.amap.bundle.aosservice.response.AosResponseCallbackOnUi;
import com.amap.bundle.aosservice.response.AosResponseException;
import com.amap.bundle.drive.result.driveresult.result.suspend.FreeRideCarShareHelper.FreeRideCarShareResponse;
import com.amap.bundle.drive.result.driveresult.result.suspend.FreeRideCarShareHelper.b;
import com.autonavi.common.model.POI;
import com.autonavi.minimap.R;

public class AjxRouteTruckResultMapSuspendHelper$12 implements AosResponseCallbackOnUi<FreeRideCarShareResponse> {
    final /* synthetic */ POI a;
    final /* synthetic */ POI b;
    final /* synthetic */ oz c;

    public /* synthetic */ void onSuccess(AosResponse aosResponse) {
        b bVar = (b) ((FreeRideCarShareResponse) aosResponse).getResult();
        if (bVar == null) {
            this.c.a.setTipVisible(false);
            oz.a(this.c, false);
        } else if (!TextUtils.isEmpty(bVar.f.a) || bVar.f.c.size() != 0) {
            this.c.a.setTipVisible(true);
            oz.a(this.c, true);
            if (bVar.f.b > 1) {
                this.c.a.setIconId(R.drawable.icon_c56);
                this.c.a.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        StringBuilder sb = new StringBuilder("amapuri://freeride/rideuserlist?sourceApplication=amap");
                        sb.append("&startLng=");
                        sb.append(AjxRouteTruckResultMapSuspendHelper$12.this.a.getPoint().getLongitude());
                        sb.append("&startLat=");
                        sb.append(AjxRouteTruckResultMapSuspendHelper$12.this.a.getPoint().getLatitude());
                        sb.append("&endLng=");
                        sb.append(AjxRouteTruckResultMapSuspendHelper$12.this.b.getPoint().getLongitude());
                        sb.append("&endLat=");
                        sb.append(AjxRouteTruckResultMapSuspendHelper$12.this.b.getPoint().getLatitude());
                        sb.append("&startPOI=");
                        sb.append(AjxRouteTruckResultMapSuspendHelper$12.this.a.getId());
                        sb.append("&endPOI=");
                        sb.append(AjxRouteTruckResultMapSuspendHelper$12.this.b.getId());
                        if ("我的位置".equals(AjxRouteTruckResultMapSuspendHelper$12.this.a.getName())) {
                            sb.append("&startName=");
                        } else {
                            sb.append("&startName=");
                            sb.append(AjxRouteTruckResultMapSuspendHelper$12.this.a.getName());
                        }
                        if ("我的位置".equals(AjxRouteTruckResultMapSuspendHelper$12.this.b.getName())) {
                            sb.append("&endName=");
                        } else {
                            sb.append("&endName=");
                            sb.append(AjxRouteTruckResultMapSuspendHelper$12.this.b.getName());
                        }
                        AjxRouteTruckResultMapSuspendHelper$12.this.c.b.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
                        AjxRouteTruckResultMapSuspendHelper$12.this.c.a.setTipVisible(false);
                        oz.a(AjxRouteTruckResultMapSuspendHelper$12.this.c, false);
                    }
                });
            } else {
                this.c.a.setIconId(R.drawable.icon_c55);
            }
            this.c.a.setText(bVar.f.a);
            this.c.a.setIconList(bVar.f.c);
            this.c.b.c().postDelayed(new Runnable() {
                public final void run() {
                    AjxRouteTruckResultMapSuspendHelper$12.this.c.a.setTipVisible(false);
                    oz.a(AjxRouteTruckResultMapSuspendHelper$12.this.c, false);
                }
            }, 5000);
        } else {
            this.c.a.setTipVisible(false);
            oz.a(this.c, false);
        }
    }

    public void onFailure(AosRequest aosRequest, AosResponseException aosResponseException) {
        this.c.a.setTipVisible(false);
        oz.a(this.c, false);
    }
}
