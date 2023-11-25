package io.realm;

import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.user.Gear;
import com.habitrpg.android.habitica.models.user.Outfit;
import io.realm.a;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.m2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_GearRealmProxy.java */
/* loaded from: classes4.dex */
public class k6 extends Gear implements io.realm.internal.o {

    /* renamed from: u  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17920u = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17921p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Gear> f17922q;

    /* renamed from: r  reason: collision with root package name */
    private x0<Equipment> f17923r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_GearRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17924e;

        /* renamed from: f  reason: collision with root package name */
        long f17925f;

        /* renamed from: g  reason: collision with root package name */
        long f17926g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Gear");
            this.f17924e = a("owned", "owned", b10);
            this.f17925f = a("equipped", "equipped", b10);
            this.f17926g = a("costume", "costume", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17924e = aVar.f17924e;
            aVar2.f17925f = aVar.f17925f;
            aVar2.f17926g = aVar.f17926g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k6() {
        this.f17922q.p();
    }

    public static Gear c(o0 o0Var, a aVar, Gear gear, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(gear);
        if (oVar != null) {
            return (Gear) oVar;
        }
        k6 k10 = k(o0Var, new OsObjectBuilder(o0Var.c1(Gear.class), set).e1());
        map.put(gear, k10);
        x0<Equipment> realmGet$owned = gear.realmGet$owned();
        if (realmGet$owned != null) {
            x0<Equipment> realmGet$owned2 = k10.realmGet$owned();
            realmGet$owned2.clear();
            for (int i10 = 0; i10 < realmGet$owned.size(); i10++) {
                Equipment equipment = realmGet$owned.get(i10);
                Equipment equipment2 = (Equipment) map.get(equipment);
                if (equipment2 != null) {
                    realmGet$owned2.add(equipment2);
                } else {
                    realmGet$owned2.add(m2.d(o0Var, (m2.a) o0Var.R().e(Equipment.class), equipment, z10, map, set));
                }
            }
        }
        Outfit realmGet$equipped = gear.realmGet$equipped();
        if (realmGet$equipped == null) {
            k10.realmSet$equipped(null);
        } else if (((Outfit) map.get(realmGet$equipped)) == null) {
            u6 k11 = u6.k(o0Var, o0Var.c1(Outfit.class).s(k10.b().g().createEmbeddedObject(aVar.f17925f, RealmFieldType.OBJECT)));
            map.put(realmGet$equipped, k11);
            u6.n(o0Var, realmGet$equipped, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheequipped.toString()");
        }
        Outfit realmGet$costume = gear.realmGet$costume();
        if (realmGet$costume == null) {
            k10.realmSet$costume(null);
        } else if (((Outfit) map.get(realmGet$costume)) == null) {
            u6 k12 = u6.k(o0Var, o0Var.c1(Outfit.class).s(k10.b().g().createEmbeddedObject(aVar.f17926g, RealmFieldType.OBJECT)));
            map.put(realmGet$costume, k12);
            u6.n(o0Var, realmGet$costume, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecostume.toString()");
        }
        return k10;
    }

    public static Gear d(o0 o0Var, a aVar, Gear gear, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((gear instanceof io.realm.internal.o) && !d1.isFrozen(gear)) {
            io.realm.internal.o oVar = (io.realm.internal.o) gear;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return gear;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(gear);
        if (oVar2 != null) {
            return (Gear) oVar2;
        }
        return c(o0Var, aVar, gear, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Gear f(Gear gear, int i10, int i11, Map<a1, o.a<a1>> map) {
        Gear gear2;
        if (i10 > i11 || gear == null) {
            return null;
        }
        o.a<a1> aVar = map.get(gear);
        if (aVar == null) {
            gear2 = new Gear();
            map.put(gear, new o.a<>(i10, gear2));
        } else if (i10 >= aVar.f17831a) {
            return (Gear) aVar.f17832b;
        } else {
            Gear gear3 = (Gear) aVar.f17832b;
            aVar.f17831a = i10;
            gear2 = gear3;
        }
        o0 o0Var = (o0) ((io.realm.internal.o) gear).b().f();
        if (i10 == i11) {
            gear2.realmSet$owned(null);
        } else {
            x0<Equipment> realmGet$owned = gear.realmGet$owned();
            x0<Equipment> x0Var = new x0<>();
            gear2.realmSet$owned(x0Var);
            int i12 = i10 + 1;
            int size = realmGet$owned.size();
            for (int i13 = 0; i13 < size; i13++) {
                x0Var.add(m2.f(realmGet$owned.get(i13), i12, i11, map));
            }
        }
        int i14 = i10 + 1;
        gear2.realmSet$equipped(u6.f(gear.realmGet$equipped(), i14, i11, map));
        gear2.realmSet$costume(u6.f(gear.realmGet$costume(), i14, i11, map));
        return gear2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Gear", true, 3, 0);
        bVar.a("", "owned", RealmFieldType.LIST, "Equipment");
        RealmFieldType realmFieldType = RealmFieldType.OBJECT;
        bVar.a("", "equipped", realmFieldType, "Outfit");
        bVar.a("", "costume", realmFieldType, "Outfit");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17920u;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Gear gear, Map<a1, Long> map) {
        long j12;
        long j13;
        if ((gear instanceof io.realm.internal.o) && !d1.isFrozen(gear)) {
            io.realm.internal.o oVar = (io.realm.internal.o) gear;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Gear.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Gear.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(gear, Long.valueOf(createEmbeddedObject));
        OsList osList = new OsList(c12.s(createEmbeddedObject), aVar.f17924e);
        x0<Equipment> realmGet$owned = gear.realmGet$owned();
        if (realmGet$owned != null && realmGet$owned.size() == osList.Y()) {
            int size = realmGet$owned.size();
            int i10 = 0;
            while (i10 < size) {
                Equipment equipment = realmGet$owned.get(i10);
                Long l10 = map.get(equipment);
                if (l10 == null) {
                    l10 = Long.valueOf(m2.i(o0Var, equipment, map));
                }
                osList.V(i10, l10.longValue());
                i10++;
                nativePtr = nativePtr;
            }
            j12 = nativePtr;
        } else {
            j12 = nativePtr;
            osList.K();
            if (realmGet$owned != null) {
                Iterator<Equipment> it = realmGet$owned.iterator();
                while (it.hasNext()) {
                    Equipment next = it.next();
                    Long l11 = map.get(next);
                    if (l11 == null) {
                        l11 = Long.valueOf(m2.i(o0Var, next, map));
                    }
                    osList.k(l11.longValue());
                }
            }
        }
        Outfit realmGet$equipped = gear.realmGet$equipped();
        if (realmGet$equipped != null) {
            Long l12 = map.get(realmGet$equipped);
            if (l12 == null) {
                j13 = createEmbeddedObject;
                u6.i(o0Var, c12, aVar.f17925f, createEmbeddedObject, realmGet$equipped, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l12.toString());
            }
        } else {
            j13 = createEmbeddedObject;
            Table.nativeNullifyLink(j12, aVar.f17925f, j13);
        }
        Outfit realmGet$costume = gear.realmGet$costume();
        if (realmGet$costume != null) {
            Long l13 = map.get(realmGet$costume);
            if (l13 == null) {
                u6.i(o0Var, c12, aVar.f17926g, j13, realmGet$costume, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l13.toString());
            }
        } else {
            Table.nativeNullifyLink(j12, aVar.f17926g, j13);
        }
        return j13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k6 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Gear.class), false, Collections.emptyList());
        k6 k6Var = new k6();
        cVar.a();
        return k6Var;
    }

    static Gear l(o0 o0Var, a aVar, Gear gear, Gear gear2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Gear.class), set);
        x0<Equipment> realmGet$owned = gear2.realmGet$owned();
        if (realmGet$owned != null) {
            x0 x0Var = new x0();
            for (int i10 = 0; i10 < realmGet$owned.size(); i10++) {
                Equipment equipment = realmGet$owned.get(i10);
                Equipment equipment2 = (Equipment) map.get(equipment);
                if (equipment2 != null) {
                    x0Var.add(equipment2);
                } else {
                    x0Var.add(m2.d(o0Var, (m2.a) o0Var.R().e(Equipment.class), equipment, true, map, set));
                }
            }
            osObjectBuilder.b1(aVar.f17924e, x0Var);
        } else {
            osObjectBuilder.b1(aVar.f17924e, new x0());
        }
        Outfit realmGet$equipped = gear2.realmGet$equipped();
        if (realmGet$equipped == null) {
            osObjectBuilder.Z0(aVar.f17925f);
        } else if (((Outfit) map.get(realmGet$equipped)) == null) {
            u6 k10 = u6.k(o0Var, o0Var.c1(Outfit.class).s(((io.realm.internal.o) gear).b().g().createEmbeddedObject(aVar.f17925f, RealmFieldType.OBJECT)));
            map.put(realmGet$equipped, k10);
            u6.n(o0Var, realmGet$equipped, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheequipped.toString()");
        }
        Outfit realmGet$costume = gear2.realmGet$costume();
        if (realmGet$costume == null) {
            osObjectBuilder.Z0(aVar.f17926g);
        } else if (((Outfit) map.get(realmGet$costume)) == null) {
            u6 k11 = u6.k(o0Var, o0Var.c1(Outfit.class).s(((io.realm.internal.o) gear).b().g().createEmbeddedObject(aVar.f17926g, RealmFieldType.OBJECT)));
            map.put(realmGet$costume, k11);
            u6.n(o0Var, realmGet$costume, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecostume.toString()");
        }
        osObjectBuilder.f1((io.realm.internal.o) gear);
        return gear;
    }

    public static void n(o0 o0Var, Gear gear, Gear gear2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Gear.class), gear2, gear, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17922q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17921p = (a) cVar.c();
        l0<Gear> l0Var = new l0<>(this);
        this.f17922q = l0Var;
        l0Var.r(cVar.e());
        this.f17922q.s(cVar.f());
        this.f17922q.o(cVar.b());
        this.f17922q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17922q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k6 k6Var = (k6) obj;
        io.realm.a f10 = this.f17922q.f();
        io.realm.a f11 = k6Var.f17922q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17922q.g().getTable().p();
        String p11 = k6Var.f17922q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17922q.g().getObjectKey() == k6Var.f17922q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17922q.f().getPath();
        String p10 = this.f17922q.g().getTable().p();
        long objectKey = this.f17922q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.Gear, io.realm.l6
    public Outfit realmGet$costume() {
        this.f17922q.f().e();
        if (this.f17922q.g().isNullLink(this.f17921p.f17926g)) {
            return null;
        }
        return (Outfit) this.f17922q.f().B(Outfit.class, this.f17922q.g().getLink(this.f17921p.f17926g), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Gear, io.realm.l6
    public Outfit realmGet$equipped() {
        this.f17922q.f().e();
        if (this.f17922q.g().isNullLink(this.f17921p.f17925f)) {
            return null;
        }
        return (Outfit) this.f17922q.f().B(Outfit.class, this.f17922q.g().getLink(this.f17921p.f17925f), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Gear, io.realm.l6
    public x0<Equipment> realmGet$owned() {
        this.f17922q.f().e();
        x0<Equipment> x0Var = this.f17923r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<Equipment> x0Var2 = new x0<>(Equipment.class, this.f17922q.g().getModelList(this.f17921p.f17924e), this.f17922q.f());
        this.f17923r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.Gear, io.realm.l6
    public void realmSet$costume(Outfit outfit) {
        o0 o0Var = (o0) this.f17922q.f();
        if (this.f17922q.i()) {
            if (!this.f17922q.d() || this.f17922q.e().contains("costume")) {
                return;
            }
            if (outfit != null && !d1.isManaged(outfit)) {
                Outfit outfit2 = (Outfit) o0Var.J0(Outfit.class, this, "costume");
                u6.n(o0Var, outfit, outfit2, new HashMap(), Collections.EMPTY_SET);
                outfit = outfit2;
            }
            io.realm.internal.q g10 = this.f17922q.g();
            if (outfit == null) {
                g10.nullifyLink(this.f17921p.f17926g);
                return;
            }
            this.f17922q.c(outfit);
            g10.getTable().D(this.f17921p.f17926g, g10.getObjectKey(), ((io.realm.internal.o) outfit).b().g().getObjectKey(), true);
            return;
        }
        this.f17922q.f().e();
        if (outfit == null) {
            this.f17922q.g().nullifyLink(this.f17921p.f17926g);
            return;
        }
        if (d1.isManaged(outfit)) {
            this.f17922q.c(outfit);
        }
        u6.n(o0Var, outfit, (Outfit) o0Var.J0(Outfit.class, this, "costume"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.Gear, io.realm.l6
    public void realmSet$equipped(Outfit outfit) {
        o0 o0Var = (o0) this.f17922q.f();
        if (this.f17922q.i()) {
            if (!this.f17922q.d() || this.f17922q.e().contains("equipped")) {
                return;
            }
            if (outfit != null && !d1.isManaged(outfit)) {
                Outfit outfit2 = (Outfit) o0Var.J0(Outfit.class, this, "equipped");
                u6.n(o0Var, outfit, outfit2, new HashMap(), Collections.EMPTY_SET);
                outfit = outfit2;
            }
            io.realm.internal.q g10 = this.f17922q.g();
            if (outfit == null) {
                g10.nullifyLink(this.f17921p.f17925f);
                return;
            }
            this.f17922q.c(outfit);
            g10.getTable().D(this.f17921p.f17925f, g10.getObjectKey(), ((io.realm.internal.o) outfit).b().g().getObjectKey(), true);
            return;
        }
        this.f17922q.f().e();
        if (outfit == null) {
            this.f17922q.g().nullifyLink(this.f17921p.f17925f);
            return;
        }
        if (d1.isManaged(outfit)) {
            this.f17922q.c(outfit);
        }
        u6.n(o0Var, outfit, (Outfit) o0Var.J0(Outfit.class, this, "equipped"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.Gear, io.realm.l6
    public void realmSet$owned(x0<Equipment> x0Var) {
        int i10 = 0;
        if (this.f17922q.i()) {
            if (!this.f17922q.d() || this.f17922q.e().contains("owned")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17922q.f();
                x0<Equipment> x0Var2 = new x0<>();
                Iterator<Equipment> it = x0Var.iterator();
                while (it.hasNext()) {
                    Equipment next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((Equipment) o0Var.F0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17922q.f().e();
        OsList modelList = this.f17922q.g().getModelList(this.f17921p.f17924e);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                Equipment equipment = x0Var.get(i10);
                this.f17922q.c(equipment);
                modelList.V(i10, ((io.realm.internal.o) equipment).b().g().getObjectKey());
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
            Equipment equipment2 = x0Var.get(i10);
            this.f17922q.c(equipment2);
            modelList.k(((io.realm.internal.o) equipment2).b().g().getObjectKey());
            i10++;
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Gear = proxy[");
        sb2.append("{owned:");
        sb2.append("RealmList<Equipment>[");
        sb2.append(realmGet$owned().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{equipped:");
        String str2 = "Outfit";
        if (realmGet$equipped() != null) {
            str = "Outfit";
        } else {
            str = "null";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{costume:");
        if (realmGet$costume() == null) {
            str2 = "null";
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
