package io.realm;

import com.habitrpg.android.habitica.models.social.ChallengeMembership;
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

/* compiled from: com_habitrpg_android_habitica_models_social_ChallengeMembershipRealmProxy.java */
/* loaded from: classes4.dex */
public class o4 extends ChallengeMembership implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18044r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18045p;

    /* renamed from: q  reason: collision with root package name */
    private l0<ChallengeMembership> f18046q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_social_ChallengeMembershipRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18047e;

        /* renamed from: f  reason: collision with root package name */
        long f18048f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("ChallengeMembership");
            this.f18047e = a("userID", "userID", b10);
            this.f18048f = a("challengeID", "challengeID", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18047e = aVar.f18047e;
            aVar2.f18048f = aVar.f18048f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o4() {
        this.f18046q.p();
    }

    public static ChallengeMembership c(o0 o0Var, a aVar, ChallengeMembership challengeMembership, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(challengeMembership);
        if (oVar != null) {
            return (ChallengeMembership) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ChallengeMembership.class), set);
        osObjectBuilder.c1(aVar.f18047e, challengeMembership.realmGet$userID());
        osObjectBuilder.c1(aVar.f18048f, challengeMembership.realmGet$challengeID());
        o4 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(challengeMembership, k10);
        return k10;
    }

    public static ChallengeMembership d(o0 o0Var, a aVar, ChallengeMembership challengeMembership, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((challengeMembership instanceof io.realm.internal.o) && !d1.isFrozen(challengeMembership)) {
            io.realm.internal.o oVar = (io.realm.internal.o) challengeMembership;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return challengeMembership;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(challengeMembership);
        if (oVar2 != null) {
            return (ChallengeMembership) oVar2;
        }
        return c(o0Var, aVar, challengeMembership, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ChallengeMembership f(ChallengeMembership challengeMembership, int i10, int i11, Map<a1, o.a<a1>> map) {
        ChallengeMembership challengeMembership2;
        if (i10 <= i11 && challengeMembership != null) {
            o.a<a1> aVar = map.get(challengeMembership);
            if (aVar == null) {
                challengeMembership2 = new ChallengeMembership();
                map.put(challengeMembership, new o.a<>(i10, challengeMembership2));
            } else if (i10 >= aVar.f17831a) {
                return (ChallengeMembership) aVar.f17832b;
            } else {
                ChallengeMembership challengeMembership3 = (ChallengeMembership) aVar.f17832b;
                aVar.f17831a = i10;
                challengeMembership2 = challengeMembership3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) challengeMembership).b().f();
            challengeMembership2.realmSet$userID(challengeMembership.realmGet$userID());
            challengeMembership2.realmSet$challengeID(challengeMembership.realmGet$challengeID());
            return challengeMembership2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ChallengeMembership", true, 2, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "userID", realmFieldType, false, false, true);
        bVar.b("", "challengeID", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18044r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, ChallengeMembership challengeMembership, Map<a1, Long> map) {
        if ((challengeMembership instanceof io.realm.internal.o) && !d1.isFrozen(challengeMembership)) {
            io.realm.internal.o oVar = (io.realm.internal.o) challengeMembership;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(ChallengeMembership.class).getNativePtr();
        a aVar = (a) o0Var.R().e(ChallengeMembership.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(challengeMembership, Long.valueOf(createEmbeddedObject));
        String realmGet$userID = challengeMembership.realmGet$userID();
        if (realmGet$userID != null) {
            Table.nativeSetString(nativePtr, aVar.f18047e, createEmbeddedObject, realmGet$userID, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18047e, createEmbeddedObject, false);
        }
        String realmGet$challengeID = challengeMembership.realmGet$challengeID();
        if (realmGet$challengeID != null) {
            Table.nativeSetString(nativePtr, aVar.f18048f, createEmbeddedObject, realmGet$challengeID, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18048f, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o4 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(ChallengeMembership.class), false, Collections.emptyList());
        o4 o4Var = new o4();
        cVar.a();
        return o4Var;
    }

    static ChallengeMembership l(o0 o0Var, a aVar, ChallengeMembership challengeMembership, ChallengeMembership challengeMembership2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ChallengeMembership.class), set);
        osObjectBuilder.c1(aVar.f18047e, challengeMembership2.realmGet$userID());
        osObjectBuilder.c1(aVar.f18048f, challengeMembership2.realmGet$challengeID());
        osObjectBuilder.f1((io.realm.internal.o) challengeMembership);
        return challengeMembership;
    }

    public static void n(o0 o0Var, ChallengeMembership challengeMembership, ChallengeMembership challengeMembership2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(ChallengeMembership.class), challengeMembership2, challengeMembership, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18046q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18045p = (a) cVar.c();
        l0<ChallengeMembership> l0Var = new l0<>(this);
        this.f18046q = l0Var;
        l0Var.r(cVar.e());
        this.f18046q.s(cVar.f());
        this.f18046q.o(cVar.b());
        this.f18046q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18046q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o4 o4Var = (o4) obj;
        io.realm.a f10 = this.f18046q.f();
        io.realm.a f11 = o4Var.f18046q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18046q.g().getTable().p();
        String p11 = o4Var.f18046q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18046q.g().getObjectKey() == o4Var.f18046q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18046q.f().getPath();
        String p10 = this.f18046q.g().getTable().p();
        long objectKey = this.f18046q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.social.ChallengeMembership, io.realm.p4
    public String realmGet$challengeID() {
        this.f18046q.f().e();
        return this.f18046q.g().getString(this.f18045p.f18048f);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChallengeMembership, io.realm.p4
    public String realmGet$userID() {
        this.f18046q.f().e();
        return this.f18046q.g().getString(this.f18045p.f18047e);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChallengeMembership, io.realm.p4
    public void realmSet$challengeID(String str) {
        if (this.f18046q.i()) {
            if (!this.f18046q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18046q.g();
            if (str != null) {
                g10.getTable().G(this.f18045p.f18048f, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'challengeID' to null.");
        }
        this.f18046q.f().e();
        if (str != null) {
            this.f18046q.g().setString(this.f18045p.f18048f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'challengeID' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.social.ChallengeMembership, io.realm.p4
    public void realmSet$userID(String str) {
        if (this.f18046q.i()) {
            if (!this.f18046q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18046q.g();
            if (str != null) {
                g10.getTable().G(this.f18045p.f18047e, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'userID' to null.");
        }
        this.f18046q.f().e();
        if (str != null) {
            this.f18046q.g().setString(this.f18045p.f18047e, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'userID' to null.");
    }

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "ChallengeMembership = proxy[{userID:" + realmGet$userID() + "},{challengeID:" + realmGet$challengeID() + "}]";
    }
}
