package ed;

import dc.m;
import dd.l0;
import ed.c;
import java.util.Arrays;
import kotlin.coroutines.Continuation;

/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes4.dex */
public abstract class a<S extends c<?>> {

    /* renamed from: f  reason: collision with root package name */
    private S[] f14208f;

    /* renamed from: m  reason: collision with root package name */
    private int f14209m;

    /* renamed from: p  reason: collision with root package name */
    private int f14210p;

    /* renamed from: q  reason: collision with root package name */
    private x f14211q;

    public static final /* synthetic */ int f(a aVar) {
        return aVar.f14209m;
    }

    public static final /* synthetic */ c[] h(a aVar) {
        return aVar.f14208f;
    }

    public final l0<Integer> g() {
        x xVar;
        synchronized (this) {
            xVar = this.f14211q;
            if (xVar == null) {
                xVar = new x(this.f14209m);
                this.f14211q = xVar;
            }
        }
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final S i() {
        S s10;
        x xVar;
        synchronized (this) {
            S[] sArr = this.f14208f;
            if (sArr == null) {
                sArr = k(2);
                this.f14208f = sArr;
            } else if (this.f14209m >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                qc.q.h(copyOf, "copyOf(this, newSize)");
                this.f14208f = (S[]) ((c[]) copyOf);
                sArr = (S[]) ((c[]) copyOf);
            }
            int i10 = this.f14210p;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = j();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
                qc.q.g(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s10.a(this));
            this.f14210p = i10;
            this.f14209m++;
            xVar = this.f14211q;
        }
        if (xVar != null) {
            xVar.a0(1);
        }
        return s10;
    }

    protected abstract S j();

    protected abstract S[] k(int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(S s10) {
        x xVar;
        int i10;
        Continuation<dc.w>[] b10;
        synchronized (this) {
            int i11 = this.f14209m - 1;
            this.f14209m = i11;
            xVar = this.f14211q;
            if (i11 == 0) {
                this.f14210p = 0;
            }
            qc.q.g(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            b10 = s10.b(this);
        }
        for (Continuation<dc.w> continuation : b10) {
            if (continuation != null) {
                m.a aVar = dc.m.f13253f;
                continuation.resumeWith(dc.m.a(dc.w.f13270a));
            }
        }
        if (xVar != null) {
            xVar.a0(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int m() {
        return this.f14209m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final S[] n() {
        return this.f14208f;
    }
}
