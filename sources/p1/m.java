package p1;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: DepthSortedSet.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f20851a;

    /* renamed from: b  reason: collision with root package name */
    private final dc.f f20852b;

    /* renamed from: c  reason: collision with root package name */
    private final Comparator<j0> f20853c;

    /* renamed from: d  reason: collision with root package name */
    private final w1<j0> f20854d;

    /* compiled from: DepthSortedSet.kt */
    /* loaded from: classes.dex */
    public static final class a implements Comparator<j0> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(j0 j0Var, j0 j0Var2) {
            qc.q.i(j0Var, "l1");
            qc.q.i(j0Var2, "l2");
            int k10 = qc.q.k(j0Var.J(), j0Var2.J());
            if (k10 != 0) {
                return k10;
            }
            return qc.q.k(j0Var.hashCode(), j0Var2.hashCode());
        }
    }

    /* compiled from: DepthSortedSet.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.a<Map<j0, Integer>> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f20855f = new b();

        b() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Map<j0, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    public m(boolean z10) {
        dc.f a10;
        this.f20851a = z10;
        a10 = dc.h.a(dc.j.NONE, b.f20855f);
        this.f20852b = a10;
        a aVar = new a();
        this.f20853c = aVar;
        this.f20854d = new w1<>(aVar);
    }

    private final Map<j0, Integer> c() {
        return (Map) this.f20852b.getValue();
    }

    public final void a(j0 j0Var) {
        boolean z10;
        qc.q.i(j0Var, "node");
        if (j0Var.H0()) {
            if (this.f20851a) {
                Integer num = c().get(j0Var);
                if (num == null) {
                    c().put(j0Var, Integer.valueOf(j0Var.J()));
                } else {
                    if (num.intValue() == j0Var.J()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.f20854d.add(j0Var);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean b(j0 j0Var) {
        boolean z10;
        qc.q.i(j0Var, "node");
        boolean contains = this.f20854d.contains(j0Var);
        if (this.f20851a) {
            if (contains == c().containsKey(j0Var)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return contains;
    }

    public final boolean d() {
        return this.f20854d.isEmpty();
    }

    public final j0 e() {
        j0 first = this.f20854d.first();
        qc.q.h(first, "node");
        f(first);
        return first;
    }

    public final boolean f(j0 j0Var) {
        qc.q.i(j0Var, "node");
        if (j0Var.H0()) {
            boolean remove = this.f20854d.remove(j0Var);
            if (this.f20851a) {
                Integer remove2 = c().remove(j0Var);
                boolean z10 = true;
                if (remove) {
                    int J = j0Var.J();
                    if (remove2 == null || remove2.intValue() != J) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (remove2 != null) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            return remove;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public String toString() {
        String obj = this.f20854d.toString();
        qc.q.h(obj, "set.toString()");
        return obj;
    }
}
