package k5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import qc.h;
import qc.q;
import r5.f;

/* compiled from: AndroidLifecyclePlugin.kt */
/* loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks, f {

    /* renamed from: p  reason: collision with root package name */
    public static final a f19354p = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final f.b f19355f = f.b.Utility;

    /* renamed from: m  reason: collision with root package name */
    public p5.a f19356m;

    /* compiled from: AndroidLifecyclePlugin.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final long a() {
            return System.currentTimeMillis();
        }
    }

    @Override // r5.f
    public q5.a a(q5.a aVar) {
        return f.a.a(this, aVar);
    }

    @Override // r5.f
    public void b(p5.a aVar) {
        q.i(aVar, "amplitude");
        f.a.b(this, aVar);
        ((Application) ((i5.b) aVar.h()).r()).registerActivityLifecycleCallbacks(this);
    }

    @Override // r5.f
    public void c(p5.a aVar) {
        q.i(aVar, "<set-?>");
        this.f19356m = aVar;
    }

    @Override // r5.f
    public f.b getType() {
        return this.f19355f;
    }

    public p5.a h() {
        p5.a aVar = this.f19356m;
        if (aVar != null) {
            return aVar;
        }
        q.z("amplitude");
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        q.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        q.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        q.i(activity, "activity");
        ((i5.a) h()).L();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        q.i(activity, "activity");
        ((i5.a) h()).K(f19354p.a());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        q.i(activity, "activity");
        q.i(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        q.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        q.i(activity, "activity");
    }
}
