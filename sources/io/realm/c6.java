package io.realm;

import com.habitrpg.android.habitica.models.user.Buffs;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_BuffsRealmProxy.java */
/* loaded from: classes4.dex */
public class c6 extends Buffs implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17379r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17380p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Buffs> f17381q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_BuffsRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17382e;

        /* renamed from: f  reason: collision with root package name */
        long f17383f;

        /* renamed from: g  reason: collision with root package name */
        long f17384g;

        /* renamed from: h  reason: collision with root package name */
        long f17385h;

        /* renamed from: i  reason: collision with root package name */
        long f17386i;

        /* renamed from: j  reason: collision with root package name */
        long f17387j;

        /* renamed from: k  reason: collision with root package name */
        long f17388k;

        /* renamed from: l  reason: collision with root package name */
        long f17389l;

        /* renamed from: m  reason: collision with root package name */
        long f17390m;

        a(OsSchemaInfo osSchemaInfo) {
            super(9);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Buffs");
            this.f17382e = a("con", "con", b10);
            this.f17383f = a("str", "str", b10);
            this.f17384g = a("per", "per", b10);
            this.f17385h = a("_int", "_int", b10);
            this.f17386i = a("seafoam", "seafoam", b10);
            this.f17387j = a("spookySparkles", "spookySparkles", b10);
            this.f17388k = a("shinySeed", "shinySeed", b10);
            this.f17389l = a("snowball", "snowball", b10);
            this.f17390m = a("streaks", "streaks", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17382e = aVar.f17382e;
            aVar2.f17383f = aVar.f17383f;
            aVar2.f17384g = aVar.f17384g;
            aVar2.f17385h = aVar.f17385h;
            aVar2.f17386i = aVar.f17386i;
            aVar2.f17387j = aVar.f17387j;
            aVar2.f17388k = aVar.f17388k;
            aVar2.f17389l = aVar.f17389l;
            aVar2.f17390m = aVar.f17390m;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c6() {
        this.f17381q.p();
    }

    public static Buffs c(o0 o0Var, a aVar, Buffs buffs, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(buffs);
        if (oVar != null) {
            return (Buffs) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Buffs.class), set);
        osObjectBuilder.T0(aVar.f17382e, buffs.realmGet$con());
        osObjectBuilder.T0(aVar.f17383f, buffs.realmGet$str());
        osObjectBuilder.T0(aVar.f17384g, buffs.realmGet$per());
        osObjectBuilder.T0(aVar.f17385h, buffs.realmGet$_int());
        osObjectBuilder.F0(aVar.f17386i, buffs.realmGet$seafoam());
        osObjectBuilder.F0(aVar.f17387j, buffs.realmGet$spookySparkles());
        osObjectBuilder.F0(aVar.f17388k, buffs.realmGet$shinySeed());
        osObjectBuilder.F0(aVar.f17389l, buffs.realmGet$snowball());
        osObjectBuilder.F0(aVar.f17390m, buffs.realmGet$streaks());
        c6 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(buffs, k10);
        return k10;
    }

    public static Buffs d(o0 o0Var, a aVar, Buffs buffs, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((buffs instanceof io.realm.internal.o) && !d1.isFrozen(buffs)) {
            io.realm.internal.o oVar = (io.realm.internal.o) buffs;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return buffs;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(buffs);
        if (oVar2 != null) {
            return (Buffs) oVar2;
        }
        return c(o0Var, aVar, buffs, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Buffs f(Buffs buffs, int i10, int i11, Map<a1, o.a<a1>> map) {
        Buffs buffs2;
        if (i10 <= i11 && buffs != null) {
            o.a<a1> aVar = map.get(buffs);
            if (aVar == null) {
                buffs2 = new Buffs();
                map.put(buffs, new o.a<>(i10, buffs2));
            } else if (i10 >= aVar.f17831a) {
                return (Buffs) aVar.f17832b;
            } else {
                Buffs buffs3 = (Buffs) aVar.f17832b;
                aVar.f17831a = i10;
                buffs2 = buffs3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) buffs).b().f();
            buffs2.realmSet$con(buffs.realmGet$con());
            buffs2.realmSet$str(buffs.realmGet$str());
            buffs2.realmSet$per(buffs.realmGet$per());
            buffs2.realmSet$_int(buffs.realmGet$_int());
            buffs2.realmSet$seafoam(buffs.realmGet$seafoam());
            buffs2.realmSet$spookySparkles(buffs.realmGet$spookySparkles());
            buffs2.realmSet$shinySeed(buffs.realmGet$shinySeed());
            buffs2.realmSet$snowball(buffs.realmGet$snowball());
            buffs2.realmSet$streaks(buffs.realmGet$streaks());
            return buffs2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Buffs", true, 9, 0);
        RealmFieldType realmFieldType = RealmFieldType.FLOAT;
        bVar.b("", "con", realmFieldType, false, false, false);
        bVar.b("", "str", realmFieldType, false, false, false);
        bVar.b("", "per", realmFieldType, false, false, false);
        bVar.b("", "_int", realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.BOOLEAN;
        bVar.b("", "seafoam", realmFieldType2, false, false, false);
        bVar.b("", "spookySparkles", realmFieldType2, false, false, false);
        bVar.b("", "shinySeed", realmFieldType2, false, false, false);
        bVar.b("", "snowball", realmFieldType2, false, false, false);
        bVar.b("", "streaks", realmFieldType2, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17379r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Buffs buffs, Map<a1, Long> map) {
        if ((buffs instanceof io.realm.internal.o) && !d1.isFrozen(buffs)) {
            io.realm.internal.o oVar = (io.realm.internal.o) buffs;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(Buffs.class).getNativePtr();
        a aVar = (a) o0Var.R().e(Buffs.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(buffs, Long.valueOf(createEmbeddedObject));
        Float realmGet$con = buffs.realmGet$con();
        if (realmGet$con != null) {
            Table.nativeSetFloat(nativePtr, aVar.f17382e, createEmbeddedObject, realmGet$con.floatValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17382e, createEmbeddedObject, false);
        }
        Float realmGet$str = buffs.realmGet$str();
        if (realmGet$str != null) {
            Table.nativeSetFloat(nativePtr, aVar.f17383f, createEmbeddedObject, realmGet$str.floatValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17383f, createEmbeddedObject, false);
        }
        Float realmGet$per = buffs.realmGet$per();
        if (realmGet$per != null) {
            Table.nativeSetFloat(nativePtr, aVar.f17384g, createEmbeddedObject, realmGet$per.floatValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17384g, createEmbeddedObject, false);
        }
        Float realmGet$_int = buffs.realmGet$_int();
        if (realmGet$_int != null) {
            Table.nativeSetFloat(nativePtr, aVar.f17385h, createEmbeddedObject, realmGet$_int.floatValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17385h, createEmbeddedObject, false);
        }
        Boolean realmGet$seafoam = buffs.realmGet$seafoam();
        if (realmGet$seafoam != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f17386i, createEmbeddedObject, realmGet$seafoam.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17386i, createEmbeddedObject, false);
        }
        Boolean realmGet$spookySparkles = buffs.realmGet$spookySparkles();
        if (realmGet$spookySparkles != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f17387j, createEmbeddedObject, realmGet$spookySparkles.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17387j, createEmbeddedObject, false);
        }
        Boolean realmGet$shinySeed = buffs.realmGet$shinySeed();
        if (realmGet$shinySeed != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f17388k, createEmbeddedObject, realmGet$shinySeed.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17388k, createEmbeddedObject, false);
        }
        Boolean realmGet$snowball = buffs.realmGet$snowball();
        if (realmGet$snowball != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f17389l, createEmbeddedObject, realmGet$snowball.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17389l, createEmbeddedObject, false);
        }
        Boolean realmGet$streaks = buffs.realmGet$streaks();
        if (realmGet$streaks != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f17390m, createEmbeddedObject, realmGet$streaks.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17390m, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c6 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Buffs.class), false, Collections.emptyList());
        c6 c6Var = new c6();
        cVar.a();
        return c6Var;
    }

    static Buffs l(o0 o0Var, a aVar, Buffs buffs, Buffs buffs2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Buffs.class), set);
        osObjectBuilder.T0(aVar.f17382e, buffs2.realmGet$con());
        osObjectBuilder.T0(aVar.f17383f, buffs2.realmGet$str());
        osObjectBuilder.T0(aVar.f17384g, buffs2.realmGet$per());
        osObjectBuilder.T0(aVar.f17385h, buffs2.realmGet$_int());
        osObjectBuilder.F0(aVar.f17386i, buffs2.realmGet$seafoam());
        osObjectBuilder.F0(aVar.f17387j, buffs2.realmGet$spookySparkles());
        osObjectBuilder.F0(aVar.f17388k, buffs2.realmGet$shinySeed());
        osObjectBuilder.F0(aVar.f17389l, buffs2.realmGet$snowball());
        osObjectBuilder.F0(aVar.f17390m, buffs2.realmGet$streaks());
        osObjectBuilder.f1((io.realm.internal.o) buffs);
        return buffs;
    }

    public static void n(o0 o0Var, Buffs buffs, Buffs buffs2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Buffs.class), buffs2, buffs, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17381q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17380p = (a) cVar.c();
        l0<Buffs> l0Var = new l0<>(this);
        this.f17381q = l0Var;
        l0Var.r(cVar.e());
        this.f17381q.s(cVar.f());
        this.f17381q.o(cVar.b());
        this.f17381q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17381q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c6 c6Var = (c6) obj;
        io.realm.a f10 = this.f17381q.f();
        io.realm.a f11 = c6Var.f17381q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17381q.g().getTable().p();
        String p11 = c6Var.f17381q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17381q.g().getObjectKey() == c6Var.f17381q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17381q.f().getPath();
        String p10 = this.f17381q.g().getTable().p();
        long objectKey = this.f17381q.g().getObjectKey();
        int i11 = 0;
        if (path != null) {
            i10 = path.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (527 + i10) * 31;
        if (p10 != null) {
            i11 = p10.hashCode();
        }
        return ((i12 + i11) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public Float realmGet$_int() {
        this.f17381q.f().e();
        if (this.f17381q.g().isNull(this.f17380p.f17385h)) {
            return null;
        }
        return Float.valueOf(this.f17381q.g().getFloat(this.f17380p.f17385h));
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public Float realmGet$con() {
        this.f17381q.f().e();
        if (this.f17381q.g().isNull(this.f17380p.f17382e)) {
            return null;
        }
        return Float.valueOf(this.f17381q.g().getFloat(this.f17380p.f17382e));
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public Float realmGet$per() {
        this.f17381q.f().e();
        if (this.f17381q.g().isNull(this.f17380p.f17384g)) {
            return null;
        }
        return Float.valueOf(this.f17381q.g().getFloat(this.f17380p.f17384g));
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public Boolean realmGet$seafoam() {
        this.f17381q.f().e();
        if (this.f17381q.g().isNull(this.f17380p.f17386i)) {
            return null;
        }
        return Boolean.valueOf(this.f17381q.g().getBoolean(this.f17380p.f17386i));
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public Boolean realmGet$shinySeed() {
        this.f17381q.f().e();
        if (this.f17381q.g().isNull(this.f17380p.f17388k)) {
            return null;
        }
        return Boolean.valueOf(this.f17381q.g().getBoolean(this.f17380p.f17388k));
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public Boolean realmGet$snowball() {
        this.f17381q.f().e();
        if (this.f17381q.g().isNull(this.f17380p.f17389l)) {
            return null;
        }
        return Boolean.valueOf(this.f17381q.g().getBoolean(this.f17380p.f17389l));
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public Boolean realmGet$spookySparkles() {
        this.f17381q.f().e();
        if (this.f17381q.g().isNull(this.f17380p.f17387j)) {
            return null;
        }
        return Boolean.valueOf(this.f17381q.g().getBoolean(this.f17380p.f17387j));
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public Float realmGet$str() {
        this.f17381q.f().e();
        if (this.f17381q.g().isNull(this.f17380p.f17383f)) {
            return null;
        }
        return Float.valueOf(this.f17381q.g().getFloat(this.f17380p.f17383f));
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public Boolean realmGet$streaks() {
        this.f17381q.f().e();
        if (this.f17381q.g().isNull(this.f17380p.f17390m)) {
            return null;
        }
        return Boolean.valueOf(this.f17381q.g().getBoolean(this.f17380p.f17390m));
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public void realmSet$_int(Float f10) {
        if (this.f17381q.i()) {
            if (!this.f17381q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17381q.g();
            if (f10 == null) {
                g10.getTable().F(this.f17380p.f17385h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().C(this.f17380p.f17385h, g10.getObjectKey(), f10.floatValue(), true);
                return;
            }
        }
        this.f17381q.f().e();
        if (f10 == null) {
            this.f17381q.g().setNull(this.f17380p.f17385h);
        } else {
            this.f17381q.g().setFloat(this.f17380p.f17385h, f10.floatValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public void realmSet$con(Float f10) {
        if (this.f17381q.i()) {
            if (!this.f17381q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17381q.g();
            if (f10 == null) {
                g10.getTable().F(this.f17380p.f17382e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().C(this.f17380p.f17382e, g10.getObjectKey(), f10.floatValue(), true);
                return;
            }
        }
        this.f17381q.f().e();
        if (f10 == null) {
            this.f17381q.g().setNull(this.f17380p.f17382e);
        } else {
            this.f17381q.g().setFloat(this.f17380p.f17382e, f10.floatValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public void realmSet$per(Float f10) {
        if (this.f17381q.i()) {
            if (!this.f17381q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17381q.g();
            if (f10 == null) {
                g10.getTable().F(this.f17380p.f17384g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().C(this.f17380p.f17384g, g10.getObjectKey(), f10.floatValue(), true);
                return;
            }
        }
        this.f17381q.f().e();
        if (f10 == null) {
            this.f17381q.g().setNull(this.f17380p.f17384g);
        } else {
            this.f17381q.g().setFloat(this.f17380p.f17384g, f10.floatValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public void realmSet$seafoam(Boolean bool) {
        if (this.f17381q.i()) {
            if (!this.f17381q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17381q.g();
            if (bool == null) {
                g10.getTable().F(this.f17380p.f17386i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f17380p.f17386i, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f17381q.f().e();
        if (bool == null) {
            this.f17381q.g().setNull(this.f17380p.f17386i);
        } else {
            this.f17381q.g().setBoolean(this.f17380p.f17386i, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public void realmSet$shinySeed(Boolean bool) {
        if (this.f17381q.i()) {
            if (!this.f17381q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17381q.g();
            if (bool == null) {
                g10.getTable().F(this.f17380p.f17388k, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f17380p.f17388k, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f17381q.f().e();
        if (bool == null) {
            this.f17381q.g().setNull(this.f17380p.f17388k);
        } else {
            this.f17381q.g().setBoolean(this.f17380p.f17388k, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public void realmSet$snowball(Boolean bool) {
        if (this.f17381q.i()) {
            if (!this.f17381q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17381q.g();
            if (bool == null) {
                g10.getTable().F(this.f17380p.f17389l, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f17380p.f17389l, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f17381q.f().e();
        if (bool == null) {
            this.f17381q.g().setNull(this.f17380p.f17389l);
        } else {
            this.f17381q.g().setBoolean(this.f17380p.f17389l, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public void realmSet$spookySparkles(Boolean bool) {
        if (this.f17381q.i()) {
            if (!this.f17381q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17381q.g();
            if (bool == null) {
                g10.getTable().F(this.f17380p.f17387j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f17380p.f17387j, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f17381q.f().e();
        if (bool == null) {
            this.f17381q.g().setNull(this.f17380p.f17387j);
        } else {
            this.f17381q.g().setBoolean(this.f17380p.f17387j, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public void realmSet$str(Float f10) {
        if (this.f17381q.i()) {
            if (!this.f17381q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17381q.g();
            if (f10 == null) {
                g10.getTable().F(this.f17380p.f17383f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().C(this.f17380p.f17383f, g10.getObjectKey(), f10.floatValue(), true);
                return;
            }
        }
        this.f17381q.f().e();
        if (f10 == null) {
            this.f17381q.g().setNull(this.f17380p.f17383f);
        } else {
            this.f17381q.g().setFloat(this.f17380p.f17383f, f10.floatValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Buffs, io.realm.d6
    public void realmSet$streaks(Boolean bool) {
        if (this.f17381q.i()) {
            if (!this.f17381q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17381q.g();
            if (bool == null) {
                g10.getTable().F(this.f17380p.f17390m, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f17380p.f17390m, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f17381q.f().e();
        if (bool == null) {
            this.f17381q.g().setNull(this.f17380p.f17390m);
        } else {
            this.f17381q.g().setBoolean(this.f17380p.f17390m, bool.booleanValue());
        }
    }

    public String toString() {
        Float f10;
        Float f11;
        Float f12;
        Float f13;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Buffs = proxy[");
        sb2.append("{con:");
        Object obj = "null";
        if (realmGet$con() == null) {
            f10 = "null";
        } else {
            f10 = realmGet$con();
        }
        sb2.append(f10);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{str:");
        if (realmGet$str() == null) {
            f11 = "null";
        } else {
            f11 = realmGet$str();
        }
        sb2.append(f11);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{per:");
        if (realmGet$per() == null) {
            f12 = "null";
        } else {
            f12 = realmGet$per();
        }
        sb2.append(f12);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{_int:");
        if (realmGet$_int() == null) {
            f13 = "null";
        } else {
            f13 = realmGet$_int();
        }
        sb2.append(f13);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{seafoam:");
        if (realmGet$seafoam() == null) {
            bool = "null";
        } else {
            bool = realmGet$seafoam();
        }
        sb2.append(bool);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{spookySparkles:");
        if (realmGet$spookySparkles() == null) {
            bool2 = "null";
        } else {
            bool2 = realmGet$spookySparkles();
        }
        sb2.append(bool2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{shinySeed:");
        if (realmGet$shinySeed() == null) {
            bool3 = "null";
        } else {
            bool3 = realmGet$shinySeed();
        }
        sb2.append(bool3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{snowball:");
        if (realmGet$snowball() == null) {
            bool4 = "null";
        } else {
            bool4 = realmGet$snowball();
        }
        sb2.append(bool4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{streaks:");
        if (realmGet$streaks() != null) {
            obj = realmGet$streaks();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
