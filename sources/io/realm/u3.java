package io.realm;

import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.inventory.QuestMember;
import com.habitrpg.android.habitica.models.inventory.QuestProgress;
import com.habitrpg.android.habitica.models.inventory.QuestRageStrike;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.tasks.Task;
import io.realm.a;
import io.realm.exceptions.RealmException;
import io.realm.i4;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.m3;
import io.realm.s3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_inventory_QuestRealmProxy.java */
/* loaded from: classes4.dex */
public class u3 extends Quest implements io.realm.internal.o {

    /* renamed from: x  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18253x = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18254p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Quest> f18255q;

    /* renamed from: r  reason: collision with root package name */
    private x0<QuestMember> f18256r;

    /* renamed from: u  reason: collision with root package name */
    private x0<Member> f18257u;

    /* renamed from: v  reason: collision with root package name */
    private x0<QuestRageStrike> f18258v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_QuestRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18259e;

        /* renamed from: f  reason: collision with root package name */
        long f18260f;

        /* renamed from: g  reason: collision with root package name */
        long f18261g;

        /* renamed from: h  reason: collision with root package name */
        long f18262h;

        /* renamed from: i  reason: collision with root package name */
        long f18263i;

        /* renamed from: j  reason: collision with root package name */
        long f18264j;

        /* renamed from: k  reason: collision with root package name */
        long f18265k;

        /* renamed from: l  reason: collision with root package name */
        long f18266l;

        /* renamed from: m  reason: collision with root package name */
        long f18267m;

        /* renamed from: n  reason: collision with root package name */
        long f18268n;

