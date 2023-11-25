package oa;

import android.view.animation.Interpolator;

/* compiled from: AlphaModifier.java */
/* loaded from: classes4.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private int f20589a;

    /* renamed from: b  reason: collision with root package name */
    private int f20590b;

    /* renamed from: c  reason: collision with root package name */
    private long f20591c;

    /* renamed from: d  reason: collision with root package name */
    private long f20592d;

    /* renamed from: e  reason: collision with root package name */
    private float f20593e;

    /* renamed from: f  reason: collision with root package name */
    private float f20594f;

    /* renamed from: g  reason: collision with root package name */
    private Interpolator f20595g;

    public a(int i10, int i11, long j10, long j11, Interpolator interpolator) {
        this.f20589a = i10;
        this.f20590b = i11;
        this.f20591c = j10;
        this.f20592d = j11;
        this.f20593e = (float) (j11 - j10);
        this.f20594f = i11 - i10;
        this.f20595g = interpolator;
    }

    @Override // oa.b
    public void a(ma.b bVar, long j10) {
        long j11 = this.f20591c;
        if (j10 < j11) {
            bVar.f19815e = this.f20589a;
        } else if (j10 > this.f20592d) {
            bVar.f19815e = this.f20590b;
        } else {
            bVar.f19815e = (int) (this.f20589a + (this.f20594f * this.f20595g.getInterpolation((((float) (j10 - j11)) * 1.0f) / this.f20593e)));
        }
    }
}
