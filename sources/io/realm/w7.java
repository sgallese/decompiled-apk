package io.realm;

import com.habitrpg.android.habitica.models.user.Training;
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

/* compiled from: com_habitrpg_android_habitica_models_user_TrainingRealmProxy.java */
/* loaded from: classes4.dex */
public class w7 extends Training implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18400r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18401p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Training> f18402q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_TrainingRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18403e;

        /* renamed from: f  reason: collision with root package name */
        long f18404f;

        /* renamed from: g  reason: collision with root package name */
        long f18405g;

        /* renamed from: h  reason: collision with root package name */
        long f18406h;

        a(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Training");
            this.f18403e = a("con", "con", b10);
            this.f18404f = a("str", "str", b10);
            this.f18405g = a("per", "per", b10);
            this.f18406h = a("_int", "_int", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18403e = aVar.f18403e;
            aVar2.f18404f = aVar.f18404f;
            aVar2.f18405g = aVar.f18405g;
            aVar2.f18406h = aVar.f18406h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w7() {
        this.f18402q.p();
    }

    public static Training c(o0 o0Var, a aVar, Training training, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(training);
        if (oVar != null) {
            return (Training) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Training.class), set);
        osObjectBuilder.T0(aVar.f18403e, Float.valueOf(training.realmGet$con()));
        osObjectBuilder.T0(aVar.f18404f, Float.valueOf(training.realmGet$str()));
        osObjectBuilder.T0(aVar.f18405g, Float.valueOf(training.realmGet$per()));
        osObjectBuilder.T0(aVar.f18406h, Float.valueOf(training.realmGet$_int()));
        w7 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(training, k10);
        return k10;
    }

    public static Training d(o0 o0Var, a aVar, Training training, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((training instanceof io.realm.internal.o) && !d1.isFrozen(training)) {
            io.realm.internal.o oVar = (io.realm.internal.o) training;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return training;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(training);
        if (oVar2 != null) {
            return (Training) oVar2;
        }
        return c(o0Var, aVar, training, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Training f(Training training, int i10, int i11, Map<a1, o.a<a1>> map) {
        Training training2;
        if (i10 <= i11 && training != null) {
            o.a<a1> aVar = map.get(training);
            if (aVar == null) {
                training2 = new Training();
                map.put(training, new o.a<>(i10, training2));
            } else if (i10 >= aVar.f17831a) {
                return (Training) aVar.f17832b;
            } else {
                Training training3 = (Training) aVar.f17832b;
                aVar.f17831a = i10;
                training2 = training3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) training).b().f();
            training2.realmSet$con(training.realmGet$con());
            training2.realmSet$str(training.realmGet$str());
            training2.realmSet$per(training.realmGet$per());
            training2.realmSet$_int(training.realmGet$_int());
            return training2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Training", true, 4, 0);
        RealmFieldType realmFieldType = RealmFieldType.FLOAT;
        bVar.b("", "con", realmFieldType, false, false, true);
        bVar.b("", "str", realmFieldType, false, false, true);
        bVar.b("", "per", realmFieldType, false, false, true);
        bVar.b("", "_int", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18400r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Training training, Map<a1, Long> map) {
        if ((training instanceof io.realm.internal.o) && !d1.isFrozen(training)) {
            io.realm.internal.o oVar = (io.realm.internal.o) training;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(Training.class).getNativePtr();
        a aVar = (a) o0Var.R().e(Training.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(training, Long.valueOf(createEmbeddedObject));
        Table.nativeSetFloat(nativePtr, aVar.f18403e, createEmbeddedObject, training.realmGet$con(), false);
        Table.nativeSetFloat(nativePtr, aVar.f18404f, createEmbeddedObject, training.realmGet$str(), false);
        Table.nativeSetFloat(nativePtr, aVar.f18405g, createEmbeddedObject, training.realmGet$per(), false);
        Table.nativeSetFloat(nativePtr, aVar.f18406h, createEmbeddedObject, training.realmGet$_int(), false);
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w7 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Training.class), false, Collections.emptyList());
        w7 w7Var = new w7();
        cVar.a();
        return w7Var;
    }

    static Training l(o0 o0Var, a aVar, Training training, Training training2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Training.class), set);
        osObjectBuilder.T0(aVar.f18403e, Float.valueOf(training2.realmGet$con()));
        osObjectBuilder.T0(aVar.f18404f, Float.valueOf(training2.realmGet$str()));
        osObjectBuilder.T0(aVar.f18405g, Float.valueOf(training2.realmGet$per()));
        osObjectBuilder.T0(aVar.f18406h, Float.valueOf(training2.realmGet$_int()));
        osObjectBuilder.f1((io.realm.internal.o) training);
        return training;
    }

    public static void n(o0 o0Var, Training training, Training training2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Training.class), training2, training, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18402q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18401p = (a) cVar.c();
        l0<Training> l0Var = new l0<>(this);
        this.f18402q = l0Var;
        l0Var.r(cVar.e());
        this.f18402q.s(cVar.f());
        this.f18402q.o(cVar.b());
        this.f18402q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18402q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w7 w7Var = (w7) obj;
        io.realm.a f10 = this.f18402q.f();
        io.realm.a f11 = w7Var.f18402q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18402q.g().getTable().p();
        String p11 = w7Var.f18402q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18402q.g().getObjectKey() == w7Var.f18402q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18402q.f().getPath();
        String p10 = this.f18402q.g().getTable().p();
        long objectKey = this.f18402q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.Training, io.realm.x7
    public float realmGet$_int() {
        this.f18402q.f().e();
        return this.f18402q.g().getFloat(this.f18401p.f18406h);
    }

    @Override // com.habitrpg.android.habitica.models.user.Training, io.realm.x7
    public float realmGet$con() {
        this.f18402q.f().e();
        return this.f18402q.g().getFloat(this.f18401p.f18403e);
    }

    @Override // com.habitrpg.android.habitica.models.user.Training, io.realm.x7
    public float realmGet$per() {
        this.f18402q.f().e();
        return this.f18402q.g().getFloat(this.f18401p.f18405g);
    }

    @Override // com.habitrpg.android.habitica.models.user.Training, io.realm.x7
    public float realmGet$str() {
        this.f18402q.f().e();
        return this.f18402q.g().getFloat(this.f18401p.f18404f);
    }

    @Override // com.habitrpg.android.habitica.models.user.Training, io.realm.x7
    public void realmSet$_int(float f10) {
        if (this.f18402q.i()) {
            if (!this.f18402q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18402q.g();
            g10.getTable().C(this.f18401p.f18406h, g10.getObjectKey(), f10, true);
            return;
        }
        this.f18402q.f().e();
        this.f18402q.g().setFloat(this.f18401p.f18406h, f10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Training, io.realm.x7
    public void realmSet$con(float f10) {
        if (this.f18402q.i()) {
            if (!this.f18402q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18402q.g();
            g10.getTable().C(this.f18401p.f18403e, g10.getObjectKey(), f10, true);
            return;
        }
        this.f18402q.f().e();
        this.f18402q.g().setFloat(this.f18401p.f18403e, f10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Training, io.realm.x7
    public void realmSet$per(float f10) {
        if (this.f18402q.i()) {
            if (!this.f18402q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18402q.g();
            g10.getTable().C(this.f18401p.f18405g, g10.getObjectKey(), f10, true);
            return;
        }
        this.f18402q.f().e();
        this.f18402q.g().setFloat(this.f18401p.f18405g, f10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Training, io.realm.x7
    public void realmSet$str(float f10) {
        if (this.f18402q.i()) {
            if (!this.f18402q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18402q.g();
            g10.getTable().C(this.f18401p.f18404f, g10.getObjectKey(), f10, true);
            return;
        }
        this.f18402q.f().e();
        this.f18402q.g().setFloat(this.f18401p.f18404f, f10);
    }

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "Training = proxy[{con:" + realmGet$con() + "},{str:" + realmGet$str() + "},{per:" + realmGet$per() + "},{_int:" + realmGet$_int() + "}]";
    }
}
