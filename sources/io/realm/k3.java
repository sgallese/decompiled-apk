package io.realm;

import com.habitrpg.android.habitica.models.inventory.QuestDropItem;
import com.habitrpg.android.habitica.models.inventory.QuestDrops;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import io.realm.a;
import io.realm.exceptions.RealmException;
import io.realm.i3;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_inventory_QuestDropsRealmProxy.java */
/* loaded from: classes4.dex */
public class k3 extends QuestDrops implements io.realm.internal.o {

    /* renamed from: u  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17877u = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17878p;

    /* renamed from: q  reason: collision with root package name */
    private l0<QuestDrops> f17879q;

    /* renamed from: r  reason: collision with root package name */
    private x0<QuestDropItem> f17880r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_QuestDropsRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17881e;

        /* renamed from: f  reason: collision with root package name */
        long f17882f;

        /* renamed from: g  reason: collision with root package name */
        long f17883g;

        /* renamed from: h  reason: collision with root package name */
        long f17884h;

        /* renamed from: i  reason: collision with root package name */
        long f17885i;

        a(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("QuestDrops");
            this.f17881e = a("key", "key", b10);
            this.f17882f = a("gp", "gp", b10);
            this.f17883g = a("exp", "exp", b10);
            this.f17884h = a("unlock", "unlock", b10);
            this.f17885i = a(NavigationDrawerFragment.SIDEBAR_ITEMS, NavigationDrawerFragment.SIDEBAR_ITEMS, b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17881e = aVar.f17881e;
            aVar2.f17882f = aVar.f17882f;
            aVar2.f17883g = aVar.f17883g;
            aVar2.f17884h = aVar.f17884h;
            aVar2.f17885i = aVar.f17885i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k3() {
        this.f17879q.p();
    }

    public static QuestDrops c(o0 o0Var, a aVar, QuestDrops questDrops, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(questDrops);
        if (oVar != null) {
            return (QuestDrops) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestDrops.class), set);
        osObjectBuilder.c1(aVar.f17881e, questDrops.realmGet$key());
        osObjectBuilder.V0(aVar.f17882f, Integer.valueOf(questDrops.realmGet$gp()));
        osObjectBuilder.V0(aVar.f17883g, Integer.valueOf(questDrops.realmGet$exp()));
        osObjectBuilder.c1(aVar.f17884h, questDrops.realmGet$unlock());
        k3 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(questDrops, l10);
        x0<QuestDropItem> realmGet$items = questDrops.realmGet$items();
        if (realmGet$items != null) {
            x0<QuestDropItem> realmGet$items2 = l10.realmGet$items();
            realmGet$items2.clear();
            for (int i10 = 0; i10 < realmGet$items.size(); i10++) {
                QuestDropItem questDropItem = realmGet$items.get(i10);
                QuestDropItem questDropItem2 = (QuestDropItem) map.get(questDropItem);
                if (questDropItem2 != null) {
                    realmGet$items2.add(questDropItem2);
                } else {
                    realmGet$items2.add(i3.d(o0Var, (i3.a) o0Var.R().e(QuestDropItem.class), questDropItem, z10, map, set));
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
    public static com.habitrpg.android.habitica.models.inventory.QuestDrops d(io.realm.o0 r8, io.realm.k3.a r9, com.habitrpg.android.habitica.models.inventory.QuestDrops r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.QuestDrops r1 = (com.habitrpg.android.habitica.models.inventory.QuestDrops) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.QuestDrops> r2 = com.habitrpg.android.habitica.models.inventory.QuestDrops.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17881e
            java.lang.String r5 = r10.realmGet$key()
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
            io.realm.k3 r1 = new io.realm.k3     // Catch: java.lang.Throwable -> L8e
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
            com.habitrpg.android.habitica.models.inventory.QuestDrops r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.inventory.QuestDrops r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.k3.d(io.realm.o0, io.realm.k3$a, com.habitrpg.android.habitica.models.inventory.QuestDrops, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.QuestDrops");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static QuestDrops f(QuestDrops questDrops, int i10, int i11, Map<a1, o.a<a1>> map) {
        QuestDrops questDrops2;
        if (i10 > i11 || questDrops == null) {
            return null;
        }
        o.a<a1> aVar = map.get(questDrops);
        if (aVar == null) {
            questDrops2 = new QuestDrops();
            map.put(questDrops, new o.a<>(i10, questDrops2));
        } else if (i10 >= aVar.f17831a) {
            return (QuestDrops) aVar.f17832b;
        } else {
            QuestDrops questDrops3 = (QuestDrops) aVar.f17832b;
            aVar.f17831a = i10;
            questDrops2 = questDrops3;
        }
        o0 o0Var = (o0) ((io.realm.internal.o) questDrops).b().f();
        questDrops2.realmSet$key(questDrops.realmGet$key());
        questDrops2.realmSet$gp(questDrops.realmGet$gp());
        questDrops2.realmSet$exp(questDrops.realmGet$exp());
        questDrops2.realmSet$unlock(questDrops.realmGet$unlock());
        if (i10 == i11) {
            questDrops2.realmSet$items(null);
        } else {
            x0<QuestDropItem> realmGet$items = questDrops.realmGet$items();
            x0<QuestDropItem> x0Var = new x0<>();
            questDrops2.realmSet$items(x0Var);
            int i12 = i10 + 1;
            int size = realmGet$items.size();
            for (int i13 = 0; i13 < size; i13++) {
                x0Var.add(i3.f(realmGet$items.get(i13), i12, i11, map));
            }
        }
        return questDrops2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "QuestDrops", false, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, true, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "gp", realmFieldType2, false, false, true);
        bVar.b("", "exp", realmFieldType2, false, false, true);
        bVar.b("", "unlock", realmFieldType, false, false, false);
        bVar.a("", NavigationDrawerFragment.SIDEBAR_ITEMS, RealmFieldType.LIST, "QuestDropItem");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17877u;
    }

    public static long i(o0 o0Var, QuestDrops questDrops, Map<a1, Long> map) {
        long nativeFindFirstString;
        if ((questDrops instanceof io.realm.internal.o) && !d1.isFrozen(questDrops)) {
            io.realm.internal.o oVar = (io.realm.internal.o) questDrops;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(QuestDrops.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestDrops.class);
        long j10 = aVar.f17881e;
        String realmGet$key = questDrops.realmGet$key();
        if (realmGet$key == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j10);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j10, realmGet$key);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j10, realmGet$key);
        }
        long j11 = nativeFindFirstString;
        map.put(questDrops, Long.valueOf(j11));
        Table.nativeSetLong(nativePtr, aVar.f17882f, j11, questDrops.realmGet$gp(), false);
        Table.nativeSetLong(nativePtr, aVar.f17883g, j11, questDrops.realmGet$exp(), false);
        String realmGet$unlock = questDrops.realmGet$unlock();
        if (realmGet$unlock != null) {
            Table.nativeSetString(nativePtr, aVar.f17884h, j11, realmGet$unlock, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17884h, j11, false);
        }
        OsList osList = new OsList(c12.s(j11), aVar.f17885i);
        x0<QuestDropItem> realmGet$items = questDrops.realmGet$items();
        if (realmGet$items != null && realmGet$items.size() == osList.Y()) {
            int size = realmGet$items.size();
            for (int i10 = 0; i10 < size; i10++) {
                QuestDropItem questDropItem = realmGet$items.get(i10);
                Long l10 = map.get(questDropItem);
                if (l10 == null) {
                    l10 = Long.valueOf(i3.i(o0Var, questDropItem, map));
                }
                osList.V(i10, l10.longValue());
            }
        } else {
            osList.K();
            if (realmGet$items != null) {
                Iterator<QuestDropItem> it = realmGet$items.iterator();
                while (it.hasNext()) {
                    QuestDropItem next = it.next();
                    Long l11 = map.get(next);
                    if (l11 == null) {
                        l11 = Long.valueOf(i3.i(o0Var, next, map));
                    }
                    osList.k(l11.longValue());
                }
            }
        }
        return j11;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        Table c12 = o0Var.c1(QuestDrops.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestDrops.class);
        long j10 = aVar.f17881e;
        while (it.hasNext()) {
            QuestDrops questDrops = (QuestDrops) it.next();
            if (!map.containsKey(questDrops)) {
                if ((questDrops instanceof io.realm.internal.o) && !d1.isFrozen(questDrops)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) questDrops;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(questDrops, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = questDrops.realmGet$key();
                if (realmGet$key == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j10);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j10, realmGet$key);
                }
                if (nativeFindFirstString == -1) {
                    nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j10, realmGet$key);
                }
                long j11 = nativeFindFirstString;
                map.put(questDrops, Long.valueOf(j11));
                long j12 = j10;
                Table.nativeSetLong(nativePtr, aVar.f17882f, j11, questDrops.realmGet$gp(), false);
                Table.nativeSetLong(nativePtr, aVar.f17883g, j11, questDrops.realmGet$exp(), false);
                String realmGet$unlock = questDrops.realmGet$unlock();
                if (realmGet$unlock != null) {
                    Table.nativeSetString(nativePtr, aVar.f17884h, j11, realmGet$unlock, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17884h, j11, false);
                }
                OsList osList = new OsList(c12.s(j11), aVar.f17885i);
                x0<QuestDropItem> realmGet$items = questDrops.realmGet$items();
                if (realmGet$items != null && realmGet$items.size() == osList.Y()) {
                    int size = realmGet$items.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        QuestDropItem questDropItem = realmGet$items.get(i10);
                        Long l10 = map.get(questDropItem);
                        if (l10 == null) {
                            l10 = Long.valueOf(i3.i(o0Var, questDropItem, map));
                        }
                        osList.V(i10, l10.longValue());
                    }
                } else {
                    osList.K();
                    if (realmGet$items != null) {
                        Iterator<QuestDropItem> it2 = realmGet$items.iterator();
                        while (it2.hasNext()) {
                            QuestDropItem next = it2.next();
                            Long l11 = map.get(next);
                            if (l11 == null) {
                                l11 = Long.valueOf(i3.i(o0Var, next, map));
                            }
                            osList.k(l11.longValue());
                        }
                    }
                }
                j10 = j12;
            }
        }
    }

