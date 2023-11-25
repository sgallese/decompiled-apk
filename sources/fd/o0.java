package fd;

import ad.t2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ThreadContext.kt */
/* loaded from: classes4.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final hc.f f15661a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f15662b;

    /* renamed from: c  reason: collision with root package name */
    private final t2<Object>[] f15663c;

    /* renamed from: d  reason: collision with root package name */
    private int f15664d;

    public o0(hc.f fVar, int i10) {
        this.f15661a = fVar;
        this.f15662b = new Object[i10];
        this.f15663c = new t2[i10];
    }

    public final void a(t2<?> t2Var, Object obj) {
        Object[] objArr = this.f15662b;
        int i10 = this.f15664d;
        objArr[i10] = obj;
        t2<Object>[] t2VarArr = this.f15663c;
        this.f15664d = i10 + 1;
        qc.q.g(t2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        t2VarArr[i10] = t2Var;
    }

    public final void b(hc.f fVar) {
        int length = this.f15663c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            t2<Object> t2Var = this.f15663c[length];
            qc.q.f(t2Var);
            t2Var.V(fVar, this.f15662b[length]);
            if (i10 >= 0) {
                length = i10;
            } else {
                return;
            }
        }
    }
}
