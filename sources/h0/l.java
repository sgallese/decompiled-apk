package h0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import dc.w;

/* compiled from: RippleHostView.android.kt */
/* loaded from: classes.dex */
public final class l extends View {

    /* renamed from: s  reason: collision with root package name */
    public static final a f16401s = new a(null);

    /* renamed from: t  reason: collision with root package name */
    private static final int[] f16402t = {16842919, 16842910};

    /* renamed from: u  reason: collision with root package name */
    private static final int[] f16403u = new int[0];

    /* renamed from: f  reason: collision with root package name */
    private r f16404f;

    /* renamed from: m  reason: collision with root package name */
    private Boolean f16405m;

    /* renamed from: p  reason: collision with root package name */
    private Long f16406p;

    /* renamed from: q  reason: collision with root package name */
    private Runnable f16407q;

    /* renamed from: r  reason: collision with root package name */
    private pc.a<w> f16408r;

    /* compiled from: RippleHostView.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        qc.q.i(context, "context");
    }

    private final void c(boolean z10) {
        r rVar = new r(z10);
        setBackground(rVar);
        this.f16404f = rVar;
    }

    private final void setRippleState(boolean z10) {
        long j10;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f16407q;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f16406p;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = 0;
        }
        long j11 = currentAnimationTimeMillis - j10;
        if (!z10 && j11 < 5) {
            Runnable runnable2 = new Runnable() { // from class: h0.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.setRippleState$lambda$2(l.this);
                }
            };
            this.f16407q = runnable2;
            postDelayed(runnable2, 50L);
        } else {
            if (z10) {
                iArr = f16402t;
            } else {
                iArr = f16403u;
            }
            r rVar = this.f16404f;
            if (rVar != null) {
                rVar.setState(iArr);
            }
        }
        this.f16406p = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(l lVar) {
        qc.q.i(lVar, "this$0");
        r rVar = lVar.f16404f;
        if (rVar != null) {
            rVar.setState(f16403u);
        }
        lVar.f16407q = null;
    }

    public final void b(v.p pVar, boolean z10, long j10, int i10, long j11, float f10, pc.a<w> aVar) {
        qc.q.i(pVar, "interaction");
        qc.q.i(aVar, "onInvalidateRipple");
        if (this.f16404f == null || !qc.q.d(Boolean.valueOf(z10), this.f16405m)) {
            c(z10);
            this.f16405m = Boolean.valueOf(z10);
        }
        r rVar = this.f16404f;
        qc.q.f(rVar);
        this.f16408r = aVar;
        f(j10, i10, j11, f10);
        if (z10) {
            rVar.setHotspot(z0.f.o(pVar.a()), z0.f.p(pVar.a()));
        } else {
            rVar.setHotspot(rVar.getBounds().centerX(), rVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void d() {
        this.f16408r = null;
        Runnable runnable = this.f16407q;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f16407q;
            qc.q.f(runnable2);
            runnable2.run();
        } else {
            r rVar = this.f16404f;
            if (rVar != null) {
                rVar.setState(f16403u);
            }
        }
        r rVar2 = this.f16404f;
        if (rVar2 == null) {
            return;
        }
        rVar2.setVisible(false, false);
        unscheduleDrawable(rVar2);
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j10, int i10, long j11, float f10) {
        int d10;
        int d11;
        r rVar = this.f16404f;
        if (rVar == null) {
            return;
        }
        rVar.c(i10);
        rVar.b(j11, f10);
        d10 = sc.c.d(z0.l.i(j10));
        d11 = sc.c.d(z0.l.g(j10));
        Rect rect = new Rect(0, 0, d10, d11);
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        rVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        qc.q.i(drawable, "who");
        pc.a<w> aVar = this.f16408r;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
