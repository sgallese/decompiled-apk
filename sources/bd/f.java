package bd;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import dc.m;
import dc.n;
import qc.q;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final e f8152a;
    private static volatile Choreographer choreographer;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [qc.h, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    static {
        Object a10;
        ?? r02 = 0;
        try {
            m.a aVar = m.f13253f;
            a10 = m.a(new d(a(Looper.getMainLooper(), true), r02, 2, r02));
        } catch (Throwable th) {
            m.a aVar2 = m.f13253f;
            a10 = m.a(n.a(th));
        }
        if (!m.c(a10)) {
            r02 = a10;
        }
        f8152a = (e) r02;
    }

    public static final Handler a(Looper looper, boolean z10) {
        if (z10) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                q.g(invoke, "null cannot be cast to non-null type android.os.Handler");
                return (Handler) invoke;
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    public static final e b(Handler handler, String str) {
        return new d(handler, str);
    }
}
