package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.p0;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.n;
import com.google.android.material.internal.p;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import m7.d;
import p7.g;
import v6.f;
import v6.j;
import v6.k;

/* compiled from: BadgeDrawable.java */
/* loaded from: classes3.dex */
public class a extends Drawable implements n.b {
    private static final int A = k.f24809s;
    private static final int B = v6.b.f24626c;

    /* renamed from: f  reason: collision with root package name */
    private final WeakReference<Context> f9536f;

    /* renamed from: m  reason: collision with root package name */
    private final g f9537m;

    /* renamed from: p  reason: collision with root package name */
    private final n f9538p;

    /* renamed from: q  reason: collision with root package name */
    private final Rect f9539q;

    /* renamed from: r  reason: collision with root package name */
    private final BadgeState f9540r;

    /* renamed from: s  reason: collision with root package name */
    private float f9541s;

    /* renamed from: t  reason: collision with root package name */
    private float f9542t;

    /* renamed from: u  reason: collision with root package name */
    private int f9543u;

    /* renamed from: v  reason: collision with root package name */
    private float f9544v;

    /* renamed from: w  reason: collision with root package name */
    private float f9545w;

    /* renamed from: x  reason: collision with root package name */
    private float f9546x;

    /* renamed from: y  reason: collision with root package name */
    private WeakReference<View> f9547y;

