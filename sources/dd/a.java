package dd;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* compiled from: Flow.kt */
/* loaded from: classes4.dex */
public abstract class a<T> implements g<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Flow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: dd.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0305a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f13273f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f13274m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ a<T> f13275p;

        /* renamed from: q  reason: collision with root package name */
        int f13276q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0305a(a<T> aVar, Continuation<? super C0305a> continuation) {
            super(continuation);
            this.f13275p = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13274m = obj;
            this.f13276q |= RecyclerView.UNDEFINED_DURATION;
            return this.f13275p.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // dd.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(dd.h<? super T> r6, kotlin.coroutines.Continuation<? super dc.w> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof dd.a.C0305a
            if (r0 == 0) goto L13
            r0 = r7
            dd.a$a r0 = (dd.a.C0305a) r0
            int r1 = r0.f13276q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13276q = r1
            goto L18
        L13:
            dd.a$a r0 = new dd.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13274m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f13276q
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f13273f
            ed.s r6 = (ed.s) r6
            dc.n.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            dc.n.b(r7)
            ed.s r7 = new ed.s
            hc.f r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f13273f = r7     // Catch: java.lang.Throwable -> L55
            r0.f13276q = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.f(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            dc.w r6 = dc.w.f13270a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.a.collect(dd.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract Object f(h<? super T> hVar, Continuation<? super dc.w> continuation);
}
