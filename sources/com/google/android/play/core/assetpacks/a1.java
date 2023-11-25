package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class a1 implements ServiceConnection {

    /* renamed from: f  reason: collision with root package name */
    private final x7.f f10705f = new x7.f("ExtractionForegroundServiceConnection");

    /* renamed from: m  reason: collision with root package name */
    private final List f10706m = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    private final Context f10707p;

    /* renamed from: q  reason: collision with root package name */
    private ExtractionForegroundService f10708q;

    /* renamed from: r  reason: collision with root package name */
    private Notification f10709r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(Context context) {
        this.f10707p = context;
    }

    private final void d() {
        ArrayList arrayList;
        synchronized (this.f10706m) {
            arrayList = new ArrayList(this.f10706m);
            this.f10706m.clear();
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((x7.q0) arrayList.get(i10)).b(new Bundle(), new Bundle());
            } catch (RemoteException unused) {
                this.f10705f.b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Notification notification) {
        this.f10709r = notification;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f10705f.a("Stopping foreground installation service.", new Object[0]);
        this.f10707p.unbindService(this);
        ExtractionForegroundService extractionForegroundService = this.f10708q;
        if (extractionForegroundService != null) {
            extractionForegroundService.a();
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(x7.q0 q0Var) {
        synchronized (this.f10706m) {
            this.f10706m.add(q0Var);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f10705f.a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((z0) iBinder).f11117f;
        this.f10708q = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f10709r);
        d();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
