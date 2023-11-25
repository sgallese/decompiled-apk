package io.realm;

import com.habitrpg.android.habitica.models.inventory.ItemEvent;
import io.realm.a;
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

/* compiled from: com_habitrpg_android_habitica_models_inventory_ItemEventRealmProxy.java */
/* loaded from: classes4.dex */
public class s2 extends ItemEvent implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18162r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18163p;

    /* renamed from: q  reason: collision with root package name */
    private l0<ItemEvent> f18164q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_ItemEventRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18165e;

        /* renamed from: f  reason: collision with root package name */
        long f18166f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("ItemEvent");
            this.f18165e = a("start", "start", b10);
            this.f18166f = a("end", "end", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18165e = aVar.f18165e;
            aVar2.f18166f = aVar.f18166f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s2() {
        this.f18164q.p();
    }

    public static ItemEvent c(o0 o0Var, a aVar, ItemEvent itemEvent, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(itemEvent);
        if (oVar != null) {
            return (ItemEvent) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ItemEvent.class), set);
        osObjectBuilder.I0(aVar.f18165e, itemEvent.realmGet$start());
        osObjectBuilder.I0(aVar.f18166f, itemEvent.realmGet$end());
        s2 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(itemEvent, l10);
        return l10;
    }

    public static ItemEvent d(o0 o0Var, a aVar, ItemEvent itemEvent, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((itemEvent instanceof io.realm.internal.o) && !d1.isFrozen(itemEvent)) {
            io.realm.internal.o oVar = (io.realm.internal.o) itemEvent;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return itemEvent;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(itemEvent);
        if (oVar2 != null) {
            return (ItemEvent) oVar2;
        }
        return c(o0Var, aVar, itemEvent, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ItemEvent f(ItemEvent itemEvent, int i10, int i11, Map<a1, o.a<a1>> map) {
        ItemEvent itemEvent2;
        if (i10 <= i11 && itemEvent != null) {
            o.a<a1> aVar = map.get(itemEvent);
            if (aVar == null) {
                itemEvent2 = new ItemEvent();
                map.put(itemEvent, new o.a<>(i10, itemEvent2));
            } else if (i10 >= aVar.f17831a) {
                return (ItemEvent) aVar.f17832b;
            } else {
                ItemEvent itemEvent3 = (ItemEvent) aVar.f17832b;
                aVar.f17831a = i10;
                itemEvent2 = itemEvent3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) itemEvent).b().f();
            itemEvent2.realmSet$start(itemEvent.realmGet$start());
            itemEvent2.realmSet$end(itemEvent.realmGet$end());
            return itemEvent2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ItemEvent", false, 2, 0);
        RealmFieldType realmFieldType = RealmFieldType.DATE;
        bVar.b("", "start", realmFieldType, false, false, false);
        bVar.b("", "end", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18162r;
    }

    public static long i(o0 o0Var, ItemEvent itemEvent, Map<a1, Long> map) {
        if ((itemEvent instanceof io.realm.internal.o) && !d1.isFrozen(itemEvent)) {
            io.realm.internal.o oVar = (io.realm.internal.o) itemEvent;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(ItemEvent.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(ItemEvent.class);
        long createRow = OsObject.createRow(c12);
        map.put(itemEvent, Long.valueOf(createRow));
        Date realmGet$start = itemEvent.realmGet$start();
        if (realmGet$start != null) {
            Table.nativeSetTimestamp(nativePtr, aVar.f18165e, createRow, realmGet$start.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18165e, createRow, false);
        }
        Date realmGet$end = itemEvent.realmGet$end();
        if (realmGet$end != null) {
            Table.nativeSetTimestamp(nativePtr, aVar.f18166f, createRow, realmGet$end.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18166f, createRow, false);
        }
        return createRow;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        Table c12 = o0Var.c1(ItemEvent.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(ItemEvent.class);
        while (it.hasNext()) {
            ItemEvent itemEvent = (ItemEvent) it.next();
            if (!map.containsKey(itemEvent)) {
                if ((itemEvent instanceof io.realm.internal.o) && !d1.isFrozen(itemEvent)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) itemEvent;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(itemEvent, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                long createRow = OsObject.createRow(c12);
                map.put(itemEvent, Long.valueOf(createRow));
                Date realmGet$start = itemEvent.realmGet$start();
                if (realmGet$start != null) {
                    Table.nativeSetTimestamp(nativePtr, aVar.f18165e, createRow, realmGet$start.getTime(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18165e, createRow, false);
                }
                Date realmGet$end = itemEvent.realmGet$end();
                if (realmGet$end != null) {
                    Table.nativeSetTimestamp(nativePtr, aVar.f18166f, createRow, realmGet$end.getTime(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18166f, createRow, false);
                }
            }
        }
    }

    static s2 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(ItemEvent.class), false, Collections.emptyList());
        s2 s2Var = new s2();
        cVar.a();
        return s2Var;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18164q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18163p = (a) cVar.c();
        l0<ItemEvent> l0Var = new l0<>(this);
        this.f18164q = l0Var;
        l0Var.r(cVar.e());
        this.f18164q.s(cVar.f());
        this.f18164q.o(cVar.b());
        this.f18164q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18164q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s2 s2Var = (s2) obj;
        io.realm.a f10 = this.f18164q.f();
        io.realm.a f11 = s2Var.f18164q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18164q.g().getTable().p();
        String p11 = s2Var.f18164q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18164q.g().getObjectKey() == s2Var.f18164q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18164q.f().getPath();
        String p10 = this.f18164q.g().getTable().p();
        long objectKey = this.f18164q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.ItemEvent, io.realm.t2
    public Date realmGet$end() {
        this.f18164q.f().e();
        if (this.f18164q.g().isNull(this.f18163p.f18166f)) {
            return null;
        }
        return this.f18164q.g().getDate(this.f18163p.f18166f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.ItemEvent, io.realm.t2
    public Date realmGet$start() {
        this.f18164q.f().e();
        if (this.f18164q.g().isNull(this.f18163p.f18165e)) {
            return null;
        }
        return this.f18164q.g().getDate(this.f18163p.f18165e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.ItemEvent, io.realm.t2
    public void realmSet$end(Date date) {
        if (this.f18164q.i()) {
            if (!this.f18164q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18164q.g();
            if (date == null) {
                g10.getTable().F(this.f18163p.f18166f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f18163p.f18166f, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f18164q.f().e();
        if (date == null) {
            this.f18164q.g().setNull(this.f18163p.f18166f);
        } else {
            this.f18164q.g().setDate(this.f18163p.f18166f, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.ItemEvent, io.realm.t2
    public void realmSet$start(Date date) {
        if (this.f18164q.i()) {
            if (!this.f18164q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18164q.g();
            if (date == null) {
                g10.getTable().F(this.f18163p.f18165e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f18163p.f18165e, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f18164q.f().e();
        if (date == null) {
            this.f18164q.g().setNull(this.f18163p.f18165e);
        } else {
            this.f18164q.g().setDate(this.f18163p.f18165e, date);
        }
    }

    public String toString() {
        Date date;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("ItemEvent = proxy[");
        sb2.append("{start:");
        Object obj = "null";
        if (realmGet$start() == null) {
            date = "null";
        } else {
            date = realmGet$start();
        }
        sb2.append(date);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{end:");
        if (realmGet$end() != null) {
            obj = realmGet$end();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
