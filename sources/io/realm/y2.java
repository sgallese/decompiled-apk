package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.inventory.QuestBossRage;
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

/* compiled from: com_habitrpg_android_habitica_models_inventory_QuestBossRageRealmProxy.java */
/* loaded from: classes4.dex */
public class y2 extends QuestBossRage implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18430r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18431p;

    /* renamed from: q  reason: collision with root package name */
    private l0<QuestBossRage> f18432q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_QuestBossRageRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18433e;

        /* renamed from: f  reason: collision with root package name */
        long f18434f;

        /* renamed from: g  reason: collision with root package name */
        long f18435g;

        /* renamed from: h  reason: collision with root package name */
        long f18436h;

        /* renamed from: i  reason: collision with root package name */
        long f18437i;

        /* renamed from: j  reason: collision with root package name */
        long f18438j;

        a(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("QuestBossRage");
            this.f18433e = a("key", "key", b10);
            this.f18434f = a("title", "title", b10);
            this.f18435g = a("description", "description", b10);
            this.f18436h = a(AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.VALUE, b10);
            this.f18437i = a("stables", "stables", b10);
            this.f18438j = a("market", "market", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18433e = aVar.f18433e;
            aVar2.f18434f = aVar.f18434f;
            aVar2.f18435g = aVar.f18435g;
            aVar2.f18436h = aVar.f18436h;
            aVar2.f18437i = aVar.f18437i;
            aVar2.f18438j = aVar.f18438j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y2() {
        this.f18432q.p();
    }

    public static QuestBossRage c(o0 o0Var, a aVar, QuestBossRage questBossRage, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(questBossRage);
        if (oVar != null) {
            return (QuestBossRage) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestBossRage.class), set);
        osObjectBuilder.c1(aVar.f18433e, questBossRage.realmGet$key());
        osObjectBuilder.c1(aVar.f18434f, questBossRage.realmGet$title());
        osObjectBuilder.c1(aVar.f18435g, questBossRage.realmGet$description());
        osObjectBuilder.N0(aVar.f18436h, Double.valueOf(questBossRage.realmGet$value()));
        osObjectBuilder.c1(aVar.f18437i, questBossRage.realmGet$stables());
        osObjectBuilder.c1(aVar.f18438j, questBossRage.realmGet$market());
        y2 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(questBossRage, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.inventory.QuestBossRage d(io.realm.o0 r8, io.realm.y2.a r9, com.habitrpg.android.habitica.models.inventory.QuestBossRage r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.QuestBossRage r1 = (com.habitrpg.android.habitica.models.inventory.QuestBossRage) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.QuestBossRage> r2 = com.habitrpg.android.habitica.models.inventory.QuestBossRage.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18433e
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
            io.realm.y2 r1 = new io.realm.y2     // Catch: java.lang.Throwable -> L8e
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
            com.habitrpg.android.habitica.models.inventory.QuestBossRage r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.inventory.QuestBossRage r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.y2.d(io.realm.o0, io.realm.y2$a, com.habitrpg.android.habitica.models.inventory.QuestBossRage, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.QuestBossRage");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static QuestBossRage f(QuestBossRage questBossRage, int i10, int i11, Map<a1, o.a<a1>> map) {
        QuestBossRage questBossRage2;
        if (i10 <= i11 && questBossRage != null) {
            o.a<a1> aVar = map.get(questBossRage);
            if (aVar == null) {
                questBossRage2 = new QuestBossRage();
                map.put(questBossRage, new o.a<>(i10, questBossRage2));
            } else if (i10 >= aVar.f17831a) {
                return (QuestBossRage) aVar.f17832b;
            } else {
                QuestBossRage questBossRage3 = (QuestBossRage) aVar.f17832b;
                aVar.f17831a = i10;
                questBossRage2 = questBossRage3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) questBossRage).b().f();
            questBossRage2.realmSet$key(questBossRage.realmGet$key());
            questBossRage2.realmSet$title(questBossRage.realmGet$title());
            questBossRage2.realmSet$description(questBossRage.realmGet$description());
            questBossRage2.realmSet$value(questBossRage.realmGet$value());
            questBossRage2.realmSet$stables(questBossRage.realmGet$stables());
            questBossRage2.realmSet$market(questBossRage.realmGet$market());
            return questBossRage2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "QuestBossRage", false, 6, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, true, false, false);
        bVar.b("", "title", realmFieldType, false, false, false);
        bVar.b("", "description", realmFieldType, false, false, false);
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.VALUE, RealmFieldType.DOUBLE, false, false, true);
        bVar.b("", "stables", realmFieldType, false, false, false);
        bVar.b("", "market", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18430r;
    }

    public static long i(o0 o0Var, QuestBossRage questBossRage, Map<a1, Long> map) {
        long nativeFindFirstString;
        if ((questBossRage instanceof io.realm.internal.o) && !d1.isFrozen(questBossRage)) {
            io.realm.internal.o oVar = (io.realm.internal.o) questBossRage;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(QuestBossRage.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestBossRage.class);
        long j10 = aVar.f18433e;
        String realmGet$key = questBossRage.realmGet$key();
        if (realmGet$key == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j10);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j10, realmGet$key);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j10, realmGet$key);
        }
        long j11 = nativeFindFirstString;
        map.put(questBossRage, Long.valueOf(j11));
        String realmGet$title = questBossRage.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, aVar.f18434f, j11, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18434f, j11, false);
        }
        String realmGet$description = questBossRage.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, aVar.f18435g, j11, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18435g, j11, false);
        }
        Table.nativeSetDouble(nativePtr, aVar.f18436h, j11, questBossRage.realmGet$value(), false);
        String realmGet$stables = questBossRage.realmGet$stables();
        if (realmGet$stables != null) {
            Table.nativeSetString(nativePtr, aVar.f18437i, j11, realmGet$stables, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18437i, j11, false);
        }
        String realmGet$market = questBossRage.realmGet$market();
        if (realmGet$market != null) {
            Table.nativeSetString(nativePtr, aVar.f18438j, j11, realmGet$market, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18438j, j11, false);
        }
        return j11;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        long j11;
        Table c12 = o0Var.c1(QuestBossRage.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestBossRage.class);
        long j12 = aVar.f18433e;
        while (it.hasNext()) {
            QuestBossRage questBossRage = (QuestBossRage) it.next();
            if (!map.containsKey(questBossRage)) {
                if ((questBossRage instanceof io.realm.internal.o) && !d1.isFrozen(questBossRage)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) questBossRage;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(questBossRage, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = questBossRage.realmGet$key();
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
                map.put(questBossRage, Long.valueOf(j10));
                String realmGet$title = questBossRage.realmGet$title();
                if (realmGet$title != null) {
                    j11 = j12;
                    Table.nativeSetString(nativePtr, aVar.f18434f, j10, realmGet$title, false);
                } else {
                    j11 = j12;
                    Table.nativeSetNull(nativePtr, aVar.f18434f, j10, false);
                }
                String realmGet$description = questBossRage.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, aVar.f18435g, j10, realmGet$description, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18435g, j10, false);
                }
                Table.nativeSetDouble(nativePtr, aVar.f18436h, j10, questBossRage.realmGet$value(), false);
                String realmGet$stables = questBossRage.realmGet$stables();
                if (realmGet$stables != null) {
                    Table.nativeSetString(nativePtr, aVar.f18437i, j10, realmGet$stables, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18437i, j10, false);
                }
                String realmGet$market = questBossRage.realmGet$market();
                if (realmGet$market != null) {
                    Table.nativeSetString(nativePtr, aVar.f18438j, j10, realmGet$market, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18438j, j10, false);
                }
                j12 = j11;
            }
        }
    }

    static y2 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(QuestBossRage.class), false, Collections.emptyList());
        y2 y2Var = new y2();
        cVar.a();
        return y2Var;
    }

    static QuestBossRage n(o0 o0Var, a aVar, QuestBossRage questBossRage, QuestBossRage questBossRage2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestBossRage.class), set);
        osObjectBuilder.c1(aVar.f18433e, questBossRage2.realmGet$key());
        osObjectBuilder.c1(aVar.f18434f, questBossRage2.realmGet$title());
        osObjectBuilder.c1(aVar.f18435g, questBossRage2.realmGet$description());
        osObjectBuilder.N0(aVar.f18436h, Double.valueOf(questBossRage2.realmGet$value()));
        osObjectBuilder.c1(aVar.f18437i, questBossRage2.realmGet$stables());
        osObjectBuilder.c1(aVar.f18438j, questBossRage2.realmGet$market());
        osObjectBuilder.g1();
        return questBossRage;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18432q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18431p = (a) cVar.c();
        l0<QuestBossRage> l0Var = new l0<>(this);
        this.f18432q = l0Var;
        l0Var.r(cVar.e());
        this.f18432q.s(cVar.f());
        this.f18432q.o(cVar.b());
        this.f18432q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18432q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y2 y2Var = (y2) obj;
        io.realm.a f10 = this.f18432q.f();
        io.realm.a f11 = y2Var.f18432q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18432q.g().getTable().p();
        String p11 = y2Var.f18432q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18432q.g().getObjectKey() == y2Var.f18432q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18432q.f().getPath();
        String p10 = this.f18432q.g().getTable().p();
        long objectKey = this.f18432q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBossRage, io.realm.z2
    public String realmGet$description() {
        this.f18432q.f().e();
        return this.f18432q.g().getString(this.f18431p.f18435g);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBossRage, io.realm.z2
    public String realmGet$key() {
        this.f18432q.f().e();
        return this.f18432q.g().getString(this.f18431p.f18433e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBossRage, io.realm.z2
    public String realmGet$market() {
        this.f18432q.f().e();
        return this.f18432q.g().getString(this.f18431p.f18438j);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBossRage, io.realm.z2
    public String realmGet$stables() {
        this.f18432q.f().e();
        return this.f18432q.g().getString(this.f18431p.f18437i);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBossRage, io.realm.z2
    public String realmGet$title() {
        this.f18432q.f().e();
        return this.f18432q.g().getString(this.f18431p.f18434f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBossRage, io.realm.z2
    public double realmGet$value() {
        this.f18432q.f().e();
        return this.f18432q.g().getDouble(this.f18431p.f18436h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBossRage, io.realm.z2
    public void realmSet$description(String str) {
        if (this.f18432q.i()) {
            if (!this.f18432q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18432q.g();
            if (str == null) {
                g10.getTable().F(this.f18431p.f18435g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18431p.f18435g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18432q.f().e();
        if (str == null) {
            this.f18432q.g().setNull(this.f18431p.f18435g);
        } else {
            this.f18432q.g().setString(this.f18431p.f18435g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBossRage, io.realm.z2
    public void realmSet$key(String str) {
        if (this.f18432q.i()) {
            return;
        }
        this.f18432q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBossRage, io.realm.z2
    public void realmSet$market(String str) {
        if (this.f18432q.i()) {
            if (!this.f18432q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18432q.g();
            if (str == null) {
                g10.getTable().F(this.f18431p.f18438j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18431p.f18438j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18432q.f().e();
        if (str == null) {
            this.f18432q.g().setNull(this.f18431p.f18438j);
        } else {
            this.f18432q.g().setString(this.f18431p.f18438j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBossRage, io.realm.z2
    public void realmSet$stables(String str) {
        if (this.f18432q.i()) {
            if (!this.f18432q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18432q.g();
            if (str == null) {
                g10.getTable().F(this.f18431p.f18437i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18431p.f18437i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18432q.f().e();
        if (str == null) {
            this.f18432q.g().setNull(this.f18431p.f18437i);
        } else {
            this.f18432q.g().setString(this.f18431p.f18437i, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBossRage, io.realm.z2
    public void realmSet$title(String str) {
        if (this.f18432q.i()) {
            if (!this.f18432q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18432q.g();
            if (str == null) {
                g10.getTable().F(this.f18431p.f18434f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18431p.f18434f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18432q.f().e();
        if (str == null) {
            this.f18432q.g().setNull(this.f18431p.f18434f);
        } else {
            this.f18432q.g().setString(this.f18431p.f18434f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestBossRage, io.realm.z2
    public void realmSet$value(double d10) {
        if (this.f18432q.i()) {
            if (!this.f18432q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18432q.g();
            g10.getTable().B(this.f18431p.f18436h, g10.getObjectKey(), d10, true);
            return;
        }
        this.f18432q.f().e();
        this.f18432q.g().setDouble(this.f18431p.f18436h, d10);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("QuestBossRage = proxy[");
        sb2.append("{key:");
        String str5 = "null";
        if (realmGet$key() == null) {
            str = "null";
        } else {
            str = realmGet$key();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{title:");
        if (realmGet$title() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$title();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{description:");
        if (realmGet$description() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$description();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{value:");
        sb2.append(realmGet$value());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{stables:");
        if (realmGet$stables() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$stables();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{market:");
        if (realmGet$market() != null) {
            str5 = realmGet$market();
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
