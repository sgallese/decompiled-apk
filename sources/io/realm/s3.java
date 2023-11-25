package io.realm;

import com.habitrpg.android.habitica.models.inventory.QuestRageStrike;
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

/* compiled from: com_habitrpg_android_habitica_models_inventory_QuestRageStrikeRealmProxy.java */
/* loaded from: classes4.dex */
public class s3 extends QuestRageStrike implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18167r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18168p;

    /* renamed from: q  reason: collision with root package name */
    private l0<QuestRageStrike> f18169q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_QuestRageStrikeRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18170e;

        /* renamed from: f  reason: collision with root package name */
        long f18171f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("QuestRageStrike");
            this.f18170e = a("key", "key", b10);
            this.f18171f = a("wasHit", "wasHit", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18170e = aVar.f18170e;
            aVar2.f18171f = aVar.f18171f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s3() {
        this.f18169q.p();
    }

    public static QuestRageStrike c(o0 o0Var, a aVar, QuestRageStrike questRageStrike, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(questRageStrike);
        if (oVar != null) {
            return (QuestRageStrike) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestRageStrike.class), set);
        osObjectBuilder.c1(aVar.f18170e, questRageStrike.realmGet$key());
        osObjectBuilder.F0(aVar.f18171f, Boolean.valueOf(questRageStrike.realmGet$wasHit()));
        s3 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(questRageStrike, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.inventory.QuestRageStrike d(io.realm.o0 r8, io.realm.s3.a r9, com.habitrpg.android.habitica.models.inventory.QuestRageStrike r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.QuestRageStrike r1 = (com.habitrpg.android.habitica.models.inventory.QuestRageStrike) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.QuestRageStrike> r2 = com.habitrpg.android.habitica.models.inventory.QuestRageStrike.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18170e
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
            io.realm.s3 r1 = new io.realm.s3     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.inventory.QuestRageStrike r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.inventory.QuestRageStrike r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.s3.d(io.realm.o0, io.realm.s3$a, com.habitrpg.android.habitica.models.inventory.QuestRageStrike, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.QuestRageStrike");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static QuestRageStrike f(QuestRageStrike questRageStrike, int i10, int i11, Map<a1, o.a<a1>> map) {
        QuestRageStrike questRageStrike2;
        if (i10 <= i11 && questRageStrike != null) {
            o.a<a1> aVar = map.get(questRageStrike);
            if (aVar == null) {
                questRageStrike2 = new QuestRageStrike();
                map.put(questRageStrike, new o.a<>(i10, questRageStrike2));
            } else if (i10 >= aVar.f17831a) {
                return (QuestRageStrike) aVar.f17832b;
            } else {
                QuestRageStrike questRageStrike3 = (QuestRageStrike) aVar.f17832b;
                aVar.f17831a = i10;
                questRageStrike2 = questRageStrike3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) questRageStrike).b().f();
            questRageStrike2.realmSet$key(questRageStrike.realmGet$key());
            questRageStrike2.realmSet$wasHit(questRageStrike.realmGet$wasHit());
            return questRageStrike2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "QuestRageStrike", false, 2, 0);
        bVar.b("", "key", RealmFieldType.STRING, true, false, true);
        bVar.b("", "wasHit", RealmFieldType.BOOLEAN, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18167r;
    }

    public static long i(o0 o0Var, QuestRageStrike questRageStrike, Map<a1, Long> map) {
        long j10;
        if ((questRageStrike instanceof io.realm.internal.o) && !d1.isFrozen(questRageStrike)) {
            io.realm.internal.o oVar = (io.realm.internal.o) questRageStrike;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(QuestRageStrike.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestRageStrike.class);
        long j11 = aVar.f18170e;
        String realmGet$key = questRageStrike.realmGet$key();
        if (realmGet$key != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j11, realmGet$key);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$key);
        }
        long j12 = j10;
        map.put(questRageStrike, Long.valueOf(j12));
        Table.nativeSetBoolean(nativePtr, aVar.f18171f, j12, questRageStrike.realmGet$wasHit(), false);
        return j12;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        Table c12 = o0Var.c1(QuestRageStrike.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestRageStrike.class);
        long j11 = aVar.f18170e;
        while (it.hasNext()) {
            QuestRageStrike questRageStrike = (QuestRageStrike) it.next();
            if (!map.containsKey(questRageStrike)) {
                if ((questRageStrike instanceof io.realm.internal.o) && !d1.isFrozen(questRageStrike)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) questRageStrike;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(questRageStrike, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = questRageStrike.realmGet$key();
                if (realmGet$key != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j11, realmGet$key);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$key);
                }
                map.put(questRageStrike, Long.valueOf(j10));
                Table.nativeSetBoolean(nativePtr, aVar.f18171f, j10, questRageStrike.realmGet$wasHit(), false);
            }
        }
    }

    static s3 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(QuestRageStrike.class), false, Collections.emptyList());
        s3 s3Var = new s3();
        cVar.a();
        return s3Var;
    }

    static QuestRageStrike n(o0 o0Var, a aVar, QuestRageStrike questRageStrike, QuestRageStrike questRageStrike2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestRageStrike.class), set);
        osObjectBuilder.c1(aVar.f18170e, questRageStrike2.realmGet$key());
        osObjectBuilder.F0(aVar.f18171f, Boolean.valueOf(questRageStrike2.realmGet$wasHit()));
        osObjectBuilder.g1();
        return questRageStrike;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18169q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18168p = (a) cVar.c();
        l0<QuestRageStrike> l0Var = new l0<>(this);
        this.f18169q = l0Var;
        l0Var.r(cVar.e());
        this.f18169q.s(cVar.f());
        this.f18169q.o(cVar.b());
        this.f18169q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18169q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s3 s3Var = (s3) obj;
        io.realm.a f10 = this.f18169q.f();
        io.realm.a f11 = s3Var.f18169q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18169q.g().getTable().p();
        String p11 = s3Var.f18169q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18169q.g().getObjectKey() == s3Var.f18169q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18169q.f().getPath();
        String p10 = this.f18169q.g().getTable().p();
        long objectKey = this.f18169q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.QuestRageStrike, io.realm.t3
    public String realmGet$key() {
        this.f18169q.f().e();
        return this.f18169q.g().getString(this.f18168p.f18170e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestRageStrike, io.realm.t3
    public boolean realmGet$wasHit() {
        this.f18169q.f().e();
        return this.f18169q.g().getBoolean(this.f18168p.f18171f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestRageStrike, io.realm.t3
    public void realmSet$key(String str) {
        if (this.f18169q.i()) {
            return;
        }
        this.f18169q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestRageStrike, io.realm.t3
    public void realmSet$wasHit(boolean z10) {
        if (this.f18169q.i()) {
            if (!this.f18169q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18169q.g();
            g10.getTable().z(this.f18168p.f18171f, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18169q.f().e();
        this.f18169q.g().setBoolean(this.f18168p.f18171f, z10);
    }

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "QuestRageStrike = proxy[{key:" + realmGet$key() + "},{wasHit:" + realmGet$wasHit() + "}]";
    }
}
