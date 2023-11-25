package io.realm;

import io.realm.internal.Table;
import io.realm.internal.c;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* compiled from: RealmObjectSchema.java */
/* loaded from: classes4.dex */
public abstract class f1 {

    /* renamed from: e  reason: collision with root package name */
    static final Map<Class<?>, b> f17510e;

    /* renamed from: f  reason: collision with root package name */
    static final Map<Class<?>, b> f17511f;

    /* renamed from: g  reason: collision with root package name */
    static final Map<Class<?>, b> f17512g;

    /* renamed from: h  reason: collision with root package name */
    static final Map<Class<?>, b> f17513h;

    /* renamed from: a  reason: collision with root package name */
    final h1 f17514a;

    /* renamed from: b  reason: collision with root package name */
    final io.realm.a f17515b;

    /* renamed from: c  reason: collision with root package name */
    final Table f17516c;

    /* renamed from: d  reason: collision with root package name */
    final io.realm.internal.c f17517d;

    /* compiled from: RealmObjectSchema.java */
    /* loaded from: classes4.dex */
    static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        private final Table f17518e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Table table) {
            super((io.realm.internal.c) null, false);
            this.f17518e = table;
        }

        @Override // io.realm.internal.c
        protected void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot copy");
        }

        @Override // io.realm.internal.c
        public void c(io.realm.internal.c cVar) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
        }

        @Override // io.realm.internal.c
        public c.a d(String str) {
            throw new UnsupportedOperationException("DynamicColumnIndices do not support 'getColumnDetails'");
        }
    }

    /* compiled from: RealmObjectSchema.java */
    /* loaded from: classes4.dex */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final RealmFieldType f17519a;

        /* renamed from: b  reason: collision with root package name */
        final RealmFieldType f17520b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f17521c;

        b(RealmFieldType realmFieldType, RealmFieldType realmFieldType2, boolean z10) {
            this.f17519a = realmFieldType;
            this.f17520b = realmFieldType2;
            this.f17521c = z10;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        hashMap.put(String.class, new b(realmFieldType, RealmFieldType.STRING_LIST, true));
        Class cls = Short.TYPE;
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        RealmFieldType realmFieldType3 = RealmFieldType.INTEGER_LIST;
        hashMap.put(cls, new b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Short.class, new b(realmFieldType2, realmFieldType3, true));
        Class cls2 = Integer.TYPE;
        hashMap.put(cls2, new b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Integer.class, new b(realmFieldType2, realmFieldType3, true));
        Class cls3 = Long.TYPE;
        hashMap.put(cls3, new b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Long.class, new b(realmFieldType2, realmFieldType3, true));
        Class cls4 = Float.TYPE;
        RealmFieldType realmFieldType4 = RealmFieldType.FLOAT;
        RealmFieldType realmFieldType5 = RealmFieldType.FLOAT_LIST;
        hashMap.put(cls4, new b(realmFieldType4, realmFieldType5, false));
        hashMap.put(Float.class, new b(realmFieldType4, realmFieldType5, true));
        Class cls5 = Double.TYPE;
        RealmFieldType realmFieldType6 = RealmFieldType.DOUBLE;
        RealmFieldType realmFieldType7 = RealmFieldType.DOUBLE_LIST;
        hashMap.put(cls5, new b(realmFieldType6, realmFieldType7, false));
        hashMap.put(Double.class, new b(realmFieldType6, realmFieldType7, true));
        Class cls6 = Boolean.TYPE;
        RealmFieldType realmFieldType8 = RealmFieldType.BOOLEAN;
        RealmFieldType realmFieldType9 = RealmFieldType.BOOLEAN_LIST;
        hashMap.put(cls6, new b(realmFieldType8, realmFieldType9, false));
        hashMap.put(Boolean.class, new b(realmFieldType8, realmFieldType9, true));
        hashMap.put(Byte.TYPE, new b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Byte.class, new b(realmFieldType2, realmFieldType3, true));
        RealmFieldType realmFieldType10 = RealmFieldType.BINARY;
        hashMap.put(byte[].class, new b(realmFieldType10, RealmFieldType.BINARY_LIST, true));
        RealmFieldType realmFieldType11 = RealmFieldType.DATE;
        hashMap.put(Date.class, new b(realmFieldType11, RealmFieldType.DATE_LIST, true));
        RealmFieldType realmFieldType12 = RealmFieldType.OBJECT_ID;
        hashMap.put(ObjectId.class, new b(realmFieldType12, RealmFieldType.OBJECT_ID_LIST, true));
        RealmFieldType realmFieldType13 = RealmFieldType.DECIMAL128;
        hashMap.put(Decimal128.class, new b(realmFieldType13, RealmFieldType.DECIMAL128_LIST, true));
        RealmFieldType realmFieldType14 = RealmFieldType.UUID;
        hashMap.put(UUID.class, new b(realmFieldType14, RealmFieldType.UUID_LIST, true));
        RealmFieldType realmFieldType15 = RealmFieldType.MIXED;
        hashMap.put(p0.class, new b(realmFieldType15, RealmFieldType.MIXED_LIST, true));
        f17510e = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(String.class, new b(realmFieldType, RealmFieldType.STRING_TO_STRING_MAP, true));
        Class cls7 = Short.TYPE;
        RealmFieldType realmFieldType16 = RealmFieldType.STRING_TO_INTEGER_MAP;
        hashMap2.put(cls7, new b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Short.class, new b(realmFieldType2, realmFieldType16, true));
        hashMap2.put(cls2, new b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Integer.class, new b(realmFieldType2, realmFieldType16, true));
        hashMap2.put(cls3, new b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Long.class, new b(realmFieldType2, realmFieldType16, true));
        RealmFieldType realmFieldType17 = RealmFieldType.STRING_TO_FLOAT_MAP;
        hashMap2.put(cls4, new b(realmFieldType4, realmFieldType17, false));
        hashMap2.put(Float.class, new b(realmFieldType4, realmFieldType17, true));
        Class cls8 = Double.TYPE;
        RealmFieldType realmFieldType18 = RealmFieldType.STRING_TO_DOUBLE_MAP;
        hashMap2.put(cls8, new b(realmFieldType6, realmFieldType18, false));
        hashMap2.put(Double.class, new b(realmFieldType6, realmFieldType18, true));
        RealmFieldType realmFieldType19 = RealmFieldType.STRING_TO_BOOLEAN_MAP;
        hashMap2.put(cls6, new b(realmFieldType8, realmFieldType19, false));
        hashMap2.put(Boolean.class, new b(realmFieldType8, realmFieldType19, true));
        hashMap2.put(Byte.TYPE, new b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Byte.class, new b(realmFieldType2, realmFieldType16, true));
        hashMap2.put(byte[].class, new b(realmFieldType10, RealmFieldType.STRING_TO_BINARY_MAP, true));
        hashMap2.put(Date.class, new b(realmFieldType11, RealmFieldType.STRING_TO_DATE_MAP, true));
        hashMap2.put(ObjectId.class, new b(realmFieldType12, RealmFieldType.STRING_TO_OBJECT_ID_MAP, true));
        hashMap2.put(Decimal128.class, new b(realmFieldType13, RealmFieldType.STRING_TO_DECIMAL128_MAP, true));
        hashMap2.put(UUID.class, new b(realmFieldType14, RealmFieldType.STRING_TO_UUID_MAP, true));
        hashMap2.put(p0.class, new b(realmFieldType15, RealmFieldType.STRING_TO_MIXED_MAP, true));
        f17511f = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(String.class, new b(realmFieldType, RealmFieldType.STRING_SET, true));
        Class cls9 = Short.TYPE;
        RealmFieldType realmFieldType20 = RealmFieldType.INTEGER_SET;
        hashMap3.put(cls9, new b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Short.class, new b(realmFieldType2, realmFieldType20, true));
        hashMap3.put(cls2, new b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Integer.class, new b(realmFieldType2, realmFieldType20, true));
        hashMap3.put(cls3, new b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Long.class, new b(realmFieldType2, realmFieldType20, true));
        RealmFieldType realmFieldType21 = RealmFieldType.FLOAT_SET;
        hashMap3.put(cls4, new b(realmFieldType4, realmFieldType21, false));
        hashMap3.put(Float.class, new b(realmFieldType4, realmFieldType21, true));
        Class cls10 = Double.TYPE;
        RealmFieldType realmFieldType22 = RealmFieldType.DOUBLE_SET;
        hashMap3.put(cls10, new b(realmFieldType6, realmFieldType22, false));
        hashMap3.put(Double.class, new b(realmFieldType6, realmFieldType22, true));
        RealmFieldType realmFieldType23 = RealmFieldType.BOOLEAN_SET;
        hashMap3.put(cls6, new b(realmFieldType8, realmFieldType23, false));
        hashMap3.put(Boolean.class, new b(realmFieldType8, realmFieldType23, true));
        hashMap3.put(Byte.TYPE, new b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Byte.class, new b(realmFieldType2, realmFieldType20, true));
        hashMap3.put(byte[].class, new b(realmFieldType10, RealmFieldType.BINARY_SET, true));
        hashMap3.put(Date.class, new b(realmFieldType11, RealmFieldType.DATE_SET, true));
        hashMap3.put(ObjectId.class, new b(realmFieldType12, RealmFieldType.OBJECT_ID_SET, true));
        hashMap3.put(Decimal128.class, new b(realmFieldType13, RealmFieldType.DECIMAL128_SET, true));
        hashMap3.put(UUID.class, new b(realmFieldType14, RealmFieldType.UUID_SET, true));
        hashMap3.put(p0.class, new b(realmFieldType15, RealmFieldType.MIXED_SET, true));
        f17512g = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(d1.class, new b(RealmFieldType.OBJECT, null, false));
        hashMap4.put(x0.class, new b(RealmFieldType.LIST, null, false));
        hashMap4.put(w0.class, new b(RealmFieldType.STRING_TO_LINK_MAP, null, false));
        hashMap4.put(i1.class, new b(RealmFieldType.LINK_SET, null, false));
        f17513h = Collections.unmodifiableMap(hashMap4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(io.realm.a aVar, h1 h1Var, Table table, io.realm.internal.c cVar) {
        this.f17514a = h1Var;
        this.f17515b = aVar;
        this.f17516c = table;
        this.f17517d = cVar;
    }

    public String a() {
        return this.f17516c.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long b(String str) {
        long k10 = this.f17516c.k(str);
        if (k10 != -1) {
            return k10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field name '%s' does not exist on schema for '%s'", str, a()));
    }

    public RealmFieldType c(String str) {
        return this.f17516c.n(b(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String d(String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table e() {
        return this.f17516c;
    }

    public boolean f() {
        return this.f17516c.v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(RealmFieldType realmFieldType) {
        if (realmFieldType != RealmFieldType.OBJECT && realmFieldType != RealmFieldType.LIST) {
            return false;
        }
        return true;
    }
}
