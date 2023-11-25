package y;

import androidx.recyclerview.widget.RecyclerView;
import dc.m;
import kotlin.coroutines.Continuation;
import n1.q0;

/* compiled from: AwaitFirstLayoutModifier.kt */
/* loaded from: classes.dex */
public final class a implements q0 {

    /* renamed from: c  reason: collision with root package name */
    private boolean f25993c;

    /* renamed from: d  reason: collision with root package name */
    private Continuation<? super dc.w> f25994d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AwaitFirstLayoutModifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", l = {35}, m = "waitForFirstLayout")
    /* renamed from: y.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0595a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f25995f;

        /* renamed from: m  reason: collision with root package name */
        Object f25996m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f25997p;

        /* renamed from: r  reason: collision with root package name */
        int f25999r;

        C0595a(Continuation<? super C0595a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25997p = obj;
            this.f25999r |= RecyclerView.UNDEFINED_DURATION;
            return a.this.e(this);
        }
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return v0.d.a(this, eVar);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ Object b(Object obj, pc.p pVar) {
        return v0.e.b(this, obj, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation<? super dc.w> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof y.a.C0595a
            if (r0 == 0) goto L13
            r0 = r5
            y.a$a r0 = (y.a.C0595a) r0
            int r1 = r0.f25999r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25999r = r1
            goto L18
        L13:
            y.a$a r0 = new y.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f25997p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f25999r
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f25996m
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r0 = r0.f25995f
            y.a r0 = (y.a) r0
            dc.n.b(r5)
            goto L64
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            dc.n.b(r5)
            boolean r5 = r4.f25993c
            if (r5 != 0) goto L71
            kotlin.coroutines.Continuation<? super dc.w> r5 = r4.f25994d
            r0.f25995f = r4
            r0.f25996m = r5
            r0.f25999r = r3
            hc.h r2 = new hc.h
            kotlin.coroutines.Continuation r3 = ic.b.c(r0)
            r2.<init>(r3)
            r4.f25994d = r2
            java.lang.Object r2 = r2.a()
            java.lang.Object r3 = ic.b.d()
            if (r2 != r3) goto L60
            kotlin.coroutines.jvm.internal.h.c(r0)
        L60:
            if (r2 != r1) goto L63
            return r1
        L63:
            r1 = r5
        L64:
            if (r1 == 0) goto L71
            dc.m$a r5 = dc.m.f13253f
            dc.w r5 = dc.w.f13270a
            java.lang.Object r5 = dc.m.a(r5)
            r1.resumeWith(r5)
        L71:
            dc.w r5 = dc.w.f13270a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y.a.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ boolean h(pc.l lVar) {
        return v0.e.a(this, lVar);
    }

    @Override // n1.q0
    public void w(n1.s sVar) {
        qc.q.i(sVar, "coordinates");
        if (!this.f25993c) {
            this.f25993c = true;
            Continuation<? super dc.w> continuation = this.f25994d;
            if (continuation != null) {
                m.a aVar = dc.m.f13253f;
                continuation.resumeWith(dc.m.a(dc.w.f13270a));
            }
            this.f25994d = null;
        }
    }
}
