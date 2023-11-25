package io.realm;

import com.habitrpg.android.habitica.models.inventory.QuestCollect;
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

/* compiled from: com_habitrpg_android_habitica_models_inventory_QuestCollectRealmProxy.java */
/* loaded from: classes4.dex */
public class c3 extends QuestCollect implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17355r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17356p;

    /* renamed from: q  reason: collision with root package name */
    private l0<QuestCollect> f17357q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_QuestCollectRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17358e;

        /* renamed from: f  reason: collision with root package name */
        long f17359f;

        /* renamed from: g  reason: collision with root package name */
        long f17360g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("QuestCollect");
            this.f17358e = a("key", "key", b10);
            this.f17359f = a("text", "text", b10);
            this.f17360g = a("count", "count", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17358e = aVar.f17358e;
            aVar2.f17359f = aVar.f17359f;
            aVar2.f17360g = aVar.f17360g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c3() {
        this.f17357q.p();
    }

    public static QuestCollect c(o0 o0Var, a aVar, QuestCollect questCollect, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(questCollect);
        if (oVar != null) {
            return (QuestCollect) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestCollect.class), set);
        osObjectBuilder.c1(aVar.f17358e, questCollect.realmGet$key());
        osObjectBuilder.c1(aVar.f17359f, questCollect.realmGet$text());
        osObjectBuilder.V0(aVar.f17360g, Integer.valueOf(questCollect.realmGet$count()));
        c3 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(questCollect, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.inventory.QuestCollect d(io.realm.o0 r8, io.realm.c3.a r9, com.habitrpg.android.habitica.models.inventory.QuestCollect r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.QuestCollect r1 = (com.habitrpg.android.habitica.models.inventory.QuestCollect) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.QuestCollect> r2 = com.habitrpg.android.habitica.models.inventory.QuestCollect.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17358e
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
            io.realm.c3 r1 = new io.realm.c3     // Catch: java.lang.Throwable -> L8e
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
            com.habitrpg.android.habitica.models.inventory.QuestCollect r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.inventory.QuestCollect r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.c3.d(io.realm.o0, io.realm.c3$a, com.habitrpg.android.habitica.models.inventory.QuestCollect, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.QuestCollect");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static QuestCollect f(QuestCollect questCollect, int i10, int i11, Map<a1, o.a<a1>> map) {
        QuestCollect questCollect2;
        if (i10 <= i11 && questCollect != null) {
            o.a<a1> aVar = map.get(questCollect);
            if (aVar == null) {
                questCollect2 = new QuestCollect();
                map.put(questCollect, new o.a<>(i10, questCollect2));
            } else if (i10 >= aVar.f17831a) {
                return (QuestCollect) aVar.f17832b;
            } else {
                QuestCollect questCollect3 = (QuestCollect) aVar.f17832b;
                aVar.f17831a = i10;
                questCollect2 = questCollect3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) questCollect).b().f();
            questCollect2.realmSet$key(questCollect.realmGet$key());
            questCollect2.realmSet$text(questCollect.realmGet$text());
            questCollect2.realmSet$count(questCollect.realmGet$count());
            return questCollect2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "QuestCollect", false, 3, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, true, false, false);
        bVar.b("", "text", realmFieldType, false, false, false);
        bVar.b("", "count", RealmFieldType.INTEGER, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17355r;
    }

    public static long i(o0 o0Var, QuestCollect questCollect, Map<a1, Long> map) {
        long nativeFindFirstString;
        if ((questCollect instanceof io.realm.internal.o) && !d1.isFrozen(questCollect)) {
            io.realm.internal.o oVar = (io.realm.internal.o) questCollect;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(QuestCollect.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestCollect.class);
        long j10 = aVar.f17358e;
        String realmGet$key = questCollect.realmGet$key();
        if (realmGet$key == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j10);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j10, realmGet$key);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j10, realmGet$key);
        }
        long j11 = nativeFindFirstString;
        map.put(questCollect, Long.valueOf(j11));
        String realmGet$text = questCollect.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar.f17359f, j11, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17359f, j11, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f17360g, j11, questCollect.realmGet$count(), false);
        return j11;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        long j11;
        Table c12 = o0Var.c1(QuestCollect.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestCollect.class);
        long j12 = aVar.f17358e;
        while (it.hasNext()) {
            QuestCollect questCollect = (QuestCollect) it.next();
            if (!map.containsKey(questCollect)) {
                if ((questCollect instanceof io.realm.internal.o) && !d1.isFrozen(questCollect)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) questCollect;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(questCollect, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = questCollect.realmGet$key();
                if (realmGet$key == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j12);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j12, realmGet$key);
                }
                if (nativeFindFirstString == -1) {
                    j10 = OsObject.createRowWithPrimaryKey(c12, j12, realmGet$key);
                } else {
                    j10 = nativeFindFirstString;
                }
                map.put(questCollect, Long.valueOf(j10));
                String realmGet$text = questCollect.realmGet$text();
                if (realmGet$text != null) {
                    j11 = j12;
                    Table.nativeSetString(nativePtr, aVar.f17359f, j10, realmGet$text, false);
                } else {
                    j11 = j12;
                    Table.nativeSetNull(nativePtr, aVar.f17359f, j10, false);
                }
                Table.nativeSetLong(nativePtr, aVar.f17360g, j10, questCollect.realmGet$count(), false);
                j12 = j11;
            }
        }
    }

    static c3 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(QuestCollect.class), false, Collections.emptyList());
        c3 c3Var = new c3();
        cVar.a();
        return c3Var;
    }

    static QuestCollect n(o0 o0Var, a aVar, QuestCollect questCollect, QuestCollect questCollect2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestCollect.class), set);
        osObjectBuilder.c1(aVar.f17358e, questCollect2.realmGet$key());
        osObjectBuilder.c1(aVar.f17359f, questCollect2.realmGet$text());
        osObjectBuilder.V0(aVar.f17360g, Integer.valueOf(questCollect2.realmGet$count()));
        osObjectBuilder.g1();
        return questCollect;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17357q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17356p = (a) cVar.c();
        l0<QuestCollect> l0Var = new l0<>(this);
        this.f17357q = l0Var;
        l0Var.r(cVar.e());
        this.f17357q.s(cVar.f());
        this.f17357q.o(cVar.b());
        this.f17357q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17357q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c3 c3Var = (c3) obj;
        io.realm.a f10 = this.f17357q.f();
        io.realm.a f11 = c3Var.f17357q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17357q.g().getTable().p();
        String p11 = c3Var.f17357q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17357q.g().getObjectKey() == c3Var.f17357q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17357q.f().getPath();
        String p10 = this.f17357q.g().getTable().p();
        long objectKey = this.f17357q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.QuestCollect, io.realm.d3
    public int realmGet$count() {
        this.f17357q.f().e();
        return (int) this.f17357q.g().getLong(this.f17356p.f17360g);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestCollect, io.realm.d3
    public String realmGet$key() {
        this.f17357q.f().e();
        return this.f17357q.g().getString(this.f17356p.f17358e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestCollect, io.realm.d3
    public String realmGet$text() {
        this.f17357q.f().e();
        return this.f17357q.g().getString(this.f17356p.f17359f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestCollect, io.realm.d3
    public void realmSet$count(int i10) {
        if (this.f17357q.i()) {
            if (!this.f17357q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17357q.g();
            g10.getTable().E(this.f17356p.f17360g, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17357q.f().e();
        this.f17357q.g().setLong(this.f17356p.f17360g, i10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestCollect, io.realm.d3
    public void realmSet$key(String str) {
        if (this.f17357q.i()) {
            return;
        }
        this.f17357q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestCollect, io.realm.d3
    public void realmSet$text(String str) {
        if (this.f17357q.i()) {
            if (!this.f17357q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17357q.g();
            if (str == null) {
                g10.getTable().F(this.f17356p.f17359f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17356p.f17359f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17357q.f().e();
        if (str == null) {
            this.f17357q.g().setNull(this.f17356p.f17359f);
        } else {
            this.f17357q.g().setString(this.f17356p.f17359f, str);
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("QuestCollect = proxy[");
        sb2.append("{key:");
        String str2 = "null";
        if (realmGet$key() == null) {
            str = "null";
        } else {
            str = realmGet$key();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{text:");
        if (realmGet$text() != null) {
            str2 = realmGet$text();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{count:");
        sb2.append(realmGet$count());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
