package b2;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: TextInputServiceAndroid.android.kt */
/* loaded from: classes.dex */
public final class n0 implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final View f7797a;

    /* renamed from: b  reason: collision with root package name */
    private final r f7798b;

    /* renamed from: c  reason: collision with root package name */
    private final z f7799c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f7800d;

    /* renamed from: e  reason: collision with root package name */
    private pc.l<? super List<? extends b2.f>, dc.w> f7801e;

    /* renamed from: f  reason: collision with root package name */
    private pc.l<? super o, dc.w> f7802f;

    /* renamed from: g  reason: collision with root package name */
    private j0 f7803g;

    /* renamed from: h  reason: collision with root package name */
    private p f7804h;

    /* renamed from: i  reason: collision with root package name */
    private List<WeakReference<f0>> f7805i;

    /* renamed from: j  reason: collision with root package name */
    private final dc.f f7806j;

    /* renamed from: k  reason: collision with root package name */
    private Rect f7807k;

    /* renamed from: l  reason: collision with root package name */
    private final k0.f<a> f7808l;

    /* renamed from: m  reason: collision with root package name */
    private Runnable f7809m;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextInputServiceAndroid.android.kt */
    /* loaded from: classes.dex */
    public enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7810a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7810a = iArr;
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.a<BaseInputConnection> {
        c() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(n0.this.n(), false);
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    /* loaded from: classes.dex */
    public static final class d implements q {
        d() {
        }

        @Override // b2.q
        public void a(KeyEvent keyEvent) {
            qc.q.i(keyEvent, "event");
            n0.this.m().sendKeyEvent(keyEvent);
        }

        @Override // b2.q
        public void b(f0 f0Var) {
            qc.q.i(f0Var, "ic");
            int size = n0.this.f7805i.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (qc.q.d(((WeakReference) n0.this.f7805i.get(i10)).get(), f0Var)) {
                    n0.this.f7805i.remove(i10);
                    return;
                }
            }
        }

        @Override // b2.q
        public void c(int i10) {
            n0.this.f7802f.invoke(o.i(i10));
        }

        @Override // b2.q
        public void d(List<? extends b2.f> list) {
            qc.q.i(list, "editCommands");
            n0.this.f7801e.invoke(list);
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.l<List<? extends b2.f>, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final e f7813f = new e();

        e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends b2.f> list) {
            qc.q.i(list, "it");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(List<? extends b2.f> list) {
            invoke2(list);
            return dc.w.f13270a;
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    /* loaded from: classes.dex */
    static final class g extends qc.r implements pc.l<List<? extends b2.f>, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final g f7815f = new g();

        g() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends b2.f> list) {
            qc.q.i(list, "it");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(List<? extends b2.f> list) {
            invoke2(list);
            return dc.w.f13270a;
        }
    }

    public n0(View view, r rVar, z zVar, Executor executor) {
        dc.f a10;
        qc.q.i(view, "view");
        qc.q.i(rVar, "inputMethodManager");
        qc.q.i(executor, "inputCommandProcessorExecutor");
        this.f7797a = view;
        this.f7798b = rVar;
        this.f7799c = zVar;
        this.f7800d = executor;
        this.f7801e = e.f7813f;
        this.f7802f = f.f7814f;
        this.f7803g = new j0("", v1.i0.f24470b.a(), (v1.i0) null, 4, (qc.h) null);
        this.f7804h = p.f7828f.a();
        this.f7805i = new ArrayList();
        a10 = dc.h.a(dc.j.NONE, new c());
        this.f7806j = a10;
        this.f7808l = new k0.f<>(new a[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection m() {
        return (BaseInputConnection) this.f7806j.getValue();
    }

    private final void o() {
        if (!this.f7797a.isFocused()) {
            this.f7808l.i();
            return;
        }
        qc.f0 f0Var = new qc.f0();
        qc.f0 f0Var2 = new qc.f0();
        k0.f<a> fVar = this.f7808l;
        int o10 = fVar.o();
        if (o10 > 0) {
            a[] n10 = fVar.n();
            int i10 = 0;
            do {
                p(n10[i10], f0Var, f0Var2);
                i10++;
            } while (i10 < o10);
        }
        if (qc.q.d(f0Var.f21676f, Boolean.TRUE)) {
            q();
        }
        Boolean bool = (Boolean) f0Var2.f21676f;
        if (bool != null) {
            t(bool.booleanValue());
        }
        if (qc.q.d(f0Var.f21676f, Boolean.FALSE)) {
            q();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void p(a aVar, qc.f0<Boolean> f0Var, qc.f0<Boolean> f0Var2) {
        int i10 = b.f7810a[aVar.ordinal()];
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 == 3 || i10 == 4) && !qc.q.d(f0Var.f21676f, Boolean.FALSE)) {
                    if (aVar != a.ShowKeyboard) {
                        z10 = false;
                    }
                    f0Var2.f21676f = Boolean.valueOf(z10);
                    return;
                }
                return;
            }
            ?? r32 = Boolean.FALSE;
            f0Var.f21676f = r32;
            f0Var2.f21676f = r32;
            return;
        }
        ?? r33 = Boolean.TRUE;
        f0Var.f21676f = r33;
        f0Var2.f21676f = r33;
    }

    private final void q() {
        this.f7798b.c();
    }

    private final void r(a aVar) {
        this.f7808l.d(aVar);
        if (this.f7809m == null) {
            Runnable runnable = new Runnable() { // from class: b2.m0
                @Override // java.lang.Runnable
                public final void run() {
                    n0.s(n0.this);
                }
            };
            this.f7800d.execute(runnable);
            this.f7809m = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(n0 n0Var) {
        qc.q.i(n0Var, "this$0");
        n0Var.f7809m = null;
        n0Var.o();
    }

    private final void t(boolean z10) {
        if (z10) {
            this.f7798b.e();
        } else {
            this.f7798b.d();
        }
    }

    @Override // b2.e0
    public void a() {
        r(a.ShowKeyboard);
    }

    @Override // b2.e0
    public void b() {
        z zVar = this.f7799c;
        if (zVar != null) {
            zVar.b();
        }
        this.f7801e = g.f7815f;
        this.f7802f = h.f7816f;
        this.f7807k = null;
        r(a.StopInput);
    }

    @Override // b2.e0
    public void c(z0.h hVar) {
        int d10;
        int d11;
        int d12;
        int d13;
        Rect rect;
        qc.q.i(hVar, "rect");
        d10 = sc.c.d(hVar.i());
        d11 = sc.c.d(hVar.l());
        d12 = sc.c.d(hVar.j());
        d13 = sc.c.d(hVar.e());
        this.f7807k = new Rect(d10, d11, d12, d13);
        if (this.f7805i.isEmpty() && (rect = this.f7807k) != null) {
            this.f7797a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // b2.e0
    public void d(j0 j0Var, p pVar, pc.l<? super List<? extends b2.f>, dc.w> lVar, pc.l<? super o, dc.w> lVar2) {
        qc.q.i(j0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        qc.q.i(pVar, "imeOptions");
        qc.q.i(lVar, "onEditCommand");
        qc.q.i(lVar2, "onImeActionPerformed");
        z zVar = this.f7799c;
        if (zVar != null) {
            zVar.a();
        }
        this.f7803g = j0Var;
        this.f7804h = pVar;
        this.f7801e = lVar;
        this.f7802f = lVar2;
        r(a.StartInput);
    }

    @Override // b2.e0
    public void e(j0 j0Var, j0 j0Var2) {
        boolean z10;
        int i10;
        qc.q.i(j0Var2, "newValue");
        boolean z11 = true;
        if (v1.i0.g(this.f7803g.g(), j0Var2.g()) && qc.q.d(this.f7803g.f(), j0Var2.f())) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f7803g = j0Var2;
        int size = this.f7805i.size();
        for (int i11 = 0; i11 < size; i11++) {
            f0 f0Var = this.f7805i.get(i11).get();
            if (f0Var != null) {
                f0Var.e(j0Var2);
            }
        }
        if (qc.q.d(j0Var, j0Var2)) {
            if (z10) {
                r rVar = this.f7798b;
                int l10 = v1.i0.l(j0Var2.g());
                int k10 = v1.i0.k(j0Var2.g());
                v1.i0 f10 = this.f7803g.f();
                int i12 = -1;
                if (f10 != null) {
                    i10 = v1.i0.l(f10.r());
                } else {
                    i10 = -1;
                }
                v1.i0 f11 = this.f7803g.f();
                if (f11 != null) {
                    i12 = v1.i0.k(f11.r());
                }
                rVar.b(l10, k10, i10, i12);
                return;
            }
            return;
        }
        if (j0Var == null || (qc.q.d(j0Var.h(), j0Var2.h()) && (!v1.i0.g(j0Var.g(), j0Var2.g()) || qc.q.d(j0Var.f(), j0Var2.f())))) {
            z11 = false;
        }
        if (z11) {
            q();
            return;
        }
        int size2 = this.f7805i.size();
        for (int i13 = 0; i13 < size2; i13++) {
            f0 f0Var2 = this.f7805i.get(i13).get();
            if (f0Var2 != null) {
                f0Var2.f(this.f7803g, this.f7798b);
            }
        }
    }

    @Override // b2.e0
    public void f() {
        r(a.HideKeyboard);
    }

    public final InputConnection l(EditorInfo editorInfo) {
        qc.q.i(editorInfo, "outAttrs");
        q0.h(editorInfo, this.f7804h, this.f7803g);
        q0.i(editorInfo);
        f0 f0Var = new f0(this.f7803g, new d(), this.f7804h.b());
        this.f7805i.add(new WeakReference<>(f0Var));
        return f0Var;
    }

    public final View n() {
        return this.f7797a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ n0(android.view.View r1, b2.r r2, b2.z r3, java.util.concurrent.Executor r4, int r5, qc.h r6) {
        /*
            r0 = this;
            r5 = r5 & 8
            if (r5 == 0) goto L11
            android.view.Choreographer r4 = android.view.Choreographer.getInstance()
            java.lang.String r5 = "getInstance()"
            qc.q.h(r4, r5)
            java.util.concurrent.Executor r4 = b2.q0.d(r4)
        L11:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.n0.<init>(android.view.View, b2.r, b2.z, java.util.concurrent.Executor, int, qc.h):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(View view, z zVar) {
        this(view, new s(view), zVar, null, 8, null);
        qc.q.i(view, "view");
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    /* loaded from: classes.dex */
    static final class f extends qc.r implements pc.l<o, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final f f7814f = new f();

        f() {
            super(1);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(o oVar) {
            a(oVar.o());
            return dc.w.f13270a;
        }

        public final void a(int i10) {
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    /* loaded from: classes.dex */
    static final class h extends qc.r implements pc.l<o, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final h f7816f = new h();

        h() {
            super(1);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(o oVar) {
            a(oVar.o());
            return dc.w.f13270a;
        }

        public final void a(int i10) {
        }
    }
}
