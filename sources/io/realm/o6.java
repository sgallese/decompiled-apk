package io.realm;

import com.habitrpg.android.habitica.models.user.Hair;
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

/* compiled from: com_habitrpg_android_habitica_models_user_HairRealmProxy.java */
/* loaded from: classes4.dex */
public class o6 extends Hair implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18049r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18050p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Hair> f18051q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_HairRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18052e;

        /* renamed from: f  reason: collision with root package name */
        long f18053f;

        /* renamed from: g  reason: collision with root package name */
        long f18054g;

        /* renamed from: h  reason: collision with root package name */
        long f18055h;

        /* renamed from: i  reason: collision with root package name */
        long f18056i;

        /* renamed from: j  reason: collision with root package name */
        long f18057j;

        a(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Hair");
            this.f18052e = a("mustache", "mustache", b10);
            this.f18053f = a("beard", "beard", b10);
            this.f18054g = a("bangs", "bangs", b10);
            this.f18055h = a("base", "base", b10);
            this.f18056i = a("flower", "flower", b10);
            this.f18057j = a("color", "color", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18052e = aVar.f18052e;
            aVar2.f18053f = aVar.f18053f;
            aVar2.f18054g = aVar.f18054g;
            aVar2.f18055h = aVar.f18055h;
            aVar2.f18056i = aVar.f18056i;
            aVar2.f18057j = aVar.f18057j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o6() {
        this.f18051q.p();
    }

    public static Hair c(o0 o0Var, a aVar, Hair hair, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(hair);
        if (oVar != null) {
            return (Hair) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Hair.class), set);
        osObjectBuilder.V0(aVar.f18052e, Integer.valueOf(hair.realmGet$mustache()));
        osObjectBuilder.V0(aVar.f18053f, Integer.valueOf(hair.realmGet$beard()));
        osObjectBuilder.V0(aVar.f18054g, Integer.valueOf(hair.realmGet$bangs()));
        osObjectBuilder.V0(aVar.f18055h, Integer.valueOf(hair.realmGet$base()));
        osObjectBuilder.V0(aVar.f18056i, Integer.valueOf(hair.realmGet$flower()));
        osObjectBuilder.c1(aVar.f18057j, hair.realmGet$color());
        o6 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(hair, k10);
        return k10;
    }

    public static Hair d(o0 o0Var, a aVar, Hair hair, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((hair instanceof io.realm.internal.o) && !d1.isFrozen(hair)) {
            io.realm.internal.o oVar = (io.realm.internal.o) hair;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return hair;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(hair);
        if (oVar2 != null) {
            return (Hair) oVar2;
        }
        return c(o0Var, aVar, hair, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Hair f(Hair hair, int i10, int i11, Map<a1, o.a<a1>> map) {
        Hair hair2;
        if (i10 <= i11 && hair != null) {
            o.a<a1> aVar = map.get(hair);
            if (aVar == null) {
                hair2 = new Hair();
                map.put(hair, new o.a<>(i10, hair2));
            } else if (i10 >= aVar.f17831a) {
                return (Hair) aVar.f17832b;
            } else {
                Hair hair3 = (Hair) aVar.f17832b;
                aVar.f17831a = i10;
                hair2 = hair3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) hair).b().f();
            hair2.realmSet$mustache(hair.realmGet$mustache());
            hair2.realmSet$beard(hair.realmGet$beard());
            hair2.realmSet$bangs(hair.realmGet$bangs());
            hair2.realmSet$base(hair.realmGet$base());
            hair2.realmSet$flower(hair.realmGet$flower());
            hair2.realmSet$color(hair.realmGet$color());
            return hair2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Hair", true, 6, 0);
        RealmFieldType realmFieldType = RealmFieldType.INTEGER;
        bVar.b("", "mustache", realmFieldType, false, false, true);
        bVar.b("", "beard", realmFieldType, false, false, true);
        bVar.b("", "bangs", realmFieldType, false, false, true);
        bVar.b("", "base", realmFieldType, false, false, true);
        bVar.b("", "flower", realmFieldType, false, false, true);
        bVar.b("", "color", RealmFieldType.STRING, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18049r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Hair hair, Map<a1, Long> map) {
        if ((hair instanceof io.realm.internal.o) && !d1.isFrozen(hair)) {
            io.realm.internal.o oVar = (io.realm.internal.o) hair;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(Hair.class).getNativePtr();
        a aVar = (a) o0Var.R().e(Hair.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(hair, Long.valueOf(createEmbeddedObject));
        Table.nativeSetLong(nativePtr, aVar.f18052e, createEmbeddedObject, hair.realmGet$mustache(), false);
        Table.nativeSetLong(nativePtr, aVar.f18053f, createEmbeddedObject, hair.realmGet$beard(), false);
        Table.nativeSetLong(nativePtr, aVar.f18054g, createEmbeddedObject, hair.realmGet$bangs(), false);
        Table.nativeSetLong(nativePtr, aVar.f18055h, createEmbeddedObject, hair.realmGet$base(), false);
        Table.nativeSetLong(nativePtr, aVar.f18056i, createEmbeddedObject, hair.realmGet$flower(), false);
        String realmGet$color = hair.realmGet$color();
        if (realmGet$color != null) {
            Table.nativeSetString(nativePtr, aVar.f18057j, createEmbeddedObject, realmGet$color, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18057j, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o6 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Hair.class), false, Collections.emptyList());
        o6 o6Var = new o6();
        cVar.a();
        return o6Var;
    }

    static Hair l(o0 o0Var, a aVar, Hair hair, Hair hair2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Hair.class), set);
        osObjectBuilder.V0(aVar.f18052e, Integer.valueOf(hair2.realmGet$mustache()));
        osObjectBuilder.V0(aVar.f18053f, Integer.valueOf(hair2.realmGet$beard()));
        osObjectBuilder.V0(aVar.f18054g, Integer.valueOf(hair2.realmGet$bangs()));
        osObjectBuilder.V0(aVar.f18055h, Integer.valueOf(hair2.realmGet$base()));
        osObjectBuilder.V0(aVar.f18056i, Integer.valueOf(hair2.realmGet$flower()));
        osObjectBuilder.c1(aVar.f18057j, hair2.realmGet$color());
        osObjectBuilder.f1((io.realm.internal.o) hair);
        return hair;
    }

    public static void n(o0 o0Var, Hair hair, Hair hair2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Hair.class), hair2, hair, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18051q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18050p = (a) cVar.c();
        l0<Hair> l0Var = new l0<>(this);
        this.f18051q = l0Var;
        l0Var.r(cVar.e());
        this.f18051q.s(cVar.f());
        this.f18051q.o(cVar.b());
        this.f18051q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18051q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o6 o6Var = (o6) obj;
        io.realm.a f10 = this.f18051q.f();
        io.realm.a f11 = o6Var.f18051q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18051q.g().getTable().p();
        String p11 = o6Var.f18051q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18051q.g().getObjectKey() == o6Var.f18051q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18051q.f().getPath();
        String p10 = this.f18051q.g().getTable().p();
        long objectKey = this.f18051q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.Hair, io.realm.p6
    public int realmGet$bangs() {
        this.f18051q.f().e();
        return (int) this.f18051q.g().getLong(this.f18050p.f18054g);
    }

    @Override // com.habitrpg.android.habitica.models.user.Hair, io.realm.p6
    public int realmGet$base() {
        this.f18051q.f().e();
        return (int) this.f18051q.g().getLong(this.f18050p.f18055h);
    }

    @Override // com.habitrpg.android.habitica.models.user.Hair, io.realm.p6
    public int realmGet$beard() {
        this.f18051q.f().e();
        return (int) this.f18051q.g().getLong(this.f18050p.f18053f);
    }

    @Override // com.habitrpg.android.habitica.models.user.Hair, io.realm.p6
    public String realmGet$color() {
        this.f18051q.f().e();
        return this.f18051q.g().getString(this.f18050p.f18057j);
    }

    @Override // com.habitrpg.android.habitica.models.user.Hair, io.realm.p6
    public int realmGet$flower() {
        this.f18051q.f().e();
        return (int) this.f18051q.g().getLong(this.f18050p.f18056i);
    }

    @Override // com.habitrpg.android.habitica.models.user.Hair, io.realm.p6
    public int realmGet$mustache() {
        this.f18051q.f().e();
        return (int) this.f18051q.g().getLong(this.f18050p.f18052e);
    }

    @Override // com.habitrpg.android.habitica.models.user.Hair, io.realm.p6
    public void realmSet$bangs(int i10) {
        if (this.f18051q.i()) {
            if (!this.f18051q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18051q.g();
            g10.getTable().E(this.f18050p.f18054g, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18051q.f().e();
        this.f18051q.g().setLong(this.f18050p.f18054g, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Hair, io.realm.p6
    public void realmSet$base(int i10) {
        if (this.f18051q.i()) {
            if (!this.f18051q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18051q.g();
            g10.getTable().E(this.f18050p.f18055h, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18051q.f().e();
        this.f18051q.g().setLong(this.f18050p.f18055h, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Hair, io.realm.p6
    public void realmSet$beard(int i10) {
        if (this.f18051q.i()) {
            if (!this.f18051q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18051q.g();
            g10.getTable().E(this.f18050p.f18053f, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18051q.f().e();
        this.f18051q.g().setLong(this.f18050p.f18053f, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Hair, io.realm.p6
    public void realmSet$color(String str) {
        if (this.f18051q.i()) {
            if (!this.f18051q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18051q.g();
            if (str == null) {
                g10.getTable().F(this.f18050p.f18057j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18050p.f18057j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18051q.f().e();
        if (str == null) {
            this.f18051q.g().setNull(this.f18050p.f18057j);
        } else {
            this.f18051q.g().setString(this.f18050p.f18057j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Hair, io.realm.p6
    public void realmSet$flower(int i10) {
        if (this.f18051q.i()) {
            if (!this.f18051q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18051q.g();
            g10.getTable().E(this.f18050p.f18056i, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18051q.f().e();
        this.f18051q.g().setLong(this.f18050p.f18056i, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Hair, io.realm.p6
    public void realmSet$mustache(int i10) {
        if (this.f18051q.i()) {
            if (!this.f18051q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18051q.g();
            g10.getTable().E(this.f18050p.f18052e, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18051q.f().e();
        this.f18051q.g().setLong(this.f18050p.f18052e, i10);
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Hair = proxy[");
        sb2.append("{mustache:");
        sb2.append(realmGet$mustache());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{beard:");
        sb2.append(realmGet$beard());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{bangs:");
        sb2.append(realmGet$bangs());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{base:");
        sb2.append(realmGet$base());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{flower:");
        sb2.append(realmGet$flower());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{color:");
        if (realmGet$color() != null) {
            str = realmGet$color();
        } else {
            str = "null";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
