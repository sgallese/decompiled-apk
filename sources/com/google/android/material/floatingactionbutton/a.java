package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.p0;
import java.util.ArrayList;
import java.util.Iterator;
import p7.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes3.dex */
public class a {
    static final TimeInterpolator C = w6.a.f25412c;
    private static final int D = v6.b.E;
    private static final int E = v6.b.O;
    private static final int F = v6.b.F;
    private static final int G = v6.b.M;
    static final int[] H = {16842919, 16842910};
    static final int[] I = {16843623, 16842908, 16842910};
    static final int[] J = {16842908, 16842910};
    static final int[] K = {16843623, 16842910};
    static final int[] L = {16842910};
    static final int[] M = new int[0];
    private ViewTreeObserver.OnPreDrawListener B;

    /* renamed from: a  reason: collision with root package name */
    p7.k f10025a;

    /* renamed from: b  reason: collision with root package name */
    p7.g f10026b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f10027c;

    /* renamed from: d  reason: collision with root package name */
    Drawable f10028d;

    /* renamed from: e  reason: collision with root package name */
    boolean f10029e;

    /* renamed from: g  reason: collision with root package name */
    float f10031g;

    /* renamed from: h  reason: collision with root package name */
    float f10032h;

    /* renamed from: i  reason: collision with root package name */
    float f10033i;

    /* renamed from: j  reason: collision with root package name */
    int f10034j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.android.material.internal.k f10035k;

    /* renamed from: l  reason: collision with root package name */
    private Animator f10036l;

    /* renamed from: m  reason: collision with root package name */
    private w6.h f10037m;

    /* renamed from: n  reason: collision with root package name */
    private w6.h f10038n;

    /* renamed from: o  reason: collision with root package name */
    private float f10039o;

    /* renamed from: q  reason: collision with root package name */
    private int f10041q;

    /* renamed from: s  reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f10043s;

    /* renamed from: t  reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f10044t;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<j> f10045u;

    /* renamed from: v  reason: collision with root package name */
    final FloatingActionButton f10046v;

    /* renamed from: w  reason: collision with root package name */
    final o7.b f10047w;

    /* renamed from: f  reason: collision with root package name */
    boolean f10030f = true;

    /* renamed from: p  reason: collision with root package name */
    private float f10040p = 1.0f;

    /* renamed from: r  reason: collision with root package name */
    private int f10042r = 0;

    /* renamed from: x  reason: collision with root package name */
    private final Rect f10048x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    private final RectF f10049y = new RectF();

    /* renamed from: z  reason: collision with root package name */
    private final RectF f10050z = new RectF();
    private final Matrix A = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0237a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10051a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f10052b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f10053c;

