package x4;

import androidx.recyclerview.widget.RecyclerView;
import b5.h;
import b5.j;
import c5.i;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import q4.d;
import x4.b;

/* compiled from: RealInterceptorChain.kt */
/* loaded from: classes.dex */
public final class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f25796a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f25797b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25798c;

    /* renamed from: d  reason: collision with root package name */
    private final h f25799d;

    /* renamed from: e  reason: collision with root package name */
    private final i f25800e;

    /* renamed from: f  reason: collision with root package name */
    private final d f25801f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f25802g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealInterceptorChain.kt */
    @f(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {25}, m = "proceed")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f25803f;

        /* renamed from: m  reason: collision with root package name */
        Object f25804m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f25805p;

        /* renamed from: r  reason: collision with root package name */
        int f25807r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25805p = obj;
            this.f25807r |= RecyclerView.UNDEFINED_DURATION;
            return c.this.g(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(h hVar, List<? extends b> list, int i10, h hVar2, i iVar, d dVar, boolean z10) {
        this.f25796a = hVar;
        this.f25797b = list;
        this.f25798c = i10;
        this.f25799d = hVar2;
        this.f25800e = iVar;
        this.f25801f = dVar;
        this.f25802g = z10;
    }

    private final void b(h hVar, b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        if (hVar.l() == this.f25796a.l()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (hVar.m() != j.f8012a) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (hVar.M() == this.f25796a.M()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (hVar.z() == this.f25796a.z()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        if (hVar.K() != this.f25796a.K()) {
                            z14 = false;
                        }
                        if (z14) {
                            return;
                        }
                        throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                    }
                    throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's context.").toString());
    }

    private final c c(int i10, h hVar, i iVar) {
        return new c(this.f25796a, this.f25797b, i10, hVar, iVar, this.f25801f, this.f25802g);
    }

    static /* synthetic */ c d(c cVar, int i10, h hVar, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = cVar.f25798c;
        }
        if ((i11 & 2) != 0) {
            hVar = cVar.a();
        }
        if ((i11 & 4) != 0) {
            iVar = cVar.getSize();
        }
        return cVar.c(i10, hVar, iVar);
    }

    @Override // x4.b.a
    public h a() {
        return this.f25799d;
    }

    public final d e() {
        return this.f25801f;
    }

    public final boolean f() {
        return this.f25802g;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(b5.h r12, kotlin.coroutines.Continuation<? super b5.i> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof x4.c.a
            if (r0 == 0) goto L13
            r0 = r13
            x4.c$a r0 = (x4.c.a) r0
            int r1 = r0.f25807r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25807r = r1
            goto L18
        L13:
            x4.c$a r0 = new x4.c$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f25805p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f25807r
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r12 = r0.f25804m
            x4.b r12 = (x4.b) r12
            java.lang.Object r0 = r0.f25803f
            x4.c r0 = (x4.c) r0
            dc.n.b(r13)
            goto L74
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            dc.n.b(r13)
            int r13 = r11.f25798c
            if (r13 <= 0) goto L4c
            java.util.List<x4.b> r2 = r11.f25797b
            int r13 = r13 - r3
            java.lang.Object r13 = r2.get(r13)
            x4.b r13 = (x4.b) r13
            r11.b(r12, r13)
        L4c:
            java.util.List<x4.b> r13 = r11.f25797b
            int r2 = r11.f25798c
            java.lang.Object r13 = r13.get(r2)
            x4.b r13 = (x4.b) r13
            int r2 = r11.f25798c
            int r5 = r2 + 1
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r11
            r6 = r12
            x4.c r12 = d(r4, r5, r6, r7, r8, r9)
            r0.f25803f = r11
            r0.f25804m = r13
            r0.f25807r = r3
            java.lang.Object r12 = r13.a(r12, r0)
            if (r12 != r1) goto L70
            return r1
        L70:
            r0 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L74:
            b5.i r13 = (b5.i) r13
            b5.h r1 = r13.b()
            r0.b(r1, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.c.g(b5.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // x4.b.a
    public i getSize() {
        return this.f25800e;
    }
}
