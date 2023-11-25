package ad;

import dc.m;
import kotlin.coroutines.Continuation;

/* compiled from: CompletionState.kt */
/* loaded from: classes4.dex */
public final class d0 {
    public static final <T> Object a(Object obj, Continuation<? super T> continuation) {
        if (obj instanceof a0) {
            m.a aVar = dc.m.f13253f;
            return dc.m.a(dc.n.a(((a0) obj).f462a));
        }
        return dc.m.a(obj);
    }

    public static final <T> Object b(Object obj, m<?> mVar) {
        Throwable b10 = dc.m.b(obj);
        if (b10 != null) {
            return new a0(b10, false, 2, null);
        }
        return obj;
    }

    public static final <T> Object c(Object obj, pc.l<? super Throwable, dc.w> lVar) {
        Throwable b10 = dc.m.b(obj);
        if (b10 == null) {
            if (lVar != null) {
                return new b0(obj, lVar);
            }
            return obj;
        }
        return new a0(b10, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, pc.l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}
