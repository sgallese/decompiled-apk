package androidx.paging;

import androidx.paging.q0;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LoadStates.kt */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f6032d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final s0 f6033e;

    /* renamed from: a  reason: collision with root package name */
    private final q0 f6034a;

    /* renamed from: b  reason: collision with root package name */
    private final q0 f6035b;

    /* renamed from: c  reason: collision with root package name */
    private final q0 f6036c;

    /* compiled from: LoadStates.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final s0 a() {
            return s0.f6033e;
        }
    }

    /* compiled from: LoadStates.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6037a;

        static {
            int[] iArr = new int[t0.values().length];
            try {
                iArr[t0.APPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t0.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6037a = iArr;
        }
    }

    static {
        q0.c.a aVar = q0.c.f6001b;
        f6033e = new s0(aVar.b(), aVar.b(), aVar.b());
    }

    public s0(q0 q0Var, q0 q0Var2, q0 q0Var3) {
        qc.q.i(q0Var, "refresh");
        qc.q.i(q0Var2, "prepend");
        qc.q.i(q0Var3, "append");
        this.f6034a = q0Var;
        this.f6035b = q0Var2;
        this.f6036c = q0Var3;
    }

    public static /* synthetic */ s0 c(s0 s0Var, q0 q0Var, q0 q0Var2, q0 q0Var3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q0Var = s0Var.f6034a;
        }
        if ((i10 & 2) != 0) {
            q0Var2 = s0Var.f6035b;
        }
        if ((i10 & 4) != 0) {
            q0Var3 = s0Var.f6036c;
        }
        return s0Var.b(q0Var, q0Var2, q0Var3);
    }

    public final s0 b(q0 q0Var, q0 q0Var2, q0 q0Var3) {
        qc.q.i(q0Var, "refresh");
        qc.q.i(q0Var2, "prepend");
        qc.q.i(q0Var3, "append");
        return new s0(q0Var, q0Var2, q0Var3);
    }

    public final q0 d() {
        return this.f6036c;
    }

    public final q0 e() {
        return this.f6035b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (qc.q.d(this.f6034a, s0Var.f6034a) && qc.q.d(this.f6035b, s0Var.f6035b) && qc.q.d(this.f6036c, s0Var.f6036c)) {
            return true;
        }
        return false;
    }

    public final q0 f() {
        return this.f6034a;
    }

    public final s0 g(t0 t0Var, q0 q0Var) {
        qc.q.i(t0Var, "loadType");
        qc.q.i(q0Var, "newState");
        int i10 = b.f6037a[t0Var.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return c(this, q0Var, null, null, 6, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return c(this, null, q0Var, null, 5, null);
        }
        return c(this, null, null, q0Var, 3, null);
    }

    public int hashCode() {
        return (((this.f6034a.hashCode() * 31) + this.f6035b.hashCode()) * 31) + this.f6036c.hashCode();
    }

    public String toString() {
        return "LoadStates(refresh=" + this.f6034a + ", prepend=" + this.f6035b + ", append=" + this.f6036c + ')';
    }
}
