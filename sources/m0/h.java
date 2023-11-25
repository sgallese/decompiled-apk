package m0;

import java.util.ConcurrentModificationException;
import qc.q;

/* compiled from: PersistentVectorMutableIterator.kt */
/* loaded from: classes.dex */
public final class h<T> extends a<T> {

    /* renamed from: p  reason: collision with root package name */
    private final f<T> f19721p;

    /* renamed from: q  reason: collision with root package name */
    private int f19722q;

    /* renamed from: r  reason: collision with root package name */
    private k<? extends T> f19723r;

    /* renamed from: s  reason: collision with root package name */
    private int f19724s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f<T> fVar, int i10) {
        super(i10, fVar.size());
        q.i(fVar, "builder");
        this.f19721p = fVar;
        this.f19722q = fVar.i();
        this.f19724s = -1;
        l();
    }

    private final void i() {
        if (this.f19722q == this.f19721p.i()) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    private final void j() {
        if (this.f19724s != -1) {
            return;
        }
        throw new IllegalStateException();
    }

    private final void k() {
        h(this.f19721p.size());
        this.f19722q = this.f19721p.i();
        this.f19724s = -1;
        l();
    }

    private final void l() {
        int h10;
        Object[] j10 = this.f19721p.j();
        if (j10 == null) {
            this.f19723r = null;
            return;
        }
        int d10 = l.d(this.f19721p.size());
        h10 = vc.l.h(d(), d10);
        int k10 = (this.f19721p.k() / 5) + 1;
        k<? extends T> kVar = this.f19723r;
        if (kVar == null) {
            this.f19723r = new k<>(j10, h10, d10, k10);
            return;
        }
        q.f(kVar);
        kVar.l(j10, h10, d10, k10);
    }

    @Override // m0.a, java.util.ListIterator
    public void add(T t10) {
        i();
        this.f19721p.add(d(), t10);
        f(d() + 1);
        k();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        i();
        a();
        this.f19724s = d();
        k<? extends T> kVar = this.f19723r;
        if (kVar == null) {
            Object[] l10 = this.f19721p.l();
            int d10 = d();
            f(d10 + 1);
            return (T) l10[d10];
        } else if (kVar.hasNext()) {
            f(d() + 1);
            return kVar.next();
        } else {
            Object[] l11 = this.f19721p.l();
            int d11 = d();
            f(d11 + 1);
            return (T) l11[d11 - kVar.e()];
        }
    }

    @Override // java.util.ListIterator
    public T previous() {
        i();
        c();
        this.f19724s = d() - 1;
        k<? extends T> kVar = this.f19723r;
        if (kVar == null) {
            Object[] l10 = this.f19721p.l();
            f(d() - 1);
            return (T) l10[d()];
        } else if (d() > kVar.e()) {
            Object[] l11 = this.f19721p.l();
            f(d() - 1);
            return (T) l11[d() - kVar.e()];
        } else {
            f(d() - 1);
            return kVar.previous();
        }
    }

    @Override // m0.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        i();
        j();
        this.f19721p.remove(this.f19724s);
        if (this.f19724s < d()) {
            f(this.f19724s);
        }
        k();
    }

    @Override // m0.a, java.util.ListIterator
    public void set(T t10) {
        i();
        j();
        this.f19721p.set(this.f19724s, t10);
        this.f19722q = this.f19721p.i();
        l();
    }
}
