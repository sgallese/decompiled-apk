package io.realm;

import com.habitrpg.android.habitica.models.user.AdditionalSubscriptionInfo;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.models.user.SubscriptionPlanConsecutive;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_SubscriptionPlanRealmProxy.java */
/* loaded from: classes4.dex */
public class s7 extends SubscriptionPlan implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18201r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18202p;

    /* renamed from: q  reason: collision with root package name */
    private l0<SubscriptionPlan> f18203q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_SubscriptionPlanRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18204e;

        /* renamed from: f  reason: collision with root package name */
        long f18205f;

        /* renamed from: g  reason: collision with root package name */
        long f18206g;

        /* renamed from: h  reason: collision with root package name */
        long f18207h;

        /* renamed from: i  reason: collision with root package name */
        long f18208i;

        /* renamed from: j  reason: collision with root package name */
        long f18209j;

        /* renamed from: k  reason: collision with root package name */
        long f18210k;

        /* renamed from: l  reason: collision with root package name */
        long f18211l;

        /* renamed from: m  reason: collision with root package name */
        long f18212m;

        /* renamed from: n  reason: collision with root package name */
        long f18213n;

        /* renamed from: o  reason: collision with root package name */
        long f18214o;

        /* renamed from: p  reason: collision with root package name */
        long f18215p;

        /* renamed from: q  reason: collision with root package name */
        long f18216q;

        /* renamed from: r  reason: collision with root package name */
        long f18217r;

        /* renamed from: s  reason: collision with root package name */
        long f18218s;

        a(OsSchemaInfo osSchemaInfo) {
            super(15);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("SubscriptionPlan");
            this.f18204e = a("customerId", "customerId", b10);
            this.f18205f = a("dateCreated", "dateCreated", b10);
            this.f18206g = a("dateUpdated", "dateUpdated", b10);
            this.f18207h = a("dateTerminated", "dateTerminated", b10);
            this.f18208i = a("paymentMethod", "paymentMethod", b10);
            this.f18209j = a("planId", "planId", b10);
            this.f18210k = a("active", "active", b10);
            this.f18211l = a("gemsBought", "gemsBought", b10);
            this.f18212m = a("extraMonths", "extraMonths", b10);
            this.f18213n = a("quantity", "quantity", b10);
            this.f18214o = a("consecutive", "consecutive", b10);
            this.f18215p = a("mysteryItemCount", "mysteryItemCount", b10);
            this.f18216q = a("additionalData", "additionalData", b10);
            this.f18217r = a("perkMonthCount", "perkMonthCount", b10);
            this.f18218s = a("ownerID", "ownerID", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18204e = aVar.f18204e;
            aVar2.f18205f = aVar.f18205f;
            aVar2.f18206g = aVar.f18206g;
            aVar2.f18207h = aVar.f18207h;
            aVar2.f18208i = aVar.f18208i;
            aVar2.f18209j = aVar.f18209j;
            aVar2.f18210k = aVar.f18210k;
            aVar2.f18211l = aVar.f18211l;
            aVar2.f18212m = aVar.f18212m;
            aVar2.f18213n = aVar.f18213n;
            aVar2.f18214o = aVar.f18214o;
            aVar2.f18215p = aVar.f18215p;
            aVar2.f18216q = aVar.f18216q;
            aVar2.f18217r = aVar.f18217r;
            aVar2.f18218s = aVar.f18218s;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s7() {
        this.f18203q.p();
    }

    public static SubscriptionPlan c(o0 o0Var, a aVar, SubscriptionPlan subscriptionPlan, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(subscriptionPlan);
        if (oVar != null) {
            return (SubscriptionPlan) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(SubscriptionPlan.class), set);
        osObjectBuilder.c1(aVar.f18204e, subscriptionPlan.realmGet$customerId());
        osObjectBuilder.I0(aVar.f18205f, subscriptionPlan.realmGet$dateCreated());
        osObjectBuilder.I0(aVar.f18206g, subscriptionPlan.realmGet$dateUpdated());
        osObjectBuilder.I0(aVar.f18207h, subscriptionPlan.realmGet$dateTerminated());
        osObjectBuilder.c1(aVar.f18208i, subscriptionPlan.realmGet$paymentMethod());
        osObjectBuilder.c1(aVar.f18209j, subscriptionPlan.realmGet$planId());
        osObjectBuilder.F0(aVar.f18210k, subscriptionPlan.realmGet$active());
        osObjectBuilder.V0(aVar.f18211l, subscriptionPlan.realmGet$gemsBought());
        osObjectBuilder.V0(aVar.f18212m, subscriptionPlan.realmGet$extraMonths());
        osObjectBuilder.V0(aVar.f18213n, subscriptionPlan.realmGet$quantity());
        osObjectBuilder.V0(aVar.f18215p, Integer.valueOf(subscriptionPlan.realmGet$mysteryItemCount()));
        osObjectBuilder.V0(aVar.f18217r, Integer.valueOf(subscriptionPlan.realmGet$perkMonthCount()));
        osObjectBuilder.c1(aVar.f18218s, subscriptionPlan.realmGet$ownerID());
        s7 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(subscriptionPlan, k10);
        SubscriptionPlanConsecutive realmGet$consecutive = subscriptionPlan.realmGet$consecutive();
        if (realmGet$consecutive == null) {
            k10.realmSet$consecutive(null);
        } else if (((SubscriptionPlanConsecutive) map.get(realmGet$consecutive)) == null) {
            q7 k11 = q7.k(o0Var, o0Var.c1(SubscriptionPlanConsecutive.class).s(k10.b().g().createEmbeddedObject(aVar.f18214o, RealmFieldType.OBJECT)));
            map.put(realmGet$consecutive, k11);
            q7.n(o0Var, realmGet$consecutive, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheconsecutive.toString()");
        }
        AdditionalSubscriptionInfo realmGet$additionalData = subscriptionPlan.realmGet$additionalData();
        if (realmGet$additionalData == null) {
            k10.realmSet$additionalData(null);
        } else if (((AdditionalSubscriptionInfo) map.get(realmGet$additionalData)) == null) {
            u5 k12 = u5.k(o0Var, o0Var.c1(AdditionalSubscriptionInfo.class).s(k10.b().g().createEmbeddedObject(aVar.f18216q, RealmFieldType.OBJECT)));
            map.put(realmGet$additionalData, k12);
            u5.n(o0Var, realmGet$additionalData, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheadditionalData.toString()");
        }
        return k10;
    }

    public static SubscriptionPlan d(o0 o0Var, a aVar, SubscriptionPlan subscriptionPlan, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((subscriptionPlan instanceof io.realm.internal.o) && !d1.isFrozen(subscriptionPlan)) {
            io.realm.internal.o oVar = (io.realm.internal.o) subscriptionPlan;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return subscriptionPlan;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(subscriptionPlan);
        if (oVar2 != null) {
            return (SubscriptionPlan) oVar2;
        }
        return c(o0Var, aVar, subscriptionPlan, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static SubscriptionPlan f(SubscriptionPlan subscriptionPlan, int i10, int i11, Map<a1, o.a<a1>> map) {
        SubscriptionPlan subscriptionPlan2;
        if (i10 <= i11 && subscriptionPlan != null) {
            o.a<a1> aVar = map.get(subscriptionPlan);
            if (aVar == null) {
                subscriptionPlan2 = new SubscriptionPlan();
                map.put(subscriptionPlan, new o.a<>(i10, subscriptionPlan2));
            } else if (i10 >= aVar.f17831a) {
                return (SubscriptionPlan) aVar.f17832b;
            } else {
                SubscriptionPlan subscriptionPlan3 = (SubscriptionPlan) aVar.f17832b;
                aVar.f17831a = i10;
                subscriptionPlan2 = subscriptionPlan3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) subscriptionPlan).b().f();
            subscriptionPlan2.realmSet$customerId(subscriptionPlan.realmGet$customerId());
            subscriptionPlan2.realmSet$dateCreated(subscriptionPlan.realmGet$dateCreated());
            subscriptionPlan2.realmSet$dateUpdated(subscriptionPlan.realmGet$dateUpdated());
            subscriptionPlan2.realmSet$dateTerminated(subscriptionPlan.realmGet$dateTerminated());
            subscriptionPlan2.realmSet$paymentMethod(subscriptionPlan.realmGet$paymentMethod());
            subscriptionPlan2.realmSet$planId(subscriptionPlan.realmGet$planId());
            subscriptionPlan2.realmSet$active(subscriptionPlan.realmGet$active());
            subscriptionPlan2.realmSet$gemsBought(subscriptionPlan.realmGet$gemsBought());
            subscriptionPlan2.realmSet$extraMonths(subscriptionPlan.realmGet$extraMonths());
            subscriptionPlan2.realmSet$quantity(subscriptionPlan.realmGet$quantity());
            int i12 = i10 + 1;
            subscriptionPlan2.realmSet$consecutive(q7.f(subscriptionPlan.realmGet$consecutive(), i12, i11, map));
            subscriptionPlan2.realmSet$mysteryItemCount(subscriptionPlan.realmGet$mysteryItemCount());
            subscriptionPlan2.realmSet$additionalData(u5.f(subscriptionPlan.realmGet$additionalData(), i12, i11, map));
            subscriptionPlan2.realmSet$perkMonthCount(subscriptionPlan.realmGet$perkMonthCount());
            subscriptionPlan2.realmSet$ownerID(subscriptionPlan.realmGet$ownerID());
            return subscriptionPlan2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "SubscriptionPlan", true, 15, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "customerId", realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.DATE;
        bVar.b("", "dateCreated", realmFieldType2, false, false, false);
        bVar.b("", "dateUpdated", realmFieldType2, false, false, false);
        bVar.b("", "dateTerminated", realmFieldType2, false, false, false);
        bVar.b("", "paymentMethod", realmFieldType, false, false, false);
        bVar.b("", "planId", realmFieldType, false, false, false);
        bVar.b("", "active", RealmFieldType.BOOLEAN, false, false, false);
        RealmFieldType realmFieldType3 = RealmFieldType.INTEGER;
        bVar.b("", "gemsBought", realmFieldType3, false, false, false);
        bVar.b("", "extraMonths", realmFieldType3, false, false, false);
        bVar.b("", "quantity", realmFieldType3, false, false, false);
        RealmFieldType realmFieldType4 = RealmFieldType.OBJECT;
        bVar.a("", "consecutive", realmFieldType4, "SubscriptionPlanConsecutive");
        bVar.b("", "mysteryItemCount", realmFieldType3, false, false, true);
        bVar.a("", "additionalData", realmFieldType4, "AdditionalSubscriptionInfo");
        bVar.b("", "perkMonthCount", realmFieldType3, false, false, true);
        bVar.b("", "ownerID", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18201r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, SubscriptionPlan subscriptionPlan, Map<a1, Long> map) {
        a aVar;
        a aVar2;
        if ((subscriptionPlan instanceof io.realm.internal.o) && !d1.isFrozen(subscriptionPlan)) {
            io.realm.internal.o oVar = (io.realm.internal.o) subscriptionPlan;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(SubscriptionPlan.class);
        long nativePtr = c12.getNativePtr();
        a aVar3 = (a) o0Var.R().e(SubscriptionPlan.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(subscriptionPlan, Long.valueOf(createEmbeddedObject));
        String realmGet$customerId = subscriptionPlan.realmGet$customerId();
        if (realmGet$customerId != null) {
            Table.nativeSetString(nativePtr, aVar3.f18204e, createEmbeddedObject, realmGet$customerId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar3.f18204e, createEmbeddedObject, false);
        }
        Date realmGet$dateCreated = subscriptionPlan.realmGet$dateCreated();
        if (realmGet$dateCreated != null) {
            Table.nativeSetTimestamp(nativePtr, aVar3.f18205f, createEmbeddedObject, realmGet$dateCreated.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar3.f18205f, createEmbeddedObject, false);
        }
        Date realmGet$dateUpdated = subscriptionPlan.realmGet$dateUpdated();
        if (realmGet$dateUpdated != null) {
            Table.nativeSetTimestamp(nativePtr, aVar3.f18206g, createEmbeddedObject, realmGet$dateUpdated.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar3.f18206g, createEmbeddedObject, false);
        }
        Date realmGet$dateTerminated = subscriptionPlan.realmGet$dateTerminated();
        if (realmGet$dateTerminated != null) {
            Table.nativeSetTimestamp(nativePtr, aVar3.f18207h, createEmbeddedObject, realmGet$dateTerminated.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar3.f18207h, createEmbeddedObject, false);
        }
        String realmGet$paymentMethod = subscriptionPlan.realmGet$paymentMethod();
        if (realmGet$paymentMethod != null) {
            Table.nativeSetString(nativePtr, aVar3.f18208i, createEmbeddedObject, realmGet$paymentMethod, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar3.f18208i, createEmbeddedObject, false);
        }
        String realmGet$planId = subscriptionPlan.realmGet$planId();
        if (realmGet$planId != null) {
            Table.nativeSetString(nativePtr, aVar3.f18209j, createEmbeddedObject, realmGet$planId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar3.f18209j, createEmbeddedObject, false);
        }
        Boolean realmGet$active = subscriptionPlan.realmGet$active();
        if (realmGet$active != null) {
            Table.nativeSetBoolean(nativePtr, aVar3.f18210k, createEmbeddedObject, realmGet$active.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar3.f18210k, createEmbeddedObject, false);
        }
        Integer realmGet$gemsBought = subscriptionPlan.realmGet$gemsBought();
        if (realmGet$gemsBought != null) {
            Table.nativeSetLong(nativePtr, aVar3.f18211l, createEmbeddedObject, realmGet$gemsBought.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar3.f18211l, createEmbeddedObject, false);
        }
        Integer realmGet$extraMonths = subscriptionPlan.realmGet$extraMonths();
        if (realmGet$extraMonths != null) {
            Table.nativeSetLong(nativePtr, aVar3.f18212m, createEmbeddedObject, realmGet$extraMonths.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar3.f18212m, createEmbeddedObject, false);
        }
        Integer realmGet$quantity = subscriptionPlan.realmGet$quantity();
        if (realmGet$quantity != null) {
            Table.nativeSetLong(nativePtr, aVar3.f18213n, createEmbeddedObject, realmGet$quantity.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar3.f18213n, createEmbeddedObject, false);
        }
        SubscriptionPlanConsecutive realmGet$consecutive = subscriptionPlan.realmGet$consecutive();
        if (realmGet$consecutive != null) {
            Long l10 = map.get(realmGet$consecutive);
            if (l10 == null) {
                aVar = aVar3;
                q7.i(o0Var, c12, aVar3.f18214o, createEmbeddedObject, realmGet$consecutive, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
            }
        } else {
            aVar = aVar3;
            Table.nativeNullifyLink(nativePtr, aVar.f18214o, createEmbeddedObject);
        }
        a aVar4 = aVar;
        Table.nativeSetLong(nativePtr, aVar.f18215p, createEmbeddedObject, subscriptionPlan.realmGet$mysteryItemCount(), false);
        AdditionalSubscriptionInfo realmGet$additionalData = subscriptionPlan.realmGet$additionalData();
        if (realmGet$additionalData != null) {
            Long l11 = map.get(realmGet$additionalData);
            if (l11 == null) {
                aVar2 = aVar4;
                u5.i(o0Var, c12, aVar4.f18216q, createEmbeddedObject, realmGet$additionalData, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l11.toString());
            }
        } else {
            aVar2 = aVar4;
            Table.nativeNullifyLink(nativePtr, aVar2.f18216q, createEmbeddedObject);
        }
        Table.nativeSetLong(nativePtr, aVar2.f18217r, createEmbeddedObject, subscriptionPlan.realmGet$perkMonthCount(), false);
        String realmGet$ownerID = subscriptionPlan.realmGet$ownerID();
        if (realmGet$ownerID != null) {
            Table.nativeSetString(nativePtr, aVar2.f18218s, createEmbeddedObject, realmGet$ownerID, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar2.f18218s, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s7 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(SubscriptionPlan.class), false, Collections.emptyList());
        s7 s7Var = new s7();
        cVar.a();
        return s7Var;
    }

    static SubscriptionPlan l(o0 o0Var, a aVar, SubscriptionPlan subscriptionPlan, SubscriptionPlan subscriptionPlan2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(SubscriptionPlan.class), set);
        osObjectBuilder.c1(aVar.f18204e, subscriptionPlan2.realmGet$customerId());
        osObjectBuilder.I0(aVar.f18205f, subscriptionPlan2.realmGet$dateCreated());
        osObjectBuilder.I0(aVar.f18206g, subscriptionPlan2.realmGet$dateUpdated());
        osObjectBuilder.I0(aVar.f18207h, subscriptionPlan2.realmGet$dateTerminated());
        osObjectBuilder.c1(aVar.f18208i, subscriptionPlan2.realmGet$paymentMethod());
        osObjectBuilder.c1(aVar.f18209j, subscriptionPlan2.realmGet$planId());
        osObjectBuilder.F0(aVar.f18210k, subscriptionPlan2.realmGet$active());
        osObjectBuilder.V0(aVar.f18211l, subscriptionPlan2.realmGet$gemsBought());
        osObjectBuilder.V0(aVar.f18212m, subscriptionPlan2.realmGet$extraMonths());
        osObjectBuilder.V0(aVar.f18213n, subscriptionPlan2.realmGet$quantity());
        SubscriptionPlanConsecutive realmGet$consecutive = subscriptionPlan2.realmGet$consecutive();
        if (realmGet$consecutive == null) {
            osObjectBuilder.Z0(aVar.f18214o);
        } else if (((SubscriptionPlanConsecutive) map.get(realmGet$consecutive)) == null) {
            q7 k10 = q7.k(o0Var, o0Var.c1(SubscriptionPlanConsecutive.class).s(((io.realm.internal.o) subscriptionPlan).b().g().createEmbeddedObject(aVar.f18214o, RealmFieldType.OBJECT)));
            map.put(realmGet$consecutive, k10);
            q7.n(o0Var, realmGet$consecutive, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheconsecutive.toString()");
        }
        osObjectBuilder.V0(aVar.f18215p, Integer.valueOf(subscriptionPlan2.realmGet$mysteryItemCount()));
        AdditionalSubscriptionInfo realmGet$additionalData = subscriptionPlan2.realmGet$additionalData();
        if (realmGet$additionalData == null) {
            osObjectBuilder.Z0(aVar.f18216q);
        } else if (((AdditionalSubscriptionInfo) map.get(realmGet$additionalData)) == null) {
            u5 k11 = u5.k(o0Var, o0Var.c1(AdditionalSubscriptionInfo.class).s(((io.realm.internal.o) subscriptionPlan).b().g().createEmbeddedObject(aVar.f18216q, RealmFieldType.OBJECT)));
            map.put(realmGet$additionalData, k11);
            u5.n(o0Var, realmGet$additionalData, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheadditionalData.toString()");
        }
        osObjectBuilder.V0(aVar.f18217r, Integer.valueOf(subscriptionPlan2.realmGet$perkMonthCount()));
        osObjectBuilder.c1(aVar.f18218s, subscriptionPlan2.realmGet$ownerID());
        osObjectBuilder.f1((io.realm.internal.o) subscriptionPlan);
        return subscriptionPlan;
    }

    public static void n(o0 o0Var, SubscriptionPlan subscriptionPlan, SubscriptionPlan subscriptionPlan2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(SubscriptionPlan.class), subscriptionPlan2, subscriptionPlan, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18203q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18202p = (a) cVar.c();
        l0<SubscriptionPlan> l0Var = new l0<>(this);
        this.f18203q = l0Var;
        l0Var.r(cVar.e());
        this.f18203q.s(cVar.f());
        this.f18203q.o(cVar.b());
        this.f18203q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18203q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s7 s7Var = (s7) obj;
        io.realm.a f10 = this.f18203q.f();
        io.realm.a f11 = s7Var.f18203q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18203q.g().getTable().p();
        String p11 = s7Var.f18203q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18203q.g().getObjectKey() == s7Var.f18203q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18203q.f().getPath();
        String p10 = this.f18203q.g().getTable().p();
        long objectKey = this.f18203q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public Boolean realmGet$active() {
        this.f18203q.f().e();
        if (this.f18203q.g().isNull(this.f18202p.f18210k)) {
            return null;
        }
        return Boolean.valueOf(this.f18203q.g().getBoolean(this.f18202p.f18210k));
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public AdditionalSubscriptionInfo realmGet$additionalData() {
        this.f18203q.f().e();
        if (this.f18203q.g().isNullLink(this.f18202p.f18216q)) {
            return null;
        }
        return (AdditionalSubscriptionInfo) this.f18203q.f().B(AdditionalSubscriptionInfo.class, this.f18203q.g().getLink(this.f18202p.f18216q), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public SubscriptionPlanConsecutive realmGet$consecutive() {
        this.f18203q.f().e();
        if (this.f18203q.g().isNullLink(this.f18202p.f18214o)) {
            return null;
        }
        return (SubscriptionPlanConsecutive) this.f18203q.f().B(SubscriptionPlanConsecutive.class, this.f18203q.g().getLink(this.f18202p.f18214o), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public String realmGet$customerId() {
        this.f18203q.f().e();
        return this.f18203q.g().getString(this.f18202p.f18204e);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public Date realmGet$dateCreated() {
        this.f18203q.f().e();
        if (this.f18203q.g().isNull(this.f18202p.f18205f)) {
            return null;
        }
        return this.f18203q.g().getDate(this.f18202p.f18205f);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public Date realmGet$dateTerminated() {
        this.f18203q.f().e();
        if (this.f18203q.g().isNull(this.f18202p.f18207h)) {
            return null;
        }
        return this.f18203q.g().getDate(this.f18202p.f18207h);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public Date realmGet$dateUpdated() {
        this.f18203q.f().e();
        if (this.f18203q.g().isNull(this.f18202p.f18206g)) {
            return null;
        }
        return this.f18203q.g().getDate(this.f18202p.f18206g);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public Integer realmGet$extraMonths() {
        this.f18203q.f().e();
        if (this.f18203q.g().isNull(this.f18202p.f18212m)) {
            return null;
        }
        return Integer.valueOf((int) this.f18203q.g().getLong(this.f18202p.f18212m));
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public Integer realmGet$gemsBought() {
        this.f18203q.f().e();
        if (this.f18203q.g().isNull(this.f18202p.f18211l)) {
            return null;
        }
        return Integer.valueOf((int) this.f18203q.g().getLong(this.f18202p.f18211l));
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public int realmGet$mysteryItemCount() {
        this.f18203q.f().e();
        return (int) this.f18203q.g().getLong(this.f18202p.f18215p);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public String realmGet$ownerID() {
        this.f18203q.f().e();
        return this.f18203q.g().getString(this.f18202p.f18218s);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public String realmGet$paymentMethod() {
        this.f18203q.f().e();
        return this.f18203q.g().getString(this.f18202p.f18208i);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public int realmGet$perkMonthCount() {
        this.f18203q.f().e();
        return (int) this.f18203q.g().getLong(this.f18202p.f18217r);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public String realmGet$planId() {
        this.f18203q.f().e();
        return this.f18203q.g().getString(this.f18202p.f18209j);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public Integer realmGet$quantity() {
        this.f18203q.f().e();
        if (this.f18203q.g().isNull(this.f18202p.f18213n)) {
            return null;
        }
        return Integer.valueOf((int) this.f18203q.g().getLong(this.f18202p.f18213n));
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public void realmSet$active(Boolean bool) {
        if (this.f18203q.i()) {
            if (!this.f18203q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18203q.g();
            if (bool == null) {
                g10.getTable().F(this.f18202p.f18210k, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f18202p.f18210k, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f18203q.f().e();
        if (bool == null) {
            this.f18203q.g().setNull(this.f18202p.f18210k);
        } else {
            this.f18203q.g().setBoolean(this.f18202p.f18210k, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public void realmSet$additionalData(AdditionalSubscriptionInfo additionalSubscriptionInfo) {
        o0 o0Var = (o0) this.f18203q.f();
        if (this.f18203q.i()) {
            if (!this.f18203q.d() || this.f18203q.e().contains("additionalData")) {
                return;
            }
            if (additionalSubscriptionInfo != null && !d1.isManaged(additionalSubscriptionInfo)) {
                AdditionalSubscriptionInfo additionalSubscriptionInfo2 = (AdditionalSubscriptionInfo) o0Var.J0(AdditionalSubscriptionInfo.class, this, "additionalData");
                u5.n(o0Var, additionalSubscriptionInfo, additionalSubscriptionInfo2, new HashMap(), Collections.EMPTY_SET);
                additionalSubscriptionInfo = additionalSubscriptionInfo2;
            }
            io.realm.internal.q g10 = this.f18203q.g();
            if (additionalSubscriptionInfo == null) {
                g10.nullifyLink(this.f18202p.f18216q);
                return;
            }
            this.f18203q.c(additionalSubscriptionInfo);
            g10.getTable().D(this.f18202p.f18216q, g10.getObjectKey(), ((io.realm.internal.o) additionalSubscriptionInfo).b().g().getObjectKey(), true);
            return;
        }
        this.f18203q.f().e();
        if (additionalSubscriptionInfo == null) {
            this.f18203q.g().nullifyLink(this.f18202p.f18216q);
            return;
        }
        if (d1.isManaged(additionalSubscriptionInfo)) {
            this.f18203q.c(additionalSubscriptionInfo);
        }
        u5.n(o0Var, additionalSubscriptionInfo, (AdditionalSubscriptionInfo) o0Var.J0(AdditionalSubscriptionInfo.class, this, "additionalData"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public void realmSet$consecutive(SubscriptionPlanConsecutive subscriptionPlanConsecutive) {
        o0 o0Var = (o0) this.f18203q.f();
        if (this.f18203q.i()) {
            if (!this.f18203q.d() || this.f18203q.e().contains("consecutive")) {
                return;
            }
            if (subscriptionPlanConsecutive != null && !d1.isManaged(subscriptionPlanConsecutive)) {
                SubscriptionPlanConsecutive subscriptionPlanConsecutive2 = (SubscriptionPlanConsecutive) o0Var.J0(SubscriptionPlanConsecutive.class, this, "consecutive");
                q7.n(o0Var, subscriptionPlanConsecutive, subscriptionPlanConsecutive2, new HashMap(), Collections.EMPTY_SET);
                subscriptionPlanConsecutive = subscriptionPlanConsecutive2;
            }
            io.realm.internal.q g10 = this.f18203q.g();
            if (subscriptionPlanConsecutive == null) {
                g10.nullifyLink(this.f18202p.f18214o);
                return;
            }
            this.f18203q.c(subscriptionPlanConsecutive);
            g10.getTable().D(this.f18202p.f18214o, g10.getObjectKey(), ((io.realm.internal.o) subscriptionPlanConsecutive).b().g().getObjectKey(), true);
            return;
        }
        this.f18203q.f().e();
        if (subscriptionPlanConsecutive == null) {
            this.f18203q.g().nullifyLink(this.f18202p.f18214o);
            return;
        }
        if (d1.isManaged(subscriptionPlanConsecutive)) {
            this.f18203q.c(subscriptionPlanConsecutive);
        }
        q7.n(o0Var, subscriptionPlanConsecutive, (SubscriptionPlanConsecutive) o0Var.J0(SubscriptionPlanConsecutive.class, this, "consecutive"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public void realmSet$customerId(String str) {
        if (this.f18203q.i()) {
            if (!this.f18203q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18203q.g();
            if (str == null) {
                g10.getTable().F(this.f18202p.f18204e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18202p.f18204e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18203q.f().e();
        if (str == null) {
            this.f18203q.g().setNull(this.f18202p.f18204e);
        } else {
            this.f18203q.g().setString(this.f18202p.f18204e, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public void realmSet$dateCreated(Date date) {
        if (this.f18203q.i()) {
            if (!this.f18203q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18203q.g();
            if (date == null) {
                g10.getTable().F(this.f18202p.f18205f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f18202p.f18205f, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f18203q.f().e();
        if (date == null) {
            this.f18203q.g().setNull(this.f18202p.f18205f);
        } else {
            this.f18203q.g().setDate(this.f18202p.f18205f, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public void realmSet$dateTerminated(Date date) {
        if (this.f18203q.i()) {
            if (!this.f18203q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18203q.g();
            if (date == null) {
                g10.getTable().F(this.f18202p.f18207h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f18202p.f18207h, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f18203q.f().e();
        if (date == null) {
            this.f18203q.g().setNull(this.f18202p.f18207h);
        } else {
            this.f18203q.g().setDate(this.f18202p.f18207h, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public void realmSet$dateUpdated(Date date) {
        if (this.f18203q.i()) {
            if (!this.f18203q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18203q.g();
            if (date == null) {
                g10.getTable().F(this.f18202p.f18206g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f18202p.f18206g, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f18203q.f().e();
        if (date == null) {
            this.f18203q.g().setNull(this.f18202p.f18206g);
        } else {
            this.f18203q.g().setDate(this.f18202p.f18206g, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public void realmSet$extraMonths(Integer num) {
        if (this.f18203q.i()) {
            if (!this.f18203q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18203q.g();
            if (num == null) {
                g10.getTable().F(this.f18202p.f18212m, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18202p.f18212m, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f18203q.f().e();
        if (num == null) {
            this.f18203q.g().setNull(this.f18202p.f18212m);
        } else {
            this.f18203q.g().setLong(this.f18202p.f18212m, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public void realmSet$gemsBought(Integer num) {
        if (this.f18203q.i()) {
            if (!this.f18203q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18203q.g();
            if (num == null) {
                g10.getTable().F(this.f18202p.f18211l, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18202p.f18211l, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f18203q.f().e();
        if (num == null) {
            this.f18203q.g().setNull(this.f18202p.f18211l);
        } else {
            this.f18203q.g().setLong(this.f18202p.f18211l, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public void realmSet$mysteryItemCount(int i10) {
        if (this.f18203q.i()) {
            if (!this.f18203q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18203q.g();
            g10.getTable().E(this.f18202p.f18215p, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18203q.f().e();
        this.f18203q.g().setLong(this.f18202p.f18215p, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public void realmSet$ownerID(String str) {
        if (this.f18203q.i()) {
            if (!this.f18203q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18203q.g();
            if (str == null) {
                g10.getTable().F(this.f18202p.f18218s, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18202p.f18218s, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18203q.f().e();
        if (str == null) {
            this.f18203q.g().setNull(this.f18202p.f18218s);
        } else {
            this.f18203q.g().setString(this.f18202p.f18218s, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public void realmSet$paymentMethod(String str) {
        if (this.f18203q.i()) {
            if (!this.f18203q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18203q.g();
            if (str == null) {
                g10.getTable().F(this.f18202p.f18208i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18202p.f18208i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18203q.f().e();
        if (str == null) {
            this.f18203q.g().setNull(this.f18202p.f18208i);
        } else {
            this.f18203q.g().setString(this.f18202p.f18208i, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public void realmSet$perkMonthCount(int i10) {
        if (this.f18203q.i()) {
            if (!this.f18203q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18203q.g();
            g10.getTable().E(this.f18202p.f18217r, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18203q.f().e();
        this.f18203q.g().setLong(this.f18202p.f18217r, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public void realmSet$planId(String str) {
        if (this.f18203q.i()) {
            if (!this.f18203q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18203q.g();
            if (str == null) {
                g10.getTable().F(this.f18202p.f18209j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18202p.f18209j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18203q.f().e();
        if (str == null) {
            this.f18203q.g().setNull(this.f18202p.f18209j);
        } else {
            this.f18203q.g().setString(this.f18202p.f18209j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlan, io.realm.t7
    public void realmSet$quantity(Integer num) {
        if (this.f18203q.i()) {
            if (!this.f18203q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18203q.g();
            if (num == null) {
                g10.getTable().F(this.f18202p.f18213n, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18202p.f18213n, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f18203q.f().e();
        if (num == null) {
            this.f18203q.g().setNull(this.f18202p.f18213n);
        } else {
            this.f18203q.g().setLong(this.f18202p.f18213n, num.intValue());
        }
    }

    public String toString() {
        String str;
        Date date;
        Date date2;
        Date date3;
        String str2;
        String str3;
        Boolean bool;
        Integer num;
        Integer num2;
        Integer num3;
        String str4;
        String str5;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("SubscriptionPlan = proxy[");
        sb2.append("{customerId:");
        String str6 = "null";
        if (realmGet$customerId() == null) {
            str = "null";
        } else {
            str = realmGet$customerId();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{dateCreated:");
        if (realmGet$dateCreated() == null) {
            date = "null";
        } else {
            date = realmGet$dateCreated();
        }
        sb2.append(date);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{dateUpdated:");
        if (realmGet$dateUpdated() == null) {
            date2 = "null";
        } else {
            date2 = realmGet$dateUpdated();
        }
        sb2.append(date2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{dateTerminated:");
        if (realmGet$dateTerminated() == null) {
            date3 = "null";
        } else {
            date3 = realmGet$dateTerminated();
        }
        sb2.append(date3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{paymentMethod:");
        if (realmGet$paymentMethod() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$paymentMethod();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{planId:");
        if (realmGet$planId() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$planId();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{active:");
        if (realmGet$active() == null) {
            bool = "null";
        } else {
            bool = realmGet$active();
        }
        sb2.append(bool);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{gemsBought:");
        if (realmGet$gemsBought() == null) {
            num = "null";
        } else {
            num = realmGet$gemsBought();
        }
        sb2.append(num);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{extraMonths:");
        if (realmGet$extraMonths() == null) {
            num2 = "null";
        } else {
            num2 = realmGet$extraMonths();
        }
        sb2.append(num2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{quantity:");
        if (realmGet$quantity() == null) {
            num3 = "null";
        } else {
            num3 = realmGet$quantity();
        }
        sb2.append(num3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{consecutive:");
        if (realmGet$consecutive() == null) {
            str4 = "null";
        } else {
            str4 = "SubscriptionPlanConsecutive";
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{mysteryItemCount:");
        sb2.append(realmGet$mysteryItemCount());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{additionalData:");
        if (realmGet$additionalData() == null) {
            str5 = "null";
        } else {
            str5 = "AdditionalSubscriptionInfo";
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{perkMonthCount:");
        sb2.append(realmGet$perkMonthCount());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{ownerID:");
        if (realmGet$ownerID() != null) {
            str6 = realmGet$ownerID();
        }
        sb2.append(str6);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
