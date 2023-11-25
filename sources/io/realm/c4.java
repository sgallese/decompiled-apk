package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.invitations.PartyInvite;
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

/* compiled from: com_habitrpg_android_habitica_models_invitations_PartyInviteRealmProxy.java */
/* loaded from: classes4.dex */
public class c4 extends PartyInvite implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17361r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17362p;

    /* renamed from: q  reason: collision with root package name */
    private l0<PartyInvite> f17363q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_invitations_PartyInviteRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17364e;

        /* renamed from: f  reason: collision with root package name */
        long f17365f;

        /* renamed from: g  reason: collision with root package name */
        long f17366g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("PartyInvite");
            this.f17364e = a("id", "id", b10);
            this.f17365f = a(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, b10);
            this.f17366g = a("inviter", "inviter", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17364e = aVar.f17364e;
            aVar2.f17365f = aVar.f17365f;
            aVar2.f17366g = aVar.f17366g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c4() {
        this.f17363q.p();
    }

    public static PartyInvite c(o0 o0Var, a aVar, PartyInvite partyInvite, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(partyInvite);
        if (oVar != null) {
            return (PartyInvite) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(PartyInvite.class), set);
        osObjectBuilder.c1(aVar.f17364e, partyInvite.realmGet$id());
        osObjectBuilder.c1(aVar.f17365f, partyInvite.realmGet$name());
        osObjectBuilder.c1(aVar.f17366g, partyInvite.realmGet$inviter());
        c4 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(partyInvite, k10);
        return k10;
    }

    public static PartyInvite d(o0 o0Var, a aVar, PartyInvite partyInvite, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((partyInvite instanceof io.realm.internal.o) && !d1.isFrozen(partyInvite)) {
            io.realm.internal.o oVar = (io.realm.internal.o) partyInvite;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return partyInvite;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(partyInvite);
        if (oVar2 != null) {
            return (PartyInvite) oVar2;
        }
        return c(o0Var, aVar, partyInvite, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static PartyInvite f(PartyInvite partyInvite, int i10, int i11, Map<a1, o.a<a1>> map) {
        PartyInvite partyInvite2;
        if (i10 <= i11 && partyInvite != null) {
            o.a<a1> aVar = map.get(partyInvite);
            if (aVar == null) {
                partyInvite2 = new PartyInvite();
                map.put(partyInvite, new o.a<>(i10, partyInvite2));
            } else if (i10 >= aVar.f17831a) {
                return (PartyInvite) aVar.f17832b;
            } else {
                PartyInvite partyInvite3 = (PartyInvite) aVar.f17832b;
                aVar.f17831a = i10;
                partyInvite2 = partyInvite3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) partyInvite).b().f();
            partyInvite2.realmSet$id(partyInvite.realmGet$id());
            partyInvite2.realmSet$name(partyInvite.realmGet$name());
            partyInvite2.realmSet$inviter(partyInvite.realmGet$inviter());
            return partyInvite2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "PartyInvite", true, 3, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, false, false, false);
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.NAME, realmFieldType, false, false, false);
        bVar.b("", "inviter", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17361r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, PartyInvite partyInvite, Map<a1, Long> map) {
        if ((partyInvite instanceof io.realm.internal.o) && !d1.isFrozen(partyInvite)) {
            io.realm.internal.o oVar = (io.realm.internal.o) partyInvite;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(PartyInvite.class).getNativePtr();
        a aVar = (a) o0Var.R().e(PartyInvite.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(partyInvite, Long.valueOf(createEmbeddedObject));
        String realmGet$id = partyInvite.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, aVar.f17364e, createEmbeddedObject, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17364e, createEmbeddedObject, false);
        }
        String realmGet$name = partyInvite.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.f17365f, createEmbeddedObject, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17365f, createEmbeddedObject, false);
        }
        String realmGet$inviter = partyInvite.realmGet$inviter();
        if (realmGet$inviter != null) {
            Table.nativeSetString(nativePtr, aVar.f17366g, createEmbeddedObject, realmGet$inviter, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17366g, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c4 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(PartyInvite.class), false, Collections.emptyList());
        c4 c4Var = new c4();
        cVar.a();
        return c4Var;
    }

    static PartyInvite l(o0 o0Var, a aVar, PartyInvite partyInvite, PartyInvite partyInvite2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(PartyInvite.class), set);
        osObjectBuilder.c1(aVar.f17364e, partyInvite2.realmGet$id());
        osObjectBuilder.c1(aVar.f17365f, partyInvite2.realmGet$name());
        osObjectBuilder.c1(aVar.f17366g, partyInvite2.realmGet$inviter());
        osObjectBuilder.f1((io.realm.internal.o) partyInvite);
        return partyInvite;
    }

    public static void n(o0 o0Var, PartyInvite partyInvite, PartyInvite partyInvite2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(PartyInvite.class), partyInvite2, partyInvite, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17363q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17362p = (a) cVar.c();
        l0<PartyInvite> l0Var = new l0<>(this);
        this.f17363q = l0Var;
        l0Var.r(cVar.e());
        this.f17363q.s(cVar.f());
        this.f17363q.o(cVar.b());
        this.f17363q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17363q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c4 c4Var = (c4) obj;
        io.realm.a f10 = this.f17363q.f();
        io.realm.a f11 = c4Var.f17363q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17363q.g().getTable().p();
        String p11 = c4Var.f17363q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17363q.g().getObjectKey() == c4Var.f17363q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17363q.f().getPath();
        String p10 = this.f17363q.g().getTable().p();
        long objectKey = this.f17363q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.invitations.PartyInvite, io.realm.d4
    public String realmGet$id() {
        this.f17363q.f().e();
        return this.f17363q.g().getString(this.f17362p.f17364e);
    }

    @Override // com.habitrpg.android.habitica.models.invitations.PartyInvite, io.realm.d4
    public String realmGet$inviter() {
        this.f17363q.f().e();
        return this.f17363q.g().getString(this.f17362p.f17366g);
    }

    @Override // com.habitrpg.android.habitica.models.invitations.PartyInvite, io.realm.d4
    public String realmGet$name() {
        this.f17363q.f().e();
        return this.f17363q.g().getString(this.f17362p.f17365f);
    }

    @Override // com.habitrpg.android.habitica.models.invitations.PartyInvite, io.realm.d4
    public void realmSet$id(String str) {
        if (this.f17363q.i()) {
            if (!this.f17363q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17363q.g();
            if (str == null) {
                g10.getTable().F(this.f17362p.f17364e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17362p.f17364e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17363q.f().e();
        if (str == null) {
            this.f17363q.g().setNull(this.f17362p.f17364e);
        } else {
            this.f17363q.g().setString(this.f17362p.f17364e, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.invitations.PartyInvite, io.realm.d4
    public void realmSet$inviter(String str) {
        if (this.f17363q.i()) {
            if (!this.f17363q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17363q.g();
            if (str == null) {
                g10.getTable().F(this.f17362p.f17366g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17362p.f17366g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17363q.f().e();
        if (str == null) {
            this.f17363q.g().setNull(this.f17362p.f17366g);
        } else {
            this.f17363q.g().setString(this.f17362p.f17366g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.invitations.PartyInvite, io.realm.d4
    public void realmSet$name(String str) {
        if (this.f17363q.i()) {
            if (!this.f17363q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17363q.g();
            if (str == null) {
                g10.getTable().F(this.f17362p.f17365f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17362p.f17365f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17363q.f().e();
        if (str == null) {
            this.f17363q.g().setNull(this.f17362p.f17365f);
        } else {
            this.f17363q.g().setString(this.f17362p.f17365f, str);
        }
    }

    public String toString() {
        String str;
        String str2;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("PartyInvite = proxy[");
        sb2.append("{id:");
        String str3 = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{name:");
        if (realmGet$name() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$name();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{inviter:");
        if (realmGet$inviter() != null) {
            str3 = realmGet$inviter();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
