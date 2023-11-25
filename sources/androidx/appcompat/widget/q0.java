package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* compiled from: ForwardingListener.java */
/* loaded from: classes.dex */
public abstract class q0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: f  reason: collision with root package name */
    private final float f1632f;

    /* renamed from: m  reason: collision with root package name */
    private final int f1633m;

    /* renamed from: p  reason: collision with root package name */
    private final int f1634p;

    /* renamed from: q  reason: collision with root package name */
    final View f1635q;

    /* renamed from: r  reason: collision with root package name */
    private Runnable f1636r;

    /* renamed from: s  reason: collision with root package name */
    private Runnable f1637s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1638t;

    /* renamed from: u  reason: collision with root package name */
    private int f1639u;

    /* renamed from: v  reason: collision with root package name */
    private final int[] f1640v = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = q0.this.f1635q.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.this.e();
        }
    }

    public q0(View view) {
        this.f1635q = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1632f = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1633m = tapTimeout;
        this.f1634p = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f1637s;
        if (runnable != null) {
            this.f1635q.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1636r;
        if (runnable2 != null) {
            this.f1635q.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        o0 o0Var;
        boolean z10;
        View view = this.f1635q;
        androidx.appcompat.view.menu.p b10 = b();
        if (b10 == null || !b10.b() || (o0Var = (o0) b10.j()) == null || !o0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(o0Var, obtainNoHistory);
        boolean e10 = o0Var.e(obtainNoHistory, this.f1639u);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!e10 || !z10) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1635q
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1639u
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1632f
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1639u = r6
            java.lang.Runnable r6 = r5.f1636r
            if (r6 != 0) goto L52
            androidx.appcompat.widget.q0$a r6 = new androidx.appcompat.widget.q0$a
            r6.<init>()
            r5.f1636r = r6
        L52:
            java.lang.Runnable r6 = r5.f1636r
            int r1 = r5.f1633m
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1637s
            if (r6 != 0) goto L65
            androidx.appcompat.widget.q0$b r6 = new androidx.appcompat.widget.q0$b
            r6.<init>()
            r5.f1637s = r6
        L65:
            java.lang.Runnable r6 = r5.f1637s
            int r1 = r5.f1634p
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        if (f10 >= f13 && f11 >= f13 && f10 < (view.getRight() - view.getLeft()) + f12 && f11 < (view.getBottom() - view.getTop()) + f12) {
            return true;
        }
        return false;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1640v);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1640v);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract androidx.appcompat.view.menu.p b();

    protected abstract boolean c();

    protected boolean d() {
        androidx.appcompat.view.menu.p b10 = b();
        if (b10 != null && b10.b()) {
            b10.dismiss();
            return true;
        }
        return true;
    }

    void e() {
        a();
        View view = this.f1635q;
        if (!view.isEnabled() || view.isLongClickable() || !c()) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        view.onTouchEvent(obtain);
        obtain.recycle();
        this.f1638t = true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f1638t;
        if (z11) {
            if (!f(motionEvent) && d()) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            if (g(motionEvent) && c()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1635q.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1638t = z10;
        if (z10 || z11) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1638t = false;
        this.f1639u = -1;
        Runnable runnable = this.f1636r;
        if (runnable != null) {
            this.f1635q.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
