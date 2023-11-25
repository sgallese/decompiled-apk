package io.realm;

import com.habitrpg.android.habitica.models.user.Gear;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.OwnedMount;
import com.habitrpg.android.habitica.models.user.OwnedPet;
import io.realm.a;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_ItemsRealmProxy.java */
/* loaded from: classes4.dex */
public class s6 extends Items implements io.realm.internal.o {
    private static final OsObjectSchemaInfo B = g();
    private x0<OwnedMount> A;

    /* renamed from: p  reason: collision with root package name */
    private a f18181p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Items> f18182q;

    /* renamed from: r  reason: collision with root package name */
    private x0<OwnedItem> f18183r;

    /* renamed from: u  reason: collision with root package name */
    private x0<OwnedItem> f18184u;

    /* renamed from: v  reason: collision with root package name */
    private x0<OwnedItem> f18185v;

    /* renamed from: x  reason: collision with root package name */
    private x0<OwnedItem> f18186x;

    /* renamed from: y  reason: collision with root package name */
    private x0<OwnedItem> f18187y;

    /* renamed from: z  reason: collision with root package name */
    private x0<OwnedPet> f18188z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_ItemsRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18189e;

        /* renamed from: f  reason: collision with root package name */
        long f18190f;

        /* renamed from: g  reason: collision with root package name */
        long f18191g;

        /* renamed from: h  reason: collision with root package name */
        long f18192h;

        /* renamed from: i  reason: collision with root package name */
        long f18193i;

        /* renamed from: j  reason: collision with root package name */
        long f18194j;

        /* renamed from: k  reason: collision with root package name */
        long f18195k;

        /* renamed from: l  reason: collision with root package name */
        long f18196l;

        /* renamed from: m  reason: collision with root package name */
        long f18197m;

        /* renamed from: n  reason: collision with root package name */
        long f18198n;

        /* renamed from: o  reason: collision with root package name */
        long f18199o;

        /* renamed from: p  reason: collision with root package name */
        long f18200p;

