package ad;

import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
/* loaded from: classes4.dex */
public final class g2<T> extends s0<T> {

    /* renamed from: q  reason: collision with root package name */
    private final Continuation<dc.w> f515q;

    public g2(hc.f fVar, pc.p<? super k0, ? super Continuation<? super T>, ? extends Object> pVar) {
        super(fVar, false);
        Continuation<dc.w> b10;
        b10 = ic.c.b(pVar, this, this);
        this.f515q = b10;
    }

    @Override // ad.e2
    protected void E0() {
        gd.a.b(this.f515q, this);
    }
}
