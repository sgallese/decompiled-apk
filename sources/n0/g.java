package n0;

import java.util.ConcurrentModificationException;
import qc.k0;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes.dex */
public class g<K, V, T> extends e<K, V, T> {

    /* renamed from: q  reason: collision with root package name */
    private final f<K, V> f19878q;

    /* renamed from: r  reason: collision with root package name */
    private K f19879r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f19880s;

    /* renamed from: t  reason: collision with root package name */
    private int f19881t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f<K, V> fVar, u<K, V, T>[] uVarArr) {
        super(fVar.h(), uVarArr);
        qc.q.i(fVar, "builder");
        qc.q.i(uVarArr, "path");
        this.f19878q = fVar;
        this.f19881t = fVar.f();
    }

    private final void i() {
        if (this.f19878q.f() == this.f19881t) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    private final void j() {
        if (this.f19880s) {
            return;
        }
        throw new IllegalStateException();
    }

    private final void k(int i10, t<?, ?> tVar, K k10, int i11) {
        int i12 = i11 * 5;
        if (i12 > 30) {
            e()[i11].l(tVar.p(), tVar.p().length, 0);
            while (!qc.q.d(e()[i11].a(), k10)) {
                e()[i11].i();
            }
            h(i11);
            return;
        }
        int f10 = 1 << x.f(i10, i12);
        if (tVar.q(f10)) {
            e()[i11].l(tVar.p(), tVar.m() * 2, tVar.n(f10));
            h(i11);
            return;
        }
        int O = tVar.O(f10);
        t<?, ?> N = tVar.N(O);
        e()[i11].l(tVar.p(), tVar.m() * 2, O);
        k(i10, N, k10, i11 + 1);
    }

    public final void l(K k10, V v10) {
        int i10;
        if (!this.f19878q.containsKey(k10)) {
            return;
        }
        if (hasNext()) {
            K c10 = c();
            this.f19878q.put(k10, v10);
            if (c10 != null) {
                i10 = c10.hashCode();
            } else {
                i10 = 0;
            }
            k(i10, this.f19878q.h(), c10, 0);
        } else {
            this.f19878q.put(k10, v10);
        }
        this.f19881t = this.f19878q.f();
    }

    @Override // n0.e, java.util.Iterator
    public T next() {
        i();
        this.f19879r = c();
        this.f19880s = true;
        return (T) super.next();
    }

    @Override // n0.e, java.util.Iterator
    public void remove() {
        int i10;
        j();
        if (hasNext()) {
            K c10 = c();
            f<K, V> fVar = this.f19878q;
            k0.d(fVar).remove(this.f19879r);
            if (c10 != null) {
                i10 = c10.hashCode();
            } else {
                i10 = 0;
            }
            k(i10, this.f19878q.h(), c10, 0);
        } else {
            f<K, V> fVar2 = this.f19878q;
            k0.d(fVar2).remove(this.f19879r);
        }
        this.f19879r = null;
        this.f19880s = false;
        this.f19881t = this.f19878q.f();
    }
}
