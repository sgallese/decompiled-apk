package androidx.paging;

/* compiled from: CombinedLoadStates.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final q0 f5796a;

    /* renamed from: b  reason: collision with root package name */
    private final q0 f5797b;

    /* renamed from: c  reason: collision with root package name */
    private final q0 f5798c;

    /* renamed from: d  reason: collision with root package name */
    private final s0 f5799d;

    /* renamed from: e  reason: collision with root package name */
    private final s0 f5800e;

    public j(q0 q0Var, q0 q0Var2, q0 q0Var3, s0 s0Var, s0 s0Var2) {
        qc.q.i(q0Var, "refresh");
        qc.q.i(q0Var2, "prepend");
        qc.q.i(q0Var3, "append");
        qc.q.i(s0Var, "source");
        this.f5796a = q0Var;
        this.f5797b = q0Var2;
        this.f5798c = q0Var3;
        this.f5799d = s0Var;
        this.f5800e = s0Var2;
    }

    public final q0 a() {
        return this.f5798c;
    }

    public final s0 b() {
        return this.f5800e;
    }

    public final q0 c() {
        return this.f5797b;
    }

    public final q0 d() {
        return this.f5796a;
    }

    public final s0 e() {
        return this.f5799d;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!qc.q.d(j.class, cls)) {
            return false;
        }
        qc.q.g(obj, "null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
        j jVar = (j) obj;
        if (qc.q.d(this.f5796a, jVar.f5796a) && qc.q.d(this.f5797b, jVar.f5797b) && qc.q.d(this.f5798c, jVar.f5798c) && qc.q.d(this.f5799d, jVar.f5799d) && qc.q.d(this.f5800e, jVar.f5800e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((((((this.f5796a.hashCode() * 31) + this.f5797b.hashCode()) * 31) + this.f5798c.hashCode()) * 31) + this.f5799d.hashCode()) * 31;
        s0 s0Var = this.f5800e;
        if (s0Var != null) {
            i10 = s0Var.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "CombinedLoadStates(refresh=" + this.f5796a + ", prepend=" + this.f5797b + ", append=" + this.f5798c + ", source=" + this.f5799d + ", mediator=" + this.f5800e + ')';
    }

    public /* synthetic */ j(q0 q0Var, q0 q0Var2, q0 q0Var3, s0 s0Var, s0 s0Var2, int i10, qc.h hVar) {
        this(q0Var, q0Var2, q0Var3, s0Var, (i10 & 16) != 0 ? null : s0Var2);
    }
}
