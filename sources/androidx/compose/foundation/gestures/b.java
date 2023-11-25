package androidx.compose.foundation.gestures;

import dc.n;
import dc.w;
import j0.g3;
import k1.l0;
import k1.r;
import k1.t;
import k1.u0;
import k1.v0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import p1.l;
import p1.n1;
import p1.o1;
import pc.p;
import qc.q;
import u.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
/* loaded from: classes.dex */
public final class b extends l implements o1 {
    private g3<e> C;
    private s D;
    private final v0 E;

    /* compiled from: Scrollable.kt */
    @f(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1", f = "Scrollable.kt", l = {336}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<l0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f1911f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f1912m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Scrollable.kt */
        @f(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1$1", f = "Scrollable.kt", l = {338}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0020a extends k implements p<k1.e, Continuation<? super w>, Object> {

            /* renamed from: m  reason: collision with root package name */
            int f1914m;

            /* renamed from: p  reason: collision with root package name */
            private /* synthetic */ Object f1915p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ b f1916q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0020a(b bVar, Continuation<? super C0020a> continuation) {
                super(2, continuation);
                this.f1916q = bVar;
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object invoke(k1.e eVar, Continuation<? super w> continuation) {
                return ((C0020a) create(eVar, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                C0020a c0020a = new C0020a(this.f1916q, continuation);
                c0020a.f1915p = obj;
                return c0020a;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:13:0x0037). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = ic.b.d()
                    int r1 = r10.f1914m
                    r2 = 1
                    if (r1 == 0) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r1 = r10.f1915p
                    k1.e r1 = (k1.e) r1
                    dc.n.b(r11)
                    r3 = r1
                    r1 = r0
                    r0 = r10
                    goto L37
                L16:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1e:
                    dc.n.b(r11)
                    java.lang.Object r11 = r10.f1915p
                    k1.e r11 = (k1.e) r11
                    r1 = r11
                    r11 = r10
                L27:
                    r11.f1915p = r1
                    r11.f1914m = r2
                    java.lang.Object r3 = androidx.compose.foundation.gestures.d.a(r1, r11)
                    if (r3 != r0) goto L32
                    return r0
                L32:
                    r9 = r0
                    r0 = r11
                    r11 = r3
                    r3 = r1
                    r1 = r9
                L37:
                    k1.r r11 = (k1.r) r11
                    java.util.List r4 = r11.c()
                    int r5 = r4.size()
                    r6 = 0
                    r7 = 0
                L43:
                    if (r7 >= r5) goto L57
                    java.lang.Object r8 = r4.get(r7)
                    k1.c0 r8 = (k1.c0) r8
                    boolean r8 = r8.o()
                    r8 = r8 ^ r2
                    if (r8 != 0) goto L54
                    r4 = 0
                    goto L58
                L54:
                    int r7 = r7 + 1
                    goto L43
                L57:
                    r4 = 1
                L58:
                    if (r4 == 0) goto La4
                    androidx.compose.foundation.gestures.b r4 = r0.f1916q
                    u.s r4 = r4.N1()
                    androidx.compose.foundation.gestures.b r5 = r0.f1916q
                    long r7 = r3.a()
                    long r7 = r4.a(r3, r11, r7)
                    j0.g3 r4 = r5.O1()
                    java.lang.Object r4 = r4.getValue()
                    androidx.compose.foundation.gestures.e r4 = (androidx.compose.foundation.gestures.e) r4
                    float r5 = r4.p(r7)
                    float r5 = r4.j(r5)
                    u.x r4 = r4.e()
                    float r4 = r4.e(r5)
                    r5 = 0
                    int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                    if (r4 != 0) goto L8b
                    r4 = 1
                    goto L8c
                L8b:
                    r4 = 0
                L8c:
                    if (r4 != 0) goto La4
                    java.util.List r11 = r11.c()
                    int r4 = r11.size()
                L96:
                    if (r6 >= r4) goto La4
                    java.lang.Object r5 = r11.get(r6)
                    k1.c0 r5 = (k1.c0) r5
                    r5.a()
                    int r6 = r6 + 1
                    goto L96
                La4:
                    r11 = r0
                    r0 = r1
                    r1 = r3
                    goto L27
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.a.C0020a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(l0 l0Var, Continuation<? super w> continuation) {
            return ((a) create(l0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.f1912m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f1911f;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                l0 l0Var = (l0) this.f1912m;
                C0020a c0020a = new C0020a(b.this, null);
                this.f1911f = 1;
                if (l0Var.V0(c0020a, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    public b(g3<e> g3Var, s sVar) {
        q.i(g3Var, "scrollingLogicState");
        q.i(sVar, "mouseWheelScrollConfig");
        this.C = g3Var;
        this.D = sVar;
        this.E = (v0) I1(u0.a(new a(null)));
    }

    public final s N1() {
        return this.D;
    }

    @Override // p1.o1
    public void O(r rVar, t tVar, long j10) {
        q.i(rVar, "pointerEvent");
        q.i(tVar, "pass");
        this.E.O(rVar, tVar, j10);
    }

    public final g3<e> O1() {
        return this.C;
    }

    public final void P1(s sVar) {
        q.i(sVar, "<set-?>");
        this.D = sVar;
    }

    @Override // p1.o1
    public /* synthetic */ boolean Q0() {
        return n1.d(this);
    }

    public final void Q1(g3<e> g3Var) {
        q.i(g3Var, "<set-?>");
        this.C = g3Var;
    }

    @Override // p1.o1
    public /* synthetic */ void U0() {
        n1.c(this);
    }

    @Override // p1.o1
    public void a0() {
        this.E.a0();
    }

    @Override // p1.o1
    public /* synthetic */ boolean g0() {
        return n1.a(this);
    }

    @Override // p1.o1
    public /* synthetic */ void m0() {
        n1.b(this);
    }
}
