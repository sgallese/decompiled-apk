package fd;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f15665a = new g0("CONDITION_FALSE");

    public static final Object a() {
        return f15665a;
    }

    public static final r b(Object obj) {
        a0 a0Var;
        r rVar;
        if (obj instanceof a0) {
            a0Var = (a0) obj;
        } else {
            a0Var = null;
        }
        if (a0Var == null || (rVar = a0Var.f15619a) == null) {
            qc.q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (r) obj;
        }
        return rVar;
    }
}
