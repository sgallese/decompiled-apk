package io.realm;

import com.habitrpg.android.habitica.models.invitations.GuildInvite;
import com.habitrpg.android.habitica.models.invitations.Invitations;
import com.habitrpg.android.habitica.models.invitations.PartyInvite;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import io.realm.a;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_invitations_InvitationsRealmProxy.java */
/* loaded from: classes4.dex */
public class a4 extends Invitations implements io.realm.internal.o {

    /* renamed from: v  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17269v = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17270p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Invitations> f17271q;

    /* renamed from: r  reason: collision with root package name */
    private x0<PartyInvite> f17272r;

    /* renamed from: u  reason: collision with root package name */
    private x0<GuildInvite> f17273u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_invitations_InvitationsRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17274e;

        /* renamed from: f  reason: collision with root package name */
        long f17275f;

        /* renamed from: g  reason: collision with root package name */
        long f17276g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Invitations");
            this.f17274e = a(NavigationDrawerFragment.SIDEBAR_PARTY, NavigationDrawerFragment.SIDEBAR_PARTY, b10);
            this.f17275f = a("parties", "parties", b10);
            this.f17276g = a("guilds", "guilds", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17274e = aVar.f17274e;
            aVar2.f17275f = aVar.f17275f;
            aVar2.f17276g = aVar.f17276g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a4() {
        this.f17271q.p();
    }

    public static Invitations c(o0 o0Var, a aVar, Invitations invitations, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(invitations);
        if (oVar != null) {
            return (Invitations) oVar;
        }
        a4 k10 = k(o0Var, new OsObjectBuilder(o0Var.c1(Invitations.class), set).e1());
        map.put(invitations, k10);
        PartyInvite realmGet$party = invitations.realmGet$party();
        if (realmGet$party == null) {
            k10.realmSet$party(null);
        } else if (((PartyInvite) map.get(realmGet$party)) == null) {
            c4 k11 = c4.k(o0Var, o0Var.c1(PartyInvite.class).s(k10.b().g().createEmbeddedObject(aVar.f17274e, RealmFieldType.OBJECT)));
            map.put(realmGet$party, k11);
            c4.n(o0Var, realmGet$party, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheparty.toString()");
        }
        x0<PartyInvite> realmGet$parties = invitations.realmGet$parties();
        if (realmGet$parties != null) {
            x0<PartyInvite> realmGet$parties2 = k10.realmGet$parties();
            realmGet$parties2.clear();
            for (int i10 = 0; i10 < realmGet$parties.size(); i10++) {
                PartyInvite partyInvite = realmGet$parties.get(i10);
                if (((PartyInvite) map.get(partyInvite)) == null) {
                    c4 k12 = c4.k(o0Var, o0Var.c1(PartyInvite.class).s(realmGet$parties2.m().n()));
                    map.put(partyInvite, k12);
                    c4.n(o0Var, partyInvite, k12, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheparties.toString()");
                }
            }
        }
        x0<GuildInvite> realmGet$guilds = invitations.realmGet$guilds();
        if (realmGet$guilds != null) {
            x0<GuildInvite> realmGet$guilds2 = k10.realmGet$guilds();
            realmGet$guilds2.clear();
            for (int i11 = 0; i11 < realmGet$guilds.size(); i11++) {
                GuildInvite guildInvite = realmGet$guilds.get(i11);
                if (((GuildInvite) map.get(guildInvite)) == null) {
                    y3 k13 = y3.k(o0Var, o0Var.c1(GuildInvite.class).s(realmGet$guilds2.m().n()));
                    map.put(guildInvite, k13);
                    y3.n(o0Var, guildInvite, k13, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheguilds.toString()");
                }
            }
        }
        return k10;
    }

    public static Invitations d(o0 o0Var, a aVar, Invitations invitations, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((invitations instanceof io.realm.internal.o) && !d1.isFrozen(invitations)) {
            io.realm.internal.o oVar = (io.realm.internal.o) invitations;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return invitations;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(invitations);
        if (oVar2 != null) {
            return (Invitations) oVar2;
        }
        return c(o0Var, aVar, invitations, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Invitations f(Invitations invitations, int i10, int i11, Map<a1, o.a<a1>> map) {
        Invitations invitations2;
        if (i10 > i11 || invitations == null) {
            return null;
        }
        o.a<a1> aVar = map.get(invitations);
        if (aVar == null) {
            invitations2 = new Invitations();
            map.put(invitations, new o.a<>(i10, invitations2));
        } else if (i10 >= aVar.f17831a) {
            return (Invitations) aVar.f17832b;
        } else {
            Invitations invitations3 = (Invitations) aVar.f17832b;
            aVar.f17831a = i10;
            invitations2 = invitations3;
        }
        o0 o0Var = (o0) ((io.realm.internal.o) invitations).b().f();
        int i12 = i10 + 1;
        invitations2.realmSet$party(c4.f(invitations.realmGet$party(), i12, i11, map));
        if (i10 == i11) {
            invitations2.realmSet$parties(null);
        } else {
            x0<PartyInvite> realmGet$parties = invitations.realmGet$parties();
            x0<PartyInvite> x0Var = new x0<>();
            invitations2.realmSet$parties(x0Var);
            int size = realmGet$parties.size();
            for (int i13 = 0; i13 < size; i13++) {
                x0Var.add(c4.f(realmGet$parties.get(i13), i12, i11, map));
            }
        }
        if (i10 == i11) {
            invitations2.realmSet$guilds(null);
        } else {
            x0<GuildInvite> realmGet$guilds = invitations.realmGet$guilds();
            x0<GuildInvite> x0Var2 = new x0<>();
            invitations2.realmSet$guilds(x0Var2);
            int size2 = realmGet$guilds.size();
            for (int i14 = 0; i14 < size2; i14++) {
                x0Var2.add(y3.f(realmGet$guilds.get(i14), i12, i11, map));
            }
        }
        return invitations2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Invitations", true, 3, 0);
        bVar.a("", NavigationDrawerFragment.SIDEBAR_PARTY, RealmFieldType.OBJECT, "PartyInvite");
        RealmFieldType realmFieldType = RealmFieldType.LIST;
        bVar.a("", "parties", realmFieldType, "PartyInvite");
        bVar.a("", "guilds", realmFieldType, "GuildInvite");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17269v;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Invitations invitations, Map<a1, Long> map) {
        if ((invitations instanceof io.realm.internal.o) && !d1.isFrozen(invitations)) {
            io.realm.internal.o oVar = (io.realm.internal.o) invitations;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Invitations.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Invitations.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(invitations, Long.valueOf(createEmbeddedObject));
        PartyInvite realmGet$party = invitations.realmGet$party();
        if (realmGet$party != null) {
            Long l10 = map.get(realmGet$party);
            if (l10 == null) {
                c4.i(o0Var, c12, aVar.f17274e, createEmbeddedObject, realmGet$party, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17274e, createEmbeddedObject);
        }
        OsList osList = new OsList(c12.s(createEmbeddedObject), aVar.f17275f);
        x0<PartyInvite> realmGet$parties = invitations.realmGet$parties();
        osList.K();
        if (realmGet$parties != null) {
            Iterator<PartyInvite> it = realmGet$parties.iterator();
            while (it.hasNext()) {
                PartyInvite next = it.next();
                Long l11 = map.get(next);
                if (l11 == null) {
                    c4.i(o0Var, c12, aVar.f17275f, createEmbeddedObject, next, map);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l11.toString());
                }
            }
        }
        OsList osList2 = new OsList(c12.s(createEmbeddedObject), aVar.f17276g);
        x0<GuildInvite> realmGet$guilds = invitations.realmGet$guilds();
        osList2.K();
        if (realmGet$guilds != null) {
            Iterator<GuildInvite> it2 = realmGet$guilds.iterator();
            while (it2.hasNext()) {
                GuildInvite next2 = it2.next();
                Long l12 = map.get(next2);
                if (l12 == null) {
                    y3.i(o0Var, c12, aVar.f17276g, createEmbeddedObject, next2, map);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l12.toString());
                }
            }
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a4 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Invitations.class), false, Collections.emptyList());
        a4 a4Var = new a4();
        cVar.a();
        return a4Var;
    }

    static Invitations l(o0 o0Var, a aVar, Invitations invitations, Invitations invitations2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Invitations.class), set);
        PartyInvite realmGet$party = invitations2.realmGet$party();
        if (realmGet$party == null) {
            osObjectBuilder.Z0(aVar.f17274e);
        } else if (((PartyInvite) map.get(realmGet$party)) == null) {
            c4 k10 = c4.k(o0Var, o0Var.c1(PartyInvite.class).s(((io.realm.internal.o) invitations).b().g().createEmbeddedObject(aVar.f17274e, RealmFieldType.OBJECT)));
            map.put(realmGet$party, k10);
            c4.n(o0Var, realmGet$party, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheparty.toString()");
        }
        x0<PartyInvite> realmGet$parties = invitations2.realmGet$parties();
        if (realmGet$parties != null) {
            x0 x0Var = new x0();
            OsList m10 = invitations.realmGet$parties().m();
            m10.q();
            for (int i10 = 0; i10 < realmGet$parties.size(); i10++) {
                PartyInvite partyInvite = realmGet$parties.get(i10);
                if (((PartyInvite) map.get(partyInvite)) == null) {
                    c4 k11 = c4.k(o0Var, o0Var.c1(PartyInvite.class).s(m10.n()));
                    map.put(partyInvite, k11);
                    x0Var.add(k11);
                    c4.n(o0Var, partyInvite, k11, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheparties.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f17275f, new x0());
        }
        x0<GuildInvite> realmGet$guilds = invitations2.realmGet$guilds();
        if (realmGet$guilds != null) {
            x0 x0Var2 = new x0();
            OsList m11 = invitations.realmGet$guilds().m();
            m11.q();
            for (int i11 = 0; i11 < realmGet$guilds.size(); i11++) {
                GuildInvite guildInvite = realmGet$guilds.get(i11);
                if (((GuildInvite) map.get(guildInvite)) == null) {
                    y3 k12 = y3.k(o0Var, o0Var.c1(GuildInvite.class).s(m11.n()));
                    map.put(guildInvite, k12);
                    x0Var2.add(k12);
                    y3.n(o0Var, guildInvite, k12, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheguilds.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f17276g, new x0());
        }
        osObjectBuilder.f1((io.realm.internal.o) invitations);
        return invitations;
    }

    public static void n(o0 o0Var, Invitations invitations, Invitations invitations2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Invitations.class), invitations2, invitations, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17271q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17270p = (a) cVar.c();
        l0<Invitations> l0Var = new l0<>(this);
        this.f17271q = l0Var;
        l0Var.r(cVar.e());
        this.f17271q.s(cVar.f());
        this.f17271q.o(cVar.b());
        this.f17271q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17271q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a4 a4Var = (a4) obj;
        io.realm.a f10 = this.f17271q.f();
        io.realm.a f11 = a4Var.f17271q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17271q.g().getTable().p();
        String p11 = a4Var.f17271q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17271q.g().getObjectKey() == a4Var.f17271q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17271q.f().getPath();
        String p10 = this.f17271q.g().getTable().p();
        long objectKey = this.f17271q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.invitations.Invitations, io.realm.b4
    public x0<GuildInvite> realmGet$guilds() {
        this.f17271q.f().e();
        x0<GuildInvite> x0Var = this.f17273u;
        if (x0Var != null) {
            return x0Var;
        }
        x0<GuildInvite> x0Var2 = new x0<>(GuildInvite.class, this.f17271q.g().getModelList(this.f17270p.f17276g), this.f17271q.f());
        this.f17273u = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.invitations.Invitations, io.realm.b4
    public x0<PartyInvite> realmGet$parties() {
        this.f17271q.f().e();
        x0<PartyInvite> x0Var = this.f17272r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<PartyInvite> x0Var2 = new x0<>(PartyInvite.class, this.f17271q.g().getModelList(this.f17270p.f17275f), this.f17271q.f());
        this.f17272r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.invitations.Invitations, io.realm.b4
    public PartyInvite realmGet$party() {
        this.f17271q.f().e();
        if (this.f17271q.g().isNullLink(this.f17270p.f17274e)) {
            return null;
        }
        return (PartyInvite) this.f17271q.f().B(PartyInvite.class, this.f17271q.g().getLink(this.f17270p.f17274e), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.invitations.Invitations, io.realm.b4
    public void realmSet$guilds(x0<GuildInvite> x0Var) {
        int i10 = 0;
        if (this.f17271q.i()) {
            if (!this.f17271q.d() || this.f17271q.e().contains("guilds")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17271q.f();
                x0<GuildInvite> x0Var2 = new x0<>();
                Iterator<GuildInvite> it = x0Var.iterator();
                while (it.hasNext()) {
                    GuildInvite next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((GuildInvite) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17271q.f().e();
        OsList modelList = this.f17271q.g().getModelList(this.f17270p.f17276g);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                GuildInvite guildInvite = x0Var.get(i10);
                this.f17271q.c(guildInvite);
                modelList.V(i10, ((io.realm.internal.o) guildInvite).b().g().getObjectKey());
                i10++;
            }
            return;
        }
        modelList.K();
        if (x0Var == null) {
            return;
        }
        int size2 = x0Var.size();
        while (i10 < size2) {
            GuildInvite guildInvite2 = x0Var.get(i10);
            this.f17271q.c(guildInvite2);
            modelList.k(((io.realm.internal.o) guildInvite2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.invitations.Invitations, io.realm.b4
    public void realmSet$parties(x0<PartyInvite> x0Var) {
        int i10 = 0;
        if (this.f17271q.i()) {
            if (!this.f17271q.d() || this.f17271q.e().contains("parties")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17271q.f();
                x0<PartyInvite> x0Var2 = new x0<>();
                Iterator<PartyInvite> it = x0Var.iterator();
                while (it.hasNext()) {
                    PartyInvite next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((PartyInvite) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17271q.f().e();
        OsList modelList = this.f17271q.g().getModelList(this.f17270p.f17275f);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                PartyInvite partyInvite = x0Var.get(i10);
                this.f17271q.c(partyInvite);
                modelList.V(i10, ((io.realm.internal.o) partyInvite).b().g().getObjectKey());
                i10++;
            }
            return;
        }
        modelList.K();
        if (x0Var == null) {
            return;
        }
        int size2 = x0Var.size();
        while (i10 < size2) {
            PartyInvite partyInvite2 = x0Var.get(i10);
            this.f17271q.c(partyInvite2);
            modelList.k(((io.realm.internal.o) partyInvite2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.invitations.Invitations, io.realm.b4
    public void realmSet$party(PartyInvite partyInvite) {
        o0 o0Var = (o0) this.f17271q.f();
        if (this.f17271q.i()) {
            if (!this.f17271q.d() || this.f17271q.e().contains(NavigationDrawerFragment.SIDEBAR_PARTY)) {
                return;
            }
            if (partyInvite != null && !d1.isManaged(partyInvite)) {
                PartyInvite partyInvite2 = (PartyInvite) o0Var.J0(PartyInvite.class, this, NavigationDrawerFragment.SIDEBAR_PARTY);
                c4.n(o0Var, partyInvite, partyInvite2, new HashMap(), Collections.EMPTY_SET);
                partyInvite = partyInvite2;
            }
            io.realm.internal.q g10 = this.f17271q.g();
            if (partyInvite == null) {
                g10.nullifyLink(this.f17270p.f17274e);
                return;
            }
            this.f17271q.c(partyInvite);
            g10.getTable().D(this.f17270p.f17274e, g10.getObjectKey(), ((io.realm.internal.o) partyInvite).b().g().getObjectKey(), true);
            return;
        }
        this.f17271q.f().e();
        if (partyInvite == null) {
            this.f17271q.g().nullifyLink(this.f17270p.f17274e);
            return;
        }
        if (d1.isManaged(partyInvite)) {
            this.f17271q.c(partyInvite);
        }
        c4.n(o0Var, partyInvite, (PartyInvite) o0Var.J0(PartyInvite.class, this, NavigationDrawerFragment.SIDEBAR_PARTY), new HashMap(), Collections.EMPTY_SET);
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Invitations = proxy[");
        sb2.append("{party:");
        if (realmGet$party() != null) {
            str = "PartyInvite";
        } else {
            str = "null";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{parties:");
        sb2.append("RealmList<PartyInvite>[");
        sb2.append(realmGet$parties().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{guilds:");
        sb2.append("RealmList<GuildInvite>[");
        sb2.append(realmGet$guilds().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
