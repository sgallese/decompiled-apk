package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.p;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wrapper.android.kt */
/* loaded from: classes.dex */
public final class WrappedComposition implements j0.o, androidx.lifecycle.s {

    /* renamed from: f  reason: collision with root package name */
    private final AndroidComposeView f2587f;

    /* renamed from: m  reason: collision with root package name */
    private final j0.o f2588m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2589p;

    /* renamed from: q  reason: collision with root package name */
    private androidx.lifecycle.p f2590q;

    /* renamed from: r  reason: collision with root package name */
    private pc.p<? super j0.l, ? super Integer, dc.w> f2591r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wrapper.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<AndroidComposeView.b, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f2593m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Wrapper.android.kt */
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0038a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ WrappedComposition f2594f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f2595m;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Wrapper.android.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", l = {155}, m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0039a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f  reason: collision with root package name */
                int f2596f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ WrappedComposition f2597m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0039a(WrappedComposition wrappedComposition, Continuation<? super C0039a> continuation) {
                    super(2, continuation);
                    this.f2597m = wrappedComposition;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C0039a(this.f2597m, continuation);
                }

                @Override // pc.p
                public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C0039a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f2596f;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        AndroidComposeView A = this.f2597m.A();
                        this.f2596f = 1;
                        if (A.O(this) == d10) {
                            return d10;
                        }
                    }
                    return dc.w.f13270a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Wrapper.android.kt */
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$b */
            /* loaded from: classes.dex */
            public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ WrappedComposition f2598f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ pc.p<j0.l, Integer, dc.w> f2599m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(WrappedComposition wrappedComposition, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
                    super(2);
                    this.f2598f = wrappedComposition;
                    this.f2599m = pVar;
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
                        j0.n.V(-1193460702, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:156)");
                    }
                    j0.a(this.f2598f.A(), this.f2599m, lVar, 8);
                    if (j0.n.K()) {
                        j0.n.U();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0038a(WrappedComposition wrappedComposition, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
                super(2);
                this.f2594f = wrappedComposition;
                this.f2595m = pVar;
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
                    j0.n.V(-2000640158, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:141)");
                }
                AndroidComposeView A = this.f2594f.A();
                int i11 = v0.h.J;
                Object tag = A.getTag(i11);
                Set<u0.a> set = qc.k0.m(tag) ? (Set) tag : null;
                if (set == null) {
                    ViewParent parent = this.f2594f.A().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(i11) : null;
                    set = qc.k0.m(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(lVar.k());
                    lVar.a();
                }
                j0.h0.d(this.f2594f.A(), new C0039a(this.f2594f, null), lVar, 72);
                j0.u.a(new j0.w1[]{u0.c.a().c(set)}, q0.c.b(lVar, -1193460702, true, new b(this.f2594f, this.f2595m)), lVar, 56);
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
            super(1);
            this.f2593m = pVar;
        }

        public final void a(AndroidComposeView.b bVar) {
            qc.q.i(bVar, "it");
            if (!WrappedComposition.this.f2589p) {
                androidx.lifecycle.p lifecycle = bVar.a().getLifecycle();
                WrappedComposition.this.f2591r = this.f2593m;
                if (WrappedComposition.this.f2590q == null) {
                    WrappedComposition.this.f2590q = lifecycle;
                    lifecycle.a(WrappedComposition.this);
                } else if (lifecycle.b().isAtLeast(p.b.CREATED)) {
                    WrappedComposition.this.z().e(q0.c.c(-2000640158, true, new C0038a(WrappedComposition.this, this.f2593m)));
                }
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(AndroidComposeView.b bVar) {
            a(bVar);
            return dc.w.f13270a;
        }
    }

    public WrappedComposition(AndroidComposeView androidComposeView, j0.o oVar) {
        qc.q.i(androidComposeView, "owner");
        qc.q.i(oVar, "original");
        this.f2587f = androidComposeView;
        this.f2588m = oVar;
        this.f2591r = y0.f2953a.a();
    }

    public final AndroidComposeView A() {
        return this.f2587f;
    }

    @Override // androidx.lifecycle.s
    public void c(androidx.lifecycle.v vVar, p.a aVar) {
        qc.q.i(vVar, "source");
        qc.q.i(aVar, "event");
        if (aVar == p.a.ON_DESTROY) {
            dispose();
        } else if (aVar == p.a.ON_CREATE && !this.f2589p) {
            e(this.f2591r);
        }
    }

    @Override // j0.o
    public void dispose() {
        if (!this.f2589p) {
            this.f2589p = true;
            this.f2587f.getView().setTag(v0.h.K, null);
            androidx.lifecycle.p pVar = this.f2590q;
            if (pVar != null) {
                pVar.d(this);
            }
        }
        this.f2588m.dispose();
    }

    @Override // j0.o
    public void e(pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
        qc.q.i(pVar, "content");
        this.f2587f.setOnViewTreeOwnersAvailable(new a(pVar));
    }

    @Override // j0.o
    public boolean k() {
        return this.f2588m.k();
    }

    @Override // j0.o
    public boolean r() {
        return this.f2588m.r();
    }

    public final j0.o z() {
        return this.f2588m;
    }
}
