package io.realm;

import com.google.android.gms.common.Scopes;
import com.habitrpg.android.habitica.models.QuestAchievement;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.models.invitations.Invitations;
import com.habitrpg.android.habitica.models.social.ChallengeMembership;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.user.ABTest;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.Backer;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.Inbox;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Permissions;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.models.user.UserAchievement;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import io.realm.a;
import io.realm.e7;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.s1;
import io.realm.w1;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_UserRealmProxy.java */
/* loaded from: classes4.dex */
public class a8 extends User implements io.realm.internal.o {
    private static final OsObjectSchemaInfo A = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17312p;

    /* renamed from: q  reason: collision with root package name */
    private l0<User> f17313q;

    /* renamed from: r  reason: collision with root package name */
    private x0<Tag> f17314r;

    /* renamed from: u  reason: collision with root package name */
    private x0<UserAchievement> f17315u;

    /* renamed from: v  reason: collision with root package name */
    private x0<QuestAchievement> f17316v;

    /* renamed from: x  reason: collision with root package name */
    private x0<String> f17317x;

    /* renamed from: y  reason: collision with root package name */
    private x0<ChallengeMembership> f17318y;

    /* renamed from: z  reason: collision with root package name */
    private x0<ABTest> f17319z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_UserRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {
        long A;
        long B;
        long C;
        long D;

        /* renamed from: e  reason: collision with root package name */
        long f17320e;

        /* renamed from: f  reason: collision with root package name */
        long f17321f;

        /* renamed from: g  reason: collision with root package name */
        long f17322g;

        /* renamed from: h  reason: collision with root package name */
        long f17323h;

        /* renamed from: i  reason: collision with root package name */
        long f17324i;

        /* renamed from: j  reason: collision with root package name */
        long f17325j;

        /* renamed from: k  reason: collision with root package name */
        long f17326k;

        /* renamed from: l  reason: collision with root package name */
        long f17327l;

        /* renamed from: m  reason: collision with root package name */
        long f17328m;

        /* renamed from: n  reason: collision with root package name */
        long f17329n;

        /* renamed from: o  reason: collision with root package name */
        long f17330o;

        /* renamed from: p  reason: collision with root package name */
        long f17331p;

        /* renamed from: q  reason: collision with root package name */
        long f17332q;

        /* renamed from: r  reason: collision with root package name */
        long f17333r;

        /* renamed from: s  reason: collision with root package name */
        long f17334s;

        /* renamed from: t  reason: collision with root package name */
        long f17335t;

        /* renamed from: u  reason: collision with root package name */
        long f17336u;

        /* renamed from: v  reason: collision with root package name */
        long f17337v;

        /* renamed from: w  reason: collision with root package name */
        long f17338w;

        /* renamed from: x  reason: collision with root package name */
        long f17339x;

        /* renamed from: y  reason: collision with root package name */
        long f17340y;

        /* renamed from: z  reason: collision with root package name */
        long f17341z;

        a(OsSchemaInfo osSchemaInfo) {
            super(26);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("User");
            this.f17320e = a("id", "id", b10);
            this.f17321f = a("versionNumber", "versionNumber", b10);
            this.f17322g = a("balance", "balance", b10);
            this.f17323h = a(NavigationDrawerFragment.SIDEBAR_STATS, NavigationDrawerFragment.SIDEBAR_STATS, b10);
            this.f17324i = a("inbox", "inbox", b10);
            this.f17325j = a("permissions", "permissions", b10);
            this.f17326k = a("preferences", "preferences", b10);
            this.f17327l = a(Scopes.PROFILE, Scopes.PROFILE, b10);
            this.f17328m = a(NavigationDrawerFragment.SIDEBAR_PARTY, NavigationDrawerFragment.SIDEBAR_PARTY, b10);
            this.f17329n = a(NavigationDrawerFragment.SIDEBAR_ITEMS, NavigationDrawerFragment.SIDEBAR_ITEMS, b10);
            this.f17330o = a("authentication", "authentication", b10);
            this.f17331p = a("flags", "flags", b10);
            this.f17332q = a("contributor", "contributor", b10);
            this.f17333r = a("backer", "backer", b10);
            this.f17334s = a("invitations", "invitations", b10);
            this.f17335t = a("tags", "tags", b10);
            this.f17336u = a(NavigationDrawerFragment.SIDEBAR_ACHIEVEMENTS, NavigationDrawerFragment.SIDEBAR_ACHIEVEMENTS, b10);
            this.f17337v = a("questAchievements", "questAchievements", b10);
            this.f17338w = a("challengeAchievements", "challengeAchievements", b10);
            this.f17339x = a("purchased", "purchased", b10);
            this.f17340y = a(NavigationDrawerFragment.SIDEBAR_CHALLENGES, NavigationDrawerFragment.SIDEBAR_CHALLENGES, b10);
            this.f17341z = a("abTests", "abTests", b10);
            this.A = a("lastCron", "lastCron", b10);
            this.B = a("needsCron", "needsCron", b10);
            this.C = a("loginIncentives", "loginIncentives", b10);
            this.D = a("streakCount", "streakCount", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17320e = aVar.f17320e;
            aVar2.f17321f = aVar.f17321f;
            aVar2.f17322g = aVar.f17322g;
            aVar2.f17323h = aVar.f17323h;
            aVar2.f17324i = aVar.f17324i;
            aVar2.f17325j = aVar.f17325j;
            aVar2.f17326k = aVar.f17326k;
            aVar2.f17327l = aVar.f17327l;
            aVar2.f17328m = aVar.f17328m;
            aVar2.f17329n = aVar.f17329n;
            aVar2.f17330o = aVar.f17330o;
            aVar2.f17331p = aVar.f17331p;
            aVar2.f17332q = aVar.f17332q;
            aVar2.f17333r = aVar.f17333r;
            aVar2.f17334s = aVar.f17334s;
            aVar2.f17335t = aVar.f17335t;
            aVar2.f17336u = aVar.f17336u;
            aVar2.f17337v = aVar.f17337v;
            aVar2.f17338w = aVar.f17338w;
            aVar2.f17339x = aVar.f17339x;
            aVar2.f17340y = aVar.f17340y;
            aVar2.f17341z = aVar.f17341z;
            aVar2.A = aVar.A;
            aVar2.B = aVar.B;
            aVar2.C = aVar.C;
            aVar2.D = aVar.D;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a8() {
        this.f17313q.p();
    }

    public static User c(o0 o0Var, a aVar, User user, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        int i10;
        int i11;
        io.realm.internal.o oVar = map.get(user);
        if (oVar != null) {
            return (User) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(User.class), set);
        osObjectBuilder.c1(aVar.f17320e, user.realmGet$id());
        osObjectBuilder.V0(aVar.f17321f, Integer.valueOf(user.realmGet$versionNumber()));
        osObjectBuilder.N0(aVar.f17322g, Double.valueOf(user.realmGet$balance()));
        osObjectBuilder.d1(aVar.f17338w, user.realmGet$challengeAchievements());
        osObjectBuilder.I0(aVar.A, user.realmGet$lastCron());
        osObjectBuilder.F0(aVar.B, Boolean.valueOf(user.realmGet$needsCron()));
        osObjectBuilder.V0(aVar.C, Integer.valueOf(user.realmGet$loginIncentives()));
        osObjectBuilder.V0(aVar.D, Integer.valueOf(user.realmGet$streakCount()));
        a8 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(user, l10);
        Stats realmGet$stats = user.realmGet$stats();
        if (realmGet$stats == null) {
            l10.realmSet$stats(null);
        } else if (((Stats) map.get(realmGet$stats)) == null) {
            o7 k10 = o7.k(o0Var, o0Var.c1(Stats.class).s(l10.b().g().createEmbeddedObject(aVar.f17323h, RealmFieldType.OBJECT)));
            map.put(realmGet$stats, k10);
            o7.n(o0Var, realmGet$stats, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachestats.toString()");
        }
        Inbox realmGet$inbox = user.realmGet$inbox();
        if (realmGet$inbox == null) {
            l10.realmSet$inbox(null);
        } else if (((Inbox) map.get(realmGet$inbox)) == null) {
            q6 k11 = q6.k(o0Var, o0Var.c1(Inbox.class).s(l10.b().g().createEmbeddedObject(aVar.f17324i, RealmFieldType.OBJECT)));
            map.put(realmGet$inbox, k11);
            q6.n(o0Var, realmGet$inbox, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheinbox.toString()");
        }
        Permissions realmGet$permissions = user.realmGet$permissions();
        if (realmGet$permissions == null) {
            l10.realmSet$permissions(null);
        } else {
            Permissions permissions = (Permissions) map.get(realmGet$permissions);
            if (permissions != null) {
                l10.realmSet$permissions(permissions);
            } else {
                l10.realmSet$permissions(e7.d(o0Var, (e7.a) o0Var.R().e(Permissions.class), realmGet$permissions, z10, map, set));
            }
        }
        Preferences realmGet$preferences = user.realmGet$preferences();
        if (realmGet$preferences == null) {
            l10.realmSet$preferences(null);
        } else if (((Preferences) map.get(realmGet$preferences)) == null) {
            g7 k12 = g7.k(o0Var, o0Var.c1(Preferences.class).s(l10.b().g().createEmbeddedObject(aVar.f17326k, RealmFieldType.OBJECT)));
            map.put(realmGet$preferences, k12);
            g7.n(o0Var, realmGet$preferences, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachepreferences.toString()");
        }
        Profile realmGet$profile = user.realmGet$profile();
        if (realmGet$profile == null) {
            l10.realmSet$profile(null);
        } else if (((Profile) map.get(realmGet$profile)) == null) {
            i7 k13 = i7.k(o0Var, o0Var.c1(Profile.class).s(l10.b().g().createEmbeddedObject(aVar.f17327l, RealmFieldType.OBJECT)));
            map.put(realmGet$profile, k13);
            i7.n(o0Var, realmGet$profile, k13, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheprofile.toString()");
        }
        UserParty realmGet$party = user.realmGet$party();
        if (realmGet$party == null) {
            l10.realmSet$party(null);
        } else if (((UserParty) map.get(realmGet$party)) == null) {
            e5 k14 = e5.k(o0Var, o0Var.c1(UserParty.class).s(l10.b().g().createEmbeddedObject(aVar.f17328m, RealmFieldType.OBJECT)));
            map.put(realmGet$party, k14);
            e5.n(o0Var, realmGet$party, k14, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheparty.toString()");
        }
        Items realmGet$items = user.realmGet$items();
        if (realmGet$items == null) {
            l10.realmSet$items(null);
        } else if (((Items) map.get(realmGet$items)) == null) {
            s6 k15 = s6.k(o0Var, o0Var.c1(Items.class).s(l10.b().g().createEmbeddedObject(aVar.f17329n, RealmFieldType.OBJECT)));
            map.put(realmGet$items, k15);
            s6.n(o0Var, realmGet$items, k15, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheitems.toString()");
        }
        Authentication realmGet$authentication = user.realmGet$authentication();
        if (realmGet$authentication == null) {
            l10.realmSet$authentication(null);
        } else if (((Authentication) map.get(realmGet$authentication)) == null) {
            w5 k16 = w5.k(o0Var, o0Var.c1(Authentication.class).s(l10.b().g().createEmbeddedObject(aVar.f17330o, RealmFieldType.OBJECT)));
            map.put(realmGet$authentication, k16);
            w5.n(o0Var, realmGet$authentication, k16, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheauthentication.toString()");
        }
        Flags realmGet$flags = user.realmGet$flags();
        if (realmGet$flags == null) {
            l10.realmSet$flags(null);
        } else if (((Flags) map.get(realmGet$flags)) == null) {
            i6 k17 = i6.k(o0Var, o0Var.c1(Flags.class).s(l10.b().g().createEmbeddedObject(aVar.f17331p, RealmFieldType.OBJECT)));
            map.put(realmGet$flags, k17);
            i6.n(o0Var, realmGet$flags, k17, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheflags.toString()");
        }
        ContributorInfo realmGet$contributor = user.realmGet$contributor();
        if (realmGet$contributor == null) {
            l10.realmSet$contributor(null);
        } else if (((ContributorInfo) map.get(realmGet$contributor)) == null) {
            e6 k18 = e6.k(o0Var, o0Var.c1(ContributorInfo.class).s(l10.b().g().createEmbeddedObject(aVar.f17332q, RealmFieldType.OBJECT)));
            map.put(realmGet$contributor, k18);
            e6.n(o0Var, realmGet$contributor, k18, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecontributor.toString()");
        }
        Backer realmGet$backer = user.realmGet$backer();
        if (realmGet$backer == null) {
            l10.realmSet$backer(null);
        } else if (((Backer) map.get(realmGet$backer)) == null) {
            a6 k19 = a6.k(o0Var, o0Var.c1(Backer.class).s(l10.b().g().createEmbeddedObject(aVar.f17333r, RealmFieldType.OBJECT)));
            map.put(realmGet$backer, k19);
            a6.n(o0Var, realmGet$backer, k19, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachebacker.toString()");
        }
        Invitations realmGet$invitations = user.realmGet$invitations();
        if (realmGet$invitations == null) {
            l10.realmSet$invitations(null);
        } else if (((Invitations) map.get(realmGet$invitations)) == null) {
            a4 k20 = a4.k(o0Var, o0Var.c1(Invitations.class).s(l10.b().g().createEmbeddedObject(aVar.f17334s, RealmFieldType.OBJECT)));
            map.put(realmGet$invitations, k20);
            a4.n(o0Var, realmGet$invitations, k20, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheinvitations.toString()");
        }
        x0<Tag> realmGet$tags = user.realmGet$tags();
        if (realmGet$tags != null) {
            x0<Tag> realmGet$tags2 = l10.realmGet$tags();
            realmGet$tags2.clear();
            int i12 = 0;
            while (i12 < realmGet$tags.size()) {
                Tag tag = realmGet$tags.get(i12);
                Tag tag2 = (Tag) map.get(tag);
                if (tag2 != null) {
                    realmGet$tags2.add(tag2);
                    i11 = i12;
                } else {
                    i11 = i12;
                    realmGet$tags2.add(w1.d(o0Var, (w1.a) o0Var.R().e(Tag.class), tag, z10, map, set));
                }
                i12 = i11 + 1;
            }
        }
        x0<UserAchievement> realmGet$achievements = user.realmGet$achievements();
        if (realmGet$achievements != null) {
            x0<UserAchievement> realmGet$achievements2 = l10.realmGet$achievements();
            realmGet$achievements2.clear();
            for (int i13 = 0; i13 < realmGet$achievements.size(); i13++) {
                UserAchievement userAchievement = realmGet$achievements.get(i13);
                if (((UserAchievement) map.get(userAchievement)) == null) {
                    y7 k21 = y7.k(o0Var, o0Var.c1(UserAchievement.class).s(realmGet$achievements2.m().n()));
                    map.put(userAchievement, k21);
                    y7.n(o0Var, userAchievement, k21, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheachievements.toString()");
                }
            }
        }
        x0<QuestAchievement> realmGet$questAchievements = user.realmGet$questAchievements();
        if (realmGet$questAchievements != null) {
            x0<QuestAchievement> realmGet$questAchievements2 = l10.realmGet$questAchievements();
            realmGet$questAchievements2.clear();
            int i14 = 0;
            while (i14 < realmGet$questAchievements.size()) {
                QuestAchievement questAchievement = realmGet$questAchievements.get(i14);
                QuestAchievement questAchievement2 = (QuestAchievement) map.get(questAchievement);
                if (questAchievement2 != null) {
                    realmGet$questAchievements2.add(questAchievement2);
                    i10 = i14;
                } else {
                    i10 = i14;
                    realmGet$questAchievements2.add(s1.d(o0Var, (s1.a) o0Var.R().e(QuestAchievement.class), questAchievement, z10, map, set));
                }
                i14 = i10 + 1;
            }
        }
        Purchases realmGet$purchased = user.realmGet$purchased();
        if (realmGet$purchased == null) {
            l10.realmSet$purchased(null);
        } else if (((Purchases) map.get(realmGet$purchased)) == null) {
            k7 k22 = k7.k(o0Var, o0Var.c1(Purchases.class).s(l10.b().g().createEmbeddedObject(aVar.f17339x, RealmFieldType.OBJECT)));
            map.put(realmGet$purchased, k22);
            k7.n(o0Var, realmGet$purchased, k22, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachepurchased.toString()");
        }
        x0<ChallengeMembership> realmGet$challenges = user.realmGet$challenges();
        if (realmGet$challenges != null) {
            x0<ChallengeMembership> realmGet$challenges2 = l10.realmGet$challenges();
            realmGet$challenges2.clear();
            for (int i15 = 0; i15 < realmGet$challenges.size(); i15++) {
                ChallengeMembership challengeMembership = realmGet$challenges.get(i15);
                if (((ChallengeMembership) map.get(challengeMembership)) == null) {
                    o4 k23 = o4.k(o0Var, o0Var.c1(ChallengeMembership.class).s(realmGet$challenges2.m().n()));
                    map.put(challengeMembership, k23);
                    o4.n(o0Var, challengeMembership, k23, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachechallenges.toString()");
                }
            }
        }
        x0<ABTest> realmGet$abTests = user.realmGet$abTests();
        if (realmGet$abTests != null) {
            x0<ABTest> realmGet$abTests2 = l10.realmGet$abTests();
            realmGet$abTests2.clear();
            for (int i16 = 0; i16 < realmGet$abTests.size(); i16++) {
                ABTest aBTest = realmGet$abTests.get(i16);
                if (((ABTest) map.get(aBTest)) == null) {
                    s5 k24 = s5.k(o0Var, o0Var.c1(ABTest.class).s(realmGet$abTests2.m().n()));
                    map.put(aBTest, k24);
                    s5.n(o0Var, aBTest, k24, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheabTests.toString()");
                }
            }
        }
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.user.User d(io.realm.o0 r8, io.realm.a8.a r9, com.habitrpg.android.habitica.models.user.User r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.user.User r1 = (com.habitrpg.android.habitica.models.user.User) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.user.User> r2 = com.habitrpg.android.habitica.models.user.User.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17320e
            java.lang.String r5 = r10.realmGet$id()
            if (r5 != 0) goto L67
            long r3 = r2.d(r3)
            goto L6b
        L67:
            long r3 = r2.e(r3, r5)
        L6b:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L73
            r0 = 0
            goto L94
        L73:
            io.realm.internal.UncheckedRow r3 = r2.s(r3)     // Catch: java.lang.Throwable -> L8e
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L8e
            r1 = r0
            r2 = r8
            r4 = r9
            r1.g(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8e
            io.realm.a8 r1 = new io.realm.a8     // Catch: java.lang.Throwable -> L8e
            r1.<init>()     // Catch: java.lang.Throwable -> L8e
            r12.put(r10, r1)     // Catch: java.lang.Throwable -> L8e
            r0.a()
            goto L93
        L8e:
            r8 = move-exception
            r0.a()
            throw r8
        L93:
            r0 = r11
        L94:
            r3 = r1
            if (r0 == 0) goto La1
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            com.habitrpg.android.habitica.models.user.User r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.user.User r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.a8.d(io.realm.o0, io.realm.a8$a, com.habitrpg.android.habitica.models.user.User, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.user.User");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static User f(User user, int i10, int i11, Map<a1, o.a<a1>> map) {
        User user2;
        if (i10 > i11 || user == null) {
            return null;
        }
        o.a<a1> aVar = map.get(user);
        if (aVar == null) {
            user2 = new User();
            map.put(user, new o.a<>(i10, user2));
        } else if (i10 >= aVar.f17831a) {
            return (User) aVar.f17832b;
        } else {
            User user3 = (User) aVar.f17832b;
            aVar.f17831a = i10;
            user2 = user3;
        }
        o0 o0Var = (o0) ((io.realm.internal.o) user).b().f();
        user2.realmSet$id(user.realmGet$id());
        user2.realmSet$versionNumber(user.realmGet$versionNumber());
        user2.realmSet$balance(user.realmGet$balance());
        int i12 = i10 + 1;
        user2.realmSet$stats(o7.f(user.realmGet$stats(), i12, i11, map));
        user2.realmSet$inbox(q6.f(user.realmGet$inbox(), i12, i11, map));
        user2.realmSet$permissions(e7.f(user.realmGet$permissions(), i12, i11, map));
        user2.realmSet$preferences(g7.f(user.realmGet$preferences(), i12, i11, map));
        user2.realmSet$profile(i7.f(user.realmGet$profile(), i12, i11, map));
        user2.realmSet$party(e5.f(user.realmGet$party(), i12, i11, map));
        user2.realmSet$items(s6.f(user.realmGet$items(), i12, i11, map));
        user2.realmSet$authentication(w5.f(user.realmGet$authentication(), i12, i11, map));
        user2.realmSet$flags(i6.f(user.realmGet$flags(), i12, i11, map));
        user2.realmSet$contributor(e6.f(user.realmGet$contributor(), i12, i11, map));
        user2.realmSet$backer(a6.f(user.realmGet$backer(), i12, i11, map));
        user2.realmSet$invitations(a4.f(user.realmGet$invitations(), i12, i11, map));
        if (i10 == i11) {
            user2.realmSet$tags(null);
        } else {
            x0<Tag> realmGet$tags = user.realmGet$tags();
            x0<Tag> x0Var = new x0<>();
            user2.realmSet$tags(x0Var);
            int size = realmGet$tags.size();
            for (int i13 = 0; i13 < size; i13++) {
                x0Var.add(w1.f(realmGet$tags.get(i13), i12, i11, map));
            }
        }
        if (i10 == i11) {
            user2.realmSet$achievements(null);
        } else {
            x0<UserAchievement> realmGet$achievements = user.realmGet$achievements();
            x0<UserAchievement> x0Var2 = new x0<>();
            user2.realmSet$achievements(x0Var2);
            int size2 = realmGet$achievements.size();
            for (int i14 = 0; i14 < size2; i14++) {
                x0Var2.add(y7.f(realmGet$achievements.get(i14), i12, i11, map));
            }
        }
        if (i10 == i11) {
            user2.realmSet$questAchievements(null);
        } else {
            x0<QuestAchievement> realmGet$questAchievements = user.realmGet$questAchievements();
            x0<QuestAchievement> x0Var3 = new x0<>();
            user2.realmSet$questAchievements(x0Var3);
            int size3 = realmGet$questAchievements.size();
            for (int i15 = 0; i15 < size3; i15++) {
                x0Var3.add(s1.f(realmGet$questAchievements.get(i15), i12, i11, map));
            }
        }
        user2.realmSet$challengeAchievements(new x0<>());
        user2.realmGet$challengeAchievements().addAll(user.realmGet$challengeAchievements());
        user2.realmSet$purchased(k7.f(user.realmGet$purchased(), i12, i11, map));
        if (i10 == i11) {
            user2.realmSet$challenges(null);
        } else {
            x0<ChallengeMembership> realmGet$challenges = user.realmGet$challenges();
            x0<ChallengeMembership> x0Var4 = new x0<>();
            user2.realmSet$challenges(x0Var4);
            int size4 = realmGet$challenges.size();
            for (int i16 = 0; i16 < size4; i16++) {
                x0Var4.add(o4.f(realmGet$challenges.get(i16), i12, i11, map));
            }
        }
        if (i10 == i11) {
            user2.realmSet$abTests(null);
        } else {
            x0<ABTest> realmGet$abTests = user.realmGet$abTests();
            x0<ABTest> x0Var5 = new x0<>();
            user2.realmSet$abTests(x0Var5);
            int size5 = realmGet$abTests.size();
            for (int i17 = 0; i17 < size5; i17++) {
                x0Var5.add(s5.f(realmGet$abTests.get(i17), i12, i11, map));
            }
        }
        user2.realmSet$lastCron(user.realmGet$lastCron());
        user2.realmSet$needsCron(user.realmGet$needsCron());
        user2.realmSet$loginIncentives(user.realmGet$loginIncentives());
        user2.realmSet$streakCount(user.realmGet$streakCount());
        return user2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "User", false, 26, 0);
        bVar.b("", "id", RealmFieldType.STRING, true, false, false);
        RealmFieldType realmFieldType = RealmFieldType.INTEGER;
        bVar.b("", "versionNumber", realmFieldType, false, false, true);
        bVar.b("", "balance", RealmFieldType.DOUBLE, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.OBJECT;
        bVar.a("", NavigationDrawerFragment.SIDEBAR_STATS, realmFieldType2, "Stats");
        bVar.a("", "inbox", realmFieldType2, "Inbox");
        bVar.a("", "permissions", realmFieldType2, "Permissions");
        bVar.a("", "preferences", realmFieldType2, "Preferences");
        bVar.a("", Scopes.PROFILE, realmFieldType2, "Profile");
        bVar.a("", NavigationDrawerFragment.SIDEBAR_PARTY, realmFieldType2, "UserParty");
        bVar.a("", NavigationDrawerFragment.SIDEBAR_ITEMS, realmFieldType2, "Items");
        bVar.a("", "authentication", realmFieldType2, "Authentication");
        bVar.a("", "flags", realmFieldType2, "Flags");
        bVar.a("", "contributor", realmFieldType2, "ContributorInfo");
        bVar.a("", "backer", realmFieldType2, "Backer");
        bVar.a("", "invitations", realmFieldType2, "Invitations");
        RealmFieldType realmFieldType3 = RealmFieldType.LIST;
        bVar.a("", "tags", realmFieldType3, "Tag");
        bVar.a("", NavigationDrawerFragment.SIDEBAR_ACHIEVEMENTS, realmFieldType3, "UserAchievement");
        bVar.a("", "questAchievements", realmFieldType3, "QuestAchievement");
        bVar.c("", "challengeAchievements", RealmFieldType.STRING_LIST, false);
        bVar.a("", "purchased", realmFieldType2, "Purchases");
        bVar.a("", NavigationDrawerFragment.SIDEBAR_CHALLENGES, realmFieldType3, "ChallengeMembership");
        bVar.a("", "abTests", realmFieldType3, "ABTest");
        bVar.b("", "lastCron", RealmFieldType.DATE, false, false, false);
        bVar.b("", "needsCron", RealmFieldType.BOOLEAN, false, false, true);
        bVar.b("", "loginIncentives", realmFieldType, false, false, true);
        bVar.b("", "streakCount", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return A;
    }

    public static long i(o0 o0Var, User user, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        a aVar;
        long j11;
        String str;
        a aVar2;
        String str2;
        a aVar3;
        a aVar4;
        long j12;
        Map<a1, Long> map2;
        long j13;
        a aVar5;
        Map<a1, Long> map3 = map;
        if ((user instanceof io.realm.internal.o) && !d1.isFrozen(user)) {
            io.realm.internal.o oVar = (io.realm.internal.o) user;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(User.class);
        long nativePtr = c12.getNativePtr();
        a aVar6 = (a) o0Var.R().e(User.class);
        long j14 = aVar6.f17320e;
        String realmGet$id = user.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j14);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j14, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j14, realmGet$id);
        }
        long j15 = nativeFindFirstString;
        map3.put(user, Long.valueOf(j15));
        Table.nativeSetLong(nativePtr, aVar6.f17321f, j15, user.realmGet$versionNumber(), false);
        Table.nativeSetDouble(nativePtr, aVar6.f17322g, j15, user.realmGet$balance(), false);
        Stats realmGet$stats = user.realmGet$stats();
        if (realmGet$stats != null) {
            Long l10 = map3.get(realmGet$stats);
            if (l10 == null) {
                j10 = j15;
                aVar = aVar6;
                j11 = nativePtr;
                o7.i(o0Var, c12, aVar6.f17323h, j10, realmGet$stats, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
            }
        } else {
            j10 = j15;
            aVar = aVar6;
            j11 = nativePtr;
            Table.nativeNullifyLink(j11, aVar.f17323h, j10);
        }
        Inbox realmGet$inbox = user.realmGet$inbox();
        if (realmGet$inbox != null) {
            Long l11 = map3.get(realmGet$inbox);
            if (l11 == null) {
                q6.i(o0Var, c12, aVar.f17324i, j10, realmGet$inbox, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l11.toString());
            }
        } else {
            Table.nativeNullifyLink(j11, aVar.f17324i, j10);
        }
        Permissions realmGet$permissions = user.realmGet$permissions();
        if (realmGet$permissions == null) {
            str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
            aVar2 = aVar;
            Table.nativeNullifyLink(j11, aVar2.f17325j, j10);
        } else {
            Long l12 = map3.get(realmGet$permissions);
            if (l12 == null) {
                l12 = Long.valueOf(e7.i(o0Var, realmGet$permissions, map3));
            }
            str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
            aVar2 = aVar;
            Table.nativeSetLink(j11, aVar.f17325j, j10, l12.longValue(), false);
        }
        Preferences realmGet$preferences = user.realmGet$preferences();
        if (realmGet$preferences != null) {
            Long l13 = map3.get(realmGet$preferences);
            if (l13 == null) {
                str2 = str;
                aVar3 = aVar2;
                g7.i(o0Var, c12, aVar2.f17326k, j10, realmGet$preferences, map);
            } else {
                throw new IllegalArgumentException(str + l13.toString());
            }
        } else {
            str2 = str;
            aVar3 = aVar2;
            Table.nativeNullifyLink(j11, aVar3.f17326k, j10);
        }
        Profile realmGet$profile = user.realmGet$profile();
        if (realmGet$profile != null) {
            Long l14 = map3.get(realmGet$profile);
            if (l14 == null) {
                i7.i(o0Var, c12, aVar3.f17327l, j10, realmGet$profile, map);
            } else {
                throw new IllegalArgumentException(str2 + l14.toString());
            }
        } else {
            Table.nativeNullifyLink(j11, aVar3.f17327l, j10);
        }
        UserParty realmGet$party = user.realmGet$party();
        if (realmGet$party != null) {
            Long l15 = map3.get(realmGet$party);
            if (l15 == null) {
                e5.i(o0Var, c12, aVar3.f17328m, j10, realmGet$party, map);
            } else {
                throw new IllegalArgumentException(str2 + l15.toString());
            }
        } else {
            Table.nativeNullifyLink(j11, aVar3.f17328m, j10);
        }
        Items realmGet$items = user.realmGet$items();
        if (realmGet$items != null) {
            Long l16 = map3.get(realmGet$items);
            if (l16 == null) {
                s6.i(o0Var, c12, aVar3.f17329n, j10, realmGet$items, map);
            } else {
                throw new IllegalArgumentException(str2 + l16.toString());
            }
        } else {
            Table.nativeNullifyLink(j11, aVar3.f17329n, j10);
        }
        Authentication realmGet$authentication = user.realmGet$authentication();
        if (realmGet$authentication != null) {
            Long l17 = map3.get(realmGet$authentication);
            if (l17 == null) {
                w5.i(o0Var, c12, aVar3.f17330o, j10, realmGet$authentication, map);
            } else {
                throw new IllegalArgumentException(str2 + l17.toString());
            }
        } else {
            Table.nativeNullifyLink(j11, aVar3.f17330o, j10);
        }
        Flags realmGet$flags = user.realmGet$flags();
        if (realmGet$flags != null) {
            Long l18 = map3.get(realmGet$flags);
            if (l18 == null) {
                i6.i(o0Var, c12, aVar3.f17331p, j10, realmGet$flags, map);
            } else {
                throw new IllegalArgumentException(str2 + l18.toString());
            }
        } else {
            Table.nativeNullifyLink(j11, aVar3.f17331p, j10);
        }
        ContributorInfo realmGet$contributor = user.realmGet$contributor();
        if (realmGet$contributor != null) {
            Long l19 = map3.get(realmGet$contributor);
            if (l19 == null) {
                e6.i(o0Var, c12, aVar3.f17332q, j10, realmGet$contributor, map);
            } else {
                throw new IllegalArgumentException(str2 + l19.toString());
            }
        } else {
            Table.nativeNullifyLink(j11, aVar3.f17332q, j10);
        }
        Backer realmGet$backer = user.realmGet$backer();
        if (realmGet$backer != null) {
            Long l20 = map3.get(realmGet$backer);
            if (l20 == null) {
                a6.i(o0Var, c12, aVar3.f17333r, j10, realmGet$backer, map);
            } else {
                throw new IllegalArgumentException(str2 + l20.toString());
            }
        } else {
            Table.nativeNullifyLink(j11, aVar3.f17333r, j10);
        }
        Invitations realmGet$invitations = user.realmGet$invitations();
        if (realmGet$invitations != null) {
            Long l21 = map3.get(realmGet$invitations);
            if (l21 == null) {
                a4.i(o0Var, c12, aVar3.f17334s, j10, realmGet$invitations, map);
            } else {
                throw new IllegalArgumentException(str2 + l21.toString());
            }
        } else {
            Table.nativeNullifyLink(j11, aVar3.f17334s, j10);
        }
        long j16 = j10;
        OsList osList = new OsList(c12.s(j16), aVar3.f17335t);
        x0<Tag> realmGet$tags = user.realmGet$tags();
        if (realmGet$tags != null && realmGet$tags.size() == osList.Y()) {
            int size = realmGet$tags.size();
            int i10 = 0;
            while (i10 < size) {
                Tag tag = realmGet$tags.get(i10);
                Long l22 = map3.get(tag);
                if (l22 == null) {
                    l22 = Long.valueOf(w1.i(o0Var, tag, map3));
                }
                osList.V(i10, l22.longValue());
                i10++;
                aVar3 = aVar3;
            }
            aVar4 = aVar3;
        } else {
            aVar4 = aVar3;
            osList.K();
            if (realmGet$tags != null) {
                Iterator<Tag> it = realmGet$tags.iterator();
                while (it.hasNext()) {
                    Tag next = it.next();
                    Long l23 = map3.get(next);
                    if (l23 == null) {
                        l23 = Long.valueOf(w1.i(o0Var, next, map3));
                    }
                    osList.k(l23.longValue());
                }
            }
        }
        a aVar7 = aVar4;
        OsList osList2 = new OsList(c12.s(j16), aVar7.f17336u);
        x0<UserAchievement> realmGet$achievements = user.realmGet$achievements();
        osList2.K();
        if (realmGet$achievements != null) {
            Iterator<UserAchievement> it2 = realmGet$achievements.iterator();
            while (it2.hasNext()) {
                UserAchievement next2 = it2.next();
                Long l24 = map3.get(next2);
                if (l24 == null) {
                    y7.i(o0Var, c12, aVar7.f17336u, j16, next2, map);
                    j16 = j16;
                    map3 = map;
                } else {
                    throw new IllegalArgumentException(str2 + l24.toString());
                }
            }
        }
        long j17 = j16;
        OsList osList3 = new OsList(c12.s(j17), aVar7.f17337v);
        x0<QuestAchievement> realmGet$questAchievements = user.realmGet$questAchievements();
        if (realmGet$questAchievements != null && realmGet$questAchievements.size() == osList3.Y()) {
            int size2 = realmGet$questAchievements.size();
            int i11 = 0;
            while (i11 < size2) {
                QuestAchievement questAchievement = realmGet$questAchievements.get(i11);
                long j18 = j17;
                Long l25 = map.get(questAchievement);
                if (l25 == null) {
                    l25 = Long.valueOf(s1.i(o0Var, questAchievement, map));
                }
                osList3.V(i11, l25.longValue());
                i11++;
                size2 = size2;
                j17 = j18;
            }
            j12 = j17;
            map2 = map;
        } else {
            j12 = j17;
            map2 = map;
            osList3.K();
            if (realmGet$questAchievements != null) {
                Iterator<QuestAchievement> it3 = realmGet$questAchievements.iterator();
                while (it3.hasNext()) {
                    QuestAchievement next3 = it3.next();
                    Long l26 = map2.get(next3);
                    if (l26 == null) {
                        l26 = Long.valueOf(s1.i(o0Var, next3, map2));
                    }
                    osList3.k(l26.longValue());
                }
            }
        }
        OsList osList4 = new OsList(c12.s(j12), aVar7.f17338w);
        osList4.K();
        x0<String> realmGet$challengeAchievements = user.realmGet$challengeAchievements();
        if (realmGet$challengeAchievements != null) {
            Iterator<String> it4 = realmGet$challengeAchievements.iterator();
            while (it4.hasNext()) {
                String next4 = it4.next();
                if (next4 == null) {
                    osList4.h();
                } else {
                    osList4.l(next4);
                }
            }
        }
        Purchases realmGet$purchased = user.realmGet$purchased();
        if (realmGet$purchased != null) {
            Long l27 = map2.get(realmGet$purchased);
            if (l27 == null) {
                j13 = j12;
                k7.i(o0Var, c12, aVar7.f17339x, j12, realmGet$purchased, map);
            } else {
                throw new IllegalArgumentException(str2 + l27.toString());
            }
        } else {
            j13 = j12;
            Table.nativeNullifyLink(j11, aVar7.f17339x, j13);
        }
        long j19 = j13;
        OsList osList5 = new OsList(c12.s(j19), aVar7.f17340y);
        x0<ChallengeMembership> realmGet$challenges = user.realmGet$challenges();
        osList5.K();
        if (realmGet$challenges != null) {
            Iterator<ChallengeMembership> it5 = realmGet$challenges.iterator();
            while (it5.hasNext()) {
                ChallengeMembership next5 = it5.next();
                Long l28 = map2.get(next5);
                if (l28 == null) {
                    o4.i(o0Var, c12, aVar7.f17340y, j19, next5, map);
                    j19 = j19;
                    map2 = map;
                } else {
                    throw new IllegalArgumentException(str2 + l28.toString());
                }
            }
        }
        long j20 = j19;
        OsList osList6 = new OsList(c12.s(j20), aVar7.f17341z);
        x0<ABTest> realmGet$abTests = user.realmGet$abTests();
        osList6.K();
        if (realmGet$abTests != null) {
            Iterator<ABTest> it6 = realmGet$abTests.iterator();
            while (it6.hasNext()) {
                ABTest next6 = it6.next();
                long j21 = j20;
                Long l29 = map.get(next6);
                if (l29 == null) {
                    s5.i(o0Var, c12, aVar7.f17341z, j21, next6, map);
                    j20 = j21;
                } else {
                    throw new IllegalArgumentException(str2 + l29.toString());
                }
            }
        }
        long j22 = j20;
        Date realmGet$lastCron = user.realmGet$lastCron();
        if (realmGet$lastCron != null) {
            long j23 = aVar7.A;
            long time = realmGet$lastCron.getTime();
            aVar5 = aVar7;
            Table.nativeSetTimestamp(j11, j23, j22, time, false);
        } else {
            aVar5 = aVar7;
            Table.nativeSetNull(j11, aVar5.A, j22, false);
        }
        Table.nativeSetBoolean(j11, aVar5.B, j22, user.realmGet$needsCron(), false);
        Table.nativeSetLong(j11, aVar5.C, j22, user.realmGet$loginIncentives(), false);
        Table.nativeSetLong(j11, aVar5.D, j22, user.realmGet$streakCount(), false);
        return j22;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        long j11;
        long j12;
        a aVar;
        User user;
        long j13;
        a aVar2;
        String str;
        String str2;
        a aVar3;
        long j14;
        a aVar4;
        Table c12 = o0Var.c1(User.class);
        long nativePtr = c12.getNativePtr();
        a aVar5 = (a) o0Var.R().e(User.class);
        long j15 = aVar5.f17320e;
        while (it.hasNext()) {
            User user2 = (User) it.next();
            if (!map.containsKey(user2)) {
                if ((user2 instanceof io.realm.internal.o) && !d1.isFrozen(user2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) user2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(user2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$id = user2.realmGet$id();
                if (realmGet$id == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j15);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j15, realmGet$id);
                }
                if (nativeFindFirstString == -1) {
                    j10 = OsObject.createRowWithPrimaryKey(c12, j15, realmGet$id);
                } else {
                    j10 = nativeFindFirstString;
                }
                map.put(user2, Long.valueOf(j10));
                long j16 = nativePtr;
                long j17 = j10;
                Table.nativeSetLong(j16, aVar5.f17321f, j17, user2.realmGet$versionNumber(), false);
                Table.nativeSetDouble(j16, aVar5.f17322g, j17, user2.realmGet$balance(), false);
                Stats realmGet$stats = user2.realmGet$stats();
                if (realmGet$stats != null) {
                    Long l10 = map.get(realmGet$stats);
                    if (l10 == null) {
                        j11 = j10;
                        j12 = j15;
                        aVar = aVar5;
                        user = user2;
                        j13 = nativePtr;
                        o7.i(o0Var, c12, aVar5.f17323h, j11, realmGet$stats, map);
                    } else {
                        throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
                    }
                } else {
                    j11 = j10;
                    j12 = j15;
                    aVar = aVar5;
                    user = user2;
                    j13 = nativePtr;
                    Table.nativeNullifyLink(j13, aVar.f17323h, j11);
                }
                Inbox realmGet$inbox = user.realmGet$inbox();
                if (realmGet$inbox != null) {
                    Long l11 = map.get(realmGet$inbox);
                    if (l11 == null) {
                        q6.i(o0Var, c12, aVar.f17324i, j11, realmGet$inbox, map);
                    } else {
                        throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l11.toString());
                    }
                } else {
                    Table.nativeNullifyLink(j13, aVar.f17324i, j11);
                }
                Permissions realmGet$permissions = user.realmGet$permissions();
                if (realmGet$permissions != null) {
                    Long l12 = map.get(realmGet$permissions);
                    if (l12 == null) {
                        l12 = Long.valueOf(e7.i(o0Var, realmGet$permissions, map));
                    }
                    aVar2 = aVar;
                    str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
                    Table.nativeSetLink(j13, aVar.f17325j, j11, l12.longValue(), false);
                } else {
                    aVar2 = aVar;
                    str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
                    Table.nativeNullifyLink(j13, aVar2.f17325j, j11);
                }
                Preferences realmGet$preferences = user.realmGet$preferences();
                if (realmGet$preferences != null) {
                    Long l13 = map.get(realmGet$preferences);
                    if (l13 == null) {
                        str2 = str;
                        aVar3 = aVar2;
                        g7.i(o0Var, c12, aVar2.f17326k, j11, realmGet$preferences, map);
                    } else {
                        throw new IllegalArgumentException(str + l13.toString());
                    }
                } else {
                    str2 = str;
                    aVar3 = aVar2;
                    Table.nativeNullifyLink(j13, aVar3.f17326k, j11);
                }
                Profile realmGet$profile = user.realmGet$profile();
                if (realmGet$profile != null) {
                    Long l14 = map.get(realmGet$profile);
                    if (l14 == null) {
                        i7.i(o0Var, c12, aVar3.f17327l, j11, realmGet$profile, map);
                    } else {
                        throw new IllegalArgumentException(str2 + l14.toString());
                    }
                } else {
                    Table.nativeNullifyLink(j13, aVar3.f17327l, j11);
                }
                UserParty realmGet$party = user.realmGet$party();
                if (realmGet$party != null) {
                    Long l15 = map.get(realmGet$party);
                    if (l15 == null) {
                        e5.i(o0Var, c12, aVar3.f17328m, j11, realmGet$party, map);
                    } else {
                        throw new IllegalArgumentException(str2 + l15.toString());
                    }
                } else {
                    Table.nativeNullifyLink(j13, aVar3.f17328m, j11);
                }
                Items realmGet$items = user.realmGet$items();
                if (realmGet$items != null) {
                    Long l16 = map.get(realmGet$items);
                    if (l16 == null) {
                        s6.i(o0Var, c12, aVar3.f17329n, j11, realmGet$items, map);
                    } else {
                        throw new IllegalArgumentException(str2 + l16.toString());
                    }
                } else {
                    Table.nativeNullifyLink(j13, aVar3.f17329n, j11);
                }
                Authentication realmGet$authentication = user.realmGet$authentication();
                if (realmGet$authentication != null) {
                    Long l17 = map.get(realmGet$authentication);
                    if (l17 == null) {
                        w5.i(o0Var, c12, aVar3.f17330o, j11, realmGet$authentication, map);
                    } else {
                        throw new IllegalArgumentException(str2 + l17.toString());
                    }
                } else {
                    Table.nativeNullifyLink(j13, aVar3.f17330o, j11);
                }
                Flags realmGet$flags = user.realmGet$flags();
                if (realmGet$flags != null) {
                    Long l18 = map.get(realmGet$flags);
                    if (l18 == null) {
                        i6.i(o0Var, c12, aVar3.f17331p, j11, realmGet$flags, map);
                    } else {
                        throw new IllegalArgumentException(str2 + l18.toString());
                    }
                } else {
                    Table.nativeNullifyLink(j13, aVar3.f17331p, j11);
                }
                ContributorInfo realmGet$contributor = user.realmGet$contributor();
                if (realmGet$contributor != null) {
                    Long l19 = map.get(realmGet$contributor);
                    if (l19 == null) {
                        e6.i(o0Var, c12, aVar3.f17332q, j11, realmGet$contributor, map);
                    } else {
                        throw new IllegalArgumentException(str2 + l19.toString());
                    }
                } else {
                    Table.nativeNullifyLink(j13, aVar3.f17332q, j11);
                }
                Backer realmGet$backer = user.realmGet$backer();
                if (realmGet$backer != null) {
                    Long l20 = map.get(realmGet$backer);
                    if (l20 == null) {
                        a6.i(o0Var, c12, aVar3.f17333r, j11, realmGet$backer, map);
                    } else {
                        throw new IllegalArgumentException(str2 + l20.toString());
                    }
                } else {
                    Table.nativeNullifyLink(j13, aVar3.f17333r, j11);
                }
                Invitations realmGet$invitations = user.realmGet$invitations();
                if (realmGet$invitations != null) {
                    Long l21 = map.get(realmGet$invitations);
                    if (l21 == null) {
                        a4.i(o0Var, c12, aVar3.f17334s, j11, realmGet$invitations, map);
                    } else {
                        throw new IllegalArgumentException(str2 + l21.toString());
                    }
                } else {
                    Table.nativeNullifyLink(j13, aVar3.f17334s, j11);
                }
                long j18 = j11;
                OsList osList = new OsList(c12.s(j18), aVar3.f17335t);
                x0<Tag> realmGet$tags = user.realmGet$tags();
                if (realmGet$tags != null && realmGet$tags.size() == osList.Y()) {
                    int size = realmGet$tags.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Tag tag = realmGet$tags.get(i10);
                        Long l22 = map.get(tag);
                        if (l22 == null) {
                            l22 = Long.valueOf(w1.i(o0Var, tag, map));
                        }
                        osList.V(i10, l22.longValue());
                    }
                } else {
                    osList.K();
                    if (realmGet$tags != null) {
                        Iterator<Tag> it2 = realmGet$tags.iterator();
                        while (it2.hasNext()) {
                            Tag next = it2.next();
                            Long l23 = map.get(next);
                            if (l23 == null) {
                                l23 = Long.valueOf(w1.i(o0Var, next, map));
                            }
                            osList.k(l23.longValue());
                        }
                    }
                }
                OsList osList2 = new OsList(c12.s(j18), aVar3.f17336u);
                x0<UserAchievement> realmGet$achievements = user.realmGet$achievements();
                osList2.K();
                if (realmGet$achievements != null) {
                    Iterator<UserAchievement> it3 = realmGet$achievements.iterator();
                    while (it3.hasNext()) {
                        UserAchievement next2 = it3.next();
                        Long l24 = map.get(next2);
                        if (l24 == null) {
                            y7.i(o0Var, c12, aVar3.f17336u, j18, next2, map);
                        } else {
                            throw new IllegalArgumentException(str2 + l24.toString());
                        }
                    }
                }
                OsList osList3 = new OsList(c12.s(j18), aVar3.f17337v);
                x0<QuestAchievement> realmGet$questAchievements = user.realmGet$questAchievements();
                if (realmGet$questAchievements != null && realmGet$questAchievements.size() == osList3.Y()) {
                    int size2 = realmGet$questAchievements.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        QuestAchievement questAchievement = realmGet$questAchievements.get(i11);
                        Long l25 = map.get(questAchievement);
                        if (l25 == null) {
                            l25 = Long.valueOf(s1.i(o0Var, questAchievement, map));
                        }
                        osList3.V(i11, l25.longValue());
                    }
                } else {
                    osList3.K();
                    if (realmGet$questAchievements != null) {
                        Iterator<QuestAchievement> it4 = realmGet$questAchievements.iterator();
                        while (it4.hasNext()) {
                            QuestAchievement next3 = it4.next();
                            Long l26 = map.get(next3);
                            if (l26 == null) {
                                l26 = Long.valueOf(s1.i(o0Var, next3, map));
                            }
                            osList3.k(l26.longValue());
                        }
                    }
                }
                OsList osList4 = new OsList(c12.s(j18), aVar3.f17338w);
                osList4.K();
                x0<String> realmGet$challengeAchievements = user.realmGet$challengeAchievements();
                if (realmGet$challengeAchievements != null) {
                    Iterator<String> it5 = realmGet$challengeAchievements.iterator();
                    while (it5.hasNext()) {
                        String next4 = it5.next();
                        if (next4 == null) {
                            osList4.h();
                        } else {
                            osList4.l(next4);
                        }
                    }
                }
                Purchases realmGet$purchased = user.realmGet$purchased();
                if (realmGet$purchased != null) {
                    Long l27 = map.get(realmGet$purchased);
                    if (l27 == null) {
                        k7.i(o0Var, c12, aVar3.f17339x, j18, realmGet$purchased, map);
                    } else {
                        throw new IllegalArgumentException(str2 + l27.toString());
                    }
                } else {
                    Table.nativeNullifyLink(j13, aVar3.f17339x, j18);
                }
                OsList osList5 = new OsList(c12.s(j18), aVar3.f17340y);
                x0<ChallengeMembership> realmGet$challenges = user.realmGet$challenges();
                osList5.K();
                if (realmGet$challenges != null) {
                    Iterator<ChallengeMembership> it6 = realmGet$challenges.iterator();
                    while (it6.hasNext()) {
                        ChallengeMembership next5 = it6.next();
                        Long l28 = map.get(next5);
                        if (l28 == null) {
                            o4.i(o0Var, c12, aVar3.f17340y, j18, next5, map);
                        } else {
                            throw new IllegalArgumentException(str2 + l28.toString());
                        }
                    }
                }
                OsList osList6 = new OsList(c12.s(j18), aVar3.f17341z);
                x0<ABTest> realmGet$abTests = user.realmGet$abTests();
                osList6.K();
                if (realmGet$abTests != null) {
                    Iterator<ABTest> it7 = realmGet$abTests.iterator();
                    while (it7.hasNext()) {
                        ABTest next6 = it7.next();
                        Long l29 = map.get(next6);
                        if (l29 == null) {
                            s5.i(o0Var, c12, aVar3.f17341z, j18, next6, map);
                        } else {
                            throw new IllegalArgumentException(str2 + l29.toString());
                        }
                    }
                }
                Date realmGet$lastCron = user.realmGet$lastCron();
                if (realmGet$lastCron != null) {
                    long j19 = aVar3.A;
                    long time = realmGet$lastCron.getTime();
                    j14 = j18;
                    aVar4 = aVar3;
                    Table.nativeSetTimestamp(j13, j19, j14, time, false);
                } else {
                    j14 = j18;
                    aVar4 = aVar3;
                    Table.nativeSetNull(j13, aVar4.A, j14, false);
                }
                long j20 = j13;
                long j21 = j14;
                Table.nativeSetBoolean(j20, aVar4.B, j21, user.realmGet$needsCron(), false);
                Table.nativeSetLong(j20, aVar4.C, j21, user.realmGet$loginIncentives(), false);
                Table.nativeSetLong(j20, aVar4.D, j21, user.realmGet$streakCount(), false);
                aVar5 = aVar4;
                j15 = j12;
                nativePtr = j13;
            }
        }
    }

    static a8 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(User.class), false, Collections.emptyList());
        a8 a8Var = new a8();
        cVar.a();
        return a8Var;
    }

    static User n(o0 o0Var, a aVar, User user, User user2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(User.class), set);
        osObjectBuilder.c1(aVar.f17320e, user2.realmGet$id());
        osObjectBuilder.V0(aVar.f17321f, Integer.valueOf(user2.realmGet$versionNumber()));
        osObjectBuilder.N0(aVar.f17322g, Double.valueOf(user2.realmGet$balance()));
        Stats realmGet$stats = user2.realmGet$stats();
        if (realmGet$stats == null) {
            osObjectBuilder.Z0(aVar.f17323h);
        } else if (((Stats) map.get(realmGet$stats)) == null) {
            o7 k10 = o7.k(o0Var, o0Var.c1(Stats.class).s(((io.realm.internal.o) user).b().g().createEmbeddedObject(aVar.f17323h, RealmFieldType.OBJECT)));
            map.put(realmGet$stats, k10);
            o7.n(o0Var, realmGet$stats, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachestats.toString()");
        }
        Inbox realmGet$inbox = user2.realmGet$inbox();
        if (realmGet$inbox == null) {
            osObjectBuilder.Z0(aVar.f17324i);
        } else if (((Inbox) map.get(realmGet$inbox)) == null) {
            q6 k11 = q6.k(o0Var, o0Var.c1(Inbox.class).s(((io.realm.internal.o) user).b().g().createEmbeddedObject(aVar.f17324i, RealmFieldType.OBJECT)));
            map.put(realmGet$inbox, k11);
            q6.n(o0Var, realmGet$inbox, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheinbox.toString()");
        }
        Permissions realmGet$permissions = user2.realmGet$permissions();
        if (realmGet$permissions == null) {
            osObjectBuilder.Z0(aVar.f17325j);
        } else {
            Permissions permissions = (Permissions) map.get(realmGet$permissions);
            if (permissions != null) {
                osObjectBuilder.a1(aVar.f17325j, permissions);
            } else {
                osObjectBuilder.a1(aVar.f17325j, e7.d(o0Var, (e7.a) o0Var.R().e(Permissions.class), realmGet$permissions, true, map, set));
            }
        }
        Preferences realmGet$preferences = user2.realmGet$preferences();
        if (realmGet$preferences == null) {
            osObjectBuilder.Z0(aVar.f17326k);
        } else if (((Preferences) map.get(realmGet$preferences)) == null) {
            g7 k12 = g7.k(o0Var, o0Var.c1(Preferences.class).s(((io.realm.internal.o) user).b().g().createEmbeddedObject(aVar.f17326k, RealmFieldType.OBJECT)));
            map.put(realmGet$preferences, k12);
            g7.n(o0Var, realmGet$preferences, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachepreferences.toString()");
        }
        Profile realmGet$profile = user2.realmGet$profile();
        if (realmGet$profile == null) {
            osObjectBuilder.Z0(aVar.f17327l);
        } else if (((Profile) map.get(realmGet$profile)) == null) {
            i7 k13 = i7.k(o0Var, o0Var.c1(Profile.class).s(((io.realm.internal.o) user).b().g().createEmbeddedObject(aVar.f17327l, RealmFieldType.OBJECT)));
            map.put(realmGet$profile, k13);
            i7.n(o0Var, realmGet$profile, k13, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheprofile.toString()");
        }
        UserParty realmGet$party = user2.realmGet$party();
        if (realmGet$party == null) {
            osObjectBuilder.Z0(aVar.f17328m);
        } else if (((UserParty) map.get(realmGet$party)) == null) {
            e5 k14 = e5.k(o0Var, o0Var.c1(UserParty.class).s(((io.realm.internal.o) user).b().g().createEmbeddedObject(aVar.f17328m, RealmFieldType.OBJECT)));
            map.put(realmGet$party, k14);
            e5.n(o0Var, realmGet$party, k14, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheparty.toString()");
        }
        Items realmGet$items = user2.realmGet$items();
        if (realmGet$items == null) {
            osObjectBuilder.Z0(aVar.f17329n);
        } else if (((Items) map.get(realmGet$items)) == null) {
            s6 k15 = s6.k(o0Var, o0Var.c1(Items.class).s(((io.realm.internal.o) user).b().g().createEmbeddedObject(aVar.f17329n, RealmFieldType.OBJECT)));
            map.put(realmGet$items, k15);
            s6.n(o0Var, realmGet$items, k15, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheitems.toString()");
        }
        Authentication realmGet$authentication = user2.realmGet$authentication();
        if (realmGet$authentication == null) {
            osObjectBuilder.Z0(aVar.f17330o);
        } else if (((Authentication) map.get(realmGet$authentication)) == null) {
            w5 k16 = w5.k(o0Var, o0Var.c1(Authentication.class).s(((io.realm.internal.o) user).b().g().createEmbeddedObject(aVar.f17330o, RealmFieldType.OBJECT)));
            map.put(realmGet$authentication, k16);
            w5.n(o0Var, realmGet$authentication, k16, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheauthentication.toString()");
        }
        Flags realmGet$flags = user2.realmGet$flags();
        if (realmGet$flags == null) {
            osObjectBuilder.Z0(aVar.f17331p);
        } else if (((Flags) map.get(realmGet$flags)) == null) {
            i6 k17 = i6.k(o0Var, o0Var.c1(Flags.class).s(((io.realm.internal.o) user).b().g().createEmbeddedObject(aVar.f17331p, RealmFieldType.OBJECT)));
            map.put(realmGet$flags, k17);
            i6.n(o0Var, realmGet$flags, k17, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheflags.toString()");
        }
        ContributorInfo realmGet$contributor = user2.realmGet$contributor();
        if (realmGet$contributor == null) {
            osObjectBuilder.Z0(aVar.f17332q);
        } else if (((ContributorInfo) map.get(realmGet$contributor)) == null) {
            e6 k18 = e6.k(o0Var, o0Var.c1(ContributorInfo.class).s(((io.realm.internal.o) user).b().g().createEmbeddedObject(aVar.f17332q, RealmFieldType.OBJECT)));
            map.put(realmGet$contributor, k18);
            e6.n(o0Var, realmGet$contributor, k18, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecontributor.toString()");
        }
        Backer realmGet$backer = user2.realmGet$backer();
        if (realmGet$backer == null) {
            osObjectBuilder.Z0(aVar.f17333r);
        } else if (((Backer) map.get(realmGet$backer)) == null) {
            a6 k19 = a6.k(o0Var, o0Var.c1(Backer.class).s(((io.realm.internal.o) user).b().g().createEmbeddedObject(aVar.f17333r, RealmFieldType.OBJECT)));
            map.put(realmGet$backer, k19);
            a6.n(o0Var, realmGet$backer, k19, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachebacker.toString()");
        }
        Invitations realmGet$invitations = user2.realmGet$invitations();
        if (realmGet$invitations == null) {
            osObjectBuilder.Z0(aVar.f17334s);
        } else if (((Invitations) map.get(realmGet$invitations)) == null) {
            a4 k20 = a4.k(o0Var, o0Var.c1(Invitations.class).s(((io.realm.internal.o) user).b().g().createEmbeddedObject(aVar.f17334s, RealmFieldType.OBJECT)));
            map.put(realmGet$invitations, k20);
            a4.n(o0Var, realmGet$invitations, k20, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheinvitations.toString()");
        }
        x0<Tag> realmGet$tags = user2.realmGet$tags();
        if (realmGet$tags != null) {
            x0 x0Var = new x0();
            for (int i10 = 0; i10 < realmGet$tags.size(); i10++) {
                Tag tag = realmGet$tags.get(i10);
                Tag tag2 = (Tag) map.get(tag);
                if (tag2 != null) {
                    x0Var.add(tag2);
                } else {
                    x0Var.add(w1.d(o0Var, (w1.a) o0Var.R().e(Tag.class), tag, true, map, set));
                }
            }
            osObjectBuilder.b1(aVar.f17335t, x0Var);
        } else {
            osObjectBuilder.b1(aVar.f17335t, new x0());
        }
        x0<UserAchievement> realmGet$achievements = user2.realmGet$achievements();
        if (realmGet$achievements != null) {
            x0 x0Var2 = new x0();
            OsList m10 = user.realmGet$achievements().m();
            m10.q();
            for (int i11 = 0; i11 < realmGet$achievements.size(); i11++) {
                UserAchievement userAchievement = realmGet$achievements.get(i11);
                if (((UserAchievement) map.get(userAchievement)) == null) {
                    y7 k21 = y7.k(o0Var, o0Var.c1(UserAchievement.class).s(m10.n()));
                    map.put(userAchievement, k21);
                    x0Var2.add(k21);
                    y7.n(o0Var, userAchievement, k21, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheachievements.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f17336u, new x0());
        }
        x0<QuestAchievement> realmGet$questAchievements = user2.realmGet$questAchievements();
        if (realmGet$questAchievements != null) {
            x0 x0Var3 = new x0();
            for (int i12 = 0; i12 < realmGet$questAchievements.size(); i12++) {
                QuestAchievement questAchievement = realmGet$questAchievements.get(i12);
                QuestAchievement questAchievement2 = (QuestAchievement) map.get(questAchievement);
                if (questAchievement2 != null) {
                    x0Var3.add(questAchievement2);
                } else {
                    x0Var3.add(s1.d(o0Var, (s1.a) o0Var.R().e(QuestAchievement.class), questAchievement, true, map, set));
                }
            }
            osObjectBuilder.b1(aVar.f17337v, x0Var3);
        } else {
            osObjectBuilder.b1(aVar.f17337v, new x0());
        }
        osObjectBuilder.d1(aVar.f17338w, user2.realmGet$challengeAchievements());
        Purchases realmGet$purchased = user2.realmGet$purchased();
        if (realmGet$purchased == null) {
            osObjectBuilder.Z0(aVar.f17339x);
        } else if (((Purchases) map.get(realmGet$purchased)) == null) {
            k7 k22 = k7.k(o0Var, o0Var.c1(Purchases.class).s(((io.realm.internal.o) user).b().g().createEmbeddedObject(aVar.f17339x, RealmFieldType.OBJECT)));
            map.put(realmGet$purchased, k22);
            k7.n(o0Var, realmGet$purchased, k22, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachepurchased.toString()");
        }
        x0<ChallengeMembership> realmGet$challenges = user2.realmGet$challenges();
        if (realmGet$challenges != null) {
            x0 x0Var4 = new x0();
            OsList m11 = user.realmGet$challenges().m();
            m11.q();
            for (int i13 = 0; i13 < realmGet$challenges.size(); i13++) {
                ChallengeMembership challengeMembership = realmGet$challenges.get(i13);
                if (((ChallengeMembership) map.get(challengeMembership)) == null) {
                    o4 k23 = o4.k(o0Var, o0Var.c1(ChallengeMembership.class).s(m11.n()));
                    map.put(challengeMembership, k23);
                    x0Var4.add(k23);
                    o4.n(o0Var, challengeMembership, k23, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachechallenges.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f17340y, new x0());
        }
        x0<ABTest> realmGet$abTests = user2.realmGet$abTests();
        if (realmGet$abTests != null) {
            x0 x0Var5 = new x0();
            OsList m12 = user.realmGet$abTests().m();
            m12.q();
            for (int i14 = 0; i14 < realmGet$abTests.size(); i14++) {
                ABTest aBTest = realmGet$abTests.get(i14);
                if (((ABTest) map.get(aBTest)) == null) {
                    s5 k24 = s5.k(o0Var, o0Var.c1(ABTest.class).s(m12.n()));
                    map.put(aBTest, k24);
                    x0Var5.add(k24);
                    s5.n(o0Var, aBTest, k24, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheabTests.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f17341z, new x0());
        }
        osObjectBuilder.I0(aVar.A, user2.realmGet$lastCron());
        osObjectBuilder.F0(aVar.B, Boolean.valueOf(user2.realmGet$needsCron()));
        osObjectBuilder.V0(aVar.C, Integer.valueOf(user2.realmGet$loginIncentives()));
        osObjectBuilder.V0(aVar.D, Integer.valueOf(user2.realmGet$streakCount()));
        osObjectBuilder.g1();
        return user;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17313q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17312p = (a) cVar.c();
        l0<User> l0Var = new l0<>(this);
        this.f17313q = l0Var;
        l0Var.r(cVar.e());
        this.f17313q.s(cVar.f());
        this.f17313q.o(cVar.b());
        this.f17313q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17313q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a8 a8Var = (a8) obj;
        io.realm.a f10 = this.f17313q.f();
        io.realm.a f11 = a8Var.f17313q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17313q.g().getTable().p();
        String p11 = a8Var.f17313q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17313q.g().getObjectKey() == a8Var.f17313q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17313q.f().getPath();
        String p10 = this.f17313q.g().getTable().p();
        long objectKey = this.f17313q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public x0<ABTest> realmGet$abTests() {
        this.f17313q.f().e();
        x0<ABTest> x0Var = this.f17319z;
        if (x0Var != null) {
            return x0Var;
        }
        x0<ABTest> x0Var2 = new x0<>(ABTest.class, this.f17313q.g().getModelList(this.f17312p.f17341z), this.f17313q.f());
        this.f17319z = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public x0<UserAchievement> realmGet$achievements() {
        this.f17313q.f().e();
        x0<UserAchievement> x0Var = this.f17315u;
        if (x0Var != null) {
            return x0Var;
        }
        x0<UserAchievement> x0Var2 = new x0<>(UserAchievement.class, this.f17313q.g().getModelList(this.f17312p.f17336u), this.f17313q.f());
        this.f17315u = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public Authentication realmGet$authentication() {
        this.f17313q.f().e();
        if (this.f17313q.g().isNullLink(this.f17312p.f17330o)) {
            return null;
        }
        return (Authentication) this.f17313q.f().B(Authentication.class, this.f17313q.g().getLink(this.f17312p.f17330o), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public Backer realmGet$backer() {
        this.f17313q.f().e();
        if (this.f17313q.g().isNullLink(this.f17312p.f17333r)) {
            return null;
        }
        return (Backer) this.f17313q.f().B(Backer.class, this.f17313q.g().getLink(this.f17312p.f17333r), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public double realmGet$balance() {
        this.f17313q.f().e();
        return this.f17313q.g().getDouble(this.f17312p.f17322g);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public x0<String> realmGet$challengeAchievements() {
        this.f17313q.f().e();
        x0<String> x0Var = this.f17317x;
        if (x0Var != null) {
            return x0Var;
        }
        x0<String> x0Var2 = new x0<>(String.class, this.f17313q.g().getValueList(this.f17312p.f17338w, RealmFieldType.STRING_LIST), this.f17313q.f());
        this.f17317x = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public x0<ChallengeMembership> realmGet$challenges() {
        this.f17313q.f().e();
        x0<ChallengeMembership> x0Var = this.f17318y;
        if (x0Var != null) {
            return x0Var;
        }
        x0<ChallengeMembership> x0Var2 = new x0<>(ChallengeMembership.class, this.f17313q.g().getModelList(this.f17312p.f17340y), this.f17313q.f());
        this.f17318y = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public ContributorInfo realmGet$contributor() {
        this.f17313q.f().e();
        if (this.f17313q.g().isNullLink(this.f17312p.f17332q)) {
            return null;
        }
        return (ContributorInfo) this.f17313q.f().B(ContributorInfo.class, this.f17313q.g().getLink(this.f17312p.f17332q), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public Flags realmGet$flags() {
        this.f17313q.f().e();
        if (this.f17313q.g().isNullLink(this.f17312p.f17331p)) {
            return null;
        }
        return (Flags) this.f17313q.f().B(Flags.class, this.f17313q.g().getLink(this.f17312p.f17331p), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public String realmGet$id() {
        this.f17313q.f().e();
        return this.f17313q.g().getString(this.f17312p.f17320e);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public Inbox realmGet$inbox() {
        this.f17313q.f().e();
        if (this.f17313q.g().isNullLink(this.f17312p.f17324i)) {
            return null;
        }
        return (Inbox) this.f17313q.f().B(Inbox.class, this.f17313q.g().getLink(this.f17312p.f17324i), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public Invitations realmGet$invitations() {
        this.f17313q.f().e();
        if (this.f17313q.g().isNullLink(this.f17312p.f17334s)) {
            return null;
        }
        return (Invitations) this.f17313q.f().B(Invitations.class, this.f17313q.g().getLink(this.f17312p.f17334s), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public Items realmGet$items() {
        this.f17313q.f().e();
        if (this.f17313q.g().isNullLink(this.f17312p.f17329n)) {
            return null;
        }
        return (Items) this.f17313q.f().B(Items.class, this.f17313q.g().getLink(this.f17312p.f17329n), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public Date realmGet$lastCron() {
        this.f17313q.f().e();
        if (this.f17313q.g().isNull(this.f17312p.A)) {
            return null;
        }
        return this.f17313q.g().getDate(this.f17312p.A);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public int realmGet$loginIncentives() {
        this.f17313q.f().e();
        return (int) this.f17313q.g().getLong(this.f17312p.C);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public boolean realmGet$needsCron() {
        this.f17313q.f().e();
        return this.f17313q.g().getBoolean(this.f17312p.B);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public UserParty realmGet$party() {
        this.f17313q.f().e();
        if (this.f17313q.g().isNullLink(this.f17312p.f17328m)) {
            return null;
        }
        return (UserParty) this.f17313q.f().B(UserParty.class, this.f17313q.g().getLink(this.f17312p.f17328m), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public Permissions realmGet$permissions() {
        this.f17313q.f().e();
        if (this.f17313q.g().isNullLink(this.f17312p.f17325j)) {
            return null;
        }
        return (Permissions) this.f17313q.f().B(Permissions.class, this.f17313q.g().getLink(this.f17312p.f17325j), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public Preferences realmGet$preferences() {
        this.f17313q.f().e();
        if (this.f17313q.g().isNullLink(this.f17312p.f17326k)) {
            return null;
        }
        return (Preferences) this.f17313q.f().B(Preferences.class, this.f17313q.g().getLink(this.f17312p.f17326k), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public Profile realmGet$profile() {
        this.f17313q.f().e();
        if (this.f17313q.g().isNullLink(this.f17312p.f17327l)) {
            return null;
        }
        return (Profile) this.f17313q.f().B(Profile.class, this.f17313q.g().getLink(this.f17312p.f17327l), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public Purchases realmGet$purchased() {
        this.f17313q.f().e();
        if (this.f17313q.g().isNullLink(this.f17312p.f17339x)) {
            return null;
        }
        return (Purchases) this.f17313q.f().B(Purchases.class, this.f17313q.g().getLink(this.f17312p.f17339x), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public x0<QuestAchievement> realmGet$questAchievements() {
        this.f17313q.f().e();
        x0<QuestAchievement> x0Var = this.f17316v;
        if (x0Var != null) {
            return x0Var;
        }
        x0<QuestAchievement> x0Var2 = new x0<>(QuestAchievement.class, this.f17313q.g().getModelList(this.f17312p.f17337v), this.f17313q.f());
        this.f17316v = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public Stats realmGet$stats() {
        this.f17313q.f().e();
        if (this.f17313q.g().isNullLink(this.f17312p.f17323h)) {
            return null;
        }
        return (Stats) this.f17313q.f().B(Stats.class, this.f17313q.g().getLink(this.f17312p.f17323h), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public int realmGet$streakCount() {
        this.f17313q.f().e();
        return (int) this.f17313q.g().getLong(this.f17312p.D);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public x0<Tag> realmGet$tags() {
        this.f17313q.f().e();
        x0<Tag> x0Var = this.f17314r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<Tag> x0Var2 = new x0<>(Tag.class, this.f17313q.g().getModelList(this.f17312p.f17335t), this.f17313q.f());
        this.f17314r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public int realmGet$versionNumber() {
        this.f17313q.f().e();
        return (int) this.f17313q.g().getLong(this.f17312p.f17321f);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$abTests(x0<ABTest> x0Var) {
        int i10 = 0;
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains("abTests")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17313q.f();
                x0<ABTest> x0Var2 = new x0<>();
                Iterator<ABTest> it = x0Var.iterator();
                while (it.hasNext()) {
                    ABTest next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((ABTest) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17313q.f().e();
        OsList modelList = this.f17313q.g().getModelList(this.f17312p.f17341z);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                ABTest aBTest = x0Var.get(i10);
                this.f17313q.c(aBTest);
                modelList.V(i10, ((io.realm.internal.o) aBTest).b().g().getObjectKey());
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
            ABTest aBTest2 = x0Var.get(i10);
            this.f17313q.c(aBTest2);
            modelList.k(((io.realm.internal.o) aBTest2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$achievements(x0<UserAchievement> x0Var) {
        int i10 = 0;
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains(NavigationDrawerFragment.SIDEBAR_ACHIEVEMENTS)) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17313q.f();
                x0<UserAchievement> x0Var2 = new x0<>();
                Iterator<UserAchievement> it = x0Var.iterator();
                while (it.hasNext()) {
                    UserAchievement next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((UserAchievement) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17313q.f().e();
        OsList modelList = this.f17313q.g().getModelList(this.f17312p.f17336u);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                UserAchievement userAchievement = x0Var.get(i10);
                this.f17313q.c(userAchievement);
                modelList.V(i10, ((io.realm.internal.o) userAchievement).b().g().getObjectKey());
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
            UserAchievement userAchievement2 = x0Var.get(i10);
            this.f17313q.c(userAchievement2);
            modelList.k(((io.realm.internal.o) userAchievement2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$authentication(Authentication authentication) {
        o0 o0Var = (o0) this.f17313q.f();
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains("authentication")) {
                return;
            }
            if (authentication != null && !d1.isManaged(authentication)) {
                Authentication authentication2 = (Authentication) o0Var.J0(Authentication.class, this, "authentication");
                w5.n(o0Var, authentication, authentication2, new HashMap(), Collections.EMPTY_SET);
                authentication = authentication2;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            if (authentication == null) {
                g10.nullifyLink(this.f17312p.f17330o);
                return;
            }
            this.f17313q.c(authentication);
            g10.getTable().D(this.f17312p.f17330o, g10.getObjectKey(), ((io.realm.internal.o) authentication).b().g().getObjectKey(), true);
            return;
        }
        this.f17313q.f().e();
        if (authentication == null) {
            this.f17313q.g().nullifyLink(this.f17312p.f17330o);
            return;
        }
        if (d1.isManaged(authentication)) {
            this.f17313q.c(authentication);
        }
        w5.n(o0Var, authentication, (Authentication) o0Var.J0(Authentication.class, this, "authentication"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$backer(Backer backer) {
        o0 o0Var = (o0) this.f17313q.f();
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains("backer")) {
                return;
            }
            if (backer != null && !d1.isManaged(backer)) {
                Backer backer2 = (Backer) o0Var.J0(Backer.class, this, "backer");
                a6.n(o0Var, backer, backer2, new HashMap(), Collections.EMPTY_SET);
                backer = backer2;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            if (backer == null) {
                g10.nullifyLink(this.f17312p.f17333r);
                return;
            }
            this.f17313q.c(backer);
            g10.getTable().D(this.f17312p.f17333r, g10.getObjectKey(), ((io.realm.internal.o) backer).b().g().getObjectKey(), true);
            return;
        }
        this.f17313q.f().e();
        if (backer == null) {
            this.f17313q.g().nullifyLink(this.f17312p.f17333r);
            return;
        }
        if (d1.isManaged(backer)) {
            this.f17313q.c(backer);
        }
        a6.n(o0Var, backer, (Backer) o0Var.J0(Backer.class, this, "backer"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$balance(double d10) {
        if (this.f17313q.i()) {
            if (!this.f17313q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            g10.getTable().B(this.f17312p.f17322g, g10.getObjectKey(), d10, true);
            return;
        }
        this.f17313q.f().e();
        this.f17313q.g().setDouble(this.f17312p.f17322g, d10);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$challengeAchievements(x0<String> x0Var) {
        if (this.f17313q.i() && (!this.f17313q.d() || this.f17313q.e().contains("challengeAchievements"))) {
            return;
        }
        this.f17313q.f().e();
        OsList valueList = this.f17313q.g().getValueList(this.f17312p.f17338w, RealmFieldType.STRING_LIST);
        valueList.K();
        if (x0Var == null) {
            return;
        }
        Iterator<String> it = x0Var.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next == null) {
                valueList.h();
            } else {
                valueList.l(next);
            }
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$challenges(x0<ChallengeMembership> x0Var) {
        int i10 = 0;
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains(NavigationDrawerFragment.SIDEBAR_CHALLENGES)) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17313q.f();
                x0<ChallengeMembership> x0Var2 = new x0<>();
                Iterator<ChallengeMembership> it = x0Var.iterator();
                while (it.hasNext()) {
                    ChallengeMembership next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((ChallengeMembership) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17313q.f().e();
        OsList modelList = this.f17313q.g().getModelList(this.f17312p.f17340y);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                ChallengeMembership challengeMembership = x0Var.get(i10);
                this.f17313q.c(challengeMembership);
                modelList.V(i10, ((io.realm.internal.o) challengeMembership).b().g().getObjectKey());
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
            ChallengeMembership challengeMembership2 = x0Var.get(i10);
            this.f17313q.c(challengeMembership2);
            modelList.k(((io.realm.internal.o) challengeMembership2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$contributor(ContributorInfo contributorInfo) {
        o0 o0Var = (o0) this.f17313q.f();
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains("contributor")) {
                return;
            }
            if (contributorInfo != null && !d1.isManaged(contributorInfo)) {
                ContributorInfo contributorInfo2 = (ContributorInfo) o0Var.J0(ContributorInfo.class, this, "contributor");
                e6.n(o0Var, contributorInfo, contributorInfo2, new HashMap(), Collections.EMPTY_SET);
                contributorInfo = contributorInfo2;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            if (contributorInfo == null) {
                g10.nullifyLink(this.f17312p.f17332q);
                return;
            }
            this.f17313q.c(contributorInfo);
            g10.getTable().D(this.f17312p.f17332q, g10.getObjectKey(), ((io.realm.internal.o) contributorInfo).b().g().getObjectKey(), true);
            return;
        }
        this.f17313q.f().e();
        if (contributorInfo == null) {
            this.f17313q.g().nullifyLink(this.f17312p.f17332q);
            return;
        }
        if (d1.isManaged(contributorInfo)) {
            this.f17313q.c(contributorInfo);
        }
        e6.n(o0Var, contributorInfo, (ContributorInfo) o0Var.J0(ContributorInfo.class, this, "contributor"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$flags(Flags flags) {
        o0 o0Var = (o0) this.f17313q.f();
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains("flags")) {
                return;
            }
            if (flags != null && !d1.isManaged(flags)) {
                Flags flags2 = (Flags) o0Var.J0(Flags.class, this, "flags");
                i6.n(o0Var, flags, flags2, new HashMap(), Collections.EMPTY_SET);
                flags = flags2;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            if (flags == null) {
                g10.nullifyLink(this.f17312p.f17331p);
                return;
            }
            this.f17313q.c(flags);
            g10.getTable().D(this.f17312p.f17331p, g10.getObjectKey(), ((io.realm.internal.o) flags).b().g().getObjectKey(), true);
            return;
        }
        this.f17313q.f().e();
        if (flags == null) {
            this.f17313q.g().nullifyLink(this.f17312p.f17331p);
            return;
        }
        if (d1.isManaged(flags)) {
            this.f17313q.c(flags);
        }
        i6.n(o0Var, flags, (Flags) o0Var.J0(Flags.class, this, "flags"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$id(String str) {
        if (this.f17313q.i()) {
            return;
        }
        this.f17313q.f().e();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$inbox(Inbox inbox) {
        o0 o0Var = (o0) this.f17313q.f();
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains("inbox")) {
                return;
            }
            if (inbox != null && !d1.isManaged(inbox)) {
                Inbox inbox2 = (Inbox) o0Var.J0(Inbox.class, this, "inbox");
                q6.n(o0Var, inbox, inbox2, new HashMap(), Collections.EMPTY_SET);
                inbox = inbox2;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            if (inbox == null) {
                g10.nullifyLink(this.f17312p.f17324i);
                return;
            }
            this.f17313q.c(inbox);
            g10.getTable().D(this.f17312p.f17324i, g10.getObjectKey(), ((io.realm.internal.o) inbox).b().g().getObjectKey(), true);
            return;
        }
        this.f17313q.f().e();
        if (inbox == null) {
            this.f17313q.g().nullifyLink(this.f17312p.f17324i);
            return;
        }
        if (d1.isManaged(inbox)) {
            this.f17313q.c(inbox);
        }
        q6.n(o0Var, inbox, (Inbox) o0Var.J0(Inbox.class, this, "inbox"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$invitations(Invitations invitations) {
        o0 o0Var = (o0) this.f17313q.f();
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains("invitations")) {
                return;
            }
            if (invitations != null && !d1.isManaged(invitations)) {
                Invitations invitations2 = (Invitations) o0Var.J0(Invitations.class, this, "invitations");
                a4.n(o0Var, invitations, invitations2, new HashMap(), Collections.EMPTY_SET);
                invitations = invitations2;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            if (invitations == null) {
                g10.nullifyLink(this.f17312p.f17334s);
                return;
            }
            this.f17313q.c(invitations);
            g10.getTable().D(this.f17312p.f17334s, g10.getObjectKey(), ((io.realm.internal.o) invitations).b().g().getObjectKey(), true);
            return;
        }
        this.f17313q.f().e();
        if (invitations == null) {
            this.f17313q.g().nullifyLink(this.f17312p.f17334s);
            return;
        }
        if (d1.isManaged(invitations)) {
            this.f17313q.c(invitations);
        }
        a4.n(o0Var, invitations, (Invitations) o0Var.J0(Invitations.class, this, "invitations"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$items(Items items) {
        o0 o0Var = (o0) this.f17313q.f();
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains(NavigationDrawerFragment.SIDEBAR_ITEMS)) {
                return;
            }
            if (items != null && !d1.isManaged(items)) {
                Items items2 = (Items) o0Var.J0(Items.class, this, NavigationDrawerFragment.SIDEBAR_ITEMS);
                s6.n(o0Var, items, items2, new HashMap(), Collections.EMPTY_SET);
                items = items2;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            if (items == null) {
                g10.nullifyLink(this.f17312p.f17329n);
                return;
            }
            this.f17313q.c(items);
            g10.getTable().D(this.f17312p.f17329n, g10.getObjectKey(), ((io.realm.internal.o) items).b().g().getObjectKey(), true);
            return;
        }
        this.f17313q.f().e();
        if (items == null) {
            this.f17313q.g().nullifyLink(this.f17312p.f17329n);
            return;
        }
        if (d1.isManaged(items)) {
            this.f17313q.c(items);
        }
        s6.n(o0Var, items, (Items) o0Var.J0(Items.class, this, NavigationDrawerFragment.SIDEBAR_ITEMS), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$lastCron(Date date) {
        if (this.f17313q.i()) {
            if (!this.f17313q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            if (date == null) {
                g10.getTable().F(this.f17312p.A, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f17312p.A, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f17313q.f().e();
        if (date == null) {
            this.f17313q.g().setNull(this.f17312p.A);
        } else {
            this.f17313q.g().setDate(this.f17312p.A, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$loginIncentives(int i10) {
        if (this.f17313q.i()) {
            if (!this.f17313q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            g10.getTable().E(this.f17312p.C, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17313q.f().e();
        this.f17313q.g().setLong(this.f17312p.C, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$needsCron(boolean z10) {
        if (this.f17313q.i()) {
            if (!this.f17313q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            g10.getTable().z(this.f17312p.B, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17313q.f().e();
        this.f17313q.g().setBoolean(this.f17312p.B, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$party(UserParty userParty) {
        o0 o0Var = (o0) this.f17313q.f();
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains(NavigationDrawerFragment.SIDEBAR_PARTY)) {
                return;
            }
            if (userParty != null && !d1.isManaged(userParty)) {
                UserParty userParty2 = (UserParty) o0Var.J0(UserParty.class, this, NavigationDrawerFragment.SIDEBAR_PARTY);
                e5.n(o0Var, userParty, userParty2, new HashMap(), Collections.EMPTY_SET);
                userParty = userParty2;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            if (userParty == null) {
                g10.nullifyLink(this.f17312p.f17328m);
                return;
            }
            this.f17313q.c(userParty);
            g10.getTable().D(this.f17312p.f17328m, g10.getObjectKey(), ((io.realm.internal.o) userParty).b().g().getObjectKey(), true);
            return;
        }
        this.f17313q.f().e();
        if (userParty == null) {
            this.f17313q.g().nullifyLink(this.f17312p.f17328m);
            return;
        }
        if (d1.isManaged(userParty)) {
            this.f17313q.c(userParty);
        }
        e5.n(o0Var, userParty, (UserParty) o0Var.J0(UserParty.class, this, NavigationDrawerFragment.SIDEBAR_PARTY), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$permissions(Permissions permissions) {
        o0 o0Var = (o0) this.f17313q.f();
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains("permissions")) {
                return;
            }
            if (permissions != null && !d1.isManaged(permissions)) {
                permissions = (Permissions) o0Var.D0(permissions, new v[0]);
            }
            io.realm.internal.q g10 = this.f17313q.g();
            if (permissions == null) {
                g10.nullifyLink(this.f17312p.f17325j);
                return;
            }
            this.f17313q.c(permissions);
            g10.getTable().D(this.f17312p.f17325j, g10.getObjectKey(), ((io.realm.internal.o) permissions).b().g().getObjectKey(), true);
            return;
        }
        this.f17313q.f().e();
        if (permissions == null) {
            this.f17313q.g().nullifyLink(this.f17312p.f17325j);
            return;
        }
        this.f17313q.c(permissions);
        this.f17313q.g().setLink(this.f17312p.f17325j, ((io.realm.internal.o) permissions).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$preferences(Preferences preferences) {
        o0 o0Var = (o0) this.f17313q.f();
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains("preferences")) {
                return;
            }
            if (preferences != null && !d1.isManaged(preferences)) {
                Preferences preferences2 = (Preferences) o0Var.J0(Preferences.class, this, "preferences");
                g7.n(o0Var, preferences, preferences2, new HashMap(), Collections.EMPTY_SET);
                preferences = preferences2;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            if (preferences == null) {
                g10.nullifyLink(this.f17312p.f17326k);
                return;
            }
            this.f17313q.c(preferences);
            g10.getTable().D(this.f17312p.f17326k, g10.getObjectKey(), ((io.realm.internal.o) preferences).b().g().getObjectKey(), true);
            return;
        }
        this.f17313q.f().e();
        if (preferences == null) {
            this.f17313q.g().nullifyLink(this.f17312p.f17326k);
            return;
        }
        if (d1.isManaged(preferences)) {
            this.f17313q.c(preferences);
        }
        g7.n(o0Var, preferences, (Preferences) o0Var.J0(Preferences.class, this, "preferences"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$profile(Profile profile) {
        o0 o0Var = (o0) this.f17313q.f();
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains(Scopes.PROFILE)) {
                return;
            }
            if (profile != null && !d1.isManaged(profile)) {
                Profile profile2 = (Profile) o0Var.J0(Profile.class, this, Scopes.PROFILE);
                i7.n(o0Var, profile, profile2, new HashMap(), Collections.EMPTY_SET);
                profile = profile2;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            if (profile == null) {
                g10.nullifyLink(this.f17312p.f17327l);
                return;
            }
            this.f17313q.c(profile);
            g10.getTable().D(this.f17312p.f17327l, g10.getObjectKey(), ((io.realm.internal.o) profile).b().g().getObjectKey(), true);
            return;
        }
        this.f17313q.f().e();
        if (profile == null) {
            this.f17313q.g().nullifyLink(this.f17312p.f17327l);
            return;
        }
        if (d1.isManaged(profile)) {
            this.f17313q.c(profile);
        }
        i7.n(o0Var, profile, (Profile) o0Var.J0(Profile.class, this, Scopes.PROFILE), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$purchased(Purchases purchases) {
        o0 o0Var = (o0) this.f17313q.f();
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains("purchased")) {
                return;
            }
            if (purchases != null && !d1.isManaged(purchases)) {
                Purchases purchases2 = (Purchases) o0Var.J0(Purchases.class, this, "purchased");
                k7.n(o0Var, purchases, purchases2, new HashMap(), Collections.EMPTY_SET);
                purchases = purchases2;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            if (purchases == null) {
                g10.nullifyLink(this.f17312p.f17339x);
                return;
            }
            this.f17313q.c(purchases);
            g10.getTable().D(this.f17312p.f17339x, g10.getObjectKey(), ((io.realm.internal.o) purchases).b().g().getObjectKey(), true);
            return;
        }
        this.f17313q.f().e();
        if (purchases == null) {
            this.f17313q.g().nullifyLink(this.f17312p.f17339x);
            return;
        }
        if (d1.isManaged(purchases)) {
            this.f17313q.c(purchases);
        }
        k7.n(o0Var, purchases, (Purchases) o0Var.J0(Purchases.class, this, "purchased"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$questAchievements(x0<QuestAchievement> x0Var) {
        int i10 = 0;
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains("questAchievements")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17313q.f();
                x0<QuestAchievement> x0Var2 = new x0<>();
                Iterator<QuestAchievement> it = x0Var.iterator();
                while (it.hasNext()) {
                    QuestAchievement next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((QuestAchievement) o0Var.F0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17313q.f().e();
        OsList modelList = this.f17313q.g().getModelList(this.f17312p.f17337v);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                QuestAchievement questAchievement = x0Var.get(i10);
                this.f17313q.c(questAchievement);
                modelList.V(i10, ((io.realm.internal.o) questAchievement).b().g().getObjectKey());
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
            QuestAchievement questAchievement2 = x0Var.get(i10);
            this.f17313q.c(questAchievement2);
            modelList.k(((io.realm.internal.o) questAchievement2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$stats(Stats stats) {
        o0 o0Var = (o0) this.f17313q.f();
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains(NavigationDrawerFragment.SIDEBAR_STATS)) {
                return;
            }
            if (stats != null && !d1.isManaged(stats)) {
                Stats stats2 = (Stats) o0Var.J0(Stats.class, this, NavigationDrawerFragment.SIDEBAR_STATS);
                o7.n(o0Var, stats, stats2, new HashMap(), Collections.EMPTY_SET);
                stats = stats2;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            if (stats == null) {
                g10.nullifyLink(this.f17312p.f17323h);
                return;
            }
            this.f17313q.c(stats);
            g10.getTable().D(this.f17312p.f17323h, g10.getObjectKey(), ((io.realm.internal.o) stats).b().g().getObjectKey(), true);
            return;
        }
        this.f17313q.f().e();
        if (stats == null) {
            this.f17313q.g().nullifyLink(this.f17312p.f17323h);
            return;
        }
        if (d1.isManaged(stats)) {
            this.f17313q.c(stats);
        }
        o7.n(o0Var, stats, (Stats) o0Var.J0(Stats.class, this, NavigationDrawerFragment.SIDEBAR_STATS), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$streakCount(int i10) {
        if (this.f17313q.i()) {
            if (!this.f17313q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            g10.getTable().E(this.f17312p.D, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17313q.f().e();
        this.f17313q.g().setLong(this.f17312p.D, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$tags(x0<Tag> x0Var) {
        int i10 = 0;
        if (this.f17313q.i()) {
            if (!this.f17313q.d() || this.f17313q.e().contains("tags")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17313q.f();
                x0<Tag> x0Var2 = new x0<>();
                Iterator<Tag> it = x0Var.iterator();
                while (it.hasNext()) {
                    Tag next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((Tag) o0Var.F0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17313q.f().e();
        OsList modelList = this.f17313q.g().getModelList(this.f17312p.f17335t);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                Tag tag = x0Var.get(i10);
                this.f17313q.c(tag);
                modelList.V(i10, ((io.realm.internal.o) tag).b().g().getObjectKey());
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
            Tag tag2 = x0Var.get(i10);
            this.f17313q.c(tag2);
            modelList.k(((io.realm.internal.o) tag2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.User, io.realm.b8
    public void realmSet$versionNumber(int i10) {
        if (this.f17313q.i()) {
            if (!this.f17313q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17313q.g();
            g10.getTable().E(this.f17312p.f17321f, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17313q.f().e();
        this.f17313q.g().setLong(this.f17312p.f17321f, i10);
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
        String str14;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("User = proxy[");
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
        sb2.append("{versionNumber:");
        sb2.append(realmGet$versionNumber());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{balance:");
        sb2.append(realmGet$balance());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{stats:");
        if (realmGet$stats() == null) {
            str2 = "null";
        } else {
            str2 = "Stats";
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{inbox:");
        if (realmGet$inbox() == null) {
            str3 = "null";
        } else {
            str3 = "Inbox";
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{permissions:");
        if (realmGet$permissions() == null) {
            str4 = "null";
        } else {
            str4 = "Permissions";
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{preferences:");
        if (realmGet$preferences() == null) {
            str5 = "null";
        } else {
            str5 = "Preferences";
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{profile:");
        if (realmGet$profile() == null) {
            str6 = "null";
        } else {
            str6 = "Profile";
        }
        sb2.append(str6);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{party:");
        if (realmGet$party() == null) {
            str7 = "null";
        } else {
            str7 = "UserParty";
        }
        sb2.append(str7);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{items:");
        if (realmGet$items() == null) {
            str8 = "null";
        } else {
            str8 = "Items";
        }
        sb2.append(str8);
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
        sb2.append("{flags:");
        if (realmGet$flags() == null) {
            str10 = "null";
        } else {
            str10 = "Flags";
        }
        sb2.append(str10);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{contributor:");
        if (realmGet$contributor() == null) {
            str11 = "null";
        } else {
            str11 = "ContributorInfo";
        }
        sb2.append(str11);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{backer:");
        if (realmGet$backer() == null) {
            str12 = "null";
        } else {
            str12 = "Backer";
        }
        sb2.append(str12);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{invitations:");
        if (realmGet$invitations() == null) {
            str13 = "null";
        } else {
            str13 = "Invitations";
        }
        sb2.append(str13);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{tags:");
        sb2.append("RealmList<Tag>[");
        sb2.append(realmGet$tags().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{achievements:");
        sb2.append("RealmList<UserAchievement>[");
        sb2.append(realmGet$achievements().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{questAchievements:");
        sb2.append("RealmList<QuestAchievement>[");
        sb2.append(realmGet$questAchievements().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{challengeAchievements:");
        sb2.append("RealmList<String>[");
        sb2.append(realmGet$challengeAchievements().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{purchased:");
        if (realmGet$purchased() == null) {
            str14 = "null";
        } else {
            str14 = "Purchases";
        }
        sb2.append(str14);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{challenges:");
        sb2.append("RealmList<ChallengeMembership>[");
        sb2.append(realmGet$challenges().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{abTests:");
        sb2.append("RealmList<ABTest>[");
        sb2.append(realmGet$abTests().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{lastCron:");
        if (realmGet$lastCron() != null) {
            obj = realmGet$lastCron();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{needsCron:");
        sb2.append(realmGet$needsCron());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{loginIncentives:");
        sb2.append(realmGet$loginIncentives());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{streakCount:");
        sb2.append(realmGet$streakCount());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
