package y;

import ec.n0;
import java.util.HashMap;
import java.util.Map;
import y.c;
import y.l;

/* compiled from: LazyLayoutKeyIndexMap.kt */
/* loaded from: classes.dex */
public final class h0 implements r {

    /* renamed from: b  reason: collision with root package name */
    private final Map<Object, Integer> f26095b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f26096c;

    /* renamed from: d  reason: collision with root package name */
    private final int f26097d;

    /* compiled from: LazyLayoutKeyIndexMap.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<c.a<? extends l.a>, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f26098f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f26099m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ HashMap<Object, Integer> f26100p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ h0 f26101q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, int i11, HashMap<Object, Integer> hashMap, h0 h0Var) {
            super(1);
            this.f26098f = i10;
            this.f26099m = i11;
            this.f26100p = hashMap;
            this.f26101q = h0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x003c, code lost:
        
            if (r3 == null) goto L7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(y.c.a<? extends y.l.a> r7) {
            /*
                r6 = this;
                java.lang.String r0 = "it"
                qc.q.i(r7, r0)
                java.lang.Object r0 = r7.c()
                y.l$a r0 = (y.l.a) r0
                pc.l r0 = r0.getKey()
                int r1 = r6.f26098f
                int r2 = r7.b()
                int r1 = java.lang.Math.max(r1, r2)
                int r2 = r6.f26099m
                int r3 = r7.b()
                int r4 = r7.a()
                int r3 = r3 + r4
                int r3 = r3 + (-1)
                int r2 = java.lang.Math.min(r2, r3)
                if (r1 > r2) goto L60
            L2c:
                if (r0 == 0) goto L3e
                int r3 = r7.b()
                int r3 = r1 - r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r3 = r0.invoke(r3)
                if (r3 != 0) goto L42
            L3e:
                java.lang.Object r3 = androidx.compose.foundation.lazy.layout.a.a(r1)
            L42:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
                java.util.HashMap<java.lang.Object, java.lang.Integer> r5 = r6.f26100p
                r5.put(r3, r4)
                y.h0 r4 = r6.f26101q
                java.lang.Object[] r4 = y.h0.c(r4)
                y.h0 r5 = r6.f26101q
                int r5 = y.h0.d(r5)
                int r5 = r1 - r5
                r4[r5] = r3
                if (r1 == r2) goto L60
                int r1 = r1 + 1
                goto L2c
            L60:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y.h0.a.a(y.c$a):void");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c.a<? extends l.a> aVar) {
            a(aVar);
            return dc.w.f13270a;
        }
    }

    public h0(vc.f fVar, l<?> lVar) {
        boolean z10;
        Map<Object, Integer> h10;
        qc.q.i(fVar, "nearestRange");
        qc.q.i(lVar, "intervalContent");
        c<?> d10 = lVar.d();
        int h11 = fVar.h();
        if (h11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int min = Math.min(fVar.i(), d10.getSize() - 1);
            if (min < h11) {
                h10 = n0.h();
                this.f26095b = h10;
                this.f26096c = new Object[0];
                this.f26097d = 0;
                return;
            }
            this.f26096c = new Object[(min - h11) + 1];
            this.f26097d = h11;
            HashMap hashMap = new HashMap();
            d10.a(h11, min, new a(h11, min, hashMap, this));
            this.f26095b = hashMap;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // y.r
    public Object a(int i10) {
        int P;
        Object[] objArr = this.f26096c;
        int i11 = i10 - this.f26097d;
        if (i11 >= 0) {
            P = ec.p.P(objArr);
            if (i11 <= P) {
                return objArr[i11];
            }
        }
        return null;
    }

    @Override // y.r
    public int b(Object obj) {
        qc.q.i(obj, "key");
        Integer num = this.f26095b.get(obj);
        if (num == null) {
            num = -1;
        }
        return num.intValue();
    }
}
