package b5;

import ec.n0;
import java.util.Map;

/* compiled from: Tags.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8045b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final r f8046c;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, Object> f8047a;

    /* compiled from: Tags.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final r a(Map<Class<?>, ? extends Object> map) {
            return new r(g5.c.b(map), null);
        }
    }

    static {
        Map h10;
        h10 = n0.h();
        f8046c = new r(h10);
    }

    public /* synthetic */ r(Map map, qc.h hVar) {
        this(map);
    }

    public final Map<Class<?>, Object> a() {
        return this.f8047a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r) && qc.q.d(this.f8047a, ((r) obj).f8047a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f8047a.hashCode();
    }

    public String toString() {
        return "Tags(tags=" + this.f8047a + ')';
    }

    private r(Map<Class<?>, ? extends Object> map) {
        this.f8047a = map;
    }
}
