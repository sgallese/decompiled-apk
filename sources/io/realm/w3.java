package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.inventory.ItemEvent;
import com.habitrpg.android.habitica.models.inventory.SpecialItem;
import io.realm.a;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.s2;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_inventory_SpecialItemRealmProxy.java */
/* loaded from: classes4.dex */
public class w3 extends SpecialItem implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18367r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18368p;

    /* renamed from: q  reason: collision with root package name */
    private l0<SpecialItem> f18369q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_SpecialItemRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18370e;

        /* renamed from: f  reason: collision with root package name */
        long f18371f;

        /* renamed from: g  reason: collision with root package name */
        long f18372g;

        /* renamed from: h  reason: collision with root package name */
        long f18373h;

        /* renamed from: i  reason: collision with root package name */
        long f18374i;

        /* renamed from: j  reason: collision with root package name */
        long f18375j;

        /* renamed from: k  reason: collision with root package name */
        long f18376k;

        a(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("SpecialItem");
            this.f18370e = a("key", "key", b10);
            this.f18371f = a("text", "text", b10);
            this.f18372g = a("notes", "notes", b10);
            this.f18373h = a(AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.VALUE, b10);
            this.f18374i = a("event", "event", b10);
            this.f18375j = a("target", "target", b10);
            this.f18376k = a("isMysteryItem", "isMysteryItem", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18370e = aVar.f18370e;
            aVar2.f18371f = aVar.f18371f;
            aVar2.f18372g = aVar.f18372g;
            aVar2.f18373h = aVar.f18373h;
            aVar2.f18374i = aVar.f18374i;
            aVar2.f18375j = aVar.f18375j;
            aVar2.f18376k = aVar.f18376k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w3() {
        this.f18369q.p();
    }

    public static SpecialItem c(o0 o0Var, a aVar, SpecialItem specialItem, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(specialItem);
        if (oVar != null) {
            return (SpecialItem) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(SpecialItem.class), set);
        osObjectBuilder.c1(aVar.f18370e, specialItem.realmGet$key());
        osObjectBuilder.c1(aVar.f18371f, specialItem.realmGet$text());
        osObjectBuilder.c1(aVar.f18372g, specialItem.realmGet$notes());
        osObjectBuilder.V0(aVar.f18373h, Integer.valueOf(specialItem.realmGet$value()));
        osObjectBuilder.c1(aVar.f18375j, specialItem.realmGet$target());
        osObjectBuilder.F0(aVar.f18376k, Boolean.valueOf(specialItem.realmGet$isMysteryItem()));
        w3 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(specialItem, l10);
        ItemEvent realmGet$event = specialItem.realmGet$event();
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
    public static com.habitrpg.android.habitica.models.inventory.SpecialItem d(io.realm.o0 r8, io.realm.w3.a r9, com.habitrpg.android.habitica.models.inventory.SpecialItem r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.SpecialItem r1 = (com.habitrpg.android.habitica.models.inventory.SpecialItem) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.SpecialItem> r2 = com.habitrpg.android.habitica.models.inventory.SpecialItem.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18370e
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
            io.realm.w3 r1 = new io.realm.w3     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.inventory.SpecialItem r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.inventory.SpecialItem r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.w3.d(io.realm.o0, io.realm.w3$a, com.habitrpg.android.habitica.models.inventory.SpecialItem, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.SpecialItem");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static SpecialItem f(SpecialItem specialItem, int i10, int i11, Map<a1, o.a<a1>> map) {
        SpecialItem specialItem2;
        if (i10 <= i11 && specialItem != null) {
            o.a<a1> aVar = map.get(specialItem);
            if (aVar == null) {
                specialItem2 = new SpecialItem();
                map.put(specialItem, new o.a<>(i10, specialItem2));
            } else if (i10 >= aVar.f17831a) {
                return (SpecialItem) aVar.f17832b;
            } else {
                SpecialItem specialItem3 = (SpecialItem) aVar.f17832b;
                aVar.f17831a = i10;
                specialItem2 = specialItem3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) specialItem).b().f();
            specialItem2.realmSet$key(specialItem.realmGet$key());
            specialItem2.realmSet$text(specialItem.realmGet$text());
            specialItem2.realmSet$notes(specialItem.realmGet$notes());
            specialItem2.realmSet$value(specialItem.realmGet$value());
            specialItem2.realmSet$event(s2.f(specialItem.realmGet$event(), i10 + 1, i11, map));
            specialItem2.realmSet$target(specialItem.realmGet$target());
            specialItem2.realmSet$isMysteryItem(specialItem.realmGet$isMysteryItem());
            return specialItem2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "SpecialItem", false, 7, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, true, false, true);
        bVar.b("", "text", realmFieldType, false, false, true);
        bVar.b("", "notes", realmFieldType, false, false, true);
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.VALUE, RealmFieldType.INTEGER, false, false, true);
        bVar.a("", "event", RealmFieldType.OBJECT, "ItemEvent");
        bVar.b("", "target", realmFieldType, false, false, false);
        bVar.b("", "isMysteryItem", RealmFieldType.BOOLEAN, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18367r;
    }

    public static long i(o0 o0Var, SpecialItem specialItem, Map<a1, Long> map) {
        long j10;
        if ((specialItem instanceof io.realm.internal.o) && !d1.isFrozen(specialItem)) {
            io.realm.internal.o oVar = (io.realm.internal.o) specialItem;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(SpecialItem.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(SpecialItem.class);
        long j11 = aVar.f18370e;
        String realmGet$key = specialItem.realmGet$key();
        if (realmGet$key != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j11, realmGet$key);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$key);
        }
        long j12 = j10;
        map.put(specialItem, Long.valueOf(j12));
        String realmGet$text = specialItem.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar.f18371f, j12, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18371f, j12, false);
        }
        String realmGet$notes = specialItem.realmGet$notes();
        if (realmGet$notes != null) {
            Table.nativeSetString(nativePtr, aVar.f18372g, j12, realmGet$notes, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18372g, j12, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f18373h, j12, specialItem.realmGet$value(), false);
        ItemEvent realmGet$event = specialItem.realmGet$event();
        if (realmGet$event != null) {
            Long l10 = map.get(realmGet$event);
            if (l10 == null) {
                l10 = Long.valueOf(s2.i(o0Var, realmGet$event, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f18374i, j12, l10.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f18374i, j12);
        }
        String realmGet$target = specialItem.realmGet$target();
        if (realmGet$target != null) {
            Table.nativeSetString(nativePtr, aVar.f18375j, j12, realmGet$target, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18375j, j12, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f18376k, j12, specialItem.realmGet$isMysteryItem(), false);
        return j12;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        Table c12 = o0Var.c1(SpecialItem.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(SpecialItem.class);
        long j13 = aVar.f18370e;
        while (it.hasNext()) {
            SpecialItem specialItem = (SpecialItem) it.next();
            if (!map.containsKey(specialItem)) {
                if ((specialItem instanceof io.realm.internal.o) && !d1.isFrozen(specialItem)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) specialItem;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(specialItem, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = specialItem.realmGet$key();
                if (realmGet$key != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j13, realmGet$key);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j11 = OsObject.createRowWithPrimaryKey(c12, j13, realmGet$key);
                } else {
                    j11 = j10;
                }
                map.put(specialItem, Long.valueOf(j11));
                String realmGet$text = specialItem.realmGet$text();
                if (realmGet$text != null) {
                    j12 = j13;
                    Table.nativeSetString(nativePtr, aVar.f18371f, j11, realmGet$text, false);
                } else {
                    j12 = j13;
                    Table.nativeSetNull(nativePtr, aVar.f18371f, j11, false);
                }
                String realmGet$notes = specialItem.realmGet$notes();
                if (realmGet$notes != null) {
                    Table.nativeSetString(nativePtr, aVar.f18372g, j11, realmGet$notes, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18372g, j11, false);
                }
                Table.nativeSetLong(nativePtr, aVar.f18373h, j11, specialItem.realmGet$value(), false);
                ItemEvent realmGet$event = specialItem.realmGet$event();
                if (realmGet$event != null) {
                    Long l10 = map.get(realmGet$event);
                    if (l10 == null) {
                        l10 = Long.valueOf(s2.i(o0Var, realmGet$event, map));
                    }
                    Table.nativeSetLink(nativePtr, aVar.f18374i, j11, l10.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar.f18374i, j11);
                }
                String realmGet$target = specialItem.realmGet$target();
                if (realmGet$target != null) {
                    Table.nativeSetString(nativePtr, aVar.f18375j, j11, realmGet$target, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18375j, j11, false);
                }
                Table.nativeSetBoolean(nativePtr, aVar.f18376k, j11, specialItem.realmGet$isMysteryItem(), false);
                j13 = j12;
            }
        }
    }

    static w3 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(SpecialItem.class), false, Collections.emptyList());
        w3 w3Var = new w3();
        cVar.a();
        return w3Var;
    }

    static SpecialItem n(o0 o0Var, a aVar, SpecialItem specialItem, SpecialItem specialItem2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(SpecialItem.class), set);
        osObjectBuilder.c1(aVar.f18370e, specialItem2.realmGet$key());
        osObjectBuilder.c1(aVar.f18371f, specialItem2.realmGet$text());
        osObjectBuilder.c1(aVar.f18372g, specialItem2.realmGet$notes());
        osObjectBuilder.V0(aVar.f18373h, Integer.valueOf(specialItem2.realmGet$value()));
        ItemEvent realmGet$event = specialItem2.realmGet$event();
        if (realmGet$event == null) {
            osObjectBuilder.Z0(aVar.f18374i);
        } else {
            ItemEvent itemEvent = (ItemEvent) map.get(realmGet$event);
            if (itemEvent != null) {
                osObjectBuilder.a1(aVar.f18374i, itemEvent);
            } else {
                osObjectBuilder.a1(aVar.f18374i, s2.d(o0Var, (s2.a) o0Var.R().e(ItemEvent.class), realmGet$event, true, map, set));
            }
        }
        osObjectBuilder.c1(aVar.f18375j, specialItem2.realmGet$target());
        osObjectBuilder.F0(aVar.f18376k, Boolean.valueOf(specialItem2.realmGet$isMysteryItem()));
        osObjectBuilder.g1();
        return specialItem;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18369q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18368p = (a) cVar.c();
        l0<SpecialItem> l0Var = new l0<>(this);
        this.f18369q = l0Var;
        l0Var.r(cVar.e());
        this.f18369q.s(cVar.f());
        this.f18369q.o(cVar.b());
        this.f18369q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18369q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w3 w3Var = (w3) obj;
        io.realm.a f10 = this.f18369q.f();
        io.realm.a f11 = w3Var.f18369q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18369q.g().getTable().p();
        String p11 = w3Var.f18369q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18369q.g().getObjectKey() == w3Var.f18369q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18369q.f().getPath();
        String p10 = this.f18369q.g().getTable().p();
        long objectKey = this.f18369q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.SpecialItem, io.realm.x3
    public ItemEvent realmGet$event() {
        this.f18369q.f().e();
        if (this.f18369q.g().isNullLink(this.f18368p.f18374i)) {
            return null;
        }
        return (ItemEvent) this.f18369q.f().B(ItemEvent.class, this.f18369q.g().getLink(this.f18368p.f18374i), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.SpecialItem, io.realm.x3
    public boolean realmGet$isMysteryItem() {
        this.f18369q.f().e();
        return this.f18369q.g().getBoolean(this.f18368p.f18376k);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.SpecialItem, io.realm.x3
    public String realmGet$key() {
        this.f18369q.f().e();
        return this.f18369q.g().getString(this.f18368p.f18370e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.SpecialItem, io.realm.x3
    public String realmGet$notes() {
        this.f18369q.f().e();
        return this.f18369q.g().getString(this.f18368p.f18372g);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.SpecialItem, io.realm.x3
    public String realmGet$target() {
        this.f18369q.f().e();
        return this.f18369q.g().getString(this.f18368p.f18375j);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.SpecialItem, io.realm.x3
    public String realmGet$text() {
        this.f18369q.f().e();
        return this.f18369q.g().getString(this.f18368p.f18371f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.SpecialItem, io.realm.x3
    public int realmGet$value() {
        this.f18369q.f().e();
        return (int) this.f18369q.g().getLong(this.f18368p.f18373h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.SpecialItem, io.realm.x3
    public void realmSet$event(ItemEvent itemEvent) {
        o0 o0Var = (o0) this.f18369q.f();
        if (this.f18369q.i()) {
            if (!this.f18369q.d() || this.f18369q.e().contains("event")) {
                return;
            }
            if (itemEvent != null && !d1.isManaged(itemEvent)) {
                itemEvent = (ItemEvent) o0Var.D0(itemEvent, new v[0]);
            }
            io.realm.internal.q g10 = this.f18369q.g();
            if (itemEvent == null) {
                g10.nullifyLink(this.f18368p.f18374i);
                return;
            }
            this.f18369q.c(itemEvent);
            g10.getTable().D(this.f18368p.f18374i, g10.getObjectKey(), ((io.realm.internal.o) itemEvent).b().g().getObjectKey(), true);
            return;
        }
        this.f18369q.f().e();
        if (itemEvent == null) {
            this.f18369q.g().nullifyLink(this.f18368p.f18374i);
            return;
        }
        this.f18369q.c(itemEvent);
        this.f18369q.g().setLink(this.f18368p.f18374i, ((io.realm.internal.o) itemEvent).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.SpecialItem, io.realm.x3
    public void realmSet$isMysteryItem(boolean z10) {
        if (this.f18369q.i()) {
            if (!this.f18369q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18369q.g();
            g10.getTable().z(this.f18368p.f18376k, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18369q.f().e();
        this.f18369q.g().setBoolean(this.f18368p.f18376k, z10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.SpecialItem, io.realm.x3
    public void realmSet$key(String str) {
        if (this.f18369q.i()) {
            return;
        }
        this.f18369q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.SpecialItem, io.realm.x3
    public void realmSet$notes(String str) {
        if (this.f18369q.i()) {
            if (!this.f18369q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18369q.g();
            if (str != null) {
                g10.getTable().G(this.f18368p.f18372g, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'notes' to null.");
        }
        this.f18369q.f().e();
        if (str != null) {
            this.f18369q.g().setString(this.f18368p.f18372g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'notes' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.SpecialItem, io.realm.x3
    public void realmSet$target(String str) {
        if (this.f18369q.i()) {
            if (!this.f18369q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18369q.g();
            if (str == null) {
                g10.getTable().F(this.f18368p.f18375j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18368p.f18375j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18369q.f().e();
        if (str == null) {
            this.f18369q.g().setNull(this.f18368p.f18375j);
        } else {
            this.f18369q.g().setString(this.f18368p.f18375j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.SpecialItem, io.realm.x3
    public void realmSet$text(String str) {
        if (this.f18369q.i()) {
            if (!this.f18369q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18369q.g();
            if (str != null) {
                g10.getTable().G(this.f18368p.f18371f, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        this.f18369q.f().e();
        if (str != null) {
            this.f18369q.g().setString(this.f18368p.f18371f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.SpecialItem, io.realm.x3
    public void realmSet$value(int i10) {
        if (this.f18369q.i()) {
            if (!this.f18369q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18369q.g();
            g10.getTable().E(this.f18368p.f18373h, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18369q.f().e();
        this.f18369q.g().setLong(this.f18368p.f18373h, i10);
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("SpecialItem = proxy[");
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
        sb2.append("{value:");
        sb2.append(realmGet$value());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{event:");
        String str2 = "null";
        if (realmGet$event() == null) {
            str = "null";
        } else {
            str = "ItemEvent";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{target:");
        if (realmGet$target() != null) {
            str2 = realmGet$target();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{isMysteryItem:");
        sb2.append(realmGet$isMysteryItem());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
