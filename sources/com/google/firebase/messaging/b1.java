package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WakeLockHolder.java */
/* loaded from: classes3.dex */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    static final long f11617a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f11618b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static WakeLock f11619c;

    private static void b(Context context) {
        if (f11619c == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f11619c = wakeLock;
            wakeLock.setReferenceCounted(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f11618b) {
            if (f11619c != null && d(intent)) {
                g(intent, false);
                f11619c.release();
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"TaskMainThread"})
    public static void f(Context context, g1 g1Var, final Intent intent) {
        synchronized (f11618b) {
            b(context);
            boolean d10 = d(intent);
            g(intent, true);
            if (!d10) {
                f11619c.acquire(f11617a);
            }
            g1Var.c(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.a1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    b1.c(intent);
                }
            });
        }
    }

    private static void g(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ComponentName h(Context context, Intent intent) {
        synchronized (f11618b) {
            b(context);
            boolean d10 = d(intent);
            g(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!d10) {
                f11619c.acquire(f11617a);
            }
            return startService;
        }
    }
}
