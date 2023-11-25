package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: TraceCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static long f3952a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f3953b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f3954c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f3955d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f3956e;

    /* compiled from: TraceCompat.java */
    /* loaded from: classes.dex */
    static class a {
        static void a(String str) {
            Trace.beginSection(str);
        }

        static void b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f3952a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f3953b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f3954c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f3955d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f3956e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        a.a(str);
    }

    public static void b() {
        a.b();
    }
}
