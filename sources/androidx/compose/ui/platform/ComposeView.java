package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: ComposeView.android.kt */
/* loaded from: classes.dex */
public final class ComposeView extends androidx.compose.ui.platform.a {

    /* renamed from: x  reason: collision with root package name */
    public static final int f2550x = 8;

    /* renamed from: v  reason: collision with root package name */
    private final j0.j1<pc.p<j0.l, Integer, dc.w>> f2551v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f2552w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f2554m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f2554m = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            ComposeView.this.a(lVar, j0.z1.a(this.f2554m | 1));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        qc.q.i(context, "context");
    }

    @Override // androidx.compose.ui.platform.a
    public void a(j0.l lVar, int i10) {
        j0.l q10 = lVar.q(420213850);
        if (j0.n.K()) {
            j0.n.V(420213850, i10, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:426)");
        }
        pc.p<j0.l, Integer, dc.w> value = this.f2551v.getValue();
        if (value != null) {
            value.invoke(q10, 0);
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        j0.g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new a(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = ComposeView.class.getName();
        qc.q.h(name, "javaClass.name");
        return name;
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f2552w;
    }

    public final void setContent(pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
        qc.q.i(pVar, "content");
        this.f2552w = true;
        this.f2551v.setValue(pVar);
        if (isAttachedToWindow()) {
            d();
        }
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i10, int i11, qc.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        qc.q.i(context, "context");
        this.f2551v = j0.y2.i(null, null, 2, null);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
