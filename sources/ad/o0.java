package ad;

import dc.m;
import kotlin.coroutines.Continuation;

/* compiled from: DebugStrings.kt */
/* loaded from: classes4.dex */
public final class o0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(Continuation<?> continuation) {
        String a10;
        if (continuation instanceof fd.i) {
            return continuation.toString();
        }
        try {
            m.a aVar = dc.m.f13253f;
            a10 = dc.m.a(continuation + '@' + b(continuation));
        } catch (Throwable th) {
            m.a aVar2 = dc.m.f13253f;
            a10 = dc.m.a(dc.n.a(th));
        }
        if (dc.m.b(a10) != null) {
            a10 = continuation.getClass().getName() + '@' + b(continuation);
        }
        return (String) a10;
    }
}
