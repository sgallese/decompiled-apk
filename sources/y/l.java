package y;

import y.c;
import y.l.a;

/* compiled from: LazyLayoutIntervalContent.kt */
/* loaded from: classes.dex */
public abstract class l<Interval extends a> {

    /* compiled from: LazyLayoutIntervalContent.kt */
    /* loaded from: classes.dex */
    public interface a {
        pc.l<Integer, Object> getKey();

        pc.l<Integer, Object> getType();
    }

    public final Object c(int i10) {
        c.a<Interval> aVar = d().get(i10);
        return aVar.c().getType().invoke(Integer.valueOf(i10 - aVar.b()));
    }

    public abstract c<Interval> d();

    public final int e() {
        return d().getSize();
    }

    public final Object f(int i10) {
        Object invoke;
        c.a<Interval> aVar = d().get(i10);
        int b10 = i10 - aVar.b();
        pc.l<Integer, Object> key = aVar.c().getKey();
        if (key == null || (invoke = key.invoke(Integer.valueOf(b10))) == null) {
            return androidx.compose.foundation.lazy.layout.a.a(i10);
        }
        return invoke;
    }
}
