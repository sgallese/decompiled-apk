package io.realm;

import com.habitrpg.android.habitica.models.user.SubscriptionPlanConsecutive;
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

/* compiled from: com_habitrpg_android_habitica_models_user_SubscriptionPlanConsecutiveRealmProxy.java */
/* loaded from: classes4.dex */
public class q7 extends SubscriptionPlanConsecutive implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18145r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18146p;

    /* renamed from: q  reason: collision with root package name */
    private l0<SubscriptionPlanConsecutive> f18147q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_SubscriptionPlanConsecutiveRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18148e;

        /* renamed from: f  reason: collision with root package name */
        long f18149f;

        /* renamed from: g  reason: collision with root package name */
        long f18150g;

        /* renamed from: h  reason: collision with root package name */
        long f18151h;

        a(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("SubscriptionPlanConsecutive");
            this.f18148e = a("trinkets", "trinkets", b10);
            this.f18149f = a("gemCapExtra", "gemCapExtra", b10);
            this.f18150g = a("offset", "offset", b10);
            this.f18151h = a("count", "count", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18148e = aVar.f18148e;
            aVar2.f18149f = aVar.f18149f;
            aVar2.f18150g = aVar.f18150g;
            aVar2.f18151h = aVar.f18151h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q7() {
        this.f18147q.p();
    }

    public static SubscriptionPlanConsecutive c(o0 o0Var, a aVar, SubscriptionPlanConsecutive subscriptionPlanConsecutive, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(subscriptionPlanConsecutive);
        if (oVar != null) {
            return (SubscriptionPlanConsecutive) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(SubscriptionPlanConsecutive.class), set);
        osObjectBuilder.V0(aVar.f18148e, Integer.valueOf(subscriptionPlanConsecutive.realmGet$trinkets()));
        osObjectBuilder.V0(aVar.f18149f, Integer.valueOf(subscriptionPlanConsecutive.realmGet$gemCapExtra()));
        osObjectBuilder.V0(aVar.f18150g, Integer.valueOf(subscriptionPlanConsecutive.realmGet$offset()));
        osObjectBuilder.V0(aVar.f18151h, Integer.valueOf(subscriptionPlanConsecutive.realmGet$count()));
        q7 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(subscriptionPlanConsecutive, k10);
        return k10;
    }

    public static SubscriptionPlanConsecutive d(o0 o0Var, a aVar, SubscriptionPlanConsecutive subscriptionPlanConsecutive, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((subscriptionPlanConsecutive instanceof io.realm.internal.o) && !d1.isFrozen(subscriptionPlanConsecutive)) {
            io.realm.internal.o oVar = (io.realm.internal.o) subscriptionPlanConsecutive;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return subscriptionPlanConsecutive;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(subscriptionPlanConsecutive);
        if (oVar2 != null) {
            return (SubscriptionPlanConsecutive) oVar2;
        }
        return c(o0Var, aVar, subscriptionPlanConsecutive, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static SubscriptionPlanConsecutive f(SubscriptionPlanConsecutive subscriptionPlanConsecutive, int i10, int i11, Map<a1, o.a<a1>> map) {
        SubscriptionPlanConsecutive subscriptionPlanConsecutive2;
        if (i10 <= i11 && subscriptionPlanConsecutive != null) {
            o.a<a1> aVar = map.get(subscriptionPlanConsecutive);
            if (aVar == null) {
                subscriptionPlanConsecutive2 = new SubscriptionPlanConsecutive();
                map.put(subscriptionPlanConsecutive, new o.a<>(i10, subscriptionPlanConsecutive2));
            } else if (i10 >= aVar.f17831a) {
                return (SubscriptionPlanConsecutive) aVar.f17832b;
            } else {
                SubscriptionPlanConsecutive subscriptionPlanConsecutive3 = (SubscriptionPlanConsecutive) aVar.f17832b;
                aVar.f17831a = i10;
                subscriptionPlanConsecutive2 = subscriptionPlanConsecutive3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) subscriptionPlanConsecutive).b().f();
            subscriptionPlanConsecutive2.realmSet$trinkets(subscriptionPlanConsecutive.realmGet$trinkets());
            subscriptionPlanConsecutive2.realmSet$gemCapExtra(subscriptionPlanConsecutive.realmGet$gemCapExtra());
            subscriptionPlanConsecutive2.realmSet$offset(subscriptionPlanConsecutive.realmGet$offset());
            subscriptionPlanConsecutive2.realmSet$count(subscriptionPlanConsecutive.realmGet$count());
            return subscriptionPlanConsecutive2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "SubscriptionPlanConsecutive", true, 4, 0);
        RealmFieldType realmFieldType = RealmFieldType.INTEGER;
        bVar.b("", "trinkets", realmFieldType, false, false, true);
        bVar.b("", "gemCapExtra", realmFieldType, false, false, true);
        bVar.b("", "offset", realmFieldType, false, false, true);
        bVar.b("", "count", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18145r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, SubscriptionPlanConsecutive subscriptionPlanConsecutive, Map<a1, Long> map) {
        if ((subscriptionPlanConsecutive instanceof io.realm.internal.o) && !d1.isFrozen(subscriptionPlanConsecutive)) {
            io.realm.internal.o oVar = (io.realm.internal.o) subscriptionPlanConsecutive;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(SubscriptionPlanConsecutive.class).getNativePtr();
        a aVar = (a) o0Var.R().e(SubscriptionPlanConsecutive.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(subscriptionPlanConsecutive, Long.valueOf(createEmbeddedObject));
        Table.nativeSetLong(nativePtr, aVar.f18148e, createEmbeddedObject, subscriptionPlanConsecutive.realmGet$trinkets(), false);
        Table.nativeSetLong(nativePtr, aVar.f18149f, createEmbeddedObject, subscriptionPlanConsecutive.realmGet$gemCapExtra(), false);
        Table.nativeSetLong(nativePtr, aVar.f18150g, createEmbeddedObject, subscriptionPlanConsecutive.realmGet$offset(), false);
        Table.nativeSetLong(nativePtr, aVar.f18151h, createEmbeddedObject, subscriptionPlanConsecutive.realmGet$count(), false);
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q7 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(SubscriptionPlanConsecutive.class), false, Collections.emptyList());
        q7 q7Var = new q7();
        cVar.a();
        return q7Var;
    }

    static SubscriptionPlanConsecutive l(o0 o0Var, a aVar, SubscriptionPlanConsecutive subscriptionPlanConsecutive, SubscriptionPlanConsecutive subscriptionPlanConsecutive2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(SubscriptionPlanConsecutive.class), set);
        osObjectBuilder.V0(aVar.f18148e, Integer.valueOf(subscriptionPlanConsecutive2.realmGet$trinkets()));
        osObjectBuilder.V0(aVar.f18149f, Integer.valueOf(subscriptionPlanConsecutive2.realmGet$gemCapExtra()));
        osObjectBuilder.V0(aVar.f18150g, Integer.valueOf(subscriptionPlanConsecutive2.realmGet$offset()));
        osObjectBuilder.V0(aVar.f18151h, Integer.valueOf(subscriptionPlanConsecutive2.realmGet$count()));
        osObjectBuilder.f1((io.realm.internal.o) subscriptionPlanConsecutive);
        return subscriptionPlanConsecutive;
    }

    public static void n(o0 o0Var, SubscriptionPlanConsecutive subscriptionPlanConsecutive, SubscriptionPlanConsecutive subscriptionPlanConsecutive2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(SubscriptionPlanConsecutive.class), subscriptionPlanConsecutive2, subscriptionPlanConsecutive, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18147q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18146p = (a) cVar.c();
        l0<SubscriptionPlanConsecutive> l0Var = new l0<>(this);
        this.f18147q = l0Var;
        l0Var.r(cVar.e());
        this.f18147q.s(cVar.f());
        this.f18147q.o(cVar.b());
        this.f18147q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18147q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q7 q7Var = (q7) obj;
        io.realm.a f10 = this.f18147q.f();
        io.realm.a f11 = q7Var.f18147q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18147q.g().getTable().p();
        String p11 = q7Var.f18147q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18147q.g().getObjectKey() == q7Var.f18147q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18147q.f().getPath();
        String p10 = this.f18147q.g().getTable().p();
        long objectKey = this.f18147q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlanConsecutive, io.realm.r7
    public int realmGet$count() {
        this.f18147q.f().e();
        return (int) this.f18147q.g().getLong(this.f18146p.f18151h);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlanConsecutive, io.realm.r7
    public int realmGet$gemCapExtra() {
        this.f18147q.f().e();
        return (int) this.f18147q.g().getLong(this.f18146p.f18149f);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlanConsecutive, io.realm.r7
    public int realmGet$offset() {
        this.f18147q.f().e();
        return (int) this.f18147q.g().getLong(this.f18146p.f18150g);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlanConsecutive, io.realm.r7
    public int realmGet$trinkets() {
        this.f18147q.f().e();
        return (int) this.f18147q.g().getLong(this.f18146p.f18148e);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlanConsecutive, io.realm.r7
    public void realmSet$count(int i10) {
        if (this.f18147q.i()) {
            if (!this.f18147q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18147q.g();
            g10.getTable().E(this.f18146p.f18151h, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18147q.f().e();
        this.f18147q.g().setLong(this.f18146p.f18151h, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlanConsecutive, io.realm.r7
    public void realmSet$gemCapExtra(int i10) {
        if (this.f18147q.i()) {
            if (!this.f18147q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18147q.g();
            g10.getTable().E(this.f18146p.f18149f, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18147q.f().e();
        this.f18147q.g().setLong(this.f18146p.f18149f, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlanConsecutive, io.realm.r7
    public void realmSet$offset(int i10) {
        if (this.f18147q.i()) {
            if (!this.f18147q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18147q.g();
            g10.getTable().E(this.f18146p.f18150g, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18147q.f().e();
        this.f18147q.g().setLong(this.f18146p.f18150g, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.SubscriptionPlanConsecutive, io.realm.r7
    public void realmSet$trinkets(int i10) {
        if (this.f18147q.i()) {
            if (!this.f18147q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18147q.g();
            g10.getTable().E(this.f18146p.f18148e, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18147q.f().e();
        this.f18147q.g().setLong(this.f18146p.f18148e, i10);
    }

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "SubscriptionPlanConsecutive = proxy[{trinkets:" + realmGet$trinkets() + "},{gemCapExtra:" + realmGet$gemCapExtra() + "},{offset:" + realmGet$offset() + "},{count:" + realmGet$count() + "}]";
    }
}
