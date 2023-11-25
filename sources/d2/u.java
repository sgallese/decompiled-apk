package d2;

import android.text.style.URLSpan;
import java.util.WeakHashMap;
import v1.n0;

/* compiled from: URLSpanCache.kt */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap<n0, URLSpan> f13093a = new WeakHashMap<>();

    public final URLSpan a(n0 n0Var) {
        qc.q.i(n0Var, "urlAnnotation");
        WeakHashMap<n0, URLSpan> weakHashMap = this.f13093a;
        URLSpan uRLSpan = weakHashMap.get(n0Var);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(n0Var.a());
            weakHashMap.put(n0Var, uRLSpan);
        }
        return uRLSpan;
    }
}
