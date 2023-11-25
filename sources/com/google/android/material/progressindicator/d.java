package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes3.dex */
public final class d extends i<ObjectAnimator> {

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f10217l = {0, 1350, 2700, 4050};

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f10218m = {667, 2017, 3367, 4717};

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f10219n = {1000, 2350, 3700, 5050};

    /* renamed from: o  reason: collision with root package name */
    private static final Property<d, Float> f10220o = new c(Float.class, "animationFraction");

    /* renamed from: p  reason: collision with root package name */
    private static final Property<d, Float> f10221p = new C0240d(Float.class, "completeEndFraction");

    /* renamed from: d  reason: collision with root package name */
    private ObjectAnimator f10222d;

    /* renamed from: e  reason: collision with root package name */
    private ObjectAnimator f10223e;

    /* renamed from: f  reason: collision with root package name */
    private final g3.b f10224f;

    /* renamed from: g  reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f10225g;

    /* renamed from: h  reason: collision with root package name */
    private int f10226h;

    /* renamed from: i  reason: collision with root package name */
    private float f10227i;

    /* renamed from: j  reason: collision with root package name */
    private float f10228j;

    /* renamed from: k  reason: collision with root package name */
    androidx.vectordrawable.graphics.drawable.b f10229k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            d dVar = d.this;
            dVar.f10226h = (dVar.f10226h + 4) % d.this.f10225g.f10209c.length;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            d.this.a();
            d dVar = d.this;
            androidx.vectordrawable.graphics.drawable.b bVar = dVar.f10229k;
            if (bVar != null) {
                bVar.b(dVar.f10252a);
            }
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* loaded from: classes3.dex */
    class c extends Property<d, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.o());
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.t(f10.floatValue());
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    /* renamed from: com.google.android.material.progressindicator.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0240d extends Property<d, Float> {
        C0240d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.p());
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.u(f10.floatValue());
        }
    }

    public d(e eVar) {
        super(1);
        this.f10226h = 0;
        this.f10229k = null;
        this.f10225g = eVar;
        this.f10224f = new g3.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float o() {
        return this.f10227i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.f10228j;
    }

    private void q() {
        if (this.f10222d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f10220o, 0.0f, 1.0f);
            this.f10222d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f10222d.setInterpolator(null);
            this.f10222d.setRepeatCount(-1);
            this.f10222d.addListener(new a());
        }
        if (this.f10223e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f10221p, 0.0f, 1.0f);
            this.f10223e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f10223e.setInterpolator(this.f10224f);
            this.f10223e.addListener(new b());
        }
    }

    private void r(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            float b10 = b(i10, f10219n[i11], 333);
            if (b10 >= 0.0f && b10 <= 1.0f) {
                int i12 = i11 + this.f10226h;
                int[] iArr = this.f10225g.f10209c;
                int length = i12 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int a10 = d7.a.a(iArr[length], this.f10252a.getAlpha());
                int a11 = d7.a.a(this.f10225g.f10209c[length2], this.f10252a.getAlpha());
                this.f10254c[0] = w6.c.b().evaluate(this.f10224f.getInterpolation(b10), Integer.valueOf(a10), Integer.valueOf(a11)).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(float f10) {
        this.f10228j = f10;
    }

    private void v(int i10) {
        float[] fArr = this.f10253b;
        float f10 = this.f10227i;
        fArr[0] = (f10 * 1520.0f) - 20.0f;
        fArr[1] = f10 * 1520.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float b10 = b(i10, f10217l[i11], 667);
            float[] fArr2 = this.f10253b;
            fArr2[1] = fArr2[1] + (this.f10224f.getInterpolation(b10) * 250.0f);
            float b11 = b(i10, f10218m[i11], 667);
            float[] fArr3 = this.f10253b;
            fArr3[0] = fArr3[0] + (this.f10224f.getInterpolation(b11) * 250.0f);
        }
        float[] fArr4 = this.f10253b;
        float f11 = fArr4[0];
        float f12 = fArr4[1];
        float f13 = f11 + ((f12 - f11) * this.f10228j);
        fArr4[0] = f13;
        fArr4[0] = f13 / 360.0f;
        fArr4[1] = f12 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.i
    void a() {
        ObjectAnimator objectAnimator = this.f10222d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void c() {
        s();
    }

    @Override // com.google.android.material.progressindicator.i
    public void d(androidx.vectordrawable.graphics.drawable.b bVar) {
        this.f10229k = bVar;
    }

    @Override // com.google.android.material.progressindicator.i
    void f() {
        ObjectAnimator objectAnimator = this.f10223e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f10252a.isVisible()) {
                this.f10223e.start();
            } else {
                a();
            }
        }
    }

    @Override // com.google.android.material.progressindicator.i
    void g() {
        q();
        s();
        this.f10222d.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
        this.f10229k = null;
    }

    void s() {
        this.f10226h = 0;
        this.f10254c[0] = d7.a.a(this.f10225g.f10209c[0], this.f10252a.getAlpha());
        this.f10228j = 0.0f;
    }

    void t(float f10) {
        this.f10227i = f10;
        int i10 = (int) (f10 * 5400.0f);
        v(i10);
        r(i10);
        this.f10252a.invalidateSelf();
    }
}
