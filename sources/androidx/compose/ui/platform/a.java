package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import j0.b2;
import java.lang.ref.WeakReference;

/* compiled from: ComposeView.android.kt */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<j0.p> f2600f;

    /* renamed from: m  reason: collision with root package name */
    private IBinder f2601m;

    /* renamed from: p  reason: collision with root package name */
    private j0.o f2602p;

    /* renamed from: q  reason: collision with root package name */
    private j0.p f2603q;

    /* renamed from: r  reason: collision with root package name */
    private pc.a<dc.w> f2604r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f2605s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f2606t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f2607u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposeView.android.kt */
    /* renamed from: androidx.compose.ui.platform.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0040a extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        C0040a() {
            super(2);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(-656146368, i10, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:250)");
            }
            a.this.a(lVar, 8);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        qc.q.i(context, "context");
    }

    private final j0.p b(j0.p pVar) {
        j0.p pVar2;
        if (i(pVar)) {
            pVar2 = pVar;
        } else {
            pVar2 = null;
        }
        if (pVar2 != null) {
            this.f2600f = new WeakReference<>(pVar2);
        }
        return pVar;
    }

    private final void c() {
        if (this.f2606t) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void f() {
        if (this.f2602p == null) {
            try {
                this.f2606t = true;
                this.f2602p = b5.e(this, j(), q0.c.c(-656146368, true, new C0040a()));
            } finally {
                this.f2606t = false;
            }
        }
    }

    private final boolean i(j0.p pVar) {
        if ((pVar instanceof j0.b2) && ((j0.b2) pVar).Z().getValue().compareTo(b2.d.ShuttingDown) <= 0) {
            return false;
        }
        return true;
    }

    private final j0.p j() {
        j0.p pVar;
        j0.p pVar2;
        j0.p pVar3 = this.f2603q;
        if (pVar3 == null) {
            j0.p d10 = WindowRecomposer_androidKt.d(this);
            j0.p pVar4 = null;
            if (d10 != null) {
                pVar = b(d10);
            } else {
                pVar = null;
            }
            if (pVar == null) {
                WeakReference<j0.p> weakReference = this.f2600f;
                if (weakReference != null && (pVar2 = weakReference.get()) != null && i(pVar2)) {
                    pVar4 = pVar2;
                }
                j0.p pVar5 = pVar4;
                if (pVar5 == null) {
                    return b(WindowRecomposer_androidKt.h(this));
                }
                return pVar5;
            }
            return pVar;
        }
        return pVar3;
    }

    private final void setParentContext(j0.p pVar) {
        if (this.f2603q != pVar) {
            this.f2603q = pVar;
            if (pVar != null) {
                this.f2600f = null;
            }
            j0.o oVar = this.f2602p;
            if (oVar != null) {
                oVar.dispose();
                this.f2602p = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f2601m != iBinder) {
            this.f2601m = iBinder;
            this.f2600f = null;
        }
    }

    public abstract void a(j0.l lVar, int i10);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void d() {
        boolean z10;
        if (this.f2603q == null && !isAttachedToWindow()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            f();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
    }

    public final void e() {
        j0.o oVar = this.f2602p;
        if (oVar != null) {
            oVar.dispose();
        }
        this.f2602p = null;
        requestLayout();
    }

    public void g(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        if (this.f2602p != null) {
            return true;
        }
        return false;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f2605s;
    }

    public void h(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        if (this.f2607u && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        f();
        h(i10, i11);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i10);
        }
    }

    public final void setParentCompositionContext(j0.p pVar) {
        setParentContext(pVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f2605s = z10;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((p1.i1) childAt).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f2607u = true;
    }

    public final void setViewCompositionStrategy(e4 e4Var) {
        qc.q.i(e4Var, "strategy");
        pc.a<dc.w> aVar = this.f2604r;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f2604r = e4Var.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i10, int i11, qc.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        qc.q.i(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        this.f2604r = e4.f2657a.a().a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        c();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        c();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        c();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i10, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
