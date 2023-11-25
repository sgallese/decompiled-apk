package io.realm;

import com.google.android.gms.common.Scopes;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.members.MemberFlags;
import com.habitrpg.android.habitica.models.members.MemberPreferences;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.Backer;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.Inbox;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Outfit;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import io.realm.a;
import io.realm.exceptions.RealmException;
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

/* compiled from: com_habitrpg_android_habitica_models_members_MemberRealmProxy.java */
/* loaded from: classes4.dex */
public class i4 extends Member implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17657r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17658p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Member> f17659q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_members_MemberRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17660e;

        /* renamed from: f  reason: collision with root package name */
        long f17661f;

        /* renamed from: g  reason: collision with root package name */
        long f17662g;

        /* renamed from: h  reason: collision with root package name */
        long f17663h;

        /* renamed from: i  reason: collision with root package name */
        long f17664i;

        /* renamed from: j  reason: collision with root package name */
        long f17665j;

        /* renamed from: k  reason: collision with root package name */
        long f17666k;

        /* renamed from: l  reason: collision with root package name */
        long f17667l;

        /* renamed from: m  reason: collision with root package name */
        long f17668m;

        /* renamed from: n  reason: collision with root package name */
        long f17669n;

        /* renamed from: o  reason: collision with root package name */
        long f17670o;

        /* renamed from: p  reason: collision with root package name */
        long f17671p;

        /* renamed from: q  reason: collision with root package name */
        long f17672q;

        /* renamed from: r  reason: collision with root package name */
        long f17673r;

        /* renamed from: s  reason: collision with root package name */
        long f17674s;

        /* renamed from: t  reason: collision with root package name */
        long f17675t;

        /* renamed from: u  reason: collision with root package name */
        long f17676u;

        /* renamed from: v  reason: collision with root package name */
        long f17677v;

        a(OsSchemaInfo osSchemaInfo) {
            super(18);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Member");
            this.f17660e = a("id", "id", b10);
            this.f17661f = a(NavigationDrawerFragment.SIDEBAR_STATS, NavigationDrawerFragment.SIDEBAR_STATS, b10);
            this.f17662g = a("inbox", "inbox", b10);
            this.f17663h = a("preferences", "preferences", b10);
            this.f17664i = a("flags", "flags", b10);
            this.f17665j = a(Scopes.PROFILE, Scopes.PROFILE, b10);
            this.f17666k = a(NavigationDrawerFragment.SIDEBAR_PARTY, NavigationDrawerFragment.SIDEBAR_PARTY, b10);
            this.f17667l = a("contributor", "contributor", b10);
            this.f17668m = a("backer", "backer", b10);
            this.f17669n = a("balance", "balance", b10);
            this.f17670o = a("authentication", "authentication", b10);
            this.f17671p = a(NavigationDrawerFragment.SIDEBAR_ITEMS, NavigationDrawerFragment.SIDEBAR_ITEMS, b10);
            this.f17672q = a("costume", "costume", b10);
            this.f17673r = a("equipped", "equipped", b10);
            this.f17674s = a("currentMount", "currentMount", b10);
            this.f17675t = a("currentPet", "currentPet", b10);
            this.f17676u = a("participatesInQuest", "participatesInQuest", b10);
            this.f17677v = a("loginIncentives", "loginIncentives", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17660e = aVar.f17660e;
            aVar2.f17661f = aVar.f17661f;
            aVar2.f17662g = aVar.f17662g;
            aVar2.f17663h = aVar.f17663h;
            aVar2.f17664i = aVar.f17664i;
            aVar2.f17665j = aVar.f17665j;
            aVar2.f17666k = aVar.f17666k;
            aVar2.f17667l = aVar.f17667l;
            aVar2.f17668m = aVar.f17668m;
            aVar2.f17669n = aVar.f17669n;
            aVar2.f17670o = aVar.f17670o;
            aVar2.f17671p = aVar.f17671p;
            aVar2.f17672q = aVar.f17672q;
            aVar2.f17673r = aVar.f17673r;
            aVar2.f17674s = aVar.f17674s;
            aVar2.f17675t = aVar.f17675t;
            aVar2.f17676u = aVar.f17676u;
            aVar2.f17677v = aVar.f17677v;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i4() {
        this.f17659q.p();
    }

    public static Member c(o0 o0Var, a aVar, Member member, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(member);
        if (oVar != null) {
            return (Member) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Member.class), set);
        osObjectBuilder.c1(aVar.f17660e, member.realmGet$id());
        osObjectBuilder.N0(aVar.f17669n, Double.valueOf(member.realmGet$balance()));
        osObjectBuilder.c1(aVar.f17674s, member.realmGet$currentMount());
        osObjectBuilder.c1(aVar.f17675t, member.realmGet$currentPet());
        osObjectBuilder.F0(aVar.f17676u, member.realmGet$participatesInQuest());
        osObjectBuilder.V0(aVar.f17677v, Integer.valueOf(member.realmGet$loginIncentives()));
        i4 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(member, l10);
        Stats realmGet$stats = member.realmGet$stats();
        if (realmGet$stats == null) {
            l10.realmSet$stats(null);
        } else if (((Stats) map.get(realmGet$stats)) == null) {
            o7 k10 = o7.k(o0Var, o0Var.c1(Stats.class).s(l10.b().g().createEmbeddedObject(aVar.f17661f, RealmFieldType.OBJECT)));
            map.put(realmGet$stats, k10);
            o7.n(o0Var, realmGet$stats, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachestats.toString()");
        }
        Inbox realmGet$inbox = member.realmGet$inbox();
        if (realmGet$inbox == null) {
            l10.realmSet$inbox(null);
        } else if (((Inbox) map.get(realmGet$inbox)) == null) {
            q6 k11 = q6.k(o0Var, o0Var.c1(Inbox.class).s(l10.b().g().createEmbeddedObject(aVar.f17662g, RealmFieldType.OBJECT)));
            map.put(realmGet$inbox, k11);
            q6.n(o0Var, realmGet$inbox, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheinbox.toString()");
        }
        MemberPreferences realmGet$preferences = member.realmGet$preferences();
        if (realmGet$preferences == null) {
            l10.realmSet$preferences(null);
        } else if (((MemberPreferences) map.get(realmGet$preferences)) == null) {
            g4 k12 = g4.k(o0Var, o0Var.c1(MemberPreferences.class).s(l10.b().g().createEmbeddedObject(aVar.f17663h, RealmFieldType.OBJECT)));
            map.put(realmGet$preferences, k12);
            g4.n(o0Var, realmGet$preferences, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachepreferences.toString()");
        }
        MemberFlags realmGet$flags = member.realmGet$flags();
        if (realmGet$flags == null) {
            l10.realmSet$flags(null);
        } else if (((MemberFlags) map.get(realmGet$flags)) == null) {
            e4 k13 = e4.k(o0Var, o0Var.c1(MemberFlags.class).s(l10.b().g().createEmbeddedObject(aVar.f17664i, RealmFieldType.OBJECT)));
            map.put(realmGet$flags, k13);
            e4.n(o0Var, realmGet$flags, k13, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheflags.toString()");
        }
        Profile realmGet$profile = member.realmGet$profile();
        if (realmGet$profile == null) {
            l10.realmSet$profile(null);
        } else if (((Profile) map.get(realmGet$profile)) == null) {
            i7 k14 = i7.k(o0Var, o0Var.c1(Profile.class).s(l10.b().g().createEmbeddedObject(aVar.f17665j, RealmFieldType.OBJECT)));
            map.put(realmGet$profile, k14);
            i7.n(o0Var, realmGet$profile, k14, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheprofile.toString()");
        }
        UserParty realmGet$party = member.realmGet$party();
        if (realmGet$party == null) {
            l10.realmSet$party(null);
        } else if (((UserParty) map.get(realmGet$party)) == null) {
            e5 k15 = e5.k(o0Var, o0Var.c1(UserParty.class).s(l10.b().g().createEmbeddedObject(aVar.f17666k, RealmFieldType.OBJECT)));
            map.put(realmGet$party, k15);
            e5.n(o0Var, realmGet$party, k15, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheparty.toString()");
        }
        ContributorInfo realmGet$contributor = member.realmGet$contributor();
        if (realmGet$contributor == null) {
            l10.realmSet$contributor(null);
        } else if (((ContributorInfo) map.get(realmGet$contributor)) == null) {
            e6 k16 = e6.k(o0Var, o0Var.c1(ContributorInfo.class).s(l10.b().g().createEmbeddedObject(aVar.f17667l, RealmFieldType.OBJECT)));
            map.put(realmGet$contributor, k16);
            e6.n(o0Var, realmGet$contributor, k16, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecontributor.toString()");
        }
        Backer realmGet$backer = member.realmGet$backer();
        if (realmGet$backer == null) {
            l10.realmSet$backer(null);
        } else if (((Backer) map.get(realmGet$backer)) == null) {
            a6 k17 = a6.k(o0Var, o0Var.c1(Backer.class).s(l10.b().g().createEmbeddedObject(aVar.f17668m, RealmFieldType.OBJECT)));
            map.put(realmGet$backer, k17);
            a6.n(o0Var, realmGet$backer, k17, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachebacker.toString()");
        }
        Authentication realmGet$authentication = member.realmGet$authentication();
        if (realmGet$authentication == null) {
            l10.realmSet$authentication(null);
        } else if (((Authentication) map.get(realmGet$authentication)) == null) {
            w5 k18 = w5.k(o0Var, o0Var.c1(Authentication.class).s(l10.b().g().createEmbeddedObject(aVar.f17670o, RealmFieldType.OBJECT)));
            map.put(realmGet$authentication, k18);
            w5.n(o0Var, realmGet$authentication, k18, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheauthentication.toString()");
        }
        Items realmGet$items = member.realmGet$items();
        if (realmGet$items == null) {
            l10.realmSet$items(null);
        } else if (((Items) map.get(realmGet$items)) == null) {
            s6 k19 = s6.k(o0Var, o0Var.c1(Items.class).s(l10.b().g().createEmbeddedObject(aVar.f17671p, RealmFieldType.OBJECT)));
            map.put(realmGet$items, k19);
            s6.n(o0Var, realmGet$items, k19, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheitems.toString()");
        }
        Outfit realmGet$costume = member.realmGet$costume();
        if (realmGet$costume == null) {
            l10.realmSet$costume(null);
        } else if (((Outfit) map.get(realmGet$costume)) == null) {
            u6 k20 = u6.k(o0Var, o0Var.c1(Outfit.class).s(l10.b().g().createEmbeddedObject(aVar.f17672q, RealmFieldType.OBJECT)));
            map.put(realmGet$costume, k20);
            u6.n(o0Var, realmGet$costume, k20, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecostume.toString()");
        }
        Outfit realmGet$equipped = member.realmGet$equipped();
        if (realmGet$equipped == null) {
            l10.realmSet$equipped(null);
        } else if (((Outfit) map.get(realmGet$equipped)) == null) {
            u6 k21 = u6.k(o0Var, o0Var.c1(Outfit.class).s(l10.b().g().createEmbeddedObject(aVar.f17673r, RealmFieldType.OBJECT)));
            map.put(realmGet$equipped, k21);
            u6.n(o0Var, realmGet$equipped, k21, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheequipped.toString()");
        }
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.members.Member d(io.realm.o0 r8, io.realm.i4.a r9, com.habitrpg.android.habitica.models.members.Member r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
        /*
            boolean r0 = r10 instanceof io.realm.internal.o
            if (r0 == 0) goto L3e
            boolean r0 = io.realm.d1.isFrozen(r10)
            if (r0 != 0) goto L3e
            r0 = r10
            io.realm.internal.o r0 = (io.realm.internal.o) r0
            io.realm.l0 r1 = r0.b()
            io.realm.a r1 = r1.f()
            if (r1 == 0) goto L3e
            io.realm.l0 r0 = r0.b()
            io.realm.a r0 = r0.f()
            long r1 = r0.f17239m
            long r3 = r8.f17239m
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L36
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            return r10
        L36:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L3e:
            io.realm.a$d r0 = io.realm.a.f17237x
            java.lang.Object r0 = r0.get()
            io.realm.a$c r0 = (io.realm.a.c) r0
            java.lang.Object r1 = r12.get(r10)
            io.realm.internal.o r1 = (io.realm.internal.o) r1
            if (r1 == 0) goto L51
            com.habitrpg.android.habitica.models.members.Member r1 = (com.habitrpg.android.habitica.models.members.Member) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.members.Member> r2 = com.habitrpg.android.habitica.models.members.Member.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17660e
            java.lang.String r5 = r10.realmGet$id()
            long r3 = r2.e(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L6c
            r0 = 0
            goto L8d
        L6c:
            io.realm.internal.UncheckedRow r3 = r2.s(r3)     // Catch: java.lang.Throwable -> L87
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L87
            r1 = r0
            r2 = r8
            r4 = r9
            r1.g(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L87
            io.realm.i4 r1 = new io.realm.i4     // Catch: java.lang.Throwable -> L87
            r1.<init>()     // Catch: java.lang.Throwable -> L87
            r12.put(r10, r1)     // Catch: java.lang.Throwable -> L87
            r0.a()
            goto L8c
        L87:
            r8 = move-exception
            r0.a()
            throw r8
        L8c:
            r0 = r11
        L8d:
            r3 = r1
            if (r0 == 0) goto L9a
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            com.habitrpg.android.habitica.models.members.Member r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.members.Member r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.i4.d(io.realm.o0, io.realm.i4$a, com.habitrpg.android.habitica.models.members.Member, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.members.Member");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Member f(Member member, int i10, int i11, Map<a1, o.a<a1>> map) {
        Member member2;
        if (i10 <= i11 && member != null) {
            o.a<a1> aVar = map.get(member);
            if (aVar == null) {
                member2 = new Member();
                map.put(member, new o.a<>(i10, member2));
            } else if (i10 >= aVar.f17831a) {
                return (Member) aVar.f17832b;
            } else {
                Member member3 = (Member) aVar.f17832b;
                aVar.f17831a = i10;
                member2 = member3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) member).b().f();
            member2.realmSet$id(member.realmGet$id());
            int i12 = i10 + 1;
            member2.realmSet$stats(o7.f(member.realmGet$stats(), i12, i11, map));
            member2.realmSet$inbox(q6.f(member.realmGet$inbox(), i12, i11, map));
            member2.realmSet$preferences(g4.f(member.realmGet$preferences(), i12, i11, map));
            member2.realmSet$flags(e4.f(member.realmGet$flags(), i12, i11, map));
            member2.realmSet$profile(i7.f(member.realmGet$profile(), i12, i11, map));
            member2.realmSet$party(e5.f(member.realmGet$party(), i12, i11, map));
            member2.realmSet$contributor(e6.f(member.realmGet$contributor(), i12, i11, map));
            member2.realmSet$backer(a6.f(member.realmGet$backer(), i12, i11, map));
            member2.realmSet$balance(member.realmGet$balance());
            member2.realmSet$authentication(w5.f(member.realmGet$authentication(), i12, i11, map));
            member2.realmSet$items(s6.f(member.realmGet$items(), i12, i11, map));
            member2.realmSet$costume(u6.f(member.realmGet$costume(), i12, i11, map));
            member2.realmSet$equipped(u6.f(member.realmGet$equipped(), i12, i11, map));
            member2.realmSet$currentMount(member.realmGet$currentMount());
            member2.realmSet$currentPet(member.realmGet$currentPet());
            member2.realmSet$participatesInQuest(member.realmGet$participatesInQuest());
            member2.realmSet$loginIncentives(member.realmGet$loginIncentives());
            return member2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Member", false, 18, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.OBJECT;
        bVar.a("", NavigationDrawerFragment.SIDEBAR_STATS, realmFieldType2, "Stats");
        bVar.a("", "inbox", realmFieldType2, "Inbox");
        bVar.a("", "preferences", realmFieldType2, "MemberPreferences");
        bVar.a("", "flags", realmFieldType2, "MemberFlags");
        bVar.a("", Scopes.PROFILE, realmFieldType2, "Profile");
        bVar.a("", NavigationDrawerFragment.SIDEBAR_PARTY, realmFieldType2, "UserParty");
        bVar.a("", "contributor", realmFieldType2, "ContributorInfo");
        bVar.a("", "backer", realmFieldType2, "Backer");
        bVar.b("", "balance", RealmFieldType.DOUBLE, false, false, true);
        bVar.a("", "authentication", realmFieldType2, "Authentication");
        bVar.a("", NavigationDrawerFragment.SIDEBAR_ITEMS, realmFieldType2, "Items");
        bVar.a("", "costume", realmFieldType2, "Outfit");
        bVar.a("", "equipped", realmFieldType2, "Outfit");
        bVar.b("", "currentMount", realmFieldType, false, false, false);
        bVar.b("", "currentPet", realmFieldType, false, false, false);
        bVar.b("", "participatesInQuest", RealmFieldType.BOOLEAN, false, false, false);
        bVar.b("", "loginIncentives", RealmFieldType.INTEGER, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17657r;
    }

    public static long i(o0 o0Var, Member member, Map<a1, Long> map) {
        long j10;
        String str;
        a aVar;
        if ((member instanceof io.realm.internal.o) && !d1.isFrozen(member)) {
            io.realm.internal.o oVar = (io.realm.internal.o) member;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Member.class);
        long nativePtr = c12.getNativePtr();
        a aVar2 = (a) o0Var.R().e(Member.class);
        long j11 = aVar2.f17660e;
        String realmGet$id = member.realmGet$id();
        if (realmGet$id != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j11, realmGet$id);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$id);
        }
        long j12 = j10;
        map.put(member, Long.valueOf(j12));
        Stats realmGet$stats = member.realmGet$stats();
        if (realmGet$stats != null) {
            Long l10 = map.get(realmGet$stats);
            if (l10 == null) {
                o7.i(o0Var, c12, aVar2.f17661f, j12, realmGet$stats, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar2.f17661f, j12);
        }
        Inbox realmGet$inbox = member.realmGet$inbox();
        if (realmGet$inbox != null) {
            Long l11 = map.get(realmGet$inbox);
            if (l11 == null) {
                q6.i(o0Var, c12, aVar2.f17662g, j12, realmGet$inbox, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l11.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar2.f17662g, j12);
        }
        MemberPreferences realmGet$preferences = member.realmGet$preferences();
        if (realmGet$preferences != null) {
            Long l12 = map.get(realmGet$preferences);
            if (l12 == null) {
                g4.i(o0Var, c12, aVar2.f17663h, j12, realmGet$preferences, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l12.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar2.f17663h, j12);
        }
        MemberFlags realmGet$flags = member.realmGet$flags();
        if (realmGet$flags != null) {
            Long l13 = map.get(realmGet$flags);
            if (l13 == null) {
                e4.i(o0Var, c12, aVar2.f17664i, j12, realmGet$flags, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l13.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar2.f17664i, j12);
        }
        Profile realmGet$profile = member.realmGet$profile();
        if (realmGet$profile != null) {
            Long l14 = map.get(realmGet$profile);
            if (l14 == null) {
                i7.i(o0Var, c12, aVar2.f17665j, j12, realmGet$profile, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l14.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar2.f17665j, j12);
        }
        UserParty realmGet$party = member.realmGet$party();
        if (realmGet$party != null) {
            Long l15 = map.get(realmGet$party);
            if (l15 == null) {
                e5.i(o0Var, c12, aVar2.f17666k, j12, realmGet$party, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l15.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar2.f17666k, j12);
        }
        ContributorInfo realmGet$contributor = member.realmGet$contributor();
        if (realmGet$contributor != null) {
            Long l16 = map.get(realmGet$contributor);
            if (l16 == null) {
                e6.i(o0Var, c12, aVar2.f17667l, j12, realmGet$contributor, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l16.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar2.f17667l, j12);
        }
        Backer realmGet$backer = member.realmGet$backer();
        if (realmGet$backer != null) {
            Long l17 = map.get(realmGet$backer);
            if (l17 == null) {
                a6.i(o0Var, c12, aVar2.f17668m, j12, realmGet$backer, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l17.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar2.f17668m, j12);
        }
        Table.nativeSetDouble(nativePtr, aVar2.f17669n, j12, member.realmGet$balance(), false);
        Authentication realmGet$authentication = member.realmGet$authentication();
        if (realmGet$authentication == null) {
            str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
            aVar = aVar2;
            Table.nativeNullifyLink(nativePtr, aVar.f17670o, j12);
        } else {
            Long l18 = map.get(realmGet$authentication);
            if (l18 == null) {
                long j13 = aVar2.f17670o;
                str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
                aVar = aVar2;
                w5.i(o0Var, c12, j13, j12, realmGet$authentication, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l18.toString());
            }
        }
        Items realmGet$items = member.realmGet$items();
        if (realmGet$items != null) {
            Long l19 = map.get(realmGet$items);
            if (l19 == null) {
                s6.i(o0Var, c12, aVar.f17671p, j12, realmGet$items, map);
            } else {
                throw new IllegalArgumentException(str + l19.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17671p, j12);
        }
        Outfit realmGet$costume = member.realmGet$costume();
        if (realmGet$costume != null) {
            Long l20 = map.get(realmGet$costume);
            if (l20 == null) {
                u6.i(o0Var, c12, aVar.f17672q, j12, realmGet$costume, map);
            } else {
                throw new IllegalArgumentException(str + l20.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17672q, j12);
        }
        Outfit realmGet$equipped = member.realmGet$equipped();
        if (realmGet$equipped != null) {
            Long l21 = map.get(realmGet$equipped);
            if (l21 == null) {
                u6.i(o0Var, c12, aVar.f17673r, j12, realmGet$equipped, map);
            } else {
                throw new IllegalArgumentException(str + l21.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17673r, j12);
        }
        String realmGet$currentMount = member.realmGet$currentMount();
        if (realmGet$currentMount != null) {
            Table.nativeSetString(nativePtr, aVar.f17674s, j12, realmGet$currentMount, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17674s, j12, false);
        }
        String realmGet$currentPet = member.realmGet$currentPet();
        if (realmGet$currentPet != null) {
            Table.nativeSetString(nativePtr, aVar.f17675t, j12, realmGet$currentPet, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17675t, j12, false);
        }
        Boolean realmGet$participatesInQuest = member.realmGet$participatesInQuest();
        if (realmGet$participatesInQuest != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f17676u, j12, realmGet$participatesInQuest.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17676u, j12, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f17677v, j12, member.realmGet$loginIncentives(), false);
        return j12;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        String str;
        Member member;
        a aVar;
        a aVar2;
        Table c12 = o0Var.c1(Member.class);
        long nativePtr = c12.getNativePtr();
        a aVar3 = (a) o0Var.R().e(Member.class);
        long j12 = aVar3.f17660e;
        while (it.hasNext()) {
            Member member2 = (Member) it.next();
            if (!map.containsKey(member2)) {
                if ((member2 instanceof io.realm.internal.o) && !d1.isFrozen(member2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) member2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(member2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$id = member2.realmGet$id();
                if (realmGet$id != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j12, realmGet$id);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j11 = OsObject.createRowWithPrimaryKey(c12, j12, realmGet$id);
                } else {
                    j11 = j10;
                }
                map.put(member2, Long.valueOf(j11));
                Stats realmGet$stats = member2.realmGet$stats();
                if (realmGet$stats == null) {
                    str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
                    member = member2;
                    Table.nativeNullifyLink(nativePtr, aVar3.f17661f, j11);
                } else {
                    Long l10 = map.get(realmGet$stats);
                    if (l10 == null) {
                        str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
                        member = member2;
                        o7.i(o0Var, c12, aVar3.f17661f, j11, realmGet$stats, map);
                    } else {
                        throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
                    }
                }
                Inbox realmGet$inbox = member.realmGet$inbox();
                if (realmGet$inbox != null) {
                    Long l11 = map.get(realmGet$inbox);
                    if (l11 == null) {
                        q6.i(o0Var, c12, aVar3.f17662g, j11, realmGet$inbox, map);
                    } else {
                        throw new IllegalArgumentException(str + l11.toString());
                    }
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar3.f17662g, j11);
                }
                MemberPreferences realmGet$preferences = member.realmGet$preferences();
                if (realmGet$preferences != null) {
                    Long l12 = map.get(realmGet$preferences);
                    if (l12 == null) {
                        g4.i(o0Var, c12, aVar3.f17663h, j11, realmGet$preferences, map);
                    } else {
                        throw new IllegalArgumentException(str + l12.toString());
                    }
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar3.f17663h, j11);
                }
                MemberFlags realmGet$flags = member.realmGet$flags();
                if (realmGet$flags != null) {
                    Long l13 = map.get(realmGet$flags);
                    if (l13 == null) {
                        e4.i(o0Var, c12, aVar3.f17664i, j11, realmGet$flags, map);
                    } else {
                        throw new IllegalArgumentException(str + l13.toString());
                    }
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar3.f17664i, j11);
                }
                Profile realmGet$profile = member.realmGet$profile();
                if (realmGet$profile != null) {
                    Long l14 = map.get(realmGet$profile);
                    if (l14 == null) {
                        i7.i(o0Var, c12, aVar3.f17665j, j11, realmGet$profile, map);
                    } else {
                        throw new IllegalArgumentException(str + l14.toString());
                    }
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar3.f17665j, j11);
                }
                UserParty realmGet$party = member.realmGet$party();
                if (realmGet$party != null) {
                    Long l15 = map.get(realmGet$party);
                    if (l15 == null) {
                        e5.i(o0Var, c12, aVar3.f17666k, j11, realmGet$party, map);
                    } else {
                        throw new IllegalArgumentException(str + l15.toString());
                    }
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar3.f17666k, j11);
                }
                ContributorInfo realmGet$contributor = member.realmGet$contributor();
                if (realmGet$contributor != null) {
                    Long l16 = map.get(realmGet$contributor);
                    if (l16 == null) {
                        e6.i(o0Var, c12, aVar3.f17667l, j11, realmGet$contributor, map);
                    } else {
                        throw new IllegalArgumentException(str + l16.toString());
                    }
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar3.f17667l, j11);
                }
                Backer realmGet$backer = member.realmGet$backer();
                if (realmGet$backer != null) {
                    Long l17 = map.get(realmGet$backer);
                    if (l17 == null) {
                        a6.i(o0Var, c12, aVar3.f17668m, j11, realmGet$backer, map);
                    } else {
                        throw new IllegalArgumentException(str + l17.toString());
                    }
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar3.f17668m, j11);
                }
                long j13 = j12;
                long j14 = nativePtr;
                a aVar4 = aVar3;
                Table.nativeSetDouble(nativePtr, aVar3.f17669n, j11, member.realmGet$balance(), false);
                Authentication realmGet$authentication = member.realmGet$authentication();
                if (realmGet$authentication != null) {
                    Long l18 = map.get(realmGet$authentication);
                    if (l18 == null) {
                        aVar = aVar4;
                        w5.i(o0Var, c12, aVar4.f17670o, j11, realmGet$authentication, map);
                    } else {
                        throw new IllegalArgumentException(str + l18.toString());
                    }
                } else {
                    aVar = aVar4;
                    Table.nativeNullifyLink(j14, aVar.f17670o, j11);
                }
                Items realmGet$items = member.realmGet$items();
                if (realmGet$items != null) {
                    Long l19 = map.get(realmGet$items);
                    if (l19 == null) {
                        s6.i(o0Var, c12, aVar.f17671p, j11, realmGet$items, map);
                    } else {
                        throw new IllegalArgumentException(str + l19.toString());
                    }
                } else {
                    Table.nativeNullifyLink(j14, aVar.f17671p, j11);
                }
                Outfit realmGet$costume = member.realmGet$costume();
                if (realmGet$costume != null) {
                    Long l20 = map.get(realmGet$costume);
                    if (l20 == null) {
                        u6.i(o0Var, c12, aVar.f17672q, j11, realmGet$costume, map);
                    } else {
                        throw new IllegalArgumentException(str + l20.toString());
                    }
                } else {
                    Table.nativeNullifyLink(j14, aVar.f17672q, j11);
                }
                Outfit realmGet$equipped = member.realmGet$equipped();
                if (realmGet$equipped != null) {
                    Long l21 = map.get(realmGet$equipped);
                    if (l21 == null) {
                        u6.i(o0Var, c12, aVar.f17673r, j11, realmGet$equipped, map);
                    } else {
                        throw new IllegalArgumentException(str + l21.toString());
                    }
                } else {
                    Table.nativeNullifyLink(j14, aVar.f17673r, j11);
                }
                String realmGet$currentMount = member.realmGet$currentMount();
                if (realmGet$currentMount != null) {
                    aVar2 = aVar;
                    Table.nativeSetString(j14, aVar.f17674s, j11, realmGet$currentMount, false);
                } else {
                    aVar2 = aVar;
                    Table.nativeSetNull(j14, aVar2.f17674s, j11, false);
                }
                String realmGet$currentPet = member.realmGet$currentPet();
                if (realmGet$currentPet != null) {
                    Table.nativeSetString(j14, aVar2.f17675t, j11, realmGet$currentPet, false);
                } else {
                    Table.nativeSetNull(j14, aVar2.f17675t, j11, false);
                }
                Boolean realmGet$participatesInQuest = member.realmGet$participatesInQuest();
                if (realmGet$participatesInQuest != null) {
                    Table.nativeSetBoolean(j14, aVar2.f17676u, j11, realmGet$participatesInQuest.booleanValue(), false);
                } else {
                    Table.nativeSetNull(j14, aVar2.f17676u, j11, false);
                }
                Table.nativeSetLong(j14, aVar2.f17677v, j11, member.realmGet$loginIncentives(), false);
                aVar3 = aVar2;
                j12 = j13;
                nativePtr = j14;
            }
        }
    }

    static i4 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Member.class), false, Collections.emptyList());
        i4 i4Var = new i4();
        cVar.a();
        return i4Var;
    }

    static Member n(o0 o0Var, a aVar, Member member, Member member2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Member.class), set);
        osObjectBuilder.c1(aVar.f17660e, member2.realmGet$id());
        Stats realmGet$stats = member2.realmGet$stats();
        if (realmGet$stats == null) {
            osObjectBuilder.Z0(aVar.f17661f);
        } else if (((Stats) map.get(realmGet$stats)) == null) {
            o7 k10 = o7.k(o0Var, o0Var.c1(Stats.class).s(((io.realm.internal.o) member).b().g().createEmbeddedObject(aVar.f17661f, RealmFieldType.OBJECT)));
            map.put(realmGet$stats, k10);
            o7.n(o0Var, realmGet$stats, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachestats.toString()");
        }
        Inbox realmGet$inbox = member2.realmGet$inbox();
        if (realmGet$inbox == null) {
            osObjectBuilder.Z0(aVar.f17662g);
        } else if (((Inbox) map.get(realmGet$inbox)) == null) {
            q6 k11 = q6.k(o0Var, o0Var.c1(Inbox.class).s(((io.realm.internal.o) member).b().g().createEmbeddedObject(aVar.f17662g, RealmFieldType.OBJECT)));
            map.put(realmGet$inbox, k11);
            q6.n(o0Var, realmGet$inbox, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheinbox.toString()");
        }
        MemberPreferences realmGet$preferences = member2.realmGet$preferences();
        if (realmGet$preferences == null) {
            osObjectBuilder.Z0(aVar.f17663h);
        } else if (((MemberPreferences) map.get(realmGet$preferences)) == null) {
            g4 k12 = g4.k(o0Var, o0Var.c1(MemberPreferences.class).s(((io.realm.internal.o) member).b().g().createEmbeddedObject(aVar.f17663h, RealmFieldType.OBJECT)));
            map.put(realmGet$preferences, k12);
            g4.n(o0Var, realmGet$preferences, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachepreferences.toString()");
        }
        MemberFlags realmGet$flags = member2.realmGet$flags();
        if (realmGet$flags == null) {
            osObjectBuilder.Z0(aVar.f17664i);
        } else if (((MemberFlags) map.get(realmGet$flags)) == null) {
            e4 k13 = e4.k(o0Var, o0Var.c1(MemberFlags.class).s(((io.realm.internal.o) member).b().g().createEmbeddedObject(aVar.f17664i, RealmFieldType.OBJECT)));
            map.put(realmGet$flags, k13);
            e4.n(o0Var, realmGet$flags, k13, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheflags.toString()");
        }
        Profile realmGet$profile = member2.realmGet$profile();
        if (realmGet$profile == null) {
            osObjectBuilder.Z0(aVar.f17665j);
        } else if (((Profile) map.get(realmGet$profile)) == null) {
            i7 k14 = i7.k(o0Var, o0Var.c1(Profile.class).s(((io.realm.internal.o) member).b().g().createEmbeddedObject(aVar.f17665j, RealmFieldType.OBJECT)));
            map.put(realmGet$profile, k14);
            i7.n(o0Var, realmGet$profile, k14, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheprofile.toString()");
        }
        UserParty realmGet$party = member2.realmGet$party();
        if (realmGet$party == null) {
            osObjectBuilder.Z0(aVar.f17666k);
        } else if (((UserParty) map.get(realmGet$party)) == null) {
            e5 k15 = e5.k(o0Var, o0Var.c1(UserParty.class).s(((io.realm.internal.o) member).b().g().createEmbeddedObject(aVar.f17666k, RealmFieldType.OBJECT)));
            map.put(realmGet$party, k15);
            e5.n(o0Var, realmGet$party, k15, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheparty.toString()");
        }
        ContributorInfo realmGet$contributor = member2.realmGet$contributor();
        if (realmGet$contributor == null) {
            osObjectBuilder.Z0(aVar.f17667l);
        } else if (((ContributorInfo) map.get(realmGet$contributor)) == null) {
            e6 k16 = e6.k(o0Var, o0Var.c1(ContributorInfo.class).s(((io.realm.internal.o) member).b().g().createEmbeddedObject(aVar.f17667l, RealmFieldType.OBJECT)));
            map.put(realmGet$contributor, k16);
            e6.n(o0Var, realmGet$contributor, k16, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecontributor.toString()");
        }
        Backer realmGet$backer = member2.realmGet$backer();
        if (realmGet$backer == null) {
            osObjectBuilder.Z0(aVar.f17668m);
        } else if (((Backer) map.get(realmGet$backer)) == null) {
            a6 k17 = a6.k(o0Var, o0Var.c1(Backer.class).s(((io.realm.internal.o) member).b().g().createEmbeddedObject(aVar.f17668m, RealmFieldType.OBJECT)));
            map.put(realmGet$backer, k17);
            a6.n(o0Var, realmGet$backer, k17, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachebacker.toString()");
        }
        osObjectBuilder.N0(aVar.f17669n, Double.valueOf(member2.realmGet$balance()));
        Authentication realmGet$authentication = member2.realmGet$authentication();
        if (realmGet$authentication == null) {
            osObjectBuilder.Z0(aVar.f17670o);
        } else if (((Authentication) map.get(realmGet$authentication)) == null) {
            w5 k18 = w5.k(o0Var, o0Var.c1(Authentication.class).s(((io.realm.internal.o) member).b().g().createEmbeddedObject(aVar.f17670o, RealmFieldType.OBJECT)));
            map.put(realmGet$authentication, k18);
            w5.n(o0Var, realmGet$authentication, k18, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheauthentication.toString()");
        }
        Items realmGet$items = member2.realmGet$items();
        if (realmGet$items == null) {
            osObjectBuilder.Z0(aVar.f17671p);
        } else if (((Items) map.get(realmGet$items)) == null) {
            s6 k19 = s6.k(o0Var, o0Var.c1(Items.class).s(((io.realm.internal.o) member).b().g().createEmbeddedObject(aVar.f17671p, RealmFieldType.OBJECT)));
            map.put(realmGet$items, k19);
            s6.n(o0Var, realmGet$items, k19, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheitems.toString()");
        }
        Outfit realmGet$costume = member2.realmGet$costume();
        if (realmGet$costume == null) {
            osObjectBuilder.Z0(aVar.f17672q);
        } else if (((Outfit) map.get(realmGet$costume)) == null) {
            u6 k20 = u6.k(o0Var, o0Var.c1(Outfit.class).s(((io.realm.internal.o) member).b().g().createEmbeddedObject(aVar.f17672q, RealmFieldType.OBJECT)));
            map.put(realmGet$costume, k20);
            u6.n(o0Var, realmGet$costume, k20, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecostume.toString()");
        }
        Outfit realmGet$equipped = member2.realmGet$equipped();
        if (realmGet$equipped == null) {
            osObjectBuilder.Z0(aVar.f17673r);
        } else if (((Outfit) map.get(realmGet$equipped)) == null) {
            u6 k21 = u6.k(o0Var, o0Var.c1(Outfit.class).s(((io.realm.internal.o) member).b().g().createEmbeddedObject(aVar.f17673r, RealmFieldType.OBJECT)));
            map.put(realmGet$equipped, k21);
            u6.n(o0Var, realmGet$equipped, k21, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheequipped.toString()");
        }
        osObjectBuilder.c1(aVar.f17674s, member2.realmGet$currentMount());
        osObjectBuilder.c1(aVar.f17675t, member2.realmGet$currentPet());
        osObjectBuilder.F0(aVar.f17676u, member2.realmGet$participatesInQuest());
        osObjectBuilder.V0(aVar.f17677v, Integer.valueOf(member2.realmGet$loginIncentives()));
        osObjectBuilder.g1();
        return member;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17659q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17658p = (a) cVar.c();
        l0<Member> l0Var = new l0<>(this);
        this.f17659q = l0Var;
        l0Var.r(cVar.e());
        this.f17659q.s(cVar.f());
        this.f17659q.o(cVar.b());
        this.f17659q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17659q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i4 i4Var = (i4) obj;
        io.realm.a f10 = this.f17659q.f();
        io.realm.a f11 = i4Var.f17659q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17659q.g().getTable().p();
        String p11 = i4Var.f17659q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17659q.g().getObjectKey() == i4Var.f17659q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17659q.f().getPath();
        String p10 = this.f17659q.g().getTable().p();
        long objectKey = this.f17659q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public Authentication realmGet$authentication() {
        this.f17659q.f().e();
        if (this.f17659q.g().isNullLink(this.f17658p.f17670o)) {
            return null;
        }
        return (Authentication) this.f17659q.f().B(Authentication.class, this.f17659q.g().getLink(this.f17658p.f17670o), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public Backer realmGet$backer() {
        this.f17659q.f().e();
        if (this.f17659q.g().isNullLink(this.f17658p.f17668m)) {
            return null;
        }
        return (Backer) this.f17659q.f().B(Backer.class, this.f17659q.g().getLink(this.f17658p.f17668m), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public double realmGet$balance() {
        this.f17659q.f().e();
        return this.f17659q.g().getDouble(this.f17658p.f17669n);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public ContributorInfo realmGet$contributor() {
        this.f17659q.f().e();
        if (this.f17659q.g().isNullLink(this.f17658p.f17667l)) {
            return null;
        }
        return (ContributorInfo) this.f17659q.f().B(ContributorInfo.class, this.f17659q.g().getLink(this.f17658p.f17667l), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public Outfit realmGet$costume() {
        this.f17659q.f().e();
        if (this.f17659q.g().isNullLink(this.f17658p.f17672q)) {
            return null;
        }
        return (Outfit) this.f17659q.f().B(Outfit.class, this.f17659q.g().getLink(this.f17658p.f17672q), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public String realmGet$currentMount() {
        this.f17659q.f().e();
        return this.f17659q.g().getString(this.f17658p.f17674s);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public String realmGet$currentPet() {
        this.f17659q.f().e();
        return this.f17659q.g().getString(this.f17658p.f17675t);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public Outfit realmGet$equipped() {
        this.f17659q.f().e();
        if (this.f17659q.g().isNullLink(this.f17658p.f17673r)) {
            return null;
        }
        return (Outfit) this.f17659q.f().B(Outfit.class, this.f17659q.g().getLink(this.f17658p.f17673r), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public MemberFlags realmGet$flags() {
        this.f17659q.f().e();
        if (this.f17659q.g().isNullLink(this.f17658p.f17664i)) {
            return null;
        }
        return (MemberFlags) this.f17659q.f().B(MemberFlags.class, this.f17659q.g().getLink(this.f17658p.f17664i), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public String realmGet$id() {
        this.f17659q.f().e();
        return this.f17659q.g().getString(this.f17658p.f17660e);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public Inbox realmGet$inbox() {
        this.f17659q.f().e();
        if (this.f17659q.g().isNullLink(this.f17658p.f17662g)) {
            return null;
        }
        return (Inbox) this.f17659q.f().B(Inbox.class, this.f17659q.g().getLink(this.f17658p.f17662g), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public Items realmGet$items() {
        this.f17659q.f().e();
        if (this.f17659q.g().isNullLink(this.f17658p.f17671p)) {
            return null;
        }
        return (Items) this.f17659q.f().B(Items.class, this.f17659q.g().getLink(this.f17658p.f17671p), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public int realmGet$loginIncentives() {
        this.f17659q.f().e();
        return (int) this.f17659q.g().getLong(this.f17658p.f17677v);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public Boolean realmGet$participatesInQuest() {
        this.f17659q.f().e();
        if (this.f17659q.g().isNull(this.f17658p.f17676u)) {
            return null;
        }
        return Boolean.valueOf(this.f17659q.g().getBoolean(this.f17658p.f17676u));
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public UserParty realmGet$party() {
        this.f17659q.f().e();
        if (this.f17659q.g().isNullLink(this.f17658p.f17666k)) {
            return null;
        }
        return (UserParty) this.f17659q.f().B(UserParty.class, this.f17659q.g().getLink(this.f17658p.f17666k), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public MemberPreferences realmGet$preferences() {
        this.f17659q.f().e();
        if (this.f17659q.g().isNullLink(this.f17658p.f17663h)) {
            return null;
        }
        return (MemberPreferences) this.f17659q.f().B(MemberPreferences.class, this.f17659q.g().getLink(this.f17658p.f17663h), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public Profile realmGet$profile() {
        this.f17659q.f().e();
        if (this.f17659q.g().isNullLink(this.f17658p.f17665j)) {
            return null;
        }
        return (Profile) this.f17659q.f().B(Profile.class, this.f17659q.g().getLink(this.f17658p.f17665j), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public Stats realmGet$stats() {
        this.f17659q.f().e();
        if (this.f17659q.g().isNullLink(this.f17658p.f17661f)) {
            return null;
        }
        return (Stats) this.f17659q.f().B(Stats.class, this.f17659q.g().getLink(this.f17658p.f17661f), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$authentication(Authentication authentication) {
        o0 o0Var = (o0) this.f17659q.f();
        if (this.f17659q.i()) {
            if (!this.f17659q.d() || this.f17659q.e().contains("authentication")) {
                return;
            }
            if (authentication != null && !d1.isManaged(authentication)) {
                Authentication authentication2 = (Authentication) o0Var.J0(Authentication.class, this, "authentication");
                w5.n(o0Var, authentication, authentication2, new HashMap(), Collections.EMPTY_SET);
                authentication = authentication2;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            if (authentication == null) {
                g10.nullifyLink(this.f17658p.f17670o);
                return;
            }
            this.f17659q.c(authentication);
            g10.getTable().D(this.f17658p.f17670o, g10.getObjectKey(), ((io.realm.internal.o) authentication).b().g().getObjectKey(), true);
            return;
        }
        this.f17659q.f().e();
        if (authentication == null) {
            this.f17659q.g().nullifyLink(this.f17658p.f17670o);
            return;
        }
        if (d1.isManaged(authentication)) {
            this.f17659q.c(authentication);
        }
        w5.n(o0Var, authentication, (Authentication) o0Var.J0(Authentication.class, this, "authentication"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$backer(Backer backer) {
        o0 o0Var = (o0) this.f17659q.f();
        if (this.f17659q.i()) {
            if (!this.f17659q.d() || this.f17659q.e().contains("backer")) {
                return;
            }
            if (backer != null && !d1.isManaged(backer)) {
                Backer backer2 = (Backer) o0Var.J0(Backer.class, this, "backer");
                a6.n(o0Var, backer, backer2, new HashMap(), Collections.EMPTY_SET);
                backer = backer2;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            if (backer == null) {
                g10.nullifyLink(this.f17658p.f17668m);
                return;
            }
            this.f17659q.c(backer);
            g10.getTable().D(this.f17658p.f17668m, g10.getObjectKey(), ((io.realm.internal.o) backer).b().g().getObjectKey(), true);
            return;
        }
        this.f17659q.f().e();
        if (backer == null) {
            this.f17659q.g().nullifyLink(this.f17658p.f17668m);
            return;
        }
        if (d1.isManaged(backer)) {
            this.f17659q.c(backer);
        }
        a6.n(o0Var, backer, (Backer) o0Var.J0(Backer.class, this, "backer"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$balance(double d10) {
        if (this.f17659q.i()) {
            if (!this.f17659q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            g10.getTable().B(this.f17658p.f17669n, g10.getObjectKey(), d10, true);
            return;
        }
        this.f17659q.f().e();
        this.f17659q.g().setDouble(this.f17658p.f17669n, d10);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$contributor(ContributorInfo contributorInfo) {
        o0 o0Var = (o0) this.f17659q.f();
        if (this.f17659q.i()) {
            if (!this.f17659q.d() || this.f17659q.e().contains("contributor")) {
                return;
            }
            if (contributorInfo != null && !d1.isManaged(contributorInfo)) {
                ContributorInfo contributorInfo2 = (ContributorInfo) o0Var.J0(ContributorInfo.class, this, "contributor");
                e6.n(o0Var, contributorInfo, contributorInfo2, new HashMap(), Collections.EMPTY_SET);
                contributorInfo = contributorInfo2;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            if (contributorInfo == null) {
                g10.nullifyLink(this.f17658p.f17667l);
                return;
            }
            this.f17659q.c(contributorInfo);
            g10.getTable().D(this.f17658p.f17667l, g10.getObjectKey(), ((io.realm.internal.o) contributorInfo).b().g().getObjectKey(), true);
            return;
        }
        this.f17659q.f().e();
        if (contributorInfo == null) {
            this.f17659q.g().nullifyLink(this.f17658p.f17667l);
            return;
        }
        if (d1.isManaged(contributorInfo)) {
            this.f17659q.c(contributorInfo);
        }
        e6.n(o0Var, contributorInfo, (ContributorInfo) o0Var.J0(ContributorInfo.class, this, "contributor"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$costume(Outfit outfit) {
        o0 o0Var = (o0) this.f17659q.f();
        if (this.f17659q.i()) {
            if (!this.f17659q.d() || this.f17659q.e().contains("costume")) {
                return;
            }
            if (outfit != null && !d1.isManaged(outfit)) {
                Outfit outfit2 = (Outfit) o0Var.J0(Outfit.class, this, "costume");
                u6.n(o0Var, outfit, outfit2, new HashMap(), Collections.EMPTY_SET);
                outfit = outfit2;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            if (outfit == null) {
                g10.nullifyLink(this.f17658p.f17672q);
                return;
            }
            this.f17659q.c(outfit);
            g10.getTable().D(this.f17658p.f17672q, g10.getObjectKey(), ((io.realm.internal.o) outfit).b().g().getObjectKey(), true);
            return;
        }
        this.f17659q.f().e();
        if (outfit == null) {
            this.f17659q.g().nullifyLink(this.f17658p.f17672q);
            return;
        }
        if (d1.isManaged(outfit)) {
            this.f17659q.c(outfit);
        }
        u6.n(o0Var, outfit, (Outfit) o0Var.J0(Outfit.class, this, "costume"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$currentMount(String str) {
        if (this.f17659q.i()) {
            if (!this.f17659q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            if (str == null) {
                g10.getTable().F(this.f17658p.f17674s, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17658p.f17674s, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17659q.f().e();
        if (str == null) {
            this.f17659q.g().setNull(this.f17658p.f17674s);
        } else {
            this.f17659q.g().setString(this.f17658p.f17674s, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$currentPet(String str) {
        if (this.f17659q.i()) {
            if (!this.f17659q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            if (str == null) {
                g10.getTable().F(this.f17658p.f17675t, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17658p.f17675t, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17659q.f().e();
        if (str == null) {
            this.f17659q.g().setNull(this.f17658p.f17675t);
        } else {
            this.f17659q.g().setString(this.f17658p.f17675t, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$equipped(Outfit outfit) {
        o0 o0Var = (o0) this.f17659q.f();
        if (this.f17659q.i()) {
            if (!this.f17659q.d() || this.f17659q.e().contains("equipped")) {
                return;
            }
            if (outfit != null && !d1.isManaged(outfit)) {
                Outfit outfit2 = (Outfit) o0Var.J0(Outfit.class, this, "equipped");
                u6.n(o0Var, outfit, outfit2, new HashMap(), Collections.EMPTY_SET);
                outfit = outfit2;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            if (outfit == null) {
                g10.nullifyLink(this.f17658p.f17673r);
                return;
            }
            this.f17659q.c(outfit);
            g10.getTable().D(this.f17658p.f17673r, g10.getObjectKey(), ((io.realm.internal.o) outfit).b().g().getObjectKey(), true);
            return;
        }
        this.f17659q.f().e();
        if (outfit == null) {
            this.f17659q.g().nullifyLink(this.f17658p.f17673r);
            return;
        }
        if (d1.isManaged(outfit)) {
            this.f17659q.c(outfit);
        }
        u6.n(o0Var, outfit, (Outfit) o0Var.J0(Outfit.class, this, "equipped"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$flags(MemberFlags memberFlags) {
        o0 o0Var = (o0) this.f17659q.f();
        if (this.f17659q.i()) {
            if (!this.f17659q.d() || this.f17659q.e().contains("flags")) {
                return;
            }
            if (memberFlags != null && !d1.isManaged(memberFlags)) {
                MemberFlags memberFlags2 = (MemberFlags) o0Var.J0(MemberFlags.class, this, "flags");
                e4.n(o0Var, memberFlags, memberFlags2, new HashMap(), Collections.EMPTY_SET);
                memberFlags = memberFlags2;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            if (memberFlags == null) {
                g10.nullifyLink(this.f17658p.f17664i);
                return;
            }
            this.f17659q.c(memberFlags);
            g10.getTable().D(this.f17658p.f17664i, g10.getObjectKey(), ((io.realm.internal.o) memberFlags).b().g().getObjectKey(), true);
            return;
        }
        this.f17659q.f().e();
        if (memberFlags == null) {
            this.f17659q.g().nullifyLink(this.f17658p.f17664i);
            return;
        }
        if (d1.isManaged(memberFlags)) {
            this.f17659q.c(memberFlags);
        }
        e4.n(o0Var, memberFlags, (MemberFlags) o0Var.J0(MemberFlags.class, this, "flags"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$id(String str) {
        if (this.f17659q.i()) {
            return;
        }
        this.f17659q.f().e();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$inbox(Inbox inbox) {
        o0 o0Var = (o0) this.f17659q.f();
        if (this.f17659q.i()) {
            if (!this.f17659q.d() || this.f17659q.e().contains("inbox")) {
                return;
            }
            if (inbox != null && !d1.isManaged(inbox)) {
                Inbox inbox2 = (Inbox) o0Var.J0(Inbox.class, this, "inbox");
                q6.n(o0Var, inbox, inbox2, new HashMap(), Collections.EMPTY_SET);
                inbox = inbox2;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            if (inbox == null) {
                g10.nullifyLink(this.f17658p.f17662g);
                return;
            }
            this.f17659q.c(inbox);
            g10.getTable().D(this.f17658p.f17662g, g10.getObjectKey(), ((io.realm.internal.o) inbox).b().g().getObjectKey(), true);
            return;
        }
        this.f17659q.f().e();
        if (inbox == null) {
            this.f17659q.g().nullifyLink(this.f17658p.f17662g);
            return;
        }
        if (d1.isManaged(inbox)) {
            this.f17659q.c(inbox);
        }
        q6.n(o0Var, inbox, (Inbox) o0Var.J0(Inbox.class, this, "inbox"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$items(Items items) {
        o0 o0Var = (o0) this.f17659q.f();
        if (this.f17659q.i()) {
            if (!this.f17659q.d() || this.f17659q.e().contains(NavigationDrawerFragment.SIDEBAR_ITEMS)) {
                return;
            }
            if (items != null && !d1.isManaged(items)) {
                Items items2 = (Items) o0Var.J0(Items.class, this, NavigationDrawerFragment.SIDEBAR_ITEMS);
                s6.n(o0Var, items, items2, new HashMap(), Collections.EMPTY_SET);
                items = items2;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            if (items == null) {
                g10.nullifyLink(this.f17658p.f17671p);
                return;
            }
            this.f17659q.c(items);
            g10.getTable().D(this.f17658p.f17671p, g10.getObjectKey(), ((io.realm.internal.o) items).b().g().getObjectKey(), true);
            return;
        }
        this.f17659q.f().e();
        if (items == null) {
            this.f17659q.g().nullifyLink(this.f17658p.f17671p);
            return;
        }
        if (d1.isManaged(items)) {
            this.f17659q.c(items);
        }
        s6.n(o0Var, items, (Items) o0Var.J0(Items.class, this, NavigationDrawerFragment.SIDEBAR_ITEMS), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$loginIncentives(int i10) {
        if (this.f17659q.i()) {
            if (!this.f17659q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            g10.getTable().E(this.f17658p.f17677v, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17659q.f().e();
        this.f17659q.g().setLong(this.f17658p.f17677v, i10);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$participatesInQuest(Boolean bool) {
        if (this.f17659q.i()) {
            if (!this.f17659q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            if (bool == null) {
                g10.getTable().F(this.f17658p.f17676u, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f17658p.f17676u, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f17659q.f().e();
        if (bool == null) {
            this.f17659q.g().setNull(this.f17658p.f17676u);
        } else {
            this.f17659q.g().setBoolean(this.f17658p.f17676u, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$party(UserParty userParty) {
        o0 o0Var = (o0) this.f17659q.f();
        if (this.f17659q.i()) {
            if (!this.f17659q.d() || this.f17659q.e().contains(NavigationDrawerFragment.SIDEBAR_PARTY)) {
                return;
            }
            if (userParty != null && !d1.isManaged(userParty)) {
                UserParty userParty2 = (UserParty) o0Var.J0(UserParty.class, this, NavigationDrawerFragment.SIDEBAR_PARTY);
                e5.n(o0Var, userParty, userParty2, new HashMap(), Collections.EMPTY_SET);
                userParty = userParty2;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            if (userParty == null) {
                g10.nullifyLink(this.f17658p.f17666k);
                return;
            }
            this.f17659q.c(userParty);
            g10.getTable().D(this.f17658p.f17666k, g10.getObjectKey(), ((io.realm.internal.o) userParty).b().g().getObjectKey(), true);
            return;
        }
        this.f17659q.f().e();
        if (userParty == null) {
            this.f17659q.g().nullifyLink(this.f17658p.f17666k);
            return;
        }
        if (d1.isManaged(userParty)) {
            this.f17659q.c(userParty);
        }
        e5.n(o0Var, userParty, (UserParty) o0Var.J0(UserParty.class, this, NavigationDrawerFragment.SIDEBAR_PARTY), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$preferences(MemberPreferences memberPreferences) {
        o0 o0Var = (o0) this.f17659q.f();
        if (this.f17659q.i()) {
            if (!this.f17659q.d() || this.f17659q.e().contains("preferences")) {
                return;
            }
            if (memberPreferences != null && !d1.isManaged(memberPreferences)) {
                MemberPreferences memberPreferences2 = (MemberPreferences) o0Var.J0(MemberPreferences.class, this, "preferences");
                g4.n(o0Var, memberPreferences, memberPreferences2, new HashMap(), Collections.EMPTY_SET);
                memberPreferences = memberPreferences2;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            if (memberPreferences == null) {
                g10.nullifyLink(this.f17658p.f17663h);
                return;
            }
            this.f17659q.c(memberPreferences);
            g10.getTable().D(this.f17658p.f17663h, g10.getObjectKey(), ((io.realm.internal.o) memberPreferences).b().g().getObjectKey(), true);
            return;
        }
        this.f17659q.f().e();
        if (memberPreferences == null) {
            this.f17659q.g().nullifyLink(this.f17658p.f17663h);
            return;
        }
        if (d1.isManaged(memberPreferences)) {
            this.f17659q.c(memberPreferences);
        }
        g4.n(o0Var, memberPreferences, (MemberPreferences) o0Var.J0(MemberPreferences.class, this, "preferences"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$profile(Profile profile) {
        o0 o0Var = (o0) this.f17659q.f();
        if (this.f17659q.i()) {
            if (!this.f17659q.d() || this.f17659q.e().contains(Scopes.PROFILE)) {
                return;
            }
            if (profile != null && !d1.isManaged(profile)) {
                Profile profile2 = (Profile) o0Var.J0(Profile.class, this, Scopes.PROFILE);
                i7.n(o0Var, profile, profile2, new HashMap(), Collections.EMPTY_SET);
                profile = profile2;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            if (profile == null) {
                g10.nullifyLink(this.f17658p.f17665j);
                return;
            }
            this.f17659q.c(profile);
            g10.getTable().D(this.f17658p.f17665j, g10.getObjectKey(), ((io.realm.internal.o) profile).b().g().getObjectKey(), true);
            return;
        }
        this.f17659q.f().e();
        if (profile == null) {
            this.f17659q.g().nullifyLink(this.f17658p.f17665j);
            return;
        }
        if (d1.isManaged(profile)) {
            this.f17659q.c(profile);
        }
        i7.n(o0Var, profile, (Profile) o0Var.J0(Profile.class, this, Scopes.PROFILE), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.members.Member, io.realm.j4
    public void realmSet$stats(Stats stats) {
        o0 o0Var = (o0) this.f17659q.f();
        if (this.f17659q.i()) {
            if (!this.f17659q.d() || this.f17659q.e().contains(NavigationDrawerFragment.SIDEBAR_STATS)) {
                return;
            }
            if (stats != null && !d1.isManaged(stats)) {
                Stats stats2 = (Stats) o0Var.J0(Stats.class, this, NavigationDrawerFragment.SIDEBAR_STATS);
                o7.n(o0Var, stats, stats2, new HashMap(), Collections.EMPTY_SET);
                stats = stats2;
            }
            io.realm.internal.q g10 = this.f17659q.g();
            if (stats == null) {
                g10.nullifyLink(this.f17658p.f17661f);
                return;
            }
            this.f17659q.c(stats);
            g10.getTable().D(this.f17658p.f17661f, g10.getObjectKey(), ((io.realm.internal.o) stats).b().g().getObjectKey(), true);
            return;
        }
        this.f17659q.f().e();
        if (stats == null) {
            this.f17659q.g().nullifyLink(this.f17658p.f17661f);
            return;
        }
        if (d1.isManaged(stats)) {
            this.f17659q.c(stats);
        }
        o7.n(o0Var, stats, (Stats) o0Var.J0(Stats.class, this, NavigationDrawerFragment.SIDEBAR_STATS), new HashMap(), Collections.EMPTY_SET);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Member = proxy[");
        sb2.append("{id:");
        sb2.append(realmGet$id());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{stats:");
        Object obj = "null";
        if (realmGet$stats() == null) {
            str = "null";
        } else {
            str = "Stats";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{inbox:");
        if (realmGet$inbox() == null) {
            str2 = "null";
        } else {
            str2 = "Inbox";
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{preferences:");
        if (realmGet$preferences() == null) {
            str3 = "null";
        } else {
            str3 = "MemberPreferences";
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{flags:");
        if (realmGet$flags() == null) {
            str4 = "null";
        } else {
            str4 = "MemberFlags";
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{profile:");
        if (realmGet$profile() == null) {
            str5 = "null";
        } else {
            str5 = "Profile";
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{party:");
        if (realmGet$party() == null) {
            str6 = "null";
        } else {
            str6 = "UserParty";
        }
        sb2.append(str6);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{contributor:");
        if (realmGet$contributor() == null) {
            str7 = "null";
        } else {
            str7 = "ContributorInfo";
        }
        sb2.append(str7);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{backer:");
        if (realmGet$backer() == null) {
            str8 = "null";
        } else {
            str8 = "Backer";
        }
        sb2.append(str8);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{balance:");
        sb2.append(realmGet$balance());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{authentication:");
        if (realmGet$authentication() == null) {
            str9 = "null";
        } else {
            str9 = "Authentication";
        }
        sb2.append(str9);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{items:");
        if (realmGet$items() == null) {
            str10 = "null";
        } else {
            str10 = "Items";
        }
        sb2.append(str10);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{costume:");
        String str14 = "Outfit";
        if (realmGet$costume() == null) {
            str11 = "null";
        } else {
            str11 = "Outfit";
        }
        sb2.append(str11);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{equipped:");
        if (realmGet$equipped() == null) {
            str14 = "null";
        }
        sb2.append(str14);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{currentMount:");
        if (realmGet$currentMount() == null) {
            str12 = "null";
        } else {
            str12 = realmGet$currentMount();
        }
        sb2.append(str12);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{currentPet:");
        if (realmGet$currentPet() == null) {
            str13 = "null";
        } else {
            str13 = realmGet$currentPet();
        }
        sb2.append(str13);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{participatesInQuest:");
        if (realmGet$participatesInQuest() != null) {
            obj = realmGet$participatesInQuest();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{loginIncentives:");
        sb2.append(realmGet$loginIncentives());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
