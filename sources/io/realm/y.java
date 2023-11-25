package io.realm;

import io.realm.internal.OsList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes4.dex */
public abstract class y<T> {

    /* renamed from: a  reason: collision with root package name */
    final a f18417a;

    /* renamed from: b  reason: collision with root package name */
    final OsList f18418b;

    /* renamed from: c  reason: collision with root package name */
    final Class<T> f18419c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(a aVar, OsList osList, Class<T> cls) {
        this.f18417a = aVar;
        this.f18419c = cls;
        this.f18418b = osList;
    }

    private void b() {
        this.f18418b.h();
    }

    public final void a(Object obj) {
        e(obj);
        if (obj == null) {
            b();
        } else {
            c(obj);
        }
    }

    protected abstract void c(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(int i10) {
        int s10 = s();
        if (i10 >= 0 && s10 >= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f18418b.Y());
    }

    protected abstract void e(Object obj);

    public abstract boolean f();

    public abstract T g(int i10);

    public final OsList h() {
        return this.f18418b;
    }

    public final void i(int i10, T t10) {
        e(t10);
        if (t10 == null) {
            j(i10);
        } else {
            k(i10, t10);
        }
    }

    protected void j(int i10) {
        this.f18418b.B(i10);
    }

    protected abstract void k(int i10, Object obj);

    public final boolean l() {
        return this.f18418b.H();
    }

    public final boolean m() {
        return this.f18418b.I();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(int i10) {
        this.f18418b.J(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        this.f18418b.K();
    }

    public final T p(int i10, Object obj) {
        e(obj);
        T g10 = g(i10);
        if (obj == null) {
            q(i10);
        } else {
            r(i10, obj);
        }
        return g10;
    }

    protected void q(int i10) {
        this.f18418b.S(i10);
    }

    protected abstract void r(int i10, Object obj);

    public final int s() {
        long Y = this.f18418b.Y();
        if (Y < 2147483647L) {
            return (int) Y;
        }
        return Integer.MAX_VALUE;
    }
}
