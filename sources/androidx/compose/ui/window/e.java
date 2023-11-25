package androidx.compose.ui.window;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.ui.platform.p4;
import androidx.compose.ui.platform.q4;
import androidx.lifecycle.d1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import dc.w;
import j0.g2;
import j0.g3;
import j0.j1;
import j0.z1;
import j2.n;
import j2.o;
import j2.r;
import kotlin.NoWhenBranchMatchedException;
import n1.s;
import n1.t;
import pc.p;
import qc.q;

/* compiled from: AndroidPopup.android.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class e extends androidx.compose.ui.platform.a implements q4 {
    private final WindowManager A;
    private final WindowManager.LayoutParams B;
    private j C;
    private r D;
    private final j1 E;
    private final j1 F;
    private n G;
    private final g3 H;
    private final float I;
    private final Rect J;
    private final j1 K;
    private boolean L;
    private final int[] M;

    /* renamed from: v  reason: collision with root package name */
    private pc.a<w> f3152v;

    /* renamed from: w  reason: collision with root package name */
    private k f3153w;

    /* renamed from: x  reason: collision with root package name */
    private String f3154x;

    /* renamed from: y  reason: collision with root package name */
    private final View f3155y;

    /* renamed from: z  reason: collision with root package name */
    private final f f3156z;

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            q.i(view, "view");
            q.i(outline, "result");
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements p<j0.l, Integer, w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f3158m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(2);
            this.f3158m = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            e.this.a(lVar, z1.a(this.f3158m | 1));
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3159a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3159a = iArr;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.a<Boolean> {
        d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Boolean invoke() {
            return Boolean.valueOf((e.this.getParentLayoutCoordinates() == null || e.this.m1getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ e(pc.a r11, androidx.compose.ui.window.k r12, java.lang.String r13, android.view.View r14, j2.e r15, androidx.compose.ui.window.j r16, java.util.UUID r17, androidx.compose.ui.window.f r18, int r19, qc.h r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L19
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L12
            androidx.compose.ui.window.h r0 = new androidx.compose.ui.window.h
            r0.<init>()
            goto L17
        L12:
            androidx.compose.ui.window.i r0 = new androidx.compose.ui.window.i
            r0.<init>()
        L17:
            r9 = r0
            goto L1b
        L19:
            r9 = r18
        L1b:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.e.<init>(pc.a, androidx.compose.ui.window.k, java.lang.String, android.view.View, j2.e, androidx.compose.ui.window.j, java.util.UUID, androidx.compose.ui.window.f, int, qc.h):void");
    }

    private final p<j0.l, Integer, w> getContent() {
        return (p) this.K.getValue();
    }

    private final int getDisplayHeight() {
        int d10;
        d10 = sc.c.d(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
        return d10;
    }

    private final int getDisplayWidth() {
        int d10;
        d10 = sc.c.d(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s getParentLayoutCoordinates() {
        return (s) this.F.getValue();
    }

    private final void l(int i10) {
        WindowManager.LayoutParams layoutParams = this.B;
        layoutParams.flags = i10;
        this.f3156z.a(this.A, this, layoutParams);
    }

    private final WindowManager.LayoutParams m() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE;
        layoutParams.token = this.f3155y.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f3155y.getContext().getResources().getString(v0.i.f24310d));
        return layoutParams;
    }

    private final void r(r rVar) {
        int i10 = c.f3159a[rVar.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i11 = 0;
        }
        super.setLayoutDirection(i11);
    }

    private final void setClippingEnabled(boolean z10) {
        int i10;
        if (z10) {
            i10 = this.B.flags & (-513);
        } else {
            i10 = this.B.flags | 512;
        }
        l(i10);
    }

    private final void setContent(p<? super j0.l, ? super Integer, w> pVar) {
        this.K.setValue(pVar);
    }

    private final void setIsFocusable(boolean z10) {
        int i10;
        if (!z10) {
            i10 = this.B.flags | 8;
        } else {
            i10 = this.B.flags & (-9);
        }
        l(i10);
    }

    private final void setParentLayoutCoordinates(s sVar) {
        this.F.setValue(sVar);
    }

    private final void setSecurePolicy(l lVar) {
        int i10;
        if (m.a(lVar, androidx.compose.ui.window.a.e(this.f3155y))) {
            i10 = this.B.flags | 8192;
        } else {
            i10 = this.B.flags & (-8193);
        }
        l(i10);
    }

    @Override // androidx.compose.ui.platform.a
    public void a(j0.l lVar, int i10) {
        j0.l q10 = lVar.q(-857613600);
        if (j0.n.K()) {
            j0.n.V(-857613600, i10, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:463)");
        }
        getContent().invoke(q10, 0);
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new b(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        q.i(keyEvent, "event");
        if (keyEvent.getKeyCode() == 4 && this.f3153w.b()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                pc.a<w> aVar = this.f3152v;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.a
    public void g(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt;
        super.g(z10, i10, i11, i12, i13);
        if (this.f3153w.g() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.B.width = childAt.getMeasuredWidth();
        this.B.height = childAt.getMeasuredHeight();
        this.f3156z.a(this.A, this, this.B);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.H.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.B;
    }

    public final r getParentLayoutDirection() {
        return this.D;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final j2.p m1getPopupContentSizebOM6tXw() {
        return (j2.p) this.E.getValue();
    }

    public final j getPositionProvider() {
        return this.C;
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.L;
    }

    public final String getTestTag() {
        return this.f3154x;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return p4.b(this);
    }

    @Override // androidx.compose.ui.platform.a
    public void h(int i10, int i11) {
        if (this.f3153w.g()) {
            super.h(i10, i11);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), RecyclerView.UNDEFINED_DURATION), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), RecyclerView.UNDEFINED_DURATION));
        }
    }

    public final void n() {
        d1.b(this, null);
        this.A.removeViewImmediate(this);
    }

    public final void o() {
        int[] iArr = this.M;
        int i10 = iArr[0];
        int i11 = iArr[1];
        this.f3155y.getLocationOnScreen(iArr);
        int[] iArr2 = this.M;
        if (i10 != iArr2[0] || i11 != iArr2[1]) {
            t();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (!this.f3153w.c()) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z11 = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            pc.a<w> aVar = this.f3152v;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 4) {
            z11 = true;
        }
        if (z11) {
            pc.a<w> aVar2 = this.f3152v;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(j0.p pVar, p<? super j0.l, ? super Integer, w> pVar2) {
        q.i(pVar, "parent");
        q.i(pVar2, "content");
        setParentCompositionContext(pVar);
        setContent(pVar2);
        this.L = true;
    }

    public final void q() {
        this.A.addView(this, this.B);
    }

    public final void s(pc.a<w> aVar, k kVar, String str, r rVar) {
        q.i(kVar, "properties");
        q.i(str, "testTag");
        q.i(rVar, "layoutDirection");
        this.f3152v = aVar;
        if (kVar.g() && !this.f3153w.g()) {
            WindowManager.LayoutParams layoutParams = this.B;
            layoutParams.width = -2;
            layoutParams.height = -2;
            this.f3156z.a(this.A, this, layoutParams);
        }
        this.f3153w = kVar;
        this.f3154x = str;
        setIsFocusable(kVar.e());
        setSecurePolicy(kVar.f());
        setClippingEnabled(kVar.a());
        r(rVar);
    }

    public final void setParentLayoutDirection(r rVar) {
        q.i(rVar, "<set-?>");
        this.D = rVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m2setPopupContentSizefhxjrPA(j2.p pVar) {
        this.E.setValue(pVar);
    }

    public final void setPositionProvider(j jVar) {
        q.i(jVar, "<set-?>");
        this.C = jVar;
    }

    public final void setTestTag(String str) {
        q.i(str, "<set-?>");
        this.f3154x = str;
    }

    public final void t() {
        int d10;
        int d11;
        s parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long a10 = parentLayoutCoordinates.a();
        long f10 = t.f(parentLayoutCoordinates);
        d10 = sc.c.d(z0.f.o(f10));
        d11 = sc.c.d(z0.f.p(f10));
        n a11 = o.a(j2.m.a(d10, d11), a10);
        if (!q.d(a11, this.G)) {
            this.G = a11;
            v();
        }
    }

    public final void u(s sVar) {
        q.i(sVar, "parentLayoutCoordinates");
        setParentLayoutCoordinates(sVar);
        t();
    }

    public final void v() {
        j2.p m1getPopupContentSizebOM6tXw;
        n nVar = this.G;
        if (nVar != null && (m1getPopupContentSizebOM6tXw = m1getPopupContentSizebOM6tXw()) != null) {
            long j10 = m1getPopupContentSizebOM6tXw.j();
            Rect rect = this.J;
            this.f3156z.c(this.f3155y, rect);
            n d10 = androidx.compose.ui.window.a.d(rect);
            long a10 = j2.q.a(d10.d(), d10.a());
            long a11 = this.C.a(nVar, a10, this.D, j10);
            this.B.x = j2.l.j(a11);
            this.B.y = j2.l.k(a11);
            if (this.f3153w.d()) {
                this.f3156z.b(this, j2.p.g(a10), j2.p.f(a10));
            }
            this.f3156z.a(this.A, this, this.B);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(pc.a<dc.w> r8, androidx.compose.ui.window.k r9, java.lang.String r10, android.view.View r11, j2.e r12, androidx.compose.ui.window.j r13, java.util.UUID r14, androidx.compose.ui.window.f r15) {
        /*
            r7 = this;
            java.lang.String r0 = "properties"
            qc.q.i(r9, r0)
            java.lang.String r0 = "testTag"
            qc.q.i(r10, r0)
            java.lang.String r0 = "composeView"
            qc.q.i(r11, r0)
            java.lang.String r0 = "density"
            qc.q.i(r12, r0)
            java.lang.String r0 = "initialPositionProvider"
            qc.q.i(r13, r0)
            java.lang.String r0 = "popupId"
            qc.q.i(r14, r0)
            java.lang.String r0 = "popupLayoutHelper"
            qc.q.i(r15, r0)
            android.content.Context r2 = r11.getContext()
            java.lang.String r0 = "composeView.context"
            qc.q.h(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f3152v = r8
            r7.f3153w = r9
            r7.f3154x = r10
            r7.f3155y = r11
            r7.f3156z = r15
            android.content.Context r8 = r11.getContext()
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            java.lang.String r9 = "null cannot be cast to non-null type android.view.WindowManager"
            qc.q.g(r8, r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            r7.A = r8
            android.view.WindowManager$LayoutParams r8 = r7.m()
            r7.B = r8
            r7.C = r13
            j2.r r8 = j2.r.Ltr
            r7.D = r8
            r8 = 0
            r9 = 2
            j0.j1 r10 = j0.y2.i(r8, r8, r9, r8)
            r7.E = r10
            j0.j1 r10 = j0.y2.i(r8, r8, r9, r8)
            r7.F = r10
            androidx.compose.ui.window.e$d r10 = new androidx.compose.ui.window.e$d
            r10.<init>()
            j0.g3 r10 = j0.y2.d(r10)
            r7.H = r10
            r10 = 8
            float r10 = (float) r10
            float r10 = j2.h.j(r10)
            r7.I = r10
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            r7.J = r13
            r13 = 16908290(0x1020002, float:2.3877235E-38)
            r7.setId(r13)
            androidx.lifecycle.v r13 = androidx.lifecycle.d1.a(r11)
            androidx.lifecycle.d1.b(r7, r13)
            androidx.lifecycle.c1 r13 = androidx.lifecycle.e1.a(r11)
            androidx.lifecycle.e1.b(r7, r13)
            w3.d r11 = w3.e.a(r11)
            w3.e.b(r7, r11)
            int r11 = v0.h.H
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "Popup:"
            r13.append(r15)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r7.setTag(r11, r13)
            r11 = 0
            r7.setClipChildren(r11)
            float r10 = r12.v0(r10)
            r7.setElevation(r10)
            androidx.compose.ui.window.e$a r10 = new androidx.compose.ui.window.e$a
            r10.<init>()
            r7.setOutlineProvider(r10)
            androidx.compose.ui.window.c r10 = androidx.compose.ui.window.c.f3149a
            pc.p r10 = r10.a()
            j0.j1 r8 = j0.y2.i(r10, r8, r9, r8)
            r7.K = r8
            int[] r8 = new int[r9]
            r7.M = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.e.<init>(pc.a, androidx.compose.ui.window.k, java.lang.String, android.view.View, j2.e, androidx.compose.ui.window.j, java.util.UUID, androidx.compose.ui.window.f):void");
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public androidx.compose.ui.platform.a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }
}
