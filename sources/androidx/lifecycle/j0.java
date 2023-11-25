package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.k0;
import androidx.lifecycle.p;

/* compiled from: ProcessLifecycleOwner.kt */
/* loaded from: classes.dex */
public final class j0 implements v {

    /* renamed from: v  reason: collision with root package name */
    public static final b f4975v = new b(null);

    /* renamed from: w  reason: collision with root package name */
    private static final j0 f4976w = new j0();

    /* renamed from: f  reason: collision with root package name */
    private int f4977f;

    /* renamed from: m  reason: collision with root package name */
    private int f4978m;

    /* renamed from: r  reason: collision with root package name */
    private Handler f4981r;

    /* renamed from: p  reason: collision with root package name */
    private boolean f4979p = true;

    /* renamed from: q  reason: collision with root package name */
    private boolean f4980q = true;

    /* renamed from: s  reason: collision with root package name */
    private final x f4982s = new x(this);

    /* renamed from: t  reason: collision with root package name */
    private final Runnable f4983t = new Runnable() { // from class: androidx.lifecycle.i0
        @Override // java.lang.Runnable
        public final void run() {
            j0.i(j0.this);
        }
    };

    /* renamed from: u  reason: collision with root package name */
    private final k0.a f4984u = new d();

    /* compiled from: ProcessLifecycleOwner.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4985a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            qc.q.i(activity, "activity");
            qc.q.i(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }

        public final v a() {
            return j0.f4976w;
        }

        public final void b(Context context) {
            qc.q.i(context, "context");
            j0.f4976w.h(context);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    /* loaded from: classes.dex */
    public static final class c extends j {

        /* compiled from: ProcessLifecycleOwner.kt */
        /* loaded from: classes.dex */
        public static final class a extends j {
            final /* synthetic */ j0 this$0;

            a(j0 j0Var) {
                this.this$0 = j0Var;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                qc.q.i(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                qc.q.i(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.j, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            qc.q.i(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                k0.f4996m.b(activity).f(j0.this.f4984u);
            }
        }

        @Override // androidx.lifecycle.j, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            qc.q.i(activity, "activity");
            j0.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            qc.q.i(activity, "activity");
            a.a(activity, new a(j0.this));
        }

        @Override // androidx.lifecycle.j, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            qc.q.i(activity, "activity");
            j0.this.g();
        }
    }

    private j0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(j0 j0Var) {
        qc.q.i(j0Var, "this$0");
        j0Var.j();
        j0Var.k();
    }

    public static final v l() {
        return f4975v.a();
    }

    public final void d() {
        int i10 = this.f4978m - 1;
        this.f4978m = i10;
        if (i10 == 0) {
            Handler handler = this.f4981r;
            qc.q.f(handler);
            handler.postDelayed(this.f4983t, 700L);
        }
    }

    public final void e() {
        int i10 = this.f4978m + 1;
        this.f4978m = i10;
        if (i10 == 1) {
            if (this.f4979p) {
                this.f4982s.i(p.a.ON_RESUME);
                this.f4979p = false;
                return;
            }
            Handler handler = this.f4981r;
            qc.q.f(handler);
            handler.removeCallbacks(this.f4983t);
        }
    }

    public final void f() {
        int i10 = this.f4977f + 1;
        this.f4977f = i10;
        if (i10 == 1 && this.f4980q) {
            this.f4982s.i(p.a.ON_START);
            this.f4980q = false;
        }
    }

    public final void g() {
        this.f4977f--;
        k();
    }

    @Override // androidx.lifecycle.v
    public p getLifecycle() {
        return this.f4982s;
    }

    public final void h(Context context) {
        qc.q.i(context, "context");
        this.f4981r = new Handler();
        this.f4982s.i(p.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        qc.q.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f4978m == 0) {
            this.f4979p = true;
            this.f4982s.i(p.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f4977f == 0 && this.f4979p) {
            this.f4982s.i(p.a.ON_STOP);
            this.f4980q = true;
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    /* loaded from: classes.dex */
    public static final class d implements k0.a {
        d() {
        }

        @Override // androidx.lifecycle.k0.a
        public void onResume() {
            j0.this.e();
        }

        @Override // androidx.lifecycle.k0.a
        public void onStart() {
            j0.this.f();
        }

        @Override // androidx.lifecycle.k0.a
        public void onCreate() {
        }
    }
}