    /* renamed from: z  reason: collision with root package name */
    private WeakReference<FrameLayout> f9548z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgeDrawable.java */
    /* renamed from: com.google.android.material.badge.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0230a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f9549f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ FrameLayout f9550m;

        RunnableC0230a(View view, FrameLayout frameLayout) {
            this.f9549f = view;
            this.f9550m = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.y(this.f9549f, this.f9550m);
        }
    }

    private a(Context context, int i10, int i11, int i12, BadgeState.State state) {
        int h10;
        int g10;
        this.f9536f = new WeakReference<>(context);
        p.c(context);
        this.f9539q = new Rect();
        n nVar = new n(this);
        this.f9538p = nVar;
        nVar.e().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i10, i11, i12, state);
        this.f9540r = badgeState;
        if (badgeState.w()) {
            h10 = badgeState.k();
        } else {
            h10 = badgeState.h();
        }
        if (badgeState.w()) {
            g10 = badgeState.j();
        } else {
            g10 = badgeState.g();
        }
        this.f9537m = new g(p7.k.b(context, h10, g10).m());
        v();
    }

    private void A() {
        this.f9543u = ((int) Math.pow(10.0d, h() - 1.0d)) - 1;
    }

    private void b(Rect rect, View view) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (!l()) {
            f10 = this.f9540r.f9513c;
        } else {
            f10 = this.f9540r.f9514d;
        }
        this.f9544v = f10;
        if (f10 != -1.0f) {
            this.f9546x = f10;
            this.f9545w = f10;
        } else {
            if (!l()) {
                f11 = this.f9540r.f9516f;
            } else {
                f11 = this.f9540r.f9518h;
            }
            this.f9546x = Math.round(f11 / 2.0f);
            if (!l()) {
                f12 = this.f9540r.f9515e;
            } else {
                f12 = this.f9540r.f9517g;
            }
            this.f9545w = Math.round(f12 / 2.0f);
        }
        if (i() > 9) {
            this.f9545w = Math.max(this.f9545w, (this.f9538p.f(e()) / 2.0f) + this.f9540r.f9519i);
        }
        int k10 = k();
        int f15 = this.f9540r.f();
        if (f15 != 8388691 && f15 != 8388693) {
            this.f9542t = rect.top + k10;
        } else {
            this.f9542t = rect.bottom - k10;
        }
        int j10 = j();
        int f16 = this.f9540r.f();
        if (f16 != 8388659 && f16 != 8388691) {
            if (p0.E(view) == 0) {
                f14 = (rect.right + this.f9545w) - j10;
            } else {
                f14 = (rect.left - this.f9545w) + j10;
            }
            this.f9541s = f14;
            return;
        }
        if (p0.E(view) == 0) {
            f13 = (rect.left - this.f9545w) + j10;
        } else {
            f13 = (rect.right + this.f9545w) - j10;
        }
        this.f9541s = f13;
    }

    public static a c(Context context) {
        return new a(context, 0, B, A, null);
    }

    private void d(Canvas canvas) {
        Rect rect = new Rect();
        String e10 = e();
        this.f9538p.e().getTextBounds(e10, 0, e10.length(), rect);
        canvas.drawText(e10, this.f9541s, this.f9542t + (rect.height() / 2), this.f9538p.e());
    }

    private String e() {
        if (i() <= this.f9543u) {
            return NumberFormat.getInstance(this.f9540r.s()).format(i());
        }
        Context context = this.f9536f.get();
        if (context == null) {
            return "";
        }
        return String.format(this.f9540r.s(), context.getString(j.f24779o), Integer.valueOf(this.f9543u), "+");
    }

    private int j() {
        int p10;
        int i10;
        if (l()) {
            p10 = this.f9540r.o();
        } else {
            p10 = this.f9540r.p();
        }
        if (this.f9540r.f9522l == 1) {
            if (l()) {
                i10 = this.f9540r.f9521k;
            } else {
                i10 = this.f9540r.f9520j;
            }
            p10 += i10;
        }
        return p10 + this.f9540r.b();
    }

    private int k() {
        int v10;
        if (l()) {
            v10 = this.f9540r.u();
        } else {
            v10 = this.f9540r.v();
        }
        if (this.f9540r.f9522l == 0) {
            v10 -= Math.round(this.f9546x);
        }
        return v10 + this.f9540r.c();
    }

    private void m() {
        this.f9538p.e().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void n() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f9540r.e());
        if (this.f9537m.x() != valueOf) {
            this.f9537m.b0(valueOf);
            invalidateSelf();
        }
    }

    private void o() {
        FrameLayout frameLayout;
        WeakReference<View> weakReference = this.f9547y;
        if (weakReference != null && weakReference.get() != null) {
            View view = this.f9547y.get();
            WeakReference<FrameLayout> weakReference2 = this.f9548z;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            } else {
                frameLayout = null;
            }
            y(view, frameLayout);
        }
    }

    private void p() {
        int h10;
        int g10;
        Context context = this.f9536f.get();
        if (context == null) {
            return;
        }
        g gVar = this.f9537m;
        if (this.f9540r.w()) {
            h10 = this.f9540r.k();
        } else {
            h10 = this.f9540r.h();
        }
        if (this.f9540r.w()) {
            g10 = this.f9540r.j();
        } else {
            g10 = this.f9540r.g();
        }
        gVar.setShapeAppearanceModel(p7.k.b(context, h10, g10).m());
        invalidateSelf();
    }

    private void q() {
        d dVar;
        Context context = this.f9536f.get();
        if (context == null || this.f9538p.d() == (dVar = new d(context, this.f9540r.t()))) {
            return;
        }
        this.f9538p.h(dVar, context);
        r();
        z();
        invalidateSelf();
    }

    private void r() {
        this.f9538p.e().setColor(this.f9540r.i());
        invalidateSelf();
    }

    private void s() {
        A();
        this.f9538p.i(true);
        z();
        invalidateSelf();
    }

    private void t() {
        this.f9538p.i(true);
        p();
        z();
        invalidateSelf();
    }

    private void u() {
        boolean x10 = this.f9540r.x();
        setVisible(x10, false);
        if (b.f9552a && g() != null && !x10) {
            ((ViewGroup) g().getParent()).invalidate();
        }
    }

    private void v() {
        p();
        q();
        s();
        t();
        m();
        n();
        r();
        o();
        z();
        u();
    }

    private void w(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != f.f24735x) {
            WeakReference<FrameLayout> weakReference = this.f9548z;
            if (weakReference != null && weakReference.get() == viewGroup) {
                return;
            }
            x(view);
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.setId(f.f24735x);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(view.getLayoutParams());
            frameLayout.setMinimumWidth(view.getWidth());
            frameLayout.setMinimumHeight(view.getHeight());
            int indexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeViewAt(indexOfChild);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(view);
            viewGroup.addView(frameLayout, indexOfChild);
            this.f9548z = new WeakReference<>(frameLayout);
            frameLayout.post(new RunnableC0230a(view, frameLayout));
        }
    }

    private static void x(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void z() {
        View view;
        Context context = this.f9536f.get();
        WeakReference<View> weakReference = this.f9547y;
        FrameLayout frameLayout = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f9539q);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f9548z;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            }
            if (frameLayout != null || b.f9552a) {
                if (frameLayout == null) {
                    frameLayout = (ViewGroup) view.getParent();
                }
                frameLayout.offsetDescendantRectToMyCoords(view, rect2);
            }
            b(rect2, view);
            b.d(this.f9539q, this.f9541s, this.f9542t, this.f9545w, this.f9546x);
            float f10 = this.f9544v;
            if (f10 != -1.0f) {
                this.f9537m.Y(f10);
            }
            if (!rect.equals(this.f9539q)) {
                this.f9537m.setBounds(this.f9539q);
            }
        }
    }

    @Override // com.google.android.material.internal.n.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f9537m.draw(canvas);
            if (l()) {
                d(canvas);
            }
        }
    }

    public CharSequence f() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (l()) {
            if (this.f9540r.n() == 0 || (context = this.f9536f.get()) == null) {
                return null;
            }
            if (i() <= this.f9543u) {
                return context.getResources().getQuantityString(this.f9540r.n(), i(), Integer.valueOf(i()));
            }
            return context.getString(this.f9540r.l(), Integer.valueOf(this.f9543u));
        }
        return this.f9540r.m();
    }

    public FrameLayout g() {
        WeakReference<FrameLayout> weakReference = this.f9548z;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9540r.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9539q.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f9539q.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int h() {
        return this.f9540r.q();
    }

    public int i() {
        if (l()) {
            return this.f9540r.r();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public boolean l() {
        return this.f9540r.w();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.n.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f9540r.z(i10);
        m();
    }

    public void y(View view, FrameLayout frameLayout) {
        this.f9547y = new WeakReference<>(view);
        boolean z10 = b.f9552a;
        if (z10 && frameLayout == null) {
            w(view);
        } else {
            this.f9548z = new WeakReference<>(frameLayout);
        }
        if (!z10) {
            x(view);
        }
        z();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
