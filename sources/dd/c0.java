package dd;

import ad.c1;
import androidx.recyclerview.widget.RecyclerView;
import dc.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: SharedFlow.kt */
/* loaded from: classes4.dex */
public class c0<T> extends ed.a<e0> implements w<T>, g, ed.o<T> {

    /* renamed from: r  reason: collision with root package name */
    private final int f13286r;

    /* renamed from: s  reason: collision with root package name */
    private final int f13287s;

    /* renamed from: t  reason: collision with root package name */
    private final cd.a f13288t;

    /* renamed from: u  reason: collision with root package name */
    private Object[] f13289u;

    /* renamed from: v  reason: collision with root package name */
    private long f13290v;

    /* renamed from: w  reason: collision with root package name */
    private long f13291w;

    /* renamed from: x  reason: collision with root package name */
    private int f13292x;

    /* renamed from: y  reason: collision with root package name */
    private int f13293y;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SharedFlow.kt */
    /* loaded from: classes4.dex */
    public static final class a implements c1 {

        /* renamed from: f  reason: collision with root package name */
        public final c0<?> f13294f;

        /* renamed from: m  reason: collision with root package name */
        public long f13295m;

        /* renamed from: p  reason: collision with root package name */
        public final Object f13296p;

        /* renamed from: q  reason: collision with root package name */
        public final Continuation<dc.w> f13297q;

        /* JADX WARN: Multi-variable type inference failed */
        public a(c0<?> c0Var, long j10, Object obj, Continuation<? super dc.w> continuation) {
            this.f13294f = c0Var;
            this.f13295m = j10;
            this.f13296p = obj;
            this.f13297q = continuation;
        }

        @Override // ad.c1
        public void dispose() {
            this.f13294f.z(this);
        }
    }

    /* compiled from: SharedFlow.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13298a;

        static {
            int[] iArr = new int[cd.a.values().length];
            try {
                iArr[cd.a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cd.a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cd.a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13298a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {372, 379, 382}, m = "collect$suspendImpl")
    /* loaded from: classes4.dex */
    public static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f13299f;

        /* renamed from: m  reason: collision with root package name */
        Object f13300m;

        /* renamed from: p  reason: collision with root package name */
        Object f13301p;

        /* renamed from: q  reason: collision with root package name */
        Object f13302q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f13303r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ c0<T> f13304s;

