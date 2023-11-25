package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbsActionBarView.java */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    protected final C0014a f1411f;

    /* renamed from: m  reason: collision with root package name */
    protected final Context f1412m;

    /* renamed from: p  reason: collision with root package name */
    protected ActionMenuView f1413p;

    /* renamed from: q  reason: collision with root package name */
    protected c f1414q;

    /* renamed from: r  reason: collision with root package name */
    protected int f1415r;

    /* renamed from: s  reason: collision with root package name */
    protected androidx.core.view.x0 f1416s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1417t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1418u;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected class C0014a implements androidx.core.view.y0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1419a = false;

        /* renamed from: b  reason: collision with root package name */
        int f1420b;

        protected C0014a() {
        }

        @Override // androidx.core.view.y0
        public void a(View view) {
            this.f1419a = true;
        }

        @Override // androidx.core.view.y0
        public void b(View view) {
            if (this.f1419a) {
                return;
            }
            a aVar = a.this;
            aVar.f1416s = null;
            a.super.setVisibility(this.f1420b);
        }

        @Override // androidx.core.view.y0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1419a = false;
        }

        public C0014a d(androidx.core.view.x0 x0Var, int i10) {
            a.this.f1416s = x0Var;
            this.f1420b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int d(int i10, int i11, boolean z10) {
        if (z10) {
            return i10 - i11;
        }
        return i10 + i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, RecyclerView.UNDEFINED_DURATION), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        if (z10) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public androidx.core.view.x0 f(int i10, long j10) {
        androidx.core.view.x0 x0Var = this.f1416s;
        if (x0Var != null) {
            x0Var.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            androidx.core.view.x0 b10 = androidx.core.view.p0.e(this).b(1.0f);
            b10.h(j10);
            b10.j(this.f1411f.d(b10, i10));
            return b10;
        }
        androidx.core.view.x0 b11 = androidx.core.view.p0.e(this).b(0.0f);
        b11.h(j10);
        b11.j(this.f1411f.d(b11, i10));
        return b11;
    }

    public int getAnimatedVisibility() {
        if (this.f1416s != null) {
            return this.f1411f.f1420b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1415r;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, g.j.f15832a, g.a.f15692c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(g.j.f15879j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1414q;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1418u = false;
        }
        if (!this.f1418u) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1418u = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1418u = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1417t = false;
        }
        if (!this.f1417t) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1417t = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1417t = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f1415r = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.x0 x0Var = this.f1416s;
            if (x0Var != null) {
                x0Var.c();
            }
            super.setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1411f = new C0014a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(g.a.f15690a, typedValue, true) && typedValue.resourceId != 0) {
            this.f1412m = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f1412m = context;
        }
    }
}
