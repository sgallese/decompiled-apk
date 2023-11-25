package qc;

import ec.m0;
import ec.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassReference.kt */
/* loaded from: classes4.dex */
public final class f implements wc.b<Object>, e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f21669b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<? extends dc.c<?>>, Integer> f21670c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<String, String> f21671d;

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap<String, String> f21672e;

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap<String, String> f21673f;

    /* renamed from: g  reason: collision with root package name */
    private static final Map<String, String> f21674g;

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f21675a;

    /* compiled from: ClassReference.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String a(java.lang.Class<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "jClass"
                qc.q.i(r8, r0)
                boolean r0 = r8.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb6
            Le:
                boolean r0 = r8.isLocalClass()
                if (r0 == 0) goto L6c
                java.lang.String r0 = r8.getSimpleName()
                java.lang.reflect.Method r2 = r8.getEnclosingMethod()
                r3 = 2
                r4 = 36
                java.lang.String r5 = "name"
                if (r2 == 0) goto L43
                qc.q.h(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = r2.getName()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r6.toString()
                java.lang.String r2 = yc.m.I0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L40
                goto L43
            L40:
                r1 = r2
                goto Lb6
            L43:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                if (r8 == 0) goto L64
                qc.q.h(r0, r5)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                r2.append(r4)
                java.lang.String r8 = r2.toString()
                java.lang.String r1 = yc.m.I0(r0, r8, r1, r3, r1)
                goto Lb6
            L64:
                qc.q.h(r0, r5)
                java.lang.String r1 = yc.m.H0(r0, r4, r1, r3, r1)
                goto Lb6
            L6c:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto La1
                java.lang.Class r8 = r8.getComponentType()
                boolean r0 = r8.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9e
                java.util.Map r0 = qc.f.c()
                java.lang.String r8 = r8.getName()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L9e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r2)
                java.lang.String r8 = r0.toString()
                r1 = r8
            L9e:
                if (r1 != 0) goto Lb6
                goto L40
            La1:
                java.util.Map r0 = qc.f.c()
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb6
                java.lang.String r1 = r8.getSimpleName()
            Lb6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: qc.f.a.a(java.lang.Class):java.lang.String");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List l10;
        int s10;
        Map<Class<? extends dc.c<?>>, Integer> p10;
        int d10;
        String K0;
        String K02;
        int i10 = 0;
        l10 = ec.t.l(pc.a.class, pc.l.class, pc.p.class, pc.q.class, pc.r.class, pc.s.class, pc.t.class, pc.u.class, pc.v.class, pc.w.class, pc.b.class, pc.c.class, pc.d.class, pc.e.class, pc.f.class, pc.g.class, pc.h.class, pc.i.class, pc.j.class, pc.k.class, pc.m.class, pc.n.class, pc.o.class);
        List list = l10;
        s10 = ec.u.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ec.t.r();
            }
            arrayList.add(dc.r.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        p10 = n0.p(arrayList);
        f21670c = p10;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f21671d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f21672e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        q.h(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            q.h(str, "kotlinName");
            K02 = yc.w.K0(str, '.', null, 2, null);
            sb2.append(K02);
            sb2.append("CompanionObject");
            dc.l a10 = dc.r.a(sb2.toString(), str + ".Companion");
            hashMap3.put(a10.c(), a10.d());
        }
        for (Map.Entry<Class<? extends dc.c<?>>, Integer> entry : f21670c.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f21673f = hashMap3;
        d10 = m0.d(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(d10);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            K0 = yc.w.K0((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, K0);
        }
        f21674g = linkedHashMap;
    }

    public f(Class<?> cls) {
        q.i(cls, "jClass");
        this.f21675a = cls;
    }

    @Override // wc.b
    public String a() {
        return f21669b.a(b());
    }

    @Override // qc.e
    public Class<?> b() {
        return this.f21675a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof f) && q.d(oc.a.b(this), oc.a.b((wc.b) obj))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return oc.a.b(this).hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
