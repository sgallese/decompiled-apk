package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* compiled from: FlowExt.kt */
/* loaded from: classes.dex */
public final class n2<T1, T2> {

    /* renamed from: a  reason: collision with root package name */
    private final pc.r<T1, T2, i, Continuation<? super dc.w>, Object> f5937a;

    /* renamed from: b  reason: collision with root package name */
    private final ad.v<dc.w> f5938b;

    /* renamed from: c  reason: collision with root package name */
    private final jd.a f5939c;

    /* renamed from: d  reason: collision with root package name */
    private final ad.v<dc.w>[] f5940d;

    /* renamed from: e  reason: collision with root package name */
    private final Object[] f5941e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.UnbatchedFlowCombiner", f = "FlowExt.kt", l = {191, 230, 208}, m = "onNext")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f5942f;

        /* renamed from: m  reason: collision with root package name */
        Object f5943m;

        /* renamed from: p  reason: collision with root package name */
        Object f5944p;

        /* renamed from: q  reason: collision with root package name */
        int f5945q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f5946r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ n2<T1, T2> f5947s;

        /* renamed from: t  reason: collision with root package name */
        int f5948t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n2<T1, T2> n2Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f5947s = n2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5946r = obj;
            this.f5948t |= RecyclerView.UNDEFINED_DURATION;
            return this.f5947s.a(0, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n2(pc.r<? super T1, ? super T2, ? super i, ? super Continuation<? super dc.w>, ? extends Object> rVar) {
        qc.q.i(rVar, "send");
        this.f5937a = rVar;
        this.f5938b = ad.x.b(null, 1, null);
        this.f5939c = jd.c.b(false, 1, null);
        ad.v<dc.w>[] vVarArr = new ad.v[2];
        for (int i10 = 0; i10 < 2; i10++) {
            vVarArr[i10] = ad.x.b(null, 1, null);
        }
        this.f5940d = vVarArr;
        Object[] objArr = new Object[2];
        for (int i11 = 0; i11 < 2; i11++) {
            objArr[i11] = x.f6145a;
        }
        this.f5941e = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2 A[Catch: all -> 0x0117, TryCatch #1 {all -> 0x0117, blocks: (B:34:0x00ab, B:36:0x00b2, B:44:0x00c5, B:46:0x00cd, B:56:0x00e4, B:60:0x00ee, B:58:0x00e9, B:59:0x00ec, B:52:0x00dc, B:42:0x00c1), top: B:75:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd A[Catch: all -> 0x0117, TryCatch #1 {all -> 0x0117, blocks: (B:34:0x00ab, B:36:0x00b2, B:44:0x00c5, B:46:0x00cd, B:56:0x00e4, B:60:0x00ee, B:58:0x00e9, B:59:0x00ec, B:52:0x00dc, B:42:0x00c1), top: B:75:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r17, java.lang.Object r18, kotlin.coroutines.Continuation<? super dc.w> r19) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.n2.a(int, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
