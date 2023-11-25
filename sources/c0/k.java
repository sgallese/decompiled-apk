package c0;

import hc.f;
import v0.g;

/* compiled from: TextFieldCursor.kt */
/* loaded from: classes.dex */
final class k implements v0.g {

    /* renamed from: f  reason: collision with root package name */
    public static final k f8451f = new k();

    private k() {
    }

    @Override // v0.g
    public float I() {
        return 1.0f;
    }

    @Override // hc.f
    public <R> R fold(R r10, pc.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) g.a.a(this, r10, pVar);
    }

    @Override // hc.f.b, hc.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) g.a.b(this, cVar);
    }

    @Override // hc.f.b
    public /* synthetic */ f.c getKey() {
        return v0.f.a(this);
    }

    @Override // hc.f
    public hc.f minusKey(f.c<?> cVar) {
        return g.a.c(this, cVar);
    }

    @Override // hc.f
    public hc.f plus(hc.f fVar) {
        return g.a.d(this, fVar);
    }
}
