package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.n0;
import androidx.core.view.accessibility.s0;
import androidx.core.view.p0;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p7.g;
import v6.j;
import v6.k;
import v6.l;
import y2.c;

/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: x  reason: collision with root package name */
    private static final int f10285x = j.A;

    /* renamed from: y  reason: collision with root package name */
    private static final int f10286y = k.f24808r;

    /* renamed from: a  reason: collision with root package name */
    private c f10287a;

    /* renamed from: b  reason: collision with root package name */
    private float f10288b;

    /* renamed from: c  reason: collision with root package name */
    private g f10289c;

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f10290d;

    /* renamed from: e  reason: collision with root package name */
    private p7.k f10291e;

    /* renamed from: f  reason: collision with root package name */
    private final SideSheetBehavior<V>.b f10292f;

    /* renamed from: g  reason: collision with root package name */
    private float f10293g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10294h;

    /* renamed from: i  reason: collision with root package name */
    private int f10295i;

    /* renamed from: j  reason: collision with root package name */
    private int f10296j;

    /* renamed from: k  reason: collision with root package name */
    private y2.c f10297k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10298l;

    /* renamed from: m  reason: collision with root package name */
    private float f10299m;

    /* renamed from: n  reason: collision with root package name */
    private int f10300n;

    /* renamed from: o  reason: collision with root package name */
    private int f10301o;

    /* renamed from: p  reason: collision with root package name */
    private int f10302p;

    /* renamed from: q  reason: collision with root package name */
    private WeakReference<V> f10303q;

    /* renamed from: r  reason: collision with root package name */
    private WeakReference<View> f10304r;

    /* renamed from: s  reason: collision with root package name */
    private int f10305s;

    /* renamed from: t  reason: collision with root package name */
    private VelocityTracker f10306t;

    /* renamed from: u  reason: collision with root package name */
    private int f10307u;

    /* renamed from: v  reason: collision with root package name */
    private final Set<f> f10308v;

    /* renamed from: w  reason: collision with root package name */
    private final c.AbstractC0604c f10309w;

    /* loaded from: classes3.dex */
    class a extends c.AbstractC0604c {
        a() {
        }

        @Override // y2.c.AbstractC0604c
        public int a(View view, int i10, int i11) {
            return t2.a.b(i10, SideSheetBehavior.this.Z(), SideSheetBehavior.this.f10301o);
        }

        @Override // y2.c.AbstractC0604c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // y2.c.AbstractC0604c
        public int d(View view) {
            return SideSheetBehavior.this.f10301o;
        }

        @Override // y2.c.AbstractC0604c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f10294h) {
                SideSheetBehavior.this.t0(1);
            }
        }

        @Override // y2.c.AbstractC0604c
        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View X = SideSheetBehavior.this.X();
            if (X != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) X.getLayoutParams()) != null) {
                SideSheetBehavior.this.f10287a.i(marginLayoutParams, view.getLeft(), view.getRight());
                X.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.T(view, i10);
        }

        @Override // y2.c.AbstractC0604c
        public void l(View view, float f10, float f11) {
            int c10 = SideSheetBehavior.this.f10287a.c(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.x0(view, c10, sideSheetBehavior.w0());
        }

        @Override // y2.c.AbstractC0604c
        public boolean m(View view, int i10) {
            if (SideSheetBehavior.this.f10295i == 1 || SideSheetBehavior.this.f10303q == null || SideSheetBehavior.this.f10303q.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private int f10312a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f10313b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f10314c = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.b.this.c();
            }
        };

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f10313b = false;
            if (SideSheetBehavior.this.f10297k != null && SideSheetBehavior.this.f10297k.m(true)) {
                b(this.f10312a);
            } else if (SideSheetBehavior.this.f10295i == 2) {
                SideSheetBehavior.this.t0(this.f10312a);
            }
        }

        void b(int i10) {
            if (SideSheetBehavior.this.f10303q != null && SideSheetBehavior.this.f10303q.get() != null) {
                this.f10312a = i10;
                if (!this.f10313b) {
                    p0.m0((View) SideSheetBehavior.this.f10303q.get(), this.f10314c);
                    this.f10313b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
        this.f10292f = new b();
        this.f10294h = true;
        this.f10295i = 5;
        this.f10296j = 5;
        this.f10299m = 0.1f;
        this.f10305s = -1;
        this.f10308v = new LinkedHashSet();
        this.f10309w = new a();
    }

    private int O(int i10, V v10) {
        int i11 = this.f10295i;
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                if (i11 == 5) {
                    return this.f10287a.e();
                }
                throw new IllegalStateException("Unexpected value: " + this.f10295i);
            }
            return 0;
        }
        return i10 - this.f10287a.f(v10);
    }

    private float P(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    private void Q() {
        WeakReference<View> weakReference = this.f10304r;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f10304r = null;
    }

    private s0 R(final int i10) {
        return new s0() { // from class: q7.a
            @Override // androidx.core.view.accessibility.s0
            public final boolean a(View view, s0.a aVar) {
                boolean j02;
                j02 = SideSheetBehavior.this.j0(i10, view, aVar);
                return j02;
            }
        };
    }

    private void S(Context context) {
        if (this.f10291e == null) {
            return;
        }
        g gVar = new g(this.f10291e);
        this.f10289c = gVar;
        gVar.Q(context);
        ColorStateList colorStateList = this.f10290d;
        if (colorStateList != null) {
            this.f10289c.b0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.f10289c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(View view, int i10) {
        if (!this.f10308v.isEmpty()) {
            float b10 = this.f10287a.b(i10);
            Iterator<f> it = this.f10308v.iterator();
            while (it.hasNext()) {
                it.next().b(view, b10);
            }
        }
    }

    private void U(View view) {
        if (p0.r(view) == null) {
            p0.x0(view, view.getResources().getString(f10285x));
        }
    }

    private int V(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i12 = Math.min(size, i12);
            }
            return View.MeasureSpec.makeMeasureSpec(i12, RecyclerView.UNDEFINED_DURATION);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
    }

    private int Y() {
        return 0;
    }

    private boolean h0(MotionEvent motionEvent) {
        if (!u0() || P(this.f10307u, motionEvent.getX()) <= this.f10297k.z()) {
            return false;
        }
        return true;
    }

    private boolean i0(V v10) {
        ViewParent parent = v10.getParent();
        if (parent != null && parent.isLayoutRequested() && p0.X(v10)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean j0(int i10, View view, s0.a aVar) {
        s0(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(int i10) {
        V v10 = this.f10303q.get();
        if (v10 != null) {
            x0(v10, i10, false);
        }
    }

    private void l0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View findViewById;
        if (this.f10304r == null && (i10 = this.f10305s) != -1 && (findViewById = coordinatorLayout.findViewById(i10)) != null) {
            this.f10304r = new WeakReference<>(findViewById);
        }
    }

    private void m0(V v10, n0.a aVar, int i10) {
        p0.q0(v10, aVar, null, R(i10));
    }

    private void n0() {
        VelocityTracker velocityTracker = this.f10306t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10306t = null;
        }
    }

    private void o0(V v10, Runnable runnable) {
        if (i0(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void r0(int i10) {
        c cVar = this.f10287a;
        if (cVar != null && cVar.g() == i10) {
            return;
        }
        if (i10 == 0) {
            this.f10287a = new com.google.android.material.sidesheet.a(this);
            return;
        }
        throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0");
    }

    private boolean u0() {
        if (this.f10297k != null && (this.f10294h || this.f10295i == 1)) {
            return true;
        }
        return false;
    }

    private boolean v0(V v10) {
        if ((v10.isShown() || p0.r(v10) != null) && this.f10294h) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(View view, int i10, boolean z10) {
        if (this.f10287a.h(view, i10, z10)) {
            t0(2);
            this.f10292f.b(i10);
            return;
        }
        t0(i10);
    }

    private void y0() {
        V v10;
        WeakReference<V> weakReference = this.f10303q;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        p0.o0(v10, 262144);
        p0.o0(v10, 1048576);
        if (this.f10295i != 5) {
            m0(v10, n0.a.f4097y, 5);
        }
        if (this.f10295i != 3) {
            m0(v10, n0.a.f4095w, 3);
        }
    }

    private void z0(View view) {
        int i10;
        if (this.f10295i == 5) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10295i == 1 && actionMasked == 0) {
            return true;
        }
        if (u0()) {
            this.f10297k.F(motionEvent);
        }
        if (actionMasked == 0) {
            n0();
        }
        if (this.f10306t == null) {
            this.f10306t = VelocityTracker.obtain();
        }
        this.f10306t.addMovement(motionEvent);
        if (u0() && actionMasked == 2 && !this.f10298l && h0(motionEvent)) {
            this.f10297k.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f10298l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int W() {
        return this.f10300n;
    }

    public View X() {
        WeakReference<View> weakReference = this.f10304r;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int Z() {
        return this.f10287a.d();
    }

    public float a0() {
        return this.f10299m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b0() {
        return 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c0() {
        return this.f10302p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d0(int i10) {
        if (i10 != 3) {
            if (i10 == 5) {
                return this.f10287a.e();
            }
            throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
        }
        return Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e0() {
        return this.f10301o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f10303q = null;
        this.f10297k = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y2.c g0() {
        return this.f10297k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f10303q = null;
        this.f10297k = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        y2.c cVar;
        if (!v0(v10)) {
            this.f10298l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            n0();
        }
        if (this.f10306t == null) {
            this.f10306t = VelocityTracker.obtain();
        }
        this.f10306t.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f10298l) {
                this.f10298l = false;
                return false;
            }
        } else {
            this.f10307u = (int) motionEvent.getX();
        }
        if (!this.f10298l && (cVar = this.f10297k) != null && cVar.P(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        int i11;
        if (p0.B(coordinatorLayout) && !p0.B(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.f10303q == null) {
            this.f10303q = new WeakReference<>(v10);
            g gVar = this.f10289c;
            if (gVar != null) {
                p0.y0(v10, gVar);
                g gVar2 = this.f10289c;
                float f10 = this.f10293g;
                if (f10 == -1.0f) {
                    f10 = p0.y(v10);
                }
                gVar2.a0(f10);
            } else {
                ColorStateList colorStateList = this.f10290d;
                if (colorStateList != null) {
                    p0.z0(v10, colorStateList);
                }
            }
            z0(v10);
            y0();
            if (p0.C(v10) == 0) {
                p0.F0(v10, 1);
            }
            U(v10);
        }
        if (this.f10297k == null) {
            this.f10297k = y2.c.o(coordinatorLayout, this.f10309w);
        }
        int f11 = this.f10287a.f(v10);
        coordinatorLayout.C(v10, i10);
        this.f10301o = coordinatorLayout.getWidth();
        this.f10300n = v10.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        if (marginLayoutParams != null) {
            i11 = this.f10287a.a(marginLayoutParams);
        } else {
            i11 = 0;
        }
        this.f10302p = i11;
        p0.e0(v10, O(f11, v10));
        l0(coordinatorLayout);
        for (f fVar : this.f10308v) {
            if (fVar instanceof f) {
                fVar.c(v10);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(V(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), V(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    public void p0(int i10) {
        this.f10305s = i10;
        Q();
        WeakReference<V> weakReference = this.f10303q;
        if (weakReference != null) {
            V v10 = weakReference.get();
            if (i10 != -1 && p0.Y(v10)) {
                v10.requestLayout();
            }
        }
    }

    public void q0(boolean z10) {
        this.f10294h = z10;
    }

    public void s0(final int i10) {
        String str;
        if (i10 != 1 && i10 != 2) {
            WeakReference<V> weakReference = this.f10303q;
            if (weakReference != null && weakReference.get() != null) {
                o0(this.f10303q.get(), new Runnable() { // from class: q7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        SideSheetBehavior.this.k0(i10);
                    }
                });
                return;
            } else {
                t0(i10);
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("STATE_");
        if (i10 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        sb2.append(str);
        sb2.append(" should not be set externally.");
        throw new IllegalArgumentException(sb2.toString());
    }

    void t0(int i10) {
        V v10;
        if (this.f10295i == i10) {
            return;
        }
        this.f10295i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f10296j = i10;
        }
        WeakReference<V> weakReference = this.f10303q;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        z0(v10);
        Iterator<f> it = this.f10308v.iterator();
        while (it.hasNext()) {
            it.next().a(v10, i10);
        }
        y0();
    }

    public boolean w0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.a() != null) {
            super.x(coordinatorLayout, v10, savedState.a());
        }
        int i10 = savedState.f10310p;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f10295i = i10;
        this.f10296j = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v10) {
        return new SavedState(super.y(coordinatorLayout, v10), (SideSheetBehavior<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: p  reason: collision with root package name */
        final int f10310p;

        /* loaded from: classes3.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10310p = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f10310p);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f10310p = ((SideSheetBehavior) sideSheetBehavior).f10295i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10292f = new b();
        this.f10294h = true;
        this.f10295i = 5;
        this.f10296j = 5;
        this.f10299m = 0.1f;
        this.f10305s = -1;
        this.f10308v = new LinkedHashSet();
        this.f10309w = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.U5);
        int i10 = l.W5;
        if (obtainStyledAttributes.hasValue(i10)) {
            this.f10290d = m7.c.a(context, obtainStyledAttributes, i10);
        }
        if (obtainStyledAttributes.hasValue(l.Z5)) {
            this.f10291e = p7.k.e(context, attributeSet, 0, f10286y).m();
        }
        int i11 = l.Y5;
        if (obtainStyledAttributes.hasValue(i11)) {
            p0(obtainStyledAttributes.getResourceId(i11, -1));
        }
        S(context);
        this.f10293g = obtainStyledAttributes.getDimension(l.V5, -1.0f);
        q0(obtainStyledAttributes.getBoolean(l.X5, true));
        obtainStyledAttributes.recycle();
        r0(Y());
        this.f10288b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
