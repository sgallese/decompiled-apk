package j0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    private final List<r0> f18855a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18856b;

    /* renamed from: c  reason: collision with root package name */
    private int f18857c;

    /* renamed from: d  reason: collision with root package name */
    private final List<r0> f18858d;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<Integer, j0> f18859e;

    /* renamed from: f  reason: collision with root package name */
    private final dc.f f18860f;

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<HashMap<Object, LinkedHashSet<r0>>> {
        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final HashMap<Object, LinkedHashSet<r0>> invoke() {
            HashMap<Object, LinkedHashSet<r0>> L;
            Object E;
            L = n.L();
            o1 o1Var = o1.this;
            int size = o1Var.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                r0 r0Var = o1Var.b().get(i10);
                E = n.E(r0Var);
                n.O(L, E, r0Var);
            }
            return L;
        }
    }

    public o1(List<r0> list, int i10) {
        boolean z10;
        dc.f b10;
        qc.q.i(list, "keyInfos");
        this.f18855a = list;
        this.f18856b = i10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f18858d = new ArrayList();
            HashMap<Integer, j0> hashMap = new HashMap<>();
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                r0 r0Var = this.f18855a.get(i12);
                hashMap.put(Integer.valueOf(r0Var.b()), new j0(i12, i11, r0Var.c()));
                i11 += r0Var.c();
            }
            this.f18859e = hashMap;
            b10 = dc.h.b(new a());
            this.f18860f = b10;
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    public final int a() {
        return this.f18857c;
    }

    public final List<r0> b() {
        return this.f18855a;
    }

    public final HashMap<Object, LinkedHashSet<r0>> c() {
        return (HashMap) this.f18860f.getValue();
    }

    public final r0 d(int i10, Object obj) {
        Object valueOf;
        Object N;
        if (obj != null) {
            valueOf = new q0(Integer.valueOf(i10), obj);
        } else {
            valueOf = Integer.valueOf(i10);
        }
        N = n.N(c(), valueOf);
        return (r0) N;
    }

    public final int e() {
        return this.f18856b;
    }

    public final List<r0> f() {
        return this.f18858d;
    }

    public final int g(r0 r0Var) {
        qc.q.i(r0Var, "keyInfo");
        j0 j0Var = this.f18859e.get(Integer.valueOf(r0Var.b()));
        if (j0Var != null) {
            return j0Var.b();
        }
        return -1;
    }

    public final boolean h(r0 r0Var) {
        qc.q.i(r0Var, "keyInfo");
        return this.f18858d.add(r0Var);
    }

    public final void i(r0 r0Var, int i10) {
        qc.q.i(r0Var, "keyInfo");
        this.f18859e.put(Integer.valueOf(r0Var.b()), new j0(-1, i10, 0));
    }

    public final void j(int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (i10 > i11) {
            Collection<j0> values = this.f18859e.values();
            qc.q.h(values, "groupInfos.values");
            for (j0 j0Var : values) {
                int b10 = j0Var.b();
                if (i10 <= b10 && b10 < i10 + i12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    j0Var.e((b10 - i10) + i11);
                } else {
                    if (i11 <= b10 && b10 < i10) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        j0Var.e(b10 + i12);
                    }
                }
            }
        } else if (i11 > i10) {
            Collection<j0> values2 = this.f18859e.values();
            qc.q.h(values2, "groupInfos.values");
            for (j0 j0Var2 : values2) {
                int b11 = j0Var2.b();
                if (i10 <= b11 && b11 < i10 + i12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    j0Var2.e((b11 - i10) + i11);
                } else {
                    if (i10 + 1 <= b11 && b11 < i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        j0Var2.e(b11 - i12);
                    }
                }
            }
        }
    }

    public final void k(int i10, int i11) {
        boolean z10;
        boolean z11;
        if (i10 > i11) {
            Collection<j0> values = this.f18859e.values();
            qc.q.h(values, "groupInfos.values");
            for (j0 j0Var : values) {
                int c10 = j0Var.c();
                if (c10 == i10) {
                    j0Var.f(i11);
                } else {
                    if (i11 <= c10 && c10 < i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        j0Var.f(c10 + 1);
                    }
                }
            }
        } else if (i11 > i10) {
            Collection<j0> values2 = this.f18859e.values();
            qc.q.h(values2, "groupInfos.values");
            for (j0 j0Var2 : values2) {
                int c11 = j0Var2.c();
                if (c11 == i10) {
                    j0Var2.f(i11);
                } else {
                    if (i10 + 1 <= c11 && c11 < i11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        j0Var2.f(c11 - 1);
                    }
                }
            }
        }
    }

    public final void l(int i10) {
        this.f18857c = i10;
    }

    public final int m(r0 r0Var) {
        qc.q.i(r0Var, "keyInfo");
        j0 j0Var = this.f18859e.get(Integer.valueOf(r0Var.b()));
        if (j0Var != null) {
            return j0Var.c();
        }
        return -1;
    }

    public final boolean n(int i10, int i11) {
        int b10;
        j0 j0Var = this.f18859e.get(Integer.valueOf(i10));
        if (j0Var != null) {
            int b11 = j0Var.b();
            int a10 = i11 - j0Var.a();
            j0Var.d(i11);
            if (a10 != 0) {
                Collection<j0> values = this.f18859e.values();
                qc.q.h(values, "groupInfos.values");
                for (j0 j0Var2 : values) {
                    if (j0Var2.b() >= b11 && !qc.q.d(j0Var2, j0Var) && (b10 = j0Var2.b() + a10) >= 0) {
                        j0Var2.e(b10);
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final int o(r0 r0Var) {
        qc.q.i(r0Var, "keyInfo");
        j0 j0Var = this.f18859e.get(Integer.valueOf(r0Var.b()));
        if (j0Var != null) {
            return j0Var.a();
        }
        return r0Var.c();
    }
}
