package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import io.realm.a;
import io.realm.a5;
import io.realm.a8;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_social_ChallengeRealmProxy.java */
/* loaded from: classes4.dex */
public class q4 extends Challenge implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18109r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18110p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Challenge> f18111q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_social_ChallengeRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18112e;

        /* renamed from: f  reason: collision with root package name */
        long f18113f;

        /* renamed from: g  reason: collision with root package name */
        long f18114g;

        /* renamed from: h  reason: collision with root package name */
        long f18115h;

        /* renamed from: i  reason: collision with root package name */
        long f18116i;

        /* renamed from: j  reason: collision with root package name */
        long f18117j;

        /* renamed from: k  reason: collision with root package name */
        long f18118k;

        /* renamed from: l  reason: collision with root package name */
        long f18119l;

        /* renamed from: m  reason: collision with root package name */
        long f18120m;

        /* renamed from: n  reason: collision with root package name */
        long f18121n;

        /* renamed from: o  reason: collision with root package name */
        long f18122o;

        /* renamed from: p  reason: collision with root package name */
        long f18123p;

        /* renamed from: q  reason: collision with root package name */
        long f18124q;

        /* renamed from: r  reason: collision with root package name */
        long f18125r;

        /* renamed from: s  reason: collision with root package name */
        long f18126s;

        /* renamed from: t  reason: collision with root package name */
        long f18127t;

        /* renamed from: u  reason: collision with root package name */
        long f18128u;

        /* renamed from: v  reason: collision with root package name */
        long f18129v;

        /* renamed from: w  reason: collision with root package name */
        long f18130w;

        /* renamed from: x  reason: collision with root package name */
        long f18131x;

        a(OsSchemaInfo osSchemaInfo) {
            super(20);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Challenge");
            this.f18112e = a("id", "id", b10);
            this.f18113f = a(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, b10);
            this.f18114g = a("shortName", "shortName", b10);
            this.f18115h = a("description", "description", b10);
            this.f18116i = a("leaderName", "leaderName", b10);
            this.f18117j = a("leaderId", "leaderId", b10);
            this.f18118k = a("groupName", "groupName", b10);
            this.f18119l = a(TaskFormActivity.GROUP_ID_KEY, TaskFormActivity.GROUP_ID_KEY, b10);
            this.f18120m = a("prize", "prize", b10);
            this.f18121n = a("official", "official", b10);
            this.f18122o = a("memberCount", "memberCount", b10);
            this.f18123p = a("todoList", "todoList", b10);
            this.f18124q = a("habitList", "habitList", b10);
            this.f18125r = a("dailyList", "dailyList", b10);
            this.f18126s = a("rewardList", "rewardList", b10);
            this.f18127t = a("createdAt", "createdAt", b10);
            this.f18128u = a("updatedAt", "updatedAt", b10);
            this.f18129v = a("group", "group", b10);
            this.f18130w = a("leader", "leader", b10);
            this.f18131x = a("summary", "summary", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18112e = aVar.f18112e;
            aVar2.f18113f = aVar.f18113f;
            aVar2.f18114g = aVar.f18114g;
            aVar2.f18115h = aVar.f18115h;
            aVar2.f18116i = aVar.f18116i;
            aVar2.f18117j = aVar.f18117j;
            aVar2.f18118k = aVar.f18118k;
            aVar2.f18119l = aVar.f18119l;
            aVar2.f18120m = aVar.f18120m;
            aVar2.f18121n = aVar.f18121n;
            aVar2.f18122o = aVar.f18122o;
            aVar2.f18123p = aVar.f18123p;
            aVar2.f18124q = aVar.f18124q;
            aVar2.f18125r = aVar.f18125r;
            aVar2.f18126s = aVar.f18126s;
            aVar2.f18127t = aVar.f18127t;
            aVar2.f18128u = aVar.f18128u;
            aVar2.f18129v = aVar.f18129v;
            aVar2.f18130w = aVar.f18130w;
            aVar2.f18131x = aVar.f18131x;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q4() {
        this.f18111q.p();
    }

    public static Challenge c(o0 o0Var, a aVar, Challenge challenge, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(challenge);
        if (oVar != null) {
            return (Challenge) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Challenge.class), set);
        osObjectBuilder.c1(aVar.f18112e, challenge.realmGet$id());
        osObjectBuilder.c1(aVar.f18113f, challenge.realmGet$name());
        osObjectBuilder.c1(aVar.f18114g, challenge.realmGet$shortName());
        osObjectBuilder.c1(aVar.f18115h, challenge.realmGet$description());
        osObjectBuilder.c1(aVar.f18116i, challenge.realmGet$leaderName());
        osObjectBuilder.c1(aVar.f18117j, challenge.realmGet$leaderId());
        osObjectBuilder.c1(aVar.f18118k, challenge.realmGet$groupName());
        osObjectBuilder.c1(aVar.f18119l, challenge.realmGet$groupId());
        osObjectBuilder.V0(aVar.f18120m, Integer.valueOf(challenge.realmGet$prize()));
        osObjectBuilder.F0(aVar.f18121n, Boolean.valueOf(challenge.realmGet$official()));
        osObjectBuilder.V0(aVar.f18122o, Integer.valueOf(challenge.realmGet$memberCount()));
        osObjectBuilder.c1(aVar.f18123p, challenge.realmGet$todoList());
        osObjectBuilder.c1(aVar.f18124q, challenge.realmGet$habitList());
        osObjectBuilder.c1(aVar.f18125r, challenge.realmGet$dailyList());
        osObjectBuilder.c1(aVar.f18126s, challenge.realmGet$rewardList());
        osObjectBuilder.I0(aVar.f18127t, challenge.realmGet$createdAt());
        osObjectBuilder.I0(aVar.f18128u, challenge.realmGet$updatedAt());
        osObjectBuilder.c1(aVar.f18131x, challenge.realmGet$summary());
        q4 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(challenge, l10);
        Group realmGet$group = challenge.realmGet$group();
        if (realmGet$group == null) {
            l10.realmSet$group(null);
        } else {
            Group group = (Group) map.get(realmGet$group);
            if (group != null) {
                l10.realmSet$group(group);
            } else {
                l10.realmSet$group(a5.d(o0Var, (a5.a) o0Var.R().e(Group.class), realmGet$group, z10, map, set));
            }
        }
        User realmGet$leader = challenge.realmGet$leader();
        if (realmGet$leader == null) {
            l10.realmSet$leader(null);
        } else {
            User user = (User) map.get(realmGet$leader);
            if (user != null) {
                l10.realmSet$leader(user);
            } else {
                l10.realmSet$leader(a8.d(o0Var, (a8.a) o0Var.R().e(User.class), realmGet$leader, z10, map, set));
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
    public static com.habitrpg.android.habitica.models.social.Challenge d(io.realm.o0 r8, io.realm.q4.a r9, com.habitrpg.android.habitica.models.social.Challenge r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.social.Challenge r1 = (com.habitrpg.android.habitica.models.social.Challenge) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.social.Challenge> r2 = com.habitrpg.android.habitica.models.social.Challenge.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18112e
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
            io.realm.q4 r1 = new io.realm.q4     // Catch: java.lang.Throwable -> L8e
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
            com.habitrpg.android.habitica.models.social.Challenge r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.social.Challenge r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.q4.d(io.realm.o0, io.realm.q4$a, com.habitrpg.android.habitica.models.social.Challenge, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.social.Challenge");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Challenge f(Challenge challenge, int i10, int i11, Map<a1, o.a<a1>> map) {
        Challenge challenge2;
        if (i10 <= i11 && challenge != null) {
            o.a<a1> aVar = map.get(challenge);
            if (aVar == null) {
                challenge2 = new Challenge();
                map.put(challenge, new o.a<>(i10, challenge2));
            } else if (i10 >= aVar.f17831a) {
                return (Challenge) aVar.f17832b;
            } else {
                Challenge challenge3 = (Challenge) aVar.f17832b;
                aVar.f17831a = i10;
                challenge2 = challenge3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) challenge).b().f();
            challenge2.realmSet$id(challenge.realmGet$id());
            challenge2.realmSet$name(challenge.realmGet$name());
            challenge2.realmSet$shortName(challenge.realmGet$shortName());
            challenge2.realmSet$description(challenge.realmGet$description());
            challenge2.realmSet$leaderName(challenge.realmGet$leaderName());
            challenge2.realmSet$leaderId(challenge.realmGet$leaderId());
            challenge2.realmSet$groupName(challenge.realmGet$groupName());
            challenge2.realmSet$groupId(challenge.realmGet$groupId());
            challenge2.realmSet$prize(challenge.realmGet$prize());
            challenge2.realmSet$official(challenge.realmGet$official());
            challenge2.realmSet$memberCount(challenge.realmGet$memberCount());
            challenge2.realmSet$todoList(challenge.realmGet$todoList());
            challenge2.realmSet$habitList(challenge.realmGet$habitList());
            challenge2.realmSet$dailyList(challenge.realmGet$dailyList());
            challenge2.realmSet$rewardList(challenge.realmGet$rewardList());
            challenge2.realmSet$createdAt(challenge.realmGet$createdAt());
            challenge2.realmSet$updatedAt(challenge.realmGet$updatedAt());
            int i12 = i10 + 1;
            challenge2.realmSet$group(a5.f(challenge.realmGet$group(), i12, i11, map));
            challenge2.realmSet$leader(a8.f(challenge.realmGet$leader(), i12, i11, map));
            challenge2.realmSet$summary(challenge.realmGet$summary());
            return challenge2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Challenge", false, 20, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.NAME, realmFieldType, false, false, false);
        bVar.b("", "shortName", realmFieldType, false, false, false);
        bVar.b("", "description", realmFieldType, false, false, false);
        bVar.b("", "leaderName", realmFieldType, false, false, false);
        bVar.b("", "leaderId", realmFieldType, false, false, false);
        bVar.b("", "groupName", realmFieldType, false, false, false);
        bVar.b("", TaskFormActivity.GROUP_ID_KEY, realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "prize", realmFieldType2, false, false, true);
        bVar.b("", "official", RealmFieldType.BOOLEAN, false, false, true);
        bVar.b("", "memberCount", realmFieldType2, false, false, true);
        bVar.b("", "todoList", realmFieldType, false, false, false);
        bVar.b("", "habitList", realmFieldType, false, false, false);
        bVar.b("", "dailyList", realmFieldType, false, false, false);
        bVar.b("", "rewardList", realmFieldType, false, false, false);
        RealmFieldType realmFieldType3 = RealmFieldType.DATE;
        bVar.b("", "createdAt", realmFieldType3, false, false, false);
        bVar.b("", "updatedAt", realmFieldType3, false, false, false);
        RealmFieldType realmFieldType4 = RealmFieldType.OBJECT;
        bVar.a("", "group", realmFieldType4, "Group");
        bVar.a("", "leader", realmFieldType4, "User");
        bVar.b("", "summary", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18109r;
    }

    public static long i(o0 o0Var, Challenge challenge, Map<a1, Long> map) {
        long nativeFindFirstString;
        if ((challenge instanceof io.realm.internal.o) && !d1.isFrozen(challenge)) {
            io.realm.internal.o oVar = (io.realm.internal.o) challenge;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Challenge.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Challenge.class);
        long j10 = aVar.f18112e;
        String realmGet$id = challenge.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j10);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j10, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j10, realmGet$id);
        }
        long j11 = nativeFindFirstString;
        map.put(challenge, Long.valueOf(j11));
        String realmGet$name = challenge.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.f18113f, j11, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18113f, j11, false);
        }
        String realmGet$shortName = challenge.realmGet$shortName();
        if (realmGet$shortName != null) {
            Table.nativeSetString(nativePtr, aVar.f18114g, j11, realmGet$shortName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18114g, j11, false);
        }
        String realmGet$description = challenge.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, aVar.f18115h, j11, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18115h, j11, false);
        }
        String realmGet$leaderName = challenge.realmGet$leaderName();
        if (realmGet$leaderName != null) {
            Table.nativeSetString(nativePtr, aVar.f18116i, j11, realmGet$leaderName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18116i, j11, false);
        }
        String realmGet$leaderId = challenge.realmGet$leaderId();
        if (realmGet$leaderId != null) {
            Table.nativeSetString(nativePtr, aVar.f18117j, j11, realmGet$leaderId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18117j, j11, false);
        }
        String realmGet$groupName = challenge.realmGet$groupName();
        if (realmGet$groupName != null) {
            Table.nativeSetString(nativePtr, aVar.f18118k, j11, realmGet$groupName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18118k, j11, false);
        }
        String realmGet$groupId = challenge.realmGet$groupId();
        if (realmGet$groupId != null) {
            Table.nativeSetString(nativePtr, aVar.f18119l, j11, realmGet$groupId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18119l, j11, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f18120m, j11, challenge.realmGet$prize(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f18121n, j11, challenge.realmGet$official(), false);
        Table.nativeSetLong(nativePtr, aVar.f18122o, j11, challenge.realmGet$memberCount(), false);
        String realmGet$todoList = challenge.realmGet$todoList();
        if (realmGet$todoList != null) {
            Table.nativeSetString(nativePtr, aVar.f18123p, j11, realmGet$todoList, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18123p, j11, false);
        }
        String realmGet$habitList = challenge.realmGet$habitList();
        if (realmGet$habitList != null) {
            Table.nativeSetString(nativePtr, aVar.f18124q, j11, realmGet$habitList, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18124q, j11, false);
        }
        String realmGet$dailyList = challenge.realmGet$dailyList();
        if (realmGet$dailyList != null) {
            Table.nativeSetString(nativePtr, aVar.f18125r, j11, realmGet$dailyList, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18125r, j11, false);
        }
        String realmGet$rewardList = challenge.realmGet$rewardList();
        if (realmGet$rewardList != null) {
            Table.nativeSetString(nativePtr, aVar.f18126s, j11, realmGet$rewardList, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18126s, j11, false);
        }
        Date realmGet$createdAt = challenge.realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetTimestamp(nativePtr, aVar.f18127t, j11, realmGet$createdAt.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18127t, j11, false);
        }
        Date realmGet$updatedAt = challenge.realmGet$updatedAt();
        if (realmGet$updatedAt != null) {
            Table.nativeSetTimestamp(nativePtr, aVar.f18128u, j11, realmGet$updatedAt.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18128u, j11, false);
        }
        Group realmGet$group = challenge.realmGet$group();
        if (realmGet$group != null) {
            Long l10 = map.get(realmGet$group);
            if (l10 == null) {
                l10 = Long.valueOf(a5.i(o0Var, realmGet$group, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f18129v, j11, l10.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f18129v, j11);
        }
        User realmGet$leader = challenge.realmGet$leader();
        if (realmGet$leader != null) {
            Long l11 = map.get(realmGet$leader);
            if (l11 == null) {
                l11 = Long.valueOf(a8.i(o0Var, realmGet$leader, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f18130w, j11, l11.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f18130w, j11);
        }
        String realmGet$summary = challenge.realmGet$summary();
        if (realmGet$summary != null) {
            Table.nativeSetString(nativePtr, aVar.f18131x, j11, realmGet$summary, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18131x, j11, false);
        }
        return j11;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        long j11;
        Table c12 = o0Var.c1(Challenge.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Challenge.class);
        long j12 = aVar.f18112e;
        while (it.hasNext()) {
            Challenge challenge = (Challenge) it.next();
            if (!map.containsKey(challenge)) {
                if ((challenge instanceof io.realm.internal.o) && !d1.isFrozen(challenge)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) challenge;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(challenge, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$id = challenge.realmGet$id();
                if (realmGet$id == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j12);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j12, realmGet$id);
                }
                if (nativeFindFirstString == -1) {
                    j10 = OsObject.createRowWithPrimaryKey(c12, j12, realmGet$id);
                } else {
                    j10 = nativeFindFirstString;
                }
                map.put(challenge, Long.valueOf(j10));
                String realmGet$name = challenge.realmGet$name();
                if (realmGet$name != null) {
                    j11 = j12;
                    Table.nativeSetString(nativePtr, aVar.f18113f, j10, realmGet$name, false);
                } else {
                    j11 = j12;
                    Table.nativeSetNull(nativePtr, aVar.f18113f, j10, false);
                }
                String realmGet$shortName = challenge.realmGet$shortName();
                if (realmGet$shortName != null) {
                    Table.nativeSetString(nativePtr, aVar.f18114g, j10, realmGet$shortName, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18114g, j10, false);
                }
                String realmGet$description = challenge.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, aVar.f18115h, j10, realmGet$description, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18115h, j10, false);
                }
                String realmGet$leaderName = challenge.realmGet$leaderName();
                if (realmGet$leaderName != null) {
                    Table.nativeSetString(nativePtr, aVar.f18116i, j10, realmGet$leaderName, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18116i, j10, false);
                }
                String realmGet$leaderId = challenge.realmGet$leaderId();
                if (realmGet$leaderId != null) {
                    Table.nativeSetString(nativePtr, aVar.f18117j, j10, realmGet$leaderId, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18117j, j10, false);
                }
                String realmGet$groupName = challenge.realmGet$groupName();
                if (realmGet$groupName != null) {
                    Table.nativeSetString(nativePtr, aVar.f18118k, j10, realmGet$groupName, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18118k, j10, false);
                }
                String realmGet$groupId = challenge.realmGet$groupId();
                if (realmGet$groupId != null) {
                    Table.nativeSetString(nativePtr, aVar.f18119l, j10, realmGet$groupId, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18119l, j10, false);
                }
                long j13 = j10;
                Table.nativeSetLong(nativePtr, aVar.f18120m, j13, challenge.realmGet$prize(), false);
                Table.nativeSetBoolean(nativePtr, aVar.f18121n, j13, challenge.realmGet$official(), false);
                Table.nativeSetLong(nativePtr, aVar.f18122o, j13, challenge.realmGet$memberCount(), false);
                String realmGet$todoList = challenge.realmGet$todoList();
                if (realmGet$todoList != null) {
                    Table.nativeSetString(nativePtr, aVar.f18123p, j10, realmGet$todoList, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18123p, j10, false);
                }
                String realmGet$habitList = challenge.realmGet$habitList();
                if (realmGet$habitList != null) {
                    Table.nativeSetString(nativePtr, aVar.f18124q, j10, realmGet$habitList, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18124q, j10, false);
                }
                String realmGet$dailyList = challenge.realmGet$dailyList();
                if (realmGet$dailyList != null) {
                    Table.nativeSetString(nativePtr, aVar.f18125r, j10, realmGet$dailyList, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18125r, j10, false);
                }
                String realmGet$rewardList = challenge.realmGet$rewardList();
                if (realmGet$rewardList != null) {
                    Table.nativeSetString(nativePtr, aVar.f18126s, j10, realmGet$rewardList, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18126s, j10, false);
                }
                Date realmGet$createdAt = challenge.realmGet$createdAt();
                if (realmGet$createdAt != null) {
                    Table.nativeSetTimestamp(nativePtr, aVar.f18127t, j10, realmGet$createdAt.getTime(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18127t, j10, false);
                }
                Date realmGet$updatedAt = challenge.realmGet$updatedAt();
                if (realmGet$updatedAt != null) {
                    Table.nativeSetTimestamp(nativePtr, aVar.f18128u, j10, realmGet$updatedAt.getTime(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18128u, j10, false);
                }
                Group realmGet$group = challenge.realmGet$group();
                if (realmGet$group != null) {
                    Long l10 = map.get(realmGet$group);
                    if (l10 == null) {
                        l10 = Long.valueOf(a5.i(o0Var, realmGet$group, map));
                    }
                    Table.nativeSetLink(nativePtr, aVar.f18129v, j10, l10.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar.f18129v, j10);
                }
                User realmGet$leader = challenge.realmGet$leader();
                if (realmGet$leader != null) {
                    Long l11 = map.get(realmGet$leader);
                    if (l11 == null) {
                        l11 = Long.valueOf(a8.i(o0Var, realmGet$leader, map));
                    }
                    Table.nativeSetLink(nativePtr, aVar.f18130w, j10, l11.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar.f18130w, j10);
                }
                String realmGet$summary = challenge.realmGet$summary();
                if (realmGet$summary != null) {
                    Table.nativeSetString(nativePtr, aVar.f18131x, j10, realmGet$summary, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18131x, j10, false);
                }
                j12 = j11;
            }
        }
    }

    static q4 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Challenge.class), false, Collections.emptyList());
        q4 q4Var = new q4();
        cVar.a();
        return q4Var;
    }

    static Challenge n(o0 o0Var, a aVar, Challenge challenge, Challenge challenge2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Challenge.class), set);
        osObjectBuilder.c1(aVar.f18112e, challenge2.realmGet$id());
        osObjectBuilder.c1(aVar.f18113f, challenge2.realmGet$name());
        osObjectBuilder.c1(aVar.f18114g, challenge2.realmGet$shortName());
        osObjectBuilder.c1(aVar.f18115h, challenge2.realmGet$description());
        osObjectBuilder.c1(aVar.f18116i, challenge2.realmGet$leaderName());
        osObjectBuilder.c1(aVar.f18117j, challenge2.realmGet$leaderId());
        osObjectBuilder.c1(aVar.f18118k, challenge2.realmGet$groupName());
        osObjectBuilder.c1(aVar.f18119l, challenge2.realmGet$groupId());
        osObjectBuilder.V0(aVar.f18120m, Integer.valueOf(challenge2.realmGet$prize()));
        osObjectBuilder.F0(aVar.f18121n, Boolean.valueOf(challenge2.realmGet$official()));
        osObjectBuilder.V0(aVar.f18122o, Integer.valueOf(challenge2.realmGet$memberCount()));
        osObjectBuilder.c1(aVar.f18123p, challenge2.realmGet$todoList());
        osObjectBuilder.c1(aVar.f18124q, challenge2.realmGet$habitList());
        osObjectBuilder.c1(aVar.f18125r, challenge2.realmGet$dailyList());
        osObjectBuilder.c1(aVar.f18126s, challenge2.realmGet$rewardList());
        osObjectBuilder.I0(aVar.f18127t, challenge2.realmGet$createdAt());
        osObjectBuilder.I0(aVar.f18128u, challenge2.realmGet$updatedAt());
        Group realmGet$group = challenge2.realmGet$group();
        if (realmGet$group == null) {
            osObjectBuilder.Z0(aVar.f18129v);
        } else {
            Group group = (Group) map.get(realmGet$group);
            if (group != null) {
                osObjectBuilder.a1(aVar.f18129v, group);
            } else {
                osObjectBuilder.a1(aVar.f18129v, a5.d(o0Var, (a5.a) o0Var.R().e(Group.class), realmGet$group, true, map, set));
            }
        }
        User realmGet$leader = challenge2.realmGet$leader();
        if (realmGet$leader == null) {
            osObjectBuilder.Z0(aVar.f18130w);
        } else {
            User user = (User) map.get(realmGet$leader);
            if (user != null) {
                osObjectBuilder.a1(aVar.f18130w, user);
            } else {
                osObjectBuilder.a1(aVar.f18130w, a8.d(o0Var, (a8.a) o0Var.R().e(User.class), realmGet$leader, true, map, set));
            }
        }
        osObjectBuilder.c1(aVar.f18131x, challenge2.realmGet$summary());
        osObjectBuilder.g1();
        return challenge;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18111q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18110p = (a) cVar.c();
        l0<Challenge> l0Var = new l0<>(this);
        this.f18111q = l0Var;
        l0Var.r(cVar.e());
        this.f18111q.s(cVar.f());
        this.f18111q.o(cVar.b());
        this.f18111q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18111q;
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public Date realmGet$createdAt() {
        this.f18111q.f().e();
        if (this.f18111q.g().isNull(this.f18110p.f18127t)) {
            return null;
        }
        return this.f18111q.g().getDate(this.f18110p.f18127t);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public String realmGet$dailyList() {
        this.f18111q.f().e();
        return this.f18111q.g().getString(this.f18110p.f18125r);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public String realmGet$description() {
        this.f18111q.f().e();
        return this.f18111q.g().getString(this.f18110p.f18115h);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public Group realmGet$group() {
        this.f18111q.f().e();
        if (this.f18111q.g().isNullLink(this.f18110p.f18129v)) {
            return null;
        }
        return (Group) this.f18111q.f().B(Group.class, this.f18111q.g().getLink(this.f18110p.f18129v), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public String realmGet$groupId() {
        this.f18111q.f().e();
        return this.f18111q.g().getString(this.f18110p.f18119l);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public String realmGet$groupName() {
        this.f18111q.f().e();
        return this.f18111q.g().getString(this.f18110p.f18118k);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public String realmGet$habitList() {
        this.f18111q.f().e();
        return this.f18111q.g().getString(this.f18110p.f18124q);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public String realmGet$id() {
        this.f18111q.f().e();
        return this.f18111q.g().getString(this.f18110p.f18112e);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public User realmGet$leader() {
        this.f18111q.f().e();
        if (this.f18111q.g().isNullLink(this.f18110p.f18130w)) {
            return null;
        }
        return (User) this.f18111q.f().B(User.class, this.f18111q.g().getLink(this.f18110p.f18130w), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public String realmGet$leaderId() {
        this.f18111q.f().e();
        return this.f18111q.g().getString(this.f18110p.f18117j);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public String realmGet$leaderName() {
        this.f18111q.f().e();
        return this.f18111q.g().getString(this.f18110p.f18116i);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public int realmGet$memberCount() {
        this.f18111q.f().e();
        return (int) this.f18111q.g().getLong(this.f18110p.f18122o);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public String realmGet$name() {
        this.f18111q.f().e();
        return this.f18111q.g().getString(this.f18110p.f18113f);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public boolean realmGet$official() {
        this.f18111q.f().e();
        return this.f18111q.g().getBoolean(this.f18110p.f18121n);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public int realmGet$prize() {
        this.f18111q.f().e();
        return (int) this.f18111q.g().getLong(this.f18110p.f18120m);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public String realmGet$rewardList() {
        this.f18111q.f().e();
        return this.f18111q.g().getString(this.f18110p.f18126s);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public String realmGet$shortName() {
        this.f18111q.f().e();
        return this.f18111q.g().getString(this.f18110p.f18114g);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public String realmGet$summary() {
        this.f18111q.f().e();
        return this.f18111q.g().getString(this.f18110p.f18131x);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public String realmGet$todoList() {
        this.f18111q.f().e();
        return this.f18111q.g().getString(this.f18110p.f18123p);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public Date realmGet$updatedAt() {
        this.f18111q.f().e();
        if (this.f18111q.g().isNull(this.f18110p.f18128u)) {
            return null;
        }
        return this.f18111q.g().getDate(this.f18110p.f18128u);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$createdAt(Date date) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (date == null) {
                g10.getTable().F(this.f18110p.f18127t, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f18110p.f18127t, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f18111q.f().e();
        if (date == null) {
            this.f18111q.g().setNull(this.f18110p.f18127t);
        } else {
            this.f18111q.g().setDate(this.f18110p.f18127t, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$dailyList(String str) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (str == null) {
                g10.getTable().F(this.f18110p.f18125r, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18110p.f18125r, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18111q.f().e();
        if (str == null) {
            this.f18111q.g().setNull(this.f18110p.f18125r);
        } else {
            this.f18111q.g().setString(this.f18110p.f18125r, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$description(String str) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (str == null) {
                g10.getTable().F(this.f18110p.f18115h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18110p.f18115h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18111q.f().e();
        if (str == null) {
            this.f18111q.g().setNull(this.f18110p.f18115h);
        } else {
            this.f18111q.g().setString(this.f18110p.f18115h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$group(Group group) {
        o0 o0Var = (o0) this.f18111q.f();
        if (this.f18111q.i()) {
            if (!this.f18111q.d() || this.f18111q.e().contains("group")) {
                return;
            }
            if (group != null && !d1.isManaged(group)) {
                group = (Group) o0Var.F0(group, new v[0]);
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (group == null) {
                g10.nullifyLink(this.f18110p.f18129v);
                return;
            }
            this.f18111q.c(group);
            g10.getTable().D(this.f18110p.f18129v, g10.getObjectKey(), ((io.realm.internal.o) group).b().g().getObjectKey(), true);
            return;
        }
        this.f18111q.f().e();
        if (group == null) {
            this.f18111q.g().nullifyLink(this.f18110p.f18129v);
            return;
        }
        this.f18111q.c(group);
        this.f18111q.g().setLink(this.f18110p.f18129v, ((io.realm.internal.o) group).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$groupId(String str) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (str == null) {
                g10.getTable().F(this.f18110p.f18119l, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18110p.f18119l, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18111q.f().e();
        if (str == null) {
            this.f18111q.g().setNull(this.f18110p.f18119l);
        } else {
            this.f18111q.g().setString(this.f18110p.f18119l, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$groupName(String str) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (str == null) {
                g10.getTable().F(this.f18110p.f18118k, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18110p.f18118k, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18111q.f().e();
        if (str == null) {
            this.f18111q.g().setNull(this.f18110p.f18118k);
        } else {
            this.f18111q.g().setString(this.f18110p.f18118k, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$habitList(String str) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (str == null) {
                g10.getTable().F(this.f18110p.f18124q, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18110p.f18124q, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18111q.f().e();
        if (str == null) {
            this.f18111q.g().setNull(this.f18110p.f18124q);
        } else {
            this.f18111q.g().setString(this.f18110p.f18124q, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$id(String str) {
        if (this.f18111q.i()) {
            return;
        }
        this.f18111q.f().e();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$leader(User user) {
        o0 o0Var = (o0) this.f18111q.f();
        if (this.f18111q.i()) {
            if (!this.f18111q.d() || this.f18111q.e().contains("leader")) {
                return;
            }
            if (user != null && !d1.isManaged(user)) {
                user = (User) o0Var.F0(user, new v[0]);
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (user == null) {
                g10.nullifyLink(this.f18110p.f18130w);
                return;
            }
            this.f18111q.c(user);
            g10.getTable().D(this.f18110p.f18130w, g10.getObjectKey(), ((io.realm.internal.o) user).b().g().getObjectKey(), true);
            return;
        }
        this.f18111q.f().e();
        if (user == null) {
            this.f18111q.g().nullifyLink(this.f18110p.f18130w);
            return;
        }
        this.f18111q.c(user);
        this.f18111q.g().setLink(this.f18110p.f18130w, ((io.realm.internal.o) user).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$leaderId(String str) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (str == null) {
                g10.getTable().F(this.f18110p.f18117j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18110p.f18117j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18111q.f().e();
        if (str == null) {
            this.f18111q.g().setNull(this.f18110p.f18117j);
        } else {
            this.f18111q.g().setString(this.f18110p.f18117j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$leaderName(String str) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (str == null) {
                g10.getTable().F(this.f18110p.f18116i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18110p.f18116i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18111q.f().e();
        if (str == null) {
            this.f18111q.g().setNull(this.f18110p.f18116i);
        } else {
            this.f18111q.g().setString(this.f18110p.f18116i, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$memberCount(int i10) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            g10.getTable().E(this.f18110p.f18122o, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18111q.f().e();
        this.f18111q.g().setLong(this.f18110p.f18122o, i10);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$name(String str) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (str == null) {
                g10.getTable().F(this.f18110p.f18113f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18110p.f18113f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18111q.f().e();
        if (str == null) {
            this.f18111q.g().setNull(this.f18110p.f18113f);
        } else {
            this.f18111q.g().setString(this.f18110p.f18113f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$official(boolean z10) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            g10.getTable().z(this.f18110p.f18121n, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18111q.f().e();
        this.f18111q.g().setBoolean(this.f18110p.f18121n, z10);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$prize(int i10) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            g10.getTable().E(this.f18110p.f18120m, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18111q.f().e();
        this.f18111q.g().setLong(this.f18110p.f18120m, i10);
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$rewardList(String str) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (str == null) {
                g10.getTable().F(this.f18110p.f18126s, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18110p.f18126s, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18111q.f().e();
        if (str == null) {
            this.f18111q.g().setNull(this.f18110p.f18126s);
        } else {
            this.f18111q.g().setString(this.f18110p.f18126s, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$shortName(String str) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (str == null) {
                g10.getTable().F(this.f18110p.f18114g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18110p.f18114g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18111q.f().e();
        if (str == null) {
            this.f18111q.g().setNull(this.f18110p.f18114g);
        } else {
            this.f18111q.g().setString(this.f18110p.f18114g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$summary(String str) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (str == null) {
                g10.getTable().F(this.f18110p.f18131x, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18110p.f18131x, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18111q.f().e();
        if (str == null) {
            this.f18111q.g().setNull(this.f18110p.f18131x);
        } else {
            this.f18111q.g().setString(this.f18110p.f18131x, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$todoList(String str) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (str == null) {
                g10.getTable().F(this.f18110p.f18123p, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18110p.f18123p, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18111q.f().e();
        if (str == null) {
            this.f18111q.g().setNull(this.f18110p.f18123p);
        } else {
            this.f18111q.g().setString(this.f18110p.f18123p, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Challenge, io.realm.r4
    public void realmSet$updatedAt(Date date) {
        if (this.f18111q.i()) {
            if (!this.f18111q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18111q.g();
            if (date == null) {
                g10.getTable().F(this.f18110p.f18128u, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f18110p.f18128u, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f18111q.f().e();
        if (date == null) {
            this.f18111q.g().setNull(this.f18110p.f18128u);
        } else {
            this.f18111q.g().setDate(this.f18110p.f18128u, date);
        }
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
        Date date;
        Date date2;
        String str13;
        String str14;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Challenge = proxy[");
        sb2.append("{id:");
        String str15 = "null";
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
        sb2.append("{shortName:");
        if (realmGet$shortName() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$shortName();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{description:");
        if (realmGet$description() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$description();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{leaderName:");
        if (realmGet$leaderName() == null) {
            str5 = "null";
        } else {
            str5 = realmGet$leaderName();
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{leaderId:");
        if (realmGet$leaderId() == null) {
            str6 = "null";
        } else {
            str6 = realmGet$leaderId();
        }
        sb2.append(str6);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{groupName:");
        if (realmGet$groupName() == null) {
            str7 = "null";
        } else {
            str7 = realmGet$groupName();
        }
        sb2.append(str7);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{groupId:");
        if (realmGet$groupId() == null) {
            str8 = "null";
        } else {
            str8 = realmGet$groupId();
        }
        sb2.append(str8);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{prize:");
        sb2.append(realmGet$prize());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{official:");
        sb2.append(realmGet$official());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{memberCount:");
        sb2.append(realmGet$memberCount());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{todoList:");
        if (realmGet$todoList() == null) {
            str9 = "null";
        } else {
            str9 = realmGet$todoList();
        }
        sb2.append(str9);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{habitList:");
        if (realmGet$habitList() == null) {
            str10 = "null";
        } else {
            str10 = realmGet$habitList();
        }
        sb2.append(str10);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{dailyList:");
        if (realmGet$dailyList() == null) {
            str11 = "null";
        } else {
            str11 = realmGet$dailyList();
        }
        sb2.append(str11);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{rewardList:");
        if (realmGet$rewardList() == null) {
            str12 = "null";
        } else {
            str12 = realmGet$rewardList();
        }
        sb2.append(str12);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{createdAt:");
        if (realmGet$createdAt() == null) {
            date = "null";
        } else {
            date = realmGet$createdAt();
        }
        sb2.append(date);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{updatedAt:");
        if (realmGet$updatedAt() == null) {
            date2 = "null";
        } else {
            date2 = realmGet$updatedAt();
        }
        sb2.append(date2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{group:");
        if (realmGet$group() == null) {
            str13 = "null";
        } else {
            str13 = "Group";
        }
        sb2.append(str13);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{leader:");
        if (realmGet$leader() == null) {
            str14 = "null";
        } else {
            str14 = "User";
        }
        sb2.append(str14);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{summary:");
        if (realmGet$summary() != null) {
            str15 = realmGet$summary();
        }
        sb2.append(str15);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
