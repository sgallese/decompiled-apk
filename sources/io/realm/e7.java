package io.realm;

import com.habitrpg.android.habitica.models.user.Permissions;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_PermissionsRealmProxy.java */
/* loaded from: classes4.dex */
public class e7 extends Permissions implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17499r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17500p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Permissions> f17501q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_PermissionsRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17502e;

        /* renamed from: f  reason: collision with root package name */
        long f17503f;

        /* renamed from: g  reason: collision with root package name */
        long f17504g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Permissions");
            this.f17502e = a("userSupport", "userSupport", b10);
            this.f17503f = a("fullAccess", "fullAccess", b10);
            this.f17504g = a("moderator", "moderator", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17502e = aVar.f17502e;
            aVar2.f17503f = aVar.f17503f;
            aVar2.f17504g = aVar.f17504g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e7() {
        this.f17501q.p();
    }

    public static Permissions c(o0 o0Var, a aVar, Permissions permissions, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(permissions);
        if (oVar != null) {
            return (Permissions) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Permissions.class), set);
        osObjectBuilder.F0(aVar.f17502e, Boolean.valueOf(permissions.realmGet$userSupport()));
        osObjectBuilder.F0(aVar.f17503f, Boolean.valueOf(permissions.realmGet$fullAccess()));
        osObjectBuilder.F0(aVar.f17504g, Boolean.valueOf(permissions.realmGet$moderator()));
        e7 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(permissions, l10);
        return l10;
    }

    public static Permissions d(o0 o0Var, a aVar, Permissions permissions, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((permissions instanceof io.realm.internal.o) && !d1.isFrozen(permissions)) {
            io.realm.internal.o oVar = (io.realm.internal.o) permissions;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return permissions;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(permissions);
        if (oVar2 != null) {
            return (Permissions) oVar2;
        }
        return c(o0Var, aVar, permissions, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Permissions f(Permissions permissions, int i10, int i11, Map<a1, o.a<a1>> map) {
        Permissions permissions2;
        if (i10 <= i11 && permissions != null) {
            o.a<a1> aVar = map.get(permissions);
            if (aVar == null) {
                permissions2 = new Permissions();
                map.put(permissions, new o.a<>(i10, permissions2));
            } else if (i10 >= aVar.f17831a) {
                return (Permissions) aVar.f17832b;
            } else {
                Permissions permissions3 = (Permissions) aVar.f17832b;
                aVar.f17831a = i10;
                permissions2 = permissions3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) permissions).b().f();
            permissions2.realmSet$userSupport(permissions.realmGet$userSupport());
            permissions2.realmSet$fullAccess(permissions.realmGet$fullAccess());
            permissions2.realmSet$moderator(permissions.realmGet$moderator());
            return permissions2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Permissions", false, 3, 0);
        RealmFieldType realmFieldType = RealmFieldType.BOOLEAN;
        bVar.b("", "userSupport", realmFieldType, false, false, true);
        bVar.b("", "fullAccess", realmFieldType, false, false, true);
        bVar.b("", "moderator", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17499r;
    }

    public static long i(o0 o0Var, Permissions permissions, Map<a1, Long> map) {
        if ((permissions instanceof io.realm.internal.o) && !d1.isFrozen(permissions)) {
            io.realm.internal.o oVar = (io.realm.internal.o) permissions;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Permissions.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Permissions.class);
        long createRow = OsObject.createRow(c12);
        map.put(permissions, Long.valueOf(createRow));
        Table.nativeSetBoolean(nativePtr, aVar.f17502e, createRow, permissions.realmGet$userSupport(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17503f, createRow, permissions.realmGet$fullAccess(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17504g, createRow, permissions.realmGet$moderator(), false);
        return createRow;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        Table c12 = o0Var.c1(Permissions.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Permissions.class);
        while (it.hasNext()) {
            Permissions permissions = (Permissions) it.next();
            if (!map.containsKey(permissions)) {
                if ((permissions instanceof io.realm.internal.o) && !d1.isFrozen(permissions)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) permissions;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(permissions, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                long createRow = OsObject.createRow(c12);
                map.put(permissions, Long.valueOf(createRow));
                Table.nativeSetBoolean(nativePtr, aVar.f17502e, createRow, permissions.realmGet$userSupport(), false);
                Table.nativeSetBoolean(nativePtr, aVar.f17503f, createRow, permissions.realmGet$fullAccess(), false);
                Table.nativeSetBoolean(nativePtr, aVar.f17504g, createRow, permissions.realmGet$moderator(), false);
            }
        }
    }

    static e7 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Permissions.class), false, Collections.emptyList());
        e7 e7Var = new e7();
        cVar.a();
        return e7Var;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17501q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17500p = (a) cVar.c();
        l0<Permissions> l0Var = new l0<>(this);
        this.f17501q = l0Var;
        l0Var.r(cVar.e());
        this.f17501q.s(cVar.f());
        this.f17501q.o(cVar.b());
        this.f17501q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17501q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e7 e7Var = (e7) obj;
        io.realm.a f10 = this.f17501q.f();
        io.realm.a f11 = e7Var.f17501q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17501q.g().getTable().p();
        String p11 = e7Var.f17501q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17501q.g().getObjectKey() == e7Var.f17501q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17501q.f().getPath();
        String p10 = this.f17501q.g().getTable().p();
        long objectKey = this.f17501q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.Permissions, io.realm.f7
    public boolean realmGet$fullAccess() {
        this.f17501q.f().e();
        return this.f17501q.g().getBoolean(this.f17500p.f17503f);
    }

    @Override // com.habitrpg.android.habitica.models.user.Permissions, io.realm.f7
    public boolean realmGet$moderator() {
        this.f17501q.f().e();
        return this.f17501q.g().getBoolean(this.f17500p.f17504g);
    }

    @Override // com.habitrpg.android.habitica.models.user.Permissions, io.realm.f7
    public boolean realmGet$userSupport() {
        this.f17501q.f().e();
        return this.f17501q.g().getBoolean(this.f17500p.f17502e);
    }

    @Override // com.habitrpg.android.habitica.models.user.Permissions, io.realm.f7
    public void realmSet$fullAccess(boolean z10) {
        if (this.f17501q.i()) {
            if (!this.f17501q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17501q.g();
            g10.getTable().z(this.f17500p.f17503f, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17501q.f().e();
        this.f17501q.g().setBoolean(this.f17500p.f17503f, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Permissions, io.realm.f7
    public void realmSet$moderator(boolean z10) {
        if (this.f17501q.i()) {
            if (!this.f17501q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17501q.g();
            g10.getTable().z(this.f17500p.f17504g, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17501q.f().e();
        this.f17501q.g().setBoolean(this.f17500p.f17504g, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Permissions, io.realm.f7
    public void realmSet$userSupport(boolean z10) {
        if (this.f17501q.i()) {
            if (!this.f17501q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17501q.g();
            g10.getTable().z(this.f17500p.f17502e, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17501q.f().e();
        this.f17501q.g().setBoolean(this.f17500p.f17502e, z10);
    }

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "Permissions = proxy[{userSupport:" + realmGet$userSupport() + "},{fullAccess:" + realmGet$fullAccess() + "},{moderator:" + realmGet$moderator() + "}]";
    }
}
