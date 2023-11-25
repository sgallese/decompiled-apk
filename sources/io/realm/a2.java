package io.realm;

import com.habitrpg.android.habitica.models.TutorialStep;
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

/* compiled from: com_habitrpg_android_habitica_models_TutorialStepRealmProxy.java */
/* loaded from: classes4.dex */
public class a2 extends TutorialStep implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17253r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17254p;

    /* renamed from: q  reason: collision with root package name */
    private l0<TutorialStep> f17255q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_TutorialStepRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17256e;

        /* renamed from: f  reason: collision with root package name */
        long f17257f;

        /* renamed from: g  reason: collision with root package name */
        long f17258g;

        /* renamed from: h  reason: collision with root package name */
        long f17259h;

        /* renamed from: i  reason: collision with root package name */
        long f17260i;

        a(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("TutorialStep");
            this.f17256e = a("key", "key", b10);
            this.f17257f = a("tutorialGroup", "tutorialGroup", b10);
            this.f17258g = a("identifier", "identifier", b10);
            this.f17259h = a("wasCompleted", "wasCompleted", b10);
            this.f17260i = a("displayedOn", "displayedOn", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17256e = aVar.f17256e;
            aVar2.f17257f = aVar.f17257f;
            aVar2.f17258g = aVar.f17258g;
            aVar2.f17259h = aVar.f17259h;
            aVar2.f17260i = aVar.f17260i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a2() {
        this.f17255q.p();
    }

    public static TutorialStep c(o0 o0Var, a aVar, TutorialStep tutorialStep, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(tutorialStep);
        if (oVar != null) {
            return (TutorialStep) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(TutorialStep.class), set);
        osObjectBuilder.c1(aVar.f17256e, tutorialStep.realmGet$key());
        osObjectBuilder.c1(aVar.f17257f, tutorialStep.realmGet$tutorialGroup());
        osObjectBuilder.c1(aVar.f17258g, tutorialStep.realmGet$identifier());
        osObjectBuilder.F0(aVar.f17259h, Boolean.valueOf(tutorialStep.realmGet$wasCompleted()));
        osObjectBuilder.I0(aVar.f17260i, tutorialStep.realmGet$displayedOn());
        a2 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(tutorialStep, k10);
        return k10;
    }

    public static TutorialStep d(o0 o0Var, a aVar, TutorialStep tutorialStep, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((tutorialStep instanceof io.realm.internal.o) && !d1.isFrozen(tutorialStep)) {
            io.realm.internal.o oVar = (io.realm.internal.o) tutorialStep;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return tutorialStep;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(tutorialStep);
        if (oVar2 != null) {
            return (TutorialStep) oVar2;
        }
        return c(o0Var, aVar, tutorialStep, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static TutorialStep f(TutorialStep tutorialStep, int i10, int i11, Map<a1, o.a<a1>> map) {
        TutorialStep tutorialStep2;
        if (i10 <= i11 && tutorialStep != null) {
            o.a<a1> aVar = map.get(tutorialStep);
            if (aVar == null) {
                tutorialStep2 = new TutorialStep();
                map.put(tutorialStep, new o.a<>(i10, tutorialStep2));
            } else if (i10 >= aVar.f17831a) {
                return (TutorialStep) aVar.f17832b;
            } else {
                TutorialStep tutorialStep3 = (TutorialStep) aVar.f17832b;
                aVar.f17831a = i10;
                tutorialStep2 = tutorialStep3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) tutorialStep).b().f();
            tutorialStep2.realmSet$key(tutorialStep.realmGet$key());
            tutorialStep2.realmSet$tutorialGroup(tutorialStep.realmGet$tutorialGroup());
            tutorialStep2.realmSet$identifier(tutorialStep.realmGet$identifier());
            tutorialStep2.realmSet$wasCompleted(tutorialStep.realmGet$wasCompleted());
            tutorialStep2.realmSet$displayedOn(tutorialStep.realmGet$displayedOn());
            return tutorialStep2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "TutorialStep", true, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, false, false, false);
        bVar.b("", "tutorialGroup", realmFieldType, false, false, false);
        bVar.b("", "identifier", realmFieldType, false, false, false);
        bVar.b("", "wasCompleted", RealmFieldType.BOOLEAN, false, false, true);
        bVar.b("", "displayedOn", RealmFieldType.DATE, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17253r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, TutorialStep tutorialStep, Map<a1, Long> map) {
        if ((tutorialStep instanceof io.realm.internal.o) && !d1.isFrozen(tutorialStep)) {
            io.realm.internal.o oVar = (io.realm.internal.o) tutorialStep;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(TutorialStep.class).getNativePtr();
        a aVar = (a) o0Var.R().e(TutorialStep.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(tutorialStep, Long.valueOf(createEmbeddedObject));
        String realmGet$key = tutorialStep.realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(nativePtr, aVar.f17256e, createEmbeddedObject, realmGet$key, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17256e, createEmbeddedObject, false);
        }
        String realmGet$tutorialGroup = tutorialStep.realmGet$tutorialGroup();
        if (realmGet$tutorialGroup != null) {
            Table.nativeSetString(nativePtr, aVar.f17257f, createEmbeddedObject, realmGet$tutorialGroup, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17257f, createEmbeddedObject, false);
        }
        String realmGet$identifier = tutorialStep.realmGet$identifier();
        if (realmGet$identifier != null) {
            Table.nativeSetString(nativePtr, aVar.f17258g, createEmbeddedObject, realmGet$identifier, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17258g, createEmbeddedObject, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f17259h, createEmbeddedObject, tutorialStep.realmGet$wasCompleted(), false);
        Date realmGet$displayedOn = tutorialStep.realmGet$displayedOn();
        if (realmGet$displayedOn != null) {
            Table.nativeSetTimestamp(nativePtr, aVar.f17260i, createEmbeddedObject, realmGet$displayedOn.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17260i, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a2 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(TutorialStep.class), false, Collections.emptyList());
        a2 a2Var = new a2();
        cVar.a();
        return a2Var;
    }

    static TutorialStep l(o0 o0Var, a aVar, TutorialStep tutorialStep, TutorialStep tutorialStep2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(TutorialStep.class), set);
        osObjectBuilder.c1(aVar.f17256e, tutorialStep2.realmGet$key());
        osObjectBuilder.c1(aVar.f17257f, tutorialStep2.realmGet$tutorialGroup());
        osObjectBuilder.c1(aVar.f17258g, tutorialStep2.realmGet$identifier());
        osObjectBuilder.F0(aVar.f17259h, Boolean.valueOf(tutorialStep2.realmGet$wasCompleted()));
        osObjectBuilder.I0(aVar.f17260i, tutorialStep2.realmGet$displayedOn());
        osObjectBuilder.f1((io.realm.internal.o) tutorialStep);
        return tutorialStep;
    }

    public static void n(o0 o0Var, TutorialStep tutorialStep, TutorialStep tutorialStep2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(TutorialStep.class), tutorialStep2, tutorialStep, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17255q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17254p = (a) cVar.c();
        l0<TutorialStep> l0Var = new l0<>(this);
        this.f17255q = l0Var;
        l0Var.r(cVar.e());
        this.f17255q.s(cVar.f());
        this.f17255q.o(cVar.b());
        this.f17255q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17255q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a2 a2Var = (a2) obj;
        io.realm.a f10 = this.f17255q.f();
        io.realm.a f11 = a2Var.f17255q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17255q.g().getTable().p();
        String p11 = a2Var.f17255q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17255q.g().getObjectKey() == a2Var.f17255q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17255q.f().getPath();
        String p10 = this.f17255q.g().getTable().p();
        long objectKey = this.f17255q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.TutorialStep, io.realm.b2
    public Date realmGet$displayedOn() {
        this.f17255q.f().e();
        if (this.f17255q.g().isNull(this.f17254p.f17260i)) {
            return null;
        }
        return this.f17255q.g().getDate(this.f17254p.f17260i);
    }

    @Override // com.habitrpg.android.habitica.models.TutorialStep, io.realm.b2
    public String realmGet$identifier() {
        this.f17255q.f().e();
        return this.f17255q.g().getString(this.f17254p.f17258g);
    }

    @Override // com.habitrpg.android.habitica.models.TutorialStep, io.realm.b2
    public String realmGet$key() {
        this.f17255q.f().e();
        return this.f17255q.g().getString(this.f17254p.f17256e);
    }

    @Override // com.habitrpg.android.habitica.models.TutorialStep, io.realm.b2
    public String realmGet$tutorialGroup() {
        this.f17255q.f().e();
        return this.f17255q.g().getString(this.f17254p.f17257f);
    }

    @Override // com.habitrpg.android.habitica.models.TutorialStep, io.realm.b2
    public boolean realmGet$wasCompleted() {
        this.f17255q.f().e();
        return this.f17255q.g().getBoolean(this.f17254p.f17259h);
    }

    @Override // com.habitrpg.android.habitica.models.TutorialStep, io.realm.b2
    public void realmSet$displayedOn(Date date) {
        if (this.f17255q.i()) {
            if (!this.f17255q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17255q.g();
            if (date == null) {
                g10.getTable().F(this.f17254p.f17260i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f17254p.f17260i, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f17255q.f().e();
        if (date == null) {
            this.f17255q.g().setNull(this.f17254p.f17260i);
        } else {
            this.f17255q.g().setDate(this.f17254p.f17260i, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.TutorialStep, io.realm.b2
    public void realmSet$identifier(String str) {
        if (this.f17255q.i()) {
            if (!this.f17255q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17255q.g();
            if (str == null) {
                g10.getTable().F(this.f17254p.f17258g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17254p.f17258g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17255q.f().e();
        if (str == null) {
            this.f17255q.g().setNull(this.f17254p.f17258g);
        } else {
            this.f17255q.g().setString(this.f17254p.f17258g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.TutorialStep, io.realm.b2
    public void realmSet$key(String str) {
        if (this.f17255q.i()) {
            if (!this.f17255q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17255q.g();
            if (str == null) {
                g10.getTable().F(this.f17254p.f17256e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17254p.f17256e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17255q.f().e();
        if (str == null) {
            this.f17255q.g().setNull(this.f17254p.f17256e);
        } else {
            this.f17255q.g().setString(this.f17254p.f17256e, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.TutorialStep, io.realm.b2
    public void realmSet$tutorialGroup(String str) {
        if (this.f17255q.i()) {
            if (!this.f17255q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17255q.g();
            if (str == null) {
                g10.getTable().F(this.f17254p.f17257f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17254p.f17257f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17255q.f().e();
        if (str == null) {
            this.f17255q.g().setNull(this.f17254p.f17257f);
        } else {
            this.f17255q.g().setString(this.f17254p.f17257f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.TutorialStep, io.realm.b2
    public void realmSet$wasCompleted(boolean z10) {
        if (this.f17255q.i()) {
            if (!this.f17255q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17255q.g();
            g10.getTable().z(this.f17254p.f17259h, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17255q.f().e();
        this.f17255q.g().setBoolean(this.f17254p.f17259h, z10);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("TutorialStep = proxy[");
        sb2.append("{key:");
        Object obj = "null";
        if (realmGet$key() == null) {
            str = "null";
        } else {
            str = realmGet$key();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{tutorialGroup:");
        if (realmGet$tutorialGroup() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$tutorialGroup();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{identifier:");
        if (realmGet$identifier() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$identifier();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{wasCompleted:");
        sb2.append(realmGet$wasCompleted());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{displayedOn:");
        if (realmGet$displayedOn() != null) {
            obj = realmGet$displayedOn();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
