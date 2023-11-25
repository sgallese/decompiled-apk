package io.realm;

import com.habitrpg.android.habitica.models.inventory.QuestProgressCollect;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_inventory_QuestProgressCollectRealmProxy.java */
/* loaded from: classes4.dex */
public class o3 extends QuestProgressCollect implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18039r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18040p;

    /* renamed from: q  reason: collision with root package name */
    private l0<QuestProgressCollect> f18041q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_QuestProgressCollectRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18042e;

        /* renamed from: f  reason: collision with root package name */
        long f18043f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("QuestProgressCollect");
            this.f18042e = a("key", "key", b10);
            this.f18043f = a("count", "count", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18042e = aVar.f18042e;
            aVar2.f18043f = aVar.f18043f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o3() {
        this.f18041q.p();
    }

    public static QuestProgressCollect c(o0 o0Var, a aVar, QuestProgressCollect questProgressCollect, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(questProgressCollect);
        if (oVar != null) {
            return (QuestProgressCollect) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestProgressCollect.class), set);
        osObjectBuilder.c1(aVar.f18042e, questProgressCollect.realmGet$key());
        osObjectBuilder.V0(aVar.f18043f, Integer.valueOf(questProgressCollect.realmGet$count()));
        o3 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(questProgressCollect, k10);
        return k10;
    }

    public static QuestProgressCollect d(o0 o0Var, a aVar, QuestProgressCollect questProgressCollect, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((questProgressCollect instanceof io.realm.internal.o) && !d1.isFrozen(questProgressCollect)) {
            io.realm.internal.o oVar = (io.realm.internal.o) questProgressCollect;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return questProgressCollect;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(questProgressCollect);
        if (oVar2 != null) {
            return (QuestProgressCollect) oVar2;
        }
        return c(o0Var, aVar, questProgressCollect, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static QuestProgressCollect f(QuestProgressCollect questProgressCollect, int i10, int i11, Map<a1, o.a<a1>> map) {
        QuestProgressCollect questProgressCollect2;
        if (i10 <= i11 && questProgressCollect != null) {
            o.a<a1> aVar = map.get(questProgressCollect);
            if (aVar == null) {
                questProgressCollect2 = new QuestProgressCollect();
                map.put(questProgressCollect, new o.a<>(i10, questProgressCollect2));
            } else if (i10 >= aVar.f17831a) {
                return (QuestProgressCollect) aVar.f17832b;
            } else {
                QuestProgressCollect questProgressCollect3 = (QuestProgressCollect) aVar.f17832b;
                aVar.f17831a = i10;
                questProgressCollect2 = questProgressCollect3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) questProgressCollect).b().f();
            questProgressCollect2.realmSet$key(questProgressCollect.realmGet$key());
            questProgressCollect2.realmSet$count(questProgressCollect.realmGet$count());
            return questProgressCollect2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "QuestProgressCollect", true, 2, 0);
        bVar.b("", "key", RealmFieldType.STRING, false, false, false);
        bVar.b("", "count", RealmFieldType.INTEGER, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18039r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, QuestProgressCollect questProgressCollect, Map<a1, Long> map) {
        if ((questProgressCollect instanceof io.realm.internal.o) && !d1.isFrozen(questProgressCollect)) {
            io.realm.internal.o oVar = (io.realm.internal.o) questProgressCollect;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(QuestProgressCollect.class).getNativePtr();
        a aVar = (a) o0Var.R().e(QuestProgressCollect.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(questProgressCollect, Long.valueOf(createEmbeddedObject));
        String realmGet$key = questProgressCollect.realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(nativePtr, aVar.f18042e, createEmbeddedObject, realmGet$key, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18042e, createEmbeddedObject, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f18043f, createEmbeddedObject, questProgressCollect.realmGet$count(), false);
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o3 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(QuestProgressCollect.class), false, Collections.emptyList());
        o3 o3Var = new o3();
        cVar.a();
        return o3Var;
    }

    static QuestProgressCollect l(o0 o0Var, a aVar, QuestProgressCollect questProgressCollect, QuestProgressCollect questProgressCollect2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestProgressCollect.class), set);
        osObjectBuilder.c1(aVar.f18042e, questProgressCollect2.realmGet$key());
        osObjectBuilder.V0(aVar.f18043f, Integer.valueOf(questProgressCollect2.realmGet$count()));
        osObjectBuilder.f1((io.realm.internal.o) questProgressCollect);
        return questProgressCollect;
    }

    public static void n(o0 o0Var, QuestProgressCollect questProgressCollect, QuestProgressCollect questProgressCollect2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(QuestProgressCollect.class), questProgressCollect2, questProgressCollect, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18041q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18040p = (a) cVar.c();
        l0<QuestProgressCollect> l0Var = new l0<>(this);
        this.f18041q = l0Var;
        l0Var.r(cVar.e());
        this.f18041q.s(cVar.f());
        this.f18041q.o(cVar.b());
        this.f18041q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18041q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o3 o3Var = (o3) obj;
        io.realm.a f10 = this.f18041q.f();
        io.realm.a f11 = o3Var.f18041q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18041q.g().getTable().p();
        String p11 = o3Var.f18041q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18041q.g().getObjectKey() == o3Var.f18041q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18041q.f().getPath();
        String p10 = this.f18041q.g().getTable().p();
        long objectKey = this.f18041q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgressCollect, io.realm.p3
    public int realmGet$count() {
        this.f18041q.f().e();
        return (int) this.f18041q.g().getLong(this.f18040p.f18043f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgressCollect, io.realm.p3
    public String realmGet$key() {
        this.f18041q.f().e();
        return this.f18041q.g().getString(this.f18040p.f18042e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgressCollect, io.realm.p3
    public void realmSet$count(int i10) {
        if (this.f18041q.i()) {
            if (!this.f18041q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18041q.g();
            g10.getTable().E(this.f18040p.f18043f, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18041q.f().e();
        this.f18041q.g().setLong(this.f18040p.f18043f, i10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestProgressCollect, io.realm.p3
    public void realmSet$key(String str) {
        if (this.f18041q.i()) {
            if (!this.f18041q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18041q.g();
            if (str == null) {
                g10.getTable().F(this.f18040p.f18042e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18040p.f18042e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18041q.f().e();
        if (str == null) {
            this.f18041q.g().setNull(this.f18040p.f18042e);
        } else {
            this.f18041q.g().setString(this.f18040p.f18042e, str);
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("QuestProgressCollect = proxy[");
        sb2.append("{key:");
        if (realmGet$key() != null) {
            str = realmGet$key();
        } else {
            str = "null";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{count:");
        sb2.append(realmGet$count());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
