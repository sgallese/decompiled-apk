package y2;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.p0;
import java.util.Arrays;

/* compiled from: ViewDragHelper.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: x  reason: collision with root package name */
    private static final Interpolator f26229x = new a();

    /* renamed from: a  reason: collision with root package name */
    private int f26230a;

    /* renamed from: b  reason: collision with root package name */
    private int f26231b;

    /* renamed from: d  reason: collision with root package name */
    private float[] f26233d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f26234e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f26235f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f26236g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f26237h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f26238i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f26239j;

    /* renamed from: k  reason: collision with root package name */
    private int f26240k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f26241l;

    /* renamed from: m  reason: collision with root package name */
    private float f26242m;

    /* renamed from: n  reason: collision with root package name */
    private float f26243n;

    /* renamed from: o  reason: collision with root package name */
    private int f26244o;

    /* renamed from: p  reason: collision with root package name */
    private final int f26245p;

    /* renamed from: q  reason: collision with root package name */
    private int f26246q;

    /* renamed from: r  reason: collision with root package name */
    private OverScroller f26247r;

    /* renamed from: s  reason: collision with root package name */
    private final AbstractC0604c f26248s;

    /* renamed from: t  reason: collision with root package name */
    private View f26249t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f26250u;

    /* renamed from: v  reason: collision with root package name */
    private final ViewGroup f26251v;

    /* renamed from: c  reason: collision with root package name */
    private int f26232c = -1;

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f26252w = new b();

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.K(0);
        }
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0604c abstractC0604c) {
        if (viewGroup != null) {
            if (abstractC0604c != null) {
                this.f26251v = viewGroup;
                this.f26248s = abstractC0604c;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f26245p = i10;
                this.f26244o = i10;
                this.f26231b = viewConfiguration.getScaledTouchSlop();
                this.f26242m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f26243n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f26247r = new OverScroller(context, f26229x);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    private boolean D(int i10) {
        if (!C(i10)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    private void G() {
        this.f26241l.computeCurrentVelocity(1000, this.f26242m);
        p(g(this.f26241l.getXVelocity(this.f26232c), this.f26243n, this.f26242m), g(this.f26241l.getYVelocity(this.f26232c), this.f26243n, this.f26242m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [y2.c$c] */
    private void H(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        boolean z10 = c10;
        if (c(f11, f10, i10, 4)) {
            z10 = c10 | true;
        }
        boolean z11 = z10;
        if (c(f10, f11, i10, 2)) {
            z11 = (z10 ? 1 : 0) | true;
        }
        ?? r02 = z11;
        if (c(f11, f10, i10, 8)) {
            r02 = (z11 ? 1 : 0) | true;
        }
        if (r02 != 0) {
            int[] iArr = this.f26238i;
            iArr[i10] = iArr[i10] | r02;
            this.f26248s.f(r02, i10);
        }
    }

    private void I(float f10, float f11, int i10) {
        s(i10);
        float[] fArr = this.f26233d;
        this.f26235f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f26234e;
        this.f26236g[i10] = f11;
        fArr2[i10] = f11;
        this.f26237h[i10] = y((int) f10, (int) f11);
        this.f26240k |= 1 << i10;
    }

    private void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (D(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f26235f[pointerId] = x10;
                this.f26236g[pointerId] = y10;
            }
        }
    }

    private boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f26237h[i10] & i11) != i11 || (this.f26246q & i11) == 0 || (this.f26239j[i10] & i11) == i11 || (this.f26238i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f26231b;
        if (abs <= i12 && abs2 <= i12) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f26248s.g(i11)) {
            int[] iArr = this.f26239j;
            iArr[i10] = iArr[i10] | i11;
            return false;
        } else if ((this.f26238i[i10] & i11) != 0 || abs <= this.f26231b) {
            return false;
        } else {
            return true;
        }
    }

    private boolean f(View view, float f10, float f11) {
        boolean z10;
        boolean z11;
        if (view == null) {
            return false;
        }
        if (this.f26248s.d(view) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f26248s.e(view) > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i10 = this.f26231b;
            if (f12 <= i10 * i10) {
                return false;
            }
            return true;
        } else if (z10) {
            if (Math.abs(f10) <= this.f26231b) {
                return false;
            }
            return true;
        } else if (!z11 || Math.abs(f11) <= this.f26231b) {
            return false;
        } else {
            return true;
        }
    }

    private float g(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        if (abs > f12) {
            if (f10 <= 0.0f) {
                return -f12;
            }
            return f12;
        }
        return f10;
    }

    private int h(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        if (abs > i12) {
            if (i10 <= 0) {
                return -i12;
            }
            return i12;
        }
        return i10;
    }

    private void i() {
        float[] fArr = this.f26233d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f26234e, 0.0f);
        Arrays.fill(this.f26235f, 0.0f);
        Arrays.fill(this.f26236g, 0.0f);
        Arrays.fill(this.f26237h, 0);
        Arrays.fill(this.f26238i, 0);
        Arrays.fill(this.f26239j, 0);
        this.f26240k = 0;
    }

    private void j(int i10) {
        if (this.f26233d != null && C(i10)) {
            this.f26233d[i10] = 0.0f;
            this.f26234e[i10] = 0.0f;
            this.f26235f[i10] = 0.0f;
            this.f26236g[i10] = 0.0f;
            this.f26237h[i10] = 0;
            this.f26238i[i10] = 0;
            this.f26239j[i10] = 0;
            this.f26240k = (~(1 << i10)) & this.f26240k;
        }
    }

    private int k(int i10, int i11, int i12) {
        int abs;
        if (i10 == 0) {
            return 0;
        }
        int width = this.f26251v.getWidth();
        float f10 = width / 2;
        float q10 = f10 + (q(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(q10 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private int l(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int h10 = h(i12, (int) this.f26243n, (int) this.f26242m);
        int h11 = h(i13, (int) this.f26243n, (int) this.f26242m);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(h10);
        int abs4 = Math.abs(h11);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (h10 != 0) {
            f10 = abs3;
            f11 = i14;
        } else {
            f10 = abs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (h11 != 0) {
            f12 = abs4;
            f13 = i14;
        } else {
            f12 = abs2;
            f13 = i15;
        }
        return (int) ((k(i10, h10, this.f26248s.d(view)) * f14) + (k(i11, h11, this.f26248s.e(view)) * (f12 / f13)));
    }

    public static c n(ViewGroup viewGroup, float f10, AbstractC0604c abstractC0604c) {
        c o10 = o(viewGroup, abstractC0604c);
        o10.f26231b = (int) (o10.f26231b * (1.0f / f10));
        return o10;
    }

    public static c o(ViewGroup viewGroup, AbstractC0604c abstractC0604c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0604c);
    }

    private void p(float f10, float f11) {
        this.f26250u = true;
        this.f26248s.l(this.f26249t, f10, f11);
        this.f26250u = false;
        if (this.f26230a == 1) {
            K(0);
        }
    }

    private float q(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void r(int i10, int i11, int i12, int i13) {
        int left = this.f26249t.getLeft();
        int top = this.f26249t.getTop();
        if (i12 != 0) {
            i10 = this.f26248s.a(this.f26249t, i10, i12);
            p0.e0(this.f26249t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f26248s.b(this.f26249t, i11, i13);
            p0.f0(this.f26249t, i11 - top);
        }
        int i15 = i11;
        if (i12 != 0 || i13 != 0) {
            this.f26248s.k(this.f26249t, i14, i15, i14 - left, i15 - top);
        }
    }

    private void s(int i10) {
        float[] fArr = this.f26233d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f26234e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f26235f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f26236g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f26237h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f26238i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f26239j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f26233d = fArr2;
            this.f26234e = fArr3;
            this.f26235f = fArr4;
            this.f26236g = fArr5;
            this.f26237h = iArr;
            this.f26238i = iArr2;
            this.f26239j = iArr3;
        }
    }

    private boolean u(int i10, int i11, int i12, int i13) {
        int left = this.f26249t.getLeft();
        int top = this.f26249t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f26247r.abortAnimation();
            K(0);
            return false;
        }
        this.f26247r.startScroll(left, top, i14, i15, l(this.f26249t, i14, i15, i12, i13));
        K(2);
        return true;
    }

    private int y(int i10, int i11) {
        int i12;
        if (i10 < this.f26251v.getLeft() + this.f26244o) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (i11 < this.f26251v.getTop() + this.f26244o) {
            i12 |= 4;
        }
        if (i10 > this.f26251v.getRight() - this.f26244o) {
            i12 |= 2;
        }
        if (i11 > this.f26251v.getBottom() - this.f26244o) {
            return i12 | 8;
        }
        return i12;
    }

    public int A() {
        return this.f26230a;
    }

    public boolean B(int i10, int i11) {
        return E(this.f26249t, i10, i11);
    }

    public boolean C(int i10) {
        if (((1 << i10) & this.f26240k) != 0) {
            return true;
        }
        return false;
    }

    public boolean E(View view, int i10, int i11) {
        if (view == null || i10 < view.getLeft() || i10 >= view.getRight() || i11 < view.getTop() || i11 >= view.getBottom()) {
            return false;
        }
        return true;
    }

    public void F(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f26241l == null) {
            this.f26241l = VelocityTracker.obtain();
        }
        this.f26241l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f26230a == 1 && pointerId == this.f26232c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i11 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i11);
                                            if (pointerId2 != this.f26232c) {
                                                View t10 = t((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                                View view = this.f26249t;
                                                if (t10 == view && R(view, pointerId2)) {
                                                    i10 = this.f26232c;
                                                    break;
                                                }
                                            }
                                            i11++;
                                        } else {
                                            i10 = -1;
                                            break;
                                        }
                                    }
                                    if (i10 == -1) {
                                        G();
                                    }
                                }
                                j(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x10 = motionEvent.getX(actionIndex);
                        float y10 = motionEvent.getY(actionIndex);
                        I(x10, y10, pointerId3);
                        if (this.f26230a == 0) {
                            R(t((int) x10, (int) y10), pointerId3);
                            int i12 = this.f26237h[pointerId3];
                            int i13 = this.f26246q;
                            if ((i12 & i13) != 0) {
                                this.f26248s.h(i12 & i13, pointerId3);
                                return;
                            }
                            return;
                        } else if (B((int) x10, (int) y10)) {
                            R(this.f26249t, pointerId3);
                            return;
                        } else {
                            return;
                        }
                    }
                    if (this.f26230a == 1) {
                        p(0.0f, 0.0f);
                    }
                    a();
                    return;
                } else if (this.f26230a == 1) {
                    if (D(this.f26232c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f26232c);
                        float x11 = motionEvent.getX(findPointerIndex);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f26235f;
                        int i14 = this.f26232c;
                        int i15 = (int) (x11 - fArr[i14]);
                        int i16 = (int) (y11 - this.f26236g[i14]);
                        r(this.f26249t.getLeft() + i15, this.f26249t.getTop() + i16, i15, i16);
                        J(motionEvent);
                        return;
                    }
                    return;
                } else {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (i11 < pointerCount2) {
                        int pointerId4 = motionEvent.getPointerId(i11);
                        if (D(pointerId4)) {
                            float x12 = motionEvent.getX(i11);
                            float y12 = motionEvent.getY(i11);
                            float f10 = x12 - this.f26233d[pointerId4];
                            float f11 = y12 - this.f26234e[pointerId4];
                            H(f10, f11, pointerId4);
                            if (this.f26230a != 1) {
                                View t11 = t((int) x12, (int) y12);
                                if (f(t11, f10, f11) && R(t11, pointerId4)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i11++;
                    }
                    J(motionEvent);
                    return;
                }
            }
            if (this.f26230a == 1) {
                G();
            }
            a();
            return;
        }
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View t12 = t((int) x13, (int) y13);
        I(x13, y13, pointerId5);
        R(t12, pointerId5);
        int i17 = this.f26237h[pointerId5];
        int i18 = this.f26246q;
        if ((i17 & i18) != 0) {
            this.f26248s.h(i17 & i18, pointerId5);
        }
    }

    void K(int i10) {
        this.f26251v.removeCallbacks(this.f26252w);
        if (this.f26230a != i10) {
            this.f26230a = i10;
            this.f26248s.j(i10);
            if (this.f26230a == 0) {
                this.f26249t = null;
            }
        }
    }

    public void L(int i10) {
        this.f26244o = i10;
    }

    public void M(int i10) {
        this.f26246q = i10;
    }

    public void N(float f10) {
        this.f26243n = f10;
    }

    public boolean O(int i10, int i11) {
        if (this.f26250u) {
            return u(i10, i11, (int) this.f26241l.getXVelocity(this.f26232c), (int) this.f26241l.getYVelocity(this.f26232c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
    
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean P(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.c.P(android.view.MotionEvent):boolean");
    }

    public boolean Q(View view, int i10, int i11) {
        this.f26249t = view;
        this.f26232c = -1;
        boolean u10 = u(i10, i11, 0, 0);
        if (!u10 && this.f26230a == 0 && this.f26249t != null) {
            this.f26249t = null;
        }
        return u10;
    }

    boolean R(View view, int i10) {
        if (view == this.f26249t && this.f26232c == i10) {
            return true;
        }
        if (view != null && this.f26248s.m(view, i10)) {
            this.f26232c = i10;
            b(view, i10);
            return true;
        }
        return false;
    }

    public void a() {
        this.f26232c = -1;
        i();
        VelocityTracker velocityTracker = this.f26241l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f26241l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f26251v) {
            this.f26249t = view;
            this.f26232c = i10;
            this.f26248s.i(view, i10);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f26251v + ")");
    }

    public boolean d(int i10) {
        int length = this.f26233d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (e(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i10, int i11) {
        boolean z10;
        boolean z11;
        if (!C(i11)) {
            return false;
        }
        if ((i10 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 2) == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f10 = this.f26235f[i11] - this.f26233d[i11];
        float f11 = this.f26236g[i11] - this.f26234e[i11];
        if (z10 && z11) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i12 = this.f26231b;
            if (f12 <= i12 * i12) {
                return false;
            }
            return true;
        } else if (z10) {
            if (Math.abs(f10) <= this.f26231b) {
                return false;
            }
            return true;
        } else if (!z11 || Math.abs(f11) <= this.f26231b) {
            return false;
        } else {
            return true;
        }
    }

    public boolean m(boolean z10) {
        if (this.f26230a == 2) {
            boolean computeScrollOffset = this.f26247r.computeScrollOffset();
            int currX = this.f26247r.getCurrX();
            int currY = this.f26247r.getCurrY();
            int left = currX - this.f26249t.getLeft();
            int top = currY - this.f26249t.getTop();
            if (left != 0) {
                p0.e0(this.f26249t, left);
            }
            if (top != 0) {
                p0.f0(this.f26249t, top);
            }
            if (left != 0 || top != 0) {
                this.f26248s.k(this.f26249t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f26247r.getFinalX() && currY == this.f26247r.getFinalY()) {
                this.f26247r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z10) {
                    this.f26251v.post(this.f26252w);
                } else {
                    K(0);
                }
            }
        }
        if (this.f26230a != 2) {
            return false;
        }
        return true;
    }

    public View t(int i10, int i11) {
        for (int childCount = this.f26251v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f26251v.getChildAt(this.f26248s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View v() {
        return this.f26249t;
    }

    public int w() {
        return this.f26245p;
    }

    public int x() {
        return this.f26244o;
    }

    public int z() {
        return this.f26231b;
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: y2.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0604c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public boolean g(int i10) {
            return false;
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);

        public int c(int i10) {
            return i10;
        }

        public void f(int i10, int i11) {
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }
    }
}
