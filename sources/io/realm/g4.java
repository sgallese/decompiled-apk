package io.realm;

import com.habitrpg.android.habitica.models.members.MemberPreferences;
import com.habitrpg.android.habitica.models.user.Hair;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_members_MemberPreferencesRealmProxy.java */
/* loaded from: classes4.dex */
public class g4 extends MemberPreferences implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17548r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17549p;

    /* renamed from: q  reason: collision with root package name */
    private l0<MemberPreferences> f17550q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_members_MemberPreferencesRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17551e;

        /* renamed from: f  reason: collision with root package name */
        long f17552f;

        /* renamed from: g  reason: collision with root package name */
        long f17553g;

        /* renamed from: h  reason: collision with root package name */
        long f17554h;

        /* renamed from: i  reason: collision with root package name */
        long f17555i;

        /* renamed from: j  reason: collision with root package name */
        long f17556j;

        /* renamed from: k  reason: collision with root package name */
        long f17557k;

        /* renamed from: l  reason: collision with root package name */
        long f17558l;

        /* renamed from: m  reason: collision with root package name */
        long f17559m;

        /* renamed from: n  reason: collision with root package name */
        long f17560n;

        a(OsSchemaInfo osSchemaInfo) {
            super(10);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("MemberPreferences");
            this.f17551e = a("hair", "hair", b10);
            this.f17552f = a("costume", "costume", b10);
            this.f17553g = a("disableClasses", "disableClasses", b10);
            this.f17554h = a("sleep", "sleep", b10);
            this.f17555i = a("shirt", "shirt", b10);
            this.f17556j = a("skin", "skin", b10);
            this.f17557k = a("size", "size", b10);
            this.f17558l = a("background", "background", b10);
            this.f17559m = a("chair", "chair", b10);
            this.f17560n = a("language", "language", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17551e = aVar.f17551e;
            aVar2.f17552f = aVar.f17552f;
            aVar2.f17553g = aVar.f17553g;
            aVar2.f17554h = aVar.f17554h;
            aVar2.f17555i = aVar.f17555i;
            aVar2.f17556j = aVar.f17556j;
            aVar2.f17557k = aVar.f17557k;
            aVar2.f17558l = aVar.f17558l;
            aVar2.f17559m = aVar.f17559m;
            aVar2.f17560n = aVar.f17560n;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g4() {
        this.f17550q.p();
    }

    public static MemberPreferences c(o0 o0Var, a aVar, MemberPreferences memberPreferences, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(memberPreferences);
        if (oVar != null) {
            return (MemberPreferences) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(MemberPreferences.class), set);
        osObjectBuilder.F0(aVar.f17552f, Boolean.valueOf(memberPreferences.realmGet$costume()));
        osObjectBuilder.F0(aVar.f17553g, Boolean.valueOf(memberPreferences.realmGet$disableClasses()));
        osObjectBuilder.F0(aVar.f17554h, Boolean.valueOf(memberPreferences.realmGet$sleep()));
        osObjectBuilder.c1(aVar.f17555i, memberPreferences.realmGet$shirt());
        osObjectBuilder.c1(aVar.f17556j, memberPreferences.realmGet$skin());
        osObjectBuilder.c1(aVar.f17557k, memberPreferences.realmGet$size());
        osObjectBuilder.c1(aVar.f17558l, memberPreferences.realmGet$background());
        osObjectBuilder.c1(aVar.f17559m, memberPreferences.realmGet$chair());
        osObjectBuilder.c1(aVar.f17560n, memberPreferences.realmGet$language());
        g4 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(memberPreferences, k10);
        Hair realmGet$hair = memberPreferences.realmGet$hair();
        if (realmGet$hair == null) {
            k10.realmSet$hair(null);
        } else if (((Hair) map.get(realmGet$hair)) == null) {
            o6 k11 = o6.k(o0Var, o0Var.c1(Hair.class).s(k10.b().g().createEmbeddedObject(aVar.f17551e, RealmFieldType.OBJECT)));
            map.put(realmGet$hair, k11);
            o6.n(o0Var, realmGet$hair, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachehair.toString()");
        }
        return k10;
    }

    public static MemberPreferences d(o0 o0Var, a aVar, MemberPreferences memberPreferences, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((memberPreferences instanceof io.realm.internal.o) && !d1.isFrozen(memberPreferences)) {
            io.realm.internal.o oVar = (io.realm.internal.o) memberPreferences;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return memberPreferences;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(memberPreferences);
        if (oVar2 != null) {
            return (MemberPreferences) oVar2;
        }
        return c(o0Var, aVar, memberPreferences, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static MemberPreferences f(MemberPreferences memberPreferences, int i10, int i11, Map<a1, o.a<a1>> map) {
        MemberPreferences memberPreferences2;
        if (i10 <= i11 && memberPreferences != null) {
            o.a<a1> aVar = map.get(memberPreferences);
            if (aVar == null) {
                memberPreferences2 = new MemberPreferences();
                map.put(memberPreferences, new o.a<>(i10, memberPreferences2));
            } else if (i10 >= aVar.f17831a) {
                return (MemberPreferences) aVar.f17832b;
            } else {
                MemberPreferences memberPreferences3 = (MemberPreferences) aVar.f17832b;
                aVar.f17831a = i10;
                memberPreferences2 = memberPreferences3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) memberPreferences).b().f();
            memberPreferences2.realmSet$hair(o6.f(memberPreferences.realmGet$hair(), i10 + 1, i11, map));
            memberPreferences2.realmSet$costume(memberPreferences.realmGet$costume());
            memberPreferences2.realmSet$disableClasses(memberPreferences.realmGet$disableClasses());
            memberPreferences2.realmSet$sleep(memberPreferences.realmGet$sleep());
            memberPreferences2.realmSet$shirt(memberPreferences.realmGet$shirt());
            memberPreferences2.realmSet$skin(memberPreferences.realmGet$skin());
            memberPreferences2.realmSet$size(memberPreferences.realmGet$size());
            memberPreferences2.realmSet$background(memberPreferences.realmGet$background());
            memberPreferences2.realmSet$chair(memberPreferences.realmGet$chair());
            memberPreferences2.realmSet$language(memberPreferences.realmGet$language());
            return memberPreferences2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "MemberPreferences", true, 10, 0);
        bVar.a("", "hair", RealmFieldType.OBJECT, "Hair");
        RealmFieldType realmFieldType = RealmFieldType.BOOLEAN;
        bVar.b("", "costume", realmFieldType, false, false, true);
        bVar.b("", "disableClasses", realmFieldType, false, false, true);
        bVar.b("", "sleep", realmFieldType, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.STRING;
        bVar.b("", "shirt", realmFieldType2, false, false, false);
        bVar.b("", "skin", realmFieldType2, false, false, false);
        bVar.b("", "size", realmFieldType2, false, false, false);
        bVar.b("", "background", realmFieldType2, false, false, false);
        bVar.b("", "chair", realmFieldType2, false, false, false);
        bVar.b("", "language", realmFieldType2, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17548r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, MemberPreferences memberPreferences, Map<a1, Long> map) {
        if ((memberPreferences instanceof io.realm.internal.o) && !d1.isFrozen(memberPreferences)) {
            io.realm.internal.o oVar = (io.realm.internal.o) memberPreferences;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(MemberPreferences.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(MemberPreferences.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(memberPreferences, Long.valueOf(createEmbeddedObject));
        Hair realmGet$hair = memberPreferences.realmGet$hair();
        if (realmGet$hair != null) {
            Long l10 = map.get(realmGet$hair);
            if (l10 == null) {
                o6.i(o0Var, c12, aVar.f17551e, createEmbeddedObject, realmGet$hair, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17551e, createEmbeddedObject);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f17552f, createEmbeddedObject, memberPreferences.realmGet$costume(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17553g, createEmbeddedObject, memberPreferences.realmGet$disableClasses(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17554h, createEmbeddedObject, memberPreferences.realmGet$sleep(), false);
        String realmGet$shirt = memberPreferences.realmGet$shirt();
        if (realmGet$shirt != null) {
            Table.nativeSetString(nativePtr, aVar.f17555i, createEmbeddedObject, realmGet$shirt, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17555i, createEmbeddedObject, false);
        }
        String realmGet$skin = memberPreferences.realmGet$skin();
        if (realmGet$skin != null) {
            Table.nativeSetString(nativePtr, aVar.f17556j, createEmbeddedObject, realmGet$skin, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17556j, createEmbeddedObject, false);
        }
        String realmGet$size = memberPreferences.realmGet$size();
        if (realmGet$size != null) {
            Table.nativeSetString(nativePtr, aVar.f17557k, createEmbeddedObject, realmGet$size, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17557k, createEmbeddedObject, false);
        }
        String realmGet$background = memberPreferences.realmGet$background();
        if (realmGet$background != null) {
            Table.nativeSetString(nativePtr, aVar.f17558l, createEmbeddedObject, realmGet$background, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17558l, createEmbeddedObject, false);
        }
        String realmGet$chair = memberPreferences.realmGet$chair();
        if (realmGet$chair != null) {
            Table.nativeSetString(nativePtr, aVar.f17559m, createEmbeddedObject, realmGet$chair, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17559m, createEmbeddedObject, false);
        }
        String realmGet$language = memberPreferences.realmGet$language();
        if (realmGet$language != null) {
            Table.nativeSetString(nativePtr, aVar.f17560n, createEmbeddedObject, realmGet$language, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17560n, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g4 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(MemberPreferences.class), false, Collections.emptyList());
        g4 g4Var = new g4();
        cVar.a();
        return g4Var;
    }

    static MemberPreferences l(o0 o0Var, a aVar, MemberPreferences memberPreferences, MemberPreferences memberPreferences2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(MemberPreferences.class), set);
        Hair realmGet$hair = memberPreferences2.realmGet$hair();
        if (realmGet$hair == null) {
            osObjectBuilder.Z0(aVar.f17551e);
        } else if (((Hair) map.get(realmGet$hair)) == null) {
            o6 k10 = o6.k(o0Var, o0Var.c1(Hair.class).s(((io.realm.internal.o) memberPreferences).b().g().createEmbeddedObject(aVar.f17551e, RealmFieldType.OBJECT)));
            map.put(realmGet$hair, k10);
            o6.n(o0Var, realmGet$hair, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachehair.toString()");
        }
        osObjectBuilder.F0(aVar.f17552f, Boolean.valueOf(memberPreferences2.realmGet$costume()));
        osObjectBuilder.F0(aVar.f17553g, Boolean.valueOf(memberPreferences2.realmGet$disableClasses()));
        osObjectBuilder.F0(aVar.f17554h, Boolean.valueOf(memberPreferences2.realmGet$sleep()));
        osObjectBuilder.c1(aVar.f17555i, memberPreferences2.realmGet$shirt());
        osObjectBuilder.c1(aVar.f17556j, memberPreferences2.realmGet$skin());
        osObjectBuilder.c1(aVar.f17557k, memberPreferences2.realmGet$size());
        osObjectBuilder.c1(aVar.f17558l, memberPreferences2.realmGet$background());
        osObjectBuilder.c1(aVar.f17559m, memberPreferences2.realmGet$chair());
        osObjectBuilder.c1(aVar.f17560n, memberPreferences2.realmGet$language());
        osObjectBuilder.f1((io.realm.internal.o) memberPreferences);
        return memberPreferences;
    }

    public static void n(o0 o0Var, MemberPreferences memberPreferences, MemberPreferences memberPreferences2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(MemberPreferences.class), memberPreferences2, memberPreferences, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17550q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17549p = (a) cVar.c();
        l0<MemberPreferences> l0Var = new l0<>(this);
        this.f17550q = l0Var;
        l0Var.r(cVar.e());
        this.f17550q.s(cVar.f());
        this.f17550q.o(cVar.b());
        this.f17550q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17550q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g4 g4Var = (g4) obj;
        io.realm.a f10 = this.f17550q.f();
        io.realm.a f11 = g4Var.f17550q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17550q.g().getTable().p();
        String p11 = g4Var.f17550q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17550q.g().getObjectKey() == g4Var.f17550q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17550q.f().getPath();
        String p10 = this.f17550q.g().getTable().p();
        long objectKey = this.f17550q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public String realmGet$background() {
        this.f17550q.f().e();
        return this.f17550q.g().getString(this.f17549p.f17558l);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public String realmGet$chair() {
        this.f17550q.f().e();
        return this.f17550q.g().getString(this.f17549p.f17559m);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public boolean realmGet$costume() {
        this.f17550q.f().e();
        return this.f17550q.g().getBoolean(this.f17549p.f17552f);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public boolean realmGet$disableClasses() {
        this.f17550q.f().e();
        return this.f17550q.g().getBoolean(this.f17549p.f17553g);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public Hair realmGet$hair() {
        this.f17550q.f().e();
        if (this.f17550q.g().isNullLink(this.f17549p.f17551e)) {
            return null;
        }
        return (Hair) this.f17550q.f().B(Hair.class, this.f17550q.g().getLink(this.f17549p.f17551e), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public String realmGet$language() {
        this.f17550q.f().e();
        return this.f17550q.g().getString(this.f17549p.f17560n);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public String realmGet$shirt() {
        this.f17550q.f().e();
        return this.f17550q.g().getString(this.f17549p.f17555i);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public String realmGet$size() {
        this.f17550q.f().e();
        return this.f17550q.g().getString(this.f17549p.f17557k);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public String realmGet$skin() {
        this.f17550q.f().e();
        return this.f17550q.g().getString(this.f17549p.f17556j);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public boolean realmGet$sleep() {
        this.f17550q.f().e();
        return this.f17550q.g().getBoolean(this.f17549p.f17554h);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public void realmSet$background(String str) {
        if (this.f17550q.i()) {
            if (!this.f17550q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17550q.g();
            if (str == null) {
                g10.getTable().F(this.f17549p.f17558l, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17549p.f17558l, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17550q.f().e();
        if (str == null) {
            this.f17550q.g().setNull(this.f17549p.f17558l);
        } else {
            this.f17550q.g().setString(this.f17549p.f17558l, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public void realmSet$chair(String str) {
        if (this.f17550q.i()) {
            if (!this.f17550q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17550q.g();
            if (str == null) {
                g10.getTable().F(this.f17549p.f17559m, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17549p.f17559m, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17550q.f().e();
        if (str == null) {
            this.f17550q.g().setNull(this.f17549p.f17559m);
        } else {
            this.f17550q.g().setString(this.f17549p.f17559m, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public void realmSet$costume(boolean z10) {
        if (this.f17550q.i()) {
            if (!this.f17550q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17550q.g();
            g10.getTable().z(this.f17549p.f17552f, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17550q.f().e();
        this.f17550q.g().setBoolean(this.f17549p.f17552f, z10);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public void realmSet$disableClasses(boolean z10) {
        if (this.f17550q.i()) {
            if (!this.f17550q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17550q.g();
            g10.getTable().z(this.f17549p.f17553g, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17550q.f().e();
        this.f17550q.g().setBoolean(this.f17549p.f17553g, z10);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public void realmSet$hair(Hair hair) {
        o0 o0Var = (o0) this.f17550q.f();
        if (this.f17550q.i()) {
            if (!this.f17550q.d() || this.f17550q.e().contains("hair")) {
                return;
            }
            if (hair != null && !d1.isManaged(hair)) {
                Hair hair2 = (Hair) o0Var.J0(Hair.class, this, "hair");
                o6.n(o0Var, hair, hair2, new HashMap(), Collections.EMPTY_SET);
                hair = hair2;
            }
            io.realm.internal.q g10 = this.f17550q.g();
            if (hair == null) {
                g10.nullifyLink(this.f17549p.f17551e);
                return;
            }
            this.f17550q.c(hair);
            g10.getTable().D(this.f17549p.f17551e, g10.getObjectKey(), ((io.realm.internal.o) hair).b().g().getObjectKey(), true);
            return;
        }
        this.f17550q.f().e();
        if (hair == null) {
            this.f17550q.g().nullifyLink(this.f17549p.f17551e);
            return;
        }
        if (d1.isManaged(hair)) {
            this.f17550q.c(hair);
        }
        o6.n(o0Var, hair, (Hair) o0Var.J0(Hair.class, this, "hair"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public void realmSet$language(String str) {
        if (this.f17550q.i()) {
            if (!this.f17550q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17550q.g();
            if (str == null) {
                g10.getTable().F(this.f17549p.f17560n, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17549p.f17560n, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17550q.f().e();
        if (str == null) {
            this.f17550q.g().setNull(this.f17549p.f17560n);
        } else {
            this.f17550q.g().setString(this.f17549p.f17560n, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public void realmSet$shirt(String str) {
        if (this.f17550q.i()) {
            if (!this.f17550q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17550q.g();
            if (str == null) {
                g10.getTable().F(this.f17549p.f17555i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17549p.f17555i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17550q.f().e();
        if (str == null) {
            this.f17550q.g().setNull(this.f17549p.f17555i);
        } else {
            this.f17550q.g().setString(this.f17549p.f17555i, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public void realmSet$size(String str) {
        if (this.f17550q.i()) {
            if (!this.f17550q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17550q.g();
            if (str == null) {
                g10.getTable().F(this.f17549p.f17557k, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17549p.f17557k, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17550q.f().e();
        if (str == null) {
            this.f17550q.g().setNull(this.f17549p.f17557k);
        } else {
            this.f17550q.g().setString(this.f17549p.f17557k, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public void realmSet$skin(String str) {
        if (this.f17550q.i()) {
            if (!this.f17550q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17550q.g();
            if (str == null) {
                g10.getTable().F(this.f17549p.f17556j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17549p.f17556j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17550q.f().e();
        if (str == null) {
            this.f17550q.g().setNull(this.f17549p.f17556j);
        } else {
            this.f17550q.g().setString(this.f17549p.f17556j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberPreferences, io.realm.h4
    public void realmSet$sleep(boolean z10) {
        if (this.f17550q.i()) {
            if (!this.f17550q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17550q.g();
            g10.getTable().z(this.f17549p.f17554h, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17550q.f().e();
        this.f17550q.g().setBoolean(this.f17549p.f17554h, z10);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("MemberPreferences = proxy[");
        sb2.append("{hair:");
        String str7 = "null";
        if (realmGet$hair() == null) {
            str = "null";
        } else {
            str = "Hair";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{costume:");
        sb2.append(realmGet$costume());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{disableClasses:");
        sb2.append(realmGet$disableClasses());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{sleep:");
        sb2.append(realmGet$sleep());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{shirt:");
        if (realmGet$shirt() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$shirt();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{skin:");
        if (realmGet$skin() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$skin();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{size:");
        if (realmGet$size() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$size();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{background:");
        if (realmGet$background() == null) {
            str5 = "null";
        } else {
            str5 = realmGet$background();
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{chair:");
        if (realmGet$chair() == null) {
            str6 = "null";
        } else {
            str6 = realmGet$chair();
        }
        sb2.append(str6);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{language:");
        if (realmGet$language() != null) {
            str7 = realmGet$language();
        }
        sb2.append(str7);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
