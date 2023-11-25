package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzboc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @KeepForSdk
    public static final String AD_UNIT_KEY = "adUnit";
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.OutOfContextTestingActivity";

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzdj zzf = zzay.zza().zzf(this, new zzboc());
        if (zzf == null) {
            finish();
            return;
        }
        setContentView(R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra(AD_UNIT_KEY);
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            zzf.zze(stringExtra, ObjectWrapper.wrap(this), ObjectWrapper.wrap(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
