package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.m;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DisplayNotification.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f11631a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11632b;

    /* renamed from: c  reason: collision with root package name */
    private final g0 f11633c;

    public f(Context context, g0 g0Var, ExecutorService executorService) {
        this.f11631a = executorService;
        this.f11632b = context;
        this.f11633c = g0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.f11632b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f11632b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                if (runningAppProcessInfo.importance != 100) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private void c(d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f11632b.getSystemService("notification")).notify(aVar.f11626b, aVar.f11627c, aVar.f11625a.c());
    }

    private c0 d() {
        c0 e10 = c0.e(this.f11633c.p("gcm.n.image"));
        if (e10 != null) {
            e10.q(this.f11631a);
        }
        return e10;
    }

    private void e(m.e eVar, c0 c0Var) {
        if (c0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(c0Var.j(), 5L, TimeUnit.SECONDS);
            eVar.r(bitmap);
            eVar.z(new m.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c0Var.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.f11633c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        c0 d10 = d();
        d.a e10 = d.e(this.f11632b, this.f11633c);
        e(e10.f11625a, d10);
        c(e10);
        return true;
    }
}
