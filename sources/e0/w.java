package e0;

import c0.d0;
import c0.f0;
import c0.t0;
import c0.v0;
import j0.g2;
import j0.z1;
import k1.l0;
import k1.u0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import v1.g0;
import v1.i0;

/* compiled from: TextFieldSelectionManager.kt */
/* loaded from: classes.dex */
public final class w {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldSelectionManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1", f = "TextFieldSelectionManager.kt", l = {820}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<l0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f13711f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f13712m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ f0 f13713p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f13713p = f0Var;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(l0 l0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(l0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f13713p, continuation);
            aVar.f13712m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f13711f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                l0 l0Var = (l0) this.f13712m;
                f0 f0Var = this.f13713p;
                this.f13711f = 1;
                if (c0.y.c(l0Var, f0Var, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f13714f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g2.i f13715m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ v f13716p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f13717q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, g2.i iVar, v vVar, int i10) {
            super(2);
            this.f13714f = z10;
            this.f13715m = iVar;
            this.f13716p = vVar;
            this.f13717q = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            w.a(this.f13714f, this.f13715m, this.f13716p, lVar, z1.a(this.f13717q | 1));
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13718a;

        static {
            int[] iArr = new int[c0.l.values().length];
            try {
                iArr[c0.l.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.l.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c0.l.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13718a = iArr;
        }
    }

    public static final void a(boolean z10, g2.i iVar, v vVar, j0.l lVar, int i10) {
        qc.q.i(iVar, "direction");
        qc.q.i(vVar, "manager");
        j0.l q10 = lVar.q(-1344558920);
        if (j0.n.K()) {
            j0.n.V(-1344558920, i10, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:803)");
        }
        Boolean valueOf = Boolean.valueOf(z10);
        q10.e(511388516);
        boolean Q = q10.Q(valueOf) | q10.Q(vVar);
        Object f10 = q10.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = vVar.I(z10);
            q10.J(f10);
        }
        q10.N();
        f0 f0Var = (f0) f10;
        int i11 = i10 << 3;
        e0.a.c(vVar.z(z10), z10, iVar, i0.m(vVar.H().g()), u0.c(androidx.compose.ui.e.f2335a, f0Var, new a(f0Var, null)), null, q10, (i11 & 112) | 196608 | (i11 & 896));
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new b(z10, iVar, vVar, i10));
        }
    }

    public static final long b(v vVar, long j10) {
        boolean z10;
        int i10;
        int n10;
        v0 g10;
        g0 i11;
        d0 r10;
        v1.d k10;
        vc.f Q;
        int m10;
        n1.s f10;
        v0 g11;
        n1.s c10;
        boolean z11;
        float k11;
        qc.q.i(vVar, "manager");
        if (vVar.H().h().length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return z0.f.f26354b.b();
        }
        c0.l w10 = vVar.w();
        if (w10 == null) {
            i10 = -1;
        } else {
            i10 = c.f13718a[w10.ordinal()];
        }
        if (i10 != -1) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    n10 = i0.i(vVar.H().g());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                n10 = i0.n(vVar.H().g());
            }
            int b10 = vVar.C().b(n10);
            t0 E = vVar.E();
            if (E != null && (g10 = E.g()) != null && (i11 = g10.i()) != null) {
                t0 E2 = vVar.E();
                if (E2 != null && (r10 = E2.r()) != null && (k10 = r10.k()) != null) {
                    Q = yc.w.Q(k10);
                    m10 = vc.l.m(b10, Q);
                    long g12 = i11.c(m10).g();
                    t0 E3 = vVar.E();
                    if (E3 != null && (f10 = E3.f()) != null) {
                        t0 E4 = vVar.E();
                        if (E4 != null && (g11 = E4.g()) != null && (c10 = g11.c()) != null) {
                            z0.f u10 = vVar.u();
                            if (u10 != null) {
                                float o10 = z0.f.o(c10.O(f10, u10.x()));
                                int p10 = i11.p(m10);
                                int t10 = i11.t(p10);
                                int n11 = i11.n(p10, true);
                                if (i0.n(vVar.H().g()) > i0.i(vVar.H().g())) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                float a10 = b0.a(i11, t10, true, z11);
                                float a11 = b0.a(i11, n11, false, z11);
                                k11 = vc.l.k(o10, Math.min(a10, a11), Math.max(a10, a11));
                                if (Math.abs(o10 - k11) > j2.p.g(j10) / 2) {
                                    return z0.f.f26354b.b();
                                }
                                return f10.O(c10, z0.g.a(k11, z0.f.p(g12)));
                            }
                            return z0.f.f26354b.b();
                        }
                        return z0.f.f26354b.b();
                    }
                    return z0.f.f26354b.b();
                }
                return z0.f.f26354b.b();
            }
            return z0.f.f26354b.b();
        }
        return z0.f.f26354b.b();
    }

    public static final boolean c(v vVar, boolean z10) {
        n1.s f10;
        z0.h b10;
        qc.q.i(vVar, "<this>");
        t0 E = vVar.E();
        if (E != null && (f10 = E.f()) != null && (b10 = p.b(f10)) != null) {
            return p.a(b10, vVar.z(z10));
        }
        return false;
    }
}
