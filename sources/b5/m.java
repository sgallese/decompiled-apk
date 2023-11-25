package b5;

import ec.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Parameters.kt */
/* loaded from: classes.dex */
public final class m implements Iterable<dc.l<? extends String, ? extends c>>, rc.a {

    /* renamed from: m  reason: collision with root package name */
    public static final b f8029m = new b(null);

    /* renamed from: p  reason: collision with root package name */
    public static final m f8030p = new m();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, c> f8031f;

    /* compiled from: Parameters.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, c> f8032a;

        public a(m mVar) {
            Map<String, c> t10;
            t10 = n0.t(mVar.f8031f);
            this.f8032a = t10;
        }

        public final m a() {
            return new m(g5.c.b(this.f8032a), null);
        }
    }

    /* compiled from: Parameters.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }
    }

    /* compiled from: Parameters.kt */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Object f8033a;

        /* renamed from: b  reason: collision with root package name */
        private final String f8034b;

        public final String a() {
            return this.f8034b;
        }

        public final Object b() {
            return this.f8033a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (qc.q.d(this.f8033a, cVar.f8033a) && qc.q.d(this.f8034b, cVar.f8034b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10;
            Object obj = this.f8033a;
            int i11 = 0;
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = i10 * 31;
            String str = this.f8034b;
            if (str != null) {
                i11 = str.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            return "Entry(value=" + this.f8033a + ", memoryCacheKey=" + this.f8034b + ')';
        }
    }

    public /* synthetic */ m(Map map, qc.h hVar) {
        this(map);
    }

    public final Map<String, String> e() {
        Map<String, String> h10;
        if (isEmpty()) {
            h10 = n0.h();
            return h10;
        }
        Map<String, c> map = this.f8031f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, c> entry : map.entrySet()) {
            String a10 = entry.getValue().a();
            if (a10 != null) {
                linkedHashMap.put(entry.getKey(), a10);
            }
        }
        return linkedHashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && qc.q.d(this.f8031f, ((m) obj).f8031f)) {
            return true;
        }
        return false;
    }

    public final a f() {
        return new a(this);
    }

    public final <T> T h(String str) {
        c cVar = this.f8031f.get(str);
        if (cVar != null) {
            return (T) cVar.b();
        }
        return null;
    }

    public int hashCode() {
        return this.f8031f.hashCode();
    }

    public final boolean isEmpty() {
        return this.f8031f.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<dc.l<? extends String, ? extends c>> iterator() {
        Map<String, c> map = this.f8031f;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, c> entry : map.entrySet()) {
            arrayList.add(dc.r.a(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    public String toString() {
        return "Parameters(entries=" + this.f8031f + ')';
    }

    private m(Map<String, c> map) {
        this.f8031f = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m() {
        /*
            r1 = this;
            java.util.Map r0 = ec.k0.h()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.m.<init>():void");
    }
}
