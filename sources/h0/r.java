package h0;

import a1.p1;
import a1.r1;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RippleHostView.android.kt */
/* loaded from: classes.dex */
public final class r extends RippleDrawable {

    /* renamed from: r  reason: collision with root package name */
    public static final a f16430r = new a(null);

    /* renamed from: s  reason: collision with root package name */
    private static Method f16431s;

    /* renamed from: t  reason: collision with root package name */
    private static boolean f16432t;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f16433f;

    /* renamed from: m  reason: collision with root package name */
    private p1 f16434m;

    /* renamed from: p  reason: collision with root package name */
    private Integer f16435p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f16436q;

    /* compiled from: RippleHostView.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* compiled from: RippleHostView.android.kt */
    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16437a = new b();

        private b() {
        }

        public final void a(RippleDrawable rippleDrawable, int i10) {
            qc.q.i(rippleDrawable, "ripple");
            rippleDrawable.setRadius(i10);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(boolean r5) {
        /*
            r4 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1 = 0
            if (r5 == 0) goto L10
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = -1
            r2.<init>(r3)
            goto L11
        L10:
            r2 = r1
        L11:
            r4.<init>(r0, r1, r2)
            r4.f16433f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.r.<init>(boolean):void");
    }

    private final long a(long j10, float f10) {
        float g10;
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        g10 = vc.l.g(f10, 1.0f);
        return p1.o(j10, g10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void b(long j10, float f10) {
        boolean q10;
        long a10 = a(j10, f10);
        p1 p1Var = this.f16434m;
        if (p1Var == null) {
            q10 = false;
        } else {
            q10 = p1.q(p1Var.y(), a10);
        }
        if (!q10) {
            this.f16434m = p1.g(a10);
            setColor(ColorStateList.valueOf(r1.k(a10)));
        }
    }

    public final void c(int i10) {
        Integer num = this.f16435p;
        if (num == null || num.intValue() != i10) {
            this.f16435p = Integer.valueOf(i10);
            if (Build.VERSION.SDK_INT < 23) {
                try {
                    if (!f16432t) {
                        f16432t = true;
                        f16431s = RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE);
                    }
                    Method method = f16431s;
                    if (method != null) {
                        method.invoke(this, Integer.valueOf(i10));
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            b.f16437a.a(this, i10);
        }
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.f16433f) {
            this.f16436q = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        qc.q.h(dirtyBounds, "super.getDirtyBounds()");
        this.f16436q = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f16436q;
    }
}
