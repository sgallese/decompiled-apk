package dd;

import java.util.List;
import kotlin.coroutines.Continuation;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SharingStarted.kt */
/* loaded from: classes4.dex */
public final class k0 implements h0 {

    /* renamed from: b  reason: collision with root package name */
    private final long f13351b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13352c;

    /* compiled from: SharingStarted.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {178, 180, 182, 183, 185}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.q<h<? super f0>, Integer, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f13353f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f13354m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ int f13355p;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        public final Object a(h<? super f0> hVar, int i10, Continuation<? super dc.w> continuation) {
            a aVar = new a(continuation);
            aVar.f13354m = hVar;
            aVar.f13355p = i10;
            return aVar.invokeSuspend(dc.w.f13270a);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Object invoke(h<? super f0> hVar, Integer num, Continuation<? super dc.w> continuation) {
            return a(hVar, num.intValue(), continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r9.f13353f
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f13354m
                dd.h r1 = (dd.h) r1
                dc.n.b(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f13354m
                dd.h r1 = (dd.h) r1
                dc.n.b(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f13354m
                dd.h r1 = (dd.h) r1
                dc.n.b(r10)
                goto L64
            L38:
                dc.n.b(r10)
                goto L9c
            L3c:
                dc.n.b(r10)
                java.lang.Object r10 = r9.f13354m
                r1 = r10
                dd.h r1 = (dd.h) r1
                int r10 = r9.f13355p
                if (r10 <= 0) goto L53
                dd.f0 r10 = dd.f0.START
                r9.f13353f = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                dd.k0 r10 = dd.k0.this
                long r6 = dd.k0.c(r10)
                r9.f13354m = r1
                r9.f13353f = r5
                java.lang.Object r10 = ad.u0.a(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                dd.k0 r10 = dd.k0.this
                long r5 = dd.k0.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                dd.f0 r10 = dd.f0.STOP
                r9.f13354m = r1
                r9.f13353f = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                dd.k0 r10 = dd.k0.this
                long r4 = dd.k0.b(r10)
                r9.f13354m = r1
                r9.f13353f = r3
                java.lang.Object r10 = ad.u0.a(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                dd.f0 r10 = dd.f0.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f13354m = r3
                r9.f13353f = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                dc.w r10 = dc.w.f13270a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.k0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SharingStarted.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<f0, Continuation<? super Boolean>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f13357f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f13358m;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(f0 f0Var, Continuation<? super Boolean> continuation) {
            return ((b) create(f0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f13358m = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            ic.d.d();
            if (this.f13357f == 0) {
                dc.n.b(obj);
                if (((f0) this.f13358m) != f0.START) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public k0(long j10, long j11) {
        boolean z10;
        this.f13351b = j10;
        this.f13352c = j11;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (j11 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
    }

    @Override // dd.h0
    public g<f0> a(l0<Integer> l0Var) {
        return i.l(i.p(i.R(l0Var, new a(null)), new b(null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (this.f13351b == k0Var.f13351b && this.f13352c == k0Var.f13352c) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (r.x.a(this.f13351b) * 31) + r.x.a(this.f13352c);
    }

    public String toString() {
        List c10;
        List a10;
        String k02;
        c10 = ec.s.c(2);
        if (this.f13351b > 0) {
            c10.add("stopTimeout=" + this.f13351b + "ms");
        }
        if (this.f13352c < Long.MAX_VALUE) {
            c10.add("replayExpiration=" + this.f13352c + "ms");
        }
        a10 = ec.s.a(c10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SharingStarted.WhileSubscribed(");
        k02 = ec.b0.k0(a10, null, null, null, 0, null, null, 63, null);
        sb2.append(k02);
        sb2.append(')');
        return sb2.toString();
    }
}