        /* renamed from: t  reason: collision with root package name */
        int f13305t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c0<T> c0Var, Continuation<? super c> continuation) {
            super(continuation);
            this.f13304s = c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13303r = obj;
            this.f13305t |= RecyclerView.UNDEFINED_DURATION;
            return c0.B(this.f13304s, null, this);
        }
    }

    public c0(int i10, int i11, cd.a aVar) {
        this.f13286r = i10;
        this.f13287s = i11;
        this.f13288t = aVar;
    }

    private final void A() {
        Object f10;
        if (this.f13287s == 0 && this.f13293y <= 1) {
            return;
        }
        Object[] objArr = this.f13289u;
        qc.q.f(objArr);
        while (this.f13293y > 0) {
            f10 = d0.f(objArr, (L() + Q()) - 1);
            if (f10 == d0.f13307a) {
                this.f13293y--;
                d0.g(objArr, L() + Q(), null);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <T> java.lang.Object B(dd.c0<T> r8, dd.h<? super T> r9, kotlin.coroutines.Continuation<?> r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.c0.B(dd.c0, dd.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void C(long j10) {
        ed.c[] h10;
        if (ed.a.f(this) != 0 && (h10 = ed.a.h(this)) != null) {
            for (ed.c cVar : h10) {
                if (cVar != null) {
                    e0 e0Var = (e0) cVar;
                    long j11 = e0Var.f13317a;
                    if (j11 >= 0 && j11 < j10) {
                        e0Var.f13317a = j10;
                    }
                }
            }
        }
        this.f13291w = j10;
    }

    private final void F() {
        Object[] objArr = this.f13289u;
        qc.q.f(objArr);
        d0.g(objArr, L(), null);
        this.f13292x--;
        long L = L() + 1;
        if (this.f13290v < L) {
            this.f13290v = L;
        }
        if (this.f13291w < L) {
            C(L);
        }
    }

    static /* synthetic */ <T> Object G(c0<T> c0Var, T t10, Continuation<? super dc.w> continuation) {
        Object d10;
        if (c0Var.e(t10)) {
            return dc.w.f13270a;
        }
        Object H = c0Var.H(t10, continuation);
        d10 = ic.d.d();
        if (H == d10) {
            return H;
        }
        return dc.w.f13270a;
    }

    private final Object H(T t10, Continuation<? super dc.w> continuation) {
        Continuation c10;
        Continuation<dc.w>[] continuationArr;
        a aVar;
        Object d10;
        Object d11;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        Continuation<dc.w>[] continuationArr2 = ed.b.f14212a;
        synchronized (this) {
            if (S(t10)) {
                m.a aVar2 = dc.m.f13253f;
                nVar.resumeWith(dc.m.a(dc.w.f13270a));
                continuationArr = J(continuationArr2);
                aVar = null;
            } else {
                a aVar3 = new a(this, Q() + L(), t10, nVar);
                I(aVar3);
                this.f13293y++;
                if (this.f13287s == 0) {
                    continuationArr2 = J(continuationArr2);
                }
                continuationArr = continuationArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            ad.p.a(nVar, aVar);
        }
        for (Continuation<dc.w> continuation2 : continuationArr) {
            if (continuation2 != null) {
                m.a aVar4 = dc.m.f13253f;
                continuation2.resumeWith(dc.m.a(dc.w.f13270a));
            }
        }
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        d11 = ic.d.d();
        if (x10 == d11) {
            return x10;
        }
        return dc.w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(Object obj) {
        int Q = Q();
        Object[] objArr = this.f13289u;
        if (objArr == null) {
            objArr = R(null, 0, 2);
        } else if (Q >= objArr.length) {
            objArr = R(objArr, Q, objArr.length * 2);
        }
        d0.g(objArr, L() + Q, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    public final Continuation<dc.w>[] J(Continuation<dc.w>[] continuationArr) {
        ed.c[] h10;
        e0 e0Var;
        Continuation<? super dc.w> continuation;
        int length = continuationArr.length;
        if (ed.a.f(this) != 0 && (h10 = ed.a.h(this)) != null) {
            int length2 = h10.length;
            int i10 = 0;
            continuationArr = continuationArr;
            while (i10 < length2) {
                ed.c cVar = h10[i10];
                if (cVar != null && (continuation = (e0Var = (e0) cVar).f13318b) != null && U(e0Var) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        qc.q.h(copyOf, "copyOf(this, newSize)");
                        continuationArr = copyOf;
                    }
                    continuationArr[length] = continuation;
                    e0Var.f13318b = null;
                    length++;
                }
                i10++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    private final long K() {
        return L() + this.f13292x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long L() {
        return Math.min(this.f13291w, this.f13290v);
    }

    private final Object N(long j10) {
        Object f10;
        Object[] objArr = this.f13289u;
        qc.q.f(objArr);
        f10 = d0.f(objArr, j10);
        if (f10 instanceof a) {
            return ((a) f10).f13296p;
        }
        return f10;
    }

    private final long O() {
        return L() + this.f13292x + this.f13293y;
    }

    private final int P() {
        return (int) ((L() + this.f13292x) - this.f13290v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q() {
        return this.f13292x + this.f13293y;
    }

    private final Object[] R(Object[] objArr, int i10, int i11) {
        boolean z10;
        Object f10;
        if (i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Object[] objArr2 = new Object[i11];
            this.f13289u = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long L = L();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = i12 + L;
                f10 = d0.f(objArr, j10);
                d0.g(objArr2, j10, f10);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean S(T t10) {
        if (m() == 0) {
            return T(t10);
        }
        if (this.f13292x >= this.f13287s && this.f13291w <= this.f13290v) {
            int i10 = b.f13298a[this.f13288t.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        I(t10);
        int i11 = this.f13292x + 1;
        this.f13292x = i11;
        if (i11 > this.f13287s) {
            F();
        }
        if (P() > this.f13286r) {
            W(this.f13290v + 1, this.f13291w, K(), O());
        }
        return true;
    }

    private final boolean T(T t10) {
        if (this.f13286r == 0) {
            return true;
        }
        I(t10);
        int i10 = this.f13292x + 1;
        this.f13292x = i10;
        if (i10 > this.f13286r) {
            F();
        }
        this.f13291w = L() + this.f13292x;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long U(e0 e0Var) {
        long j10 = e0Var.f13317a;
        if (j10 < K()) {
            return j10;
        }
        if (this.f13287s > 0 || j10 > L() || this.f13293y == 0) {
            return -1L;
        }
        return j10;
    }

    private final Object V(e0 e0Var) {
        Object obj;
        Continuation<dc.w>[] continuationArr = ed.b.f14212a;
        synchronized (this) {
            long U = U(e0Var);
            if (U < 0) {
                obj = d0.f13307a;
            } else {
                long j10 = e0Var.f13317a;
                Object N = N(U);
                e0Var.f13317a = U + 1;
                continuationArr = X(j10);
                obj = N;
            }
        }
        for (Continuation<dc.w> continuation : continuationArr) {
            if (continuation != null) {
                m.a aVar = dc.m.f13253f;
                continuation.resumeWith(dc.m.a(dc.w.f13270a));
            }
        }
        return obj;
    }

    private final void W(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        for (long L = L(); L < min; L++) {
            Object[] objArr = this.f13289u;
            qc.q.f(objArr);
            d0.g(objArr, L, null);
        }
        this.f13290v = j10;
        this.f13291w = j11;
        this.f13292x = (int) (j12 - min);
        this.f13293y = (int) (j13 - j12);
    }

    private final Object y(e0 e0Var, Continuation<? super dc.w> continuation) {
        Continuation c10;
        Object d10;
        Object d11;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        synchronized (this) {
            if (U(e0Var) < 0) {
                e0Var.f13318b = nVar;
            } else {
                m.a aVar = dc.m.f13253f;
                nVar.resumeWith(dc.m.a(dc.w.f13270a));
            }
            dc.w wVar = dc.w.f13270a;
        }
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        d11 = ic.d.d();
        if (x10 == d11) {
            return x10;
        }
        return dc.w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(a aVar) {
        Object f10;
        synchronized (this) {
            if (aVar.f13295m < L()) {
                return;
            }
            Object[] objArr = this.f13289u;
            qc.q.f(objArr);
            f10 = d0.f(objArr, aVar.f13295m);
            if (f10 == aVar) {
                d0.g(objArr, aVar.f13295m, d0.f13307a);
                A();
                dc.w wVar = dc.w.f13270a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ed.a
    /* renamed from: D  reason: merged with bridge method [inline-methods] */
    public e0 j() {
        return new e0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ed.a
    /* renamed from: E  reason: merged with bridge method [inline-methods] */
    public e0[] k(int i10) {
        return new e0[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T M() {
        Object f10;
        Object[] objArr = this.f13289u;
        qc.q.f(objArr);
        f10 = d0.f(objArr, (this.f13290v + P()) - 1);
        return (T) f10;
    }

    public final Continuation<dc.w>[] X(long j10) {
        int i10;
        long j11;
        long j12;
        long j13;
        boolean z10;
        Object f10;
        Object f11;
        long j14;
        ed.c[] h10;
        if (j10 > this.f13291w) {
            return ed.b.f14212a;
        }
        long L = L();
        long j15 = this.f13292x + L;
        if (this.f13287s == 0 && this.f13293y > 0) {
            j15++;
        }
        if (ed.a.f(this) != 0 && (h10 = ed.a.h(this)) != null) {
            for (ed.c cVar : h10) {
                if (cVar != null) {
                    long j16 = ((e0) cVar).f13317a;
                    if (j16 >= 0 && j16 < j15) {
                        j15 = j16;
                    }
                }
            }
        }
        if (j15 <= this.f13291w) {
            return ed.b.f14212a;
        }
        long K = K();
        if (m() > 0) {
            i10 = Math.min(this.f13293y, this.f13287s - ((int) (K - j15)));
        } else {
            i10 = this.f13293y;
        }
        Continuation<dc.w>[] continuationArr = ed.b.f14212a;
        long j17 = this.f13293y + K;
        if (i10 > 0) {
            continuationArr = new Continuation[i10];
            Object[] objArr = this.f13289u;
            qc.q.f(objArr);
            long j18 = K;
            int i11 = 0;
            while (true) {
                if (K < j17) {
                    f11 = d0.f(objArr, K);
                    j11 = j15;
                    fd.g0 g0Var = d0.f13307a;
                    if (f11 != g0Var) {
                        qc.q.g(f11, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        a aVar = (a) f11;
                        int i12 = i11 + 1;
                        j12 = j17;
                        continuationArr[i11] = aVar.f13297q;
                        d0.g(objArr, K, g0Var);
                        d0.g(objArr, j18, aVar.f13296p);
                        j14 = 1;
                        j18++;
                        if (i12 >= i10) {
                            break;
                        }
                        i11 = i12;
                    } else {
                        j12 = j17;
                        j14 = 1;
                    }
                    K += j14;
                    j15 = j11;
                    j17 = j12;
                } else {
                    j11 = j15;
                    j12 = j17;
                    break;
                }
            }
            K = j18;
        } else {
            j11 = j15;
            j12 = j17;
        }
        int i13 = (int) (K - L);
        if (m() == 0) {
            j13 = K;
        } else {
            j13 = j11;
        }
        long max = Math.max(this.f13290v, K - Math.min(this.f13286r, i13));
        if (this.f13287s == 0 && max < j12) {
            Object[] objArr2 = this.f13289u;
            qc.q.f(objArr2);
            f10 = d0.f(objArr2, max);
            if (qc.q.d(f10, d0.f13307a)) {
                K++;
                max++;
            }
        }
        W(max, j13, K, j12);
        A();
        if (continuationArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10) != false) {
            return J(continuationArr);
        }
        return continuationArr;
    }

    public final long Y() {
        long j10 = this.f13290v;
        if (j10 < this.f13291w) {
            this.f13291w = j10;
        }
        return j10;
    }

    @Override // dd.b0
    public List<T> a() {
        Object f10;
        List<T> i10;
        synchronized (this) {
            int P = P();
            if (P == 0) {
                i10 = ec.t.i();
                return i10;
            }
            ArrayList arrayList = new ArrayList(P);
            Object[] objArr = this.f13289u;
            qc.q.f(objArr);
            for (int i11 = 0; i11 < P; i11++) {
                f10 = d0.f(objArr, this.f13290v + i11);
                arrayList.add(f10);
            }
            return arrayList;
        }
    }

    @Override // dd.w
    public void c() {
        synchronized (this) {
            W(K(), this.f13291w, K(), O());
            dc.w wVar = dc.w.f13270a;
        }
    }

    @Override // dd.b0, dd.g
    public Object collect(h<? super T> hVar, Continuation<?> continuation) {
        return B(this, hVar, continuation);
    }

    @Override // ed.o
    public g<T> d(hc.f fVar, int i10, cd.a aVar) {
        return d0.e(this, fVar, i10, aVar);
    }

    @Override // dd.w
    public boolean e(T t10) {
        int i10;
        boolean z10;
        Continuation<dc.w>[] continuationArr = ed.b.f14212a;
        synchronized (this) {
            if (S(t10)) {
                continuationArr = J(continuationArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (Continuation<dc.w> continuation : continuationArr) {
            if (continuation != null) {
                m.a aVar = dc.m.f13253f;
                continuation.resumeWith(dc.m.a(dc.w.f13270a));
            }
        }
        return z10;
    }

    @Override // dd.w, dd.h
    public Object emit(T t10, Continuation<? super dc.w> continuation) {
        return G(this, t10, continuation);
    }
}
