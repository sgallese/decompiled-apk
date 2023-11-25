package o1;

import j0.d3;
import j0.j1;
import qc.q;

/* compiled from: ModifierLocalModifierNode.kt */
/* loaded from: classes.dex */
public final class n extends g {

    /* renamed from: a  reason: collision with root package name */
    private final c<?> f20344a;

    /* renamed from: b  reason: collision with root package name */
    private final j1 f20345b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c<?> cVar) {
        super(null);
        j1 e10;
        q.i(cVar, "key");
        this.f20344a = cVar;
        e10 = d3.e(null, null, 2, null);
        this.f20345b = e10;
    }

    private final Object c() {
        return this.f20345b.getValue();
    }

    private final void e(Object obj) {
        this.f20345b.setValue(obj);
    }

    @Override // o1.g
    public boolean a(c<?> cVar) {
        q.i(cVar, "key");
        if (cVar == this.f20344a) {
            return true;
        }
        return false;
    }

    @Override // o1.g
    public <T> T b(c<T> cVar) {
        boolean z10;
        q.i(cVar, "key");
        if (cVar == this.f20344a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            T t10 = (T) c();
            if (t10 == null) {
                return null;
            }
            return t10;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public <T> void d(c<T> cVar, T t10) {
        boolean z10;
        q.i(cVar, "key");
        if (cVar == this.f20344a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            e(t10);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
