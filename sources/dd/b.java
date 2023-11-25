package dd;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
/* loaded from: classes4.dex */
public final class b<T> extends d<T> {

    /* renamed from: r  reason: collision with root package name */
    private final pc.p<cd.p<? super T>, Continuation<? super dc.w>, Object> f13278r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Builders.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {334}, m = "collectTo")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f13279f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f13280m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ b<T> f13281p;

        /* renamed from: q  reason: collision with root package name */
        int f13282q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b<T> bVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f13281p = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13280m = obj;
            this.f13282q |= RecyclerView.UNDEFINED_DURATION;
            return this.f13281p.i(null, this);
        }
    }

    public /* synthetic */ b(pc.p pVar, hc.f fVar, int i10, cd.a aVar, int i11, qc.h hVar) {
        this(pVar, (i11 & 2) != 0 ? hc.g.f16601f : fVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? cd.a.SUSPEND : aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // dd.d, ed.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(cd.p<? super T> r5, kotlin.coroutines.Continuation<? super dc.w> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof dd.b.a
            if (r0 == 0) goto L13
            r0 = r6
            dd.b$a r0 = (dd.b.a) r0
            int r1 = r0.f13282q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13282q = r1
            goto L18
        L13:
            dd.b$a r0 = new dd.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f13280m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f13282q
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f13279f
            cd.p r5 = (cd.p) r5
            dc.n.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r6)
            r0.f13279f = r5
            r0.f13282q = r3
            java.lang.Object r6 = super.i(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.s()
            if (r5 == 0) goto L4c
            dc.w r5 = dc.w.f13270a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.b.i(cd.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ed.d
    protected ed.d<T> j(hc.f fVar, int i10, cd.a aVar) {
        return new b(this.f13278r, fVar, i10, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(pc.p<? super cd.p<? super T>, ? super Continuation<? super dc.w>, ? extends Object> pVar, hc.f fVar, int i10, cd.a aVar) {
        super(pVar, fVar, i10, aVar);
        this.f13278r = pVar;
    }
}
