package e0;

import a1.a1;
import a1.h1;
import a1.j1;
import a1.p1;
import a1.q1;
import a1.r1;
import a1.t3;
import a1.u3;
import a1.v3;
import androidx.recyclerview.widget.RecyclerView;
import c1.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.g2;
import j0.z1;
import okhttp3.internal.http2.Http2;
import w.d0;

/* compiled from: AndroidSelectionHandles.android.kt */
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidSelectionHandles.android.kt */
    /* renamed from: e0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0317a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13567f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f13568m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ g2.i f13569p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f13570q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f13571r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0317a(androidx.compose.ui.e eVar, boolean z10, g2.i iVar, boolean z11, int i10) {
            super(2);
            this.f13567f = eVar;
            this.f13568m = z10;
            this.f13569p = iVar;
            this.f13570q = z11;
            this.f13571r = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            a.a(this.f13567f, this.f13568m, this.f13569p, this.f13570q, lVar, z1.a(this.f13571r | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidSelectionHandles.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f13572f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ f f13573m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f13574p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f13575q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(long j10, f fVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10) {
            super(2);
            this.f13572f = j10;
            this.f13573m = fVar;
            this.f13574p = pVar;
            this.f13575q = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            a.b(this.f13572f, this.f13573m, this.f13574p, lVar, z1.a(this.f13575q | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidSelectionHandles.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f13576f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13577m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f13578p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f13579q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f13580r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ g2.i f13581s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ boolean f13582t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AndroidSelectionHandles.android.kt */
        /* renamed from: e0.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0318a extends qc.r implements pc.l<t1.x, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f13583f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ long f13584m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0318a(boolean z10, long j10) {
                super(1);
                this.f13583f = z10;
                this.f13584m = j10;
            }

            public final void a(t1.x xVar) {
                c0.l lVar;
                qc.q.i(xVar, "$this$semantics");
                t1.w<m> d10 = n.d();
                if (this.f13583f) {
                    lVar = c0.l.SelectionStart;
                } else {
                    lVar = c0.l.SelectionEnd;
                }
                xVar.a(d10, new m(lVar, this.f13584m, null));
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
                a(xVar);
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(pc.p<? super j0.l, ? super Integer, dc.w> pVar, androidx.compose.ui.e eVar, boolean z10, long j10, int i10, g2.i iVar, boolean z11) {
            super(2);
            this.f13576f = pVar;
            this.f13577m = eVar;
            this.f13578p = z10;
            this.f13579q = j10;
            this.f13580r = i10;
            this.f13581s = iVar;
            this.f13582t = z11;
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
                j0.n.V(732099485, i10, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:69)");
            }
            if (this.f13576f == null) {
                lVar.e(386443790);
                androidx.compose.ui.e eVar = this.f13577m;
                Boolean valueOf = Boolean.valueOf(this.f13578p);
                z0.f d10 = z0.f.d(this.f13579q);
                boolean z10 = this.f13578p;
                long j10 = this.f13579q;
                lVar.e(511388516);
                boolean Q = lVar.Q(valueOf) | lVar.Q(d10);
                Object f10 = lVar.f();
                if (Q || f10 == j0.l.f18688a.a()) {
                    f10 = new C0318a(z10, j10);
                    lVar.J(f10);
                }
                lVar.N();
                androidx.compose.ui.e c10 = t1.o.c(eVar, false, (pc.l) f10, 1, null);
                boolean z11 = this.f13578p;
                g2.i iVar = this.f13581s;
                boolean z12 = this.f13582t;
                int i11 = this.f13580r;
                a.a(c10, z11, iVar, z12, lVar, (i11 & 112) | (i11 & 896) | (i11 & 7168));
                lVar.N();
            } else {
                lVar.e(386444465);
                this.f13576f.invoke(lVar, Integer.valueOf((this.f13580r >> 15) & 14));
                lVar.N();
            }
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidSelectionHandles.android.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f13585f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f13586m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ g2.i f13587p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f13588q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13589r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f13590s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f13591t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(long j10, boolean z10, g2.i iVar, boolean z11, androidx.compose.ui.e eVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10) {
            super(2);
            this.f13585f = j10;
            this.f13586m = z10;
            this.f13587p = iVar;
            this.f13588q = z11;
            this.f13589r = eVar;
            this.f13590s = pVar;
            this.f13591t = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            a.c(this.f13585f, this.f13586m, this.f13587p, this.f13588q, this.f13589r, this.f13590s, lVar, z1.a(this.f13591t | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidSelectionHandles.android.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f13592f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g2.i f13593m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f13594p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AndroidSelectionHandles.android.kt */
        /* renamed from: e0.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0319a extends qc.r implements pc.l<x0.d, x0.i> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ long f13595f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ boolean f13596m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ g2.i f13597p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ boolean f13598q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: AndroidSelectionHandles.android.kt */
            /* renamed from: e0.a$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0320a extends qc.r implements pc.l<c1.c, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ boolean f13599f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ g2.i f13600m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ boolean f13601p;

                /* renamed from: q  reason: collision with root package name */
                final /* synthetic */ t3 f13602q;

                /* renamed from: r  reason: collision with root package name */
                final /* synthetic */ q1 f13603r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0320a(boolean z10, g2.i iVar, boolean z11, t3 t3Var, q1 q1Var) {
                    super(1);
                    this.f13599f = z10;
                    this.f13600m = iVar;
                    this.f13601p = z11;
                    this.f13602q = t3Var;
                    this.f13603r = q1Var;
                }

                public final void a(c1.c cVar) {
                    qc.q.i(cVar, "$this$onDrawWithContent");
                    cVar.d1();
                    if (a.h(this.f13599f, this.f13600m, this.f13601p)) {
                        t3 t3Var = this.f13602q;
                        q1 q1Var = this.f13603r;
                        long O0 = cVar.O0();
                        c1.d y02 = cVar.y0();
                        long b10 = y02.b();
                        y02.d().k();
                        y02.a().e(-1.0f, 1.0f, O0);
                        c1.e.h(cVar, t3Var, 0L, 0.0f, null, q1Var, 0, 46, null);
                        y02.d().p();
                        y02.c(b10);
                        return;
                    }
                    c1.e.h(cVar, this.f13602q, 0L, 0.0f, null, this.f13603r, 0, 46, null);
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ dc.w invoke(c1.c cVar) {
                    a(cVar);
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0319a(long j10, boolean z10, g2.i iVar, boolean z11) {
                super(1);
                this.f13595f = j10;
                this.f13596m = z10;
                this.f13597p = iVar;
                this.f13598q = z11;
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final x0.i invoke(x0.d dVar) {
                qc.q.i(dVar, "$this$drawWithCache");
                return dVar.f(new C0320a(this.f13596m, this.f13597p, this.f13598q, a.e(dVar, z0.l.i(dVar.b()) / 2.0f), q1.a.b(q1.f163b, this.f13595f, 0, 2, null)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, g2.i iVar, boolean z11) {
            super(3);
            this.f13592f = z10;
            this.f13593m = iVar;
            this.f13594p = z11;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 ??, still in use, count: 1, list:
              (r8v3 ?? I:java.lang.Object) from 0x0078: INVOKE (r12v0 ?? I:j0.l), (r8v3 ?? I:java.lang.Object) type: INTERFACE call: j0.l.J(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:121)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:152)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:117)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:89)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:88)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
            */
        public final androidx.compose.ui.e a(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 ??, still in use, count: 1, list:
              (r8v3 ?? I:java.lang.Object) from 0x0078: INVOKE (r12v0 ?? I:j0.l), (r8v3 ?? I:java.lang.Object) type: INTERFACE call: j0.l.J(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:121)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:152)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:117)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:89)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:88)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:233)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            */

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    public static final void a(androidx.compose.ui.e eVar, boolean z10, g2.i iVar, boolean z11, j0.l lVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        qc.q.i(eVar, "modifier");
        qc.q.i(iVar, "direction");
        j0.l q10 = lVar.q(47957398);
        if ((i10 & 14) == 0) {
            if (q10.Q(eVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (q10.c(z10)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 896) == 0) {
            if (q10.Q(iVar)) {
                i13 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 7168) == 0) {
            if (q10.c(z11)) {
                i12 = RecyclerView.m.FLAG_MOVED;
            } else {
                i12 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i11 |= i12;
        }
        if ((i11 & 5851) == 1170 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(47957398, i10, -1, "androidx.compose.foundation.text.selection.DefaultSelectionHandle (AndroidSelectionHandles.android.kt:95)");
            }
            d0.a(f(androidx.compose.foundation.layout.m.p(eVar, n.c(), n.b()), z10, iVar, z11), q10, 0);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new C0317a(eVar, z10, iVar, z11, i10));
        }
    }

    public static final void b(long j10, f fVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, j0.l lVar, int i10) {
        int i11;
        int d10;
        int d11;
        int i12;
        int i13;
        int i14;
        qc.q.i(fVar, "handleReferencePoint");
        qc.q.i(pVar, "content");
        j0.l q10 = lVar.q(-1409050158);
        if ((i10 & 14) == 0) {
            if (q10.j(j10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (q10.Q(fVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (q10.l(pVar)) {
                i12 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(-1409050158, i11, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:223)");
            }
            d10 = sc.c.d(z0.f.o(j10));
            d11 = sc.c.d(z0.f.p(j10));
            long a10 = j2.m.a(d10, d11);
            j2.l b10 = j2.l.b(a10);
            q10.e(511388516);
            boolean Q = q10.Q(b10) | q10.Q(fVar);
            Object f10 = q10.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                f10 = new e0.e(fVar, a10, null);
                q10.J(f10);
            }
            q10.N();
            androidx.compose.ui.window.a.a((e0.e) f10, null, new androidx.compose.ui.window.k(false, false, false, null, true, false, 15, null), pVar, q10, ((i11 << 3) & 7168) | 384, 2);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new b(j10, fVar, pVar, i10));
        }
    }

    public static final void c(long j10, boolean z10, g2.i iVar, boolean z11, androidx.compose.ui.e eVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, j0.l lVar, int i10) {
        int i11;
        f fVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        qc.q.i(iVar, "direction");
        qc.q.i(eVar, "modifier");
        j0.l q10 = lVar.q(-616295642);
        if ((i10 & 14) == 0) {
            if (q10.j(j10)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (q10.c(z10)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 896) == 0) {
            if (q10.Q(iVar)) {
                i15 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 7168) == 0) {
            if (q10.c(z11)) {
                i14 = RecyclerView.m.FLAG_MOVED;
            } else {
                i14 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i11 |= i14;
        }
        if ((57344 & i10) == 0) {
            if (q10.Q(eVar)) {
                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i13 = 8192;
            }
            i11 |= i13;
        }
        if ((458752 & i10) == 0) {
            if (q10.l(pVar)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        int i18 = i11;
        if ((374491 & i18) == 74898 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(-616295642, i18, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:53)");
            }
            if (h(z10, iVar, z11)) {
                fVar = f.TopRight;
            } else {
                fVar = f.TopLeft;
            }
            b(j10, fVar, q0.c.b(q10, 732099485, true, new c(pVar, eVar, z10, j10, i18, iVar, z11)), q10, (i18 & 14) | 384);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new d(j10, z10, iVar, z11, eVar, pVar, i10));
        }
    }

    public static final t3 e(x0.d dVar, float f10) {
        qc.q.i(dVar, "<this>");
        int ceil = ((int) Math.ceil(f10)) * 2;
        e0.d dVar2 = e0.d.f13629a;
        t3 c10 = dVar2.c();
        h1 a10 = dVar2.a();
        c1.a b10 = dVar2.b();
        if (c10 == null || a10 == null || ceil > c10.getWidth() || ceil > c10.getHeight()) {
            c10 = v3.b(ceil, ceil, u3.f198b.a(), false, null, 24, null);
            dVar2.f(c10);
            a10 = j1.a(c10);
            dVar2.d(a10);
        }
        t3 t3Var = c10;
        h1 h1Var = a10;
        if (b10 == null) {
            b10 = new c1.a();
            dVar2.e(b10);
        }
        c1.a aVar = b10;
        j2.r layoutDirection = dVar.getLayoutDirection();
        long a11 = z0.m.a(t3Var.getWidth(), t3Var.getHeight());
        a.C0220a s10 = aVar.s();
        j2.e a12 = s10.a();
        j2.r b11 = s10.b();
        h1 c11 = s10.c();
        long d10 = s10.d();
        a.C0220a s11 = aVar.s();
        s11.j(dVar);
        s11.k(layoutDirection);
        s11.i(h1Var);
        s11.l(a11);
        h1Var.k();
        c1.e.m(aVar, p1.f146b.a(), 0L, aVar.b(), 0.0f, null, null, a1.f62b.a(), 58, null);
        c1.e.m(aVar, r1.d(4278190080L), z0.f.f26354b.c(), z0.m.a(f10, f10), 0.0f, null, null, 0, 120, null);
        c1.e.f(aVar, r1.d(4278190080L), f10, z0.g.a(f10, f10), 0.0f, null, null, 0, 120, null);
        h1Var.p();
        a.C0220a s12 = aVar.s();
        s12.j(a12);
        s12.k(b11);
        s12.i(c11);
        s12.l(d10);
        return t3Var;
    }

    public static final androidx.compose.ui.e f(androidx.compose.ui.e eVar, boolean z10, g2.i iVar, boolean z11) {
        qc.q.i(eVar, "<this>");
        qc.q.i(iVar, "direction");
        return androidx.compose.ui.c.b(eVar, null, new e(z10, iVar, z11), 1, null);
    }

    public static final boolean g(g2.i iVar, boolean z10) {
        qc.q.i(iVar, "direction");
        if ((iVar == g2.i.Ltr && !z10) || (iVar == g2.i.Rtl && z10)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(boolean z10, g2.i iVar, boolean z11) {
        if (z10) {
            return g(iVar, z11);
        }
        if (!g(iVar, z11)) {
            return true;
        }
        return false;
    }
}
