package io.realm;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* compiled from: RealmAny.java */
/* loaded from: classes4.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final s0 f18080a;

    /* compiled from: RealmAny.java */
    /* loaded from: classes4.dex */
    public enum a {
        INTEGER(RealmFieldType.INTEGER, Long.class),
        BOOLEAN(RealmFieldType.BOOLEAN, Boolean.class),
        STRING(RealmFieldType.STRING, String.class),
        BINARY(RealmFieldType.BINARY, Byte[].class),
        DATE(RealmFieldType.DATE, Date.class),
        FLOAT(RealmFieldType.FLOAT, Float.class),
        DOUBLE(RealmFieldType.DOUBLE, Double.class),
        DECIMAL128(RealmFieldType.DECIMAL128, Decimal128.class),
        OBJECT_ID(RealmFieldType.OBJECT_ID, ObjectId.class),
        OBJECT(RealmFieldType.TYPED_LINK, a1.class),
        UUID(RealmFieldType.UUID, UUID.class),
        NULL(null, null);

        private static final a[] realmFieldToRealmAnyTypeMap = new a[19];
        private final Class<?> clazz;
        private final RealmFieldType realmFieldType;

        static {
            for (a aVar : values()) {
                if (aVar != NULL) {
                    realmFieldToRealmAnyTypeMap[aVar.realmFieldType.getNativeValue()] = aVar;
                }
            }
            realmFieldToRealmAnyTypeMap[RealmFieldType.OBJECT.getNativeValue()] = OBJECT;
        }

        a(RealmFieldType realmFieldType, Class cls) {
            this.realmFieldType = realmFieldType;
            this.clazz = cls;
        }

        public static a fromNativeValue(int i10) {
            if (i10 == -1) {
                return NULL;
            }
            return realmFieldToRealmAnyTypeMap[i10];
        }

        public Class<?> getTypedClass() {
            return this.clazz;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(s0 s0Var) {
        this.f18080a = s0Var;
    }

    public static p0 e(a1 a1Var) {
        s0 c1Var;
        if (a1Var == null) {
            c1Var = new c0();
        } else {
            c1Var = new c1(a1Var);
        }
        return new p0(c1Var);
    }

    public static p0 f(Boolean bool) {
        s0 eVar;
        if (bool == null) {
            eVar = new c0();
        } else {
            eVar = new e(bool);
        }
        return new p0(eVar);
    }

    public static p0 g(Double d10) {
        s0 mVar;
        if (d10 == null) {
            mVar = new c0();
        } else {
            mVar = new m(d10);
        }
        return new p0(mVar);
    }

    public static p0 h(Integer num) {
        s0 wVar;
        if (num == null) {
            wVar = new c0();
        } else {
            wVar = new w(num);
        }
        return new p0(wVar);
    }

    public static p0 i(String str) {
        s0 l1Var;
        if (str == null) {
            l1Var = new c0();
        } else {
            l1Var = new l1(str);
        }
        return new p0(l1Var);
    }

    public static p0 j(Date date) {
        s0 iVar;
        if (date == null) {
            iVar = new c0();
        } else {
            iVar = new i(date);
        }
        return new p0(iVar);
    }

    public <T extends a1> T a(Class<T> cls) {
        return (T) this.f18080a.g(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long b() {
        return this.f18080a.c();
    }

    public a c() {
        return this.f18080a.e();
    }

    public Class<?> d() {
        return this.f18080a.f();
    }

    @SuppressFBWarnings({"NP_METHOD_PARAMETER_TIGHTENS_ANNOTATION"})
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        return this.f18080a.equals(((p0) obj).f18080a);
    }

    public final int hashCode() {
        return this.f18080a.hashCode();
    }

    public String toString() {
        return this.f18080a.toString();
    }
}
