package io.realm;

import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.social.UserParty;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.u3;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_social_UserPartyRealmProxy.java */
/* loaded from: classes4.dex */
public class e5 extends UserParty implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17484r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17485p;

    /* renamed from: q  reason: collision with root package name */
    private l0<UserParty> f17486q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_social_UserPartyRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17487e;

        /* renamed from: f  reason: collision with root package name */
        long f17488f;

        /* renamed from: g  reason: collision with root package name */
        long f17489g;

        /* renamed from: h  reason: collision with root package name */
        long f17490h;

        /* renamed from: i  reason: collision with root package name */
        long f17491i;

        a(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("UserParty");
            this.f17487e = a("id", "id", b10);
            this.f17488f = a("quest", "quest", b10);
            this.f17489g = a("seeking", "seeking", b10);
            this.f17490h = a("partyOrder", "partyOrder", b10);
            this.f17491i = a("orderAscending", "orderAscending", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17487e = aVar.f17487e;
            aVar2.f17488f = aVar.f17488f;
            aVar2.f17489g = aVar.f17489g;
            aVar2.f17490h = aVar.f17490h;
            aVar2.f17491i = aVar.f17491i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e5() {
        this.f17486q.p();
    }

    public static UserParty c(o0 o0Var, a aVar, UserParty userParty, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(userParty);
        if (oVar != null) {
            return (UserParty) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(UserParty.class), set);
        osObjectBuilder.c1(aVar.f17487e, userParty.realmGet$id());
        osObjectBuilder.I0(aVar.f17489g, userParty.realmGet$seeking());
        osObjectBuilder.c1(aVar.f17490h, userParty.realmGet$partyOrder());
        osObjectBuilder.c1(aVar.f17491i, userParty.realmGet$orderAscending());
        e5 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(userParty, k10);
        Quest realmGet$quest = userParty.realmGet$quest();
        if (realmGet$quest == null) {
            k10.realmSet$quest(null);
        } else {
            Quest quest = (Quest) map.get(realmGet$quest);
            if (quest != null) {
                k10.realmSet$quest(quest);
            } else {
                k10.realmSet$quest(u3.d(o0Var, (u3.a) o0Var.R().e(Quest.class), realmGet$quest, z10, map, set));
            }
        }
        return k10;
    }

    public static UserParty d(o0 o0Var, a aVar, UserParty userParty, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((userParty instanceof io.realm.internal.o) && !d1.isFrozen(userParty)) {
            io.realm.internal.o oVar = (io.realm.internal.o) userParty;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return userParty;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(userParty);
        if (oVar2 != null) {
            return (UserParty) oVar2;
        }
        return c(o0Var, aVar, userParty, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static UserParty f(UserParty userParty, int i10, int i11, Map<a1, o.a<a1>> map) {
        UserParty userParty2;
        if (i10 <= i11 && userParty != null) {
            o.a<a1> aVar = map.get(userParty);
            if (aVar == null) {
                userParty2 = new UserParty();
                map.put(userParty, new o.a<>(i10, userParty2));
            } else if (i10 >= aVar.f17831a) {
                return (UserParty) aVar.f17832b;
            } else {
                UserParty userParty3 = (UserParty) aVar.f17832b;
                aVar.f17831a = i10;
                userParty2 = userParty3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) userParty).b().f();
            userParty2.realmSet$id(userParty.realmGet$id());
            userParty2.realmSet$quest(u3.f(userParty.realmGet$quest(), i10 + 1, i11, map));
            userParty2.realmSet$seeking(userParty.realmGet$seeking());
            userParty2.realmSet$partyOrder(userParty.realmGet$partyOrder());
            userParty2.realmSet$orderAscending(userParty.realmGet$orderAscending());
            return userParty2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "UserParty", true, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, false, false, true);
        bVar.a("", "quest", RealmFieldType.OBJECT, "Quest");
        bVar.b("", "seeking", RealmFieldType.DATE, false, false, false);
        bVar.b("", "partyOrder", realmFieldType, false, false, false);
        bVar.b("", "orderAscending", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17484r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, UserParty userParty, Map<a1, Long> map) {
        if ((userParty instanceof io.realm.internal.o) && !d1.isFrozen(userParty)) {
            io.realm.internal.o oVar = (io.realm.internal.o) userParty;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(UserParty.class).getNativePtr();
        a aVar = (a) o0Var.R().e(UserParty.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(userParty, Long.valueOf(createEmbeddedObject));
        String realmGet$id = userParty.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, aVar.f17487e, createEmbeddedObject, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17487e, createEmbeddedObject, false);
        }
        Quest realmGet$quest = userParty.realmGet$quest();
        if (realmGet$quest != null) {
            Long l10 = map.get(realmGet$quest);
            if (l10 == null) {
                l10 = Long.valueOf(u3.i(o0Var, realmGet$quest, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f17488f, createEmbeddedObject, l10.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17488f, createEmbeddedObject);
        }
        Date realmGet$seeking = userParty.realmGet$seeking();
        if (realmGet$seeking != null) {
            Table.nativeSetTimestamp(nativePtr, aVar.f17489g, createEmbeddedObject, realmGet$seeking.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17489g, createEmbeddedObject, false);
        }
        String realmGet$partyOrder = userParty.realmGet$partyOrder();
        if (realmGet$partyOrder != null) {
            Table.nativeSetString(nativePtr, aVar.f17490h, createEmbeddedObject, realmGet$partyOrder, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17490h, createEmbeddedObject, false);
        }
        String realmGet$orderAscending = userParty.realmGet$orderAscending();
        if (realmGet$orderAscending != null) {
            Table.nativeSetString(nativePtr, aVar.f17491i, createEmbeddedObject, realmGet$orderAscending, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17491i, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e5 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(UserParty.class), false, Collections.emptyList());
        e5 e5Var = new e5();
        cVar.a();
        return e5Var;
    }

    static UserParty l(o0 o0Var, a aVar, UserParty userParty, UserParty userParty2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(UserParty.class), set);
        osObjectBuilder.c1(aVar.f17487e, userParty2.realmGet$id());
        Quest realmGet$quest = userParty2.realmGet$quest();
        if (realmGet$quest == null) {
            osObjectBuilder.Z0(aVar.f17488f);
        } else {
            Quest quest = (Quest) map.get(realmGet$quest);
            if (quest != null) {
                osObjectBuilder.a1(aVar.f17488f, quest);
            } else {
                osObjectBuilder.a1(aVar.f17488f, u3.d(o0Var, (u3.a) o0Var.R().e(Quest.class), realmGet$quest, true, map, set));
            }
        }
        osObjectBuilder.I0(aVar.f17489g, userParty2.realmGet$seeking());
        osObjectBuilder.c1(aVar.f17490h, userParty2.realmGet$partyOrder());
        osObjectBuilder.c1(aVar.f17491i, userParty2.realmGet$orderAscending());
        osObjectBuilder.f1((io.realm.internal.o) userParty);
        return userParty;
    }

    public static void n(o0 o0Var, UserParty userParty, UserParty userParty2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(UserParty.class), userParty2, userParty, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17486q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17485p = (a) cVar.c();
        l0<UserParty> l0Var = new l0<>(this);
        this.f17486q = l0Var;
        l0Var.r(cVar.e());
        this.f17486q.s(cVar.f());
        this.f17486q.o(cVar.b());
        this.f17486q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17486q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e5 e5Var = (e5) obj;
        io.realm.a f10 = this.f17486q.f();
        io.realm.a f11 = e5Var.f17486q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17486q.g().getTable().p();
        String p11 = e5Var.f17486q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17486q.g().getObjectKey() == e5Var.f17486q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17486q.f().getPath();
        String p10 = this.f17486q.g().getTable().p();
        long objectKey = this.f17486q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.social.UserParty, io.realm.f5
    public String realmGet$id() {
        this.f17486q.f().e();
        return this.f17486q.g().getString(this.f17485p.f17487e);
    }

    @Override // com.habitrpg.android.habitica.models.social.UserParty, io.realm.f5
    public String realmGet$orderAscending() {
        this.f17486q.f().e();
        return this.f17486q.g().getString(this.f17485p.f17491i);
    }

    @Override // com.habitrpg.android.habitica.models.social.UserParty, io.realm.f5
    public String realmGet$partyOrder() {
        this.f17486q.f().e();
        return this.f17486q.g().getString(this.f17485p.f17490h);
    }

    @Override // com.habitrpg.android.habitica.models.social.UserParty, io.realm.f5
    public Quest realmGet$quest() {
        this.f17486q.f().e();
        if (this.f17486q.g().isNullLink(this.f17485p.f17488f)) {
            return null;
        }
        return (Quest) this.f17486q.f().B(Quest.class, this.f17486q.g().getLink(this.f17485p.f17488f), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.social.UserParty, io.realm.f5
    public Date realmGet$seeking() {
        this.f17486q.f().e();
        if (this.f17486q.g().isNull(this.f17485p.f17489g)) {
            return null;
        }
        return this.f17486q.g().getDate(this.f17485p.f17489g);
    }

    @Override // com.habitrpg.android.habitica.models.social.UserParty, io.realm.f5
    public void realmSet$id(String str) {
        if (this.f17486q.i()) {
            if (!this.f17486q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17486q.g();
            if (str != null) {
                g10.getTable().G(this.f17485p.f17487e, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
        }
        this.f17486q.f().e();
        if (str != null) {
            this.f17486q.g().setString(this.f17485p.f17487e, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.social.UserParty, io.realm.f5
    public void realmSet$orderAscending(String str) {
        if (this.f17486q.i()) {
            if (!this.f17486q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17486q.g();
            if (str == null) {
                g10.getTable().F(this.f17485p.f17491i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17485p.f17491i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17486q.f().e();
        if (str == null) {
            this.f17486q.g().setNull(this.f17485p.f17491i);
        } else {
            this.f17486q.g().setString(this.f17485p.f17491i, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.UserParty, io.realm.f5
    public void realmSet$partyOrder(String str) {
        if (this.f17486q.i()) {
            if (!this.f17486q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17486q.g();
            if (str == null) {
                g10.getTable().F(this.f17485p.f17490h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17485p.f17490h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17486q.f().e();
        if (str == null) {
            this.f17486q.g().setNull(this.f17485p.f17490h);
        } else {
            this.f17486q.g().setString(this.f17485p.f17490h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.UserParty, io.realm.f5
    public void realmSet$quest(Quest quest) {
        o0 o0Var = (o0) this.f17486q.f();
        if (this.f17486q.i()) {
            if (!this.f17486q.d() || this.f17486q.e().contains("quest")) {
                return;
            }
            if (quest != null && !d1.isManaged(quest)) {
                quest = (Quest) o0Var.F0(quest, new v[0]);
            }
            io.realm.internal.q g10 = this.f17486q.g();
            if (quest == null) {
                g10.nullifyLink(this.f17485p.f17488f);
                return;
            }
            this.f17486q.c(quest);
            g10.getTable().D(this.f17485p.f17488f, g10.getObjectKey(), ((io.realm.internal.o) quest).b().g().getObjectKey(), true);
            return;
        }
        this.f17486q.f().e();
        if (quest == null) {
            this.f17486q.g().nullifyLink(this.f17485p.f17488f);
            return;
        }
        this.f17486q.c(quest);
        this.f17486q.g().setLink(this.f17485p.f17488f, ((io.realm.internal.o) quest).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.social.UserParty, io.realm.f5
    public void realmSet$seeking(Date date) {
        if (this.f17486q.i()) {
            if (!this.f17486q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17486q.g();
            if (date == null) {
                g10.getTable().F(this.f17485p.f17489g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f17485p.f17489g, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f17486q.f().e();
        if (date == null) {
            this.f17486q.g().setNull(this.f17485p.f17489g);
        } else {
            this.f17486q.g().setDate(this.f17485p.f17489g, date);
        }
    }

    public String toString() {
        String str;
        Date date;
        String str2;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("UserParty = proxy[");
        sb2.append("{id:");
        sb2.append(realmGet$id());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{quest:");
        String str3 = "null";
        if (realmGet$quest() == null) {
            str = "null";
        } else {
            str = "Quest";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{seeking:");
        if (realmGet$seeking() == null) {
            date = "null";
        } else {
            date = realmGet$seeking();
        }
        sb2.append(date);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{partyOrder:");
        if (realmGet$partyOrder() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$partyOrder();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{orderAscending:");
        if (realmGet$orderAscending() != null) {
            str3 = realmGet$orderAscending();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
