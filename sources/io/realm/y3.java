package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.invitations.GuildInvite;
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

/* compiled from: com_habitrpg_android_habitica_models_invitations_GuildInviteRealmProxy.java */
/* loaded from: classes4.dex */
public class y3 extends GuildInvite implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18439r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18440p;

    /* renamed from: q  reason: collision with root package name */
    private l0<GuildInvite> f18441q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_invitations_GuildInviteRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18442e;

        /* renamed from: f  reason: collision with root package name */
        long f18443f;

        /* renamed from: g  reason: collision with root package name */
        long f18444g;

        /* renamed from: h  reason: collision with root package name */
        long f18445h;

        a(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("GuildInvite");
            this.f18442e = a("id", "id", b10);
            this.f18443f = a("inviter", "inviter", b10);
            this.f18444g = a(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, b10);
            this.f18445h = a("publicGuild", "publicGuild", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18442e = aVar.f18442e;
            aVar2.f18443f = aVar.f18443f;
            aVar2.f18444g = aVar.f18444g;
            aVar2.f18445h = aVar.f18445h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y3() {
        this.f18441q.p();
    }

    public static GuildInvite c(o0 o0Var, a aVar, GuildInvite guildInvite, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(guildInvite);
        if (oVar != null) {
            return (GuildInvite) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(GuildInvite.class), set);
        osObjectBuilder.c1(aVar.f18442e, guildInvite.realmGet$id());
        osObjectBuilder.c1(aVar.f18443f, guildInvite.realmGet$inviter());
        osObjectBuilder.c1(aVar.f18444g, guildInvite.realmGet$name());
        osObjectBuilder.F0(aVar.f18445h, guildInvite.realmGet$publicGuild());
        y3 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(guildInvite, k10);
        return k10;
    }

    public static GuildInvite d(o0 o0Var, a aVar, GuildInvite guildInvite, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((guildInvite instanceof io.realm.internal.o) && !d1.isFrozen(guildInvite)) {
            io.realm.internal.o oVar = (io.realm.internal.o) guildInvite;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return guildInvite;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(guildInvite);
        if (oVar2 != null) {
            return (GuildInvite) oVar2;
        }
        return c(o0Var, aVar, guildInvite, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static GuildInvite f(GuildInvite guildInvite, int i10, int i11, Map<a1, o.a<a1>> map) {
        GuildInvite guildInvite2;
        if (i10 <= i11 && guildInvite != null) {
            o.a<a1> aVar = map.get(guildInvite);
            if (aVar == null) {
                guildInvite2 = new GuildInvite();
                map.put(guildInvite, new o.a<>(i10, guildInvite2));
            } else if (i10 >= aVar.f17831a) {
                return (GuildInvite) aVar.f17832b;
            } else {
                GuildInvite guildInvite3 = (GuildInvite) aVar.f17832b;
                aVar.f17831a = i10;
                guildInvite2 = guildInvite3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) guildInvite).b().f();
            guildInvite2.realmSet$id(guildInvite.realmGet$id());
            guildInvite2.realmSet$inviter(guildInvite.realmGet$inviter());
            guildInvite2.realmSet$name(guildInvite.realmGet$name());
            guildInvite2.realmSet$publicGuild(guildInvite.realmGet$publicGuild());
            return guildInvite2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "GuildInvite", true, 4, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, false, false, false);
        bVar.b("", "inviter", realmFieldType, false, false, false);
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.NAME, realmFieldType, false, false, false);
        bVar.b("", "publicGuild", RealmFieldType.BOOLEAN, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18439r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, GuildInvite guildInvite, Map<a1, Long> map) {
        if ((guildInvite instanceof io.realm.internal.o) && !d1.isFrozen(guildInvite)) {
            io.realm.internal.o oVar = (io.realm.internal.o) guildInvite;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(GuildInvite.class).getNativePtr();
        a aVar = (a) o0Var.R().e(GuildInvite.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(guildInvite, Long.valueOf(createEmbeddedObject));
        String realmGet$id = guildInvite.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, aVar.f18442e, createEmbeddedObject, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18442e, createEmbeddedObject, false);
        }
        String realmGet$inviter = guildInvite.realmGet$inviter();
        if (realmGet$inviter != null) {
            Table.nativeSetString(nativePtr, aVar.f18443f, createEmbeddedObject, realmGet$inviter, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18443f, createEmbeddedObject, false);
        }
        String realmGet$name = guildInvite.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.f18444g, createEmbeddedObject, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18444g, createEmbeddedObject, false);
        }
        Boolean realmGet$publicGuild = guildInvite.realmGet$publicGuild();
        if (realmGet$publicGuild != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f18445h, createEmbeddedObject, realmGet$publicGuild.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18445h, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y3 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(GuildInvite.class), false, Collections.emptyList());
        y3 y3Var = new y3();
        cVar.a();
        return y3Var;
    }

    static GuildInvite l(o0 o0Var, a aVar, GuildInvite guildInvite, GuildInvite guildInvite2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(GuildInvite.class), set);
        osObjectBuilder.c1(aVar.f18442e, guildInvite2.realmGet$id());
        osObjectBuilder.c1(aVar.f18443f, guildInvite2.realmGet$inviter());
        osObjectBuilder.c1(aVar.f18444g, guildInvite2.realmGet$name());
        osObjectBuilder.F0(aVar.f18445h, guildInvite2.realmGet$publicGuild());
        osObjectBuilder.f1((io.realm.internal.o) guildInvite);
        return guildInvite;
    }

    public static void n(o0 o0Var, GuildInvite guildInvite, GuildInvite guildInvite2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(GuildInvite.class), guildInvite2, guildInvite, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18441q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18440p = (a) cVar.c();
        l0<GuildInvite> l0Var = new l0<>(this);
        this.f18441q = l0Var;
        l0Var.r(cVar.e());
        this.f18441q.s(cVar.f());
        this.f18441q.o(cVar.b());
        this.f18441q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18441q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y3 y3Var = (y3) obj;
        io.realm.a f10 = this.f18441q.f();
        io.realm.a f11 = y3Var.f18441q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18441q.g().getTable().p();
        String p11 = y3Var.f18441q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18441q.g().getObjectKey() == y3Var.f18441q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18441q.f().getPath();
        String p10 = this.f18441q.g().getTable().p();
        long objectKey = this.f18441q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.invitations.GuildInvite, io.realm.z3
    public String realmGet$id() {
        this.f18441q.f().e();
        return this.f18441q.g().getString(this.f18440p.f18442e);
    }

    @Override // com.habitrpg.android.habitica.models.invitations.GuildInvite, io.realm.z3
    public String realmGet$inviter() {
        this.f18441q.f().e();
        return this.f18441q.g().getString(this.f18440p.f18443f);
    }

    @Override // com.habitrpg.android.habitica.models.invitations.GuildInvite, io.realm.z3
    public String realmGet$name() {
        this.f18441q.f().e();
        return this.f18441q.g().getString(this.f18440p.f18444g);
    }

    @Override // com.habitrpg.android.habitica.models.invitations.GuildInvite, io.realm.z3
    public Boolean realmGet$publicGuild() {
        this.f18441q.f().e();
        if (this.f18441q.g().isNull(this.f18440p.f18445h)) {
            return null;
        }
        return Boolean.valueOf(this.f18441q.g().getBoolean(this.f18440p.f18445h));
    }

    @Override // com.habitrpg.android.habitica.models.invitations.GuildInvite, io.realm.z3
    public void realmSet$id(String str) {
        if (this.f18441q.i()) {
            if (!this.f18441q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18441q.g();
            if (str == null) {
                g10.getTable().F(this.f18440p.f18442e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18440p.f18442e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18441q.f().e();
        if (str == null) {
            this.f18441q.g().setNull(this.f18440p.f18442e);
        } else {
            this.f18441q.g().setString(this.f18440p.f18442e, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.invitations.GuildInvite, io.realm.z3
    public void realmSet$inviter(String str) {
        if (this.f18441q.i()) {
            if (!this.f18441q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18441q.g();
            if (str == null) {
                g10.getTable().F(this.f18440p.f18443f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18440p.f18443f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18441q.f().e();
        if (str == null) {
            this.f18441q.g().setNull(this.f18440p.f18443f);
        } else {
            this.f18441q.g().setString(this.f18440p.f18443f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.invitations.GuildInvite, io.realm.z3
    public void realmSet$name(String str) {
        if (this.f18441q.i()) {
            if (!this.f18441q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18441q.g();
            if (str == null) {
                g10.getTable().F(this.f18440p.f18444g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18440p.f18444g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18441q.f().e();
        if (str == null) {
            this.f18441q.g().setNull(this.f18440p.f18444g);
        } else {
            this.f18441q.g().setString(this.f18440p.f18444g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.invitations.GuildInvite, io.realm.z3
    public void realmSet$publicGuild(Boolean bool) {
        if (this.f18441q.i()) {
            if (!this.f18441q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18441q.g();
            if (bool == null) {
                g10.getTable().F(this.f18440p.f18445h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f18440p.f18445h, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f18441q.f().e();
        if (bool == null) {
            this.f18441q.g().setNull(this.f18440p.f18445h);
        } else {
            this.f18441q.g().setBoolean(this.f18440p.f18445h, bool.booleanValue());
        }
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("GuildInvite = proxy[");
        sb2.append("{id:");
        Object obj = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{inviter:");
        if (realmGet$inviter() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$inviter();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{name:");
        if (realmGet$name() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$name();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{publicGuild:");
        if (realmGet$publicGuild() != null) {
            obj = realmGet$publicGuild();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
