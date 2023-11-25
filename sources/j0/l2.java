package j0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SlotTable.kt */
/* loaded from: classes.dex */
public final class l2 implements u0.b, Iterable<u0.b>, rc.a {

    /* renamed from: f  reason: collision with root package name */
    private final k2 f18698f;

    /* renamed from: m  reason: collision with root package name */
    private final int f18699m;

    /* renamed from: p  reason: collision with root package name */
    private final int f18700p;

    public l2(k2 k2Var, int i10, int i11) {
        qc.q.i(k2Var, "table");
        this.f18698f = k2Var;
        this.f18699m = i10;
        this.f18700p = i11;
    }

    private final void a() {
        if (this.f18698f.o() == this.f18700p) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.lang.Iterable
    public Iterator<u0.b> iterator() {
        int G;
        a();
        k2 k2Var = this.f18698f;
        int i10 = this.f18699m;
        G = m2.G(k2Var.k(), this.f18699m);
        return new k0(k2Var, i10 + 1, i10 + G);
    }
}
