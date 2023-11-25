package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class<?> f3629a;

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f3630b;

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f3631c;

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f3632d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f3633e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f3634f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f3635g = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f3636f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Object f3637m;

        a(d dVar, Object obj) {
            this.f3636f = dVar;
            this.f3637m = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3636f.f3642f = this.f3637m;
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Application f3638f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f3639m;

        b(Application application, d dVar) {
            this.f3638f = application;
            this.f3639m = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3638f.unregisterActivityLifecycleCallbacks(this.f3639m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f3640f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Object f3641m;

        c(Object obj, Object obj2) {
            this.f3640f = obj;
            this.f3641m = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = e.f3632d;
                if (method != null) {
                    method.invoke(this.f3640f, this.f3641m, Boolean.FALSE, "AppCompat recreation");
                } else {
                    e.f3633e.invoke(this.f3640f, this.f3641m, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    static {
        Class<?> a10 = a();
        f3629a = a10;
        f3630b = b();
        f3631c = f();
        f3632d = d(a10);
        f3633e = c(a10);
        f3634f = e(a10);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 26 && i10 != 27) {
            return false;
        }
        return true;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f3631c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f3635g.postAtFrontOfQueue(new c(f3630b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f3634f == null) {
            return false;
        } else {
            if (f3633e == null && f3632d == null) {
                return false;
            }
            try {
                Object obj2 = f3631c.get(activity);
                if (obj2 == null || (obj = f3630b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f3635g;
                handler.post(new a(dVar, obj2));
                try {
                    if (g()) {
                        Method method = f3634f;
                        Boolean bool = Boolean.FALSE;
                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                    } else {
                        activity.recreate();
                    }
                    handler.post(new b(application, dVar));
                    return true;
                } catch (Throwable th) {
                    f3635g.post(new b(application, dVar));
                    throw th;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: f  reason: collision with root package name */
        Object f3642f;

        /* renamed from: m  reason: collision with root package name */
        private Activity f3643m;

        /* renamed from: p  reason: collision with root package name */
        private final int f3644p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f3645q = false;

        /* renamed from: r  reason: collision with root package name */
        private boolean f3646r = false;

        /* renamed from: s  reason: collision with root package name */
        private boolean f3647s = false;

        d(Activity activity) {
            this.f3643m = activity;
            this.f3644p = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f3643m == activity) {
                this.f3643m = null;
                this.f3646r = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (this.f3646r && !this.f3647s && !this.f3645q && e.h(this.f3642f, this.f3644p, activity)) {
                this.f3647s = true;
                this.f3642f = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f3643m == activity) {
                this.f3645q = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
