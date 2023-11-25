package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.social.GroupCategory;
import io.realm.a;
import io.realm.exceptions.RealmException;
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

/* compiled from: com_habitrpg_android_habitica_models_social_GroupCategoryRealmProxy.java */
/* loaded from: classes4.dex */
public class w4 extends GroupCategory implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18377r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18378p;

    /* renamed from: q  reason: collision with root package name */
    private l0<GroupCategory> f18379q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_social_GroupCategoryRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18380e;

        /* renamed from: f  reason: collision with root package name */
        long f18381f;

        /* renamed from: g  reason: collision with root package name */
        long f18382g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("GroupCategory");
            this.f18380e = a("id", "id", b10);
            this.f18381f = a("slug", "slug", b10);
            this.f18382g = a(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18380e = aVar.f18380e;
            aVar2.f18381f = aVar.f18381f;
            aVar2.f18382g = aVar.f18382g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w4() {
        this.f18379q.p();
    }

    public static GroupCategory c(o0 o0Var, a aVar, GroupCategory groupCategory, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(groupCategory);
        if (oVar != null) {
            return (GroupCategory) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(GroupCategory.class), set);
        osObjectBuilder.c1(aVar.f18380e, groupCategory.realmGet$id());
        osObjectBuilder.c1(aVar.f18381f, groupCategory.realmGet$slug());
        osObjectBuilder.c1(aVar.f18382g, groupCategory.realmGet$name());
        w4 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(groupCategory, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.social.GroupCategory d(io.realm.o0 r8, io.realm.w4.a r9, com.habitrpg.android.habitica.models.social.GroupCategory r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
        /*
            boolean r0 = r10 instanceof io.realm.internal.o
            if (r0 == 0) goto L3e
            boolean r0 = io.realm.d1.isFrozen(r10)
            if (r0 != 0) goto L3e
            r0 = r10
            io.realm.internal.o r0 = (io.realm.internal.o) r0
            io.realm.l0 r1 = r0.b()
            io.realm.a r1 = r1.f()
            if (r1 == 0) goto L3e
            io.realm.l0 r0 = r0.b()
            io.realm.a r0 = r0.f()
            long r1 = r0.f17239m
            long r3 = r8.f17239m
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L36
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            return r10
        L36:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L3e:
            io.realm.a$d r0 = io.realm.a.f17237x
            java.lang.Object r0 = r0.get()
            io.realm.a$c r0 = (io.realm.a.c) r0
            java.lang.Object r1 = r12.get(r10)
            io.realm.internal.o r1 = (io.realm.internal.o) r1
            if (r1 == 0) goto L51
            com.habitrpg.android.habitica.models.social.GroupCategory r1 = (com.habitrpg.android.habitica.models.social.GroupCategory) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.social.GroupCategory> r2 = com.habitrpg.android.habitica.models.social.GroupCategory.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18380e
            java.lang.String r5 = r10.realmGet$id()
            long r3 = r2.e(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L6c
            r0 = 0
            goto L8d
        L6c:
            io.realm.internal.UncheckedRow r3 = r2.s(r3)     // Catch: java.lang.Throwable -> L87
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L87
            r1 = r0
            r2 = r8
            r4 = r9
            r1.g(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L87
            io.realm.w4 r1 = new io.realm.w4     // Catch: java.lang.Throwable -> L87
            r1.<init>()     // Catch: java.lang.Throwable -> L87
            r12.put(r10, r1)     // Catch: java.lang.Throwable -> L87
            r0.a()
            goto L8c
        L87:
            r8 = move-exception
            r0.a()
            throw r8
        L8c:
            r0 = r11
        L8d:
            r3 = r1
            if (r0 == 0) goto L9a
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            com.habitrpg.android.habitica.models.social.GroupCategory r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.social.GroupCategory r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.w4.d(io.realm.o0, io.realm.w4$a, com.habitrpg.android.habitica.models.social.GroupCategory, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.social.GroupCategory");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static GroupCategory f(GroupCategory groupCategory, int i10, int i11, Map<a1, o.a<a1>> map) {
        GroupCategory groupCategory2;
        if (i10 <= i11 && groupCategory != null) {
            o.a<a1> aVar = map.get(groupCategory);
            if (aVar == null) {
                groupCategory2 = new GroupCategory();
                map.put(groupCategory, new o.a<>(i10, groupCategory2));
            } else if (i10 >= aVar.f17831a) {
                return (GroupCategory) aVar.f17832b;
            } else {
                GroupCategory groupCategory3 = (GroupCategory) aVar.f17832b;
                aVar.f17831a = i10;
                groupCategory2 = groupCategory3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) groupCategory).b().f();
            groupCategory2.realmSet$id(groupCategory.realmGet$id());
            groupCategory2.realmSet$slug(groupCategory.realmGet$slug());
            groupCategory2.realmSet$name(groupCategory.realmGet$name());
            return groupCategory2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "GroupCategory", false, 3, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, true);
        bVar.b("", "slug", realmFieldType, false, false, false);
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.NAME, realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18377r;
    }

    public static long i(o0 o0Var, GroupCategory groupCategory, Map<a1, Long> map) {
        long j10;
        if ((groupCategory instanceof io.realm.internal.o) && !d1.isFrozen(groupCategory)) {
            io.realm.internal.o oVar = (io.realm.internal.o) groupCategory;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(GroupCategory.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(GroupCategory.class);
        long j11 = aVar.f18380e;
        String realmGet$id = groupCategory.realmGet$id();
        if (realmGet$id != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j11, realmGet$id);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$id);
        }
        long j12 = j10;
        map.put(groupCategory, Long.valueOf(j12));
        String realmGet$slug = groupCategory.realmGet$slug();
        if (realmGet$slug != null) {
            Table.nativeSetString(nativePtr, aVar.f18381f, j12, realmGet$slug, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18381f, j12, false);
        }
        String realmGet$name = groupCategory.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.f18382g, j12, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18382g, j12, false);
        }
        return j12;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        GroupCategory groupCategory;
        Table c12 = o0Var.c1(GroupCategory.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(GroupCategory.class);
        long j12 = aVar.f18380e;
        while (it.hasNext()) {
            GroupCategory groupCategory2 = (GroupCategory) it.next();
            if (!map.containsKey(groupCategory2)) {
                if ((groupCategory2 instanceof io.realm.internal.o) && !d1.isFrozen(groupCategory2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) groupCategory2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(groupCategory2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$id = groupCategory2.realmGet$id();
                if (realmGet$id != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j12, realmGet$id);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j11 = OsObject.createRowWithPrimaryKey(c12, j12, realmGet$id);
                } else {
                    j11 = j10;
                }
                map.put(groupCategory2, Long.valueOf(j11));
                String realmGet$slug = groupCategory2.realmGet$slug();
                if (realmGet$slug != null) {
                    groupCategory = groupCategory2;
                    Table.nativeSetString(nativePtr, aVar.f18381f, j11, realmGet$slug, false);
                } else {
                    groupCategory = groupCategory2;
                    Table.nativeSetNull(nativePtr, aVar.f18381f, j11, false);
                }
                String realmGet$name = groupCategory.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, aVar.f18382g, j11, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18382g, j11, false);
                }
            }
        }
    }

    static w4 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(GroupCategory.class), false, Collections.emptyList());
        w4 w4Var = new w4();
        cVar.a();
        return w4Var;
    }

    static GroupCategory n(o0 o0Var, a aVar, GroupCategory groupCategory, GroupCategory groupCategory2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(GroupCategory.class), set);
        osObjectBuilder.c1(aVar.f18380e, groupCategory2.realmGet$id());
        osObjectBuilder.c1(aVar.f18381f, groupCategory2.realmGet$slug());
        osObjectBuilder.c1(aVar.f18382g, groupCategory2.realmGet$name());
        osObjectBuilder.g1();
        return groupCategory;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18379q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18378p = (a) cVar.c();
        l0<GroupCategory> l0Var = new l0<>(this);
        this.f18379q = l0Var;
        l0Var.r(cVar.e());
        this.f18379q.s(cVar.f());
        this.f18379q.o(cVar.b());
        this.f18379q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18379q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w4 w4Var = (w4) obj;
        io.realm.a f10 = this.f18379q.f();
        io.realm.a f11 = w4Var.f18379q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18379q.g().getTable().p();
        String p11 = w4Var.f18379q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18379q.g().getObjectKey() == w4Var.f18379q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18379q.f().getPath();
        String p10 = this.f18379q.g().getTable().p();
        long objectKey = this.f18379q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.social.GroupCategory, io.realm.x4
    public String realmGet$id() {
        this.f18379q.f().e();
        return this.f18379q.g().getString(this.f18378p.f18380e);
    }

    @Override // com.habitrpg.android.habitica.models.social.GroupCategory, io.realm.x4
    public String realmGet$name() {
        this.f18379q.f().e();
        return this.f18379q.g().getString(this.f18378p.f18382g);
    }

    @Override // com.habitrpg.android.habitica.models.social.GroupCategory, io.realm.x4
    public String realmGet$slug() {
        this.f18379q.f().e();
        return this.f18379q.g().getString(this.f18378p.f18381f);
    }

    @Override // com.habitrpg.android.habitica.models.social.GroupCategory, io.realm.x4
    public void realmSet$id(String str) {
        if (this.f18379q.i()) {
            return;
        }
        this.f18379q.f().e();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.social.GroupCategory, io.realm.x4
    public void realmSet$name(String str) {
        if (this.f18379q.i()) {
            if (!this.f18379q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18379q.g();
            if (str == null) {
                g10.getTable().F(this.f18378p.f18382g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18378p.f18382g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18379q.f().e();
        if (str == null) {
            this.f18379q.g().setNull(this.f18378p.f18382g);
        } else {
            this.f18379q.g().setString(this.f18378p.f18382g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.GroupCategory, io.realm.x4
    public void realmSet$slug(String str) {
        if (this.f18379q.i()) {
            if (!this.f18379q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18379q.g();
            if (str == null) {
                g10.getTable().F(this.f18378p.f18381f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18378p.f18381f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18379q.f().e();
        if (str == null) {
            this.f18379q.g().setNull(this.f18378p.f18381f);
        } else {
            this.f18379q.g().setString(this.f18378p.f18381f, str);
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("GroupCategory = proxy[");
        sb2.append("{id:");
        sb2.append(realmGet$id());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{slug:");
        String str2 = "null";
        if (realmGet$slug() == null) {
            str = "null";
        } else {
            str = realmGet$slug();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{name:");
        if (realmGet$name() != null) {
            str2 = realmGet$name();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
