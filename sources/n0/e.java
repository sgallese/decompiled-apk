package n0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes.dex */
public abstract class e<K, V, T> implements Iterator<T>, rc.a {

    /* renamed from: f  reason: collision with root package name */
    private final u<K, V, T>[] f19869f;

    /* renamed from: m  reason: collision with root package name */
    private int f19870m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f19871p;

    public e(t<K, V> tVar, u<K, V, T>[] uVarArr) {
        qc.q.i(tVar, "node");
        qc.q.i(uVarArr, "path");
        this.f19869f = uVarArr;
        this.f19871p = true;
        uVarArr[0].k(tVar.p(), tVar.m() * 2);
        this.f19870m = 0;
        d();
    }

    private final void a() {
        if (hasNext()) {
            return;
        }
        throw new NoSuchElementException();
    }

    private final void d() {
        if (this.f19869f[this.f19870m].f()) {
            return;
        }
        for (int i10 = this.f19870m; -1 < i10; i10--) {
            int f10 = f(i10);
            if (f10 == -1 && this.f19869f[i10].h()) {
                this.f19869f[i10].j();
                f10 = f(i10);
            }
            if (f10 != -1) {
                this.f19870m = f10;
                return;
            }
            if (i10 > 0) {
                this.f19869f[i10 - 1].j();
            }
            this.f19869f[i10].k(t.f19889e.a().p(), 0);
        }
        this.f19871p = false;
    }

    private final int f(int i10) {
        if (this.f19869f[i10].f()) {
            return i10;
        }
        if (this.f19869f[i10].h()) {
            t<? extends K, ? extends V> c10 = this.f19869f[i10].c();
            if (i10 == 6) {
                this.f19869f[i10 + 1].k(c10.p(), c10.p().length);
            } else {
                this.f19869f[i10 + 1].k(c10.p(), c10.m() * 2);
            }
            return f(i10 + 1);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final K c() {
        a();
        return this.f19869f[this.f19870m].a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final u<K, V, T>[] e() {
        return this.f19869f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(int i10) {
        this.f19870m = i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19871p;
    }

    @Override // java.util.Iterator
    public T next() {
        a();
        T next = this.f19869f[this.f19870m].next();
        d();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
