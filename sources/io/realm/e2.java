package io.realm;

import com.habitrpg.android.habitica.models.WorldState;
import com.habitrpg.android.habitica.models.WorldStateEvent;
import com.habitrpg.android.habitica.models.inventory.QuestProgress;
import com.habitrpg.android.habitica.models.inventory.QuestRageStrike;
import io.realm.a;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.s3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_WorldStateRealmProxy.java */
/* loaded from: classes4.dex */
public class e2 extends WorldState implements io.realm.internal.o {

    /* renamed from: v  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17457v = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17458p;

    /* renamed from: q  reason: collision with root package name */
    private l0<WorldState> f17459q;

    /* renamed from: r  reason: collision with root package name */
    private x0<QuestRageStrike> f17460r;

    /* renamed from: u  reason: collision with root package name */
    private x0<WorldStateEvent> f17461u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_WorldStateRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17462e;

        /* renamed from: f  reason: collision with root package name */
        long f17463f;

        /* renamed from: g  reason: collision with root package name */
        long f17464g;

        /* renamed from: h  reason: collision with root package name */
        long f17465h;

        /* renamed from: i  reason: collision with root package name */
        long f17466i;

        /* renamed from: j  reason: collision with root package name */
        long f17467j;

        /* renamed from: k  reason: collision with root package name */
        long f17468k;

        /* renamed from: l  reason: collision with root package name */
        long f17469l;

