package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* loaded from: classes.dex */
class i {

    /* renamed from: a  reason: collision with root package name */
    private final CompoundButton f1529a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f1530b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f1531c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1532d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1533e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1534f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(CompoundButton compoundButton) {
        this.f1529a = compoundButton;
    }

    void a() {
        Drawable a10 = androidx.core.widget.c.a(this.f1529a);
        if (a10 != null) {
            if (this.f1532d || this.f1533e) {
                Drawable mutate = androidx.core.graphics.drawable.a.r(a10).mutate();
                if (this.f1532d) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f1530b);
                }
                if (this.f1533e) {
                    androidx.core.graphics.drawable.a.p(mutate, this.f1531c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1529a.getDrawableState());
                }
                this.f1529a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.f1530b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.f1531c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #1 {all -> 0x0085, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:12:0x003e, B:14:0x0046, B:16:0x004c, B:17:0x0059, B:19:0x0061, B:20:0x006a, B:22:0x0072), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:12:0x003e, B:14:0x0046, B:16:0x004c, B:17:0x0059, B:19:0x0061, B:20:0x006a, B:22:0x0072), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #1 {all -> 0x0085, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:12:0x003e, B:14:0x0046, B:16:0x004c, B:17:0x0059, B:19:0x0061, B:20:0x006a, B:22:0x0072), top: B:30:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1529a
            android.content.Context r0 = r0.getContext()
            int[] r3 = g.j.U0
            r8 = 0
            androidx.appcompat.widget.g1 r0 = androidx.appcompat.widget.g1.v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1529a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.p0.s0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = g.j.W0     // Catch: java.lang.Throwable -> L85
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L85
            if (r11 == 0) goto L3b
            int r10 = r0.n(r10, r8)     // Catch: java.lang.Throwable -> L85
            if (r10 == 0) goto L3b
            android.widget.CompoundButton r11 = r9.f1529a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L85
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L85
            android.graphics.drawable.Drawable r10 = h.a.b(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L85
            r11.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L85
            r10 = 1
            goto L3c
        L3a:
        L3b:
            r10 = 0
        L3c:
            if (r10 != 0) goto L59
            int r10 = g.j.V0     // Catch: java.lang.Throwable -> L85
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L85
            if (r11 == 0) goto L59
            int r10 = r0.n(r10, r8)     // Catch: java.lang.Throwable -> L85
            if (r10 == 0) goto L59
            android.widget.CompoundButton r11 = r9.f1529a     // Catch: java.lang.Throwable -> L85
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L85
            android.graphics.drawable.Drawable r10 = h.a.b(r1, r10)     // Catch: java.lang.Throwable -> L85
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L85
        L59:
            int r10 = g.j.X0     // Catch: java.lang.Throwable -> L85
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L85
            if (r11 == 0) goto L6a
            android.widget.CompoundButton r11 = r9.f1529a     // Catch: java.lang.Throwable -> L85
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch: java.lang.Throwable -> L85
            androidx.core.widget.c.d(r11, r10)     // Catch: java.lang.Throwable -> L85
        L6a:
            int r10 = g.j.Y0     // Catch: java.lang.Throwable -> L85
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L85
            if (r11 == 0) goto L81
            android.widget.CompoundButton r11 = r9.f1529a     // Catch: java.lang.Throwable -> L85
            r1 = -1
            int r10 = r0.k(r10, r1)     // Catch: java.lang.Throwable -> L85
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.n0.e(r10, r1)     // Catch: java.lang.Throwable -> L85
            androidx.core.widget.c.e(r11, r10)     // Catch: java.lang.Throwable -> L85
        L81:
            r0.w()
            return
        L85:
            r10 = move-exception
            r0.w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.e(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (this.f1534f) {
            this.f1534f = false;
            return;
        }
        this.f1534f = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.f1530b = colorStateList;
        this.f1532d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        this.f1531c = mode;
        this.f1533e = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i10) {
        return i10;
    }
}
