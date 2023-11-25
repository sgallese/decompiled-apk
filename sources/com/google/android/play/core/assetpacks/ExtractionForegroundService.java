package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public class ExtractionForegroundService extends Service {

    /* renamed from: f  reason: collision with root package name */
    private final IBinder f10703f = new z0(this);

    public final synchronized void a() {
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f10703f;
    }
}
