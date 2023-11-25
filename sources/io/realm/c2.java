package io.realm;

import com.habitrpg.android.habitica.models.WorldStateEvent;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_WorldStateEventRealmProxy.java */
/* loaded from: classes4.dex */
public class c2 extends WorldStateEvent implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17345r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17346p;

    /* renamed from: q  reason: collision with root package name */
    private l0<WorldStateEvent> f17347q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_WorldStateEventRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17348e;

        /* renamed from: f  reason: collision with root package name */
        long f17349f;

        /* renamed from: g  reason: collision with root package name */
        long f17350g;

        /* renamed from: h  reason: collision with root package name */
        long f17351h;

        /* renamed from: i  reason: collision with root package name */
        long f17352i;

        /* renamed from: j  reason: collision with root package name */
        long f17353j;

        /* renamed from: k  reason: collision with root package name */
        long f17354k;

        a(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("WorldStateEvent");
            this.f17348e = a("eventKey", "eventKey", b10);
            this.f17349f = a("start", "start", b10);
            this.f17350g = a("end", "end", b10);
            this.f17351h = a(NavigationDrawerFragment.SIDEBAR_PROMO, NavigationDrawerFragment.SIDEBAR_PROMO, b10);
            this.f17352i = a("npcImageSuffix", "npcImageSuffix", b10);
            this.f17353j = a("aprilFools", "aprilFools", b10);
            this.f17354k = a("gear", "gear", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17348e = aVar.f17348e;
            aVar2.f17349f = aVar.f17349f;
            aVar2.f17350g = aVar.f17350g;
            aVar2.f17351h = aVar.f17351h;
            aVar2.f17352i = aVar.f17352i;
            aVar2.f17353j = aVar.f17353j;
            aVar2.f17354k = aVar.f17354k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c2() {
        this.f17347q.p();
    }

    public static WorldStateEvent c(o0 o0Var, a aVar, WorldStateEvent worldStateEvent, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(worldStateEvent);
        if (oVar != null) {
            return (WorldStateEvent) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(WorldStateEvent.class), set);
        osObjectBuilder.c1(aVar.f17348e, worldStateEvent.realmGet$eventKey());
        osObjectBuilder.I0(aVar.f17349f, worldStateEvent.realmGet$start());
        osObjectBuilder.I0(aVar.f17350g, worldStateEvent.realmGet$end());
        osObjectBuilder.c1(aVar.f17351h, worldStateEvent.realmGet$promo());
        osObjectBuilder.c1(aVar.f17352i, worldStateEvent.realmGet$npcImageSuffix());
        osObjectBuilder.c1(aVar.f17353j, worldStateEvent.realmGet$aprilFools());
        osObjectBuilder.F0(aVar.f17354k, Boolean.valueOf(worldStateEvent.realmGet$gear()));
        c2 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(worldStateEvent, k10);
        return k10;
    }

    public static WorldStateEvent d(o0 o0Var, a aVar, WorldStateEvent worldStateEvent, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((worldStateEvent instanceof io.realm.internal.o) && !d1.isFrozen(worldStateEvent)) {
            io.realm.internal.o oVar = (io.realm.internal.o) worldStateEvent;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return worldStateEvent;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(worldStateEvent);
        if (oVar2 != null) {
            return (WorldStateEvent) oVar2;
        }
        return c(o0Var, aVar, worldStateEvent, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static WorldStateEvent f(WorldStateEvent worldStateEvent, int i10, int i11, Map<a1, o.a<a1>> map) {
        WorldStateEvent worldStateEvent2;
        if (i10 <= i11 && worldStateEvent != null) {
            o.a<a1> aVar = map.get(worldStateEvent);
            if (aVar == null) {
                worldStateEvent2 = new WorldStateEvent();
                map.put(worldStateEvent, new o.a<>(i10, worldStateEvent2));
            } else if (i10 >= aVar.f17831a) {
                return (WorldStateEvent) aVar.f17832b;
            } else {
                WorldStateEvent worldStateEvent3 = (WorldStateEvent) aVar.f17832b;
                aVar.f17831a = i10;
                worldStateEvent2 = worldStateEvent3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) worldStateEvent).b().f();
            worldStateEvent2.realmSet$eventKey(worldStateEvent.realmGet$eventKey());
            worldStateEvent2.realmSet$start(worldStateEvent.realmGet$start());
            worldStateEvent2.realmSet$end(worldStateEvent.realmGet$end());
            worldStateEvent2.realmSet$promo(worldStateEvent.realmGet$promo());
            worldStateEvent2.realmSet$npcImageSuffix(worldStateEvent.realmGet$npcImageSuffix());
            worldStateEvent2.realmSet$aprilFools(worldStateEvent.realmGet$aprilFools());
            worldStateEvent2.realmSet$gear(worldStateEvent.realmGet$gear());
            return worldStateEvent2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "WorldStateEvent", true, 7, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "eventKey", realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.DATE;
        bVar.b("", "start", realmFieldType2, false, false, false);
        bVar.b("", "end", realmFieldType2, false, false, false);
        bVar.b("", NavigationDrawerFragment.SIDEBAR_PROMO, realmFieldType, false, false, false);
        bVar.b("", "npcImageSuffix", realmFieldType, false, false, false);
        bVar.b("", "aprilFools", realmFieldType, false, false, false);
        bVar.b("", "gear", RealmFieldType.BOOLEAN, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17345r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, WorldStateEvent worldStateEvent, Map<a1, Long> map) {
        if ((worldStateEvent instanceof io.realm.internal.o) && !d1.isFrozen(worldStateEvent)) {
            io.realm.internal.o oVar = (io.realm.internal.o) worldStateEvent;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(WorldStateEvent.class).getNativePtr();
        a aVar = (a) o0Var.R().e(WorldStateEvent.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(worldStateEvent, Long.valueOf(createEmbeddedObject));
        String realmGet$eventKey = worldStateEvent.realmGet$eventKey();
        if (realmGet$eventKey != null) {
            Table.nativeSetString(nativePtr, aVar.f17348e, createEmbeddedObject, realmGet$eventKey, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17348e, createEmbeddedObject, false);
        }
        Date realmGet$start = worldStateEvent.realmGet$start();
        if (realmGet$start != null) {
            Table.nativeSetTimestamp(nativePtr, aVar.f17349f, createEmbeddedObject, realmGet$start.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17349f, createEmbeddedObject, false);
        }
        Date realmGet$end = worldStateEvent.realmGet$end();
        if (realmGet$end != null) {
            Table.nativeSetTimestamp(nativePtr, aVar.f17350g, createEmbeddedObject, realmGet$end.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17350g, createEmbeddedObject, false);
        }
        String realmGet$promo = worldStateEvent.realmGet$promo();
        if (realmGet$promo != null) {
            Table.nativeSetString(nativePtr, aVar.f17351h, createEmbeddedObject, realmGet$promo, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17351h, createEmbeddedObject, false);
        }
        String realmGet$npcImageSuffix = worldStateEvent.realmGet$npcImageSuffix();
        if (realmGet$npcImageSuffix != null) {
            Table.nativeSetString(nativePtr, aVar.f17352i, createEmbeddedObject, realmGet$npcImageSuffix, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17352i, createEmbeddedObject, false);
        }
        String realmGet$aprilFools = worldStateEvent.realmGet$aprilFools();
        if (realmGet$aprilFools != null) {
            Table.nativeSetString(nativePtr, aVar.f17353j, createEmbeddedObject, realmGet$aprilFools, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17353j, createEmbeddedObject, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f17354k, createEmbeddedObject, worldStateEvent.realmGet$gear(), false);
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c2 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(WorldStateEvent.class), false, Collections.emptyList());
        c2 c2Var = new c2();
        cVar.a();
        return c2Var;
    }

    static WorldStateEvent l(o0 o0Var, a aVar, WorldStateEvent worldStateEvent, WorldStateEvent worldStateEvent2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(WorldStateEvent.class), set);
        osObjectBuilder.c1(aVar.f17348e, worldStateEvent2.realmGet$eventKey());
        osObjectBuilder.I0(aVar.f17349f, worldStateEvent2.realmGet$start());
        osObjectBuilder.I0(aVar.f17350g, worldStateEvent2.realmGet$end());
        osObjectBuilder.c1(aVar.f17351h, worldStateEvent2.realmGet$promo());
        osObjectBuilder.c1(aVar.f17352i, worldStateEvent2.realmGet$npcImageSuffix());
        osObjectBuilder.c1(aVar.f17353j, worldStateEvent2.realmGet$aprilFools());
        osObjectBuilder.F0(aVar.f17354k, Boolean.valueOf(worldStateEvent2.realmGet$gear()));
        osObjectBuilder.f1((io.realm.internal.o) worldStateEvent);
        return worldStateEvent;
    }

    public static void n(o0 o0Var, WorldStateEvent worldStateEvent, WorldStateEvent worldStateEvent2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(WorldStateEvent.class), worldStateEvent2, worldStateEvent, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17347q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17346p = (a) cVar.c();
        l0<WorldStateEvent> l0Var = new l0<>(this);
        this.f17347q = l0Var;
        l0Var.r(cVar.e());
        this.f17347q.s(cVar.f());
        this.f17347q.o(cVar.b());
        this.f17347q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17347q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c2 c2Var = (c2) obj;
        io.realm.a f10 = this.f17347q.f();
        io.realm.a f11 = c2Var.f17347q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17347q.g().getTable().p();
        String p11 = c2Var.f17347q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17347q.g().getObjectKey() == c2Var.f17347q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17347q.f().getPath();
        String p10 = this.f17347q.g().getTable().p();
        long objectKey = this.f17347q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.WorldStateEvent, io.realm.d2
    public String realmGet$aprilFools() {
        this.f17347q.f().e();
        return this.f17347q.g().getString(this.f17346p.f17353j);
    }

    @Override // com.habitrpg.android.habitica.models.WorldStateEvent, io.realm.d2
    public Date realmGet$end() {
        this.f17347q.f().e();
        if (this.f17347q.g().isNull(this.f17346p.f17350g)) {
            return null;
        }
        return this.f17347q.g().getDate(this.f17346p.f17350g);
    }

    @Override // com.habitrpg.android.habitica.models.WorldStateEvent, io.realm.d2
    public String realmGet$eventKey() {
        this.f17347q.f().e();
        return this.f17347q.g().getString(this.f17346p.f17348e);
    }

    @Override // com.habitrpg.android.habitica.models.WorldStateEvent, io.realm.d2
    public boolean realmGet$gear() {
        this.f17347q.f().e();
        return this.f17347q.g().getBoolean(this.f17346p.f17354k);
    }

    @Override // com.habitrpg.android.habitica.models.WorldStateEvent, io.realm.d2
    public String realmGet$npcImageSuffix() {
        this.f17347q.f().e();
        return this.f17347q.g().getString(this.f17346p.f17352i);
    }

    @Override // com.habitrpg.android.habitica.models.WorldStateEvent, io.realm.d2
    public String realmGet$promo() {
        this.f17347q.f().e();
        return this.f17347q.g().getString(this.f17346p.f17351h);
    }

    @Override // com.habitrpg.android.habitica.models.WorldStateEvent, io.realm.d2
    public Date realmGet$start() {
        this.f17347q.f().e();
        if (this.f17347q.g().isNull(this.f17346p.f17349f)) {
            return null;
        }
        return this.f17347q.g().getDate(this.f17346p.f17349f);
    }

    @Override // com.habitrpg.android.habitica.models.WorldStateEvent, io.realm.d2
    public void realmSet$aprilFools(String str) {
        if (this.f17347q.i()) {
            if (!this.f17347q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17347q.g();
            if (str == null) {
                g10.getTable().F(this.f17346p.f17353j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17346p.f17353j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17347q.f().e();
        if (str == null) {
            this.f17347q.g().setNull(this.f17346p.f17353j);
        } else {
            this.f17347q.g().setString(this.f17346p.f17353j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.WorldStateEvent, io.realm.d2
    public void realmSet$end(Date date) {
        if (this.f17347q.i()) {
            if (!this.f17347q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17347q.g();
            if (date == null) {
                g10.getTable().F(this.f17346p.f17350g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f17346p.f17350g, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f17347q.f().e();
        if (date == null) {
            this.f17347q.g().setNull(this.f17346p.f17350g);
        } else {
            this.f17347q.g().setDate(this.f17346p.f17350g, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.WorldStateEvent, io.realm.d2
    public void realmSet$eventKey(String str) {
        if (this.f17347q.i()) {
            if (!this.f17347q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17347q.g();
            if (str == null) {
                g10.getTable().F(this.f17346p.f17348e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17346p.f17348e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17347q.f().e();
        if (str == null) {
            this.f17347q.g().setNull(this.f17346p.f17348e);
        } else {
            this.f17347q.g().setString(this.f17346p.f17348e, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.WorldStateEvent, io.realm.d2
    public void realmSet$gear(boolean z10) {
        if (this.f17347q.i()) {
            if (!this.f17347q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17347q.g();
            g10.getTable().z(this.f17346p.f17354k, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17347q.f().e();
        this.f17347q.g().setBoolean(this.f17346p.f17354k, z10);
    }

    @Override // com.habitrpg.android.habitica.models.WorldStateEvent, io.realm.d2
    public void realmSet$npcImageSuffix(String str) {
        if (this.f17347q.i()) {
            if (!this.f17347q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17347q.g();
            if (str == null) {
                g10.getTable().F(this.f17346p.f17352i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17346p.f17352i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17347q.f().e();
        if (str == null) {
            this.f17347q.g().setNull(this.f17346p.f17352i);
        } else {
            this.f17347q.g().setString(this.f17346p.f17352i, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.WorldStateEvent, io.realm.d2
    public void realmSet$promo(String str) {
        if (this.f17347q.i()) {
            if (!this.f17347q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17347q.g();
            if (str == null) {
                g10.getTable().F(this.f17346p.f17351h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17346p.f17351h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17347q.f().e();
        if (str == null) {
            this.f17347q.g().setNull(this.f17346p.f17351h);
        } else {
            this.f17347q.g().setString(this.f17346p.f17351h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.WorldStateEvent, io.realm.d2
    public void realmSet$start(Date date) {
        if (this.f17347q.i()) {
            if (!this.f17347q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17347q.g();
            if (date == null) {
                g10.getTable().F(this.f17346p.f17349f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f17346p.f17349f, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f17347q.f().e();
        if (date == null) {
            this.f17347q.g().setNull(this.f17346p.f17349f);
        } else {
            this.f17347q.g().setDate(this.f17346p.f17349f, date);
        }
    }

    public String toString() {
        String str;
        Date date;
        Date date2;
        String str2;
        String str3;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("WorldStateEvent = proxy[");
        sb2.append("{eventKey:");
        String str4 = "null";
        if (realmGet$eventKey() == null) {
            str = "null";
        } else {
            str = realmGet$eventKey();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{start:");
        if (realmGet$start() == null) {
            date = "null";
        } else {
            date = realmGet$start();
        }
        sb2.append(date);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{end:");
        if (realmGet$end() == null) {
            date2 = "null";
        } else {
            date2 = realmGet$end();
        }
        sb2.append(date2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{promo:");
        if (realmGet$promo() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$promo();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{npcImageSuffix:");
        if (realmGet$npcImageSuffix() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$npcImageSuffix();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{aprilFools:");
        if (realmGet$aprilFools() != null) {
            str4 = realmGet$aprilFools();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{gear:");
        sb2.append(realmGet$gear());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
