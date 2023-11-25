package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.p;

/* compiled from: ReportFragment.kt */
/* loaded from: classes.dex */
public class k0 extends Fragment {

    /* renamed from: m  reason: collision with root package name */
    public static final b f4996m = new b(null);

    /* renamed from: f  reason: collision with root package name */
    private a f4997f;

    /* compiled from: ReportFragment.kt */
    /* loaded from: classes.dex */
    public interface a {
        void onCreate();

        void onResume();

        void onStart();
    }

    /* compiled from: ReportFragment.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }

        public final void a(Activity activity, p.a aVar) {
            qc.q.i(activity, "activity");
            qc.q.i(aVar, "event");
            if (activity instanceof y) {
                ((y) activity).getLifecycle().i(aVar);
            } else if (activity instanceof v) {
                p lifecycle = ((v) activity).getLifecycle();
                if (lifecycle instanceof x) {
                    ((x) lifecycle).i(aVar);
                }
            }
        }

        public final k0 b(Activity activity) {
            qc.q.i(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            qc.q.g(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (k0) findFragmentByTag;
        }

        public final void c(Activity activity) {
            qc.q.i(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new k0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* compiled from: ReportFragment.kt */
    /* loaded from: classes.dex */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        /* compiled from: ReportFragment.kt */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(qc.h hVar) {
                this();
            }

            public final void a(Activity activity) {
                qc.q.i(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            qc.q.i(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            qc.q.i(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            qc.q.i(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            qc.q.i(activity, "activity");
            k0.f4996m.a(activity, p.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            qc.q.i(activity, "activity");
            k0.f4996m.a(activity, p.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            qc.q.i(activity, "activity");
            k0.f4996m.a(activity, p.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            qc.q.i(activity, "activity");
            k0.f4996m.a(activity, p.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            qc.q.i(activity, "activity");
            k0.f4996m.a(activity, p.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            qc.q.i(activity, "activity");
            k0.f4996m.a(activity, p.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            qc.q.i(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            qc.q.i(activity, "activity");
            qc.q.i(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            qc.q.i(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            qc.q.i(activity, "activity");
        }
    }

    private final void a(p.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f4996m;
            Activity activity = getActivity();
            qc.q.h(activity, "activity");
            bVar.a(activity, aVar);
        }
    }

    private final void b(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    private final void c(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private final void d(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    public static final void e(Activity activity) {
        f4996m.c(activity);
    }

    public final void f(a aVar) {
        this.f4997f = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.f4997f);
        a(p.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(p.a.ON_DESTROY);
        this.f4997f = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(p.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        c(this.f4997f);
        a(p.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        d(this.f4997f);
        a(p.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(p.a.ON_STOP);
    }
}
