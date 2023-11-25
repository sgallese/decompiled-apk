package io.realm;

import com.habitrpg.android.habitica.models.inventory.QuestMember;
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

/* compiled from: com_habitrpg_android_habitica_models_inventory_QuestMemberRealmProxy.java */
/* loaded from: classes4.dex */
public class m3 extends QuestMember implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17964r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17965p;

    /* renamed from: q  reason: collision with root package name */
    private l0<QuestMember> f17966q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_QuestMemberRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17967e;

        /* renamed from: f  reason: collision with root package name */
        long f17968f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("QuestMember");
            this.f17967e = a("key", "key", b10);
            this.f17968f = a("isParticipating", "isParticipating", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17967e = aVar.f17967e;
            aVar2.f17968f = aVar.f17968f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m3() {
        this.f17966q.p();
    }

    public static QuestMember c(o0 o0Var, a aVar, QuestMember questMember, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(questMember);
        if (oVar != null) {
            return (QuestMember) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestMember.class), set);
        osObjectBuilder.c1(aVar.f17967e, questMember.realmGet$key());
        osObjectBuilder.F0(aVar.f17968f, questMember.realmGet$isParticipating());
        m3 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(questMember, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.inventory.QuestMember d(io.realm.o0 r8, io.realm.m3.a r9, com.habitrpg.android.habitica.models.inventory.QuestMember r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.QuestMember r1 = (com.habitrpg.android.habitica.models.inventory.QuestMember) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.QuestMember> r2 = com.habitrpg.android.habitica.models.inventory.QuestMember.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17967e
            java.lang.String r5 = r10.realmGet$key()
            if (r5 != 0) goto L67
            long r3 = r2.d(r3)
            goto L6b
        L67:
            long r3 = r2.e(r3, r5)
        L6b:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L73
            r0 = 0
            goto L94
        L73:
            io.realm.internal.UncheckedRow r3 = r2.s(r3)     // Catch: java.lang.Throwable -> L8e
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L8e
            r1 = r0
            r2 = r8
            r4 = r9
            r1.g(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8e
            io.realm.m3 r1 = new io.realm.m3     // Catch: java.lang.Throwable -> L8e
            r1.<init>()     // Catch: java.lang.Throwable -> L8e
            r12.put(r10, r1)     // Catch: java.lang.Throwable -> L8e
            r0.a()
            goto L93
        L8e:
            r8 = move-exception
            r0.a()
            throw r8
        L93:
            r0 = r11
        L94:
            r3 = r1
            if (r0 == 0) goto La1
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            com.habitrpg.android.habitica.models.inventory.QuestMember r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.inventory.QuestMember r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.m3.d(io.realm.o0, io.realm.m3$a, com.habitrpg.android.habitica.models.inventory.QuestMember, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.QuestMember");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static QuestMember f(QuestMember questMember, int i10, int i11, Map<a1, o.a<a1>> map) {
        QuestMember questMember2;
        if (i10 <= i11 && questMember != null) {
            o.a<a1> aVar = map.get(questMember);
            if (aVar == null) {
                questMember2 = new QuestMember();
                map.put(questMember, new o.a<>(i10, questMember2));
            } else if (i10 >= aVar.f17831a) {
                return (QuestMember) aVar.f17832b;
            } else {
                QuestMember questMember3 = (QuestMember) aVar.f17832b;
                aVar.f17831a = i10;
                questMember2 = questMember3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) questMember).b().f();
            questMember2.realmSet$key(questMember.realmGet$key());
            questMember2.realmSet$isParticipating(questMember.realmGet$isParticipating());
            return questMember2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "QuestMember", false, 2, 0);
        bVar.b("", "key", RealmFieldType.STRING, true, false, false);
        bVar.b("", "isParticipating", RealmFieldType.BOOLEAN, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17964r;
    }

    public static long i(o0 o0Var, QuestMember questMember, Map<a1, Long> map) {
        long nativeFindFirstString;
        if ((questMember instanceof io.realm.internal.o) && !d1.isFrozen(questMember)) {
            io.realm.internal.o oVar = (io.realm.internal.o) questMember;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(QuestMember.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestMember.class);
        long j10 = aVar.f17967e;
        String realmGet$key = questMember.realmGet$key();
        if (realmGet$key == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j10);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j10, realmGet$key);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j10, realmGet$key);
        }
        long j11 = nativeFindFirstString;
        map.put(questMember, Long.valueOf(j11));
        Boolean realmGet$isParticipating = questMember.realmGet$isParticipating();
        if (realmGet$isParticipating != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f17968f, j11, realmGet$isParticipating.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17968f, j11, false);
        }
        return j11;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        Table c12 = o0Var.c1(QuestMember.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestMember.class);
        long j11 = aVar.f17967e;
        while (it.hasNext()) {
            QuestMember questMember = (QuestMember) it.next();
            if (!map.containsKey(questMember)) {
                if ((questMember instanceof io.realm.internal.o) && !d1.isFrozen(questMember)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) questMember;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(questMember, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = questMember.realmGet$key();
                if (realmGet$key == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j11);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j11, realmGet$key);
                }
                if (nativeFindFirstString == -1) {
                    j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$key);
                } else {
                    j10 = nativeFindFirstString;
                }
                map.put(questMember, Long.valueOf(j10));
                Boolean realmGet$isParticipating = questMember.realmGet$isParticipating();
                if (realmGet$isParticipating != null) {
                    Table.nativeSetBoolean(nativePtr, aVar.f17968f, j10, realmGet$isParticipating.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17968f, j10, false);
                }
            }
        }
    }

    static m3 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(QuestMember.class), false, Collections.emptyList());
        m3 m3Var = new m3();
        cVar.a();
        return m3Var;
    }

    static QuestMember n(o0 o0Var, a aVar, QuestMember questMember, QuestMember questMember2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestMember.class), set);
        osObjectBuilder.c1(aVar.f17967e, questMember2.realmGet$key());
        osObjectBuilder.F0(aVar.f17968f, questMember2.realmGet$isParticipating());
        osObjectBuilder.g1();
        return questMember;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17966q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17965p = (a) cVar.c();
        l0<QuestMember> l0Var = new l0<>(this);
        this.f17966q = l0Var;
        l0Var.r(cVar.e());
        this.f17966q.s(cVar.f());
        this.f17966q.o(cVar.b());
        this.f17966q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17966q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m3 m3Var = (m3) obj;
        io.realm.a f10 = this.f17966q.f();
        io.realm.a f11 = m3Var.f17966q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17966q.g().getTable().p();
        String p11 = m3Var.f17966q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17966q.g().getObjectKey() == m3Var.f17966q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17966q.f().getPath();
        String p10 = this.f17966q.g().getTable().p();
        long objectKey = this.f17966q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.QuestMember, io.realm.n3
    public Boolean realmGet$isParticipating() {
        this.f17966q.f().e();
        if (this.f17966q.g().isNull(this.f17965p.f17968f)) {
            return null;
        }
        return Boolean.valueOf(this.f17966q.g().getBoolean(this.f17965p.f17968f));
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestMember, io.realm.n3
    public String realmGet$key() {
        this.f17966q.f().e();
        return this.f17966q.g().getString(this.f17965p.f17967e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestMember, io.realm.n3
    public void realmSet$isParticipating(Boolean bool) {
        if (this.f17966q.i()) {
            if (!this.f17966q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17966q.g();
            if (bool == null) {
                g10.getTable().F(this.f17965p.f17968f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f17965p.f17968f, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f17966q.f().e();
        if (bool == null) {
            this.f17966q.g().setNull(this.f17965p.f17968f);
        } else {
            this.f17966q.g().setBoolean(this.f17965p.f17968f, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestMember, io.realm.n3
    public void realmSet$key(String str) {
        if (this.f17966q.i()) {
            return;
        }
        this.f17966q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("QuestMember = proxy[");
        sb2.append("{key:");
        Object obj = "null";
        if (realmGet$key() == null) {
            str = "null";
        } else {
            str = realmGet$key();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{isParticipating:");
        if (realmGet$isParticipating() != null) {
            obj = realmGet$isParticipating();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