        a(OsSchemaInfo osSchemaInfo) {
            super(12);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Items");
            this.f18189e = a("eggs", "eggs", b10);
            this.f18190f = a("food", "food", b10);
            this.f18191g = a("hatchingPotions", "hatchingPotions", b10);
            this.f18192h = a("quests", "quests", b10);
            this.f18193i = a("special", "special", b10);
            this.f18194j = a("pets", "pets", b10);
            this.f18195k = a("mounts", "mounts", b10);
            this.f18196l = a("currentMount", "currentMount", b10);
            this.f18197m = a("currentPet", "currentPet", b10);
            this.f18198n = a("lastDropCount", "lastDropCount", b10);
            this.f18199o = a("lastDropDate", "lastDropDate", b10);
            this.f18200p = a("gear", "gear", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18189e = aVar.f18189e;
            aVar2.f18190f = aVar.f18190f;
            aVar2.f18191g = aVar.f18191g;
            aVar2.f18192h = aVar.f18192h;
            aVar2.f18193i = aVar.f18193i;
            aVar2.f18194j = aVar.f18194j;
            aVar2.f18195k = aVar.f18195k;
            aVar2.f18196l = aVar.f18196l;
            aVar2.f18197m = aVar.f18197m;
            aVar2.f18198n = aVar.f18198n;
            aVar2.f18199o = aVar.f18199o;
            aVar2.f18200p = aVar.f18200p;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s6() {
        this.f18182q.p();
    }

    public static Items c(o0 o0Var, a aVar, Items items, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(items);
        if (oVar != null) {
            return (Items) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Items.class), set);
        osObjectBuilder.c1(aVar.f18196l, items.realmGet$currentMount());
        osObjectBuilder.c1(aVar.f18197m, items.realmGet$currentPet());
        osObjectBuilder.V0(aVar.f18198n, Integer.valueOf(items.realmGet$lastDropCount()));
        osObjectBuilder.I0(aVar.f18199o, items.realmGet$lastDropDate());
        s6 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(items, k10);
        x0<OwnedItem> realmGet$eggs = items.realmGet$eggs();
        if (realmGet$eggs != null) {
            x0<OwnedItem> realmGet$eggs2 = k10.realmGet$eggs();
            realmGet$eggs2.clear();
            for (int i10 = 0; i10 < realmGet$eggs.size(); i10++) {
                OwnedItem ownedItem = realmGet$eggs.get(i10);
                if (((OwnedItem) map.get(ownedItem)) == null) {
                    y6 k11 = y6.k(o0Var, o0Var.c1(OwnedItem.class).s(realmGet$eggs2.m().n()));
                    map.put(ownedItem, k11);
                    y6.n(o0Var, ownedItem, k11, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheeggs.toString()");
                }
            }
        }
        x0<OwnedItem> realmGet$food = items.realmGet$food();
        if (realmGet$food != null) {
            x0<OwnedItem> realmGet$food2 = k10.realmGet$food();
            realmGet$food2.clear();
            for (int i11 = 0; i11 < realmGet$food.size(); i11++) {
                OwnedItem ownedItem2 = realmGet$food.get(i11);
                if (((OwnedItem) map.get(ownedItem2)) == null) {
                    y6 k12 = y6.k(o0Var, o0Var.c1(OwnedItem.class).s(realmGet$food2.m().n()));
                    map.put(ownedItem2, k12);
                    y6.n(o0Var, ownedItem2, k12, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachefood.toString()");
                }
            }
        }
        x0<OwnedItem> realmGet$hatchingPotions = items.realmGet$hatchingPotions();
        if (realmGet$hatchingPotions != null) {
            x0<OwnedItem> realmGet$hatchingPotions2 = k10.realmGet$hatchingPotions();
            realmGet$hatchingPotions2.clear();
            for (int i12 = 0; i12 < realmGet$hatchingPotions.size(); i12++) {
                OwnedItem ownedItem3 = realmGet$hatchingPotions.get(i12);
                if (((OwnedItem) map.get(ownedItem3)) == null) {
                    y6 k13 = y6.k(o0Var, o0Var.c1(OwnedItem.class).s(realmGet$hatchingPotions2.m().n()));
                    map.put(ownedItem3, k13);
                    y6.n(o0Var, ownedItem3, k13, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachehatchingPotions.toString()");
                }
            }
        }
        x0<OwnedItem> realmGet$quests = items.realmGet$quests();
        if (realmGet$quests != null) {
            x0<OwnedItem> realmGet$quests2 = k10.realmGet$quests();
            realmGet$quests2.clear();
            for (int i13 = 0; i13 < realmGet$quests.size(); i13++) {
                OwnedItem ownedItem4 = realmGet$quests.get(i13);
                if (((OwnedItem) map.get(ownedItem4)) == null) {
                    y6 k14 = y6.k(o0Var, o0Var.c1(OwnedItem.class).s(realmGet$quests2.m().n()));
                    map.put(ownedItem4, k14);
                    y6.n(o0Var, ownedItem4, k14, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachequests.toString()");
                }
            }
        }
        x0<OwnedItem> realmGet$special = items.realmGet$special();
        if (realmGet$special != null) {
            x0<OwnedItem> realmGet$special2 = k10.realmGet$special();
            realmGet$special2.clear();
            for (int i14 = 0; i14 < realmGet$special.size(); i14++) {
                OwnedItem ownedItem5 = realmGet$special.get(i14);
                if (((OwnedItem) map.get(ownedItem5)) == null) {
                    y6 k15 = y6.k(o0Var, o0Var.c1(OwnedItem.class).s(realmGet$special2.m().n()));
                    map.put(ownedItem5, k15);
                    y6.n(o0Var, ownedItem5, k15, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachespecial.toString()");
                }
            }
        }
        x0<OwnedPet> realmGet$pets = items.realmGet$pets();
        if (realmGet$pets != null) {
            x0<OwnedPet> realmGet$pets2 = k10.realmGet$pets();
            realmGet$pets2.clear();
            for (int i15 = 0; i15 < realmGet$pets.size(); i15++) {
                OwnedPet ownedPet = realmGet$pets.get(i15);
                if (((OwnedPet) map.get(ownedPet)) == null) {
                    c7 k16 = c7.k(o0Var, o0Var.c1(OwnedPet.class).s(realmGet$pets2.m().n()));
                    map.put(ownedPet, k16);
                    c7.n(o0Var, ownedPet, k16, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachepets.toString()");
                }
            }
        }
        x0<OwnedMount> realmGet$mounts = items.realmGet$mounts();
        if (realmGet$mounts != null) {
            x0<OwnedMount> realmGet$mounts2 = k10.realmGet$mounts();
            realmGet$mounts2.clear();
            for (int i16 = 0; i16 < realmGet$mounts.size(); i16++) {
                OwnedMount ownedMount = realmGet$mounts.get(i16);
                if (((OwnedMount) map.get(ownedMount)) == null) {
                    a7 k17 = a7.k(o0Var, o0Var.c1(OwnedMount.class).s(realmGet$mounts2.m().n()));
                    map.put(ownedMount, k17);
                    a7.n(o0Var, ownedMount, k17, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachemounts.toString()");
                }
            }
        }
        Gear realmGet$gear = items.realmGet$gear();
        if (realmGet$gear == null) {
            k10.realmSet$gear(null);
        } else if (((Gear) map.get(realmGet$gear)) == null) {
            k6 k18 = k6.k(o0Var, o0Var.c1(Gear.class).s(k10.b().g().createEmbeddedObject(aVar.f18200p, RealmFieldType.OBJECT)));
            map.put(realmGet$gear, k18);
            k6.n(o0Var, realmGet$gear, k18, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachegear.toString()");
        }
        return k10;
    }

    public static Items d(o0 o0Var, a aVar, Items items, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((items instanceof io.realm.internal.o) && !d1.isFrozen(items)) {
            io.realm.internal.o oVar = (io.realm.internal.o) items;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return items;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(items);
        if (oVar2 != null) {
            return (Items) oVar2;
        }
        return c(o0Var, aVar, items, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Items f(Items items, int i10, int i11, Map<a1, o.a<a1>> map) {
        Items items2;
        if (i10 > i11 || items == null) {
            return null;
        }
        o.a<a1> aVar = map.get(items);
        if (aVar == null) {
            items2 = new Items();
            map.put(items, new o.a<>(i10, items2));
        } else if (i10 >= aVar.f17831a) {
            return (Items) aVar.f17832b;
        } else {
            Items items3 = (Items) aVar.f17832b;
            aVar.f17831a = i10;
            items2 = items3;
        }
        o0 o0Var = (o0) ((io.realm.internal.o) items).b().f();
        if (i10 == i11) {
            items2.realmSet$eggs(null);
        } else {
            x0<OwnedItem> realmGet$eggs = items.realmGet$eggs();
            x0<OwnedItem> x0Var = new x0<>();
            items2.realmSet$eggs(x0Var);
            int i12 = i10 + 1;
            int size = realmGet$eggs.size();
            for (int i13 = 0; i13 < size; i13++) {
                x0Var.add(y6.f(realmGet$eggs.get(i13), i12, i11, map));
            }
        }
        if (i10 == i11) {
            items2.realmSet$food(null);
        } else {
            x0<OwnedItem> realmGet$food = items.realmGet$food();
            x0<OwnedItem> x0Var2 = new x0<>();
            items2.realmSet$food(x0Var2);
            int i14 = i10 + 1;
            int size2 = realmGet$food.size();
            for (int i15 = 0; i15 < size2; i15++) {
                x0Var2.add(y6.f(realmGet$food.get(i15), i14, i11, map));
            }
        }
        if (i10 == i11) {
            items2.realmSet$hatchingPotions(null);
        } else {
            x0<OwnedItem> realmGet$hatchingPotions = items.realmGet$hatchingPotions();
            x0<OwnedItem> x0Var3 = new x0<>();
            items2.realmSet$hatchingPotions(x0Var3);
            int i16 = i10 + 1;
            int size3 = realmGet$hatchingPotions.size();
            for (int i17 = 0; i17 < size3; i17++) {
                x0Var3.add(y6.f(realmGet$hatchingPotions.get(i17), i16, i11, map));
            }
        }
        if (i10 == i11) {
            items2.realmSet$quests(null);
        } else {
            x0<OwnedItem> realmGet$quests = items.realmGet$quests();
            x0<OwnedItem> x0Var4 = new x0<>();
            items2.realmSet$quests(x0Var4);
            int i18 = i10 + 1;
            int size4 = realmGet$quests.size();
            for (int i19 = 0; i19 < size4; i19++) {
                x0Var4.add(y6.f(realmGet$quests.get(i19), i18, i11, map));
            }
        }
        if (i10 == i11) {
            items2.realmSet$special(null);
        } else {
            x0<OwnedItem> realmGet$special = items.realmGet$special();
            x0<OwnedItem> x0Var5 = new x0<>();
            items2.realmSet$special(x0Var5);
            int i20 = i10 + 1;
            int size5 = realmGet$special.size();
            for (int i21 = 0; i21 < size5; i21++) {
                x0Var5.add(y6.f(realmGet$special.get(i21), i20, i11, map));
            }
        }
        if (i10 == i11) {
            items2.realmSet$pets(null);
        } else {
            x0<OwnedPet> realmGet$pets = items.realmGet$pets();
            x0<OwnedPet> x0Var6 = new x0<>();
            items2.realmSet$pets(x0Var6);
            int i22 = i10 + 1;
            int size6 = realmGet$pets.size();
            for (int i23 = 0; i23 < size6; i23++) {
                x0Var6.add(c7.f(realmGet$pets.get(i23), i22, i11, map));
            }
        }
        if (i10 == i11) {
            items2.realmSet$mounts(null);
        } else {
            x0<OwnedMount> realmGet$mounts = items.realmGet$mounts();
            x0<OwnedMount> x0Var7 = new x0<>();
            items2.realmSet$mounts(x0Var7);
            int i24 = i10 + 1;
            int size7 = realmGet$mounts.size();
            for (int i25 = 0; i25 < size7; i25++) {
                x0Var7.add(a7.f(realmGet$mounts.get(i25), i24, i11, map));
            }
        }
        items2.realmSet$currentMount(items.realmGet$currentMount());
        items2.realmSet$currentPet(items.realmGet$currentPet());
        items2.realmSet$lastDropCount(items.realmGet$lastDropCount());
        items2.realmSet$lastDropDate(items.realmGet$lastDropDate());
        items2.realmSet$gear(k6.f(items.realmGet$gear(), i10 + 1, i11, map));
        return items2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Items", true, 12, 0);
        RealmFieldType realmFieldType = RealmFieldType.LIST;
        bVar.a("", "eggs", realmFieldType, "OwnedItem");
        bVar.a("", "food", realmFieldType, "OwnedItem");
        bVar.a("", "hatchingPotions", realmFieldType, "OwnedItem");
        bVar.a("", "quests", realmFieldType, "OwnedItem");
        bVar.a("", "special", realmFieldType, "OwnedItem");
        bVar.a("", "pets", realmFieldType, "OwnedPet");
        bVar.a("", "mounts", realmFieldType, "OwnedMount");
        RealmFieldType realmFieldType2 = RealmFieldType.STRING;
        bVar.b("", "currentMount", realmFieldType2, false, false, false);
        bVar.b("", "currentPet", realmFieldType2, false, false, false);
        bVar.b("", "lastDropCount", RealmFieldType.INTEGER, false, false, true);
        bVar.b("", "lastDropDate", RealmFieldType.DATE, false, false, false);
        bVar.a("", "gear", RealmFieldType.OBJECT, "Gear");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return B;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Items items, Map<a1, Long> map) {
        long j12;
        String str;
        a aVar;
        String str2;
        a aVar2;
        if ((items instanceof io.realm.internal.o) && !d1.isFrozen(items)) {
            io.realm.internal.o oVar = (io.realm.internal.o) items;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Items.class);
        long nativePtr = c12.getNativePtr();
        a aVar3 = (a) o0Var.R().e(Items.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(items, Long.valueOf(createEmbeddedObject));
        OsList osList = new OsList(c12.s(createEmbeddedObject), aVar3.f18189e);
        x0<OwnedItem> realmGet$eggs = items.realmGet$eggs();
        osList.K();
        if (realmGet$eggs != null) {
            Iterator<OwnedItem> it = realmGet$eggs.iterator();
            while (it.hasNext()) {
                OwnedItem next = it.next();
                Long l10 = map.get(next);
                if (l10 == null) {
                    y6.i(o0Var, c12, aVar3.f18189e, createEmbeddedObject, next, map);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
                }
            }
        }
        OsList osList2 = new OsList(c12.s(createEmbeddedObject), aVar3.f18190f);
        x0<OwnedItem> realmGet$food = items.realmGet$food();
        osList2.K();
        if (realmGet$food != null) {
            Iterator<OwnedItem> it2 = realmGet$food.iterator();
            while (it2.hasNext()) {
                OwnedItem next2 = it2.next();
                Long l11 = map.get(next2);
                if (l11 == null) {
                    y6.i(o0Var, c12, aVar3.f18190f, createEmbeddedObject, next2, map);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l11.toString());
                }
            }
        }
        OsList osList3 = new OsList(c12.s(createEmbeddedObject), aVar3.f18191g);
        x0<OwnedItem> realmGet$hatchingPotions = items.realmGet$hatchingPotions();
        osList3.K();
        if (realmGet$hatchingPotions != null) {
            Iterator<OwnedItem> it3 = realmGet$hatchingPotions.iterator();
            while (it3.hasNext()) {
                OwnedItem next3 = it3.next();
                Long l12 = map.get(next3);
                if (l12 == null) {
                    y6.i(o0Var, c12, aVar3.f18191g, createEmbeddedObject, next3, map);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l12.toString());
                }
            }
        }
        OsList osList4 = new OsList(c12.s(createEmbeddedObject), aVar3.f18192h);
        x0<OwnedItem> realmGet$quests = items.realmGet$quests();
        osList4.K();
        if (realmGet$quests != null) {
            Iterator<OwnedItem> it4 = realmGet$quests.iterator();
            while (it4.hasNext()) {
                OwnedItem next4 = it4.next();
                Long l13 = map.get(next4);
                if (l13 == null) {
                    y6.i(o0Var, c12, aVar3.f18192h, createEmbeddedObject, next4, map);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l13.toString());
                }
            }
        }
        OsList osList5 = new OsList(c12.s(createEmbeddedObject), aVar3.f18193i);
        x0<OwnedItem> realmGet$special = items.realmGet$special();
        osList5.K();
        if (realmGet$special != null) {
            Iterator<OwnedItem> it5 = realmGet$special.iterator();
            while (it5.hasNext()) {
                OwnedItem next5 = it5.next();
                Long l14 = map.get(next5);
                if (l14 == null) {
                    y6.i(o0Var, c12, aVar3.f18193i, createEmbeddedObject, next5, map);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l14.toString());
                }
            }
        }
        OsList osList6 = new OsList(c12.s(createEmbeddedObject), aVar3.f18194j);
        x0<OwnedPet> realmGet$pets = items.realmGet$pets();
        osList6.K();
        if (realmGet$pets != null) {
            Iterator<OwnedPet> it6 = realmGet$pets.iterator();
            while (it6.hasNext()) {
                OwnedPet next6 = it6.next();
                Long l15 = map.get(next6);
                if (l15 == null) {
                    c7.i(o0Var, c12, aVar3.f18194j, createEmbeddedObject, next6, map);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l15.toString());
                }
            }
        }
        OsList osList7 = new OsList(c12.s(createEmbeddedObject), aVar3.f18195k);
        x0<OwnedMount> realmGet$mounts = items.realmGet$mounts();
        osList7.K();
        if (realmGet$mounts != null) {
            Iterator<OwnedMount> it7 = realmGet$mounts.iterator();
            while (it7.hasNext()) {
                OwnedMount next7 = it7.next();
                Long l16 = map.get(next7);
                if (l16 == null) {
                    a7.i(o0Var, c12, aVar3.f18195k, createEmbeddedObject, next7, map);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l16.toString());
                }
            }
        }
        String realmGet$currentMount = items.realmGet$currentMount();
        if (realmGet$currentMount != null) {
            j12 = createEmbeddedObject;
            Table.nativeSetString(nativePtr, aVar3.f18196l, j12, realmGet$currentMount, false);
            str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
            aVar = aVar3;
        } else {
            j12 = createEmbeddedObject;
            long j13 = aVar3.f18196l;
            str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
            aVar = aVar3;
            Table.nativeSetNull(nativePtr, j13, j12, false);
        }
        String realmGet$currentPet = items.realmGet$currentPet();
        if (realmGet$currentPet != null) {
            Table.nativeSetString(nativePtr, aVar.f18197m, j12, realmGet$currentPet, false);
            str = str;
            aVar = aVar;
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18197m, j12, false);
        }
        String str3 = str;
        a aVar4 = aVar;
        Table.nativeSetLong(nativePtr, aVar.f18198n, j12, items.realmGet$lastDropCount(), false);
        Date realmGet$lastDropDate = items.realmGet$lastDropDate();
        if (realmGet$lastDropDate != null) {
            Table.nativeSetTimestamp(nativePtr, aVar4.f18199o, j12, realmGet$lastDropDate.getTime(), false);
            str2 = str3;
            aVar2 = aVar4;
        } else {
            str2 = str3;
            aVar2 = aVar4;
            Table.nativeSetNull(nativePtr, aVar4.f18199o, j12, false);
        }
        Gear realmGet$gear = items.realmGet$gear();
        if (realmGet$gear != null) {
            Long l17 = map.get(realmGet$gear);
            if (l17 == null) {
                k6.i(o0Var, c12, aVar2.f18200p, j12, realmGet$gear, map);
            } else {
                throw new IllegalArgumentException(str2 + l17.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar2.f18200p, j12);
        }
        return j12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s6 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Items.class), false, Collections.emptyList());
        s6 s6Var = new s6();
        cVar.a();
        return s6Var;
    }

    static Items l(o0 o0Var, a aVar, Items items, Items items2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Items.class), set);
        x0<OwnedItem> realmGet$eggs = items2.realmGet$eggs();
        if (realmGet$eggs != null) {
            x0 x0Var = new x0();
            OsList m10 = items.realmGet$eggs().m();
            m10.q();
            for (int i10 = 0; i10 < realmGet$eggs.size(); i10++) {
                OwnedItem ownedItem = realmGet$eggs.get(i10);
                if (((OwnedItem) map.get(ownedItem)) == null) {
                    y6 k10 = y6.k(o0Var, o0Var.c1(OwnedItem.class).s(m10.n()));
                    map.put(ownedItem, k10);
                    x0Var.add(k10);
                    y6.n(o0Var, ownedItem, k10, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheeggs.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f18189e, new x0());
        }
        x0<OwnedItem> realmGet$food = items2.realmGet$food();
        if (realmGet$food != null) {
            x0 x0Var2 = new x0();
            OsList m11 = items.realmGet$food().m();
            m11.q();
            for (int i11 = 0; i11 < realmGet$food.size(); i11++) {
                OwnedItem ownedItem2 = realmGet$food.get(i11);
                if (((OwnedItem) map.get(ownedItem2)) == null) {
                    y6 k11 = y6.k(o0Var, o0Var.c1(OwnedItem.class).s(m11.n()));
                    map.put(ownedItem2, k11);
                    x0Var2.add(k11);
                    y6.n(o0Var, ownedItem2, k11, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachefood.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f18190f, new x0());
        }
        x0<OwnedItem> realmGet$hatchingPotions = items2.realmGet$hatchingPotions();
        if (realmGet$hatchingPotions != null) {
            x0 x0Var3 = new x0();
            OsList m12 = items.realmGet$hatchingPotions().m();
            m12.q();
            for (int i12 = 0; i12 < realmGet$hatchingPotions.size(); i12++) {
                OwnedItem ownedItem3 = realmGet$hatchingPotions.get(i12);
                if (((OwnedItem) map.get(ownedItem3)) == null) {
                    y6 k12 = y6.k(o0Var, o0Var.c1(OwnedItem.class).s(m12.n()));
                    map.put(ownedItem3, k12);
                    x0Var3.add(k12);
                    y6.n(o0Var, ownedItem3, k12, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachehatchingPotions.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f18191g, new x0());
        }
        x0<OwnedItem> realmGet$quests = items2.realmGet$quests();
        if (realmGet$quests != null) {
            x0 x0Var4 = new x0();
            OsList m13 = items.realmGet$quests().m();
            m13.q();
            for (int i13 = 0; i13 < realmGet$quests.size(); i13++) {
                OwnedItem ownedItem4 = realmGet$quests.get(i13);
                if (((OwnedItem) map.get(ownedItem4)) == null) {
                    y6 k13 = y6.k(o0Var, o0Var.c1(OwnedItem.class).s(m13.n()));
                    map.put(ownedItem4, k13);
                    x0Var4.add(k13);
                    y6.n(o0Var, ownedItem4, k13, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachequests.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f18192h, new x0());
        }
        x0<OwnedItem> realmGet$special = items2.realmGet$special();
        if (realmGet$special != null) {
            x0 x0Var5 = new x0();
            OsList m14 = items.realmGet$special().m();
            m14.q();
            for (int i14 = 0; i14 < realmGet$special.size(); i14++) {
                OwnedItem ownedItem5 = realmGet$special.get(i14);
                if (((OwnedItem) map.get(ownedItem5)) == null) {
                    y6 k14 = y6.k(o0Var, o0Var.c1(OwnedItem.class).s(m14.n()));
                    map.put(ownedItem5, k14);
                    x0Var5.add(k14);
                    y6.n(o0Var, ownedItem5, k14, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachespecial.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f18193i, new x0());
        }
        x0<OwnedPet> realmGet$pets = items2.realmGet$pets();
        if (realmGet$pets != null) {
            x0 x0Var6 = new x0();
            OsList m15 = items.realmGet$pets().m();
            m15.q();
            for (int i15 = 0; i15 < realmGet$pets.size(); i15++) {
                OwnedPet ownedPet = realmGet$pets.get(i15);
                if (((OwnedPet) map.get(ownedPet)) == null) {
                    c7 k15 = c7.k(o0Var, o0Var.c1(OwnedPet.class).s(m15.n()));
                    map.put(ownedPet, k15);
                    x0Var6.add(k15);
                    c7.n(o0Var, ownedPet, k15, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachepets.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f18194j, new x0());
        }
        x0<OwnedMount> realmGet$mounts = items2.realmGet$mounts();
        if (realmGet$mounts != null) {
            x0 x0Var7 = new x0();
            OsList m16 = items.realmGet$mounts().m();
            m16.q();
            for (int i16 = 0; i16 < realmGet$mounts.size(); i16++) {
                OwnedMount ownedMount = realmGet$mounts.get(i16);
                if (((OwnedMount) map.get(ownedMount)) == null) {
                    a7 k16 = a7.k(o0Var, o0Var.c1(OwnedMount.class).s(m16.n()));
                    map.put(ownedMount, k16);
                    x0Var7.add(k16);
                    a7.n(o0Var, ownedMount, k16, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachemounts.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f18195k, new x0());
        }
        osObjectBuilder.c1(aVar.f18196l, items2.realmGet$currentMount());
        osObjectBuilder.c1(aVar.f18197m, items2.realmGet$currentPet());
        osObjectBuilder.V0(aVar.f18198n, Integer.valueOf(items2.realmGet$lastDropCount()));
        osObjectBuilder.I0(aVar.f18199o, items2.realmGet$lastDropDate());
        Gear realmGet$gear = items2.realmGet$gear();
        if (realmGet$gear == null) {
            osObjectBuilder.Z0(aVar.f18200p);
        } else if (((Gear) map.get(realmGet$gear)) == null) {
            k6 k17 = k6.k(o0Var, o0Var.c1(Gear.class).s(((io.realm.internal.o) items).b().g().createEmbeddedObject(aVar.f18200p, RealmFieldType.OBJECT)));
            map.put(realmGet$gear, k17);
            k6.n(o0Var, realmGet$gear, k17, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachegear.toString()");
        }
        osObjectBuilder.f1((io.realm.internal.o) items);
        return items;
    }

    public static void n(o0 o0Var, Items items, Items items2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Items.class), items2, items, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18182q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18181p = (a) cVar.c();
        l0<Items> l0Var = new l0<>(this);
        this.f18182q = l0Var;
        l0Var.r(cVar.e());
        this.f18182q.s(cVar.f());
        this.f18182q.o(cVar.b());
        this.f18182q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18182q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s6 s6Var = (s6) obj;
        io.realm.a f10 = this.f18182q.f();
        io.realm.a f11 = s6Var.f18182q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18182q.g().getTable().p();
        String p11 = s6Var.f18182q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18182q.g().getObjectKey() == s6Var.f18182q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18182q.f().getPath();
        String p10 = this.f18182q.g().getTable().p();
        long objectKey = this.f18182q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public String realmGet$currentMount() {
        this.f18182q.f().e();
        return this.f18182q.g().getString(this.f18181p.f18196l);
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public String realmGet$currentPet() {
        this.f18182q.f().e();
        return this.f18182q.g().getString(this.f18181p.f18197m);
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public x0<OwnedItem> realmGet$eggs() {
        this.f18182q.f().e();
        x0<OwnedItem> x0Var = this.f18183r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<OwnedItem> x0Var2 = new x0<>(OwnedItem.class, this.f18182q.g().getModelList(this.f18181p.f18189e), this.f18182q.f());
        this.f18183r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public x0<OwnedItem> realmGet$food() {
        this.f18182q.f().e();
        x0<OwnedItem> x0Var = this.f18184u;
        if (x0Var != null) {
            return x0Var;
        }
        x0<OwnedItem> x0Var2 = new x0<>(OwnedItem.class, this.f18182q.g().getModelList(this.f18181p.f18190f), this.f18182q.f());
        this.f18184u = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public Gear realmGet$gear() {
        this.f18182q.f().e();
        if (this.f18182q.g().isNullLink(this.f18181p.f18200p)) {
            return null;
        }
        return (Gear) this.f18182q.f().B(Gear.class, this.f18182q.g().getLink(this.f18181p.f18200p), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public x0<OwnedItem> realmGet$hatchingPotions() {
        this.f18182q.f().e();
        x0<OwnedItem> x0Var = this.f18185v;
        if (x0Var != null) {
            return x0Var;
        }
        x0<OwnedItem> x0Var2 = new x0<>(OwnedItem.class, this.f18182q.g().getModelList(this.f18181p.f18191g), this.f18182q.f());
        this.f18185v = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public int realmGet$lastDropCount() {
        this.f18182q.f().e();
        return (int) this.f18182q.g().getLong(this.f18181p.f18198n);
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public Date realmGet$lastDropDate() {
        this.f18182q.f().e();
        if (this.f18182q.g().isNull(this.f18181p.f18199o)) {
            return null;
        }
        return this.f18182q.g().getDate(this.f18181p.f18199o);
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public x0<OwnedMount> realmGet$mounts() {
        this.f18182q.f().e();
        x0<OwnedMount> x0Var = this.A;
        if (x0Var != null) {
            return x0Var;
        }
        x0<OwnedMount> x0Var2 = new x0<>(OwnedMount.class, this.f18182q.g().getModelList(this.f18181p.f18195k), this.f18182q.f());
        this.A = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public x0<OwnedPet> realmGet$pets() {
        this.f18182q.f().e();
        x0<OwnedPet> x0Var = this.f18188z;
        if (x0Var != null) {
            return x0Var;
        }
        x0<OwnedPet> x0Var2 = new x0<>(OwnedPet.class, this.f18182q.g().getModelList(this.f18181p.f18194j), this.f18182q.f());
        this.f18188z = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public x0<OwnedItem> realmGet$quests() {
        this.f18182q.f().e();
        x0<OwnedItem> x0Var = this.f18186x;
        if (x0Var != null) {
            return x0Var;
        }
        x0<OwnedItem> x0Var2 = new x0<>(OwnedItem.class, this.f18182q.g().getModelList(this.f18181p.f18192h), this.f18182q.f());
        this.f18186x = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public x0<OwnedItem> realmGet$special() {
        this.f18182q.f().e();
        x0<OwnedItem> x0Var = this.f18187y;
        if (x0Var != null) {
            return x0Var;
        }
        x0<OwnedItem> x0Var2 = new x0<>(OwnedItem.class, this.f18182q.g().getModelList(this.f18181p.f18193i), this.f18182q.f());
        this.f18187y = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public void realmSet$currentMount(String str) {
        if (this.f18182q.i()) {
            if (!this.f18182q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18182q.g();
            if (str == null) {
                g10.getTable().F(this.f18181p.f18196l, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18181p.f18196l, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18182q.f().e();
        if (str == null) {
            this.f18182q.g().setNull(this.f18181p.f18196l);
        } else {
            this.f18182q.g().setString(this.f18181p.f18196l, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public void realmSet$currentPet(String str) {
        if (this.f18182q.i()) {
            if (!this.f18182q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18182q.g();
            if (str == null) {
                g10.getTable().F(this.f18181p.f18197m, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18181p.f18197m, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18182q.f().e();
        if (str == null) {
            this.f18182q.g().setNull(this.f18181p.f18197m);
        } else {
            this.f18182q.g().setString(this.f18181p.f18197m, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public void realmSet$eggs(x0<OwnedItem> x0Var) {
        int i10 = 0;
        if (this.f18182q.i()) {
            if (!this.f18182q.d() || this.f18182q.e().contains("eggs")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f18182q.f();
                x0<OwnedItem> x0Var2 = new x0<>();
                Iterator<OwnedItem> it = x0Var.iterator();
                while (it.hasNext()) {
                    OwnedItem next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((OwnedItem) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f18182q.f().e();
        OsList modelList = this.f18182q.g().getModelList(this.f18181p.f18189e);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                OwnedItem ownedItem = x0Var.get(i10);
                this.f18182q.c(ownedItem);
                modelList.V(i10, ((io.realm.internal.o) ownedItem).b().g().getObjectKey());
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
            OwnedItem ownedItem2 = x0Var.get(i10);
            this.f18182q.c(ownedItem2);
            modelList.k(((io.realm.internal.o) ownedItem2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public void realmSet$food(x0<OwnedItem> x0Var) {
        int i10 = 0;
        if (this.f18182q.i()) {
            if (!this.f18182q.d() || this.f18182q.e().contains("food")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f18182q.f();
                x0<OwnedItem> x0Var2 = new x0<>();
                Iterator<OwnedItem> it = x0Var.iterator();
                while (it.hasNext()) {
                    OwnedItem next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((OwnedItem) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f18182q.f().e();
        OsList modelList = this.f18182q.g().getModelList(this.f18181p.f18190f);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                OwnedItem ownedItem = x0Var.get(i10);
                this.f18182q.c(ownedItem);
                modelList.V(i10, ((io.realm.internal.o) ownedItem).b().g().getObjectKey());
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
            OwnedItem ownedItem2 = x0Var.get(i10);
            this.f18182q.c(ownedItem2);
            modelList.k(((io.realm.internal.o) ownedItem2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public void realmSet$gear(Gear gear) {
        o0 o0Var = (o0) this.f18182q.f();
        if (this.f18182q.i()) {
            if (!this.f18182q.d() || this.f18182q.e().contains("gear")) {
                return;
            }
            if (gear != null && !d1.isManaged(gear)) {
                Gear gear2 = (Gear) o0Var.J0(Gear.class, this, "gear");
                k6.n(o0Var, gear, gear2, new HashMap(), Collections.EMPTY_SET);
                gear = gear2;
            }
            io.realm.internal.q g10 = this.f18182q.g();
            if (gear == null) {
                g10.nullifyLink(this.f18181p.f18200p);
                return;
            }
            this.f18182q.c(gear);
            g10.getTable().D(this.f18181p.f18200p, g10.getObjectKey(), ((io.realm.internal.o) gear).b().g().getObjectKey(), true);
            return;
        }
        this.f18182q.f().e();
        if (gear == null) {
            this.f18182q.g().nullifyLink(this.f18181p.f18200p);
            return;
        }
        if (d1.isManaged(gear)) {
            this.f18182q.c(gear);
        }
        k6.n(o0Var, gear, (Gear) o0Var.J0(Gear.class, this, "gear"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public void realmSet$hatchingPotions(x0<OwnedItem> x0Var) {
        int i10 = 0;
        if (this.f18182q.i()) {
            if (!this.f18182q.d() || this.f18182q.e().contains("hatchingPotions")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f18182q.f();
                x0<OwnedItem> x0Var2 = new x0<>();
                Iterator<OwnedItem> it = x0Var.iterator();
                while (it.hasNext()) {
                    OwnedItem next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((OwnedItem) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f18182q.f().e();
        OsList modelList = this.f18182q.g().getModelList(this.f18181p.f18191g);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                OwnedItem ownedItem = x0Var.get(i10);
                this.f18182q.c(ownedItem);
                modelList.V(i10, ((io.realm.internal.o) ownedItem).b().g().getObjectKey());
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
            OwnedItem ownedItem2 = x0Var.get(i10);
            this.f18182q.c(ownedItem2);
            modelList.k(((io.realm.internal.o) ownedItem2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public void realmSet$lastDropCount(int i10) {
        if (this.f18182q.i()) {
            if (!this.f18182q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18182q.g();
            g10.getTable().E(this.f18181p.f18198n, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18182q.f().e();
        this.f18182q.g().setLong(this.f18181p.f18198n, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public void realmSet$lastDropDate(Date date) {
        if (this.f18182q.i()) {
            if (!this.f18182q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18182q.g();
            if (date == null) {
                g10.getTable().F(this.f18181p.f18199o, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f18181p.f18199o, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f18182q.f().e();
        if (date == null) {
            this.f18182q.g().setNull(this.f18181p.f18199o);
        } else {
            this.f18182q.g().setDate(this.f18181p.f18199o, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public void realmSet$mounts(x0<OwnedMount> x0Var) {
        int i10 = 0;
        if (this.f18182q.i()) {
            if (!this.f18182q.d() || this.f18182q.e().contains("mounts")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f18182q.f();
                x0<OwnedMount> x0Var2 = new x0<>();
                Iterator<OwnedMount> it = x0Var.iterator();
                while (it.hasNext()) {
                    OwnedMount next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((OwnedMount) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f18182q.f().e();
        OsList modelList = this.f18182q.g().getModelList(this.f18181p.f18195k);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                OwnedMount ownedMount = x0Var.get(i10);
                this.f18182q.c(ownedMount);
                modelList.V(i10, ((io.realm.internal.o) ownedMount).b().g().getObjectKey());
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
            OwnedMount ownedMount2 = x0Var.get(i10);
            this.f18182q.c(ownedMount2);
            modelList.k(((io.realm.internal.o) ownedMount2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public void realmSet$pets(x0<OwnedPet> x0Var) {
        int i10 = 0;
        if (this.f18182q.i()) {
            if (!this.f18182q.d() || this.f18182q.e().contains("pets")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f18182q.f();
                x0<OwnedPet> x0Var2 = new x0<>();
                Iterator<OwnedPet> it = x0Var.iterator();
                while (it.hasNext()) {
                    OwnedPet next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((OwnedPet) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f18182q.f().e();
        OsList modelList = this.f18182q.g().getModelList(this.f18181p.f18194j);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                OwnedPet ownedPet = x0Var.get(i10);
                this.f18182q.c(ownedPet);
                modelList.V(i10, ((io.realm.internal.o) ownedPet).b().g().getObjectKey());
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
            OwnedPet ownedPet2 = x0Var.get(i10);
            this.f18182q.c(ownedPet2);
            modelList.k(((io.realm.internal.o) ownedPet2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public void realmSet$quests(x0<OwnedItem> x0Var) {
        int i10 = 0;
        if (this.f18182q.i()) {
            if (!this.f18182q.d() || this.f18182q.e().contains("quests")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f18182q.f();
                x0<OwnedItem> x0Var2 = new x0<>();
                Iterator<OwnedItem> it = x0Var.iterator();
                while (it.hasNext()) {
                    OwnedItem next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((OwnedItem) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f18182q.f().e();
        OsList modelList = this.f18182q.g().getModelList(this.f18181p.f18192h);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                OwnedItem ownedItem = x0Var.get(i10);
                this.f18182q.c(ownedItem);
                modelList.V(i10, ((io.realm.internal.o) ownedItem).b().g().getObjectKey());
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
            OwnedItem ownedItem2 = x0Var.get(i10);
            this.f18182q.c(ownedItem2);
            modelList.k(((io.realm.internal.o) ownedItem2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Items, io.realm.t6
    public void realmSet$special(x0<OwnedItem> x0Var) {
        int i10 = 0;
        if (this.f18182q.i()) {
            if (!this.f18182q.d() || this.f18182q.e().contains("special")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f18182q.f();
                x0<OwnedItem> x0Var2 = new x0<>();
                Iterator<OwnedItem> it = x0Var.iterator();
                while (it.hasNext()) {
                    OwnedItem next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((OwnedItem) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f18182q.f().e();
        OsList modelList = this.f18182q.g().getModelList(this.f18181p.f18193i);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                OwnedItem ownedItem = x0Var.get(i10);
                this.f18182q.c(ownedItem);
                modelList.V(i10, ((io.realm.internal.o) ownedItem).b().g().getObjectKey());
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
            OwnedItem ownedItem2 = x0Var.get(i10);
            this.f18182q.c(ownedItem2);
            modelList.k(((io.realm.internal.o) ownedItem2).b().g().getObjectKey());
            i10++;
        }
    }

    public String toString() {
        String str;
        String str2;
        Date date;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Items = proxy[");
        sb2.append("{eggs:");
        sb2.append("RealmList<OwnedItem>[");
        sb2.append(realmGet$eggs().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{food:");
        sb2.append("RealmList<OwnedItem>[");
        sb2.append(realmGet$food().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{hatchingPotions:");
        sb2.append("RealmList<OwnedItem>[");
        sb2.append(realmGet$hatchingPotions().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{quests:");
        sb2.append("RealmList<OwnedItem>[");
        sb2.append(realmGet$quests().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{special:");
        sb2.append("RealmList<OwnedItem>[");
        sb2.append(realmGet$special().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{pets:");
        sb2.append("RealmList<OwnedPet>[");
        sb2.append(realmGet$pets().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{mounts:");
        sb2.append("RealmList<OwnedMount>[");
        sb2.append(realmGet$mounts().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{currentMount:");
        String str3 = "null";
        if (realmGet$currentMount() == null) {
            str = "null";
        } else {
            str = realmGet$currentMount();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{currentPet:");
        if (realmGet$currentPet() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$currentPet();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{lastDropCount:");
        sb2.append(realmGet$lastDropCount());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{lastDropDate:");
        if (realmGet$lastDropDate() == null) {
            date = "null";
        } else {
            date = realmGet$lastDropDate();
        }
        sb2.append(date);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{gear:");
        if (realmGet$gear() != null) {
            str3 = "Gear";
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
