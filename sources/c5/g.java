package c5;

import android.view.View;
import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: RealViewSizeResolver.kt */
/* loaded from: classes.dex */
public final class g<T extends View> implements m<T> {

    /* renamed from: c  reason: collision with root package name */
    private final T f8844c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8845d;

    public g(T t10, boolean z10) {
        this.f8844c = t10;
        this.f8845d = z10;
    }

    @Override // c5.m
    public boolean e() {
        return this.f8845d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (q.d(getView(), gVar.getView()) && e() == gVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // c5.m
    public T getView() {
        return this.f8844c;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + t.k.a(e());
    }

    @Override // c5.j
    public /* synthetic */ Object m(Continuation continuation) {
        return l.a(this, continuation);
    }
}
