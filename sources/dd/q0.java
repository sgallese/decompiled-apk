package dd;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
/* loaded from: classes4.dex */
public final class q0<T> implements b0<T> {

    /* renamed from: f  reason: collision with root package name */
    private final b0<T> f13472f;

    /* renamed from: m  reason: collision with root package name */
    private final pc.p<h<? super T>, Continuation<? super dc.w>, Object> f13473m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {409}, m = "collect")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f13474f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ q0<T> f13475m;

        /* renamed from: p  reason: collision with root package name */
        int f13476p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q0<T> q0Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f13475m = q0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13474f = obj;
            this.f13476p |= RecyclerView.UNDEFINED_DURATION;
            return this.f13475m.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q0(b0<? extends T> b0Var, pc.p<? super h<? super T>, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        this.f13472f = b0Var;
        this.f13473m = pVar;
    }

    @Override // dd.b0
    public List<T> a() {
        return this.f13472f.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // dd.b0, dd.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(dd.h<? super T> r6, kotlin.coroutines.Continuation<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof dd.q0.a
            if (r0 == 0) goto L13
            r0 = r7
            dd.q0$a r0 = (dd.q0.a) r0
            int r1 = r0.f13476p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13476p = r1
            goto L18
        L13:
            dd.q0$a r0 = new dd.q0$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13474f
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f13476p
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            dc.n.b(r7)
            goto L46
        L31:
            dc.n.b(r7)
            dd.b0<T> r7 = r5.f13472f
            dd.p0 r2 = new dd.p0
            pc.p<dd.h<? super T>, kotlin.coroutines.Continuation<? super dc.w>, java.lang.Object> r4 = r5.f13473m
            r2.<init>(r6, r4)
            r0.f13476p = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.q0.collect(dd.h, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
