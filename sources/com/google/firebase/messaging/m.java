package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: FcmBroadcastProcessor.java */
@KeepForSdk
/* loaded from: classes3.dex */
public class m {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f11663c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static g1 f11664d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f11665a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f11666b = new s3.m();

    public m(Context context) {
        this.f11665a = context;
    }

    private static Task<Integer> d(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (q0.b().e(context)) {
            b1.f(context, e(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            e(context, "com.google.firebase.MESSAGING_EVENT").c(intent);
        }
        return Tasks.forResult(-1);
    }

    private static g1 e(Context context, String str) {
        g1 g1Var;
        synchronized (f11663c) {
            if (f11664d == null) {
                f11664d = new g1(context, str);
            }
            g1Var = f11664d;
        }
        return g1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer f(Context context, Intent intent) throws Exception {
        return Integer.valueOf(q0.b().g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer g(Task task) throws Exception {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task h(Context context, Intent intent, Task task) throws Exception {
        if (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) {
            return d(context, intent).continueWith(new s3.m(), new Continuation() { // from class: com.google.firebase.messaging.l
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Integer g10;
                    g10 = m.g(task2);
                    return g10;
                }
            });
        }
        return task;
    }

    @KeepForSdk
    public Task<Integer> i(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return j(this.f11665a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> j(final Context context, final Intent intent) {
        boolean z10;
        boolean z11 = true;
        if (PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((intent.getFlags() & 268435456) == 0) {
            z11 = false;
        }
        if (z10 && !z11) {
            return d(context, intent);
        }
        return Tasks.call(this.f11666b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer f10;
                f10 = m.f(context, intent);
                return f10;
            }
        }).continueWithTask(this.f11666b, new Continuation() { // from class: com.google.firebase.messaging.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task h10;
                h10 = m.h(context, intent, task);
                return h10;
            }
        });
    }
}
