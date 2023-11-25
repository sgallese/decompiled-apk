package dd;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* compiled from: Share.kt */
/* loaded from: classes4.dex */
public final class p0<T> implements h<T> {

    /* renamed from: f  reason: collision with root package name */
    private final h<T> f13419f;

    /* renamed from: m  reason: collision with root package name */
    private final pc.p<h<? super T>, Continuation<? super dc.w>, Object> f13420m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f13421f;

        /* renamed from: m  reason: collision with root package name */
        Object f13422m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f13423p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ p0<T> f13424q;

        /* renamed from: r  reason: collision with root package name */
        int f13425r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p0<T> p0Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f13424q = p0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13423p = obj;
            this.f13425r |= RecyclerView.UNDEFINED_DURATION;
            return this.f13424q.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p0(h<? super T> hVar, pc.p<? super h<? super T>, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        this.f13419f = hVar;
        this.f13420m = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ed.s] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super dc.w> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof dd.p0.a
            if (r0 == 0) goto L13
            r0 = r7
            dd.p0$a r0 = (dd.p0.a) r0
            int r1 = r0.f13425r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13425r = r1
            goto L18
        L13:
            dd.p0$a r0 = new dd.p0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f13423p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f13425r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dc.n.b(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f13422m
            ed.s r2 = (ed.s) r2
            java.lang.Object r4 = r0.f13421f
            dd.p0 r4 = (dd.p0) r4
            dc.n.b(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            dc.n.b(r7)
            ed.s r2 = new ed.s
            dd.h<T> r7 = r6.f13419f
            hc.f r5 = r0.getContext()
            r2.<init>(r7, r5)
            pc.p<dd.h<? super T>, kotlin.coroutines.Continuation<? super dc.w>, java.lang.Object> r7 = r6.f13420m     // Catch: java.lang.Throwable -> L7d
            r0.f13421f = r6     // Catch: java.lang.Throwable -> L7d
            r0.f13422m = r2     // Catch: java.lang.Throwable -> L7d
            r0.f13425r = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            dd.h<T> r7 = r4.f13419f
            boolean r2 = r7 instanceof dd.p0
            if (r2 == 0) goto L7a
            dd.p0 r7 = (dd.p0) r7
            r2 = 0
            r0.f13421f = r2
            r0.f13422m = r2
            r0.f13425r = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            dc.w r7 = dc.w.f13270a
            return r7
        L7a:
            dc.w r7 = dc.w.f13270a
            return r7
        L7d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.p0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // dd.h
    public Object emit(T t10, Continuation<? super dc.w> continuation) {
        return this.f13419f.emit(t10, continuation);
    }
}
