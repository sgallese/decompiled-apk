package io.realm;

import com.habitrpg.android.habitica.models.user.Outfit;
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

/* compiled from: com_habitrpg_android_habitica_models_user_OutfitRealmProxy.java */
/* loaded from: classes4.dex */
public class u6 extends Outfit implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18294r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18295p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Outfit> f18296q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_OutfitRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18297e;

        /* renamed from: f  reason: collision with root package name */
        long f18298f;

        /* renamed from: g  reason: collision with root package name */
        long f18299g;

        /* renamed from: h  reason: collision with root package name */
        long f18300h;

        /* renamed from: i  reason: collision with root package name */
        long f18301i;

        /* renamed from: j  reason: collision with root package name */
        long f18302j;

        /* renamed from: k  reason: collision with root package name */
        long f18303k;

        /* renamed from: l  reason: collision with root package name */
        long f18304l;

        a(OsSchemaInfo osSchemaInfo) {
            super(8);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Outfit");
            this.f18297e = a("armor", "armor", b10);
            this.f18298f = a("back", "back", b10);
            this.f18299g = a("body", "body", b10);
            this.f18300h = a("head", "head", b10);
            this.f18301i = a("shield", "shield", b10);
            this.f18302j = a("weapon", "weapon", b10);
            this.f18303k = a("eyeWear", "eyeWear", b10);
            this.f18304l = a("headAccessory", "headAccessory", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18297e = aVar.f18297e;
            aVar2.f18298f = aVar.f18298f;
            aVar2.f18299g = aVar.f18299g;
            aVar2.f18300h = aVar.f18300h;
            aVar2.f18301i = aVar.f18301i;
            aVar2.f18302j = aVar.f18302j;
            aVar2.f18303k = aVar.f18303k;
            aVar2.f18304l = aVar.f18304l;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u6() {
        this.f18296q.p();
    }

    public static Outfit c(o0 o0Var, a aVar, Outfit outfit, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(outfit);
        if (oVar != null) {
            return (Outfit) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Outfit.class), set);
        osObjectBuilder.c1(aVar.f18297e, outfit.realmGet$armor());
        osObjectBuilder.c1(aVar.f18298f, outfit.realmGet$back());
        osObjectBuilder.c1(aVar.f18299g, outfit.realmGet$body());
        osObjectBuilder.c1(aVar.f18300h, outfit.realmGet$head());
        osObjectBuilder.c1(aVar.f18301i, outfit.realmGet$shield());
        osObjectBuilder.c1(aVar.f18302j, outfit.realmGet$weapon());
        osObjectBuilder.c1(aVar.f18303k, outfit.realmGet$eyeWear());
        osObjectBuilder.c1(aVar.f18304l, outfit.realmGet$headAccessory());
        u6 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(outfit, k10);
        return k10;
    }

    public static Outfit d(o0 o0Var, a aVar, Outfit outfit, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((outfit instanceof io.realm.internal.o) && !d1.isFrozen(outfit)) {
            io.realm.internal.o oVar = (io.realm.internal.o) outfit;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return outfit;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(outfit);
        if (oVar2 != null) {
            return (Outfit) oVar2;
        }
        return c(o0Var, aVar, outfit, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Outfit f(Outfit outfit, int i10, int i11, Map<a1, o.a<a1>> map) {
        Outfit outfit2;
        if (i10 <= i11 && outfit != null) {
            o.a<a1> aVar = map.get(outfit);
            if (aVar == null) {
                outfit2 = new Outfit();
                map.put(outfit, new o.a<>(i10, outfit2));
            } else if (i10 >= aVar.f17831a) {
                return (Outfit) aVar.f17832b;
            } else {
                Outfit outfit3 = (Outfit) aVar.f17832b;
                aVar.f17831a = i10;
                outfit2 = outfit3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) outfit).b().f();
            outfit2.realmSet$armor(outfit.realmGet$armor());
            outfit2.realmSet$back(outfit.realmGet$back());
            outfit2.realmSet$body(outfit.realmGet$body());
            outfit2.realmSet$head(outfit.realmGet$head());
            outfit2.realmSet$shield(outfit.realmGet$shield());
            outfit2.realmSet$weapon(outfit.realmGet$weapon());
            outfit2.realmSet$eyeWear(outfit.realmGet$eyeWear());
            outfit2.realmSet$headAccessory(outfit.realmGet$headAccessory());
            return outfit2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Outfit", true, 8, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "armor", realmFieldType, false, false, true);
        bVar.b("", "back", realmFieldType, false, false, true);
        bVar.b("", "body", realmFieldType, false, false, true);
        bVar.b("", "head", realmFieldType, false, false, true);
        bVar.b("", "shield", realmFieldType, false, false, true);
        bVar.b("", "weapon", realmFieldType, false, false, true);
        bVar.b("", "eyeWear", realmFieldType, false, false, true);
        bVar.b("", "headAccessory", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18294r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Outfit outfit, Map<a1, Long> map) {
        if ((outfit instanceof io.realm.internal.o) && !d1.isFrozen(outfit)) {
            io.realm.internal.o oVar = (io.realm.internal.o) outfit;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(Outfit.class).getNativePtr();
        a aVar = (a) o0Var.R().e(Outfit.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(outfit, Long.valueOf(createEmbeddedObject));
        String realmGet$armor = outfit.realmGet$armor();
        if (realmGet$armor != null) {
            Table.nativeSetString(nativePtr, aVar.f18297e, createEmbeddedObject, realmGet$armor, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18297e, createEmbeddedObject, false);
        }
        String realmGet$back = outfit.realmGet$back();
        if (realmGet$back != null) {
            Table.nativeSetString(nativePtr, aVar.f18298f, createEmbeddedObject, realmGet$back, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18298f, createEmbeddedObject, false);
        }
        String realmGet$body = outfit.realmGet$body();
        if (realmGet$body != null) {
            Table.nativeSetString(nativePtr, aVar.f18299g, createEmbeddedObject, realmGet$body, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18299g, createEmbeddedObject, false);
        }
        String realmGet$head = outfit.realmGet$head();
        if (realmGet$head != null) {
            Table.nativeSetString(nativePtr, aVar.f18300h, createEmbeddedObject, realmGet$head, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18300h, createEmbeddedObject, false);
        }
        String realmGet$shield = outfit.realmGet$shield();
        if (realmGet$shield != null) {
            Table.nativeSetString(nativePtr, aVar.f18301i, createEmbeddedObject, realmGet$shield, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18301i, createEmbeddedObject, false);
        }
        String realmGet$weapon = outfit.realmGet$weapon();
        if (realmGet$weapon != null) {
            Table.nativeSetString(nativePtr, aVar.f18302j, createEmbeddedObject, realmGet$weapon, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18302j, createEmbeddedObject, false);
        }
        String realmGet$eyeWear = outfit.realmGet$eyeWear();
        if (realmGet$eyeWear != null) {
            Table.nativeSetString(nativePtr, aVar.f18303k, createEmbeddedObject, realmGet$eyeWear, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18303k, createEmbeddedObject, false);
        }
        String realmGet$headAccessory = outfit.realmGet$headAccessory();
        if (realmGet$headAccessory != null) {
            Table.nativeSetString(nativePtr, aVar.f18304l, createEmbeddedObject, realmGet$headAccessory, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18304l, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u6 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Outfit.class), false, Collections.emptyList());
        u6 u6Var = new u6();
        cVar.a();
        return u6Var;
    }

    static Outfit l(o0 o0Var, a aVar, Outfit outfit, Outfit outfit2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Outfit.class), set);
        osObjectBuilder.c1(aVar.f18297e, outfit2.realmGet$armor());
        osObjectBuilder.c1(aVar.f18298f, outfit2.realmGet$back());
        osObjectBuilder.c1(aVar.f18299g, outfit2.realmGet$body());
        osObjectBuilder.c1(aVar.f18300h, outfit2.realmGet$head());
        osObjectBuilder.c1(aVar.f18301i, outfit2.realmGet$shield());
        osObjectBuilder.c1(aVar.f18302j, outfit2.realmGet$weapon());
        osObjectBuilder.c1(aVar.f18303k, outfit2.realmGet$eyeWear());
        osObjectBuilder.c1(aVar.f18304l, outfit2.realmGet$headAccessory());
        osObjectBuilder.f1((io.realm.internal.o) outfit);
        return outfit;
    }

    public static void n(o0 o0Var, Outfit outfit, Outfit outfit2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Outfit.class), outfit2, outfit, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18296q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18295p = (a) cVar.c();
        l0<Outfit> l0Var = new l0<>(this);
        this.f18296q = l0Var;
        l0Var.r(cVar.e());
        this.f18296q.s(cVar.f());
        this.f18296q.o(cVar.b());
        this.f18296q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18296q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u6 u6Var = (u6) obj;
        io.realm.a f10 = this.f18296q.f();
        io.realm.a f11 = u6Var.f18296q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18296q.g().getTable().p();
        String p11 = u6Var.f18296q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18296q.g().getObjectKey() == u6Var.f18296q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18296q.f().getPath();
        String p10 = this.f18296q.g().getTable().p();
        long objectKey = this.f18296q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public String realmGet$armor() {
        this.f18296q.f().e();
        return this.f18296q.g().getString(this.f18295p.f18297e);
    }

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public String realmGet$back() {
        this.f18296q.f().e();
        return this.f18296q.g().getString(this.f18295p.f18298f);
    }

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public String realmGet$body() {
        this.f18296q.f().e();
        return this.f18296q.g().getString(this.f18295p.f18299g);
    }

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public String realmGet$eyeWear() {
        this.f18296q.f().e();
        return this.f18296q.g().getString(this.f18295p.f18303k);
    }

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public String realmGet$head() {
        this.f18296q.f().e();
        return this.f18296q.g().getString(this.f18295p.f18300h);
    }

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public String realmGet$headAccessory() {
        this.f18296q.f().e();
        return this.f18296q.g().getString(this.f18295p.f18304l);
    }

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public String realmGet$shield() {
        this.f18296q.f().e();
        return this.f18296q.g().getString(this.f18295p.f18301i);
    }

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public String realmGet$weapon() {
        this.f18296q.f().e();
        return this.f18296q.g().getString(this.f18295p.f18302j);
    }

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public void realmSet$armor(String str) {
        if (this.f18296q.i()) {
            if (!this.f18296q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18296q.g();
            if (str != null) {
                g10.getTable().G(this.f18295p.f18297e, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'armor' to null.");
        }
        this.f18296q.f().e();
        if (str != null) {
            this.f18296q.g().setString(this.f18295p.f18297e, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'armor' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public void realmSet$back(String str) {
        if (this.f18296q.i()) {
            if (!this.f18296q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18296q.g();
            if (str != null) {
                g10.getTable().G(this.f18295p.f18298f, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'back' to null.");
        }
        this.f18296q.f().e();
        if (str != null) {
            this.f18296q.g().setString(this.f18295p.f18298f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'back' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public void realmSet$body(String str) {
        if (this.f18296q.i()) {
            if (!this.f18296q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18296q.g();
            if (str != null) {
                g10.getTable().G(this.f18295p.f18299g, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'body' to null.");
        }
        this.f18296q.f().e();
        if (str != null) {
            this.f18296q.g().setString(this.f18295p.f18299g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'body' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public void realmSet$eyeWear(String str) {
        if (this.f18296q.i()) {
            if (!this.f18296q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18296q.g();
            if (str != null) {
                g10.getTable().G(this.f18295p.f18303k, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'eyeWear' to null.");
        }
        this.f18296q.f().e();
        if (str != null) {
            this.f18296q.g().setString(this.f18295p.f18303k, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'eyeWear' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public void realmSet$head(String str) {
        if (this.f18296q.i()) {
            if (!this.f18296q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18296q.g();
            if (str != null) {
                g10.getTable().G(this.f18295p.f18300h, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'head' to null.");
        }
        this.f18296q.f().e();
        if (str != null) {
            this.f18296q.g().setString(this.f18295p.f18300h, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'head' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public void realmSet$headAccessory(String str) {
        if (this.f18296q.i()) {
            if (!this.f18296q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18296q.g();
            if (str != null) {
                g10.getTable().G(this.f18295p.f18304l, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'headAccessory' to null.");
        }
        this.f18296q.f().e();
        if (str != null) {
            this.f18296q.g().setString(this.f18295p.f18304l, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'headAccessory' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public void realmSet$shield(String str) {
        if (this.f18296q.i()) {
            if (!this.f18296q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18296q.g();
            if (str != null) {
                g10.getTable().G(this.f18295p.f18301i, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'shield' to null.");
        }
        this.f18296q.f().e();
        if (str != null) {
            this.f18296q.g().setString(this.f18295p.f18301i, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'shield' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.user.Outfit, io.realm.v6
    public void realmSet$weapon(String str) {
        if (this.f18296q.i()) {
            if (!this.f18296q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18296q.g();
            if (str != null) {
                g10.getTable().G(this.f18295p.f18302j, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'weapon' to null.");
        }
        this.f18296q.f().e();
        if (str != null) {
            this.f18296q.g().setString(this.f18295p.f18302j, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'weapon' to null.");
    }

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "Outfit = proxy[{armor:" + realmGet$armor() + "},{back:" + realmGet$back() + "},{body:" + realmGet$body() + "},{head:" + realmGet$head() + "},{shield:" + realmGet$shield() + "},{weapon:" + realmGet$weapon() + "},{eyeWear:" + realmGet$eyeWear() + "},{headAccessory:" + realmGet$headAccessory() + "}]";
    }
}
