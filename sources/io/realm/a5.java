package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.social.GroupCategory;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import io.realm.a;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.u3;
import io.realm.w4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_social_GroupRealmProxy.java */
/* loaded from: classes4.dex */
public class a5 extends Group implements io.realm.internal.o {

    /* renamed from: v  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17277v = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17278p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Group> f17279q;

    /* renamed from: r  reason: collision with root package name */
    private x0<String> f17280r;

    /* renamed from: u  reason: collision with root package name */
    private x0<GroupCategory> f17281u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_social_GroupRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17282e;

        /* renamed from: f  reason: collision with root package name */
        long f17283f;

        /* renamed from: g  reason: collision with root package name */
        long f17284g;

        /* renamed from: h  reason: collision with root package name */
        long f17285h;

        /* renamed from: i  reason: collision with root package name */
        long f17286i;

        /* renamed from: j  reason: collision with root package name */
        long f17287j;

        /* renamed from: k  reason: collision with root package name */
        long f17288k;

        /* renamed from: l  reason: collision with root package name */
        long f17289l;

        /* renamed from: m  reason: collision with root package name */
        long f17290m;

        /* renamed from: n  reason: collision with root package name */
        long f17291n;

        /* renamed from: o  reason: collision with root package name */
        long f17292o;

        /* renamed from: p  reason: collision with root package name */
        long f17293p;

        /* renamed from: q  reason: collision with root package name */
        long f17294q;

        /* renamed from: r  reason: collision with root package name */
        long f17295r;

        /* renamed from: s  reason: collision with root package name */
        long f17296s;

        /* renamed from: t  reason: collision with root package name */
        long f17297t;

        /* renamed from: u  reason: collision with root package name */
        long f17298u;

        /* renamed from: v  reason: collision with root package name */
        long f17299v;

        /* renamed from: w  reason: collision with root package name */
        long f17300w;

