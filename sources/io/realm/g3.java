package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.inventory.ItemEvent;
import com.habitrpg.android.habitica.models.inventory.QuestBoss;
import com.habitrpg.android.habitica.models.inventory.QuestCollect;
import com.habitrpg.android.habitica.models.inventory.QuestColors;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.inventory.QuestDrops;
import io.realm.a;
import io.realm.a3;
import io.realm.c3;
import io.realm.e3;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.k3;
import io.realm.s2;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_inventory_QuestContentRealmProxy.java */
/* loaded from: classes4.dex */
public class g3 extends QuestContent implements io.realm.internal.o {

    /* renamed from: u  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17530u = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17531p;

    /* renamed from: q  reason: collision with root package name */
    private l0<QuestContent> f17532q;

    /* renamed from: r  reason: collision with root package name */
    private x0<QuestCollect> f17533r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_QuestContentRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17534e;

        /* renamed from: f  reason: collision with root package name */
        long f17535f;

        /* renamed from: g  reason: collision with root package name */
        long f17536g;

        /* renamed from: h  reason: collision with root package name */
        long f17537h;

        /* renamed from: i  reason: collision with root package name */
        long f17538i;

        /* renamed from: j  reason: collision with root package name */
        long f17539j;

        /* renamed from: k  reason: collision with root package name */
        long f17540k;

        /* renamed from: l  reason: collision with root package name */
        long f17541l;

        /* renamed from: m  reason: collision with root package name */
        long f17542m;

        /* renamed from: n  reason: collision with root package name */
        long f17543n;

        /* renamed from: o  reason: collision with root package name */
        long f17544o;

        /* renamed from: p  reason: collision with root package name */
        long f17545p;

        /* renamed from: q  reason: collision with root package name */
        long f17546q;

        /* renamed from: r  reason: collision with root package name */
        long f17547r;

