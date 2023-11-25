package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.inventory.QuestBoss;
import com.habitrpg.android.habitica.models.inventory.QuestBossRage;
import io.realm.a;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.y2;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_inventory_QuestBossRealmProxy.java */
/* loaded from: classes4.dex */
public class a3 extends QuestBoss implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17261r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17262p;

    /* renamed from: q  reason: collision with root package name */
    private l0<QuestBoss> f17263q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_QuestBossRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17264e;

        /* renamed from: f  reason: collision with root package name */
        long f17265f;

        /* renamed from: g  reason: collision with root package name */
        long f17266g;

        /* renamed from: h  reason: collision with root package name */
        long f17267h;

        /* renamed from: i  reason: collision with root package name */
        long f17268i;

        a(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("QuestBoss");
            this.f17264e = a("key", "key", b10);
            this.f17265f = a(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, b10);
            this.f17266g = a("hp", "hp", b10);
            this.f17267h = a("str", "str", b10);
            this.f17268i = a("rage", "rage", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17264e = aVar.f17264e;
            aVar2.f17265f = aVar.f17265f;
            aVar2.f17266g = aVar.f17266g;
            aVar2.f17267h = aVar.f17267h;
            aVar2.f17268i = aVar.f17268i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a3() {
        this.f17263q.p();
    }

    public static QuestBoss c(o0 o0Var, a aVar, QuestBoss questBoss, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(questBoss);
        if (oVar != null) {
            return (QuestBoss) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestBoss.class), set);
        osObjectBuilder.c1(aVar.f17264e, questBoss.realmGet$key());
        osObjectBuilder.c1(aVar.f17265f, questBoss.realmGet$name());
        osObjectBuilder.V0(aVar.f17266g, Integer.valueOf(questBoss.realmGet$hp()));
        osObjectBuilder.T0(aVar.f17267h, Float.valueOf(questBoss.realmGet$str()));
        a3 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(questBoss, l10);
        QuestBossRage realmGet$rage = questBoss.realmGet$rage();
        if (realmGet$rage == null) {
            l10.realmSet$rage(null);
        } else {
            QuestBossRage questBossRage = (QuestBossRage) map.get(realmGet$rage);
            if (questBossRage != null) {
                l10.realmSet$rage(questBossRage);
            } else {
                l10.realmSet$rage(y2.d(o0Var, (y2.a) o0Var.R().e(QuestBossRage.class), realmGet$rage, z10, map, set));
            }
        }
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.inventory.QuestBoss d(io.realm.o0 r8, io.realm.a3.a r9, com.habitrpg.android.habitica.models.inventory.QuestBoss r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.QuestBoss r1 = (com.habitrpg.android.habitica.models.inventory.QuestBoss) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.QuestBoss> r2 = com.habitrpg.android.habitica.models.inventory.QuestBoss.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17264e
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
            io.realm.a3 r1 = new io.realm.a3     // Catch: java.lang.Throwable -> L8e
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
            com.habitrpg.android.habitica.models.inventory.QuestBoss r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.inventory.QuestBoss r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.a3.d(io.realm.o0, io.realm.a3$a, com.habitrpg.android.habitica.models.inventory.QuestBoss, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.QuestBoss");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static QuestBoss f(QuestBoss questBoss, int i10, int i11, Map<a1, o.a<a1>> map) {
        QuestBoss questBoss2;
        if (i10 <= i11 && questBoss != null) {
            o.a<a1> aVar = map.get(questBoss);
            if (aVar == null) {
                questBoss2 = new QuestBoss();
                map.put(questBoss, new o.a<>(i10, questBoss2));
            } else if (i10 >= aVar.f17831a) {
                return (QuestBoss) aVar.f17832b;
            } else {
                QuestBoss questBoss3 = (QuestBoss) aVar.f17832b;
                aVar.f17831a = i10;
                questBoss2 = questBoss3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) questBoss).b().f();
            questBoss2.realmSet$key(questBoss.realmGet$key());
            questBoss2.realmSet$name(questBoss.realmGet$name());
            questBoss2.realmSet$hp(questBoss.realmGet$hp());
            questBoss2.realmSet$str(questBoss.realmGet$str());
            questBoss2.realmSet$rage(y2.f(questBoss.realmGet$rage(), i10 + 1, i11, map));
            return questBoss2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "QuestBoss", false, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, true, false, false);
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.NAME, realmFieldType, false, false, false);
        bVar.b("", "hp", RealmFieldType.INTEGER, false, false, true);
        bVar.b("", "str", RealmFieldType.FLOAT, false, false, true);
        bVar.a("", "rage", RealmFieldType.OBJECT, "QuestBossRage");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17261r;
    }

    public static long i(o0 o0Var, QuestBoss questBoss, Map<a1, Long> map) {
        long nativeFindFirstString;
        if ((questBoss instanceof io.realm.internal.o) && !d1.isFrozen(questBoss)) {
            io.realm.internal.o oVar = (io.realm.internal.o) questBoss;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(QuestBoss.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestBoss.class);
        long j10 = aVar.f17264e;
        String realmGet$key = questBoss.realmGet$key();
        if (realmGet$key == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j10);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j10, realmGet$key);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j10, realmGet$key);
        }
        long j11 = nativeFindFirstString;
        map.put(questBoss, Long.valueOf(j11));
        String realmGet$name = questBoss.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.f17265f, j11, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17265f, j11, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f17266g, j11, questBoss.realmGet$hp(), false);
        Table.nativeSetFloat(nativePtr, aVar.f17267h, j11, questBoss.realmGet$str(), false);
        QuestBossRage realmGet$rage = questBoss.realmGet$rage();
        if (realmGet$rage != null) {
            Long l10 = map.get(realmGet$rage);
            if (l10 == null) {
                l10 = Long.valueOf(y2.i(o0Var, realmGet$rage, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f17268i, j11, l10.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17268i, j11);
        }
        return j11;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        long j11;
        Table c12 = o0Var.c1(QuestBoss.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestBoss.class);
        long j12 = aVar.f17264e;
        while (it.hasNext()) {
            QuestBoss questBoss = (QuestBoss) it.next();
            if (!map.containsKey(questBoss)) {
                if ((questBoss instanceof io.realm.internal.o) && !d1.isFrozen(questBoss)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) questBoss;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(questBoss, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = questBoss.realmGet$key();
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
                map.put(questBoss, Long.valueOf(j10));
                String realmGet$name = questBoss.realmGet$name();
                if (realmGet$name != null) {
                    j11 = j12;
                    Table.nativeSetString(nativePtr, aVar.f17265f, j10, realmGet$name, false);
                } else {
                    j11 = j12;
                    Table.nativeSetNull(nativePtr, aVar.f17265f, j10, false);
                }
                long j13 = j10;
                Table.nativeSetLong(nativePtr, aVar.f17266g, j13, questBoss.realmGet$hp(), false);
                Table.nativeSetFloat(nativePtr, aVar.f17267h, j13, questBoss.realmGet$str(), false);
                QuestBossRage realmGet$rage = questBoss.realmGet$rage();
                if (realmGet$rage != null) {
                    Long l10 = map.get(realmGet$rage);
                    if (l10 == null) {
                        l10 = Long.valueOf(y2.i(o0Var, realmGet$rage, map));
                    }
                    Table.nativeSetLink(nativePtr, aVar.f17268i, j10, l10.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar.f17268i, j10);
                }
                j12 = j11;
            }
        }
    }

    static a3 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(QuestBoss.class), false, Collections.emptyList());
        a3 a3Var = new a3();
        cVar.a();
        return a3Var;
    }

    static QuestBoss n(o0 o0Var, a aVar, QuestBoss questBoss, QuestBoss questBoss2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestBoss.class), set);
        osObjectBuilder.c1(aVar.f17264e, questBoss2.realmGet$key());
        osObjectBuilder.c1(aVar.f17265f, questBoss2.realmGet$name());
        osObjectBuilder.V0(aVar.f17266g, Integer.valueOf(questBoss2.realmGet$hp()));
        osObjectBuilder.T0(aVar.f17267h, Float.valueOf(questBoss2.realmGet$str()));
        QuestBossRage realmGet$rage = questBoss2.realmGet$rage();
        if (realmGet$rage == null) {
            osObjectBuilder.Z0(aVar.f17268i);
        } else {
            QuestBossRage questBossRage = (QuestBossRage) map.get(realmGet$rage);
            if (questBossRage != null) {
                osObjectBuilder.a1(aVar.f17268i, questBossRage);
            } else {
                osObjectBuilder.a1(aVar.f17268i, y2.d(o0Var, (y2.a) o0Var.R().e(QuestBossRage.class), realmGet$rage, true, map, set));
            }
        }
        osObjectBuilder.g1();
        return questBoss;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17263q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17262p = (a) cVar.c();
        l0<QuestBoss> l0Var = new l0<>(this);
        this.f17263q = l0Var;
        l0Var.r(cVar.e());
        this.f17263q.s(cVar.f());
        this.f17263q.o(cVar.b());
        this.f17263q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17263q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a3 a3Var = (a3) obj;
        io.realm.a f10 = this.f17263q.f();
        io.realm.a f11 = a3Var.f17263q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17263q.g().getTable().p();
        String p11 = a3Var.f17263q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17263q.g().getObjectKey() == a3Var.f17263q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17263q.f().getPath();
        String p10 = this.f17263q.g().getTable().p();
        long objectKey = this.f17263q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBoss, io.realm.b3
    public int realmGet$hp() {
        this.f17263q.f().e();
        return (int) this.f17263q.g().getLong(this.f17262p.f17266g);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBoss, io.realm.b3
    public String realmGet$key() {
        this.f17263q.f().e();
        return this.f17263q.g().getString(this.f17262p.f17264e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBoss, io.realm.b3
    public String realmGet$name() {
        this.f17263q.f().e();
        return this.f17263q.g().getString(this.f17262p.f17265f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBoss, io.realm.b3
    public QuestBossRage realmGet$rage() {
        this.f17263q.f().e();
        if (this.f17263q.g().isNullLink(this.f17262p.f17268i)) {
            return null;
        }
        return (QuestBossRage) this.f17263q.f().B(QuestBossRage.class, this.f17263q.g().getLink(this.f17262p.f17268i), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBoss, io.realm.b3
    public float realmGet$str() {
        this.f17263q.f().e();
        return this.f17263q.g().getFloat(this.f17262p.f17267h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBoss, io.realm.b3
    public void realmSet$hp(int i10) {
        if (this.f17263q.i()) {
            if (!this.f17263q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17263q.g();
            g10.getTable().E(this.f17262p.f17266g, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17263q.f().e();
        this.f17263q.g().setLong(this.f17262p.f17266g, i10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBoss, io.realm.b3
    public void realmSet$key(String str) {
        if (this.f17263q.i()) {
            return;
        }
        this.f17263q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBoss, io.realm.b3
    public void realmSet$name(String str) {
        if (this.f17263q.i()) {
            if (!this.f17263q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17263q.g();
            if (str == null) {
                g10.getTable().F(this.f17262p.f17265f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17262p.f17265f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17263q.f().e();
        if (str == null) {
            this.f17263q.g().setNull(this.f17262p.f17265f);
        } else {
            this.f17263q.g().setString(this.f17262p.f17265f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBoss, io.realm.b3
    public void realmSet$rage(QuestBossRage questBossRage) {
        o0 o0Var = (o0) this.f17263q.f();
        if (this.f17263q.i()) {
            if (!this.f17263q.d() || this.f17263q.e().contains("rage")) {
                return;
            }
            if (questBossRage != null && !d1.isManaged(questBossRage)) {
                questBossRage = (QuestBossRage) o0Var.F0(questBossRage, new v[0]);
            }
            io.realm.internal.q g10 = this.f17263q.g();
            if (questBossRage == null) {
                g10.nullifyLink(this.f17262p.f17268i);
                return;
            }
            this.f17263q.c(questBossRage);
            g10.getTable().D(this.f17262p.f17268i, g10.getObjectKey(), ((io.realm.internal.o) questBossRage).b().g().getObjectKey(), true);
            return;
        }
        this.f17263q.f().e();
        if (questBossRage == null) {
            this.f17263q.g().nullifyLink(this.f17262p.f17268i);
            return;
        }
        this.f17263q.c(questBossRage);
        this.f17263q.g().setLink(this.f17262p.f17268i, ((io.realm.internal.o) questBossRage).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBoss, io.realm.b3
    public void realmSet$str(float f10) {
        if (this.f17263q.i()) {
            if (!this.f17263q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17263q.g();
            g10.getTable().C(this.f17262p.f17267h, g10.getObjectKey(), f10, true);
            return;
        }
        this.f17263q.f().e();
        this.f17263q.g().setFloat(this.f17262p.f17267h, f10);
    }

    public String toString() {
        String str;
        String str2;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("QuestBoss = proxy[");
        sb2.append("{key:");
        String str3 = "null";
        if (realmGet$key() == null) {
            str = "null";
        } else {
            str = realmGet$key();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{name:");
        if (realmGet$name() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$name();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{hp:");
        sb2.append(realmGet$hp());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{str:");
        sb2.append(realmGet$str());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{rage:");
        if (realmGet$rage() != null) {
            str3 = "QuestBossRage";
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
