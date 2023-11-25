package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import g4.j;
import n4.g;
import n4.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Alarms.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7479a = l.f("Alarms");

    public static void a(Context context, j jVar, String str) {
        h y10 = jVar.o().y();
        g c10 = y10.c(str);
        if (c10 != null) {
            b(context, str, c10.f20170b);
            l.c().a(f7479a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            y10.d(str);
        }
    }

    private static void b(Context context, String str, int i10) {
        int i11;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent b10 = b.b(context, str);
        if (Build.VERSION.SDK_INT >= 23) {
            i11 = 603979776;
        } else {
            i11 = 536870912;
        }
        PendingIntent service = PendingIntent.getService(context, i10, b10, i11);
        if (service != null && alarmManager != null) {
            l.c().a(f7479a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void c(Context context, j jVar, String str, long j10) {
        WorkDatabase o10 = jVar.o();
        h y10 = o10.y();
        g c10 = y10.c(str);
        if (c10 != null) {
            b(context, str, c10.f20170b);
            d(context, str, c10.f20170b, j10);
            return;
        }
        int b10 = new o4.f(o10).b();
        y10.b(new g(str, b10));
        d(context, str, b10, j10);
    }

    private static void d(Context context, String str, int i10, long j10) {
        int i11;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 23) {
            i11 = 201326592;
        } else {
            i11 = 134217728;
        }
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, str), i11);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }
}