        a(OsSchemaInfo osSchemaInfo) {
            super(14);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("QuestContent");
            this.f17534e = a("key", "key", b10);
            this.f17535f = a("text", "text", b10);
            this.f17536g = a("notes", "notes", b10);
            this.f17537h = a("completion", "completion", b10);
            this.f17538i = a(AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.VALUE, b10);
            this.f17539j = a("previous", "previous", b10);
            this.f17540k = a("lvl", "lvl", b10);
            this.f17541l = a("isCanBuy", "isCanBuy", b10);
            this.f17542m = a("category", "category", b10);
            this.f17543n = a("boss", "boss", b10);
            this.f17544o = a("drop", "drop", b10);
            this.f17545p = a("colors", "colors", b10);
            this.f17546q = a("collect", "collect", b10);
            this.f17547r = a("event", "event", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17534e = aVar.f17534e;
            aVar2.f17535f = aVar.f17535f;
            aVar2.f17536g = aVar.f17536g;
            aVar2.f17537h = aVar.f17537h;
            aVar2.f17538i = aVar.f17538i;
            aVar2.f17539j = aVar.f17539j;
            aVar2.f17540k = aVar.f17540k;
            aVar2.f17541l = aVar.f17541l;
            aVar2.f17542m = aVar.f17542m;
            aVar2.f17543n = aVar.f17543n;
            aVar2.f17544o = aVar.f17544o;
            aVar2.f17545p = aVar.f17545p;
            aVar2.f17546q = aVar.f17546q;
            aVar2.f17547r = aVar.f17547r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g3() {
        this.f17532q.p();
    }

    public static QuestContent c(o0 o0Var, a aVar, QuestContent questContent, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(questContent);
        if (oVar != null) {
            return (QuestContent) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestContent.class), set);
        osObjectBuilder.c1(aVar.f17534e, questContent.realmGet$key());
        osObjectBuilder.c1(aVar.f17535f, questContent.realmGet$text());
        osObjectBuilder.c1(aVar.f17536g, questContent.realmGet$notes());
        osObjectBuilder.c1(aVar.f17537h, questContent.realmGet$completion());
        osObjectBuilder.V0(aVar.f17538i, Integer.valueOf(questContent.realmGet$value()));
        osObjectBuilder.c1(aVar.f17539j, questContent.realmGet$previous());
        osObjectBuilder.V0(aVar.f17540k, Integer.valueOf(questContent.realmGet$lvl()));
        osObjectBuilder.F0(aVar.f17541l, Boolean.valueOf(questContent.realmGet$isCanBuy()));
        osObjectBuilder.c1(aVar.f17542m, questContent.realmGet$category());
        g3 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(questContent, l10);
        QuestBoss realmGet$boss = questContent.realmGet$boss();
        if (realmGet$boss == null) {
            l10.realmSet$boss(null);
        } else {
            QuestBoss questBoss = (QuestBoss) map.get(realmGet$boss);
            if (questBoss != null) {
                l10.realmSet$boss(questBoss);
            } else {
                l10.realmSet$boss(a3.d(o0Var, (a3.a) o0Var.R().e(QuestBoss.class), realmGet$boss, z10, map, set));
            }
        }
        QuestDrops realmGet$drop = questContent.realmGet$drop();
        if (realmGet$drop == null) {
            l10.realmSet$drop(null);
        } else {
            QuestDrops questDrops = (QuestDrops) map.get(realmGet$drop);
            if (questDrops != null) {
                l10.realmSet$drop(questDrops);
            } else {
                l10.realmSet$drop(k3.d(o0Var, (k3.a) o0Var.R().e(QuestDrops.class), realmGet$drop, z10, map, set));
            }
        }
        QuestColors realmGet$colors = questContent.realmGet$colors();
        if (realmGet$colors == null) {
            l10.realmSet$colors(null);
        } else {
            QuestColors questColors = (QuestColors) map.get(realmGet$colors);
            if (questColors != null) {
                l10.realmSet$colors(questColors);
            } else {
                l10.realmSet$colors(e3.d(o0Var, (e3.a) o0Var.R().e(QuestColors.class), realmGet$colors, z10, map, set));
            }
        }
        x0<QuestCollect> realmGet$collect = questContent.realmGet$collect();
        if (realmGet$collect != null) {
            x0<QuestCollect> realmGet$collect2 = l10.realmGet$collect();
            realmGet$collect2.clear();
            for (int i10 = 0; i10 < realmGet$collect.size(); i10++) {
                QuestCollect questCollect = realmGet$collect.get(i10);
                QuestCollect questCollect2 = (QuestCollect) map.get(questCollect);
                if (questCollect2 != null) {
                    realmGet$collect2.add(questCollect2);
                } else {
                    realmGet$collect2.add(c3.d(o0Var, (c3.a) o0Var.R().e(QuestCollect.class), questCollect, z10, map, set));
                }
            }
        }
        ItemEvent realmGet$event = questContent.realmGet$event();
        if (realmGet$event == null) {
            l10.realmSet$event(null);
        } else {
            ItemEvent itemEvent = (ItemEvent) map.get(realmGet$event);
            if (itemEvent != null) {
                l10.realmSet$event(itemEvent);
            } else {
                l10.realmSet$event(s2.d(o0Var, (s2.a) o0Var.R().e(ItemEvent.class), realmGet$event, z10, map, set));
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
    public static com.habitrpg.android.habitica.models.inventory.QuestContent d(io.realm.o0 r8, io.realm.g3.a r9, com.habitrpg.android.habitica.models.inventory.QuestContent r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.QuestContent r1 = (com.habitrpg.android.habitica.models.inventory.QuestContent) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.QuestContent> r2 = com.habitrpg.android.habitica.models.inventory.QuestContent.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17534e
            java.lang.String r5 = r10.realmGet$key()
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
            io.realm.g3 r1 = new io.realm.g3     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.inventory.QuestContent r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.inventory.QuestContent r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.g3.d(io.realm.o0, io.realm.g3$a, com.habitrpg.android.habitica.models.inventory.QuestContent, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.QuestContent");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static QuestContent f(QuestContent questContent, int i10, int i11, Map<a1, o.a<a1>> map) {
        QuestContent questContent2;
        if (i10 > i11 || questContent == null) {
            return null;
        }
        o.a<a1> aVar = map.get(questContent);
        if (aVar == null) {
            questContent2 = new QuestContent();
            map.put(questContent, new o.a<>(i10, questContent2));
        } else if (i10 >= aVar.f17831a) {
            return (QuestContent) aVar.f17832b;
        } else {
            QuestContent questContent3 = (QuestContent) aVar.f17832b;
            aVar.f17831a = i10;
            questContent2 = questContent3;
        }
        o0 o0Var = (o0) ((io.realm.internal.o) questContent).b().f();
        questContent2.realmSet$key(questContent.realmGet$key());
        questContent2.realmSet$text(questContent.realmGet$text());
        questContent2.realmSet$notes(questContent.realmGet$notes());
        questContent2.realmSet$completion(questContent.realmGet$completion());
        questContent2.realmSet$value(questContent.realmGet$value());
        questContent2.realmSet$previous(questContent.realmGet$previous());
        questContent2.realmSet$lvl(questContent.realmGet$lvl());
        questContent2.realmSet$isCanBuy(questContent.realmGet$isCanBuy());
        questContent2.realmSet$category(questContent.realmGet$category());
        int i12 = i10 + 1;
        questContent2.realmSet$boss(a3.f(questContent.realmGet$boss(), i12, i11, map));
        questContent2.realmSet$drop(k3.f(questContent.realmGet$drop(), i12, i11, map));
        questContent2.realmSet$colors(e3.f(questContent.realmGet$colors(), i12, i11, map));
        if (i10 == i11) {
            questContent2.realmSet$collect(null);
        } else {
            x0<QuestCollect> realmGet$collect = questContent.realmGet$collect();
            x0<QuestCollect> x0Var = new x0<>();
            questContent2.realmSet$collect(x0Var);
            int size = realmGet$collect.size();
            for (int i13 = 0; i13 < size; i13++) {
                x0Var.add(c3.f(realmGet$collect.get(i13), i12, i11, map));
            }
        }
        questContent2.realmSet$event(s2.f(questContent.realmGet$event(), i12, i11, map));
        return questContent2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "QuestContent", false, 14, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, true, false, true);
        bVar.b("", "text", realmFieldType, false, false, true);
        bVar.b("", "notes", realmFieldType, false, false, true);
        bVar.b("", "completion", realmFieldType, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.VALUE, realmFieldType2, false, false, true);
        bVar.b("", "previous", realmFieldType, false, false, false);
        bVar.b("", "lvl", realmFieldType2, false, false, true);
        bVar.b("", "isCanBuy", RealmFieldType.BOOLEAN, false, false, true);
        bVar.b("", "category", realmFieldType, false, false, false);
        RealmFieldType realmFieldType3 = RealmFieldType.OBJECT;
        bVar.a("", "boss", realmFieldType3, "QuestBoss");
        bVar.a("", "drop", realmFieldType3, "QuestDrops");
        bVar.a("", "colors", realmFieldType3, "QuestColors");
        bVar.a("", "collect", RealmFieldType.LIST, "QuestCollect");
        bVar.a("", "event", realmFieldType3, "ItemEvent");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17530u;
    }

    public static long i(o0 o0Var, QuestContent questContent, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        if ((questContent instanceof io.realm.internal.o) && !d1.isFrozen(questContent)) {
            io.realm.internal.o oVar = (io.realm.internal.o) questContent;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(QuestContent.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestContent.class);
        long j13 = aVar.f17534e;
        String realmGet$key = questContent.realmGet$key();
        if (realmGet$key != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j13, realmGet$key);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j13, realmGet$key);
        }
        long j14 = j10;
        map.put(questContent, Long.valueOf(j14));
        String realmGet$text = questContent.realmGet$text();
        if (realmGet$text != null) {
            j11 = j14;
            Table.nativeSetString(nativePtr, aVar.f17535f, j14, realmGet$text, false);
        } else {
            j11 = j14;
            Table.nativeSetNull(nativePtr, aVar.f17535f, j11, false);
        }
        String realmGet$notes = questContent.realmGet$notes();
        if (realmGet$notes != null) {
            Table.nativeSetString(nativePtr, aVar.f17536g, j11, realmGet$notes, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17536g, j11, false);
        }
        String realmGet$completion = questContent.realmGet$completion();
        if (realmGet$completion != null) {
            Table.nativeSetString(nativePtr, aVar.f17537h, j11, realmGet$completion, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17537h, j11, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f17538i, j11, questContent.realmGet$value(), false);
        String realmGet$previous = questContent.realmGet$previous();
        if (realmGet$previous != null) {
            Table.nativeSetString(nativePtr, aVar.f17539j, j11, realmGet$previous, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17539j, j11, false);
        }
        long j15 = j11;
        Table.nativeSetLong(nativePtr, aVar.f17540k, j15, questContent.realmGet$lvl(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17541l, j15, questContent.realmGet$isCanBuy(), false);
        String realmGet$category = questContent.realmGet$category();
        if (realmGet$category != null) {
            Table.nativeSetString(nativePtr, aVar.f17542m, j11, realmGet$category, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17542m, j11, false);
        }
        QuestBoss realmGet$boss = questContent.realmGet$boss();
        if (realmGet$boss != null) {
            Long l10 = map.get(realmGet$boss);
            if (l10 == null) {
                l10 = Long.valueOf(a3.i(o0Var, realmGet$boss, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f17543n, j11, l10.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17543n, j11);
        }
        QuestDrops realmGet$drop = questContent.realmGet$drop();
        if (realmGet$drop != null) {
            Long l11 = map.get(realmGet$drop);
            if (l11 == null) {
                l11 = Long.valueOf(k3.i(o0Var, realmGet$drop, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f17544o, j11, l11.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17544o, j11);
        }
        QuestColors realmGet$colors = questContent.realmGet$colors();
        if (realmGet$colors != null) {
            Long l12 = map.get(realmGet$colors);
            if (l12 == null) {
                l12 = Long.valueOf(e3.i(o0Var, realmGet$colors, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f17545p, j11, l12.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17545p, j11);
        }
        long j16 = j11;
        OsList osList = new OsList(c12.s(j16), aVar.f17546q);
        x0<QuestCollect> realmGet$collect = questContent.realmGet$collect();
        if (realmGet$collect != null && realmGet$collect.size() == osList.Y()) {
            int size = realmGet$collect.size();
            int i10 = 0;
            while (i10 < size) {
                QuestCollect questCollect = realmGet$collect.get(i10);
                Long l13 = map.get(questCollect);
                if (l13 == null) {
                    l13 = Long.valueOf(c3.i(o0Var, questCollect, map));
                }
                osList.V(i10, l13.longValue());
                i10++;
                j16 = j16;
            }
            j12 = j16;
        } else {
            j12 = j16;
            osList.K();
            if (realmGet$collect != null) {
                Iterator<QuestCollect> it = realmGet$collect.iterator();
                while (it.hasNext()) {
                    QuestCollect next = it.next();
                    Long l14 = map.get(next);
                    if (l14 == null) {
                        l14 = Long.valueOf(c3.i(o0Var, next, map));
                    }
                    osList.k(l14.longValue());
                }
            }
        }
        ItemEvent realmGet$event = questContent.realmGet$event();
        if (realmGet$event != null) {
            Long l15 = map.get(realmGet$event);
            if (l15 == null) {
                l15 = Long.valueOf(s2.i(o0Var, realmGet$event, map));
            }
            long j17 = j12;
            Table.nativeSetLink(nativePtr, aVar.f17547r, j12, l15.longValue(), false);
            return j17;
        }
        long j18 = j12;
        Table.nativeNullifyLink(nativePtr, aVar.f17547r, j18);
        return j18;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        Table c12 = o0Var.c1(QuestContent.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestContent.class);
        long j15 = aVar.f17534e;
        while (it.hasNext()) {
            QuestContent questContent = (QuestContent) it.next();
            if (!map.containsKey(questContent)) {
                if ((questContent instanceof io.realm.internal.o) && !d1.isFrozen(questContent)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) questContent;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(questContent, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = questContent.realmGet$key();
                if (realmGet$key != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j15, realmGet$key);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j11 = OsObject.createRowWithPrimaryKey(c12, j15, realmGet$key);
                } else {
                    j11 = j10;
                }
                map.put(questContent, Long.valueOf(j11));
                String realmGet$text = questContent.realmGet$text();
                if (realmGet$text != null) {
                    j12 = j11;
                    j13 = j15;
                    Table.nativeSetString(nativePtr, aVar.f17535f, j11, realmGet$text, false);
                } else {
                    j12 = j11;
                    j13 = j15;
                    Table.nativeSetNull(nativePtr, aVar.f17535f, j11, false);
                }
                String realmGet$notes = questContent.realmGet$notes();
                if (realmGet$notes != null) {
                    Table.nativeSetString(nativePtr, aVar.f17536g, j12, realmGet$notes, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17536g, j12, false);
                }
                String realmGet$completion = questContent.realmGet$completion();
                if (realmGet$completion != null) {
                    Table.nativeSetString(nativePtr, aVar.f17537h, j12, realmGet$completion, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17537h, j12, false);
                }
                Table.nativeSetLong(nativePtr, aVar.f17538i, j12, questContent.realmGet$value(), false);
                String realmGet$previous = questContent.realmGet$previous();
                if (realmGet$previous != null) {
                    Table.nativeSetString(nativePtr, aVar.f17539j, j12, realmGet$previous, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17539j, j12, false);
                }
                long j16 = j12;
                Table.nativeSetLong(nativePtr, aVar.f17540k, j16, questContent.realmGet$lvl(), false);
                Table.nativeSetBoolean(nativePtr, aVar.f17541l, j16, questContent.realmGet$isCanBuy(), false);
                String realmGet$category = questContent.realmGet$category();
                if (realmGet$category != null) {
                    Table.nativeSetString(nativePtr, aVar.f17542m, j12, realmGet$category, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17542m, j12, false);
                }
                QuestBoss realmGet$boss = questContent.realmGet$boss();
                if (realmGet$boss != null) {
                    Long l10 = map.get(realmGet$boss);
                    if (l10 == null) {
                        l10 = Long.valueOf(a3.i(o0Var, realmGet$boss, map));
                    }
                    Table.nativeSetLink(nativePtr, aVar.f17543n, j12, l10.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar.f17543n, j12);
                }
                QuestDrops realmGet$drop = questContent.realmGet$drop();
                if (realmGet$drop != null) {
                    Long l11 = map.get(realmGet$drop);
                    if (l11 == null) {
                        l11 = Long.valueOf(k3.i(o0Var, realmGet$drop, map));
                    }
                    Table.nativeSetLink(nativePtr, aVar.f17544o, j12, l11.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar.f17544o, j12);
                }
                QuestColors realmGet$colors = questContent.realmGet$colors();
                if (realmGet$colors != null) {
                    Long l12 = map.get(realmGet$colors);
                    if (l12 == null) {
                        l12 = Long.valueOf(e3.i(o0Var, realmGet$colors, map));
                    }
                    Table.nativeSetLink(nativePtr, aVar.f17545p, j12, l12.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar.f17545p, j12);
                }
                long j17 = j12;
                OsList osList = new OsList(c12.s(j17), aVar.f17546q);
                x0<QuestCollect> realmGet$collect = questContent.realmGet$collect();
                if (realmGet$collect != null && realmGet$collect.size() == osList.Y()) {
                    int size = realmGet$collect.size();
                    int i10 = 0;
                    while (i10 < size) {
                        QuestCollect questCollect = realmGet$collect.get(i10);
                        Long l13 = map.get(questCollect);
                        if (l13 == null) {
                            l13 = Long.valueOf(c3.i(o0Var, questCollect, map));
                        }
                        osList.V(i10, l13.longValue());
                        i10++;
                        j17 = j17;
                    }
                    j14 = j17;
                } else {
                    j14 = j17;
                    osList.K();
                    if (realmGet$collect != null) {
                        Iterator<QuestCollect> it2 = realmGet$collect.iterator();
                        while (it2.hasNext()) {
                            QuestCollect next = it2.next();
                            Long l14 = map.get(next);
                            if (l14 == null) {
                                l14 = Long.valueOf(c3.i(o0Var, next, map));
                            }
                            osList.k(l14.longValue());
                        }
                    }
                }
                ItemEvent realmGet$event = questContent.realmGet$event();
                if (realmGet$event != null) {
                    Long l15 = map.get(realmGet$event);
                    if (l15 == null) {
                        l15 = Long.valueOf(s2.i(o0Var, realmGet$event, map));
                    }
                    Table.nativeSetLink(nativePtr, aVar.f17547r, j14, l15.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar.f17547r, j14);
                }
                j15 = j13;
            }
        }
    }

    static g3 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(QuestContent.class), false, Collections.emptyList());
        g3 g3Var = new g3();
        cVar.a();
        return g3Var;
    }

    static QuestContent n(o0 o0Var, a aVar, QuestContent questContent, QuestContent questContent2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestContent.class), set);
        osObjectBuilder.c1(aVar.f17534e, questContent2.realmGet$key());
        osObjectBuilder.c1(aVar.f17535f, questContent2.realmGet$text());
        osObjectBuilder.c1(aVar.f17536g, questContent2.realmGet$notes());
        osObjectBuilder.c1(aVar.f17537h, questContent2.realmGet$completion());
        osObjectBuilder.V0(aVar.f17538i, Integer.valueOf(questContent2.realmGet$value()));
        osObjectBuilder.c1(aVar.f17539j, questContent2.realmGet$previous());
        osObjectBuilder.V0(aVar.f17540k, Integer.valueOf(questContent2.realmGet$lvl()));
        osObjectBuilder.F0(aVar.f17541l, Boolean.valueOf(questContent2.realmGet$isCanBuy()));
        osObjectBuilder.c1(aVar.f17542m, questContent2.realmGet$category());
        QuestBoss realmGet$boss = questContent2.realmGet$boss();
        if (realmGet$boss == null) {
            osObjectBuilder.Z0(aVar.f17543n);
        } else {
            QuestBoss questBoss = (QuestBoss) map.get(realmGet$boss);
            if (questBoss != null) {
                osObjectBuilder.a1(aVar.f17543n, questBoss);
            } else {
                osObjectBuilder.a1(aVar.f17543n, a3.d(o0Var, (a3.a) o0Var.R().e(QuestBoss.class), realmGet$boss, true, map, set));
            }
        }
        QuestDrops realmGet$drop = questContent2.realmGet$drop();
        if (realmGet$drop == null) {
            osObjectBuilder.Z0(aVar.f17544o);
        } else {
            QuestDrops questDrops = (QuestDrops) map.get(realmGet$drop);
            if (questDrops != null) {
                osObjectBuilder.a1(aVar.f17544o, questDrops);
            } else {
                osObjectBuilder.a1(aVar.f17544o, k3.d(o0Var, (k3.a) o0Var.R().e(QuestDrops.class), realmGet$drop, true, map, set));
            }
        }
        QuestColors realmGet$colors = questContent2.realmGet$colors();
        if (realmGet$colors == null) {
            osObjectBuilder.Z0(aVar.f17545p);
        } else {
            QuestColors questColors = (QuestColors) map.get(realmGet$colors);
            if (questColors != null) {
                osObjectBuilder.a1(aVar.f17545p, questColors);
            } else {
                osObjectBuilder.a1(aVar.f17545p, e3.d(o0Var, (e3.a) o0Var.R().e(QuestColors.class), realmGet$colors, true, map, set));
            }
        }
        x0<QuestCollect> realmGet$collect = questContent2.realmGet$collect();
        if (realmGet$collect != null) {
            x0 x0Var = new x0();
            for (int i10 = 0; i10 < realmGet$collect.size(); i10++) {
                QuestCollect questCollect = realmGet$collect.get(i10);
                QuestCollect questCollect2 = (QuestCollect) map.get(questCollect);
                if (questCollect2 != null) {
                    x0Var.add(questCollect2);
                } else {
                    x0Var.add(c3.d(o0Var, (c3.a) o0Var.R().e(QuestCollect.class), questCollect, true, map, set));
                }
            }
            osObjectBuilder.b1(aVar.f17546q, x0Var);
        } else {
            osObjectBuilder.b1(aVar.f17546q, new x0());
        }
        ItemEvent realmGet$event = questContent2.realmGet$event();
        if (realmGet$event == null) {
            osObjectBuilder.Z0(aVar.f17547r);
        } else {
            ItemEvent itemEvent = (ItemEvent) map.get(realmGet$event);
            if (itemEvent != null) {
                osObjectBuilder.a1(aVar.f17547r, itemEvent);
            } else {
                osObjectBuilder.a1(aVar.f17547r, s2.d(o0Var, (s2.a) o0Var.R().e(ItemEvent.class), realmGet$event, true, map, set));
            }
        }
        osObjectBuilder.g1();
        return questContent;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17532q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17531p = (a) cVar.c();
        l0<QuestContent> l0Var = new l0<>(this);
        this.f17532q = l0Var;
        l0Var.r(cVar.e());
        this.f17532q.s(cVar.f());
        this.f17532q.o(cVar.b());
        this.f17532q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17532q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g3 g3Var = (g3) obj;
        io.realm.a f10 = this.f17532q.f();
        io.realm.a f11 = g3Var.f17532q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17532q.g().getTable().p();
        String p11 = g3Var.f17532q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17532q.g().getObjectKey() == g3Var.f17532q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17532q.f().getPath();
        String p10 = this.f17532q.g().getTable().p();
        long objectKey = this.f17532q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public QuestBoss realmGet$boss() {
        this.f17532q.f().e();
        if (this.f17532q.g().isNullLink(this.f17531p.f17543n)) {
            return null;
        }
        return (QuestBoss) this.f17532q.f().B(QuestBoss.class, this.f17532q.g().getLink(this.f17531p.f17543n), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public String realmGet$category() {
        this.f17532q.f().e();
        return this.f17532q.g().getString(this.f17531p.f17542m);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public x0<QuestCollect> realmGet$collect() {
        this.f17532q.f().e();
        x0<QuestCollect> x0Var = this.f17533r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<QuestCollect> x0Var2 = new x0<>(QuestCollect.class, this.f17532q.g().getModelList(this.f17531p.f17546q), this.f17532q.f());
        this.f17533r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public QuestColors realmGet$colors() {
        this.f17532q.f().e();
        if (this.f17532q.g().isNullLink(this.f17531p.f17545p)) {
            return null;
        }
        return (QuestColors) this.f17532q.f().B(QuestColors.class, this.f17532q.g().getLink(this.f17531p.f17545p), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public String realmGet$completion() {
        this.f17532q.f().e();
        return this.f17532q.g().getString(this.f17531p.f17537h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public QuestDrops realmGet$drop() {
        this.f17532q.f().e();
        if (this.f17532q.g().isNullLink(this.f17531p.f17544o)) {
            return null;
        }
        return (QuestDrops) this.f17532q.f().B(QuestDrops.class, this.f17532q.g().getLink(this.f17531p.f17544o), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public ItemEvent realmGet$event() {
        this.f17532q.f().e();
        if (this.f17532q.g().isNullLink(this.f17531p.f17547r)) {
            return null;
        }
        return (ItemEvent) this.f17532q.f().B(ItemEvent.class, this.f17532q.g().getLink(this.f17531p.f17547r), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public boolean realmGet$isCanBuy() {
        this.f17532q.f().e();
        return this.f17532q.g().getBoolean(this.f17531p.f17541l);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public String realmGet$key() {
        this.f17532q.f().e();
        return this.f17532q.g().getString(this.f17531p.f17534e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public int realmGet$lvl() {
        this.f17532q.f().e();
        return (int) this.f17532q.g().getLong(this.f17531p.f17540k);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public String realmGet$notes() {
        this.f17532q.f().e();
        return this.f17532q.g().getString(this.f17531p.f17536g);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public String realmGet$previous() {
        this.f17532q.f().e();
        return this.f17532q.g().getString(this.f17531p.f17539j);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public String realmGet$text() {
        this.f17532q.f().e();
        return this.f17532q.g().getString(this.f17531p.f17535f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public int realmGet$value() {
        this.f17532q.f().e();
        return (int) this.f17532q.g().getLong(this.f17531p.f17538i);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public void realmSet$boss(QuestBoss questBoss) {
        o0 o0Var = (o0) this.f17532q.f();
        if (this.f17532q.i()) {
            if (!this.f17532q.d() || this.f17532q.e().contains("boss")) {
                return;
            }
            if (questBoss != null && !d1.isManaged(questBoss)) {
                questBoss = (QuestBoss) o0Var.F0(questBoss, new v[0]);
            }
            io.realm.internal.q g10 = this.f17532q.g();
            if (questBoss == null) {
                g10.nullifyLink(this.f17531p.f17543n);
                return;
            }
            this.f17532q.c(questBoss);
            g10.getTable().D(this.f17531p.f17543n, g10.getObjectKey(), ((io.realm.internal.o) questBoss).b().g().getObjectKey(), true);
            return;
        }
        this.f17532q.f().e();
        if (questBoss == null) {
            this.f17532q.g().nullifyLink(this.f17531p.f17543n);
            return;
        }
        this.f17532q.c(questBoss);
        this.f17532q.g().setLink(this.f17531p.f17543n, ((io.realm.internal.o) questBoss).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public void realmSet$category(String str) {
        if (this.f17532q.i()) {
            if (!this.f17532q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17532q.g();
            if (str == null) {
                g10.getTable().F(this.f17531p.f17542m, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17531p.f17542m, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17532q.f().e();
        if (str == null) {
            this.f17532q.g().setNull(this.f17531p.f17542m);
        } else {
            this.f17532q.g().setString(this.f17531p.f17542m, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public void realmSet$collect(x0<QuestCollect> x0Var) {
        int i10 = 0;
        if (this.f17532q.i()) {
            if (!this.f17532q.d() || this.f17532q.e().contains("collect")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17532q.f();
                x0<QuestCollect> x0Var2 = new x0<>();
                Iterator<QuestCollect> it = x0Var.iterator();
                while (it.hasNext()) {
                    QuestCollect next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((QuestCollect) o0Var.F0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17532q.f().e();
        OsList modelList = this.f17532q.g().getModelList(this.f17531p.f17546q);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                QuestCollect questCollect = x0Var.get(i10);
                this.f17532q.c(questCollect);
                modelList.V(i10, ((io.realm.internal.o) questCollect).b().g().getObjectKey());
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
            QuestCollect questCollect2 = x0Var.get(i10);
            this.f17532q.c(questCollect2);
            modelList.k(((io.realm.internal.o) questCollect2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public void realmSet$colors(QuestColors questColors) {
        o0 o0Var = (o0) this.f17532q.f();
        if (this.f17532q.i()) {
            if (!this.f17532q.d() || this.f17532q.e().contains("colors")) {
                return;
            }
            if (questColors != null && !d1.isManaged(questColors)) {
                questColors = (QuestColors) o0Var.F0(questColors, new v[0]);
            }
            io.realm.internal.q g10 = this.f17532q.g();
            if (questColors == null) {
                g10.nullifyLink(this.f17531p.f17545p);
                return;
            }
            this.f17532q.c(questColors);
            g10.getTable().D(this.f17531p.f17545p, g10.getObjectKey(), ((io.realm.internal.o) questColors).b().g().getObjectKey(), true);
            return;
        }
        this.f17532q.f().e();
        if (questColors == null) {
            this.f17532q.g().nullifyLink(this.f17531p.f17545p);
            return;
        }
        this.f17532q.c(questColors);
        this.f17532q.g().setLink(this.f17531p.f17545p, ((io.realm.internal.o) questColors).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public void realmSet$completion(String str) {
        if (this.f17532q.i()) {
            if (!this.f17532q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17532q.g();
            if (str != null) {
                g10.getTable().G(this.f17531p.f17537h, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'completion' to null.");
        }
        this.f17532q.f().e();
        if (str != null) {
            this.f17532q.g().setString(this.f17531p.f17537h, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'completion' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public void realmSet$drop(QuestDrops questDrops) {
        o0 o0Var = (o0) this.f17532q.f();
        if (this.f17532q.i()) {
            if (!this.f17532q.d() || this.f17532q.e().contains("drop")) {
                return;
            }
            if (questDrops != null && !d1.isManaged(questDrops)) {
                questDrops = (QuestDrops) o0Var.F0(questDrops, new v[0]);
            }
            io.realm.internal.q g10 = this.f17532q.g();
            if (questDrops == null) {
                g10.nullifyLink(this.f17531p.f17544o);
                return;
            }
            this.f17532q.c(questDrops);
            g10.getTable().D(this.f17531p.f17544o, g10.getObjectKey(), ((io.realm.internal.o) questDrops).b().g().getObjectKey(), true);
            return;
        }
        this.f17532q.f().e();
        if (questDrops == null) {
            this.f17532q.g().nullifyLink(this.f17531p.f17544o);
            return;
        }
        this.f17532q.c(questDrops);
        this.f17532q.g().setLink(this.f17531p.f17544o, ((io.realm.internal.o) questDrops).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public void realmSet$event(ItemEvent itemEvent) {
        o0 o0Var = (o0) this.f17532q.f();
        if (this.f17532q.i()) {
            if (!this.f17532q.d() || this.f17532q.e().contains("event")) {
                return;
            }
            if (itemEvent != null && !d1.isManaged(itemEvent)) {
                itemEvent = (ItemEvent) o0Var.D0(itemEvent, new v[0]);
            }
            io.realm.internal.q g10 = this.f17532q.g();
            if (itemEvent == null) {
                g10.nullifyLink(this.f17531p.f17547r);
                return;
            }
            this.f17532q.c(itemEvent);
            g10.getTable().D(this.f17531p.f17547r, g10.getObjectKey(), ((io.realm.internal.o) itemEvent).b().g().getObjectKey(), true);
            return;
        }
        this.f17532q.f().e();
        if (itemEvent == null) {
            this.f17532q.g().nullifyLink(this.f17531p.f17547r);
            return;
        }
        this.f17532q.c(itemEvent);
        this.f17532q.g().setLink(this.f17531p.f17547r, ((io.realm.internal.o) itemEvent).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public void realmSet$isCanBuy(boolean z10) {
        if (this.f17532q.i()) {
            if (!this.f17532q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17532q.g();
            g10.getTable().z(this.f17531p.f17541l, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17532q.f().e();
        this.f17532q.g().setBoolean(this.f17531p.f17541l, z10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public void realmSet$key(String str) {
        if (this.f17532q.i()) {
            return;
        }
        this.f17532q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public void realmSet$lvl(int i10) {
        if (this.f17532q.i()) {
            if (!this.f17532q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17532q.g();
            g10.getTable().E(this.f17531p.f17540k, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17532q.f().e();
        this.f17532q.g().setLong(this.f17531p.f17540k, i10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public void realmSet$notes(String str) {
        if (this.f17532q.i()) {
            if (!this.f17532q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17532q.g();
            if (str != null) {
                g10.getTable().G(this.f17531p.f17536g, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'notes' to null.");
        }
        this.f17532q.f().e();
        if (str != null) {
            this.f17532q.g().setString(this.f17531p.f17536g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'notes' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public void realmSet$previous(String str) {
        if (this.f17532q.i()) {
            if (!this.f17532q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17532q.g();
            if (str == null) {
                g10.getTable().F(this.f17531p.f17539j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17531p.f17539j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17532q.f().e();
        if (str == null) {
            this.f17532q.g().setNull(this.f17531p.f17539j);
        } else {
            this.f17532q.g().setString(this.f17531p.f17539j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public void realmSet$text(String str) {
        if (this.f17532q.i()) {
            if (!this.f17532q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17532q.g();
            if (str != null) {
                g10.getTable().G(this.f17531p.f17535f, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        this.f17532q.f().e();
        if (str != null) {
            this.f17532q.g().setString(this.f17531p.f17535f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestContent, io.realm.h3
    public void realmSet$value(int i10) {
        if (this.f17532q.i()) {
            if (!this.f17532q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17532q.g();
            g10.getTable().E(this.f17531p.f17538i, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17532q.f().e();
        this.f17532q.g().setLong(this.f17531p.f17538i, i10);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("QuestContent = proxy[");
        sb2.append("{key:");
        sb2.append(realmGet$key());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{text:");
        sb2.append(realmGet$text());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{notes:");
        sb2.append(realmGet$notes());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{completion:");
        sb2.append(realmGet$completion());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{value:");
        sb2.append(realmGet$value());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{previous:");
        String str6 = "null";
        if (realmGet$previous() == null) {
            str = "null";
        } else {
            str = realmGet$previous();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{lvl:");
        sb2.append(realmGet$lvl());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{isCanBuy:");
        sb2.append(realmGet$isCanBuy());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{category:");
        if (realmGet$category() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$category();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{boss:");
        if (realmGet$boss() == null) {
            str3 = "null";
        } else {
            str3 = "QuestBoss";
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{drop:");
        if (realmGet$drop() == null) {
            str4 = "null";
        } else {
            str4 = "QuestDrops";
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{colors:");
        if (realmGet$colors() == null) {
            str5 = "null";
        } else {
            str5 = "QuestColors";
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{collect:");
        sb2.append("RealmList<QuestCollect>[");
        sb2.append(realmGet$collect().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{event:");
        if (realmGet$event() != null) {
            str6 = "ItemEvent";
        }
        sb2.append(str6);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
