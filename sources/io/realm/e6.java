package io.realm;

import com.habitrpg.android.habitica.models.user.ContributorInfo;
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

/* compiled from: com_habitrpg_android_habitica_models_user_ContributorInfoRealmProxy.java */
/* loaded from: classes4.dex */
public class e6 extends ContributorInfo implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17492r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17493p;

    /* renamed from: q  reason: collision with root package name */
    private l0<ContributorInfo> f17494q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_ContributorInfoRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17495e;

        /* renamed from: f  reason: collision with root package name */
        long f17496f;

        /* renamed from: g  reason: collision with root package name */
        long f17497g;

        /* renamed from: h  reason: collision with root package name */
        long f17498h;

        a(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("ContributorInfo");
            this.f17495e = a("admin", "admin", b10);
            this.f17496f = a("contributions", "contributions", b10);
            this.f17497g = a("level", "level", b10);
            this.f17498h = a("text", "text", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17495e = aVar.f17495e;
            aVar2.f17496f = aVar.f17496f;
            aVar2.f17497g = aVar.f17497g;
            aVar2.f17498h = aVar.f17498h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e6() {
        this.f17494q.p();
    }

    public static ContributorInfo c(o0 o0Var, a aVar, ContributorInfo contributorInfo, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(contributorInfo);
        if (oVar != null) {
            return (ContributorInfo) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ContributorInfo.class), set);
        osObjectBuilder.F0(aVar.f17495e, Boolean.valueOf(contributorInfo.realmGet$admin()));
        osObjectBuilder.c1(aVar.f17496f, contributorInfo.realmGet$contributions());
        osObjectBuilder.V0(aVar.f17497g, Integer.valueOf(contributorInfo.realmGet$level()));
        osObjectBuilder.c1(aVar.f17498h, contributorInfo.realmGet$text());
        e6 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(contributorInfo, k10);
        return k10;
    }

    public static ContributorInfo d(o0 o0Var, a aVar, ContributorInfo contributorInfo, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((contributorInfo instanceof io.realm.internal.o) && !d1.isFrozen(contributorInfo)) {
            io.realm.internal.o oVar = (io.realm.internal.o) contributorInfo;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return contributorInfo;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(contributorInfo);
        if (oVar2 != null) {
            return (ContributorInfo) oVar2;
        }
        return c(o0Var, aVar, contributorInfo, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ContributorInfo f(ContributorInfo contributorInfo, int i10, int i11, Map<a1, o.a<a1>> map) {
        ContributorInfo contributorInfo2;
        if (i10 <= i11 && contributorInfo != null) {
            o.a<a1> aVar = map.get(contributorInfo);
            if (aVar == null) {
                contributorInfo2 = new ContributorInfo();
                map.put(contributorInfo, new o.a<>(i10, contributorInfo2));
            } else if (i10 >= aVar.f17831a) {
                return (ContributorInfo) aVar.f17832b;
            } else {
                ContributorInfo contributorInfo3 = (ContributorInfo) aVar.f17832b;
                aVar.f17831a = i10;
                contributorInfo2 = contributorInfo3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) contributorInfo).b().f();
            contributorInfo2.realmSet$admin(contributorInfo.realmGet$admin());
            contributorInfo2.realmSet$contributions(contributorInfo.realmGet$contributions());
            contributorInfo2.realmSet$level(contributorInfo.realmGet$level());
            contributorInfo2.realmSet$text(contributorInfo.realmGet$text());
            return contributorInfo2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ContributorInfo", true, 4, 0);
        bVar.b("", "admin", RealmFieldType.BOOLEAN, false, false, true);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "contributions", realmFieldType, false, false, false);
        bVar.b("", "level", RealmFieldType.INTEGER, false, false, true);
        bVar.b("", "text", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17492r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, ContributorInfo contributorInfo, Map<a1, Long> map) {
        if ((contributorInfo instanceof io.realm.internal.o) && !d1.isFrozen(contributorInfo)) {
            io.realm.internal.o oVar = (io.realm.internal.o) contributorInfo;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(ContributorInfo.class).getNativePtr();
        a aVar = (a) o0Var.R().e(ContributorInfo.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(contributorInfo, Long.valueOf(createEmbeddedObject));
        Table.nativeSetBoolean(nativePtr, aVar.f17495e, createEmbeddedObject, contributorInfo.realmGet$admin(), false);
        String realmGet$contributions = contributorInfo.realmGet$contributions();
        if (realmGet$contributions != null) {
            Table.nativeSetString(nativePtr, aVar.f17496f, createEmbeddedObject, realmGet$contributions, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17496f, createEmbeddedObject, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f17497g, createEmbeddedObject, contributorInfo.realmGet$level(), false);
        String realmGet$text = contributorInfo.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar.f17498h, createEmbeddedObject, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17498h, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e6 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(ContributorInfo.class), false, Collections.emptyList());
        e6 e6Var = new e6();
        cVar.a();
        return e6Var;
    }

    static ContributorInfo l(o0 o0Var, a aVar, ContributorInfo contributorInfo, ContributorInfo contributorInfo2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ContributorInfo.class), set);
        osObjectBuilder.F0(aVar.f17495e, Boolean.valueOf(contributorInfo2.realmGet$admin()));
        osObjectBuilder.c1(aVar.f17496f, contributorInfo2.realmGet$contributions());
        osObjectBuilder.V0(aVar.f17497g, Integer.valueOf(contributorInfo2.realmGet$level()));
        osObjectBuilder.c1(aVar.f17498h, contributorInfo2.realmGet$text());
        osObjectBuilder.f1((io.realm.internal.o) contributorInfo);
        return contributorInfo;
    }

    public static void n(o0 o0Var, ContributorInfo contributorInfo, ContributorInfo contributorInfo2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(ContributorInfo.class), contributorInfo2, contributorInfo, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17494q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17493p = (a) cVar.c();
        l0<ContributorInfo> l0Var = new l0<>(this);
        this.f17494q = l0Var;
        l0Var.r(cVar.e());
        this.f17494q.s(cVar.f());
        this.f17494q.o(cVar.b());
        this.f17494q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17494q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e6 e6Var = (e6) obj;
        io.realm.a f10 = this.f17494q.f();
        io.realm.a f11 = e6Var.f17494q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17494q.g().getTable().p();
        String p11 = e6Var.f17494q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17494q.g().getObjectKey() == e6Var.f17494q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17494q.f().getPath();
        String p10 = this.f17494q.g().getTable().p();
        long objectKey = this.f17494q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.ContributorInfo, io.realm.f6
    public boolean realmGet$admin() {
        this.f17494q.f().e();
        return this.f17494q.g().getBoolean(this.f17493p.f17495e);
    }

    @Override // com.habitrpg.android.habitica.models.user.ContributorInfo, io.realm.f6
    public String realmGet$contributions() {
        this.f17494q.f().e();
        return this.f17494q.g().getString(this.f17493p.f17496f);
    }

    @Override // com.habitrpg.android.habitica.models.user.ContributorInfo, io.realm.f6
    public int realmGet$level() {
        this.f17494q.f().e();
        return (int) this.f17494q.g().getLong(this.f17493p.f17497g);
    }

    @Override // com.habitrpg.android.habitica.models.user.ContributorInfo, io.realm.f6
    public String realmGet$text() {
        this.f17494q.f().e();
        return this.f17494q.g().getString(this.f17493p.f17498h);
    }

    @Override // com.habitrpg.android.habitica.models.user.ContributorInfo, io.realm.f6
    public void realmSet$admin(boolean z10) {
        if (this.f17494q.i()) {
            if (!this.f17494q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17494q.g();
            g10.getTable().z(this.f17493p.f17495e, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17494q.f().e();
        this.f17494q.g().setBoolean(this.f17493p.f17495e, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.ContributorInfo, io.realm.f6
    public void realmSet$contributions(String str) {
        if (this.f17494q.i()) {
            if (!this.f17494q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17494q.g();
            if (str == null) {
                g10.getTable().F(this.f17493p.f17496f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17493p.f17496f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17494q.f().e();
        if (str == null) {
            this.f17494q.g().setNull(this.f17493p.f17496f);
        } else {
            this.f17494q.g().setString(this.f17493p.f17496f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.ContributorInfo, io.realm.f6
    public void realmSet$level(int i10) {
        if (this.f17494q.i()) {
            if (!this.f17494q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17494q.g();
            g10.getTable().E(this.f17493p.f17497g, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17494q.f().e();
        this.f17494q.g().setLong(this.f17493p.f17497g, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.ContributorInfo, io.realm.f6
    public void realmSet$text(String str) {
        if (this.f17494q.i()) {
            if (!this.f17494q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17494q.g();
            if (str == null) {
                g10.getTable().F(this.f17493p.f17498h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17493p.f17498h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17494q.f().e();
        if (str == null) {
            this.f17494q.g().setNull(this.f17493p.f17498h);
        } else {
            this.f17494q.g().setString(this.f17493p.f17498h, str);
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("ContributorInfo = proxy[");
        sb2.append("{admin:");
        sb2.append(realmGet$admin());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{contributions:");
        String str2 = "null";
        if (realmGet$contributions() == null) {
            str = "null";
        } else {
            str = realmGet$contributions();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{level:");
        sb2.append(realmGet$level());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{text:");
        if (realmGet$text() != null) {
            str2 = realmGet$text();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
