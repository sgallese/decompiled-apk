package u;

import ad.k0;
import androidx.compose.foundation.gestures.DraggableElement;
import androidx.recyclerview.widget.RecyclerView;
import k1.c0;
import kotlin.coroutines.Continuation;
import qc.e0;
import u.g;

/* compiled from: Draggable.kt */
/* loaded from: classes.dex */
public final class j {

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = {472, 481, 600, 650}, m = "awaitDownAndSlop")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f */
        Object f23880f;

        /* renamed from: m */
        Object f23881m;

        /* renamed from: p */
        Object f23882p;

        /* renamed from: q */
        Object f23883q;

        /* renamed from: r */
        Object f23884r;

        /* renamed from: s */
        Object f23885s;

        /* renamed from: t */
        int f23886t;

        /* renamed from: u */
        float f23887u;

        /* renamed from: v */
        float f23888v;

        /* renamed from: w */
        float f23889w;

        /* renamed from: x */
        /* synthetic */ Object f23890x;

        /* renamed from: y */
        int f23891y;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23890x = obj;
            this.f23891y |= RecyclerView.UNDEFINED_DURATION;
            return j.f(null, null, null, null, null, this);
        }
    }

    /* compiled from: Draggable.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<c0, z0.f, dc.w> {

        /* renamed from: f */
        final /* synthetic */ l1.c f23892f;

        /* renamed from: m */
        final /* synthetic */ e0 f23893m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l1.c cVar, e0 e0Var) {
            super(2);
            this.f23892f = cVar;
            this.f23893m = e0Var;
        }

        public final void a(c0 c0Var, long j10) {
            qc.q.i(c0Var, "event");
            l1.d.c(this.f23892f, c0Var);
            c0Var.a();
            this.f23893m.f21668f = j10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(c0 c0Var, z0.f fVar) {
            a(c0Var, fVar.x());
            return dc.w.f13270a;
        }
    }

    /* compiled from: Draggable.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<c0, dc.w> {

        /* renamed from: f */
        final /* synthetic */ l1.c f23894f;

        /* renamed from: m */
        final /* synthetic */ cd.s<u.g> f23895m;

        /* renamed from: p */
        final /* synthetic */ boolean f23896p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(l1.c cVar, cd.s<? super u.g> sVar, boolean z10) {
            super(1);
            this.f23894f = cVar;
            this.f23895m = sVar;
            this.f23896p = z10;
        }

        public final void a(c0 c0Var) {
            qc.q.i(c0Var, "event");
            l1.d.c(this.f23894f, c0Var);
            if (!k1.s.d(c0Var)) {
                long g10 = k1.s.g(c0Var);
                c0Var.a();
                cd.s<u.g> sVar = this.f23895m;
                if (this.f23896p) {
                    g10 = z0.f.u(g10, -1.0f);
                }
                sVar.p(new g.b(g10, null));
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c0 c0Var) {
            a(c0Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements pc.q<k0, z0.f, Continuation<? super dc.w>, Object> {

        /* renamed from: f */
        int f23897f;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        public final Object a(k0 k0Var, long j10, Continuation<? super dc.w> continuation) {
            return new d(continuation).invokeSuspend(dc.w.f13270a);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Object invoke(k0 k0Var, z0.f fVar, Continuation<? super dc.w> continuation) {
            return a(k0Var, fVar.x(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f23897f == 0) {
                dc.n.b(obj);
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements pc.q<k0, Float, Continuation<? super dc.w>, Object> {

        /* renamed from: f */
        int f23898f;

        e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        public final Object a(k0 k0Var, float f10, Continuation<? super dc.w> continuation) {
            return new e(continuation).invokeSuspend(dc.w.f13270a);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Object invoke(k0 k0Var, Float f10, Continuation<? super dc.w> continuation) {
            return a(k0Var, f10.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f23898f == 0) {
                dc.n.b(obj);
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: Draggable.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.l<c0, Boolean> {

        /* renamed from: f */
        public static final f f23899f = new f();

        f() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a */
        public final Boolean invoke(c0 c0Var) {
            qc.q.i(c0Var, "it");
            return Boolean.TRUE;
        }
    }

    /* compiled from: Draggable.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.a<Boolean> {

        /* renamed from: f */
        final /* synthetic */ boolean f23900f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z10) {
            super(0);
            this.f23900f = z10;
        }

        @Override // pc.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f23900f);
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", f = "Draggable.kt", l = {194}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements pc.q<k0, j2.v, Continuation<? super dc.w>, Object> {

        /* renamed from: f */
        int f23901f;

        /* renamed from: m */
        private /* synthetic */ Object f23902m;

        /* renamed from: p */
        /* synthetic */ long f23903p;

        /* renamed from: q */
        final /* synthetic */ pc.q<k0, Float, Continuation<? super dc.w>, Object> f23904q;

        /* renamed from: r */
        final /* synthetic */ o f23905r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(pc.q<? super k0, ? super Float, ? super Continuation<? super dc.w>, ? extends Object> qVar, o oVar, Continuation<? super h> continuation) {
            super(3, continuation);
            this.f23904q = qVar;
            this.f23905r = oVar;
        }

        public final Object a(k0 k0Var, long j10, Continuation<? super dc.w> continuation) {
            h hVar = new h(this.f23904q, this.f23905r, continuation);
            hVar.f23902m = k0Var;
            hVar.f23903p = j10;
            return hVar.invokeSuspend(dc.w.f13270a);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Object invoke(k0 k0Var, j2.v vVar, Continuation<? super dc.w> continuation) {
            return a(k0Var, vVar.o(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f23901f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                k0 k0Var = (k0) this.f23902m;
                long j10 = this.f23903p;
                pc.q<k0, Float, Continuation<? super dc.w>, Object> qVar = this.f23904q;
                Float c10 = kotlin.coroutines.jvm.internal.b.c(j.l(j10, this.f23905r));
                this.f23901f = 1;
                if (qVar.invoke(k0Var, c10, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = {592}, m = "onDragOrUp-Axegvzg")
    /* loaded from: classes.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f */
        Object f23906f;

        /* renamed from: m */
        Object f23907m;

        /* renamed from: p */
        Object f23908p;

        /* renamed from: q */
        Object f23909q;

        /* renamed from: r */
        Object f23910r;

        /* renamed from: s */
        /* synthetic */ Object f23911s;

        /* renamed from: t */
        int f23912t;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23911s = obj;
            this.f23912t |= RecyclerView.UNDEFINED_DURATION;
            return j.j(null, null, 0L, null, this);
        }
    }

    /* compiled from: Draggable.kt */
    /* renamed from: u.j$j */
    /* loaded from: classes.dex */
    public static final class C0557j extends qc.r implements pc.l<c0, Float> {

        /* renamed from: f */
        public static final C0557j f23913f = new C0557j();

        C0557j() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a */
        public final Float invoke(c0 c0Var) {
            qc.q.i(c0Var, "it");
            return Float.valueOf(z0.f.p(k1.s.h(c0Var)));
        }
    }

    /* compiled from: Draggable.kt */
    /* loaded from: classes.dex */
    public static final class k extends qc.r implements pc.l<c0, Float> {

        /* renamed from: f */
        public static final k f23914f = new k();

        k() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a */
        public final Float invoke(c0 c0Var) {
            qc.q.i(c0Var, "it");
            return Float.valueOf(z0.f.o(k1.s.h(c0Var)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v17, types: [pc.p] */
    /* JADX WARN: Type inference failed for: r5v21, types: [pc.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x0228 -> B:182:0x029d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x028e -> B:178:0x0293). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:194:0x02e4 -> B:182:0x029d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(k1.e r20, pc.l<? super k1.c0, java.lang.Boolean> r21, pc.a<java.lang.Boolean> r22, l1.c r23, u.o r24, kotlin.coroutines.Continuation<? super dc.l<k1.c0, z0.f>> r25) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.j.f(k1.e, pc.l, pc.a, l1.c, u.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object g(k1.e eVar, c0 c0Var, long j10, l1.c cVar, cd.s<? super u.g> sVar, boolean z10, o oVar, Continuation<? super Boolean> continuation) {
        long j11;
        qc.h hVar = null;
        sVar.p(new g.c(z0.f.s(c0Var.g(), z0.g.a(z0.f.o(j10) * Math.signum(z0.f.o(c0Var.g())), z0.f.p(j10) * Math.signum(z0.f.p(c0Var.g())))), hVar));
        if (z10) {
            j11 = z0.f.u(j10, -1.0f);
        } else {
            j11 = j10;
        }
        sVar.p(new g.b(j11, hVar));
        return j(eVar, oVar, c0Var.f(), new c(cVar, sVar, z10), continuation);
    }

    public static final androidx.compose.ui.e h(androidx.compose.ui.e eVar, l lVar, o oVar, boolean z10, v.m mVar, boolean z11, pc.q<? super k0, ? super z0.f, ? super Continuation<? super dc.w>, ? extends Object> qVar, pc.q<? super k0, ? super Float, ? super Continuation<? super dc.w>, ? extends Object> qVar2, boolean z12) {
        qc.q.i(eVar, "<this>");
        qc.q.i(lVar, "state");
        qc.q.i(oVar, "orientation");
        qc.q.i(qVar, "onDragStarted");
        qc.q.i(qVar2, "onDragStopped");
        return eVar.a(new DraggableElement(lVar, f.f23899f, oVar, z10, mVar, new g(z11), qVar, new h(qVar2, oVar, null), z12));
    }

    public static /* synthetic */ androidx.compose.ui.e i(androidx.compose.ui.e eVar, l lVar, o oVar, boolean z10, v.m mVar, boolean z11, pc.q qVar, pc.q qVar2, boolean z12, int i10, Object obj) {
        boolean z13;
        v.m mVar2;
        boolean z14;
        d dVar;
        e eVar2;
        boolean z15;
        if ((i10 & 4) != 0) {
            z13 = true;
        } else {
            z13 = z10;
        }
        if ((i10 & 8) != 0) {
            mVar2 = null;
        } else {
            mVar2 = mVar;
        }
        if ((i10 & 16) != 0) {
            z14 = false;
        } else {
            z14 = z11;
        }
        if ((i10 & 32) != 0) {
            dVar = new d(null);
        } else {
            dVar = qVar;
        }
        if ((i10 & 64) != 0) {
            eVar2 = new e(null);
        } else {
            eVar2 = qVar2;
        }
        if ((i10 & 128) != 0) {
            z15 = false;
        } else {
            z15 = z12;
        }
        return h(eVar, lVar, oVar, z13, mVar2, z14, dVar, eVar2, z15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0113, code lost:
    
        if ((!r0) != false) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0095 -> B:104:0x009a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(k1.e r17, u.o r18, long r19, pc.l<? super k1.c0, dc.w> r21, kotlin.coroutines.Continuation<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.j.j(k1.e, u.o, long, pc.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final float k(long j10, o oVar) {
        if (oVar == o.Vertical) {
            return z0.f.p(j10);
        }
        return z0.f.o(j10);
    }

    public static final float l(long j10, o oVar) {
        if (oVar == o.Vertical) {
            return j2.v.i(j10);
        }
        return j2.v.h(j10);
    }
}
