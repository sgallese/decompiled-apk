package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.ItemEvent;
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

/* compiled from: com_habitrpg_android_habitica_models_inventory_FoodRealmProxy.java */
/* loaded from: classes4.dex */
public class o2 extends Food implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18028r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18029p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Food> f18030q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_FoodRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18031e;

        /* renamed from: f  reason: collision with root package name */
        long f18032f;

        /* renamed from: g  reason: collision with root package name */
        long f18033g;

        /* renamed from: h  reason: collision with root package name */
        long f18034h;

        /* renamed from: i  reason: collision with root package name */
        long f18035i;

        /* renamed from: j  reason: collision with root package name */
        long f18036j;

        /* renamed from: k  reason: collision with root package name */
        long f18037k;

        /* renamed from: l  reason: collision with root package name */
        long f18038l;

        a(OsSchemaInfo osSchemaInfo) {
            super(8);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Food");
            this.f18031e = a("key", "key", b10);
            this.f18032f = a("text", "text", b10);
            this.f18033g = a("event", "event", b10);
            this.f18034h = a("notes", "notes", b10);
            this.f18035i = a(AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.VALUE, b10);
            this.f18036j = a("target", "target", b10);
            this.f18037k = a("article", "article", b10);
            this.f18038l = a("canDrop", "canDrop", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18031e = aVar.f18031e;
            aVar2.f18032f = aVar.f18032f;
            aVar2.f18033g = aVar.f18033g;
            aVar2.f18034h = aVar.f18034h;
            aVar2.f18035i = aVar.f18035i;
            aVar2.f18036j = aVar.f18036j;
            aVar2.f18037k = aVar.f18037k;
            aVar2.f18038l = aVar.f18038l;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o2() {
        this.f18030q.p();
    }

    public static Food c(o0 o0Var, a aVar, Food food, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(food);
        if (oVar != null) {
            return (Food) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Food.class), set);
        osObjectBuilder.c1(aVar.f18031e, food.realmGet$key());
        osObjectBuilder.c1(aVar.f18032f, food.realmGet$text());
        osObjectBuilder.c1(aVar.f18034h, food.realmGet$notes());
        osObjectBuilder.V0(aVar.f18035i, Integer.valueOf(food.realmGet$value()));
        osObjectBuilder.c1(aVar.f18036j, food.realmGet$target());
        osObjectBuilder.c1(aVar.f18037k, food.realmGet$article());
        osObjectBuilder.F0(aVar.f18038l, food.realmGet$canDrop());
        o2 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(food, l10);
        ItemEvent realmGet$event = food.realmGet$event();
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
    public static com.habitrpg.android.habitica.models.inventory.Food d(io.realm.o0 r8, io.realm.o2.a r9, com.habitrpg.android.habitica.models.inventory.Food r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.Food r1 = (com.habitrpg.android.habitica.models.inventory.Food) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.Food> r2 = com.habitrpg.android.habitica.models.inventory.Food.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18031e
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
            io.realm.o2 r1 = new io.realm.o2     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.inventory.Food r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.inventory.Food r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.o2.d(io.realm.o0, io.realm.o2$a, com.habitrpg.android.habitica.models.inventory.Food, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.Food");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Food f(Food food, int i10, int i11, Map<a1, o.a<a1>> map) {
        Food food2;
        if (i10 <= i11 && food != null) {
            o.a<a1> aVar = map.get(food);
            if (aVar == null) {
                food2 = new Food();
                map.put(food, new o.a<>(i10, food2));
            } else if (i10 >= aVar.f17831a) {
                return (Food) aVar.f17832b;
            } else {
                Food food3 = (Food) aVar.f17832b;
                aVar.f17831a = i10;
                food2 = food3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) food).b().f();
            food2.realmSet$key(food.realmGet$key());
            food2.realmSet$text(food.realmGet$text());
            food2.realmSet$event(s2.f(food.realmGet$event(), i10 + 1, i11, map));
            food2.realmSet$notes(food.realmGet$notes());
            food2.realmSet$value(food.realmGet$value());
            food2.realmSet$target(food.realmGet$target());
            food2.realmSet$article(food.realmGet$article());
            food2.realmSet$canDrop(food.realmGet$canDrop());
            return food2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Food", false, 8, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, true, false, true);
        bVar.b("", "text", realmFieldType, false, false, true);
        bVar.a("", "event", RealmFieldType.OBJECT, "ItemEvent");
        bVar.b("", "notes", realmFieldType, false, false, false);
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.VALUE, RealmFieldType.INTEGER, false, false, true);
        bVar.b("", "target", realmFieldType, false, false, false);
        bVar.b("", "article", realmFieldType, false, false, false);
        bVar.b("", "canDrop", RealmFieldType.BOOLEAN, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18028r;
    }

    public static long i(o0 o0Var, Food food, Map<a1, Long> map) {
        long j10;
        if ((food instanceof io.realm.internal.o) && !d1.isFrozen(food)) {
            io.realm.internal.o oVar = (io.realm.internal.o) food;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Food.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Food.class);
        long j11 = aVar.f18031e;
        String realmGet$key = food.realmGet$key();
        if (realmGet$key != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j11, realmGet$key);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$key);
        }
        long j12 = j10;
        map.put(food, Long.valueOf(j12));
        String realmGet$text = food.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar.f18032f, j12, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18032f, j12, false);
        }
        ItemEvent realmGet$event = food.realmGet$event();
        if (realmGet$event != null) {
            Long l10 = map.get(realmGet$event);
            if (l10 == null) {
                l10 = Long.valueOf(s2.i(o0Var, realmGet$event, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f18033g, j12, l10.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f18033g, j12);
        }
        String realmGet$notes = food.realmGet$notes();
        if (realmGet$notes != null) {
            Table.nativeSetString(nativePtr, aVar.f18034h, j12, realmGet$notes, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18034h, j12, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f18035i, j12, food.realmGet$value(), false);
        String realmGet$target = food.realmGet$target();
        if (realmGet$target != null) {
            Table.nativeSetString(nativePtr, aVar.f18036j, j12, realmGet$target, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18036j, j12, false);
        }
        String realmGet$article = food.realmGet$article();
        if (realmGet$article != null) {
            Table.nativeSetString(nativePtr, aVar.f18037k, j12, realmGet$article, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18037k, j12, false);
        }
        Boolean realmGet$canDrop = food.realmGet$canDrop();
        if (realmGet$canDrop != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f18038l, j12, realmGet$canDrop.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18038l, j12, false);
        }
        return j12;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        Table c12 = o0Var.c1(Food.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Food.class);
        long j13 = aVar.f18031e;
        while (it.hasNext()) {
            Food food = (Food) it.next();
            if (!map.containsKey(food)) {
                if ((food instanceof io.realm.internal.o) && !d1.isFrozen(food)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) food;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(food, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = food.realmGet$key();
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
                map.put(food, Long.valueOf(j11));
                String realmGet$text = food.realmGet$text();
                if (realmGet$text != null) {
                    j12 = j13;
                    Table.nativeSetString(nativePtr, aVar.f18032f, j11, realmGet$text, false);
                } else {
                    j12 = j13;
                    Table.nativeSetNull(nativePtr, aVar.f18032f, j11, false);
                }
                ItemEvent realmGet$event = food.realmGet$event();
                if (realmGet$event != null) {
                    Long l10 = map.get(realmGet$event);
                    if (l10 == null) {
                        l10 = Long.valueOf(s2.i(o0Var, realmGet$event, map));
                    }
                    Table.nativeSetLink(nativePtr, aVar.f18033g, j11, l10.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar.f18033g, j11);
                }
                String realmGet$notes = food.realmGet$notes();
                if (realmGet$notes != null) {
                    Table.nativeSetString(nativePtr, aVar.f18034h, j11, realmGet$notes, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18034h, j11, false);
                }
                Table.nativeSetLong(nativePtr, aVar.f18035i, j11, food.realmGet$value(), false);
                String realmGet$target = food.realmGet$target();
                if (realmGet$target != null) {
                    Table.nativeSetString(nativePtr, aVar.f18036j, j11, realmGet$target, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18036j, j11, false);
                }
                String realmGet$article = food.realmGet$article();
                if (realmGet$article != null) {
                    Table.nativeSetString(nativePtr, aVar.f18037k, j11, realmGet$article, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18037k, j11, false);
                }
                Boolean realmGet$canDrop = food.realmGet$canDrop();
                if (realmGet$canDrop != null) {
                    Table.nativeSetBoolean(nativePtr, aVar.f18038l, j11, realmGet$canDrop.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18038l, j11, false);
                }
                j13 = j12;
            }
        }
    }

    static o2 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Food.class), false, Collections.emptyList());
        o2 o2Var = new o2();
        cVar.a();
        return o2Var;
    }

    static Food n(o0 o0Var, a aVar, Food food, Food food2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Food.class), set);
        osObjectBuilder.c1(aVar.f18031e, food2.realmGet$key());
        osObjectBuilder.c1(aVar.f18032f, food2.realmGet$text());
        ItemEvent realmGet$event = food2.realmGet$event();
        if (realmGet$event == null) {
            osObjectBuilder.Z0(aVar.f18033g);
        } else {
            ItemEvent itemEvent = (ItemEvent) map.get(realmGet$event);
            if (itemEvent != null) {
                osObjectBuilder.a1(aVar.f18033g, itemEvent);
            } else {
                osObjectBuilder.a1(aVar.f18033g, s2.d(o0Var, (s2.a) o0Var.R().e(ItemEvent.class), realmGet$event, true, map, set));
            }
        }
        osObjectBuilder.c1(aVar.f18034h, food2.realmGet$notes());
        osObjectBuilder.V0(aVar.f18035i, Integer.valueOf(food2.realmGet$value()));
        osObjectBuilder.c1(aVar.f18036j, food2.realmGet$target());
        osObjectBuilder.c1(aVar.f18037k, food2.realmGet$article());
        osObjectBuilder.F0(aVar.f18038l, food2.realmGet$canDrop());
        osObjectBuilder.g1();
        return food;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18030q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18029p = (a) cVar.c();
        l0<Food> l0Var = new l0<>(this);
        this.f18030q = l0Var;
        l0Var.r(cVar.e());
        this.f18030q.s(cVar.f());
        this.f18030q.o(cVar.b());
        this.f18030q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18030q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o2 o2Var = (o2) obj;
        io.realm.a f10 = this.f18030q.f();
        io.realm.a f11 = o2Var.f18030q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18030q.g().getTable().p();
        String p11 = o2Var.f18030q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18030q.g().getObjectKey() == o2Var.f18030q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18030q.f().getPath();
        String p10 = this.f18030q.g().getTable().p();
        long objectKey = this.f18030q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public String realmGet$article() {
        this.f18030q.f().e();
        return this.f18030q.g().getString(this.f18029p.f18037k);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public Boolean realmGet$canDrop() {
        this.f18030q.f().e();
        if (this.f18030q.g().isNull(this.f18029p.f18038l)) {
            return null;
        }
        return Boolean.valueOf(this.f18030q.g().getBoolean(this.f18029p.f18038l));
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public ItemEvent realmGet$event() {
        this.f18030q.f().e();
        if (this.f18030q.g().isNullLink(this.f18029p.f18033g)) {
            return null;
        }
        return (ItemEvent) this.f18030q.f().B(ItemEvent.class, this.f18030q.g().getLink(this.f18029p.f18033g), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public String realmGet$key() {
        this.f18030q.f().e();
        return this.f18030q.g().getString(this.f18029p.f18031e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public String realmGet$notes() {
        this.f18030q.f().e();
        return this.f18030q.g().getString(this.f18029p.f18034h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public String realmGet$target() {
        this.f18030q.f().e();
        return this.f18030q.g().getString(this.f18029p.f18036j);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public String realmGet$text() {
        this.f18030q.f().e();
        return this.f18030q.g().getString(this.f18029p.f18032f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public int realmGet$value() {
        this.f18030q.f().e();
        return (int) this.f18030q.g().getLong(this.f18029p.f18035i);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public void realmSet$article(String str) {
        if (this.f18030q.i()) {
            if (!this.f18030q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18030q.g();
            if (str == null) {
                g10.getTable().F(this.f18029p.f18037k, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18029p.f18037k, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18030q.f().e();
        if (str == null) {
            this.f18030q.g().setNull(this.f18029p.f18037k);
        } else {
            this.f18030q.g().setString(this.f18029p.f18037k, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public void realmSet$canDrop(Boolean bool) {
        if (this.f18030q.i()) {
            if (!this.f18030q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18030q.g();
            if (bool == null) {
                g10.getTable().F(this.f18029p.f18038l, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f18029p.f18038l, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f18030q.f().e();
        if (bool == null) {
            this.f18030q.g().setNull(this.f18029p.f18038l);
        } else {
            this.f18030q.g().setBoolean(this.f18029p.f18038l, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public void realmSet$event(ItemEvent itemEvent) {
        o0 o0Var = (o0) this.f18030q.f();
        if (this.f18030q.i()) {
            if (!this.f18030q.d() || this.f18030q.e().contains("event")) {
                return;
            }
            if (itemEvent != null && !d1.isManaged(itemEvent)) {
                itemEvent = (ItemEvent) o0Var.D0(itemEvent, new v[0]);
            }
            io.realm.internal.q g10 = this.f18030q.g();
            if (itemEvent == null) {
                g10.nullifyLink(this.f18029p.f18033g);
                return;
            }
            this.f18030q.c(itemEvent);
            g10.getTable().D(this.f18029p.f18033g, g10.getObjectKey(), ((io.realm.internal.o) itemEvent).b().g().getObjectKey(), true);
            return;
        }
        this.f18030q.f().e();
        if (itemEvent == null) {
            this.f18030q.g().nullifyLink(this.f18029p.f18033g);
            return;
        }
        this.f18030q.c(itemEvent);
        this.f18030q.g().setLink(this.f18029p.f18033g, ((io.realm.internal.o) itemEvent).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public void realmSet$key(String str) {
        if (this.f18030q.i()) {
            return;
        }
        this.f18030q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public void realmSet$notes(String str) {
        if (this.f18030q.i()) {
            if (!this.f18030q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18030q.g();
            if (str == null) {
                g10.getTable().F(this.f18029p.f18034h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18029p.f18034h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18030q.f().e();
        if (str == null) {
            this.f18030q.g().setNull(this.f18029p.f18034h);
        } else {
            this.f18030q.g().setString(this.f18029p.f18034h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public void realmSet$target(String str) {
        if (this.f18030q.i()) {
            if (!this.f18030q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18030q.g();
            if (str == null) {
                g10.getTable().F(this.f18029p.f18036j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18029p.f18036j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18030q.f().e();
        if (str == null) {
            this.f18030q.g().setNull(this.f18029p.f18036j);
        } else {
            this.f18030q.g().setString(this.f18029p.f18036j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public void realmSet$text(String str) {
        if (this.f18030q.i()) {
            if (!this.f18030q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18030q.g();
            if (str != null) {
                g10.getTable().G(this.f18029p.f18032f, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        this.f18030q.f().e();
        if (str != null) {
            this.f18030q.g().setString(this.f18029p.f18032f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Food, io.realm.p2
    public void realmSet$value(int i10) {
        if (this.f18030q.i()) {
            if (!this.f18030q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18030q.g();
            g10.getTable().E(this.f18029p.f18035i, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18030q.f().e();
        this.f18030q.g().setLong(this.f18029p.f18035i, i10);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Food = proxy[");
        sb2.append("{key:");
        sb2.append(realmGet$key());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{text:");
        sb2.append(realmGet$text());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{event:");
        Object obj = "null";
        if (realmGet$event() == null) {
            str = "null";
        } else {
            str = "ItemEvent";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{notes:");
        if (realmGet$notes() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$notes();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{value:");
        sb2.append(realmGet$value());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{target:");
        if (realmGet$target() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$target();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{article:");
        if (realmGet$article() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$article();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{canDrop:");
        if (realmGet$canDrop() != null) {
            obj = realmGet$canDrop();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