    static k3 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(QuestDrops.class), false, Collections.emptyList());
        k3 k3Var = new k3();
        cVar.a();
        return k3Var;
    }

    static QuestDrops n(o0 o0Var, a aVar, QuestDrops questDrops, QuestDrops questDrops2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestDrops.class), set);
        osObjectBuilder.c1(aVar.f17881e, questDrops2.realmGet$key());
        osObjectBuilder.V0(aVar.f17882f, Integer.valueOf(questDrops2.realmGet$gp()));
        osObjectBuilder.V0(aVar.f17883g, Integer.valueOf(questDrops2.realmGet$exp()));
        osObjectBuilder.c1(aVar.f17884h, questDrops2.realmGet$unlock());
        x0<QuestDropItem> realmGet$items = questDrops2.realmGet$items();
        if (realmGet$items != null) {
            x0 x0Var = new x0();
            for (int i10 = 0; i10 < realmGet$items.size(); i10++) {
                QuestDropItem questDropItem = realmGet$items.get(i10);
                QuestDropItem questDropItem2 = (QuestDropItem) map.get(questDropItem);
                if (questDropItem2 != null) {
                    x0Var.add(questDropItem2);
                } else {
                    x0Var.add(i3.d(o0Var, (i3.a) o0Var.R().e(QuestDropItem.class), questDropItem, true, map, set));
                }
            }
            osObjectBuilder.b1(aVar.f17885i, x0Var);
        } else {
            osObjectBuilder.b1(aVar.f17885i, new x0());
        }
        osObjectBuilder.g1();
        return questDrops;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17879q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17878p = (a) cVar.c();
        l0<QuestDrops> l0Var = new l0<>(this);
        this.f17879q = l0Var;
        l0Var.r(cVar.e());
        this.f17879q.s(cVar.f());
        this.f17879q.o(cVar.b());
        this.f17879q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17879q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k3 k3Var = (k3) obj;
        io.realm.a f10 = this.f17879q.f();
        io.realm.a f11 = k3Var.f17879q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17879q.g().getTable().p();
        String p11 = k3Var.f17879q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17879q.g().getObjectKey() == k3Var.f17879q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17879q.f().getPath();
        String p10 = this.f17879q.g().getTable().p();
        long objectKey = this.f17879q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDrops, io.realm.l3
    public int realmGet$exp() {
        this.f17879q.f().e();
        return (int) this.f17879q.g().getLong(this.f17878p.f17883g);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDrops, io.realm.l3
    public int realmGet$gp() {
        this.f17879q.f().e();
        return (int) this.f17879q.g().getLong(this.f17878p.f17882f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDrops, io.realm.l3
    public x0<QuestDropItem> realmGet$items() {
        this.f17879q.f().e();
        x0<QuestDropItem> x0Var = this.f17880r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<QuestDropItem> x0Var2 = new x0<>(QuestDropItem.class, this.f17879q.g().getModelList(this.f17878p.f17885i), this.f17879q.f());
        this.f17880r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDrops, io.realm.l3
    public String realmGet$key() {
        this.f17879q.f().e();
        return this.f17879q.g().getString(this.f17878p.f17881e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDrops, io.realm.l3
    public String realmGet$unlock() {
        this.f17879q.f().e();
        return this.f17879q.g().getString(this.f17878p.f17884h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDrops, io.realm.l3
    public void realmSet$exp(int i10) {
        if (this.f17879q.i()) {
            if (!this.f17879q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17879q.g();
            g10.getTable().E(this.f17878p.f17883g, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17879q.f().e();
        this.f17879q.g().setLong(this.f17878p.f17883g, i10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDrops, io.realm.l3
    public void realmSet$gp(int i10) {
        if (this.f17879q.i()) {
            if (!this.f17879q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17879q.g();
            g10.getTable().E(this.f17878p.f17882f, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17879q.f().e();
        this.f17879q.g().setLong(this.f17878p.f17882f, i10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDrops, io.realm.l3
    public void realmSet$items(x0<QuestDropItem> x0Var) {
        int i10 = 0;
        if (this.f17879q.i()) {
            if (!this.f17879q.d() || this.f17879q.e().contains(NavigationDrawerFragment.SIDEBAR_ITEMS)) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17879q.f();
                x0<QuestDropItem> x0Var2 = new x0<>();
                Iterator<QuestDropItem> it = x0Var.iterator();
                while (it.hasNext()) {
                    QuestDropItem next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((QuestDropItem) o0Var.F0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17879q.f().e();
        OsList modelList = this.f17879q.g().getModelList(this.f17878p.f17885i);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                QuestDropItem questDropItem = x0Var.get(i10);
                this.f17879q.c(questDropItem);
                modelList.V(i10, ((io.realm.internal.o) questDropItem).b().g().getObjectKey());
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
            QuestDropItem questDropItem2 = x0Var.get(i10);
            this.f17879q.c(questDropItem2);
            modelList.k(((io.realm.internal.o) questDropItem2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDrops, io.realm.l3
    public void realmSet$key(String str) {
        if (this.f17879q.i()) {
            return;
        }
        this.f17879q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDrops, io.realm.l3
    public void realmSet$unlock(String str) {
        if (this.f17879q.i()) {
            if (!this.f17879q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17879q.g();
            if (str == null) {
                g10.getTable().F(this.f17878p.f17884h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17878p.f17884h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17879q.f().e();
        if (str == null) {
            this.f17879q.g().setNull(this.f17878p.f17884h);
        } else {
            this.f17879q.g().setString(this.f17878p.f17884h, str);
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("QuestDrops = proxy[");
        sb2.append("{key:");
        String str2 = "null";
        if (realmGet$key() == null) {
            str = "null";
        } else {
            str = realmGet$key();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{gp:");
        sb2.append(realmGet$gp());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{exp:");
        sb2.append(realmGet$exp());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{unlock:");
        if (realmGet$unlock() != null) {
            str2 = realmGet$unlock();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{items:");
        sb2.append("RealmList<QuestDropItem>[");
        sb2.append(realmGet$items().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
