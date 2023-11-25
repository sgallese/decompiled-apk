package io.realm;

import com.habitrpg.android.habitica.models.social.GroupMembership;
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

/* compiled from: com_habitrpg_android_habitica_models_social_GroupMembershipRealmProxy.java */
/* loaded from: classes4.dex */
public class y4 extends GroupMembership implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18446r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18447p;

    /* renamed from: q  reason: collision with root package name */
    private l0<GroupMembership> f18448q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_social_GroupMembershipRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18449e;

        /* renamed from: f  reason: collision with root package name */
        long f18450f;

        /* renamed from: g  reason: collision with root package name */
        long f18451g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("GroupMembership");
            this.f18449e = a("combinedID", "combinedID", b10);
            this.f18450f = a("userID", "userID", b10);
            this.f18451g = a("groupID", "groupID", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18449e = aVar.f18449e;
            aVar2.f18450f = aVar.f18450f;
            aVar2.f18451g = aVar.f18451g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y4() {
        this.f18448q.p();
    }

    public static GroupMembership c(o0 o0Var, a aVar, GroupMembership groupMembership, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(groupMembership);
        if (oVar != null) {
            return (GroupMembership) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(GroupMembership.class), set);
        osObjectBuilder.c1(aVar.f18449e, groupMembership.realmGet$combinedID());
        osObjectBuilder.c1(aVar.f18450f, groupMembership.realmGet$userID());
        osObjectBuilder.c1(aVar.f18451g, groupMembership.realmGet$groupID());
        y4 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(groupMembership, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.social.GroupMembership d(io.realm.o0 r8, io.realm.y4.a r9, com.habitrpg.android.habitica.models.social.GroupMembership r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.social.GroupMembership r1 = (com.habitrpg.android.habitica.models.social.GroupMembership) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.social.GroupMembership> r2 = com.habitrpg.android.habitica.models.social.GroupMembership.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18449e
            java.lang.String r5 = r10.realmGet$combinedID()
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
            io.realm.y4 r1 = new io.realm.y4     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.social.GroupMembership r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.social.GroupMembership r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.y4.d(io.realm.o0, io.realm.y4$a, com.habitrpg.android.habitica.models.social.GroupMembership, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.social.GroupMembership");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static GroupMembership f(GroupMembership groupMembership, int i10, int i11, Map<a1, o.a<a1>> map) {
        GroupMembership groupMembership2;
        if (i10 <= i11 && groupMembership != null) {
            o.a<a1> aVar = map.get(groupMembership);
            if (aVar == null) {
                groupMembership2 = new GroupMembership();
                map.put(groupMembership, new o.a<>(i10, groupMembership2));
            } else if (i10 >= aVar.f17831a) {
                return (GroupMembership) aVar.f17832b;
            } else {
                GroupMembership groupMembership3 = (GroupMembership) aVar.f17832b;
                aVar.f17831a = i10;
                groupMembership2 = groupMembership3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) groupMembership).b().f();
            groupMembership2.realmSet$combinedID(groupMembership.realmGet$combinedID());
            groupMembership2.realmSet$userID(groupMembership.realmGet$userID());
            groupMembership2.realmSet$groupID(groupMembership.realmGet$groupID());
            return groupMembership2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "GroupMembership", false, 3, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "combinedID", realmFieldType, true, false, true);
        bVar.b("", "userID", realmFieldType, false, false, true);
        bVar.b("", "groupID", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18446r;
    }

    public static long i(o0 o0Var, GroupMembership groupMembership, Map<a1, Long> map) {
        long j10;
        if ((groupMembership instanceof io.realm.internal.o) && !d1.isFrozen(groupMembership)) {
            io.realm.internal.o oVar = (io.realm.internal.o) groupMembership;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(GroupMembership.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(GroupMembership.class);
        long j11 = aVar.f18449e;
        String realmGet$combinedID = groupMembership.realmGet$combinedID();
        if (realmGet$combinedID != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j11, realmGet$combinedID);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$combinedID);
        }
        long j12 = j10;
        map.put(groupMembership, Long.valueOf(j12));
        String realmGet$userID = groupMembership.realmGet$userID();
        if (realmGet$userID != null) {
            Table.nativeSetString(nativePtr, aVar.f18450f, j12, realmGet$userID, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18450f, j12, false);
        }
        String realmGet$groupID = groupMembership.realmGet$groupID();
        if (realmGet$groupID != null) {
            Table.nativeSetString(nativePtr, aVar.f18451g, j12, realmGet$groupID, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18451g, j12, false);
        }
        return j12;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        GroupMembership groupMembership;
        Table c12 = o0Var.c1(GroupMembership.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(GroupMembership.class);
        long j12 = aVar.f18449e;
        while (it.hasNext()) {
            GroupMembership groupMembership2 = (GroupMembership) it.next();
            if (!map.containsKey(groupMembership2)) {
                if ((groupMembership2 instanceof io.realm.internal.o) && !d1.isFrozen(groupMembership2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) groupMembership2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(groupMembership2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$combinedID = groupMembership2.realmGet$combinedID();
                if (realmGet$combinedID != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j12, realmGet$combinedID);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j11 = OsObject.createRowWithPrimaryKey(c12, j12, realmGet$combinedID);
                } else {
                    j11 = j10;
                }
                map.put(groupMembership2, Long.valueOf(j11));
                String realmGet$userID = groupMembership2.realmGet$userID();
                if (realmGet$userID != null) {
                    groupMembership = groupMembership2;
                    Table.nativeSetString(nativePtr, aVar.f18450f, j11, realmGet$userID, false);
                } else {
                    groupMembership = groupMembership2;
                    Table.nativeSetNull(nativePtr, aVar.f18450f, j11, false);
                }
                String realmGet$groupID = groupMembership.realmGet$groupID();
                if (realmGet$groupID != null) {
                    Table.nativeSetString(nativePtr, aVar.f18451g, j11, realmGet$groupID, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18451g, j11, false);
                }
            }
        }
    }

    static y4 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(GroupMembership.class), false, Collections.emptyList());
        y4 y4Var = new y4();
        cVar.a();
        return y4Var;
    }

    static GroupMembership n(o0 o0Var, a aVar, GroupMembership groupMembership, GroupMembership groupMembership2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(GroupMembership.class), set);
        osObjectBuilder.c1(aVar.f18449e, groupMembership2.realmGet$combinedID());
        osObjectBuilder.c1(aVar.f18450f, groupMembership2.realmGet$userID());
        osObjectBuilder.c1(aVar.f18451g, groupMembership2.realmGet$groupID());
        osObjectBuilder.g1();
        return groupMembership;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18448q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18447p = (a) cVar.c();
        l0<GroupMembership> l0Var = new l0<>(this);
        this.f18448q = l0Var;
        l0Var.r(cVar.e());
        this.f18448q.s(cVar.f());
        this.f18448q.o(cVar.b());
        this.f18448q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18448q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y4 y4Var = (y4) obj;
        io.realm.a f10 = this.f18448q.f();
        io.realm.a f11 = y4Var.f18448q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18448q.g().getTable().p();
        String p11 = y4Var.f18448q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18448q.g().getObjectKey() == y4Var.f18448q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18448q.f().getPath();
        String p10 = this.f18448q.g().getTable().p();
        long objectKey = this.f18448q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.social.GroupMembership, io.realm.z4
    public String realmGet$combinedID() {
        this.f18448q.f().e();
        return this.f18448q.g().getString(this.f18447p.f18449e);
    }

    @Override // com.habitrpg.android.habitica.models.social.GroupMembership, io.realm.z4
    public String realmGet$groupID() {
        this.f18448q.f().e();
        return this.f18448q.g().getString(this.f18447p.f18451g);
    }

    @Override // com.habitrpg.android.habitica.models.social.GroupMembership, io.realm.z4
    public String realmGet$userID() {
        this.f18448q.f().e();
        return this.f18448q.g().getString(this.f18447p.f18450f);
    }

    @Override // com.habitrpg.android.habitica.models.social.GroupMembership, io.realm.z4
    public void realmSet$combinedID(String str) {
        if (this.f18448q.i()) {
            return;
        }
        this.f18448q.f().e();
        throw new RealmException("Primary key field 'combinedID' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.social.GroupMembership, io.realm.z4
    public void realmSet$groupID(String str) {
        if (this.f18448q.i()) {
            if (!this.f18448q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18448q.g();
            if (str != null) {
                g10.getTable().G(this.f18447p.f18451g, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'groupID' to null.");
        }
        this.f18448q.f().e();
        if (str != null) {
            this.f18448q.g().setString(this.f18447p.f18451g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'groupID' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.social.GroupMembership, io.realm.z4
    public void realmSet$userID(String str) {
        if (this.f18448q.i()) {
            if (!this.f18448q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18448q.g();
            if (str != null) {
                g10.getTable().G(this.f18447p.f18450f, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'userID' to null.");
        }
        this.f18448q.f().e();
        if (str != null) {
            this.f18448q.g().setString(this.f18447p.f18450f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'userID' to null.");
    }

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "GroupMembership = proxy[{combinedID:" + realmGet$combinedID() + "},{userID:" + realmGet$userID() + "},{groupID:" + realmGet$groupID() + "}]";
    }
}
