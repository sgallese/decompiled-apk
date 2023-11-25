package x0;

import dc.w;
import j2.r;
import qc.q;

/* compiled from: DrawModifier.kt */
/* loaded from: classes.dex */
public final class d implements j2.e {

    /* renamed from: f  reason: collision with root package name */
    private b f25682f = j.f25685f;

    /* renamed from: m  reason: collision with root package name */
    private i f25683m;

    @Override // j2.e
    public /* synthetic */ long K(long j10) {
        return j2.d.e(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ int K0(float f10) {
        return j2.d.a(this, f10);
    }

    @Override // j2.e
    public /* synthetic */ long S0(long j10) {
        return j2.d.h(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ float T(long j10) {
        return j2.d.b(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ float W0(long j10) {
        return j2.d.f(this, j10);
    }

    public final long b() {
        return this.f25682f.b();
    }

    @Override // j2.e
    public /* synthetic */ long c0(float f10) {
        return j2.d.i(this, f10);
    }

    public final i d() {
        return this.f25683m;
    }

    public final i f(pc.l<? super c1.c, w> lVar) {
        q.i(lVar, "block");
        i iVar = new i(lVar);
        this.f25683m = iVar;
        return iVar;
    }

    public final void g(b bVar) {
        q.i(bVar, "<set-?>");
        this.f25682f = bVar;
    }

    @Override // j2.e
    public float getDensity() {
        return this.f25682f.getDensity().getDensity();
    }

    public final r getLayoutDirection() {
        return this.f25682f.getLayoutDirection();
    }

    @Override // j2.e
    public /* synthetic */ float h0(int i10) {
        return j2.d.d(this, i10);
    }

    public final void j(i iVar) {
        this.f25683m = iVar;
    }

    @Override // j2.e
    public /* synthetic */ float j0(float f10) {
        return j2.d.c(this, f10);
    }

    @Override // j2.e
    public float p0() {
        return this.f25682f.getDensity().p0();
    }

    @Override // j2.e
    public /* synthetic */ float v0(float f10) {
        return j2.d.g(this, f10);
    }
}
