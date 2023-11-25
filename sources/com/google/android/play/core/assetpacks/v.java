package com.google.android.play.core.assetpacks;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class v extends x7.o0 {

    /* renamed from: f  reason: collision with root package name */
    private final x7.f f11009f = new x7.f("AssetPackExtractionService");

    /* renamed from: m  reason: collision with root package name */
    private final Context f11010m;

    /* renamed from: p  reason: collision with root package name */
    private final d0 f11011p;

    /* renamed from: q  reason: collision with root package name */
    private final k3 f11012q;

    /* renamed from: r  reason: collision with root package name */
    private final a1 f11013r;

    /* renamed from: s  reason: collision with root package name */
    final NotificationManager f11014s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Context context, d0 d0Var, k3 k3Var, a1 a1Var) {
        this.f11010m = context;
        this.f11011p = d0Var;
        this.f11012q = k3Var;
        this.f11013r = a1Var;
        this.f11014s = (NotificationManager) context.getSystemService("notification");
    }

    @TargetApi(26)
    private final synchronized void K(String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        u7.c.a();
        this.f11014s.createNotificationChannel(com.google.android.gms.ads.internal.util.j.a("playcore-assetpacks-service-notification-channel", str, 2));
    }

    private final synchronized void L(Bundle bundle, x7.q0 q0Var) throws RemoteException {
        Notification.Builder priority;
        this.f11009f.a("updateServiceState AIDL call", new Object[0]);
        if (x7.v.b(this.f11010m) && x7.v.a(this.f11010m)) {
            int i10 = bundle.getInt("action_type");
            this.f11013r.c(q0Var);
            if (i10 == 1) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 26) {
                    K(bundle.getString("notification_channel_name"));
                }
                this.f11012q.c(true);
                a1 a1Var = this.f11013r;
                String string = bundle.getString("notification_title");
                String string2 = bundle.getString("notification_subtext");
                long j10 = bundle.getLong("notification_timeout", 600000L);
                Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
                if (i11 >= 26) {
                    u7.e.a();
                    priority = u7.d.a(this.f11010m, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j10);
                } else {
                    priority = new Notification.Builder(this.f11010m).setPriority(-2);
                }
                if (parcelable instanceof PendingIntent) {
                    priority.setContentIntent((PendingIntent) parcelable);
                }
                Notification.Builder ongoing = priority.setSmallIcon(17301633).setOngoing(false);
                if (string == null) {
                    string = "Downloading additional file";
                }
                Notification.Builder contentTitle = ongoing.setContentTitle(string);
                if (string2 == null) {
                    string2 = "Transferring";
                }
                contentTitle.setSubText(string2);
                int i12 = bundle.getInt("notification_color");
                if (i12 != 0) {
                    priority.setColor(i12).setVisibility(-1);
                }
                a1Var.a(priority.build());
                this.f11010m.bindService(new Intent(this.f11010m, ExtractionForegroundService.class), this.f11013r, 1);
                return;
            } else if (i10 == 2) {
                this.f11012q.c(false);
                this.f11013r.b();
                return;
            } else {
                this.f11009f.b("Unknown action type received: %d", Integer.valueOf(i10));
                q0Var.zzd(new Bundle());
                return;
            }
        }
        q0Var.zzd(new Bundle());
    }

    @Override // x7.p0
    public final void E(Bundle bundle, x7.q0 q0Var) throws RemoteException {
        this.f11009f.a("clearAssetPackStorage AIDL call", new Object[0]);
        if (x7.v.b(this.f11010m) && x7.v.a(this.f11010m)) {
            this.f11011p.J();
            q0Var.o(new Bundle());
            return;
        }
        q0Var.zzd(new Bundle());
    }

    @Override // x7.p0
    public final void c(Bundle bundle, x7.q0 q0Var) throws RemoteException {
        L(bundle, q0Var);
    }
}