        a(OsSchemaInfo osSchemaInfo) {
            super(8);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("WorldState");
            this.f17462e = a("id", "id", b10);
            this.f17463f = a("worldBossKey", "worldBossKey", b10);
            this.f17464g = a("worldBossActive", "worldBossActive", b10);
            this.f17465h = a("progress", "progress", b10);
            this.f17466i = a("rageStrikes", "rageStrikes", b10);
            this.f17467j = a("npcImageSuffix", "npcImageSuffix", b10);
            this.f17468k = a("currentEvent", "currentEvent", b10);
            this.f17469l = a("events", "events", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17462e = aVar.f17462e;
            aVar2.f17463f = aVar.f17463f;
            aVar2.f17464g = aVar.f17464g;
            aVar2.f17465h = aVar.f17465h;
            aVar2.f17466i = aVar.f17466i;
            aVar2.f17467j = aVar.f17467j;
            aVar2.f17468k = aVar.f17468k;
            aVar2.f17469l = aVar.f17469l;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e2() {
        this.f17459q.p();
    }

    public static WorldState c(o0 o0Var, a aVar, WorldState worldState, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        int i10;
        io.realm.internal.o oVar = map.get(worldState);
        if (oVar != null) {
            return (WorldState) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(WorldState.class), set);
        osObjectBuilder.c1(aVar.f17462e, worldState.realmGet$id());
        osObjectBuilder.c1(aVar.f17463f, worldState.realmGet$worldBossKey());
        osObjectBuilder.F0(aVar.f17464g, Boolean.valueOf(worldState.realmGet$worldBossActive()));
        osObjectBuilder.c1(aVar.f17467j, worldState.realmGet$npcImageSuffix());
        e2 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(worldState, l10);
        QuestProgress realmGet$progress = worldState.realmGet$progress();
        if (realmGet$progress == null) {
            l10.realmSet$progress(null);
        } else if (((QuestProgress) map.get(realmGet$progress)) == null) {
            q3 k10 = q3.k(o0Var, o0Var.c1(QuestProgress.class).s(l10.b().g().createEmbeddedObject(aVar.f17465h, RealmFieldType.OBJECT)));
            map.put(realmGet$progress, k10);
            q3.n(o0Var, realmGet$progress, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheprogress.toString()");
        }
        x0<QuestRageStrike> realmGet$rageStrikes = worldState.realmGet$rageStrikes();
        if (realmGet$rageStrikes != null) {
            x0<QuestRageStrike> realmGet$rageStrikes2 = l10.realmGet$rageStrikes();
            realmGet$rageStrikes2.clear();
            int i11 = 0;
            while (i11 < realmGet$rageStrikes.size()) {
                QuestRageStrike questRageStrike = realmGet$rageStrikes.get(i11);
                QuestRageStrike questRageStrike2 = (QuestRageStrike) map.get(questRageStrike);
                if (questRageStrike2 != null) {
                    realmGet$rageStrikes2.add(questRageStrike2);
                    i10 = i11;
                } else {
                    i10 = i11;
                    realmGet$rageStrikes2.add(s3.d(o0Var, (s3.a) o0Var.R().e(QuestRageStrike.class), questRageStrike, z10, map, set));
                }
                i11 = i10 + 1;
            }
        }
        WorldStateEvent realmGet$currentEvent = worldState.realmGet$currentEvent();
        if (realmGet$currentEvent == null) {
            l10.realmSet$currentEvent(null);
        } else if (((WorldStateEvent) map.get(realmGet$currentEvent)) == null) {
            c2 k11 = c2.k(o0Var, o0Var.c1(WorldStateEvent.class).s(l10.b().g().createEmbeddedObject(aVar.f17468k, RealmFieldType.OBJECT)));
            map.put(realmGet$currentEvent, k11);
            c2.n(o0Var, realmGet$currentEvent, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecurrentEvent.toString()");
        }
        x0<WorldStateEvent> realmGet$events = worldState.realmGet$events();
        if (realmGet$events != null) {
            x0<WorldStateEvent> realmGet$events2 = l10.realmGet$events();
            realmGet$events2.clear();
            for (int i12 = 0; i12 < realmGet$events.size(); i12++) {
                WorldStateEvent worldStateEvent = realmGet$events.get(i12);
                if (((WorldStateEvent) map.get(worldStateEvent)) == null) {
                    c2 k12 = c2.k(o0Var, o0Var.c1(WorldStateEvent.class).s(realmGet$events2.m().n()));
                    map.put(worldStateEvent, k12);
                    c2.n(o0Var, worldStateEvent, k12, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheevents.toString()");
                }
            }
        }
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.WorldState d(io.realm.o0 r8, io.realm.e2.a r9, com.habitrpg.android.habitica.models.WorldState r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.WorldState r1 = (com.habitrpg.android.habitica.models.WorldState) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.WorldState> r2 = com.habitrpg.android.habitica.models.WorldState.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17462e
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
            io.realm.e2 r1 = new io.realm.e2     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.WorldState r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.WorldState r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.e2.d(io.realm.o0, io.realm.e2$a, com.habitrpg.android.habitica.models.WorldState, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.WorldState");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static WorldState f(WorldState worldState, int i10, int i11, Map<a1, o.a<a1>> map) {
        WorldState worldState2;
        if (i10 > i11 || worldState == null) {
            return null;
        }
        o.a<a1> aVar = map.get(worldState);
        if (aVar == null) {
            worldState2 = new WorldState();
            map.put(worldState, new o.a<>(i10, worldState2));
        } else if (i10 >= aVar.f17831a) {
            return (WorldState) aVar.f17832b;
        } else {
            WorldState worldState3 = (WorldState) aVar.f17832b;
            aVar.f17831a = i10;
            worldState2 = worldState3;
        }
        o0 o0Var = (o0) ((io.realm.internal.o) worldState).b().f();
        worldState2.realmSet$id(worldState.realmGet$id());
        worldState2.realmSet$worldBossKey(worldState.realmGet$worldBossKey());
        worldState2.realmSet$worldBossActive(worldState.realmGet$worldBossActive());
        int i12 = i10 + 1;
        worldState2.realmSet$progress(q3.f(worldState.realmGet$progress(), i12, i11, map));
        if (i10 == i11) {
            worldState2.realmSet$rageStrikes(null);
        } else {
            x0<QuestRageStrike> realmGet$rageStrikes = worldState.realmGet$rageStrikes();
            x0<QuestRageStrike> x0Var = new x0<>();
            worldState2.realmSet$rageStrikes(x0Var);
            int size = realmGet$rageStrikes.size();
            for (int i13 = 0; i13 < size; i13++) {
                x0Var.add(s3.f(realmGet$rageStrikes.get(i13), i12, i11, map));
            }
        }
        worldState2.realmSet$npcImageSuffix(worldState.realmGet$npcImageSuffix());
        worldState2.realmSet$currentEvent(c2.f(worldState.realmGet$currentEvent(), i12, i11, map));
        if (i10 == i11) {
            worldState2.realmSet$events(null);
        } else {
            x0<WorldStateEvent> realmGet$events = worldState.realmGet$events();
            x0<WorldStateEvent> x0Var2 = new x0<>();
            worldState2.realmSet$events(x0Var2);
            int size2 = realmGet$events.size();
            for (int i14 = 0; i14 < size2; i14++) {
                x0Var2.add(c2.f(realmGet$events.get(i14), i12, i11, map));
            }
        }
        return worldState2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "WorldState", false, 8, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, true);
        bVar.b("", "worldBossKey", realmFieldType, false, false, true);
        bVar.b("", "worldBossActive", RealmFieldType.BOOLEAN, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.OBJECT;
        bVar.a("", "progress", realmFieldType2, "QuestProgress");
        RealmFieldType realmFieldType3 = RealmFieldType.LIST;
        bVar.a("", "rageStrikes", realmFieldType3, "QuestRageStrike");
        bVar.b("", "npcImageSuffix", realmFieldType, false, false, false);
        bVar.a("", "currentEvent", realmFieldType2, "WorldStateEvent");
        bVar.a("", "events", realmFieldType3, "WorldStateEvent");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17457v;
    }

    public static long i(o0 o0Var, WorldState worldState, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        a aVar;
        long j13;
        long j14;
        String str;
        long j15;
        a aVar2;
        if ((worldState instanceof io.realm.internal.o) && !d1.isFrozen(worldState)) {
            io.realm.internal.o oVar = (io.realm.internal.o) worldState;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(WorldState.class);
        long nativePtr = c12.getNativePtr();
        a aVar3 = (a) o0Var.R().e(WorldState.class);
        long j16 = aVar3.f17462e;
        String realmGet$id = worldState.realmGet$id();
        if (realmGet$id != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j16, realmGet$id);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j16, realmGet$id);
        }
        long j17 = j10;
        map.put(worldState, Long.valueOf(j17));
        String realmGet$worldBossKey = worldState.realmGet$worldBossKey();
        if (realmGet$worldBossKey != null) {
            Table.nativeSetString(nativePtr, aVar3.f17463f, j17, realmGet$worldBossKey, false);
            j11 = j17;
            j12 = nativePtr;
        } else {
            j11 = j17;
            j12 = nativePtr;
            Table.nativeSetNull(nativePtr, aVar3.f17463f, j11, false);
        }
        long j18 = j11;
        Table.nativeSetBoolean(j12, aVar3.f17464g, j18, worldState.realmGet$worldBossActive(), false);
        QuestProgress realmGet$progress = worldState.realmGet$progress();
        if (realmGet$progress != null) {
            Long l10 = map.get(realmGet$progress);
            if (l10 == null) {
                aVar = aVar3;
                j13 = j18;
                q3.i(o0Var, c12, aVar3.f17465h, j18, realmGet$progress, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
            }
        } else {
            aVar = aVar3;
            j13 = j18;
            Table.nativeNullifyLink(j12, aVar.f17465h, j13);
        }
        long j19 = j13;
        OsList osList = new OsList(c12.s(j19), aVar.f17466i);
        x0<QuestRageStrike> realmGet$rageStrikes = worldState.realmGet$rageStrikes();
        if (realmGet$rageStrikes != null && realmGet$rageStrikes.size() == osList.Y()) {
            int size = realmGet$rageStrikes.size();
            int i10 = 0;
            while (i10 < size) {
                QuestRageStrike questRageStrike = realmGet$rageStrikes.get(i10);
                Long l11 = map.get(questRageStrike);
                if (l11 == null) {
                    l11 = Long.valueOf(s3.i(o0Var, questRageStrike, map));
                }
                osList.V(i10, l11.longValue());
                i10++;
                j19 = j19;
            }
            j14 = j19;
        } else {
            j14 = j19;
            osList.K();
            if (realmGet$rageStrikes != null) {
                Iterator<QuestRageStrike> it = realmGet$rageStrikes.iterator();
                while (it.hasNext()) {
                    QuestRageStrike next = it.next();
                    Long l12 = map.get(next);
                    if (l12 == null) {
                        l12 = Long.valueOf(s3.i(o0Var, next, map));
                    }
                    osList.k(l12.longValue());
                }
            }
        }
        String realmGet$npcImageSuffix = worldState.realmGet$npcImageSuffix();
        if (realmGet$npcImageSuffix != null) {
            Table.nativeSetString(j12, aVar.f17467j, j14, realmGet$npcImageSuffix, false);
            str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
            aVar2 = aVar;
            j15 = j14;
        } else {
            a aVar4 = aVar;
            str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
            j15 = j14;
            aVar2 = aVar4;
            Table.nativeSetNull(j12, aVar4.f17467j, j15, false);
        }
        WorldStateEvent realmGet$currentEvent = worldState.realmGet$currentEvent();
        if (realmGet$currentEvent != null) {
            Long l13 = map.get(realmGet$currentEvent);
            if (l13 == null) {
                c2.i(o0Var, c12, aVar2.f17468k, j15, realmGet$currentEvent, map);
            } else {
                throw new IllegalArgumentException(str + l13.toString());
            }
        } else {
            Table.nativeNullifyLink(j12, aVar2.f17468k, j15);
        }
        OsList osList2 = new OsList(c12.s(j15), aVar2.f17469l);
        x0<WorldStateEvent> realmGet$events = worldState.realmGet$events();
        osList2.K();
        if (realmGet$events != null) {
            Iterator<WorldStateEvent> it2 = realmGet$events.iterator();
            while (it2.hasNext()) {
                WorldStateEvent next2 = it2.next();
                Long l14 = map.get(next2);
                if (l14 == null) {
                    c2.i(o0Var, c12, aVar2.f17469l, j15, next2, map);
                } else {
                    throw new IllegalArgumentException(str + l14.toString());
                }
            }
        }
        return j15;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        long j13;
        WorldState worldState;
        a aVar;
        long j14;
        String str;
        String str2;
        long j15;
        a aVar2;
        String str3;
        Table c12 = o0Var.c1(WorldState.class);
        long nativePtr = c12.getNativePtr();
        a aVar3 = (a) o0Var.R().e(WorldState.class);
        long j16 = aVar3.f17462e;
        while (it.hasNext()) {
            WorldState worldState2 = (WorldState) it.next();
            if (!map.containsKey(worldState2)) {
                if ((worldState2 instanceof io.realm.internal.o) && !d1.isFrozen(worldState2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) worldState2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(worldState2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$id = worldState2.realmGet$id();
                if (realmGet$id != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j16, realmGet$id);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j10 = OsObject.createRowWithPrimaryKey(c12, j16, realmGet$id);
                }
                long j17 = j10;
                map.put(worldState2, Long.valueOf(j17));
                String realmGet$worldBossKey = worldState2.realmGet$worldBossKey();
                if (realmGet$worldBossKey != null) {
                    Table.nativeSetString(nativePtr, aVar3.f17463f, j17, realmGet$worldBossKey, false);
                    j11 = j17;
                    j12 = j16;
                    j13 = nativePtr;
                    worldState = worldState2;
                } else {
                    j11 = j17;
                    j12 = j16;
                    j13 = nativePtr;
                    worldState = worldState2;
                    Table.nativeSetNull(nativePtr, aVar3.f17463f, j11, false);
                }
                long j18 = j11;
                Table.nativeSetBoolean(j13, aVar3.f17464g, j18, worldState.realmGet$worldBossActive(), false);
                QuestProgress realmGet$progress = worldState.realmGet$progress();
                String str4 = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
                if (realmGet$progress != null) {
                    Long l10 = map.get(realmGet$progress);
                    if (l10 == null) {
                        aVar = aVar3;
                        j14 = j18;
                        q3.i(o0Var, c12, aVar3.f17465h, j18, realmGet$progress, map);
                    } else {
                        throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
                    }
                } else {
                    aVar = aVar3;
                    j14 = j18;
                    Table.nativeNullifyLink(j13, aVar.f17465h, j14);
                }
                long j19 = j14;
                OsList osList = new OsList(c12.s(j19), aVar.f17466i);
                x0<QuestRageStrike> realmGet$rageStrikes = worldState.realmGet$rageStrikes();
                if (realmGet$rageStrikes == null || realmGet$rageStrikes.size() != osList.Y()) {
                    str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
                    osList.K();
                    if (realmGet$rageStrikes != null) {
                        Iterator<QuestRageStrike> it2 = realmGet$rageStrikes.iterator();
                        while (it2.hasNext()) {
                            QuestRageStrike next = it2.next();
                            Long l11 = map.get(next);
                            if (l11 == null) {
                                l11 = Long.valueOf(s3.i(o0Var, next, map));
                            }
                            osList.k(l11.longValue());
                        }
                    }
                } else {
                    int size = realmGet$rageStrikes.size();
                    int i10 = 0;
                    while (i10 < size) {
                        QuestRageStrike questRageStrike = realmGet$rageStrikes.get(i10);
                        Long l12 = map.get(questRageStrike);
                        if (l12 == null) {
                            l12 = Long.valueOf(s3.i(o0Var, questRageStrike, map));
                        }
                        osList.V(i10, l12.longValue());
                        i10++;
                        str4 = str4;
                    }
                    str = str4;
                }
                String realmGet$npcImageSuffix = worldState.realmGet$npcImageSuffix();
                if (realmGet$npcImageSuffix != null) {
                    a aVar4 = aVar;
                    str2 = str;
                    Table.nativeSetString(j13, aVar.f17467j, j19, realmGet$npcImageSuffix, false);
                    j15 = j19;
                    aVar2 = aVar4;
                } else {
                    str2 = str;
                    a aVar5 = aVar;
                    j15 = j19;
                    aVar2 = aVar5;
                    Table.nativeSetNull(j13, aVar5.f17467j, j19, false);
                }
                WorldStateEvent realmGet$currentEvent = worldState.realmGet$currentEvent();
                if (realmGet$currentEvent != null) {
                    Long l13 = map.get(realmGet$currentEvent);
                    if (l13 == null) {
                        str3 = str2;
                        c2.i(o0Var, c12, aVar2.f17468k, j15, realmGet$currentEvent, map);
                    } else {
                        throw new IllegalArgumentException(str2 + l13.toString());
                    }
                } else {
                    str3 = str2;
                    Table.nativeNullifyLink(j13, aVar2.f17468k, j15);
                }
                OsList osList2 = new OsList(c12.s(j15), aVar2.f17469l);
                x0<WorldStateEvent> realmGet$events = worldState.realmGet$events();
                osList2.K();
                if (realmGet$events != null) {
                    Iterator<WorldStateEvent> it3 = realmGet$events.iterator();
                    while (it3.hasNext()) {
                        WorldStateEvent next2 = it3.next();
                        Long l14 = map.get(next2);
                        if (l14 == null) {
                            c2.i(o0Var, c12, aVar2.f17469l, j15, next2, map);
                        } else {
                            throw new IllegalArgumentException(str3 + l14.toString());
                        }
                    }
                }
                aVar3 = aVar2;
                j16 = j12;
                nativePtr = j13;
            }
        }
    }

    static e2 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(WorldState.class), false, Collections.emptyList());
        e2 e2Var = new e2();
        cVar.a();
        return e2Var;
    }

    static WorldState n(o0 o0Var, a aVar, WorldState worldState, WorldState worldState2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(WorldState.class), set);
        osObjectBuilder.c1(aVar.f17462e, worldState2.realmGet$id());
        osObjectBuilder.c1(aVar.f17463f, worldState2.realmGet$worldBossKey());
        osObjectBuilder.F0(aVar.f17464g, Boolean.valueOf(worldState2.realmGet$worldBossActive()));
        QuestProgress realmGet$progress = worldState2.realmGet$progress();
        if (realmGet$progress == null) {
            osObjectBuilder.Z0(aVar.f17465h);
        } else if (((QuestProgress) map.get(realmGet$progress)) == null) {
            q3 k10 = q3.k(o0Var, o0Var.c1(QuestProgress.class).s(((io.realm.internal.o) worldState).b().g().createEmbeddedObject(aVar.f17465h, RealmFieldType.OBJECT)));
            map.put(realmGet$progress, k10);
            q3.n(o0Var, realmGet$progress, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheprogress.toString()");
        }
        x0<QuestRageStrike> realmGet$rageStrikes = worldState2.realmGet$rageStrikes();
        if (realmGet$rageStrikes != null) {
            x0 x0Var = new x0();
            for (int i10 = 0; i10 < realmGet$rageStrikes.size(); i10++) {
                QuestRageStrike questRageStrike = realmGet$rageStrikes.get(i10);
                QuestRageStrike questRageStrike2 = (QuestRageStrike) map.get(questRageStrike);
                if (questRageStrike2 != null) {
                    x0Var.add(questRageStrike2);
                } else {
                    x0Var.add(s3.d(o0Var, (s3.a) o0Var.R().e(QuestRageStrike.class), questRageStrike, true, map, set));
                }
            }
            osObjectBuilder.b1(aVar.f17466i, x0Var);
        } else {
            osObjectBuilder.b1(aVar.f17466i, new x0());
        }
        osObjectBuilder.c1(aVar.f17467j, worldState2.realmGet$npcImageSuffix());
        WorldStateEvent realmGet$currentEvent = worldState2.realmGet$currentEvent();
        if (realmGet$currentEvent == null) {
            osObjectBuilder.Z0(aVar.f17468k);
        } else if (((WorldStateEvent) map.get(realmGet$currentEvent)) == null) {
            c2 k11 = c2.k(o0Var, o0Var.c1(WorldStateEvent.class).s(((io.realm.internal.o) worldState).b().g().createEmbeddedObject(aVar.f17468k, RealmFieldType.OBJECT)));
            map.put(realmGet$currentEvent, k11);
            c2.n(o0Var, realmGet$currentEvent, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecurrentEvent.toString()");
        }
        x0<WorldStateEvent> realmGet$events = worldState2.realmGet$events();
        if (realmGet$events != null) {
            x0 x0Var2 = new x0();
            OsList m10 = worldState.realmGet$events().m();
            m10.q();
            for (int i11 = 0; i11 < realmGet$events.size(); i11++) {
                WorldStateEvent worldStateEvent = realmGet$events.get(i11);
                if (((WorldStateEvent) map.get(worldStateEvent)) == null) {
                    c2 k12 = c2.k(o0Var, o0Var.c1(WorldStateEvent.class).s(m10.n()));
                    map.put(worldStateEvent, k12);
                    x0Var2.add(k12);
                    c2.n(o0Var, worldStateEvent, k12, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheevents.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f17469l, new x0());
        }
        osObjectBuilder.g1();
        return worldState;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17459q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17458p = (a) cVar.c();
        l0<WorldState> l0Var = new l0<>(this);
        this.f17459q = l0Var;
        l0Var.r(cVar.e());
        this.f17459q.s(cVar.f());
        this.f17459q.o(cVar.b());
        this.f17459q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17459q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e2 e2Var = (e2) obj;
        io.realm.a f10 = this.f17459q.f();
        io.realm.a f11 = e2Var.f17459q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17459q.g().getTable().p();
        String p11 = e2Var.f17459q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17459q.g().getObjectKey() == e2Var.f17459q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17459q.f().getPath();
        String p10 = this.f17459q.g().getTable().p();
        long objectKey = this.f17459q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public WorldStateEvent realmGet$currentEvent() {
        this.f17459q.f().e();
        if (this.f17459q.g().isNullLink(this.f17458p.f17468k)) {
            return null;
        }
        return (WorldStateEvent) this.f17459q.f().B(WorldStateEvent.class, this.f17459q.g().getLink(this.f17458p.f17468k), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public x0<WorldStateEvent> realmGet$events() {
        this.f17459q.f().e();
        x0<WorldStateEvent> x0Var = this.f17461u;
        if (x0Var != null) {
            return x0Var;
        }
        x0<WorldStateEvent> x0Var2 = new x0<>(WorldStateEvent.class, this.f17459q.g().getModelList(this.f17458p.f17469l), this.f17459q.f());
        this.f17461u = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public String realmGet$id() {
        this.f17459q.f().e();
        return this.f17459q.g().getString(this.f17458p.f17462e);
    }

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public String realmGet$npcImageSuffix() {
        this.f17459q.f().e();
        return this.f17459q.g().getString(this.f17458p.f17467j);
    }

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public QuestProgress realmGet$progress() {
        this.f17459q.f().e();
        if (this.f17459q.g().isNullLink(this.f17458p.f17465h)) {
            return null;
        }
        return (QuestProgress) this.f17459q.f().B(QuestProgress.class, this.f17459q.g().getLink(this.f17458p.f17465h), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public x0<QuestRageStrike> realmGet$rageStrikes() {
        this.f17459q.f().e();
        x0<QuestRageStrike> x0Var = this.f17460r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<QuestRageStrike> x0Var2 = new x0<>(QuestRageStrike.class, this.f17459q.g().getModelList(this.f17458p.f17466i), this.f17459q.f());
        this.f17460r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public boolean realmGet$worldBossActive() {
        this.f17459q.f().e();
        return this.f17459q.g().getBoolean(this.f17458p.f17464g);
    }

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public String realmGet$worldBossKey() {
        this.f17459q.f().e();
        return this.f17459q.g().getString(this.f17458p.f17463f);
    }

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public void realmSet$currentEvent(WorldStateEvent worldStateEvent) {
        o0 o0Var = (o0) this.f17459q.f();
        if (this.f17459q.i()) {
            if (!this.f17459q.d() || this.f17459q.e().contains("currentEvent")) {
                return;
            }
            if (worldStateEvent != null && !d1.isManaged(worldStateEvent)) {
                WorldStateEvent worldStateEvent2 = (WorldStateEvent) o0Var.J0(WorldStateEvent.class, this, "currentEvent");
                c2.n(o0Var, worldStateEvent, worldStateEvent2, new HashMap(), Collections.EMPTY_SET);
                worldStateEvent = worldStateEvent2;
            }
            io.realm.internal.q g10 = this.f17459q.g();
            if (worldStateEvent == null) {
                g10.nullifyLink(this.f17458p.f17468k);
                return;
            }
            this.f17459q.c(worldStateEvent);
            g10.getTable().D(this.f17458p.f17468k, g10.getObjectKey(), ((io.realm.internal.o) worldStateEvent).b().g().getObjectKey(), true);
            return;
        }
        this.f17459q.f().e();
        if (worldStateEvent == null) {
            this.f17459q.g().nullifyLink(this.f17458p.f17468k);
            return;
        }
        if (d1.isManaged(worldStateEvent)) {
            this.f17459q.c(worldStateEvent);
        }
        c2.n(o0Var, worldStateEvent, (WorldStateEvent) o0Var.J0(WorldStateEvent.class, this, "currentEvent"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public void realmSet$events(x0<WorldStateEvent> x0Var) {
        int i10 = 0;
        if (this.f17459q.i()) {
            if (!this.f17459q.d() || this.f17459q.e().contains("events")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17459q.f();
                x0<WorldStateEvent> x0Var2 = new x0<>();
                Iterator<WorldStateEvent> it = x0Var.iterator();
                while (it.hasNext()) {
                    WorldStateEvent next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((WorldStateEvent) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17459q.f().e();
        OsList modelList = this.f17459q.g().getModelList(this.f17458p.f17469l);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                WorldStateEvent worldStateEvent = x0Var.get(i10);
                this.f17459q.c(worldStateEvent);
                modelList.V(i10, ((io.realm.internal.o) worldStateEvent).b().g().getObjectKey());
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
            WorldStateEvent worldStateEvent2 = x0Var.get(i10);
            this.f17459q.c(worldStateEvent2);
            modelList.k(((io.realm.internal.o) worldStateEvent2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public void realmSet$id(String str) {
        if (this.f17459q.i()) {
            return;
        }
        this.f17459q.f().e();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public void realmSet$npcImageSuffix(String str) {
        if (this.f17459q.i()) {
            if (!this.f17459q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17459q.g();
            if (str == null) {
                g10.getTable().F(this.f17458p.f17467j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17458p.f17467j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17459q.f().e();
        if (str == null) {
            this.f17459q.g().setNull(this.f17458p.f17467j);
        } else {
            this.f17459q.g().setString(this.f17458p.f17467j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public void realmSet$progress(QuestProgress questProgress) {
        o0 o0Var = (o0) this.f17459q.f();
        if (this.f17459q.i()) {
            if (!this.f17459q.d() || this.f17459q.e().contains("progress")) {
                return;
            }
            if (questProgress != null && !d1.isManaged(questProgress)) {
                QuestProgress questProgress2 = (QuestProgress) o0Var.J0(QuestProgress.class, this, "progress");
                q3.n(o0Var, questProgress, questProgress2, new HashMap(), Collections.EMPTY_SET);
                questProgress = questProgress2;
            }
            io.realm.internal.q g10 = this.f17459q.g();
            if (questProgress == null) {
                g10.nullifyLink(this.f17458p.f17465h);
                return;
            }
            this.f17459q.c(questProgress);
            g10.getTable().D(this.f17458p.f17465h, g10.getObjectKey(), ((io.realm.internal.o) questProgress).b().g().getObjectKey(), true);
            return;
        }
        this.f17459q.f().e();
        if (questProgress == null) {
            this.f17459q.g().nullifyLink(this.f17458p.f17465h);
            return;
        }
        if (d1.isManaged(questProgress)) {
            this.f17459q.c(questProgress);
        }
        q3.n(o0Var, questProgress, (QuestProgress) o0Var.J0(QuestProgress.class, this, "progress"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public void realmSet$rageStrikes(x0<QuestRageStrike> x0Var) {
        int i10 = 0;
        if (this.f17459q.i()) {
            if (!this.f17459q.d() || this.f17459q.e().contains("rageStrikes")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17459q.f();
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
        this.f17459q.f().e();
        OsList modelList = this.f17459q.g().getModelList(this.f17458p.f17466i);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                QuestRageStrike questRageStrike = x0Var.get(i10);
                this.f17459q.c(questRageStrike);
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
            this.f17459q.c(questRageStrike2);
            modelList.k(((io.realm.internal.o) questRageStrike2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public void realmSet$worldBossActive(boolean z10) {
        if (this.f17459q.i()) {
            if (!this.f17459q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17459q.g();
            g10.getTable().z(this.f17458p.f17464g, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17459q.f().e();
        this.f17459q.g().setBoolean(this.f17458p.f17464g, z10);
    }

    @Override // com.habitrpg.android.habitica.models.WorldState, io.realm.f2
    public void realmSet$worldBossKey(String str) {
        if (this.f17459q.i()) {
            if (!this.f17459q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17459q.g();
            if (str != null) {
                g10.getTable().G(this.f17458p.f17463f, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'worldBossKey' to null.");
        }
        this.f17459q.f().e();
        if (str != null) {
            this.f17459q.g().setString(this.f17458p.f17463f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'worldBossKey' to null.");
    }

    public String toString() {
        String str;
        String str2;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("WorldState = proxy[");
        sb2.append("{id:");
        sb2.append(realmGet$id());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{worldBossKey:");
        sb2.append(realmGet$worldBossKey());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{worldBossActive:");
        sb2.append(realmGet$worldBossActive());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{progress:");
        String str3 = "null";
        if (realmGet$progress() == null) {
            str = "null";
        } else {
            str = "QuestProgress";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{rageStrikes:");
        sb2.append("RealmList<QuestRageStrike>[");
        sb2.append(realmGet$rageStrikes().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{npcImageSuffix:");
        if (realmGet$npcImageSuffix() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$npcImageSuffix();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{currentEvent:");
        if (realmGet$currentEvent() != null) {
            str3 = "WorldStateEvent";
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{events:");
        sb2.append("RealmList<WorldStateEvent>[");
        sb2.append(realmGet$events().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
