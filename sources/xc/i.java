package xc;

import dc.w;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* compiled from: SequenceBuilder.kt */
/* loaded from: classes4.dex */
public abstract class i<T> {
    public abstract Object a(T t10, Continuation<? super w> continuation);

    public abstract Object c(Iterator<? extends T> it, Continuation<? super w> continuation);

    public final Object e(g<? extends T> gVar, Continuation<? super w> continuation) {
        Object d10;
        Object c10 = c(gVar.iterator(), continuation);
        d10 = ic.d.d();
        if (c10 == d10) {
            return c10;
        }
        return w.f13270a;
    }
}
