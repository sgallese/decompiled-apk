package androidx.compose.foundation.relocation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BringIntoViewRequester.kt */
/* loaded from: classes.dex */
public final class b implements z.d {

    /* renamed from: a  reason: collision with root package name */
    private final k0.f<d> f2196a = new k0.f<>(new d[16], 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BringIntoViewRequester.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {110}, m = "bringIntoView")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f2197f;

        /* renamed from: m  reason: collision with root package name */
        Object f2198m;

        /* renamed from: p  reason: collision with root package name */
        int f2199p;

        /* renamed from: q  reason: collision with root package name */
        int f2200q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f2201r;

        /* renamed from: t  reason: collision with root package name */
        int f2203t;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2201r = obj;
            this.f2203t |= RecyclerView.UNDEFINED_DURATION;
            return b.this.a(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r7 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:20:0x0066). Please submit an issue!!! */
    @Override // z.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(z0.h r7, kotlin.coroutines.Continuation<? super dc.w> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.relocation.b.a
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.relocation.b$a r0 = (androidx.compose.foundation.relocation.b.a) r0
            int r1 = r0.f2203t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2203t = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.b$a r0 = new androidx.compose.foundation.relocation.b$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2201r
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f2203t
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r7 = r0.f2200q
            int r2 = r0.f2199p
            java.lang.Object r4 = r0.f2198m
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f2197f
            z0.h r5 = (z0.h) r5
            dc.n.b(r8)
            r8 = r5
            goto L66
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            dc.n.b(r8)
            k0.f<androidx.compose.foundation.relocation.d> r8 = r6.f2196a
            int r2 = r8.o()
            if (r2 <= 0) goto L69
            java.lang.Object[] r8 = r8.n()
            r4 = 0
            r4 = r8
            r8 = r7
            r7 = 0
        L51:
            r5 = r4[r7]
            androidx.compose.foundation.relocation.d r5 = (androidx.compose.foundation.relocation.d) r5
            r0.f2197f = r8
            r0.f2198m = r4
            r0.f2199p = r2
            r0.f2200q = r7
            r0.f2203t = r3
            java.lang.Object r5 = r5.L1(r8, r0)
            if (r5 != r1) goto L66
            return r1
        L66:
            int r7 = r7 + r3
            if (r7 < r2) goto L51
        L69:
            dc.w r7 = dc.w.f13270a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.b.a(z0.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final k0.f<d> b() {
        return this.f2196a;
    }
}
