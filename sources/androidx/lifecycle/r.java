package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LifecycleDispatcher.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f5038a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f5039b = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.kt */
    /* loaded from: classes.dex */
    public static final class a extends j {
        @Override // androidx.lifecycle.j, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            qc.q.i(activity, "activity");
            k0.f4996m.c(activity);
        }
    }

    private r() {
    }

    public static final void a(Context context) {
        qc.q.i(context, "context");
        if (f5039b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        qc.q.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