        a(OsSchemaInfo osSchemaInfo) {
            super(19);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Group");
            this.f17282e = a("id", "id", b10);
            this.f17283f = a("balance", "balance", b10);
            this.f17284g = a("description", "description", b10);
            this.f17285h = a("summary", "summary", b10);
            this.f17286i = a("leaderID", "leaderID", b10);
            this.f17287j = a("leaderName", "leaderName", b10);
            this.f17288k = a("managers", "managers", b10);
            this.f17289l = a(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, b10);
            this.f17290m = a("memberCount", "memberCount", b10);
            this.f17291n = a(TaskFormActivity.TASK_TYPE_KEY, TaskFormActivity.TASK_TYPE_KEY, b10);
            this.f17292o = a("logo", "logo", b10);
            this.f17293p = a("quest", "quest", b10);
            this.f17294q = a("privacy", "privacy", b10);
            this.f17295r = a("challengeCount", "challengeCount", b10);
            this.f17296s = a("leaderMessage", "leaderMessage", b10);
            this.f17297t = a("leaderOnlyChallenges", "leaderOnlyChallenges", b10);
            this.f17298u = a("leaderOnlyGetGems", "leaderOnlyGetGems", b10);
            this.f17299v = a("categories", "categories", b10);
            this.f17300w = a("purchased", "purchased", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17282e = aVar.f17282e;
            aVar2.f17283f = aVar.f17283f;
            aVar2.f17284g = aVar.f17284g;
            aVar2.f17285h = aVar.f17285h;
            aVar2.f17286i = aVar.f17286i;
            aVar2.f17287j = aVar.f17287j;
            aVar2.f17288k = aVar.f17288k;
            aVar2.f17289l = aVar.f17289l;
            aVar2.f17290m = aVar.f17290m;
            aVar2.f17291n = aVar.f17291n;
            aVar2.f17292o = aVar.f17292o;
            aVar2.f17293p = aVar.f17293p;
            aVar2.f17294q = aVar.f17294q;
            aVar2.f17295r = aVar.f17295r;
            aVar2.f17296s = aVar.f17296s;
            aVar2.f17297t = aVar.f17297t;
            aVar2.f17298u = aVar.f17298u;
            aVar2.f17299v = aVar.f17299v;
            aVar2.f17300w = aVar.f17300w;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a5() {
        this.f17279q.p();
    }

    public static Group c(o0 o0Var, a aVar, Group group, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(group);
        if (oVar != null) {
            return (Group) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Group.class), set);
        osObjectBuilder.c1(aVar.f17282e, group.realmGet$id());
        osObjectBuilder.N0(aVar.f17283f, Double.valueOf(group.realmGet$balance()));
        osObjectBuilder.c1(aVar.f17284g, group.realmGet$description());
        osObjectBuilder.c1(aVar.f17285h, group.realmGet$summary());
        osObjectBuilder.c1(aVar.f17286i, group.realmGet$leaderID());
        osObjectBuilder.c1(aVar.f17287j, group.realmGet$leaderName());
        osObjectBuilder.d1(aVar.f17288k, group.realmGet$managers());
        osObjectBuilder.c1(aVar.f17289l, group.realmGet$name());
        osObjectBuilder.V0(aVar.f17290m, Integer.valueOf(group.realmGet$memberCount()));
        osObjectBuilder.c1(aVar.f17291n, group.realmGet$type());
        osObjectBuilder.c1(aVar.f17292o, group.realmGet$logo());
        osObjectBuilder.c1(aVar.f17294q, group.realmGet$privacy());
        osObjectBuilder.V0(aVar.f17295r, Integer.valueOf(group.realmGet$challengeCount()));
        osObjectBuilder.c1(aVar.f17296s, group.realmGet$leaderMessage());
        osObjectBuilder.F0(aVar.f17297t, Boolean.valueOf(group.realmGet$leaderOnlyChallenges()));
        osObjectBuilder.F0(aVar.f17298u, Boolean.valueOf(group.realmGet$leaderOnlyGetGems()));
        a5 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(group, l10);
        Quest realmGet$quest = group.realmGet$quest();
        if (realmGet$quest == null) {
            l10.realmSet$quest(null);
        } else {
            Quest quest = (Quest) map.get(realmGet$quest);
            if (quest != null) {
                l10.realmSet$quest(quest);
            } else {
                l10.realmSet$quest(u3.d(o0Var, (u3.a) o0Var.R().e(Quest.class), realmGet$quest, z10, map, set));
            }
        }
        x0<GroupCategory> realmGet$categories = group.realmGet$categories();
        if (realmGet$categories != null) {
            x0<GroupCategory> realmGet$categories2 = l10.realmGet$categories();
            realmGet$categories2.clear();
            for (int i10 = 0; i10 < realmGet$categories.size(); i10++) {
                GroupCategory groupCategory = realmGet$categories.get(i10);
                GroupCategory groupCategory2 = (GroupCategory) map.get(groupCategory);
                if (groupCategory2 != null) {
                    realmGet$categories2.add(groupCategory2);
                } else {
                    realmGet$categories2.add(w4.d(o0Var, (w4.a) o0Var.R().e(GroupCategory.class), groupCategory, z10, map, set));
                }
            }
        }
        SubscriptionPlan realmGet$purchased = group.realmGet$purchased();
        if (realmGet$purchased == null) {
            l10.realmSet$purchased(null);
        } else if (((SubscriptionPlan) map.get(realmGet$purchased)) == null) {
            s7 k10 = s7.k(o0Var, o0Var.c1(SubscriptionPlan.class).s(l10.b().g().createEmbeddedObject(aVar.f17300w, RealmFieldType.OBJECT)));
            map.put(realmGet$purchased, k10);
            s7.n(o0Var, realmGet$purchased, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachepurchased.toString()");
        }
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.social.Group d(io.realm.o0 r8, io.realm.a5.a r9, com.habitrpg.android.habitica.models.social.Group r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.social.Group r1 = (com.habitrpg.android.habitica.models.social.Group) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.social.Group> r2 = com.habitrpg.android.habitica.models.social.Group.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17282e
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
            io.realm.a5 r1 = new io.realm.a5     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.social.Group r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.social.Group r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.a5.d(io.realm.o0, io.realm.a5$a, com.habitrpg.android.habitica.models.social.Group, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.social.Group");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Group f(Group group, int i10, int i11, Map<a1, o.a<a1>> map) {
        Group group2;
        if (i10 > i11 || group == null) {
            return null;
        }
        o.a<a1> aVar = map.get(group);
        if (aVar == null) {
            group2 = new Group();
            map.put(group, new o.a<>(i10, group2));
        } else if (i10 >= aVar.f17831a) {
            return (Group) aVar.f17832b;
        } else {
            Group group3 = (Group) aVar.f17832b;
            aVar.f17831a = i10;
            group2 = group3;
        }
        o0 o0Var = (o0) ((io.realm.internal.o) group).b().f();
        group2.realmSet$id(group.realmGet$id());
        group2.realmSet$balance(group.realmGet$balance());
        group2.realmSet$description(group.realmGet$description());
        group2.realmSet$summary(group.realmGet$summary());
        group2.realmSet$leaderID(group.realmGet$leaderID());
        group2.realmSet$leaderName(group.realmGet$leaderName());
        group2.realmSet$managers(new x0<>());
        group2.realmGet$managers().addAll(group.realmGet$managers());
        group2.realmSet$name(group.realmGet$name());
        group2.realmSet$memberCount(group.realmGet$memberCount());
        group2.realmSet$type(group.realmGet$type());
        group2.realmSet$logo(group.realmGet$logo());
        int i12 = i10 + 1;
        group2.realmSet$quest(u3.f(group.realmGet$quest(), i12, i11, map));
        group2.realmSet$privacy(group.realmGet$privacy());
        group2.realmSet$challengeCount(group.realmGet$challengeCount());
        group2.realmSet$leaderMessage(group.realmGet$leaderMessage());
        group2.realmSet$leaderOnlyChallenges(group.realmGet$leaderOnlyChallenges());
        group2.realmSet$leaderOnlyGetGems(group.realmGet$leaderOnlyGetGems());
        if (i10 == i11) {
            group2.realmSet$categories(null);
        } else {
            x0<GroupCategory> realmGet$categories = group.realmGet$categories();
            x0<GroupCategory> x0Var = new x0<>();
            group2.realmSet$categories(x0Var);
            int size = realmGet$categories.size();
            for (int i13 = 0; i13 < size; i13++) {
                x0Var.add(w4.f(realmGet$categories.get(i13), i12, i11, map));
            }
        }
        group2.realmSet$purchased(s7.f(group.realmGet$purchased(), i12, i11, map));
        return group2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Group", false, 19, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, true);
        bVar.b("", "balance", RealmFieldType.DOUBLE, false, false, true);
        bVar.b("", "description", realmFieldType, false, false, false);
        bVar.b("", "summary", realmFieldType, false, false, false);
        bVar.b("", "leaderID", realmFieldType, false, false, false);
        bVar.b("", "leaderName", realmFieldType, false, false, false);
        bVar.c("", "managers", RealmFieldType.STRING_LIST, false);
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.NAME, realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "memberCount", realmFieldType2, false, false, true);
        bVar.b("", TaskFormActivity.TASK_TYPE_KEY, realmFieldType, false, false, false);
        bVar.b("", "logo", realmFieldType, false, false, false);
        RealmFieldType realmFieldType3 = RealmFieldType.OBJECT;
        bVar.a("", "quest", realmFieldType3, "Quest");
        bVar.b("", "privacy", realmFieldType, false, false, false);
        bVar.b("", "challengeCount", realmFieldType2, false, false, true);
        bVar.b("", "leaderMessage", realmFieldType, false, false, false);
        RealmFieldType realmFieldType4 = RealmFieldType.BOOLEAN;
        bVar.b("", "leaderOnlyChallenges", realmFieldType4, false, false, true);
        bVar.b("", "leaderOnlyGetGems", realmFieldType4, false, false, true);
        bVar.a("", "categories", RealmFieldType.LIST, "GroupCategory");
        bVar.a("", "purchased", realmFieldType3, "SubscriptionPlan");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17277v;
    }

    public static long i(o0 o0Var, Group group, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        if ((group instanceof io.realm.internal.o) && !d1.isFrozen(group)) {
            io.realm.internal.o oVar = (io.realm.internal.o) group;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Group.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Group.class);
        long j13 = aVar.f17282e;
        String realmGet$id = group.realmGet$id();
        if (realmGet$id != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j13, realmGet$id);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j13, realmGet$id);
        }
        long j14 = j10;
        map.put(group, Long.valueOf(j14));
        Table.nativeSetDouble(nativePtr, aVar.f17283f, j14, group.realmGet$balance(), false);
        String realmGet$description = group.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, aVar.f17284g, j14, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17284g, j14, false);
        }
        String realmGet$summary = group.realmGet$summary();
        if (realmGet$summary != null) {
            Table.nativeSetString(nativePtr, aVar.f17285h, j14, realmGet$summary, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17285h, j14, false);
        }
        String realmGet$leaderID = group.realmGet$leaderID();
        if (realmGet$leaderID != null) {
            Table.nativeSetString(nativePtr, aVar.f17286i, j14, realmGet$leaderID, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17286i, j14, false);
        }
        String realmGet$leaderName = group.realmGet$leaderName();
        if (realmGet$leaderName != null) {
            Table.nativeSetString(nativePtr, aVar.f17287j, j14, realmGet$leaderName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17287j, j14, false);
        }
        OsList osList = new OsList(c12.s(j14), aVar.f17288k);
        osList.K();
        x0<String> realmGet$managers = group.realmGet$managers();
        if (realmGet$managers != null) {
            Iterator<String> it = realmGet$managers.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.h();
                } else {
                    osList.l(next);
                }
            }
        }
        String realmGet$name = group.realmGet$name();
        if (realmGet$name != null) {
            j11 = j14;
            Table.nativeSetString(nativePtr, aVar.f17289l, j14, realmGet$name, false);
        } else {
            j11 = j14;
            Table.nativeSetNull(nativePtr, aVar.f17289l, j11, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f17290m, j11, group.realmGet$memberCount(), false);
        String realmGet$type = group.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, aVar.f17291n, j11, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17291n, j11, false);
        }
        String realmGet$logo = group.realmGet$logo();
        if (realmGet$logo != null) {
            Table.nativeSetString(nativePtr, aVar.f17292o, j11, realmGet$logo, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17292o, j11, false);
        }
        Quest realmGet$quest = group.realmGet$quest();
        if (realmGet$quest != null) {
            Long l10 = map.get(realmGet$quest);
            if (l10 == null) {
                l10 = Long.valueOf(u3.i(o0Var, realmGet$quest, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f17293p, j11, l10.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17293p, j11);
        }
        String realmGet$privacy = group.realmGet$privacy();
        if (realmGet$privacy != null) {
            Table.nativeSetString(nativePtr, aVar.f17294q, j11, realmGet$privacy, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17294q, j11, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f17295r, j11, group.realmGet$challengeCount(), false);
        String realmGet$leaderMessage = group.realmGet$leaderMessage();
        if (realmGet$leaderMessage != null) {
            Table.nativeSetString(nativePtr, aVar.f17296s, j11, realmGet$leaderMessage, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17296s, j11, false);
        }
        long j15 = j11;
        Table.nativeSetBoolean(nativePtr, aVar.f17297t, j15, group.realmGet$leaderOnlyChallenges(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17298u, j15, group.realmGet$leaderOnlyGetGems(), false);
        OsList osList2 = new OsList(c12.s(j15), aVar.f17299v);
        x0<GroupCategory> realmGet$categories = group.realmGet$categories();
        if (realmGet$categories != null && realmGet$categories.size() == osList2.Y()) {
            int size = realmGet$categories.size();
            int i10 = 0;
            while (i10 < size) {
                GroupCategory groupCategory = realmGet$categories.get(i10);
                Long l11 = map.get(groupCategory);
                if (l11 == null) {
                    l11 = Long.valueOf(w4.i(o0Var, groupCategory, map));
                }
                osList2.V(i10, l11.longValue());
                i10++;
                nativePtr = nativePtr;
            }
            j12 = nativePtr;
        } else {
            j12 = nativePtr;
            osList2.K();
            if (realmGet$categories != null) {
                Iterator<GroupCategory> it2 = realmGet$categories.iterator();
                while (it2.hasNext()) {
                    GroupCategory next2 = it2.next();
                    Long l12 = map.get(next2);
                    if (l12 == null) {
                        l12 = Long.valueOf(w4.i(o0Var, next2, map));
                    }
                    osList2.k(l12.longValue());
                }
            }
        }
        SubscriptionPlan realmGet$purchased = group.realmGet$purchased();
        if (realmGet$purchased != null) {
            Long l13 = map.get(realmGet$purchased);
            if (l13 == null) {
                s7.i(o0Var, c12, aVar.f17300w, j15, realmGet$purchased, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l13.toString());
            }
        } else {
            Table.nativeNullifyLink(j12, aVar.f17300w, j15);
        }
        return j15;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        Group group;
        long j15;
        long j16;
        long j17;
        a aVar;
        Table c12 = o0Var.c1(Group.class);
        long nativePtr = c12.getNativePtr();
        a aVar2 = (a) o0Var.R().e(Group.class);
        long j18 = aVar2.f17282e;
        while (it.hasNext()) {
            Group group2 = (Group) it.next();
            if (!map.containsKey(group2)) {
                if ((group2 instanceof io.realm.internal.o) && !d1.isFrozen(group2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) group2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(group2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$id = group2.realmGet$id();
                if (realmGet$id != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j18, realmGet$id);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j11 = OsObject.createRowWithPrimaryKey(c12, j18, realmGet$id);
                } else {
                    j11 = j10;
                }
                map.put(group2, Long.valueOf(j11));
                Table.nativeSetDouble(nativePtr, aVar2.f17283f, j11, group2.realmGet$balance(), false);
                String realmGet$description = group2.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, aVar2.f17284g, j11, realmGet$description, false);
                    j12 = j11;
                    j13 = j18;
                    j14 = nativePtr;
                    group = group2;
                } else {
                    j12 = j11;
                    j13 = j18;
                    j14 = nativePtr;
                    group = group2;
                    Table.nativeSetNull(nativePtr, aVar2.f17284g, j12, false);
                }
                String realmGet$summary = group.realmGet$summary();
                if (realmGet$summary != null) {
                    long j19 = j12;
                    Table.nativeSetString(j14, aVar2.f17285h, j19, realmGet$summary, false);
                    j15 = j19;
                } else {
                    long j20 = j12;
                    j15 = j20;
                    Table.nativeSetNull(j14, aVar2.f17285h, j20, false);
                }
                String realmGet$leaderID = group.realmGet$leaderID();
                if (realmGet$leaderID != null) {
                    long j21 = j15;
                    Table.nativeSetString(j14, aVar2.f17286i, j21, realmGet$leaderID, false);
                    j15 = j21;
                } else {
                    Table.nativeSetNull(j14, aVar2.f17286i, j15, false);
                }
                String realmGet$leaderName = group.realmGet$leaderName();
                if (realmGet$leaderName != null) {
                    long j22 = j15;
                    Table.nativeSetString(j14, aVar2.f17287j, j22, realmGet$leaderName, false);
                    j15 = j22;
                } else {
                    Table.nativeSetNull(j14, aVar2.f17287j, j15, false);
                }
                OsList osList = new OsList(c12.s(j15), aVar2.f17288k);
                osList.K();
                x0<String> realmGet$managers = group.realmGet$managers();
                if (realmGet$managers != null) {
                    Iterator<String> it2 = realmGet$managers.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.h();
                        } else {
                            osList.l(next);
                        }
                    }
                }
                String realmGet$name = group.realmGet$name();
                if (realmGet$name != null) {
                    long j23 = j15;
                    Table.nativeSetString(j14, aVar2.f17289l, j23, realmGet$name, false);
                    j15 = j23;
                } else {
                    Table.nativeSetNull(j14, aVar2.f17289l, j15, false);
                }
                long j24 = j15;
                Table.nativeSetLong(j14, aVar2.f17290m, j24, group.realmGet$memberCount(), false);
                String realmGet$type = group.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(j14, aVar2.f17291n, j24, realmGet$type, false);
                    j16 = j24;
                } else {
                    j16 = j24;
                    Table.nativeSetNull(j14, aVar2.f17291n, j24, false);
                }
                String realmGet$logo = group.realmGet$logo();
                if (realmGet$logo != null) {
                    long j25 = j16;
                    Table.nativeSetString(j14, aVar2.f17292o, j25, realmGet$logo, false);
                    j16 = j25;
                } else {
                    Table.nativeSetNull(j14, aVar2.f17292o, j16, false);
                }
                Quest realmGet$quest = group.realmGet$quest();
                if (realmGet$quest != null) {
                    Long l10 = map.get(realmGet$quest);
                    if (l10 == null) {
                        l10 = Long.valueOf(u3.i(o0Var, realmGet$quest, map));
                    }
                    long j26 = j16;
                    Table.nativeSetLink(j14, aVar2.f17293p, j26, l10.longValue(), false);
                    j16 = j26;
                } else {
                    Table.nativeNullifyLink(j14, aVar2.f17293p, j16);
                }
                String realmGet$privacy = group.realmGet$privacy();
                if (realmGet$privacy != null) {
                    long j27 = j16;
                    Table.nativeSetString(j14, aVar2.f17294q, j27, realmGet$privacy, false);
                    j16 = j27;
                } else {
                    Table.nativeSetNull(j14, aVar2.f17294q, j16, false);
                }
                long j28 = j16;
                Table.nativeSetLong(j14, aVar2.f17295r, j28, group.realmGet$challengeCount(), false);
                String realmGet$leaderMessage = group.realmGet$leaderMessage();
                if (realmGet$leaderMessage != null) {
                    Table.nativeSetString(j14, aVar2.f17296s, j28, realmGet$leaderMessage, false);
                    j17 = j28;
                } else {
                    j17 = j28;
                    Table.nativeSetNull(j14, aVar2.f17296s, j28, false);
                }
                long j29 = j14;
                long j30 = j17;
                Table.nativeSetBoolean(j29, aVar2.f17297t, j30, group.realmGet$leaderOnlyChallenges(), false);
                Table.nativeSetBoolean(j29, aVar2.f17298u, j30, group.realmGet$leaderOnlyGetGems(), false);
                OsList osList2 = new OsList(c12.s(j30), aVar2.f17299v);
                x0<GroupCategory> realmGet$categories = group.realmGet$categories();
                if (realmGet$categories != null && realmGet$categories.size() == osList2.Y()) {
                    int size = realmGet$categories.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        GroupCategory groupCategory = realmGet$categories.get(i10);
                        Long l11 = map.get(groupCategory);
                        if (l11 == null) {
                            l11 = Long.valueOf(w4.i(o0Var, groupCategory, map));
                        }
                        osList2.V(i10, l11.longValue());
                    }
                } else {
                    osList2.K();
                    if (realmGet$categories != null) {
                        Iterator<GroupCategory> it3 = realmGet$categories.iterator();
                        while (it3.hasNext()) {
                            GroupCategory next2 = it3.next();
                            Long l12 = map.get(next2);
                            if (l12 == null) {
                                l12 = Long.valueOf(w4.i(o0Var, next2, map));
                            }
                            osList2.k(l12.longValue());
                        }
                    }
                }
                SubscriptionPlan realmGet$purchased = group.realmGet$purchased();
                if (realmGet$purchased != null) {
                    Long l13 = map.get(realmGet$purchased);
                    if (l13 == null) {
                        aVar = aVar2;
                        s7.i(o0Var, c12, aVar2.f17300w, j30, realmGet$purchased, map);
                    } else {
                        throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l13.toString());
                    }
                } else {
                    aVar = aVar2;
                    Table.nativeNullifyLink(j14, aVar.f17300w, j30);
                }
                aVar2 = aVar;
                j18 = j13;
                nativePtr = j14;
            }
        }
    }

    static a5 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Group.class), false, Collections.emptyList());
        a5 a5Var = new a5();
        cVar.a();
        return a5Var;
    }

    static Group n(o0 o0Var, a aVar, Group group, Group group2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Group.class), set);
        osObjectBuilder.c1(aVar.f17282e, group2.realmGet$id());
        osObjectBuilder.N0(aVar.f17283f, Double.valueOf(group2.realmGet$balance()));
        osObjectBuilder.c1(aVar.f17284g, group2.realmGet$description());
        osObjectBuilder.c1(aVar.f17285h, group2.realmGet$summary());
        osObjectBuilder.c1(aVar.f17286i, group2.realmGet$leaderID());
        osObjectBuilder.c1(aVar.f17287j, group2.realmGet$leaderName());
        osObjectBuilder.d1(aVar.f17288k, group2.realmGet$managers());
        osObjectBuilder.c1(aVar.f17289l, group2.realmGet$name());
        osObjectBuilder.V0(aVar.f17290m, Integer.valueOf(group2.realmGet$memberCount()));
        osObjectBuilder.c1(aVar.f17291n, group2.realmGet$type());
        osObjectBuilder.c1(aVar.f17292o, group2.realmGet$logo());
        Quest realmGet$quest = group2.realmGet$quest();
        if (realmGet$quest == null) {
            osObjectBuilder.Z0(aVar.f17293p);
        } else {
            Quest quest = (Quest) map.get(realmGet$quest);
            if (quest != null) {
                osObjectBuilder.a1(aVar.f17293p, quest);
            } else {
                osObjectBuilder.a1(aVar.f17293p, u3.d(o0Var, (u3.a) o0Var.R().e(Quest.class), realmGet$quest, true, map, set));
            }
        }
        osObjectBuilder.c1(aVar.f17294q, group2.realmGet$privacy());
        osObjectBuilder.V0(aVar.f17295r, Integer.valueOf(group2.realmGet$challengeCount()));
        osObjectBuilder.c1(aVar.f17296s, group2.realmGet$leaderMessage());
        osObjectBuilder.F0(aVar.f17297t, Boolean.valueOf(group2.realmGet$leaderOnlyChallenges()));
        osObjectBuilder.F0(aVar.f17298u, Boolean.valueOf(group2.realmGet$leaderOnlyGetGems()));
        x0<GroupCategory> realmGet$categories = group2.realmGet$categories();
        if (realmGet$categories != null) {
            x0 x0Var = new x0();
            for (int i10 = 0; i10 < realmGet$categories.size(); i10++) {
                GroupCategory groupCategory = realmGet$categories.get(i10);
                GroupCategory groupCategory2 = (GroupCategory) map.get(groupCategory);
                if (groupCategory2 != null) {
                    x0Var.add(groupCategory2);
                } else {
                    x0Var.add(w4.d(o0Var, (w4.a) o0Var.R().e(GroupCategory.class), groupCategory, true, map, set));
                }
            }
            osObjectBuilder.b1(aVar.f17299v, x0Var);
        } else {
            osObjectBuilder.b1(aVar.f17299v, new x0());
        }
        SubscriptionPlan realmGet$purchased = group2.realmGet$purchased();
        if (realmGet$purchased == null) {
            osObjectBuilder.Z0(aVar.f17300w);
        } else if (((SubscriptionPlan) map.get(realmGet$purchased)) == null) {
            s7 k10 = s7.k(o0Var, o0Var.c1(SubscriptionPlan.class).s(((io.realm.internal.o) group).b().g().createEmbeddedObject(aVar.f17300w, RealmFieldType.OBJECT)));
            map.put(realmGet$purchased, k10);
            s7.n(o0Var, realmGet$purchased, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachepurchased.toString()");
        }
        osObjectBuilder.g1();
        return group;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17279q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17278p = (a) cVar.c();
        l0<Group> l0Var = new l0<>(this);
        this.f17279q = l0Var;
        l0Var.r(cVar.e());
        this.f17279q.s(cVar.f());
        this.f17279q.o(cVar.b());
        this.f17279q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17279q;
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public double realmGet$balance() {
        this.f17279q.f().e();
        return this.f17279q.g().getDouble(this.f17278p.f17283f);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public x0<GroupCategory> realmGet$categories() {
        this.f17279q.f().e();
        x0<GroupCategory> x0Var = this.f17281u;
        if (x0Var != null) {
            return x0Var;
        }
        x0<GroupCategory> x0Var2 = new x0<>(GroupCategory.class, this.f17279q.g().getModelList(this.f17278p.f17299v), this.f17279q.f());
        this.f17281u = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public int realmGet$challengeCount() {
        this.f17279q.f().e();
        return (int) this.f17279q.g().getLong(this.f17278p.f17295r);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public String realmGet$description() {
        this.f17279q.f().e();
        return this.f17279q.g().getString(this.f17278p.f17284g);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public String realmGet$id() {
        this.f17279q.f().e();
        return this.f17279q.g().getString(this.f17278p.f17282e);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public String realmGet$leaderID() {
        this.f17279q.f().e();
        return this.f17279q.g().getString(this.f17278p.f17286i);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public String realmGet$leaderMessage() {
        this.f17279q.f().e();
        return this.f17279q.g().getString(this.f17278p.f17296s);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public String realmGet$leaderName() {
        this.f17279q.f().e();
        return this.f17279q.g().getString(this.f17278p.f17287j);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public boolean realmGet$leaderOnlyChallenges() {
        this.f17279q.f().e();
        return this.f17279q.g().getBoolean(this.f17278p.f17297t);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public boolean realmGet$leaderOnlyGetGems() {
        this.f17279q.f().e();
        return this.f17279q.g().getBoolean(this.f17278p.f17298u);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public String realmGet$logo() {
        this.f17279q.f().e();
        return this.f17279q.g().getString(this.f17278p.f17292o);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public x0<String> realmGet$managers() {
        this.f17279q.f().e();
        x0<String> x0Var = this.f17280r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<String> x0Var2 = new x0<>(String.class, this.f17279q.g().getValueList(this.f17278p.f17288k, RealmFieldType.STRING_LIST), this.f17279q.f());
        this.f17280r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public int realmGet$memberCount() {
        this.f17279q.f().e();
        return (int) this.f17279q.g().getLong(this.f17278p.f17290m);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public String realmGet$name() {
        this.f17279q.f().e();
        return this.f17279q.g().getString(this.f17278p.f17289l);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public String realmGet$privacy() {
        this.f17279q.f().e();
        return this.f17279q.g().getString(this.f17278p.f17294q);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public SubscriptionPlan realmGet$purchased() {
        this.f17279q.f().e();
        if (this.f17279q.g().isNullLink(this.f17278p.f17300w)) {
            return null;
        }
        return (SubscriptionPlan) this.f17279q.f().B(SubscriptionPlan.class, this.f17279q.g().getLink(this.f17278p.f17300w), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public Quest realmGet$quest() {
        this.f17279q.f().e();
        if (this.f17279q.g().isNullLink(this.f17278p.f17293p)) {
            return null;
        }
        return (Quest) this.f17279q.f().B(Quest.class, this.f17279q.g().getLink(this.f17278p.f17293p), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public String realmGet$summary() {
        this.f17279q.f().e();
        return this.f17279q.g().getString(this.f17278p.f17285h);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public String realmGet$type() {
        this.f17279q.f().e();
        return this.f17279q.g().getString(this.f17278p.f17291n);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$balance(double d10) {
        if (this.f17279q.i()) {
            if (!this.f17279q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17279q.g();
            g10.getTable().B(this.f17278p.f17283f, g10.getObjectKey(), d10, true);
            return;
        }
        this.f17279q.f().e();
        this.f17279q.g().setDouble(this.f17278p.f17283f, d10);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$categories(x0<GroupCategory> x0Var) {
        int i10 = 0;
        if (this.f17279q.i()) {
            if (!this.f17279q.d() || this.f17279q.e().contains("categories")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17279q.f();
                x0<GroupCategory> x0Var2 = new x0<>();
                Iterator<GroupCategory> it = x0Var.iterator();
                while (it.hasNext()) {
                    GroupCategory next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((GroupCategory) o0Var.F0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17279q.f().e();
        OsList modelList = this.f17279q.g().getModelList(this.f17278p.f17299v);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                GroupCategory groupCategory = x0Var.get(i10);
                this.f17279q.c(groupCategory);
                modelList.V(i10, ((io.realm.internal.o) groupCategory).b().g().getObjectKey());
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
            GroupCategory groupCategory2 = x0Var.get(i10);
            this.f17279q.c(groupCategory2);
            modelList.k(((io.realm.internal.o) groupCategory2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$challengeCount(int i10) {
        if (this.f17279q.i()) {
            if (!this.f17279q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17279q.g();
            g10.getTable().E(this.f17278p.f17295r, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17279q.f().e();
        this.f17279q.g().setLong(this.f17278p.f17295r, i10);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$description(String str) {
        if (this.f17279q.i()) {
            if (!this.f17279q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17279q.g();
            if (str == null) {
                g10.getTable().F(this.f17278p.f17284g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17278p.f17284g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17279q.f().e();
        if (str == null) {
            this.f17279q.g().setNull(this.f17278p.f17284g);
        } else {
            this.f17279q.g().setString(this.f17278p.f17284g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$id(String str) {
        if (this.f17279q.i()) {
            return;
        }
        this.f17279q.f().e();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$leaderID(String str) {
        if (this.f17279q.i()) {
            if (!this.f17279q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17279q.g();
            if (str == null) {
                g10.getTable().F(this.f17278p.f17286i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17278p.f17286i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17279q.f().e();
        if (str == null) {
            this.f17279q.g().setNull(this.f17278p.f17286i);
        } else {
            this.f17279q.g().setString(this.f17278p.f17286i, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$leaderMessage(String str) {
        if (this.f17279q.i()) {
            if (!this.f17279q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17279q.g();
            if (str == null) {
                g10.getTable().F(this.f17278p.f17296s, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17278p.f17296s, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17279q.f().e();
        if (str == null) {
            this.f17279q.g().setNull(this.f17278p.f17296s);
        } else {
            this.f17279q.g().setString(this.f17278p.f17296s, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$leaderName(String str) {
        if (this.f17279q.i()) {
            if (!this.f17279q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17279q.g();
            if (str == null) {
                g10.getTable().F(this.f17278p.f17287j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17278p.f17287j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17279q.f().e();
        if (str == null) {
            this.f17279q.g().setNull(this.f17278p.f17287j);
        } else {
            this.f17279q.g().setString(this.f17278p.f17287j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$leaderOnlyChallenges(boolean z10) {
        if (this.f17279q.i()) {
            if (!this.f17279q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17279q.g();
            g10.getTable().z(this.f17278p.f17297t, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17279q.f().e();
        this.f17279q.g().setBoolean(this.f17278p.f17297t, z10);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$leaderOnlyGetGems(boolean z10) {
        if (this.f17279q.i()) {
            if (!this.f17279q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17279q.g();
            g10.getTable().z(this.f17278p.f17298u, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17279q.f().e();
        this.f17279q.g().setBoolean(this.f17278p.f17298u, z10);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$logo(String str) {
        if (this.f17279q.i()) {
            if (!this.f17279q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17279q.g();
            if (str == null) {
                g10.getTable().F(this.f17278p.f17292o, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17278p.f17292o, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17279q.f().e();
        if (str == null) {
            this.f17279q.g().setNull(this.f17278p.f17292o);
        } else {
            this.f17279q.g().setString(this.f17278p.f17292o, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$managers(x0<String> x0Var) {
        if (this.f17279q.i() && (!this.f17279q.d() || this.f17279q.e().contains("managers"))) {
            return;
        }
        this.f17279q.f().e();
        OsList valueList = this.f17279q.g().getValueList(this.f17278p.f17288k, RealmFieldType.STRING_LIST);
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

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$memberCount(int i10) {
        if (this.f17279q.i()) {
            if (!this.f17279q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17279q.g();
            g10.getTable().E(this.f17278p.f17290m, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17279q.f().e();
        this.f17279q.g().setLong(this.f17278p.f17290m, i10);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$name(String str) {
        if (this.f17279q.i()) {
            if (!this.f17279q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17279q.g();
            if (str == null) {
                g10.getTable().F(this.f17278p.f17289l, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17278p.f17289l, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17279q.f().e();
        if (str == null) {
            this.f17279q.g().setNull(this.f17278p.f17289l);
        } else {
            this.f17279q.g().setString(this.f17278p.f17289l, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$privacy(String str) {
        if (this.f17279q.i()) {
            if (!this.f17279q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17279q.g();
            if (str == null) {
                g10.getTable().F(this.f17278p.f17294q, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17278p.f17294q, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17279q.f().e();
        if (str == null) {
            this.f17279q.g().setNull(this.f17278p.f17294q);
        } else {
            this.f17279q.g().setString(this.f17278p.f17294q, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$purchased(SubscriptionPlan subscriptionPlan) {
        o0 o0Var = (o0) this.f17279q.f();
        if (this.f17279q.i()) {
            if (!this.f17279q.d() || this.f17279q.e().contains("purchased")) {
                return;
            }
            if (subscriptionPlan != null && !d1.isManaged(subscriptionPlan)) {
                SubscriptionPlan subscriptionPlan2 = (SubscriptionPlan) o0Var.J0(SubscriptionPlan.class, this, "purchased");
                s7.n(o0Var, subscriptionPlan, subscriptionPlan2, new HashMap(), Collections.EMPTY_SET);
                subscriptionPlan = subscriptionPlan2;
            }
            io.realm.internal.q g10 = this.f17279q.g();
            if (subscriptionPlan == null) {
                g10.nullifyLink(this.f17278p.f17300w);
                return;
            }
            this.f17279q.c(subscriptionPlan);
            g10.getTable().D(this.f17278p.f17300w, g10.getObjectKey(), ((io.realm.internal.o) subscriptionPlan).b().g().getObjectKey(), true);
            return;
        }
        this.f17279q.f().e();
        if (subscriptionPlan == null) {
            this.f17279q.g().nullifyLink(this.f17278p.f17300w);
            return;
        }
        if (d1.isManaged(subscriptionPlan)) {
            this.f17279q.c(subscriptionPlan);
        }
        s7.n(o0Var, subscriptionPlan, (SubscriptionPlan) o0Var.J0(SubscriptionPlan.class, this, "purchased"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$quest(Quest quest) {
        o0 o0Var = (o0) this.f17279q.f();
        if (this.f17279q.i()) {
            if (!this.f17279q.d() || this.f17279q.e().contains("quest")) {
                return;
            }
            if (quest != null && !d1.isManaged(quest)) {
                quest = (Quest) o0Var.F0(quest, new v[0]);
            }
            io.realm.internal.q g10 = this.f17279q.g();
            if (quest == null) {
                g10.nullifyLink(this.f17278p.f17293p);
                return;
            }
            this.f17279q.c(quest);
            g10.getTable().D(this.f17278p.f17293p, g10.getObjectKey(), ((io.realm.internal.o) quest).b().g().getObjectKey(), true);
            return;
        }
        this.f17279q.f().e();
        if (quest == null) {
            this.f17279q.g().nullifyLink(this.f17278p.f17293p);
            return;
        }
        this.f17279q.c(quest);
        this.f17279q.g().setLink(this.f17278p.f17293p, ((io.realm.internal.o) quest).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$summary(String str) {
        if (this.f17279q.i()) {
            if (!this.f17279q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17279q.g();
            if (str == null) {
                g10.getTable().F(this.f17278p.f17285h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17278p.f17285h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17279q.f().e();
        if (str == null) {
            this.f17279q.g().setNull(this.f17278p.f17285h);
        } else {
            this.f17279q.g().setString(this.f17278p.f17285h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.Group, io.realm.b5
    public void realmSet$type(String str) {
        if (this.f17279q.i()) {
            if (!this.f17279q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17279q.g();
            if (str == null) {
                g10.getTable().F(this.f17278p.f17291n, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17278p.f17291n, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17279q.f().e();
        if (str == null) {
            this.f17279q.g().setNull(this.f17278p.f17291n);
        } else {
            this.f17279q.g().setString(this.f17278p.f17291n, str);
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
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Group = proxy[");
        sb2.append("{id:");
        sb2.append(realmGet$id());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{balance:");
        sb2.append(realmGet$balance());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{description:");
        String str11 = "null";
        if (realmGet$description() == null) {
            str = "null";
        } else {
            str = realmGet$description();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{summary:");
        if (realmGet$summary() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$summary();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{leaderID:");
        if (realmGet$leaderID() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$leaderID();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{leaderName:");
        if (realmGet$leaderName() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$leaderName();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{managers:");
        sb2.append("RealmList<String>[");
        sb2.append(realmGet$managers().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{name:");
        if (realmGet$name() == null) {
            str5 = "null";
        } else {
            str5 = realmGet$name();
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{memberCount:");
        sb2.append(realmGet$memberCount());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{type:");
        if (realmGet$type() == null) {
            str6 = "null";
        } else {
            str6 = realmGet$type();
        }
        sb2.append(str6);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{logo:");
        if (realmGet$logo() == null) {
            str7 = "null";
        } else {
            str7 = realmGet$logo();
        }
        sb2.append(str7);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{quest:");
        if (realmGet$quest() == null) {
            str8 = "null";
        } else {
            str8 = "Quest";
        }
        sb2.append(str8);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{privacy:");
        if (realmGet$privacy() == null) {
            str9 = "null";
        } else {
            str9 = realmGet$privacy();
        }
        sb2.append(str9);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{challengeCount:");
        sb2.append(realmGet$challengeCount());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{leaderMessage:");
        if (realmGet$leaderMessage() == null) {
            str10 = "null";
        } else {
            str10 = realmGet$leaderMessage();
        }
        sb2.append(str10);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{leaderOnlyChallenges:");
        sb2.append(realmGet$leaderOnlyChallenges());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{leaderOnlyGetGems:");
        sb2.append(realmGet$leaderOnlyGetGems());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{categories:");
        sb2.append("RealmList<GroupCategory>[");
        sb2.append(realmGet$categories().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{purchased:");
        if (realmGet$purchased() != null) {
            str11 = "SubscriptionPlan";
        }
        sb2.append(str11);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
