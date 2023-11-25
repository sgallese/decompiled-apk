package ed;

import ad.x1;
import androidx.recyclerview.widget.RecyclerView;
import fd.c0;
import hc.f;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class a extends qc.r implements pc.p<Integer, f.b, Integer> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s<?> f14291f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s<?> sVar) {
            super(2);
            this.f14291f = sVar;
        }

        public final Integer a(int i10, f.b bVar) {
            int i11;
            f.c<?> key = bVar.getKey();
            f.b bVar2 = this.f14291f.f14284m.get(key);
            if (key != x1.f574b) {
                if (bVar != bVar2) {
                    i11 = RecyclerView.UNDEFINED_DURATION;
                } else {
                    i11 = i10 + 1;
                }
                return Integer.valueOf(i11);
            }
            x1 x1Var = (x1) bVar2;
            qc.q.g(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            x1 b10 = u.b((x1) bVar, x1Var);
            if (b10 == x1Var) {
                if (x1Var != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b10 + ", expected child of " + x1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, f.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    public static final void a(s<?> sVar, hc.f fVar) {
        if (((Number) fVar.fold(0, new a(sVar))).intValue() == sVar.f14285p) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + sVar.f14284m + ",\n\t\tbut emission happened in " + fVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final x1 b(x1 x1Var, x1 x1Var2) {
        while (x1Var != null) {
            if (x1Var == x1Var2) {
                return x1Var;
            }
            if (!(x1Var instanceof c0)) {
                return x1Var;
            }
            x1Var = x1Var.getParent();
        }
        return null;
    }
}
