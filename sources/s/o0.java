package s;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: AnimationSpec.kt */
/* loaded from: classes.dex */
public final class o0<T> implements b0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final b<T> f22810a;

    /* compiled from: AnimationSpec.kt */
    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: b  reason: collision with root package name */
        private int f22814b;

        /* renamed from: a  reason: collision with root package name */
        private int f22813a = 300;

        /* renamed from: c  reason: collision with root package name */
        private final Map<Integer, a<T>> f22815c = new LinkedHashMap();

        /* JADX WARN: Type inference failed for: r1v0, types: [qc.h, s.c0] */
        public final a<T> a(T t10, int i10) {
            ?? r12 = 0;
            a<T> aVar = new a<>(t10, r12, 2, r12);
            this.f22815c.put(Integer.valueOf(i10), aVar);
            return aVar;
        }

        public final int b() {
            return this.f22814b;
        }

        public final int c() {
            return this.f22813a;
        }

        public final Map<Integer, a<T>> d() {
            return this.f22815c;
        }

        public final void e(int i10) {
            this.f22813a = i10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f22814b == bVar.f22814b && this.f22813a == bVar.f22813a && qc.q.d(this.f22815c, bVar.f22815c)) {
                    return true;
                }
            }
            return false;
        }

        public final void f(a<T> aVar, c0 c0Var) {
            qc.q.i(aVar, "<this>");
            qc.q.i(c0Var, "easing");
            aVar.a(c0Var);
        }

        public int hashCode() {
            return (((this.f22813a * 31) + this.f22814b) * 31) + this.f22815c.hashCode();
        }
    }

    public o0(b<T> bVar) {
        qc.q.i(bVar, "config");
        this.f22810a = bVar;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof o0) && qc.q.d(this.f22810a, ((o0) obj).f22810a)) {
            return true;
        }
        return false;
    }

    @Override // s.b0, s.j
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public <V extends q> w1<V> a(i1<T, V> i1Var) {
        int d10;
        qc.q.i(i1Var, "converter");
        Map<Integer, a<T>> d11 = this.f22810a.d();
        d10 = ec.m0.d(d11.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(d10);
        Iterator<T> it = d11.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((a) entry.getValue()).b(i1Var.a()));
        }
        return new w1<>(linkedHashMap, this.f22810a.c(), this.f22810a.b());
    }

    public int hashCode() {
        return this.f22810a.hashCode();
    }

    /* compiled from: AnimationSpec.kt */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f22811a;

        /* renamed from: b  reason: collision with root package name */
        private c0 f22812b;

        public a(T t10, c0 c0Var) {
            qc.q.i(c0Var, "easing");
            this.f22811a = t10;
            this.f22812b = c0Var;
        }

        public final void a(c0 c0Var) {
            qc.q.i(c0Var, "<set-?>");
            this.f22812b = c0Var;
        }

        public final <V extends q> dc.l<V, c0> b(pc.l<? super T, ? extends V> lVar) {
            qc.q.i(lVar, "convertToVector");
            return dc.r.a(lVar.invoke((T) this.f22811a), this.f22812b);
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (qc.q.d(aVar.f22811a, this.f22811a) && qc.q.d(aVar.f22812b, this.f22812b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10;
            T t10 = this.f22811a;
            if (t10 != null) {
                i10 = t10.hashCode();
            } else {
                i10 = 0;
            }
            return (i10 * 31) + this.f22812b.hashCode();
        }

        public /* synthetic */ a(Object obj, c0 c0Var, int i10, qc.h hVar) {
            this(obj, (i10 & 2) != 0 ? d0.c() : c0Var);
        }
    }
}
