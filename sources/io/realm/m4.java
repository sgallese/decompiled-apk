package io.realm;

import com.habitrpg.android.habitica.models.shops.ShopItemUnlockCondition;
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

/* compiled from: com_habitrpg_android_habitica_models_shops_ShopItemUnlockConditionRealmProxy.java */
/* loaded from: classes4.dex */
public class m4 extends ShopItemUnlockCondition implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17969r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17970p;

    /* renamed from: q  reason: collision with root package name */
    private l0<ShopItemUnlockCondition> f17971q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_shops_ShopItemUnlockConditionRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17972e;

        /* renamed from: f  reason: collision with root package name */
        long f17973f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("ShopItemUnlockCondition");
            this.f17972e = a("condition", "condition", b10);
            this.f17973f = a("incentiveThreshold", "incentiveThreshold", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17972e = aVar.f17972e;
            aVar2.f17973f = aVar.f17973f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m4() {
        this.f17971q.p();
    }

    public static ShopItemUnlockCondition c(o0 o0Var, a aVar, ShopItemUnlockCondition shopItemUnlockCondition, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(shopItemUnlockCondition);
        if (oVar != null) {
            return (ShopItemUnlockCondition) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ShopItemUnlockCondition.class), set);
        osObjectBuilder.c1(aVar.f17972e, shopItemUnlockCondition.realmGet$condition());
        osObjectBuilder.V0(aVar.f17973f, shopItemUnlockCondition.realmGet$incentiveThreshold());
        m4 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(shopItemUnlockCondition, k10);
        return k10;
    }

    public static ShopItemUnlockCondition d(o0 o0Var, a aVar, ShopItemUnlockCondition shopItemUnlockCondition, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((shopItemUnlockCondition instanceof io.realm.internal.o) && !d1.isFrozen(shopItemUnlockCondition)) {
            io.realm.internal.o oVar = (io.realm.internal.o) shopItemUnlockCondition;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return shopItemUnlockCondition;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(shopItemUnlockCondition);
        if (oVar2 != null) {
            return (ShopItemUnlockCondition) oVar2;
        }
        return c(o0Var, aVar, shopItemUnlockCondition, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ShopItemUnlockCondition f(ShopItemUnlockCondition shopItemUnlockCondition, int i10, int i11, Map<a1, o.a<a1>> map) {
        ShopItemUnlockCondition shopItemUnlockCondition2;
        if (i10 <= i11 && shopItemUnlockCondition != null) {
            o.a<a1> aVar = map.get(shopItemUnlockCondition);
            if (aVar == null) {
                shopItemUnlockCondition2 = new ShopItemUnlockCondition();
                map.put(shopItemUnlockCondition, new o.a<>(i10, shopItemUnlockCondition2));
            } else if (i10 >= aVar.f17831a) {
                return (ShopItemUnlockCondition) aVar.f17832b;
            } else {
                ShopItemUnlockCondition shopItemUnlockCondition3 = (ShopItemUnlockCondition) aVar.f17832b;
                aVar.f17831a = i10;
                shopItemUnlockCondition2 = shopItemUnlockCondition3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) shopItemUnlockCondition).b().f();
            shopItemUnlockCondition2.realmSet$condition(shopItemUnlockCondition.realmGet$condition());
            shopItemUnlockCondition2.realmSet$incentiveThreshold(shopItemUnlockCondition.realmGet$incentiveThreshold());
            return shopItemUnlockCondition2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ShopItemUnlockCondition", true, 2, 0);
        bVar.b("", "condition", RealmFieldType.STRING, false, false, false);
        bVar.b("", "incentiveThreshold", RealmFieldType.INTEGER, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17969r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, ShopItemUnlockCondition shopItemUnlockCondition, Map<a1, Long> map) {
        if ((shopItemUnlockCondition instanceof io.realm.internal.o) && !d1.isFrozen(shopItemUnlockCondition)) {
            io.realm.internal.o oVar = (io.realm.internal.o) shopItemUnlockCondition;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(ShopItemUnlockCondition.class).getNativePtr();
        a aVar = (a) o0Var.R().e(ShopItemUnlockCondition.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(shopItemUnlockCondition, Long.valueOf(createEmbeddedObject));
        String realmGet$condition = shopItemUnlockCondition.realmGet$condition();
        if (realmGet$condition != null) {
            Table.nativeSetString(nativePtr, aVar.f17972e, createEmbeddedObject, realmGet$condition, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17972e, createEmbeddedObject, false);
        }
        Integer realmGet$incentiveThreshold = shopItemUnlockCondition.realmGet$incentiveThreshold();
        if (realmGet$incentiveThreshold != null) {
            Table.nativeSetLong(nativePtr, aVar.f17973f, createEmbeddedObject, realmGet$incentiveThreshold.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17973f, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m4 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(ShopItemUnlockCondition.class), false, Collections.emptyList());
        m4 m4Var = new m4();
        cVar.a();
        return m4Var;
    }

    static ShopItemUnlockCondition l(o0 o0Var, a aVar, ShopItemUnlockCondition shopItemUnlockCondition, ShopItemUnlockCondition shopItemUnlockCondition2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ShopItemUnlockCondition.class), set);
        osObjectBuilder.c1(aVar.f17972e, shopItemUnlockCondition2.realmGet$condition());
        osObjectBuilder.V0(aVar.f17973f, shopItemUnlockCondition2.realmGet$incentiveThreshold());
        osObjectBuilder.f1((io.realm.internal.o) shopItemUnlockCondition);
        return shopItemUnlockCondition;
    }

    public static void n(o0 o0Var, ShopItemUnlockCondition shopItemUnlockCondition, ShopItemUnlockCondition shopItemUnlockCondition2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(ShopItemUnlockCondition.class), shopItemUnlockCondition2, shopItemUnlockCondition, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17971q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17970p = (a) cVar.c();
        l0<ShopItemUnlockCondition> l0Var = new l0<>(this);
        this.f17971q = l0Var;
        l0Var.r(cVar.e());
        this.f17971q.s(cVar.f());
        this.f17971q.o(cVar.b());
        this.f17971q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17971q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m4 m4Var = (m4) obj;
        io.realm.a f10 = this.f17971q.f();
        io.realm.a f11 = m4Var.f17971q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17971q.g().getTable().p();
        String p11 = m4Var.f17971q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17971q.g().getObjectKey() == m4Var.f17971q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17971q.f().getPath();
        String p10 = this.f17971q.g().getTable().p();
        long objectKey = this.f17971q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.shops.ShopItemUnlockCondition, io.realm.n4
    public String realmGet$condition() {
        this.f17971q.f().e();
        return this.f17971q.g().getString(this.f17970p.f17972e);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItemUnlockCondition, io.realm.n4
    public Integer realmGet$incentiveThreshold() {
        this.f17971q.f().e();
        if (this.f17971q.g().isNull(this.f17970p.f17973f)) {
            return null;
        }
        return Integer.valueOf((int) this.f17971q.g().getLong(this.f17970p.f17973f));
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItemUnlockCondition, io.realm.n4
    public void realmSet$condition(String str) {
        if (this.f17971q.i()) {
            if (!this.f17971q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17971q.g();
            if (str == null) {
                g10.getTable().F(this.f17970p.f17972e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17970p.f17972e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17971q.f().e();
        if (str == null) {
            this.f17971q.g().setNull(this.f17970p.f17972e);
        } else {
            this.f17971q.g().setString(this.f17970p.f17972e, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItemUnlockCondition, io.realm.n4
    public void realmSet$incentiveThreshold(Integer num) {
        if (this.f17971q.i()) {
            if (!this.f17971q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17971q.g();
            if (num == null) {
                g10.getTable().F(this.f17970p.f17973f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f17970p.f17973f, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f17971q.f().e();
        if (num == null) {
            this.f17971q.g().setNull(this.f17970p.f17973f);
        } else {
            this.f17971q.g().setLong(this.f17970p.f17973f, num.intValue());
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("ShopItemUnlockCondition = proxy[");
        sb2.append("{condition:");
        Object obj = "null";
        if (realmGet$condition() == null) {
            str = "null";
        } else {
            str = realmGet$condition();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{incentiveThreshold:");
        if (realmGet$incentiveThreshold() != null) {
            obj = realmGet$incentiveThreshold();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
