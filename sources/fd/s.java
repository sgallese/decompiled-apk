package fd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes4.dex */
public class s<E> {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15671a = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_cur");
    private volatile Object _cur;

    public s(boolean z10) {
        this._cur = new t(8, z10);
    }

    public final boolean a(E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15671a;
        while (true) {
            t tVar = (t) atomicReferenceFieldUpdater.get(this);
            int a10 = tVar.a(e10);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                if (a10 == 2) {
                    return false;
                }
            } else {
                androidx.concurrent.futures.b.a(f15671a, this, tVar, tVar.i());
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15671a;
        while (true) {
            t tVar = (t) atomicReferenceFieldUpdater.get(this);
            if (tVar.d()) {
                return;
            }
            androidx.concurrent.futures.b.a(f15671a, this, tVar, tVar.i());
        }
    }

    public final int c() {
        return ((t) f15671a.get(this)).f();
    }

    public final E d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15671a;
        while (true) {
            t tVar = (t) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) tVar.j();
            if (e10 != t.f15675h) {
                return e10;
            }
            androidx.concurrent.futures.b.a(f15671a, this, tVar, tVar.i());
        }
    }
}