        a(OsSchemaInfo osSchemaInfo) {
            super(10);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Quest");
            this.f18259e = a("id", "id", b10);
            this.f18260f = a("key", "key", b10);
            this.f18261g = a("active", "active", b10);
            this.f18262h = a("leader", "leader", b10);
            this.f18263i = a("RSVPNeeded", "RSVPNeeded", b10);
            this.f18264j = a("members", "members", b10);
            this.f18265k = a("progress", "progress", b10);
            this.f18266l = a("participants", "participants", b10);
            this.f18267m = a("rageStrikes", "rageStrikes", b10);
            this.f18268n = a(Task.FILTER_COMPLETED, Task.FILTER_COMPLETED, b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18259e = aVar.f18259e;
            aVar2.f18260f = aVar.f18260f;
            aVar2.f18261g = aVar.f18261g;
            aVar2.f18262h = aVar.f18262h;
            aVar2.f18263i = aVar.f18263i;
            aVar2.f18264j = aVar.f18264j;
            aVar2.f18265k = aVar.f18265k;
            aVar2.f18266l = aVar.f18266l;
            aVar2.f18267m = aVar.f18267m;
            aVar2.f18268n = aVar.f18268n;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u3() {
        this.f18255q.p();
    }

    public static Quest c(o0 o0Var, a aVar, Quest quest, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(quest);
        if (oVar != null) {
            return (Quest) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Quest.class), set);
        osObjectBuilder.c1(aVar.f18259e, quest.realmGet$id());
        osObjectBuilder.c1(aVar.f18260f, quest.realmGet$key());
        osObjectBuilder.F0(aVar.f18261g, Boolean.valueOf(quest.realmGet$active()));
        osObjectBuilder.c1(aVar.f18262h, quest.realmGet$leader());
        osObjectBuilder.F0(aVar.f18263i, Boolean.valueOf(quest.realmGet$RSVPNeeded()));
        osObjectBuilder.c1(aVar.f18268n, quest.realmGet$completed());
        u3 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(quest, l10);
        x0<QuestMember> realmGet$members = quest.realmGet$members();
        if (realmGet$members != null) {
            x0<QuestMember> realmGet$members2 = l10.realmGet$members();
            realmGet$members2.clear();
            for (int i10 = 0; i10 < realmGet$members.size(); i10++) {
                QuestMember questMember = realmGet$members.get(i10);
                QuestMember questMember2 = (QuestMember) map.get(questMember);
                if (questMember2 != null) {
                    realmGet$members2.add(questMember2);
                } else {
                    realmGet$members2.add(m3.d(o0Var, (m3.a) o0Var.R().e(QuestMember.class), questMember, z10, map, set));
                }
            }
        }
        QuestProgress realmGet$progress = quest.realmGet$progress();
        if (realmGet$progress == null) {
            l10.realmSet$progress(null);
        } else if (((QuestProgress) map.get(realmGet$progress)) == null) {
            q3 k10 = q3.k(o0Var, o0Var.c1(QuestProgress.class).s(l10.b().g().createEmbeddedObject(aVar.f18265k, RealmFieldType.OBJECT)));
            map.put(realmGet$progress, k10);
            q3.n(o0Var, realmGet$progress, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheprogress.toString()");
        }
        x0<Member> realmGet$participants = quest.realmGet$participants();
        if (realmGet$participants != null) {
            x0<Member> realmGet$participants2 = l10.realmGet$participants();
            realmGet$participants2.clear();
            for (int i11 = 0; i11 < realmGet$participants.size(); i11++) {
                Member member = realmGet$participants.get(i11);
                Member member2 = (Member) map.get(member);
                if (member2 != null) {
                    realmGet$participants2.add(member2);
                } else {
                    realmGet$participants2.add(i4.d(o0Var, (i4.a) o0Var.R().e(Member.class), member, z10, map, set));
                }
            }
        }
        x0<QuestRageStrike> realmGet$rageStrikes = quest.realmGet$rageStrikes();
        if (realmGet$rageStrikes != null) {
            x0<QuestRageStrike> realmGet$rageStrikes2 = l10.realmGet$rageStrikes();
            realmGet$rageStrikes2.clear();
            for (int i12 = 0; i12 < realmGet$rageStrikes.size(); i12++) {
                QuestRageStrike questRageStrike = realmGet$rageStrikes.get(i12);
                QuestRageStrike questRageStrike2 = (QuestRageStrike) map.get(questRageStrike);
                if (questRageStrike2 != null) {
                    realmGet$rageStrikes2.add(questRageStrike2);
                } else {
                    realmGet$rageStrikes2.add(s3.d(o0Var, (s3.a) o0Var.R().e(QuestRageStrike.class), questRageStrike, z10, map, set));
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
    public static com.habitrpg.android.habitica.models.inventory.Quest d(io.realm.o0 r8, io.realm.u3.a r9, com.habitrpg.android.habitica.models.inventory.Quest r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.Quest r1 = (com.habitrpg.android.habitica.models.inventory.Quest) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.Quest> r2 = com.habitrpg.android.habitica.models.inventory.Quest.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18259e
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
            io.realm.u3 r1 = new io.realm.u3     // Catch: java.lang.Throwable -> L8e
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
            com.habitrpg.android.habitica.models.inventory.Quest r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.inventory.Quest r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.u3.d(io.realm.o0, io.realm.u3$a, com.habitrpg.android.habitica.models.inventory.Quest, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.Quest");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Quest f(Quest quest, int i10, int i11, Map<a1, o.a<a1>> map) {
        Quest quest2;
        if (i10 > i11 || quest == null) {
            return null;
        }
        o.a<a1> aVar = map.get(quest);
        if (aVar == null) {
            quest2 = new Quest();
            map.put(quest, new o.a<>(i10, quest2));
        } else if (i10 >= aVar.f17831a) {
            return (Quest) aVar.f17832b;
        } else {
            Quest quest3 = (Quest) aVar.f17832b;
            aVar.f17831a = i10;
            quest2 = quest3;
        }
        o0 o0Var = (o0) ((io.realm.internal.o) quest).b().f();
        quest2.realmSet$id(quest.realmGet$id());
        quest2.realmSet$key(quest.realmGet$key());
        quest2.realmSet$active(quest.realmGet$active());
        quest2.realmSet$leader(quest.realmGet$leader());
        quest2.realmSet$RSVPNeeded(quest.realmGet$RSVPNeeded());
        if (i10 == i11) {
            quest2.realmSet$members(null);
        } else {
            x0<QuestMember> realmGet$members = quest.realmGet$members();
            x0<QuestMember> x0Var = new x0<>();
            quest2.realmSet$members(x0Var);
            int i12 = i10 + 1;
            int size = realmGet$members.size();
            for (int i13 = 0; i13 < size; i13++) {
                x0Var.add(m3.f(realmGet$members.get(i13), i12, i11, map));
            }
        }
        int i14 = i10 + 1;
        quest2.realmSet$progress(q3.f(quest.realmGet$progress(), i14, i11, map));
        if (i10 == i11) {
            quest2.realmSet$participants(null);
        } else {
            x0<Member> realmGet$participants = quest.realmGet$participants();
            x0<Member> x0Var2 = new x0<>();
            quest2.realmSet$participants(x0Var2);
            int size2 = realmGet$participants.size();
            for (int i15 = 0; i15 < size2; i15++) {
                x0Var2.add(i4.f(realmGet$participants.get(i15), i14, i11, map));
            }
        }
        if (i10 == i11) {
            quest2.realmSet$rageStrikes(null);
        } else {
            x0<QuestRageStrike> realmGet$rageStrikes = quest.realmGet$rageStrikes();
            x0<QuestRageStrike> x0Var3 = new x0<>();
            quest2.realmSet$rageStrikes(x0Var3);
            int size3 = realmGet$rageStrikes.size();
            for (int i16 = 0; i16 < size3; i16++) {
                x0Var3.add(s3.f(realmGet$rageStrikes.get(i16), i14, i11, map));
            }
        }
        quest2.realmSet$completed(quest.realmGet$completed());
        return quest2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Quest", false, 10, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        bVar.b("", "key", realmFieldType, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.BOOLEAN;
        bVar.b("", "active", realmFieldType2, false, false, true);
        bVar.b("", "leader", realmFieldType, false, false, false);
        bVar.b("", "RSVPNeeded", realmFieldType2, false, false, true);
        RealmFieldType realmFieldType3 = RealmFieldType.LIST;
        bVar.a("", "members", realmFieldType3, "QuestMember");
        bVar.a("", "progress", RealmFieldType.OBJECT, "QuestProgress");
        bVar.a("", "participants", realmFieldType3, "Member");
        bVar.a("", "rageStrikes", realmFieldType3, "QuestRageStrike");
        bVar.b("", Task.FILTER_COMPLETED, realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18253x;
    }

    public static long i(o0 o0Var, Quest quest, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        long j11;
        long j12;
        a aVar;
        long j13;
        if ((quest instanceof io.realm.internal.o) && !d1.isFrozen(quest)) {
            io.realm.internal.o oVar = (io.realm.internal.o) quest;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Quest.class);
        long nativePtr = c12.getNativePtr();
        a aVar2 = (a) o0Var.R().e(Quest.class);
        long j14 = aVar2.f18259e;
        String realmGet$id = quest.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j14);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j14, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j14, realmGet$id);
        }
        long j15 = nativeFindFirstString;
        map.put(quest, Long.valueOf(j15));
        String realmGet$key = quest.realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(nativePtr, aVar2.f18260f, j15, realmGet$key, false);
            j10 = j15;
            j11 = nativePtr;
        } else {
            j10 = j15;
            j11 = nativePtr;
            Table.nativeSetNull(nativePtr, aVar2.f18260f, j10, false);
        }
        long j16 = j10;
        Table.nativeSetBoolean(j11, aVar2.f18261g, j16, quest.realmGet$active(), false);
        String realmGet$leader = quest.realmGet$leader();
        if (realmGet$leader != null) {
            Table.nativeSetString(j11, aVar2.f18262h, j16, realmGet$leader, false);
            j12 = j16;
        } else {
            j12 = j16;
            Table.nativeSetNull(j11, aVar2.f18262h, j16, false);
        }
        long j17 = j12;
        Table.nativeSetBoolean(j11, aVar2.f18263i, j17, quest.realmGet$RSVPNeeded(), false);
        OsList osList = new OsList(c12.s(j17), aVar2.f18264j);
        x0<QuestMember> realmGet$members = quest.realmGet$members();
        if (realmGet$members != null && realmGet$members.size() == osList.Y()) {
            int size = realmGet$members.size();
            for (int i10 = 0; i10 < size; i10++) {
                QuestMember questMember = realmGet$members.get(i10);
                Long l10 = map.get(questMember);
                if (l10 == null) {
                    l10 = Long.valueOf(m3.i(o0Var, questMember, map));
                }
                osList.V(i10, l10.longValue());
            }
        } else {
            osList.K();
            if (realmGet$members != null) {
                Iterator<QuestMember> it = realmGet$members.iterator();
                while (it.hasNext()) {
                    QuestMember next = it.next();
                    Long l11 = map.get(next);
                    if (l11 == null) {
                        l11 = Long.valueOf(m3.i(o0Var, next, map));
                    }
                    osList.k(l11.longValue());
                }
            }
        }
        QuestProgress realmGet$progress = quest.realmGet$progress();
        if (realmGet$progress != null) {
            Long l12 = map.get(realmGet$progress);
            if (l12 == null) {
                aVar = aVar2;
                j13 = j17;
                q3.i(o0Var, c12, aVar2.f18265k, j17, realmGet$progress, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l12.toString());
            }
        } else {
            aVar = aVar2;
            j13 = j17;
            Table.nativeNullifyLink(j11, aVar.f18265k, j13);
        }
        OsList osList2 = new OsList(c12.s(j13), aVar.f18266l);
        x0<Member> realmGet$participants = quest.realmGet$participants();
        if (realmGet$participants != null && realmGet$participants.size() == osList2.Y()) {
            int size2 = realmGet$participants.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Member member = realmGet$participants.get(i11);
                Long l13 = map.get(member);
                if (l13 == null) {
                    l13 = Long.valueOf(i4.i(o0Var, member, map));
                }
                osList2.V(i11, l13.longValue());
            }
        } else {
            osList2.K();
            if (realmGet$participants != null) {
                Iterator<Member> it2 = realmGet$participants.iterator();
                while (it2.hasNext()) {
                    Member next2 = it2.next();
                    Long l14 = map.get(next2);
                    if (l14 == null) {
                        l14 = Long.valueOf(i4.i(o0Var, next2, map));
                    }
                    osList2.k(l14.longValue());
                }
            }
        }
        OsList osList3 = new OsList(c12.s(j13), aVar.f18267m);
        x0<QuestRageStrike> realmGet$rageStrikes = quest.realmGet$rageStrikes();
        if (realmGet$rageStrikes != null && realmGet$rageStrikes.size() == osList3.Y()) {
            int size3 = realmGet$rageStrikes.size();
            for (int i12 = 0; i12 < size3; i12++) {
                QuestRageStrike questRageStrike = realmGet$rageStrikes.get(i12);
                Long l15 = map.get(questRageStrike);
                if (l15 == null) {
                    l15 = Long.valueOf(s3.i(o0Var, questRageStrike, map));
                }
                osList3.V(i12, l15.longValue());
            }
        } else {
            osList3.K();
            if (realmGet$rageStrikes != null) {
                Iterator<QuestRageStrike> it3 = realmGet$rageStrikes.iterator();
                while (it3.hasNext()) {
                    QuestRageStrike next3 = it3.next();
                    Long l16 = map.get(next3);
                    if (l16 == null) {
                        l16 = Long.valueOf(s3.i(o0Var, next3, map));
                    }
                    osList3.k(l16.longValue());
                }
            }
        }
        String realmGet$completed = quest.realmGet$completed();
        if (realmGet$completed != null) {
            Table.nativeSetString(j11, aVar.f18268n, j13, realmGet$completed, false);
        } else {
            Table.nativeSetNull(j11, aVar.f18268n, j13, false);
        }
        return j13;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        long j11;
        long j12;
        long j13;
        Quest quest;
        long j14;
        a aVar;
        long j15;
        a aVar2;
        Table c12 = o0Var.c1(Quest.class);
        long nativePtr = c12.getNativePtr();
        a aVar3 = (a) o0Var.R().e(Quest.class);
        long j16 = aVar3.f18259e;
        while (it.hasNext()) {
            Quest quest2 = (Quest) it.next();
            if (!map.containsKey(quest2)) {
                if ((quest2 instanceof io.realm.internal.o) && !d1.isFrozen(quest2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) quest2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(quest2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$id = quest2.realmGet$id();
                if (realmGet$id == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j16);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j16, realmGet$id);
                }
                if (nativeFindFirstString == -1) {
                    j10 = OsObject.createRowWithPrimaryKey(c12, j16, realmGet$id);
                } else {
                    j10 = nativeFindFirstString;
                }
                map.put(quest2, Long.valueOf(j10));
                String realmGet$key = quest2.realmGet$key();
                if (realmGet$key != null) {
                    Table.nativeSetString(nativePtr, aVar3.f18260f, j10, realmGet$key, false);
                    j11 = j10;
                    j12 = j16;
                    j13 = nativePtr;
                    quest = quest2;
                } else {
                    j11 = j10;
                    j12 = j16;
                    j13 = nativePtr;
                    quest = quest2;
                    Table.nativeSetNull(nativePtr, aVar3.f18260f, j11, false);
                }
                long j17 = j11;
                Table.nativeSetBoolean(j13, aVar3.f18261g, j17, quest.realmGet$active(), false);
                String realmGet$leader = quest.realmGet$leader();
                if (realmGet$leader != null) {
                    Table.nativeSetString(j13, aVar3.f18262h, j17, realmGet$leader, false);
                    j14 = j17;
                } else {
                    j14 = j17;
                    Table.nativeSetNull(j13, aVar3.f18262h, j17, false);
                }
                long j18 = j14;
                Table.nativeSetBoolean(j13, aVar3.f18263i, j18, quest.realmGet$RSVPNeeded(), false);
                OsList osList = new OsList(c12.s(j18), aVar3.f18264j);
                x0<QuestMember> realmGet$members = quest.realmGet$members();
                if (realmGet$members != null && realmGet$members.size() == osList.Y()) {
                    int size = realmGet$members.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        QuestMember questMember = realmGet$members.get(i10);
                        Long l10 = map.get(questMember);
                        if (l10 == null) {
                            l10 = Long.valueOf(m3.i(o0Var, questMember, map));
                        }
                        osList.V(i10, l10.longValue());
                    }
                } else {
                    osList.K();
                    if (realmGet$members != null) {
                        Iterator<QuestMember> it2 = realmGet$members.iterator();
                        while (it2.hasNext()) {
                            QuestMember next = it2.next();
                            Long l11 = map.get(next);
                            if (l11 == null) {
                                l11 = Long.valueOf(m3.i(o0Var, next, map));
                            }
                            osList.k(l11.longValue());
                        }
                    }
                }
                QuestProgress realmGet$progress = quest.realmGet$progress();
                if (realmGet$progress != null) {
                    Long l12 = map.get(realmGet$progress);
                    if (l12 == null) {
                        aVar = aVar3;
                        j15 = j18;
                        q3.i(o0Var, c12, aVar3.f18265k, j18, realmGet$progress, map);
                    } else {
                        throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l12.toString());
                    }
                } else {
                    aVar = aVar3;
                    j15 = j18;
                    Table.nativeNullifyLink(j13, aVar.f18265k, j15);
                }
                long j19 = j15;
                OsList osList2 = new OsList(c12.s(j19), aVar.f18266l);
                x0<Member> realmGet$participants = quest.realmGet$participants();
                if (realmGet$participants != null && realmGet$participants.size() == osList2.Y()) {
                    int size2 = realmGet$participants.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        Member member = realmGet$participants.get(i11);
                        Long l13 = map.get(member);
                        if (l13 == null) {
                            l13 = Long.valueOf(i4.i(o0Var, member, map));
                        }
                        osList2.V(i11, l13.longValue());
                    }
                } else {
                    osList2.K();
                    if (realmGet$participants != null) {
                        Iterator<Member> it3 = realmGet$participants.iterator();
                        while (it3.hasNext()) {
                            Member next2 = it3.next();
                            Long l14 = map.get(next2);
                            if (l14 == null) {
                                l14 = Long.valueOf(i4.i(o0Var, next2, map));
                            }
                            osList2.k(l14.longValue());
                        }
                    }
                }
                OsList osList3 = new OsList(c12.s(j19), aVar.f18267m);
                x0<QuestRageStrike> realmGet$rageStrikes = quest.realmGet$rageStrikes();
                if (realmGet$rageStrikes != null && realmGet$rageStrikes.size() == osList3.Y()) {
                    int size3 = realmGet$rageStrikes.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        QuestRageStrike questRageStrike = realmGet$rageStrikes.get(i12);
                        Long l15 = map.get(questRageStrike);
                        if (l15 == null) {
                            l15 = Long.valueOf(s3.i(o0Var, questRageStrike, map));
                        }
                        osList3.V(i12, l15.longValue());
                    }
                } else {
                    osList3.K();
                    if (realmGet$rageStrikes != null) {
                        Iterator<QuestRageStrike> it4 = realmGet$rageStrikes.iterator();
                        while (it4.hasNext()) {
                            QuestRageStrike next3 = it4.next();
                            Long l16 = map.get(next3);
                            if (l16 == null) {
                                l16 = Long.valueOf(s3.i(o0Var, next3, map));
                            }
                            osList3.k(l16.longValue());
                        }
                    }
                }
                String realmGet$completed = quest.realmGet$completed();
                if (realmGet$completed != null) {
                    Table.nativeSetString(j13, aVar.f18268n, j19, realmGet$completed, false);
                    aVar2 = aVar;
                } else {
                    a aVar4 = aVar;
                    aVar2 = aVar4;
                    Table.nativeSetNull(j13, aVar4.f18268n, j19, false);
                }
                aVar3 = aVar2;
                j16 = j12;
                nativePtr = j13;
            }
        }
    }

    static u3 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Quest.class), false, Collections.emptyList());
        u3 u3Var = new u3();
        cVar.a();
        return u3Var;
    }

    static Quest n(o0 o0Var, a aVar, Quest quest, Quest quest2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Quest.class), set);
        osObjectBuilder.c1(aVar.f18259e, quest2.realmGet$id());
        osObjectBuilder.c1(aVar.f18260f, quest2.realmGet$key());
        osObjectBuilder.F0(aVar.f18261g, Boolean.valueOf(quest2.realmGet$active()));
        osObjectBuilder.c1(aVar.f18262h, quest2.realmGet$leader());
        osObjectBuilder.F0(aVar.f18263i, Boolean.valueOf(quest2.realmGet$RSVPNeeded()));
        x0<QuestMember> realmGet$members = quest2.realmGet$members();
        if (realmGet$members != null) {
            x0 x0Var = new x0();
            for (int i10 = 0; i10 < realmGet$members.size(); i10++) {
                QuestMember questMember = realmGet$members.get(i10);
                QuestMember questMember2 = (QuestMember) map.get(questMember);
                if (questMember2 != null) {
                    x0Var.add(questMember2);
                } else {
                    x0Var.add(m3.d(o0Var, (m3.a) o0Var.R().e(QuestMember.class), questMember, true, map, set));
                }
            }
            osObjectBuilder.b1(aVar.f18264j, x0Var);
        } else {
            osObjectBuilder.b1(aVar.f18264j, new x0());
        }
        QuestProgress realmGet$progress = quest2.realmGet$progress();
        if (realmGet$progress == null) {
            osObjectBuilder.Z0(aVar.f18265k);
        } else if (((QuestProgress) map.get(realmGet$progress)) == null) {
            q3 k10 = q3.k(o0Var, o0Var.c1(QuestProgress.class).s(((io.realm.internal.o) quest).b().g().createEmbeddedObject(aVar.f18265k, RealmFieldType.OBJECT)));
            map.put(realmGet$progress, k10);
            q3.n(o0Var, realmGet$progress, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheprogress.toString()");
        }
        x0<Member> realmGet$participants = quest2.realmGet$participants();
        if (realmGet$participants != null) {
            x0 x0Var2 = new x0();
            for (int i11 = 0; i11 < realmGet$participants.size(); i11++) {
                Member member = realmGet$participants.get(i11);
                Member member2 = (Member) map.get(member);
                if (member2 != null) {
                    x0Var2.add(member2);
                } else {
                    x0Var2.add(i4.d(o0Var, (i4.a) o0Var.R().e(Member.class), member, true, map, set));
                }
            }
            osObjectBuilder.b1(aVar.f18266l, x0Var2);
        } else {
            osObjectBuilder.b1(aVar.f18266l, new x0());
        }
        x0<QuestRageStrike> realmGet$rageStrikes = quest2.realmGet$rageStrikes();
        if (realmGet$rageStrikes != null) {
            x0 x0Var3 = new x0();
            for (int i12 = 0; i12 < realmGet$rageStrikes.size(); i12++) {
                QuestRageStrike questRageStrike = realmGet$rageStrikes.get(i12);
                QuestRageStrike questRageStrike2 = (QuestRageStrike) map.get(questRageStrike);
                if (questRageStrike2 != null) {
                    x0Var3.add(questRageStrike2);
                } else {
                    x0Var3.add(s3.d(o0Var, (s3.a) o0Var.R().e(QuestRageStrike.class), questRageStrike, true, map, set));
                }
            }
            osObjectBuilder.b1(aVar.f18267m, x0Var3);
        } else {
            osObjectBuilder.b1(aVar.f18267m, new x0());
        }
        osObjectBuilder.c1(aVar.f18268n, quest2.realmGet$completed());
        osObjectBuilder.g1();
        return quest;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18255q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18254p = (a) cVar.c();
        l0<Quest> l0Var = new l0<>(this);
        this.f18255q = l0Var;
        l0Var.r(cVar.e());
        this.f18255q.s(cVar.f());
        this.f18255q.o(cVar.b());
        this.f18255q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18255q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u3 u3Var = (u3) obj;
        io.realm.a f10 = this.f18255q.f();
        io.realm.a f11 = u3Var.f18255q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18255q.g().getTable().p();
        String p11 = u3Var.f18255q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18255q.g().getObjectKey() == u3Var.f18255q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18255q.f().getPath();
        String p10 = this.f18255q.g().getTable().p();
        long objectKey = this.f18255q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public boolean realmGet$RSVPNeeded() {
        this.f18255q.f().e();
        return this.f18255q.g().getBoolean(this.f18254p.f18263i);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public boolean realmGet$active() {
        this.f18255q.f().e();
        return this.f18255q.g().getBoolean(this.f18254p.f18261g);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public String realmGet$completed() {
        this.f18255q.f().e();
        return this.f18255q.g().getString(this.f18254p.f18268n);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public String realmGet$id() {
        this.f18255q.f().e();
        return this.f18255q.g().getString(this.f18254p.f18259e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public String realmGet$key() {
        this.f18255q.f().e();
        return this.f18255q.g().getString(this.f18254p.f18260f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public String realmGet$leader() {
        this.f18255q.f().e();
        return this.f18255q.g().getString(this.f18254p.f18262h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public x0<QuestMember> realmGet$members() {
        this.f18255q.f().e();
        x0<QuestMember> x0Var = this.f18256r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<QuestMember> x0Var2 = new x0<>(QuestMember.class, this.f18255q.g().getModelList(this.f18254p.f18264j), this.f18255q.f());
        this.f18256r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public x0<Member> realmGet$participants() {
        this.f18255q.f().e();
        x0<Member> x0Var = this.f18257u;
        if (x0Var != null) {
            return x0Var;
        }
        x0<Member> x0Var2 = new x0<>(Member.class, this.f18255q.g().getModelList(this.f18254p.f18266l), this.f18255q.f());
        this.f18257u = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public QuestProgress realmGet$progress() {
        this.f18255q.f().e();
        if (this.f18255q.g().isNullLink(this.f18254p.f18265k)) {
            return null;
        }
        return (QuestProgress) this.f18255q.f().B(QuestProgress.class, this.f18255q.g().getLink(this.f18254p.f18265k), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public x0<QuestRageStrike> realmGet$rageStrikes() {
        this.f18255q.f().e();
        x0<QuestRageStrike> x0Var = this.f18258v;
        if (x0Var != null) {
            return x0Var;
        }
        x0<QuestRageStrike> x0Var2 = new x0<>(QuestRageStrike.class, this.f18255q.g().getModelList(this.f18254p.f18267m), this.f18255q.f());
        this.f18258v = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public void realmSet$RSVPNeeded(boolean z10) {
        if (this.f18255q.i()) {
            if (!this.f18255q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18255q.g();
            g10.getTable().z(this.f18254p.f18263i, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18255q.f().e();
        this.f18255q.g().setBoolean(this.f18254p.f18263i, z10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public void realmSet$active(boolean z10) {
        if (this.f18255q.i()) {
            if (!this.f18255q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18255q.g();
            g10.getTable().z(this.f18254p.f18261g, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18255q.f().e();
        this.f18255q.g().setBoolean(this.f18254p.f18261g, z10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public void realmSet$completed(String str) {
        if (this.f18255q.i()) {
            if (!this.f18255q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18255q.g();
            if (str == null) {
                g10.getTable().F(this.f18254p.f18268n, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18254p.f18268n, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18255q.f().e();
        if (str == null) {
            this.f18255q.g().setNull(this.f18254p.f18268n);
        } else {
            this.f18255q.g().setString(this.f18254p.f18268n, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public void realmSet$id(String str) {
        if (this.f18255q.i()) {
            return;
        }
        this.f18255q.f().e();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public void realmSet$key(String str) {
        if (this.f18255q.i()) {
            if (!this.f18255q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18255q.g();
            if (str != null) {
                g10.getTable().G(this.f18254p.f18260f, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'key' to null.");
        }
        this.f18255q.f().e();
        if (str != null) {
            this.f18255q.g().setString(this.f18254p.f18260f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'key' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public void realmSet$leader(String str) {
        if (this.f18255q.i()) {
            if (!this.f18255q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18255q.g();
            if (str == null) {
                g10.getTable().F(this.f18254p.f18262h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18254p.f18262h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18255q.f().e();
        if (str == null) {
            this.f18255q.g().setNull(this.f18254p.f18262h);
        } else {
            this.f18255q.g().setString(this.f18254p.f18262h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public void realmSet$members(x0<QuestMember> x0Var) {
        int i10 = 0;
        if (this.f18255q.i()) {
            if (!this.f18255q.d() || this.f18255q.e().contains("members")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f18255q.f();
                x0<QuestMember> x0Var2 = new x0<>();
                Iterator<QuestMember> it = x0Var.iterator();
                while (it.hasNext()) {
                    QuestMember next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((QuestMember) o0Var.F0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f18255q.f().e();
        OsList modelList = this.f18255q.g().getModelList(this.f18254p.f18264j);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                QuestMember questMember = x0Var.get(i10);
                this.f18255q.c(questMember);
                modelList.V(i10, ((io.realm.internal.o) questMember).b().g().getObjectKey());
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
            QuestMember questMember2 = x0Var.get(i10);
            this.f18255q.c(questMember2);
            modelList.k(((io.realm.internal.o) questMember2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public void realmSet$participants(x0<Member> x0Var) {
        int i10 = 0;
        if (this.f18255q.i()) {
            if (!this.f18255q.d() || this.f18255q.e().contains("participants")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f18255q.f();
                x0<Member> x0Var2 = new x0<>();
                Iterator<Member> it = x0Var.iterator();
                while (it.hasNext()) {
                    Member next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((Member) o0Var.F0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f18255q.f().e();
        OsList modelList = this.f18255q.g().getModelList(this.f18254p.f18266l);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                Member member = x0Var.get(i10);
                this.f18255q.c(member);
                modelList.V(i10, ((io.realm.internal.o) member).b().g().getObjectKey());
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
            Member member2 = x0Var.get(i10);
            this.f18255q.c(member2);
            modelList.k(((io.realm.internal.o) member2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public void realmSet$progress(QuestProgress questProgress) {
        o0 o0Var = (o0) this.f18255q.f();
        if (this.f18255q.i()) {
            if (!this.f18255q.d() || this.f18255q.e().contains("progress")) {
                return;
            }
            if (questProgress != null && !d1.isManaged(questProgress)) {
                QuestProgress questProgress2 = (QuestProgress) o0Var.J0(QuestProgress.class, this, "progress");
                q3.n(o0Var, questProgress, questProgress2, new HashMap(), Collections.EMPTY_SET);
                questProgress = questProgress2;
            }
            io.realm.internal.q g10 = this.f18255q.g();
            if (questProgress == null) {
                g10.nullifyLink(this.f18254p.f18265k);
                return;
            }
            this.f18255q.c(questProgress);
            g10.getTable().D(this.f18254p.f18265k, g10.getObjectKey(), ((io.realm.internal.o) questProgress).b().g().getObjectKey(), true);
            return;
        }
        this.f18255q.f().e();
        if (questProgress == null) {
            this.f18255q.g().nullifyLink(this.f18254p.f18265k);
            return;
        }
        if (d1.isManaged(questProgress)) {
            this.f18255q.c(questProgress);
        }
        q3.n(o0Var, questProgress, (QuestProgress) o0Var.J0(QuestProgress.class, this, "progress"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Quest, io.realm.v3
    public void realmSet$rageStrikes(x0<QuestRageStrike> x0Var) {
        int i10 = 0;
        if (this.f18255q.i()) {
            if (!this.f18255q.d() || this.f18255q.e().contains("rageStrikes")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f18255q.f();
                x0<QuestRageStrike> x0Var2 = new x0<>();
                Iterator<QuestRageStrike> it = x0Var.iterator();
                while (it.hasNext()) {
                    QuestRageStrike next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((QuestRageStrike) o0Var.F0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f18255q.f().e();
        OsList modelList = this.f18255q.g().getModelList(this.f18254p.f18267m);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                QuestRageStrike questRageStrike = x0Var.get(i10);
                this.f18255q.c(questRageStrike);
                modelList.V(i10, ((io.realm.internal.o) questRageStrike).b().g().getObjectKey());
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
            QuestRageStrike questRageStrike2 = x0Var.get(i10);
            this.f18255q.c(questRageStrike2);
            modelList.k(((io.realm.internal.o) questRageStrike2).b().g().getObjectKey());
            i10++;
        }
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Quest = proxy[");
        sb2.append("{id:");
        String str4 = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{key:");
        sb2.append(realmGet$key());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{active:");
        sb2.append(realmGet$active());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{leader:");
        if (realmGet$leader() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$leader();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{RSVPNeeded:");
        sb2.append(realmGet$RSVPNeeded());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{members:");
        sb2.append("RealmList<QuestMember>[");
        sb2.append(realmGet$members().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{progress:");
        if (realmGet$progress() == null) {
            str3 = "null";
        } else {
            str3 = "QuestProgress";
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{participants:");
        sb2.append("RealmList<Member>[");
        sb2.append(realmGet$participants().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{rageStrikes:");
        sb2.append("RealmList<QuestRageStrike>[");
        sb2.append(realmGet$rageStrikes().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{completed:");
        if (realmGet$completed() != null) {
            str4 = realmGet$completed();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
