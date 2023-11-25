package io.realm;

import com.habitrpg.android.habitica.models.members.MemberFlags;
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

/* compiled from: com_habitrpg_android_habitica_models_members_MemberFlagsRealmProxy.java */
/* loaded from: classes4.dex */
public class e4 extends MemberFlags implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17478r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17479p;

    /* renamed from: q  reason: collision with root package name */
    private l0<MemberFlags> f17480q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_members_MemberFlagsRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17481e;

        /* renamed from: f  reason: collision with root package name */
        long f17482f;

        /* renamed from: g  reason: collision with root package name */
        long f17483g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("MemberFlags");
            this.f17481e = a("chatShadowMuted", "chatShadowMuted", b10);
            this.f17482f = a("chatRevoked", "chatRevoked", b10);
            this.f17483g = a("classSelected", "classSelected", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17481e = aVar.f17481e;
            aVar2.f17482f = aVar.f17482f;
            aVar2.f17483g = aVar.f17483g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e4() {
        this.f17480q.p();
    }

    public static MemberFlags c(o0 o0Var, a aVar, MemberFlags memberFlags, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(memberFlags);
        if (oVar != null) {
            return (MemberFlags) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(MemberFlags.class), set);
        osObjectBuilder.F0(aVar.f17481e, Boolean.valueOf(memberFlags.realmGet$chatShadowMuted()));
        osObjectBuilder.F0(aVar.f17482f, Boolean.valueOf(memberFlags.realmGet$chatRevoked()));
        osObjectBuilder.F0(aVar.f17483g, Boolean.valueOf(memberFlags.realmGet$classSelected()));
        e4 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(memberFlags, k10);
        return k10;
    }

    public static MemberFlags d(o0 o0Var, a aVar, MemberFlags memberFlags, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((memberFlags instanceof io.realm.internal.o) && !d1.isFrozen(memberFlags)) {
            io.realm.internal.o oVar = (io.realm.internal.o) memberFlags;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return memberFlags;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(memberFlags);
        if (oVar2 != null) {
            return (MemberFlags) oVar2;
        }
        return c(o0Var, aVar, memberFlags, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static MemberFlags f(MemberFlags memberFlags, int i10, int i11, Map<a1, o.a<a1>> map) {
        MemberFlags memberFlags2;
        if (i10 <= i11 && memberFlags != null) {
            o.a<a1> aVar = map.get(memberFlags);
            if (aVar == null) {
                memberFlags2 = new MemberFlags();
                map.put(memberFlags, new o.a<>(i10, memberFlags2));
            } else if (i10 >= aVar.f17831a) {
                return (MemberFlags) aVar.f17832b;
            } else {
                MemberFlags memberFlags3 = (MemberFlags) aVar.f17832b;
                aVar.f17831a = i10;
                memberFlags2 = memberFlags3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) memberFlags).b().f();
            memberFlags2.realmSet$chatShadowMuted(memberFlags.realmGet$chatShadowMuted());
            memberFlags2.realmSet$chatRevoked(memberFlags.realmGet$chatRevoked());
            memberFlags2.realmSet$classSelected(memberFlags.realmGet$classSelected());
            return memberFlags2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "MemberFlags", true, 3, 0);
        RealmFieldType realmFieldType = RealmFieldType.BOOLEAN;
        bVar.b("", "chatShadowMuted", realmFieldType, false, false, true);
        bVar.b("", "chatRevoked", realmFieldType, false, false, true);
        bVar.b("", "classSelected", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17478r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, MemberFlags memberFlags, Map<a1, Long> map) {
        if ((memberFlags instanceof io.realm.internal.o) && !d1.isFrozen(memberFlags)) {
            io.realm.internal.o oVar = (io.realm.internal.o) memberFlags;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(MemberFlags.class).getNativePtr();
        a aVar = (a) o0Var.R().e(MemberFlags.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(memberFlags, Long.valueOf(createEmbeddedObject));
        Table.nativeSetBoolean(nativePtr, aVar.f17481e, createEmbeddedObject, memberFlags.realmGet$chatShadowMuted(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17482f, createEmbeddedObject, memberFlags.realmGet$chatRevoked(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17483g, createEmbeddedObject, memberFlags.realmGet$classSelected(), false);
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e4 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(MemberFlags.class), false, Collections.emptyList());
        e4 e4Var = new e4();
        cVar.a();
        return e4Var;
    }

    static MemberFlags l(o0 o0Var, a aVar, MemberFlags memberFlags, MemberFlags memberFlags2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(MemberFlags.class), set);
        osObjectBuilder.F0(aVar.f17481e, Boolean.valueOf(memberFlags2.realmGet$chatShadowMuted()));
        osObjectBuilder.F0(aVar.f17482f, Boolean.valueOf(memberFlags2.realmGet$chatRevoked()));
        osObjectBuilder.F0(aVar.f17483g, Boolean.valueOf(memberFlags2.realmGet$classSelected()));
        osObjectBuilder.f1((io.realm.internal.o) memberFlags);
        return memberFlags;
    }

    public static void n(o0 o0Var, MemberFlags memberFlags, MemberFlags memberFlags2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(MemberFlags.class), memberFlags2, memberFlags, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17480q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17479p = (a) cVar.c();
        l0<MemberFlags> l0Var = new l0<>(this);
        this.f17480q = l0Var;
        l0Var.r(cVar.e());
        this.f17480q.s(cVar.f());
        this.f17480q.o(cVar.b());
        this.f17480q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17480q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e4 e4Var = (e4) obj;
        io.realm.a f10 = this.f17480q.f();
        io.realm.a f11 = e4Var.f17480q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17480q.g().getTable().p();
        String p11 = e4Var.f17480q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17480q.g().getObjectKey() == e4Var.f17480q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17480q.f().getPath();
        String p10 = this.f17480q.g().getTable().p();
        long objectKey = this.f17480q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.members.MemberFlags, io.realm.f4
    public boolean realmGet$chatRevoked() {
        this.f17480q.f().e();
        return this.f17480q.g().getBoolean(this.f17479p.f17482f);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberFlags, io.realm.f4
    public boolean realmGet$chatShadowMuted() {
        this.f17480q.f().e();
        return this.f17480q.g().getBoolean(this.f17479p.f17481e);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberFlags, io.realm.f4
    public boolean realmGet$classSelected() {
        this.f17480q.f().e();
        return this.f17480q.g().getBoolean(this.f17479p.f17483g);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberFlags, io.realm.f4
    public void realmSet$chatRevoked(boolean z10) {
        if (this.f17480q.i()) {
            if (!this.f17480q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17480q.g();
            g10.getTable().z(this.f17479p.f17482f, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17480q.f().e();
        this.f17480q.g().setBoolean(this.f17479p.f17482f, z10);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberFlags, io.realm.f4
    public void realmSet$chatShadowMuted(boolean z10) {
        if (this.f17480q.i()) {
            if (!this.f17480q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17480q.g();
            g10.getTable().z(this.f17479p.f17481e, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17480q.f().e();
        this.f17480q.g().setBoolean(this.f17479p.f17481e, z10);
    }

    @Override // com.habitrpg.android.habitica.models.members.MemberFlags, io.realm.f4
    public void realmSet$classSelected(boolean z10) {
        if (this.f17480q.i()) {
            if (!this.f17480q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17480q.g();
            g10.getTable().z(this.f17479p.f17483g, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17480q.f().e();
        this.f17480q.g().setBoolean(this.f17479p.f17483g, z10);
    }

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "MemberFlags = proxy[{chatShadowMuted:" + realmGet$chatShadowMuted() + "},{chatRevoked:" + realmGet$chatRevoked() + "},{classSelected:" + realmGet$classSelected() + "}]";
    }
}
