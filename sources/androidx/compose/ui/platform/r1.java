package androidx.compose.ui.platform;

import hc.f;
import v0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WindowRecomposer.android.kt */
/* loaded from: classes.dex */
public final class r1 implements v0.g {

    /* renamed from: f  reason: collision with root package name */
    private final j0.e1 f2814f = j0.q1.a(1.0f);

    @Override // v0.g
    public float I() {
        return this.f2814f.b();
    }

    public void a(float f10) {
        this.f2814f.h(f10);
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
