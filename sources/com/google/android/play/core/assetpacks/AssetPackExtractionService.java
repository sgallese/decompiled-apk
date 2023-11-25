package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public class AssetPackExtractionService extends Service {

    /* renamed from: f  reason: collision with root package name */
    v f10702f;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f10702f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        q1.a(getApplicationContext()).a(this);
    }
}
