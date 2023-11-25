package h0;

import a1.o1;
import a1.p1;
import ad.k0;
import dc.w;
import ec.b0;
import j0.g3;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Ripple.kt */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16418a;

    /* renamed from: b  reason: collision with root package name */
    private final g3<f> f16419b;

    /* renamed from: c  reason: collision with root package name */
    private final s.a<Float, s.n> f16420c;

    /* renamed from: d  reason: collision with root package name */
    private final List<v.j> f16421d;

    /* renamed from: e  reason: collision with root package name */
    private v.j f16422e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Ripple.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {290}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f16423f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ float f16425p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ s.j<Float> f16426q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, s.j<Float> jVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f16425p = f10;
            this.f16426q = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f16425p, this.f16426q, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f16423f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                s.a aVar = q.this.f16420c;
                Float c10 = kotlin.coroutines.jvm.internal.b.c(this.f16425p);
                s.j<Float> jVar = this.f16426q;
                this.f16423f = 1;
                if (s.a.f(aVar, c10, jVar, null, null, this, 12, null) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Ripple.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {296}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f16427f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ s.j<Float> f16429p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s.j<Float> jVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f16429p = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f16429p, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f16427f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                s.a aVar = q.this.f16420c;
                Float c10 = kotlin.coroutines.jvm.internal.b.c(0.0f);
                s.j<Float> jVar = this.f16429p;
                this.f16427f = 1;
                if (s.a.f(aVar, c10, jVar, null, null, this, 12, null) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    public q(boolean z10, g3<f> g3Var) {
        qc.q.i(g3Var, "rippleAlpha");
        this.f16418a = z10;
        this.f16419b = g3Var;
        this.f16420c = s.b.b(0.0f, 0.0f, 2, null);
        this.f16421d = new ArrayList();
    }

    public final void b(c1.f fVar, float f10, long j10) {
        float v02;
        qc.q.i(fVar, "$this$drawStateLayer");
        if (Float.isNaN(f10)) {
            v02 = h.a(fVar, this.f16418a, fVar.b());
        } else {
            v02 = fVar.v0(f10);
        }
        float f11 = v02;
        float floatValue = this.f16420c.n().floatValue();
        if (floatValue > 0.0f) {
            long o10 = p1.o(j10, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (this.f16418a) {
                float i10 = z0.l.i(fVar.b());
                float g10 = z0.l.g(fVar.b());
                int b10 = o1.f133a.b();
                c1.d y02 = fVar.y0();
                long b11 = y02.b();
                y02.d().k();
                y02.a().a(0.0f, 0.0f, i10, g10, b10);
                c1.e.f(fVar, o10, f11, 0L, 0.0f, null, null, 0, 124, null);
                y02.d().p();
                y02.c(b11);
                return;
            }
            c1.e.f(fVar, o10, f11, 0L, 0.0f, null, null, 0, 124, null);
        }
    }

    public final void c(v.j jVar, k0 k0Var) {
        Object n02;
        s.j d10;
        float f10;
        s.j c10;
        qc.q.i(jVar, "interaction");
        qc.q.i(k0Var, "scope");
        boolean z10 = jVar instanceof v.g;
        if (z10) {
            this.f16421d.add(jVar);
        } else if (jVar instanceof v.h) {
            this.f16421d.remove(((v.h) jVar).a());
        } else if (jVar instanceof v.d) {
            this.f16421d.add(jVar);
        } else if (jVar instanceof v.e) {
            this.f16421d.remove(((v.e) jVar).a());
        } else if (jVar instanceof v.b) {
            this.f16421d.add(jVar);
        } else if (jVar instanceof v.c) {
            this.f16421d.remove(((v.c) jVar).a());
        } else if (jVar instanceof v.a) {
            this.f16421d.remove(((v.a) jVar).a());
        } else {
            return;
        }
        n02 = b0.n0(this.f16421d);
        v.j jVar2 = (v.j) n02;
        if (!qc.q.d(this.f16422e, jVar2)) {
            if (jVar2 == null) {
                d10 = n.d(this.f16422e);
                ad.i.d(k0Var, null, null, new b(d10, null), 3, null);
            } else {
                if (z10) {
                    f10 = this.f16419b.getValue().c();
                } else if (jVar instanceof v.d) {
                    f10 = this.f16419b.getValue().b();
                } else if (jVar instanceof v.b) {
                    f10 = this.f16419b.getValue().a();
                } else {
                    f10 = 0.0f;
                }
                c10 = n.c(jVar2);
                ad.i.d(k0Var, null, null, new a(f10, c10, null), 3, null);
            }
            this.f16422e = jVar2;
        }
    }
}
