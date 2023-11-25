package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes3.dex */
public abstract class g extends Drawable implements Animatable {
    private static final Property<g, Float> B = new c(Float.class, "growFraction");
    private int A;

    /* renamed from: f  reason: collision with root package name */
    final Context f10235f;

    /* renamed from: m  reason: collision with root package name */
    final com.google.android.material.progressindicator.b f10236m;

    /* renamed from: q  reason: collision with root package name */
    private ValueAnimator f10238q;

    /* renamed from: r  reason: collision with root package name */
    private ValueAnimator f10239r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f10240s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f10241t;

    /* renamed from: u  reason: collision with root package name */
    private float f10242u;

    /* renamed from: v  reason: collision with root package name */
    private List<androidx.vectordrawable.graphics.drawable.b> f10243v;

    /* renamed from: w  reason: collision with root package name */
    private androidx.vectordrawable.graphics.drawable.b f10244w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f10245x;

    /* renamed from: y  reason: collision with root package name */
    private float f10246y;

    /* renamed from: z  reason: collision with root package name */
    final Paint f10247z = new Paint();

    /* renamed from: p  reason: collision with root package name */
    k7.a f10237p = new k7.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            g.this.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            g.super.setVisible(false, false);
            g.this.e();
        }
    }

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    /* loaded from: classes3.dex */
    class c extends Property<g, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Float get(g gVar) {
            return Float.valueOf(gVar.h());
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(g gVar, Float f10) {
            gVar.n(f10.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context, com.google.android.material.progressindicator.b bVar) {
        this.f10235f = context;
        this.f10236m = bVar;
        setAlpha(255);
    }

    private void d(ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f10245x;
        this.f10245x = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f10245x = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f10244w;
        if (bVar != null) {
            bVar.b(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f10243v;
        if (list != null && !this.f10245x) {
            Iterator<androidx.vectordrawable.graphics.drawable.b> it = list.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f10244w;
        if (bVar != null) {
            bVar.c(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f10243v;
        if (list != null && !this.f10245x) {
            Iterator<androidx.vectordrawable.graphics.drawable.b> it = list.iterator();
            while (it.hasNext()) {
                it.next().c(this);
            }
        }
    }

    private void g(ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f10245x;
        this.f10245x = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f10245x = z10;
    }

    private void l() {
        if (this.f10238q == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, B, 0.0f, 1.0f);
            this.f10238q = ofFloat;
            ofFloat.setDuration(500L);
            this.f10238q.setInterpolator(w6.a.f25411b);
            p(this.f10238q);
        }
        if (this.f10239r == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, B, 1.0f, 0.0f);
            this.f10239r = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f10239r.setInterpolator(w6.a.f25411b);
            o(this.f10239r);
        }
    }

    private void o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f10239r;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f10239r = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void p(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f10238q;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f10238q = valueAnimator;
        valueAnimator.addListener(new a());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float h() {
        if (!this.f10236m.b() && !this.f10236m.a()) {
            return 1.0f;
        }
        if (!this.f10241t && !this.f10240s) {
            return this.f10246y;
        }
        return this.f10242u;
    }

    public boolean i() {
        return q(false, false, false);
    }

    public boolean isRunning() {
        if (!k() && !j()) {
            return false;
        }
        return true;
    }

    public boolean j() {
        ValueAnimator valueAnimator = this.f10239r;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.f10241t) {
            return true;
        }
        return false;
    }

    public boolean k() {
        ValueAnimator valueAnimator = this.f10238q;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.f10240s) {
            return true;
        }
        return false;
    }

    public void m(androidx.vectordrawable.graphics.drawable.b bVar) {
        if (this.f10243v == null) {
            this.f10243v = new ArrayList();
        }
        if (!this.f10243v.contains(bVar)) {
            this.f10243v.add(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(float f10) {
        if (this.f10246y != f10) {
            this.f10246y = f10;
            invalidateSelf();
        }
    }

    public boolean q(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float a10 = this.f10237p.a(this.f10235f.getContentResolver());
        if (z12 && a10 > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        return r(z10, z11, z13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(boolean z10, boolean z11, boolean z12) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z13;
        boolean a10;
        l();
        if (!isVisible() && !z10) {
            return false;
        }
        if (z10) {
            valueAnimator = this.f10238q;
        } else {
            valueAnimator = this.f10239r;
        }
        if (z10) {
            valueAnimator2 = this.f10239r;
        } else {
            valueAnimator2 = this.f10238q;
        }
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                g(valueAnimator);
            }
            return super.setVisible(z10, false);
        } else if (z12 && valueAnimator.isRunning()) {
            return false;
        } else {
            if (z10 && !super.setVisible(z10, false)) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z10) {
                a10 = this.f10236m.b();
            } else {
                a10 = this.f10236m.a();
            }
            if (!a10) {
                g(valueAnimator);
                return z13;
            }
            if (!z11 && valueAnimator.isPaused()) {
                valueAnimator.resume();
            } else {
                valueAnimator.start();
            }
            return z13;
        }
    }

    public boolean s(androidx.vectordrawable.graphics.drawable.b bVar) {
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f10243v;
        if (list != null && list.contains(bVar)) {
            this.f10243v.remove(bVar);
            if (this.f10243v.isEmpty()) {
                this.f10243v = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.A = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f10247z.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return q(z10, z11, true);
    }

    public void start() {
        r(true, true, false);
    }

    public void stop() {
        r(false, true, false);
    }
}