        C0237a(boolean z10, k kVar) {
            this.f10052b = z10;
            this.f10053c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10051a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i10;
            a.this.f10042r = 0;
            a.this.f10036l = null;
            if (!this.f10051a) {
                FloatingActionButton floatingActionButton = a.this.f10046v;
                boolean z10 = this.f10052b;
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                floatingActionButton.b(i10, z10);
                k kVar = this.f10053c;
                if (kVar != null) {
                    kVar.b();
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f10046v.b(0, this.f10052b);
            a.this.f10042r = 1;
            a.this.f10036l = animator;
            this.f10051a = false;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f10055a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f10056b;

        b(boolean z10, k kVar) {
            this.f10055a = z10;
            this.f10056b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f10042r = 0;
            a.this.f10036l = null;
            k kVar = this.f10056b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f10046v.b(0, this.f10055a);
            a.this.f10042r = 2;
            a.this.f10036l = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public class c extends w6.g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            a.this.f10040p = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f10059a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f10060b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f10061c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f10062d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f10063e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f10064f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f10065g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Matrix f10066h;

        d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f10059a = f10;
            this.f10060b = f11;
            this.f10061c = f12;
            this.f10062d = f13;
            this.f10063e = f14;
            this.f10064f = f15;
            this.f10065g = f16;
            this.f10066h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f10046v.setAlpha(w6.a.b(this.f10059a, this.f10060b, 0.0f, 0.2f, floatValue));
            a.this.f10046v.setScaleX(w6.a.a(this.f10061c, this.f10062d, floatValue));
            a.this.f10046v.setScaleY(w6.a.a(this.f10063e, this.f10062d, floatValue));
            a.this.f10040p = w6.a.a(this.f10064f, this.f10065g, floatValue);
            a.this.h(w6.a.a(this.f10064f, this.f10065g, floatValue), this.f10066h);
            a.this.f10046v.setImageMatrix(this.f10066h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public class e implements TypeEvaluator<Float> {

        /* renamed from: a  reason: collision with root package name */
        FloatEvaluator f10068a = new FloatEvaluator();

        e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float floatValue = this.f10068a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    public class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.F();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    private class g extends m {
        g() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    private class h extends m {
        h() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            a aVar = a.this;
            return aVar.f10031g + aVar.f10032h;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    private class i extends m {
        i() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            a aVar = a.this;
            return aVar.f10031g + aVar.f10033i;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    interface j {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    interface k {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    private class l extends m {
        l() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            return a.this.f10031g;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10075a;

        /* renamed from: b  reason: collision with root package name */
        private float f10076b;

        /* renamed from: c  reason: collision with root package name */
        private float f10077c;

        private m() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.d0((int) this.f10077c);
            this.f10075a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float w10;
            if (!this.f10075a) {
                p7.g gVar = a.this.f10026b;
                if (gVar == null) {
                    w10 = 0.0f;
                } else {
                    w10 = gVar.w();
                }
                this.f10076b = w10;
                this.f10077c = a();
                this.f10075a = true;
            }
            a aVar = a.this;
            float f10 = this.f10076b;
            aVar.d0((int) (f10 + ((this.f10077c - f10) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ m(a aVar, C0237a c0237a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(FloatingActionButton floatingActionButton, o7.b bVar) {
        this.f10046v = floatingActionButton;
        this.f10047w = bVar;
        com.google.android.material.internal.k kVar = new com.google.android.material.internal.k();
        this.f10035k = kVar;
        kVar.a(H, k(new i()));
        kVar.a(I, k(new h()));
        kVar.a(J, k(new h()));
        kVar.a(K, k(new h()));
        kVar.a(L, k(new l()));
        kVar.a(M, k(new g()));
        this.f10039o = floatingActionButton.getRotation();
    }

    private boolean X() {
        if (p0.Y(this.f10046v) && !this.f10046v.isInEditMode()) {
            return true;
        }
        return false;
    }

    private void e0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(float f10, Matrix matrix) {
        matrix.reset();
        if (this.f10046v.getDrawable() != null && this.f10041q != 0) {
            RectF rectF = this.f10049y;
            RectF rectF2 = this.f10050z;
            rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
            int i10 = this.f10041q;
            rectF2.set(0.0f, 0.0f, i10, i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f10041q;
            matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
        }
    }

    private AnimatorSet i(w6.h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10046v, View.ALPHA, f10);
        hVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f10046v, View.SCALE_X, f11);
        hVar.e("scale").a(ofFloat2);
        e0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f10046v, View.SCALE_Y, f11);
        hVar.e("scale").a(ofFloat3);
        e0(ofFloat3);
        arrayList.add(ofFloat3);
        h(f12, this.A);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f10046v, new w6.f(), new c(), new Matrix(this.A));
        hVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        w6.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d(this.f10046v.getAlpha(), f10, this.f10046v.getScaleX(), f11, this.f10046v.getScaleY(), this.f10040p, f12, new Matrix(this.A)));
        arrayList.add(ofFloat);
        w6.b.a(animatorSet, arrayList);
        animatorSet.setDuration(j7.a.f(this.f10046v.getContext(), i10, this.f10046v.getContext().getResources().getInteger(v6.g.f24739b)));
        animatorSet.setInterpolator(j7.a.g(this.f10046v.getContext(), i11, w6.a.f25411b));
        return animatorSet;
    }

    private ValueAnimator k(m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.B == null) {
            this.B = new f();
        }
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        ViewTreeObserver viewTreeObserver = this.f10046v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.B = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(int[] iArr) {
        throw null;
    }

    void D(float f10, float f11, float f12) {
        throw null;
    }

    void E(Rect rect) {
        androidx.core.util.i.h(this.f10028d, "Didn't initialize content background");
        if (W()) {
            this.f10047w.a(new InsetDrawable(this.f10028d, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f10047w.a(this.f10028d);
    }

    void F() {
        float rotation = this.f10046v.getRotation();
        if (this.f10039o != rotation) {
            this.f10039o = rotation;
            a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        ArrayList<j> arrayList = this.f10045u;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        ArrayList<j> arrayList = this.f10045u;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    boolean I() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(ColorStateList colorStateList) {
        p7.g gVar = this.f10026b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(PorterDuff.Mode mode) {
        p7.g gVar = this.f10026b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L(float f10) {
        if (this.f10031g != f10) {
            this.f10031g = f10;
            D(f10, this.f10032h, this.f10033i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(boolean z10) {
        this.f10029e = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N(w6.h hVar) {
        this.f10038n = hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O(float f10) {
        if (this.f10032h != f10) {
            this.f10032h = f10;
            D(this.f10031g, f10, this.f10033i);
        }
    }

    final void P(float f10) {
        this.f10040p = f10;
        Matrix matrix = this.A;
        h(f10, matrix);
        this.f10046v.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q(int i10) {
        if (this.f10041q != i10) {
            this.f10041q = i10;
            b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R(float f10) {
        if (this.f10033i != f10) {
            this.f10033i = f10;
            D(this.f10031g, this.f10032h, f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(ColorStateList colorStateList) {
        Drawable drawable = this.f10027c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, n7.b.e(colorStateList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(boolean z10) {
        this.f10030f = z10;
        c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U(p7.k kVar) {
        this.f10025a = kVar;
        p7.g gVar = this.f10026b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f10027c;
        if (drawable instanceof n) {
            ((n) drawable).setShapeAppearanceModel(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V(w6.h hVar) {
        this.f10037m = hVar;
    }

    boolean W() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Y() {
        if (this.f10029e && this.f10046v.getSizeDimension() < this.f10034j) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(k kVar, boolean z10) {
        boolean z11;
        AnimatorSet j10;
        float f10;
        float f11;
        if (x()) {
            return;
        }
        Animator animator = this.f10036l;
        if (animator != null) {
            animator.cancel();
        }
        if (this.f10037m == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (X()) {
            if (this.f10046v.getVisibility() != 0) {
                float f12 = 0.0f;
                this.f10046v.setAlpha(0.0f);
                FloatingActionButton floatingActionButton = this.f10046v;
                if (z11) {
                    f10 = 0.4f;
                } else {
                    f10 = 0.0f;
                }
                floatingActionButton.setScaleY(f10);
                FloatingActionButton floatingActionButton2 = this.f10046v;
                if (z11) {
                    f11 = 0.4f;
                } else {
                    f11 = 0.0f;
                }
                floatingActionButton2.setScaleX(f11);
                if (z11) {
                    f12 = 0.4f;
                }
                P(f12);
            }
            w6.h hVar = this.f10037m;
            if (hVar != null) {
                j10 = i(hVar, 1.0f, 1.0f, 1.0f);
            } else {
                j10 = j(1.0f, 1.0f, 1.0f, D, E);
            }
            j10.addListener(new b(z10, kVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.f10043s;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    j10.addListener(it.next());
                }
            }
            j10.start();
            return;
        }
        this.f10046v.b(0, z10);
        this.f10046v.setAlpha(1.0f);
        this.f10046v.setScaleY(1.0f);
        this.f10046v.setScaleX(1.0f);
        P(1.0f);
        if (kVar != null) {
            kVar.a();
        }
    }

    void a0() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b0() {
        P(this.f10040p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c0() {
        Rect rect = this.f10048x;
        r(rect);
        E(rect);
        this.f10047w.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(float f10) {
        p7.g gVar = this.f10026b;
        if (gVar != null) {
            gVar.a0(f10);
        }
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.f10044t == null) {
            this.f10044t = new ArrayList<>();
        }
        this.f10044t.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Animator.AnimatorListener animatorListener) {
        if (this.f10043s == null) {
            this.f10043s = new ArrayList<>();
        }
        this.f10043s.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(j jVar) {
        if (this.f10045u == null) {
            this.f10045u = new ArrayList<>();
        }
        this.f10045u.add(jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable l() {
        return this.f10028d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float m() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.f10029e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w6.h o() {
        return this.f10038n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float p() {
        return this.f10032h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(Rect rect) {
        int i10;
        float f10;
        if (this.f10029e) {
            i10 = (this.f10034j - this.f10046v.getSizeDimension()) / 2;
        } else {
            i10 = 0;
        }
        if (this.f10030f) {
            f10 = m() + this.f10033i;
        } else {
            f10 = 0.0f;
        }
        int max = Math.max(i10, (int) Math.ceil(f10));
        int max2 = Math.max(i10, (int) Math.ceil(f10 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float s() {
        return this.f10033i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final p7.k t() {
        return this.f10025a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w6.h u() {
        return this.f10037m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(k kVar, boolean z10) {
        int i10;
        AnimatorSet j10;
        if (w()) {
            return;
        }
        Animator animator = this.f10036l;
        if (animator != null) {
            animator.cancel();
        }
        if (X()) {
            w6.h hVar = this.f10038n;
            if (hVar != null) {
                j10 = i(hVar, 0.0f, 0.0f, 0.0f);
            } else {
                j10 = j(0.0f, 0.4f, 0.4f, F, G);
            }
            j10.addListener(new C0237a(z10, kVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.f10044t;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    j10.addListener(it.next());
                }
            }
            j10.start();
            return;
        }
        FloatingActionButton floatingActionButton = this.f10046v;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 4;
        }
        floatingActionButton.b(i10, z10);
        if (kVar != null) {
            kVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w() {
        if (this.f10046v.getVisibility() == 0) {
            if (this.f10042r != 1) {
                return false;
            }
            return true;
        } else if (this.f10042r == 2) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        if (this.f10046v.getVisibility() != 0) {
            if (this.f10042r != 2) {
                return false;
            }
            return true;
        } else if (this.f10042r == 1) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        p7.g gVar = this.f10026b;
        if (gVar != null) {
            p7.h.f(this.f10046v, gVar);
        }
        if (I()) {
            this.f10046v.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }
}
