package io.realm;

import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
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

/* compiled from: com_habitrpg_android_habitica_models_inventory_MountRealmProxy.java */
/* loaded from: classes4.dex */
public class u2 extends Mount implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18244r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18245p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Mount> f18246q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_MountRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18247e;

        /* renamed from: f  reason: collision with root package name */
        long f18248f;

        /* renamed from: g  reason: collision with root package name */
        long f18249g;

        /* renamed from: h  reason: collision with root package name */
        long f18250h;

        /* renamed from: i  reason: collision with root package name */
        long f18251i;

        /* renamed from: j  reason: collision with root package name */
        long f18252j;

        a(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Mount");
            this.f18247e = a("key", "key", b10);
            this.f18248f = a("animal", "animal", b10);
            this.f18249g = a("color", "color", b10);
            this.f18250h = a("text", "text", b10);
            this.f18251i = a(TaskFormActivity.TASK_TYPE_KEY, TaskFormActivity.TASK_TYPE_KEY, b10);
            this.f18252j = a("premium", "premium", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18247e = aVar.f18247e;
            aVar2.f18248f = aVar.f18248f;
            aVar2.f18249g = aVar.f18249g;
            aVar2.f18250h = aVar.f18250h;
            aVar2.f18251i = aVar.f18251i;
            aVar2.f18252j = aVar.f18252j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u2() {
        this.f18246q.p();
    }

    public static Mount c(o0 o0Var, a aVar, Mount mount, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(mount);
        if (oVar != null) {
            return (Mount) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Mount.class), set);
        osObjectBuilder.c1(aVar.f18247e, mount.realmGet$key());
        osObjectBuilder.c1(aVar.f18248f, mount.realmGet$animal());
        osObjectBuilder.c1(aVar.f18249g, mount.realmGet$color());
        osObjectBuilder.c1(aVar.f18250h, mount.realmGet$text());
        osObjectBuilder.c1(aVar.f18251i, mount.realmGet$type());
        osObjectBuilder.F0(aVar.f18252j, Boolean.valueOf(mount.realmGet$premium()));
        u2 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(mount, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.inventory.Mount d(io.realm.o0 r8, io.realm.u2.a r9, com.habitrpg.android.habitica.models.inventory.Mount r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.Mount r1 = (com.habitrpg.android.habitica.models.inventory.Mount) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.Mount> r2 = com.habitrpg.android.habitica.models.inventory.Mount.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18247e
            java.lang.String r5 = r10.realmGet$key()
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
            io.realm.u2 r1 = new io.realm.u2     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.inventory.Mount r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.inventory.Mount r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.u2.d(io.realm.o0, io.realm.u2$a, com.habitrpg.android.habitica.models.inventory.Mount, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.Mount");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Mount f(Mount mount, int i10, int i11, Map<a1, o.a<a1>> map) {
        Mount mount2;
        if (i10 <= i11 && mount != null) {
            o.a<a1> aVar = map.get(mount);
            if (aVar == null) {
                mount2 = new Mount();
                map.put(mount, new o.a<>(i10, mount2));
            } else if (i10 >= aVar.f17831a) {
                return (Mount) aVar.f17832b;
            } else {
                Mount mount3 = (Mount) aVar.f17832b;
                aVar.f17831a = i10;
                mount2 = mount3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) mount).b().f();
            mount2.realmSet$key(mount.realmGet$key());
            mount2.realmSet$animal(mount.realmGet$animal());
            mount2.realmSet$color(mount.realmGet$color());
            mount2.realmSet$text(mount.realmGet$text());
            mount2.realmSet$type(mount.realmGet$type());
            mount2.realmSet$premium(mount.realmGet$premium());
            return mount2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Mount", false, 6, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, true, false, true);
        bVar.b("", "animal", realmFieldType, false, false, true);
        bVar.b("", "color", realmFieldType, false, false, true);
        bVar.b("", "text", realmFieldType, false, false, false);
        bVar.b("", TaskFormActivity.TASK_TYPE_KEY, realmFieldType, false, false, false);
        bVar.b("", "premium", RealmFieldType.BOOLEAN, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18244r;
    }

    public static long i(o0 o0Var, Mount mount, Map<a1, Long> map) {
        long j10;
        if ((mount instanceof io.realm.internal.o) && !d1.isFrozen(mount)) {
            io.realm.internal.o oVar = (io.realm.internal.o) mount;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Mount.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Mount.class);
        long j11 = aVar.f18247e;
        String realmGet$key = mount.realmGet$key();
        if (realmGet$key != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j11, realmGet$key);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$key);
        }
        long j12 = j10;
        map.put(mount, Long.valueOf(j12));
        String realmGet$animal = mount.realmGet$animal();
        if (realmGet$animal != null) {
            Table.nativeSetString(nativePtr, aVar.f18248f, j12, realmGet$animal, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18248f, j12, false);
        }
        String realmGet$color = mount.realmGet$color();
        if (realmGet$color != null) {
            Table.nativeSetString(nativePtr, aVar.f18249g, j12, realmGet$color, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18249g, j12, false);
        }
        String realmGet$text = mount.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar.f18250h, j12, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18250h, j12, false);
        }
        String realmGet$type = mount.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, aVar.f18251i, j12, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18251i, j12, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f18252j, j12, mount.realmGet$premium(), false);
        return j12;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        Mount mount;
        Table c12 = o0Var.c1(Mount.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Mount.class);
        long j12 = aVar.f18247e;
        while (it.hasNext()) {
            Mount mount2 = (Mount) it.next();
            if (!map.containsKey(mount2)) {
                if ((mount2 instanceof io.realm.internal.o) && !d1.isFrozen(mount2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) mount2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(mount2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = mount2.realmGet$key();
                if (realmGet$key != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j12, realmGet$key);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j11 = OsObject.createRowWithPrimaryKey(c12, j12, realmGet$key);
                } else {
                    j11 = j10;
                }
                map.put(mount2, Long.valueOf(j11));
                String realmGet$animal = mount2.realmGet$animal();
                if (realmGet$animal != null) {
                    mount = mount2;
                    Table.nativeSetString(nativePtr, aVar.f18248f, j11, realmGet$animal, false);
                } else {
                    mount = mount2;
                    Table.nativeSetNull(nativePtr, aVar.f18248f, j11, false);
                }
                String realmGet$color = mount.realmGet$color();
                if (realmGet$color != null) {
                    Table.nativeSetString(nativePtr, aVar.f18249g, j11, realmGet$color, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18249g, j11, false);
                }
                String realmGet$text = mount.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, aVar.f18250h, j11, realmGet$text, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18250h, j11, false);
                }
                String realmGet$type = mount.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, aVar.f18251i, j11, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18251i, j11, false);
                }
                Table.nativeSetBoolean(nativePtr, aVar.f18252j, j11, mount.realmGet$premium(), false);
            }
        }
    }

    static u2 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Mount.class), false, Collections.emptyList());
        u2 u2Var = new u2();
        cVar.a();
        return u2Var;
    }

    static Mount n(o0 o0Var, a aVar, Mount mount, Mount mount2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Mount.class), set);
        osObjectBuilder.c1(aVar.f18247e, mount2.realmGet$key());
        osObjectBuilder.c1(aVar.f18248f, mount2.realmGet$animal());
        osObjectBuilder.c1(aVar.f18249g, mount2.realmGet$color());
        osObjectBuilder.c1(aVar.f18250h, mount2.realmGet$text());
        osObjectBuilder.c1(aVar.f18251i, mount2.realmGet$type());
        osObjectBuilder.F0(aVar.f18252j, Boolean.valueOf(mount2.realmGet$premium()));
        osObjectBuilder.g1();
        return mount;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18246q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18245p = (a) cVar.c();
        l0<Mount> l0Var = new l0<>(this);
        this.f18246q = l0Var;
        l0Var.r(cVar.e());
        this.f18246q.s(cVar.f());
        this.f18246q.o(cVar.b());
        this.f18246q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18246q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u2 u2Var = (u2) obj;
        io.realm.a f10 = this.f18246q.f();
        io.realm.a f11 = u2Var.f18246q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18246q.g().getTable().p();
        String p11 = u2Var.f18246q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18246q.g().getObjectKey() == u2Var.f18246q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18246q.f().getPath();
        String p10 = this.f18246q.g().getTable().p();
        long objectKey = this.f18246q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.Mount, io.realm.v2
    public String realmGet$animal() {
        this.f18246q.f().e();
        return this.f18246q.g().getString(this.f18245p.f18248f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Mount, io.realm.v2
    public String realmGet$color() {
        this.f18246q.f().e();
        return this.f18246q.g().getString(this.f18245p.f18249g);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Mount, io.realm.v2
    public String realmGet$key() {
        this.f18246q.f().e();
        return this.f18246q.g().getString(this.f18245p.f18247e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Mount, io.realm.v2
    public boolean realmGet$premium() {
        this.f18246q.f().e();
        return this.f18246q.g().getBoolean(this.f18245p.f18252j);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Mount, io.realm.v2
    public String realmGet$text() {
        this.f18246q.f().e();
        return this.f18246q.g().getString(this.f18245p.f18250h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Mount, io.realm.v2
    public String realmGet$type() {
        this.f18246q.f().e();
        return this.f18246q.g().getString(this.f18245p.f18251i);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Mount, io.realm.v2
    public void realmSet$animal(String str) {
        if (this.f18246q.i()) {
            if (!this.f18246q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18246q.g();
            if (str != null) {
                g10.getTable().G(this.f18245p.f18248f, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'animal' to null.");
        }
        this.f18246q.f().e();
        if (str != null) {
            this.f18246q.g().setString(this.f18245p.f18248f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'animal' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Mount, io.realm.v2
    public void realmSet$color(String str) {
        if (this.f18246q.i()) {
            if (!this.f18246q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18246q.g();
            if (str != null) {
                g10.getTable().G(this.f18245p.f18249g, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'color' to null.");
        }
        this.f18246q.f().e();
        if (str != null) {
            this.f18246q.g().setString(this.f18245p.f18249g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'color' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Mount, io.realm.v2
    public void realmSet$key(String str) {
        if (this.f18246q.i()) {
            return;
        }
        this.f18246q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Mount, io.realm.v2
    public void realmSet$premium(boolean z10) {
        if (this.f18246q.i()) {
            if (!this.f18246q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18246q.g();
            g10.getTable().z(this.f18245p.f18252j, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18246q.f().e();
        this.f18246q.g().setBoolean(this.f18245p.f18252j, z10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Mount, io.realm.v2
    public void realmSet$text(String str) {
        if (this.f18246q.i()) {
            if (!this.f18246q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18246q.g();
            if (str == null) {
                g10.getTable().F(this.f18245p.f18250h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18245p.f18250h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18246q.f().e();
        if (str == null) {
            this.f18246q.g().setNull(this.f18245p.f18250h);
        } else {
            this.f18246q.g().setString(this.f18245p.f18250h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Mount, io.realm.v2
    public void realmSet$type(String str) {
        if (this.f18246q.i()) {
            if (!this.f18246q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18246q.g();
            if (str == null) {
                g10.getTable().F(this.f18245p.f18251i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18245p.f18251i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18246q.f().e();
        if (str == null) {
            this.f18246q.g().setNull(this.f18245p.f18251i);
        } else {
            this.f18246q.g().setString(this.f18245p.f18251i, str);
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Mount = proxy[");
        sb2.append("{key:");
        sb2.append(realmGet$key());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{animal:");
        sb2.append(realmGet$animal());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{color:");
        sb2.append(realmGet$color());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{text:");
        String str2 = "null";
        if (realmGet$text() == null) {
            str = "null";
        } else {
            str = realmGet$text();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{type:");
        if (realmGet$type() != null) {
            str2 = realmGet$type();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{premium:");
        sb2.append(realmGet$premium());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
