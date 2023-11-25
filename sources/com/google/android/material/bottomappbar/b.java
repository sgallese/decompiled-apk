package com.google.android.material.bottomappbar;

import p7.f;
import p7.m;

/* compiled from: BottomAppBarTopEdgeTreatment.java */
/* loaded from: classes3.dex */
public class b extends f implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private float f9623f;

    /* renamed from: m  reason: collision with root package name */
    private float f9624m;

    /* renamed from: p  reason: collision with root package name */
    private float f9625p;

    /* renamed from: q  reason: collision with root package name */
    private float f9626q;

    /* renamed from: r  reason: collision with root package name */
    private float f9627r;

    /* renamed from: s  reason: collision with root package name */
    private float f9628s;

    @Override // p7.f
    public void b(float f10, float f11, float f12, m mVar) {
        boolean z10;
        float f13;
        float f14;
        float f15 = this.f9625p;
        if (f15 == 0.0f) {
            mVar.m(f10, 0.0f);
            return;
        }
        float f16 = ((this.f9624m * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f9623f;
        float f18 = f11 + this.f9627r;
        float f19 = (this.f9626q * f12) + ((1.0f - f12) * f16);
        if (f19 / f16 >= 1.0f) {
            mVar.m(f10, 0.0f);
            return;
        }
        float f20 = this.f9628s;
        float f21 = f20 * f12;
        if (f20 != -1.0f && Math.abs((f20 * 2.0f) - f15) >= 0.1f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            f14 = 1.75f;
            f13 = 0.0f;
        } else {
            f13 = f19;
            f14 = 0.0f;
        }
        float f22 = f16 + f17;
        float f23 = f13 + f17;
        float sqrt = (float) Math.sqrt((f22 * f22) - (f23 * f23));
        float f24 = f18 - sqrt;
        float f25 = f18 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f23));
        float f26 = (90.0f - degrees) + f14;
        mVar.m(f24, 0.0f);
        float f27 = f17 * 2.0f;
        mVar.a(f24 - f17, 0.0f, f24 + f17, f27, 270.0f, degrees);
        if (z10) {
            mVar.a(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f26, (f26 * 2.0f) - 180.0f);
        } else {
            float f28 = this.f9624m;
            float f29 = f21 * 2.0f;
            float f30 = f18 - f16;
            mVar.a(f30, -(f21 + f28), f30 + f28 + f29, f28 + f21, 180.0f - f26, ((f26 * 2.0f) - 180.0f) / 2.0f);
            float f31 = f18 + f16;
            float f32 = this.f9624m;
            mVar.m(f31 - ((f32 / 2.0f) + f21), f32 + f21);
            float f33 = this.f9624m;
            mVar.a(f31 - (f29 + f33), -(f21 + f33), f31, f33 + f21, 90.0f, f26 - 90.0f);
        }
        mVar.a(f25 - f17, 0.0f, f25 + f17, f27, 270.0f - degrees, degrees);
        mVar.m(f10, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f9626q;
    }

    public float d() {
        return this.f9628s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        return this.f9624m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float f() {
        return this.f9623f;
    }

    public float g() {
        return this.f9625p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(float f10) {
        if (f10 >= 0.0f) {
            this.f9626q = f10;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void i(float f10) {
        this.f9628s = f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(float f10) {
        this.f9624m = f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(float f10) {
        this.f9623f = f10;
    }

    public void l(float f10) {
        this.f9625p = f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(float f10) {
        this.f9627r = f10;
    }
}
