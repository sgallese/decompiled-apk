package gc;

import j$.util.Comparator;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import qc.q;

/* compiled from: Comparisons.kt */
/* loaded from: classes4.dex */
final class g implements Comparator<Comparable<? super Object>>, j$.util.Comparator {

    /* renamed from: f  reason: collision with root package name */
    public static final g f16327f = new g();

    private g() {
    }

    @Override // java.util.Comparator
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        q.i(comparable, "a");
        q.i(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final Comparator<Comparable<Object>> reversed() {
        return f.f16326f;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        java.util.Comparator thenComparing;
        thenComparing = Comparator.EL.thenComparing(this, Comparator.CC.comparingDouble(toDoubleFunction));
        return thenComparing;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        java.util.Comparator thenComparing;
        thenComparing = Comparator.EL.thenComparing(this, Comparator.CC.comparingInt(toIntFunction));
        return thenComparing;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        java.util.Comparator thenComparing;
        thenComparing = Comparator.EL.thenComparing(this, Comparator.CC.comparingLong(toLongFunction));
        return thenComparing;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(Function function) {
        java.util.Comparator thenComparing;
        thenComparing = Comparator.EL.thenComparing(this, Comparator.CC.comparing(function));
        return thenComparing;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        java.util.Comparator thenComparing;
        thenComparing = Comparator.EL.thenComparing(this, Comparator.CC.comparing(function, comparator));
        return thenComparing;
    }
}
