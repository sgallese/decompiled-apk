package d0;

import c0.f0;
import c0.y;
import c0.y0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dc.n;
import dc.w;
import e0.c0;
import e0.q;
import e0.r;
import k1.l0;
import k1.u0;
import k1.x;
import kotlin.coroutines.Continuation;
import n1.s;
import pc.p;
import v1.g0;
import z0.f;

/* compiled from: SelectionController.kt */
/* loaded from: classes.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionController.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$1", f = "SelectionController.kt", l = {UserVerificationMethods.USER_VERIFY_HANDPRINT}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements p<l0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f13026f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f13027m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ c f13028p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f13028p = cVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(l0 l0Var, Continuation<? super w> continuation) {
            return ((a) create(l0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f13028p, continuation);
            aVar.f13027m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f13026f;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                l0 l0Var = (l0) this.f13027m;
                c cVar = this.f13028p;
                this.f13026f = 1;
                if (y.d(l0Var, cVar, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionController.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$2", f = "SelectionController.kt", l = {345}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements p<l0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f13029f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f13030m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ d f13031p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d dVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f13031p = dVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(l0 l0Var, Continuation<? super w> continuation) {
            return ((b) create(l0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f13031p, continuation);
            bVar.f13030m = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f13029f;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                l0 l0Var = (l0) this.f13030m;
                d dVar = this.f13031p;
                this.f13029f = 1;
                if (c0.c(l0Var, dVar, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* compiled from: SelectionController.kt */
    /* loaded from: classes.dex */
    public static final class d implements e0.g {

        /* renamed from: a  reason: collision with root package name */
        private long f13038a = z0.f.f26354b.c();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ pc.a<s> f13039b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f13040c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f13041d;

        /* JADX WARN: Multi-variable type inference failed */
        d(pc.a<? extends s> aVar, q qVar, long j10) {
            this.f13039b = aVar;
            this.f13040c = qVar;
            this.f13041d = j10;
        }

        @Override // e0.g
        public boolean a(long j10, e0.k kVar) {
            qc.q.i(kVar, "adjustment");
            s invoke = this.f13039b.invoke();
            if (invoke != null) {
                q qVar = this.f13040c;
                long j11 = this.f13041d;
                if (!invoke.r() || !r.b(qVar, j11)) {
                    return false;
                }
                if (qVar.h(invoke, j10, this.f13038a, false, kVar)) {
                    this.f13038a = j10;
                    return true;
                }
                return true;
            }
            return true;
        }

        @Override // e0.g
        public boolean b(long j10) {
            s invoke = this.f13039b.invoke();
            if (invoke != null) {
                q qVar = this.f13040c;
                long j11 = this.f13041d;
                if (!invoke.r() || !r.b(qVar, j11)) {
                    return false;
                }
                if (qVar.h(invoke, j10, this.f13038a, false, e0.k.f13641a.e())) {
                    this.f13038a = j10;
                    return true;
                }
                return true;
            }
            return true;
        }

        @Override // e0.g
        public boolean c(long j10, e0.k kVar) {
            qc.q.i(kVar, "adjustment");
            s invoke = this.f13039b.invoke();
            if (invoke == null) {
                return false;
            }
            q qVar = this.f13040c;
            long j11 = this.f13041d;
            if (!invoke.r()) {
                return false;
            }
            qVar.g(invoke, j10, kVar);
            this.f13038a = j10;
            return r.b(qVar, j11);
        }

        @Override // e0.g
        public boolean d(long j10) {
            s invoke = this.f13039b.invoke();
            if (invoke == null) {
                return false;
            }
            q qVar = this.f13040c;
            long j11 = this.f13041d;
            if (!invoke.r()) {
                return false;
            }
            if (qVar.h(invoke, j10, this.f13038a, false, e0.k.f13641a.e())) {
                this.f13038a = j10;
            }
            return r.b(qVar, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.e c(q qVar, long j10, pc.a<? extends s> aVar, pc.a<g0> aVar2, boolean z10) {
        if (z10) {
            c cVar = new c(aVar, qVar, j10, aVar2);
            return u0.c(androidx.compose.ui.e.f2335a, cVar, new a(cVar, null));
        }
        d dVar = new d(aVar, qVar, j10);
        return x.c(u0.c(androidx.compose.ui.e.f2335a, dVar, new b(dVar, null)), y0.a(), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(g0 g0Var, long j10, long j11) {
        if (g0Var == null) {
            return false;
        }
        int length = g0Var.k().j().i().length();
        int w10 = g0Var.w(j10);
        int w11 = g0Var.w(j11);
        int i10 = length - 1;
        if ((w10 < i10 || w11 < i10) && (w10 >= 0 || w11 >= 0)) {
            return false;
        }
        return true;
    }

    /* compiled from: SelectionController.kt */
    /* loaded from: classes.dex */
    public static final class c implements f0 {

        /* renamed from: a  reason: collision with root package name */
        private long f13032a;

        /* renamed from: b  reason: collision with root package name */
        private long f13033b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ pc.a<s> f13034c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f13035d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f13036e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a<g0> f13037f;

        /* JADX WARN: Multi-variable type inference failed */
        c(pc.a<? extends s> aVar, q qVar, long j10, pc.a<g0> aVar2) {
            this.f13034c = aVar;
            this.f13035d = qVar;
            this.f13036e = j10;
            this.f13037f = aVar2;
            f.a aVar3 = z0.f.f26354b;
            this.f13032a = aVar3.c();
            this.f13033b = aVar3.c();
        }

        @Override // c0.f0
        public void a() {
            if (r.b(this.f13035d, this.f13036e)) {
                this.f13035d.e();
            }
        }

        @Override // c0.f0
        public void c(long j10) {
            s invoke = this.f13034c.invoke();
            if (invoke != null) {
                pc.a<g0> aVar = this.f13037f;
                q qVar = this.f13035d;
                long j11 = this.f13036e;
                if (!invoke.r()) {
                    return;
                }
                if (i.d(aVar.invoke(), j10, j10)) {
                    qVar.d(j11);
                } else {
                    qVar.g(invoke, j10, e0.k.f13641a.g());
                }
                this.f13032a = j10;
            }
            if (!r.b(this.f13035d, this.f13036e)) {
                return;
            }
            this.f13033b = z0.f.f26354b.c();
        }

        @Override // c0.f0
        public void e(long j10) {
            s invoke = this.f13034c.invoke();
            if (invoke != null) {
                q qVar = this.f13035d;
                long j11 = this.f13036e;
                pc.a<g0> aVar = this.f13037f;
                if (!invoke.r() || !r.b(qVar, j11)) {
                    return;
                }
                long t10 = z0.f.t(this.f13033b, j10);
                this.f13033b = t10;
                long t11 = z0.f.t(this.f13032a, t10);
                if (!i.d(aVar.invoke(), this.f13032a, t11) && qVar.h(invoke, t11, this.f13032a, false, e0.k.f13641a.d())) {
                    this.f13032a = t11;
                    this.f13033b = z0.f.f26354b.c();
                }
            }
        }

        @Override // c0.f0
        public void onStop() {
            if (r.b(this.f13035d, this.f13036e)) {
                this.f13035d.e();
            }
        }

        @Override // c0.f0
        public void d() {
        }

        @Override // c0.f0
        public void b(long j10) {
        }
    }
}
