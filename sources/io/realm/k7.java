package io.realm;

import com.habitrpg.android.habitica.models.user.OwnedCustomization;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.models.user.User;
import io.realm.a;
import io.realm.a8;
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

/* compiled from: com_habitrpg_android_habitica_models_user_PurchasesRealmProxy.java */
/* loaded from: classes4.dex */
public class k7 extends Purchases implements io.realm.internal.o {

    /* renamed from: u  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17927u = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17928p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Purchases> f17929q;

    /* renamed from: r  reason: collision with root package name */
    private x0<OwnedCustomization> f17930r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_PurchasesRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17931e;

        /* renamed from: f  reason: collision with root package name */
        long f17932f;

        /* renamed from: g  reason: collision with root package name */
        long f17933g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Purchases");
            this.f17931e = a("customizations", "customizations", b10);
            this.f17932f = a("user", "user", b10);
            this.f17933g = a("plan", "plan", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17931e = aVar.f17931e;
            aVar2.f17932f = aVar.f17932f;
            aVar2.f17933g = aVar.f17933g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k7() {
        this.f17929q.p();
    }

    public static Purchases c(o0 o0Var, a aVar, Purchases purchases, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(purchases);
        if (oVar != null) {
            return (Purchases) oVar;
        }
        k7 k10 = k(o0Var, new OsObjectBuilder(o0Var.c1(Purchases.class), set).e1());
        map.put(purchases, k10);
        x0<OwnedCustomization> realmGet$customizations = purchases.realmGet$customizations();
        if (realmGet$customizations != null) {
            x0<OwnedCustomization> realmGet$customizations2 = k10.realmGet$customizations();
            realmGet$customizations2.clear();
            for (int i10 = 0; i10 < realmGet$customizations.size(); i10++) {
                OwnedCustomization ownedCustomization = realmGet$customizations.get(i10);
                if (((OwnedCustomization) map.get(ownedCustomization)) == null) {
                    w6 k11 = w6.k(o0Var, o0Var.c1(OwnedCustomization.class).s(realmGet$customizations2.m().n()));
                    map.put(ownedCustomization, k11);
                    w6.n(o0Var, ownedCustomization, k11, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecustomizations.toString()");
                }
            }
        }
        User realmGet$user = purchases.realmGet$user();
        if (realmGet$user == null) {
            k10.realmSet$user(null);
        } else {
            User user = (User) map.get(realmGet$user);
            if (user != null) {
                k10.realmSet$user(user);
            } else {
                k10.realmSet$user(a8.d(o0Var, (a8.a) o0Var.R().e(User.class), realmGet$user, z10, map, set));
            }
        }
        SubscriptionPlan realmGet$plan = purchases.realmGet$plan();
        if (realmGet$plan == null) {
            k10.realmSet$plan(null);
        } else if (((SubscriptionPlan) map.get(realmGet$plan)) == null) {
            s7 k12 = s7.k(o0Var, o0Var.c1(SubscriptionPlan.class).s(k10.b().g().createEmbeddedObject(aVar.f17933g, RealmFieldType.OBJECT)));
            map.put(realmGet$plan, k12);
            s7.n(o0Var, realmGet$plan, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheplan.toString()");
        }
        return k10;
    }

    public static Purchases d(o0 o0Var, a aVar, Purchases purchases, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((purchases instanceof io.realm.internal.o) && !d1.isFrozen(purchases)) {
            io.realm.internal.o oVar = (io.realm.internal.o) purchases;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return purchases;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(purchases);
        if (oVar2 != null) {
            return (Purchases) oVar2;
        }
        return c(o0Var, aVar, purchases, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Purchases f(Purchases purchases, int i10, int i11, Map<a1, o.a<a1>> map) {
        Purchases purchases2;
        if (i10 > i11 || purchases == null) {
            return null;
        }
        o.a<a1> aVar = map.get(purchases);
        if (aVar == null) {
            purchases2 = new Purchases();
            map.put(purchases, new o.a<>(i10, purchases2));
        } else if (i10 >= aVar.f17831a) {
            return (Purchases) aVar.f17832b;
        } else {
            Purchases purchases3 = (Purchases) aVar.f17832b;
            aVar.f17831a = i10;
            purchases2 = purchases3;
        }
        o0 o0Var = (o0) ((io.realm.internal.o) purchases).b().f();
        if (i10 == i11) {
            purchases2.realmSet$customizations(null);
        } else {
            x0<OwnedCustomization> realmGet$customizations = purchases.realmGet$customizations();
            x0<OwnedCustomization> x0Var = new x0<>();
            purchases2.realmSet$customizations(x0Var);
            int i12 = i10 + 1;
            int size = realmGet$customizations.size();
            for (int i13 = 0; i13 < size; i13++) {
                x0Var.add(w6.f(realmGet$customizations.get(i13), i12, i11, map));
            }
        }
        int i14 = i10 + 1;
        purchases2.realmSet$user(a8.f(purchases.realmGet$user(), i14, i11, map));
        purchases2.realmSet$plan(s7.f(purchases.realmGet$plan(), i14, i11, map));
        return purchases2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Purchases", true, 3, 0);
        bVar.a("", "customizations", RealmFieldType.LIST, "OwnedCustomization");
        RealmFieldType realmFieldType = RealmFieldType.OBJECT;
        bVar.a("", "user", realmFieldType, "User");
        bVar.a("", "plan", realmFieldType, "SubscriptionPlan");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17927u;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Purchases purchases, Map<a1, Long> map) {
        long j12;
        a aVar;
        String str;
        if ((purchases instanceof io.realm.internal.o) && !d1.isFrozen(purchases)) {
            io.realm.internal.o oVar = (io.realm.internal.o) purchases;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Purchases.class);
        long nativePtr = c12.getNativePtr();
        a aVar2 = (a) o0Var.R().e(Purchases.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(purchases, Long.valueOf(createEmbeddedObject));
        OsList osList = new OsList(c12.s(createEmbeddedObject), aVar2.f17931e);
        x0<OwnedCustomization> realmGet$customizations = purchases.realmGet$customizations();
        osList.K();
        if (realmGet$customizations != null) {
            Iterator<OwnedCustomization> it = realmGet$customizations.iterator();
            while (it.hasNext()) {
                OwnedCustomization next = it.next();
                Long l10 = map.get(next);
                if (l10 == null) {
                    w6.i(o0Var, c12, aVar2.f17931e, createEmbeddedObject, next, map);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
                }
            }
        }
        User realmGet$user = purchases.realmGet$user();
        if (realmGet$user != null) {
            Long l11 = map.get(realmGet$user);
            if (l11 == null) {
                l11 = Long.valueOf(a8.i(o0Var, realmGet$user, map));
            }
            j12 = createEmbeddedObject;
            aVar = aVar2;
            str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
            Table.nativeSetLink(nativePtr, aVar2.f17932f, j12, l11.longValue(), false);
        } else {
            j12 = createEmbeddedObject;
            aVar = aVar2;
            str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
            Table.nativeNullifyLink(nativePtr, aVar.f17932f, j12);
        }
        SubscriptionPlan realmGet$plan = purchases.realmGet$plan();
        if (realmGet$plan != null) {
            Long l12 = map.get(realmGet$plan);
            if (l12 == null) {
                s7.i(o0Var, c12, aVar.f17933g, j12, realmGet$plan, map);
            } else {
                throw new IllegalArgumentException(str + l12.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17933g, j12);
        }
        return j12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k7 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Purchases.class), false, Collections.emptyList());
        k7 k7Var = new k7();
        cVar.a();
        return k7Var;
    }

    static Purchases l(o0 o0Var, a aVar, Purchases purchases, Purchases purchases2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Purchases.class), set);
        x0<OwnedCustomization> realmGet$customizations = purchases2.realmGet$customizations();
        if (realmGet$customizations != null) {
            x0 x0Var = new x0();
            OsList m10 = purchases.realmGet$customizations().m();
            m10.q();
            for (int i10 = 0; i10 < realmGet$customizations.size(); i10++) {
                OwnedCustomization ownedCustomization = realmGet$customizations.get(i10);
                if (((OwnedCustomization) map.get(ownedCustomization)) == null) {
                    w6 k10 = w6.k(o0Var, o0Var.c1(OwnedCustomization.class).s(m10.n()));
                    map.put(ownedCustomization, k10);
                    x0Var.add(k10);
                    w6.n(o0Var, ownedCustomization, k10, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecustomizations.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f17931e, new x0());
        }
        User realmGet$user = purchases2.realmGet$user();
        if (realmGet$user == null) {
            osObjectBuilder.Z0(aVar.f17932f);
        } else {
            User user = (User) map.get(realmGet$user);
            if (user != null) {
                osObjectBuilder.a1(aVar.f17932f, user);
            } else {
                osObjectBuilder.a1(aVar.f17932f, a8.d(o0Var, (a8.a) o0Var.R().e(User.class), realmGet$user, true, map, set));
            }
        }
        SubscriptionPlan realmGet$plan = purchases2.realmGet$plan();
        if (realmGet$plan == null) {
            osObjectBuilder.Z0(aVar.f17933g);
        } else if (((SubscriptionPlan) map.get(realmGet$plan)) == null) {
            s7 k11 = s7.k(o0Var, o0Var.c1(SubscriptionPlan.class).s(((io.realm.internal.o) purchases).b().g().createEmbeddedObject(aVar.f17933g, RealmFieldType.OBJECT)));
            map.put(realmGet$plan, k11);
            s7.n(o0Var, realmGet$plan, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheplan.toString()");
        }
        osObjectBuilder.f1((io.realm.internal.o) purchases);
        return purchases;
    }

    public static void n(o0 o0Var, Purchases purchases, Purchases purchases2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Purchases.class), purchases2, purchases, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17929q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17928p = (a) cVar.c();
        l0<Purchases> l0Var = new l0<>(this);
        this.f17929q = l0Var;
        l0Var.r(cVar.e());
        this.f17929q.s(cVar.f());
        this.f17929q.o(cVar.b());
        this.f17929q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17929q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k7 k7Var = (k7) obj;
        io.realm.a f10 = this.f17929q.f();
        io.realm.a f11 = k7Var.f17929q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17929q.g().getTable().p();
        String p11 = k7Var.f17929q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17929q.g().getObjectKey() == k7Var.f17929q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17929q.f().getPath();
        String p10 = this.f17929q.g().getTable().p();
        long objectKey = this.f17929q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.Purchases, io.realm.l7
    public x0<OwnedCustomization> realmGet$customizations() {
        this.f17929q.f().e();
        x0<OwnedCustomization> x0Var = this.f17930r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<OwnedCustomization> x0Var2 = new x0<>(OwnedCustomization.class, this.f17929q.g().getModelList(this.f17928p.f17931e), this.f17929q.f());
        this.f17930r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.Purchases, io.realm.l7
    public SubscriptionPlan realmGet$plan() {
        this.f17929q.f().e();
        if (this.f17929q.g().isNullLink(this.f17928p.f17933g)) {
            return null;
        }
        return (SubscriptionPlan) this.f17929q.f().B(SubscriptionPlan.class, this.f17929q.g().getLink(this.f17928p.f17933g), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Purchases, io.realm.l7
    public User realmGet$user() {
        this.f17929q.f().e();
        if (this.f17929q.g().isNullLink(this.f17928p.f17932f)) {
            return null;
        }
        return (User) this.f17929q.f().B(User.class, this.f17929q.g().getLink(this.f17928p.f17932f), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Purchases, io.realm.l7
    public void realmSet$customizations(x0<OwnedCustomization> x0Var) {
        int i10 = 0;
        if (this.f17929q.i()) {
            if (!this.f17929q.d() || this.f17929q.e().contains("customizations")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17929q.f();
                x0<OwnedCustomization> x0Var2 = new x0<>();
                Iterator<OwnedCustomization> it = x0Var.iterator();
                while (it.hasNext()) {
                    OwnedCustomization next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((OwnedCustomization) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17929q.f().e();
        OsList modelList = this.f17929q.g().getModelList(this.f17928p.f17931e);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                OwnedCustomization ownedCustomization = x0Var.get(i10);
                this.f17929q.c(ownedCustomization);
                modelList.V(i10, ((io.realm.internal.o) ownedCustomization).b().g().getObjectKey());
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
            OwnedCustomization ownedCustomization2 = x0Var.get(i10);
            this.f17929q.c(ownedCustomization2);
            modelList.k(((io.realm.internal.o) ownedCustomization2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Purchases, io.realm.l7
    public void realmSet$plan(SubscriptionPlan subscriptionPlan) {
        o0 o0Var = (o0) this.f17929q.f();
        if (this.f17929q.i()) {
            if (!this.f17929q.d() || this.f17929q.e().contains("plan")) {
                return;
            }
            if (subscriptionPlan != null && !d1.isManaged(subscriptionPlan)) {
                SubscriptionPlan subscriptionPlan2 = (SubscriptionPlan) o0Var.J0(SubscriptionPlan.class, this, "plan");
                s7.n(o0Var, subscriptionPlan, subscriptionPlan2, new HashMap(), Collections.EMPTY_SET);
                subscriptionPlan = subscriptionPlan2;
            }
            io.realm.internal.q g10 = this.f17929q.g();
            if (subscriptionPlan == null) {
                g10.nullifyLink(this.f17928p.f17933g);
                return;
            }
            this.f17929q.c(subscriptionPlan);
            g10.getTable().D(this.f17928p.f17933g, g10.getObjectKey(), ((io.realm.internal.o) subscriptionPlan).b().g().getObjectKey(), true);
            return;
        }
        this.f17929q.f().e();
        if (subscriptionPlan == null) {
            this.f17929q.g().nullifyLink(this.f17928p.f17933g);
            return;
        }
        if (d1.isManaged(subscriptionPlan)) {
            this.f17929q.c(subscriptionPlan);
        }
        s7.n(o0Var, subscriptionPlan, (SubscriptionPlan) o0Var.J0(SubscriptionPlan.class, this, "plan"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.Purchases, io.realm.l7
    public void realmSet$user(User user) {
        o0 o0Var = (o0) this.f17929q.f();
        if (this.f17929q.i()) {
            if (!this.f17929q.d() || this.f17929q.e().contains("user")) {
                return;
            }
            if (user != null && !d1.isManaged(user)) {
                user = (User) o0Var.F0(user, new v[0]);
            }
            io.realm.internal.q g10 = this.f17929q.g();
            if (user == null) {
                g10.nullifyLink(this.f17928p.f17932f);
                return;
            }
            this.f17929q.c(user);
            g10.getTable().D(this.f17928p.f17932f, g10.getObjectKey(), ((io.realm.internal.o) user).b().g().getObjectKey(), true);
            return;
        }
        this.f17929q.f().e();
        if (user == null) {
            this.f17929q.g().nullifyLink(this.f17928p.f17932f);
            return;
        }
        this.f17929q.c(user);
        this.f17929q.g().setLink(this.f17928p.f17932f, ((io.realm.internal.o) user).b().g().getObjectKey());
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Purchases = proxy[");
        sb2.append("{customizations:");
        sb2.append("RealmList<OwnedCustomization>[");
        sb2.append(realmGet$customizations().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{user:");
        String str2 = "null";
        if (realmGet$user() == null) {
            str = "null";
        } else {
            str = "User";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{plan:");
        if (realmGet$plan() != null) {
            str2 = "SubscriptionPlan";
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
