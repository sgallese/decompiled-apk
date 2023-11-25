package io.realm;

import com.habitrpg.android.habitica.models.inventory.QuestProgress;
import com.habitrpg.android.habitica.models.inventory.QuestProgressCollect;
import io.realm.a;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_inventory_QuestProgressRealmProxy.java */
/* loaded from: classes4.dex */
public class q3 extends QuestProgress implements io.realm.internal.o {

    /* renamed from: u  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18097u = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18098p;

    /* renamed from: q  reason: collision with root package name */
    private l0<QuestProgress> f18099q;

    /* renamed from: r  reason: collision with root package name */
    private x0<QuestProgressCollect> f18100r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_QuestProgressRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18101e;

        /* renamed from: f  reason: collision with root package name */
        long f18102f;

        /* renamed from: g  reason: collision with root package name */
        long f18103g;

        /* renamed from: h  reason: collision with root package name */
        long f18104h;

        /* renamed from: i  reason: collision with root package name */
        long f18105i;

        /* renamed from: j  reason: collision with root package name */
        long f18106j;

        /* renamed from: k  reason: collision with root package name */
        long f18107k;

        /* renamed from: l  reason: collision with root package name */
        long f18108l;

        a(OsSchemaInfo osSchemaInfo) {
            super(8);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("QuestProgress");
            this.f18101e = a("id", "id", b10);
            this.f18102f = a("key", "key", b10);
            this.f18103g = a("hp", "hp", b10);
            this.f18104h = a("rage", "rage", b10);
            this.f18105i = a("collectedItems", "collectedItems", b10);
            this.f18106j = a("collect", "collect", b10);
            this.f18107k = a("down", "down", b10);
            this.f18108l = a("up", "up", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18101e = aVar.f18101e;
            aVar2.f18102f = aVar.f18102f;
            aVar2.f18103g = aVar.f18103g;
            aVar2.f18104h = aVar.f18104h;
            aVar2.f18105i = aVar.f18105i;
            aVar2.f18106j = aVar.f18106j;
            aVar2.f18107k = aVar.f18107k;
            aVar2.f18108l = aVar.f18108l;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q3() {
        this.f18099q.p();
    }

    public static QuestProgress c(o0 o0Var, a aVar, QuestProgress questProgress, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(questProgress);
        if (oVar != null) {
            return (QuestProgress) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestProgress.class), set);
        osObjectBuilder.c1(aVar.f18101e, questProgress.realmGet$id());
        osObjectBuilder.c1(aVar.f18102f, questProgress.realmGet$key());
        osObjectBuilder.N0(aVar.f18103g, Double.valueOf(questProgress.realmGet$hp()));
        osObjectBuilder.N0(aVar.f18104h, Double.valueOf(questProgress.realmGet$rage()));
        osObjectBuilder.V0(aVar.f18105i, Integer.valueOf(questProgress.realmGet$collectedItems()));
        osObjectBuilder.T0(aVar.f18107k, Float.valueOf(questProgress.realmGet$down()));
        osObjectBuilder.T0(aVar.f18108l, Float.valueOf(questProgress.realmGet$up()));
        q3 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(questProgress, k10);
        x0<QuestProgressCollect> realmGet$collect = questProgress.realmGet$collect();
        if (realmGet$collect != null) {
            x0<QuestProgressCollect> realmGet$collect2 = k10.realmGet$collect();
            realmGet$collect2.clear();
            for (int i10 = 0; i10 < realmGet$collect.size(); i10++) {
                QuestProgressCollect questProgressCollect = realmGet$collect.get(i10);
                if (((QuestProgressCollect) map.get(questProgressCollect)) == null) {
                    o3 k11 = o3.k(o0Var, o0Var.c1(QuestProgressCollect.class).s(realmGet$collect2.m().n()));
                    map.put(questProgressCollect, k11);
                    o3.n(o0Var, questProgressCollect, k11, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecollect.toString()");
                }
            }
        }
        return k10;
    }

    public static QuestProgress d(o0 o0Var, a aVar, QuestProgress questProgress, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((questProgress instanceof io.realm.internal.o) && !d1.isFrozen(questProgress)) {
            io.realm.internal.o oVar = (io.realm.internal.o) questProgress;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return questProgress;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(questProgress);
        if (oVar2 != null) {
            return (QuestProgress) oVar2;
        }
        return c(o0Var, aVar, questProgress, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static QuestProgress f(QuestProgress questProgress, int i10, int i11, Map<a1, o.a<a1>> map) {
        QuestProgress questProgress2;
        if (i10 > i11 || questProgress == null) {
            return null;
        }
        o.a<a1> aVar = map.get(questProgress);
        if (aVar == null) {
            questProgress2 = new QuestProgress();
            map.put(questProgress, new o.a<>(i10, questProgress2));
        } else if (i10 >= aVar.f17831a) {
            return (QuestProgress) aVar.f17832b;
        } else {
            QuestProgress questProgress3 = (QuestProgress) aVar.f17832b;
            aVar.f17831a = i10;
            questProgress2 = questProgress3;
        }
        o0 o0Var = (o0) ((io.realm.internal.o) questProgress).b().f();
        questProgress2.realmSet$id(questProgress.realmGet$id());
        questProgress2.realmSet$key(questProgress.realmGet$key());
        questProgress2.realmSet$hp(questProgress.realmGet$hp());
        questProgress2.realmSet$rage(questProgress.realmGet$rage());
        questProgress2.realmSet$collectedItems(questProgress.realmGet$collectedItems());
        if (i10 == i11) {
            questProgress2.realmSet$collect(null);
        } else {
            x0<QuestProgressCollect> realmGet$collect = questProgress.realmGet$collect();
            x0<QuestProgressCollect> x0Var = new x0<>();
            questProgress2.realmSet$collect(x0Var);
            int i12 = i10 + 1;
            int size = realmGet$collect.size();
            for (int i13 = 0; i13 < size; i13++) {
                x0Var.add(o3.f(realmGet$collect.get(i13), i12, i11, map));
            }
        }
        questProgress2.realmSet$down(questProgress.realmGet$down());
        questProgress2.realmSet$up(questProgress.realmGet$up());
        return questProgress2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "QuestProgress", true, 8, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, false, false, false);
        bVar.b("", "key", realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.DOUBLE;
        bVar.b("", "hp", realmFieldType2, false, false, true);
        bVar.b("", "rage", realmFieldType2, false, false, true);
        bVar.b("", "collectedItems", RealmFieldType.INTEGER, false, false, true);
        bVar.a("", "collect", RealmFieldType.LIST, "QuestProgressCollect");
        RealmFieldType realmFieldType3 = RealmFieldType.FLOAT;
        bVar.b("", "down", realmFieldType3, false, false, true);
        bVar.b("", "up", realmFieldType3, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18097u;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, QuestProgress questProgress, Map<a1, Long> map) {
        long j12;
        if ((questProgress instanceof io.realm.internal.o) && !d1.isFrozen(questProgress)) {
            io.realm.internal.o oVar = (io.realm.internal.o) questProgress;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(QuestProgress.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestProgress.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(questProgress, Long.valueOf(createEmbeddedObject));
        String realmGet$id = questProgress.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, aVar.f18101e, createEmbeddedObject, realmGet$id, false);
            j12 = createEmbeddedObject;
        } else {
            j12 = createEmbeddedObject;
            Table.nativeSetNull(nativePtr, aVar.f18101e, createEmbeddedObject, false);
        }
        String realmGet$key = questProgress.realmGet$key();
        if (realmGet$key != null) {
            long j13 = j12;
            Table.nativeSetString(nativePtr, aVar.f18102f, j13, realmGet$key, false);
            j12 = j13;
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18102f, j12, false);
        }
        long j14 = j12;
        Table.nativeSetDouble(nativePtr, aVar.f18103g, j14, questProgress.realmGet$hp(), false);
        Table.nativeSetDouble(nativePtr, aVar.f18104h, j14, questProgress.realmGet$rage(), false);
        Table.nativeSetLong(nativePtr, aVar.f18105i, j14, questProgress.realmGet$collectedItems(), false);
        OsList osList = new OsList(c12.s(j14), aVar.f18106j);
        x0<QuestProgressCollect> realmGet$collect = questProgress.realmGet$collect();
        osList.K();
        if (realmGet$collect != null) {
            Iterator<QuestProgressCollect> it = realmGet$collect.iterator();
            while (it.hasNext()) {
                QuestProgressCollect next = it.next();
                Long l10 = map.get(next);
                if (l10 == null) {
                    o3.i(o0Var, c12, aVar.f18106j, j14, next, map);
                    aVar = aVar;
                    j14 = j14;
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
                }
            }
        }
        a aVar2 = aVar;
        long j15 = j14;
        Table.nativeSetFloat(nativePtr, aVar2.f18107k, j15, questProgress.realmGet$down(), false);
        Table.nativeSetFloat(nativePtr, aVar2.f18108l, j15, questProgress.realmGet$up(), false);
        return j15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q3 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(QuestProgress.class), false, Collections.emptyList());
        q3 q3Var = new q3();
        cVar.a();
        return q3Var;
    }

    static QuestProgress l(o0 o0Var, a aVar, QuestProgress questProgress, QuestProgress questProgress2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestProgress.class), set);
        osObjectBuilder.c1(aVar.f18101e, questProgress2.realmGet$id());
        osObjectBuilder.c1(aVar.f18102f, questProgress2.realmGet$key());
        osObjectBuilder.N0(aVar.f18103g, Double.valueOf(questProgress2.realmGet$hp()));
        osObjectBuilder.N0(aVar.f18104h, Double.valueOf(questProgress2.realmGet$rage()));
        osObjectBuilder.V0(aVar.f18105i, Integer.valueOf(questProgress2.realmGet$collectedItems()));
        x0<QuestProgressCollect> realmGet$collect = questProgress2.realmGet$collect();
        if (realmGet$collect != null) {
            x0 x0Var = new x0();
            OsList m10 = questProgress.realmGet$collect().m();
            m10.q();
            for (int i10 = 0; i10 < realmGet$collect.size(); i10++) {
                QuestProgressCollect questProgressCollect = realmGet$collect.get(i10);
                if (((QuestProgressCollect) map.get(questProgressCollect)) == null) {
                    o3 k10 = o3.k(o0Var, o0Var.c1(QuestProgressCollect.class).s(m10.n()));
                    map.put(questProgressCollect, k10);
                    x0Var.add(k10);
                    o3.n(o0Var, questProgressCollect, k10, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecollect.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f18106j, new x0());
        }
        osObjectBuilder.T0(aVar.f18107k, Float.valueOf(questProgress2.realmGet$down()));
        osObjectBuilder.T0(aVar.f18108l, Float.valueOf(questProgress2.realmGet$up()));
        osObjectBuilder.f1((io.realm.internal.o) questProgress);
        return questProgress;
    }

    public static void n(o0 o0Var, QuestProgress questProgress, QuestProgress questProgress2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(QuestProgress.class), questProgress2, questProgress, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18099q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18098p = (a) cVar.c();
        l0<QuestProgress> l0Var = new l0<>(this);
        this.f18099q = l0Var;
        l0Var.r(cVar.e());
        this.f18099q.s(cVar.f());
        this.f18099q.o(cVar.b());
        this.f18099q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18099q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q3 q3Var = (q3) obj;
        io.realm.a f10 = this.f18099q.f();
        io.realm.a f11 = q3Var.f18099q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18099q.g().getTable().p();
        String p11 = q3Var.f18099q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18099q.g().getObjectKey() == q3Var.f18099q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18099q.f().getPath();
        String p10 = this.f18099q.g().getTable().p();
        long objectKey = this.f18099q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public x0<QuestProgressCollect> realmGet$collect() {
        this.f18099q.f().e();
        x0<QuestProgressCollect> x0Var = this.f18100r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<QuestProgressCollect> x0Var2 = new x0<>(QuestProgressCollect.class, this.f18099q.g().getModelList(this.f18098p.f18106j), this.f18099q.f());
        this.f18100r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public int realmGet$collectedItems() {
        this.f18099q.f().e();
        return (int) this.f18099q.g().getLong(this.f18098p.f18105i);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public float realmGet$down() {
        this.f18099q.f().e();
        return this.f18099q.g().getFloat(this.f18098p.f18107k);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public double realmGet$hp() {
        this.f18099q.f().e();
        return this.f18099q.g().getDouble(this.f18098p.f18103g);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public String realmGet$id() {
        this.f18099q.f().e();
        return this.f18099q.g().getString(this.f18098p.f18101e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public String realmGet$key() {
        this.f18099q.f().e();
        return this.f18099q.g().getString(this.f18098p.f18102f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public double realmGet$rage() {
        this.f18099q.f().e();
        return this.f18099q.g().getDouble(this.f18098p.f18104h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public float realmGet$up() {
        this.f18099q.f().e();
        return this.f18099q.g().getFloat(this.f18098p.f18108l);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public void realmSet$collect(x0<QuestProgressCollect> x0Var) {
        int i10 = 0;
        if (this.f18099q.i()) {
            if (!this.f18099q.d() || this.f18099q.e().contains("collect")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f18099q.f();
                x0<QuestProgressCollect> x0Var2 = new x0<>();
                Iterator<QuestProgressCollect> it = x0Var.iterator();
                while (it.hasNext()) {
                    QuestProgressCollect next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((QuestProgressCollect) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f18099q.f().e();
        OsList modelList = this.f18099q.g().getModelList(this.f18098p.f18106j);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                QuestProgressCollect questProgressCollect = x0Var.get(i10);
                this.f18099q.c(questProgressCollect);
                modelList.V(i10, ((io.realm.internal.o) questProgressCollect).b().g().getObjectKey());
                i10++;
            }
            return;
        }
        modelList.K();
        if (x0Var == null) {
            return;
        }
        int size2 = x0Var.size();
        while (i10 < size2) {
            QuestProgressCollect questProgressCollect2 = x0Var.get(i10);
            this.f18099q.c(questProgressCollect2);
            modelList.k(((io.realm.internal.o) questProgressCollect2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public void realmSet$collectedItems(int i10) {
        if (this.f18099q.i()) {
            if (!this.f18099q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18099q.g();
            g10.getTable().E(this.f18098p.f18105i, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18099q.f().e();
        this.f18099q.g().setLong(this.f18098p.f18105i, i10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public void realmSet$down(float f10) {
        if (this.f18099q.i()) {
            if (!this.f18099q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18099q.g();
            g10.getTable().C(this.f18098p.f18107k, g10.getObjectKey(), f10, true);
            return;
        }
        this.f18099q.f().e();
        this.f18099q.g().setFloat(this.f18098p.f18107k, f10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public void realmSet$hp(double d10) {
        if (this.f18099q.i()) {
            if (!this.f18099q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18099q.g();
            g10.getTable().B(this.f18098p.f18103g, g10.getObjectKey(), d10, true);
            return;
        }
        this.f18099q.f().e();
        this.f18099q.g().setDouble(this.f18098p.f18103g, d10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public void realmSet$id(String str) {
        if (this.f18099q.i()) {
            if (!this.f18099q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18099q.g();
            if (str == null) {
                g10.getTable().F(this.f18098p.f18101e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18098p.f18101e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18099q.f().e();
        if (str == null) {
            this.f18099q.g().setNull(this.f18098p.f18101e);
        } else {
            this.f18099q.g().setString(this.f18098p.f18101e, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public void realmSet$key(String str) {
        if (this.f18099q.i()) {
            if (!this.f18099q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18099q.g();
            if (str == null) {
                g10.getTable().F(this.f18098p.f18102f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18098p.f18102f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18099q.f().e();
        if (str == null) {
            this.f18099q.g().setNull(this.f18098p.f18102f);
        } else {
            this.f18099q.g().setString(this.f18098p.f18102f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public void realmSet$rage(double d10) {
        if (this.f18099q.i()) {
            if (!this.f18099q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18099q.g();
            g10.getTable().B(this.f18098p.f18104h, g10.getObjectKey(), d10, true);
            return;
        }
        this.f18099q.f().e();
        this.f18099q.g().setDouble(this.f18098p.f18104h, d10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgress, io.realm.r3
    public void realmSet$up(float f10) {
        if (this.f18099q.i()) {
            if (!this.f18099q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18099q.g();
            g10.getTable().C(this.f18098p.f18108l, g10.getObjectKey(), f10, true);
            return;
        }
        this.f18099q.f().e();
        this.f18099q.g().setFloat(this.f18098p.f18108l, f10);
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("QuestProgress = proxy[");
        sb2.append("{id:");
        String str2 = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{key:");
        if (realmGet$key() != null) {
            str2 = realmGet$key();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{hp:");
        sb2.append(realmGet$hp());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{rage:");
        sb2.append(realmGet$rage());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{collectedItems:");
        sb2.append(realmGet$collectedItems());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{collect:");
        sb2.append("RealmList<QuestProgressCollect>[");
        sb2.append(realmGet$collect().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{down:");
        sb2.append(realmGet$down());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{up:");
        sb2.append(realmGet$up());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
