package b5;

import ad.a1;
import ad.k0;
import ad.p1;
import ad.r0;
import ad.x1;
import android.view.View;
import coil.request.ViewTargetRequestDelegate;
import dc.w;
import kotlin.coroutines.Continuation;

/* compiled from: ViewTargetRequestManager.kt */
/* loaded from: classes.dex */
public final class t implements View.OnAttachStateChangeListener {

    /* renamed from: f  reason: collision with root package name */
    private final View f8050f;

    /* renamed from: m  reason: collision with root package name */
    private s f8051m;

    /* renamed from: p  reason: collision with root package name */
    private x1 f8052p;

    /* renamed from: q  reason: collision with root package name */
    private ViewTargetRequestDelegate f8053q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f8054r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewTargetRequestManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f8055f;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f8055f == 0) {
                dc.n.b(obj);
                t.this.c(null);
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public t(View view) {
        this.f8050f = view;
    }

    public final synchronized void a() {
        x1 d10;
        x1 x1Var = this.f8052p;
        if (x1Var != null) {
            x1.a.a(x1Var, null, 1, null);
        }
        d10 = ad.i.d(p1.f548f, a1.c().N0(), null, new a(null), 2, null);
        this.f8052p = d10;
        this.f8051m = null;
    }

    public final synchronized s b(r0<? extends i> r0Var) {
        s sVar = this.f8051m;
        if (sVar != null && g5.l.r() && this.f8054r) {
            this.f8054r = false;
            sVar.a(r0Var);
            return sVar;
        }
        x1 x1Var = this.f8052p;
        if (x1Var != null) {
            x1.a.a(x1Var, null, 1, null);
        }
        this.f8052p = null;
        s sVar2 = new s(this.f8050f, r0Var);
        this.f8051m = sVar2;
        return sVar2;
    }

    public final void c(ViewTargetRequestDelegate viewTargetRequestDelegate) {
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.f8053q;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.a();
        }
        this.f8053q = viewTargetRequestDelegate;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f8053q;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.f8054r = true;
        viewTargetRequestDelegate.b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f8053q;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.a();
        }
    }
}
