package io.realm;

import com.habitrpg.android.habitica.models.inventory.Customization;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import io.realm.a;
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

/* compiled from: com_habitrpg_android_habitica_models_inventory_CustomizationRealmProxy.java */
/* loaded from: classes4.dex */
public class i2 extends Customization implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17631r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17632p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Customization> f17633q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_CustomizationRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17634e;

        /* renamed from: f  reason: collision with root package name */
        long f17635f;

        /* renamed from: g  reason: collision with root package name */
        long f17636g;

        /* renamed from: h  reason: collision with root package name */
        long f17637h;

        /* renamed from: i  reason: collision with root package name */
        long f17638i;

        /* renamed from: j  reason: collision with root package name */
        long f17639j;

        /* renamed from: k  reason: collision with root package name */
        long f17640k;

        /* renamed from: l  reason: collision with root package name */
        long f17641l;

        /* renamed from: m  reason: collision with root package name */
        long f17642m;

        /* renamed from: n  reason: collision with root package name */
        long f17643n;

        /* renamed from: o  reason: collision with root package name */
        long f17644o;

        /* renamed from: p  reason: collision with root package name */
        long f17645p;

        /* renamed from: q  reason: collision with root package name */
        long f17646q;

        a(OsSchemaInfo osSchemaInfo) {
            super(13);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Customization");
            this.f17634e = a("id", "id", b10);
            this.f17635f = a("identifier", "identifier", b10);
            this.f17636g = a("category", "category", b10);
            this.f17637h = a(TaskFormActivity.TASK_TYPE_KEY, TaskFormActivity.TASK_TYPE_KEY, b10);
            this.f17638i = a("notes", "notes", b10);
            this.f17639j = a("customizationSet", "customizationSet", b10);
            this.f17640k = a("customizationSetName", "customizationSetName", b10);
            this.f17641l = a("text", "text", b10);
            this.f17642m = a("isBuyable", "isBuyable", b10);
            this.f17643n = a("price", "price", b10);
            this.f17644o = a("setPrice", "setPrice", b10);
            this.f17645p = a("availableFrom", "availableFrom", b10);
            this.f17646q = a("availableUntil", "availableUntil", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17634e = aVar.f17634e;
            aVar2.f17635f = aVar.f17635f;
            aVar2.f17636g = aVar.f17636g;
            aVar2.f17637h = aVar.f17637h;
            aVar2.f17638i = aVar.f17638i;
            aVar2.f17639j = aVar.f17639j;
            aVar2.f17640k = aVar.f17640k;
            aVar2.f17641l = aVar.f17641l;
            aVar2.f17642m = aVar.f17642m;
            aVar2.f17643n = aVar.f17643n;
            aVar2.f17644o = aVar.f17644o;
            aVar2.f17645p = aVar.f17645p;
            aVar2.f17646q = aVar.f17646q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i2() {
        this.f17633q.p();
    }

    public static Customization c(o0 o0Var, a aVar, Customization customization, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(customization);
        if (oVar != null) {
            return (Customization) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Customization.class), set);
        osObjectBuilder.c1(aVar.f17634e, customization.realmGet$id());
        osObjectBuilder.c1(aVar.f17635f, customization.realmGet$identifier());
        osObjectBuilder.c1(aVar.f17636g, customization.realmGet$category());
        osObjectBuilder.c1(aVar.f17637h, customization.realmGet$type());
        osObjectBuilder.c1(aVar.f17638i, customization.realmGet$notes());
        osObjectBuilder.c1(aVar.f17639j, customization.realmGet$customizationSet());
        osObjectBuilder.c1(aVar.f17640k, customization.realmGet$customizationSetName());
        osObjectBuilder.c1(aVar.f17641l, customization.realmGet$text());
        osObjectBuilder.F0(aVar.f17642m, Boolean.valueOf(customization.realmGet$isBuyable()));
        osObjectBuilder.V0(aVar.f17643n, customization.realmGet$price());
        osObjectBuilder.V0(aVar.f17644o, customization.realmGet$setPrice());
        osObjectBuilder.I0(aVar.f17645p, customization.realmGet$availableFrom());
        osObjectBuilder.I0(aVar.f17646q, customization.realmGet$availableUntil());
        i2 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(customization, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.inventory.Customization d(io.realm.o0 r8, io.realm.i2.a r9, com.habitrpg.android.habitica.models.inventory.Customization r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.Customization r1 = (com.habitrpg.android.habitica.models.inventory.Customization) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.Customization> r2 = com.habitrpg.android.habitica.models.inventory.Customization.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17634e
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
            io.realm.i2 r1 = new io.realm.i2     // Catch: java.lang.Throwable -> L8e
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
            com.habitrpg.android.habitica.models.inventory.Customization r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.inventory.Customization r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.i2.d(io.realm.o0, io.realm.i2$a, com.habitrpg.android.habitica.models.inventory.Customization, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.Customization");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Customization f(Customization customization, int i10, int i11, Map<a1, o.a<a1>> map) {
        Customization customization2;
        if (i10 <= i11 && customization != null) {
            o.a<a1> aVar = map.get(customization);
            if (aVar == null) {
                customization2 = new Customization();
                map.put(customization, new o.a<>(i10, customization2));
            } else if (i10 >= aVar.f17831a) {
                return (Customization) aVar.f17832b;
            } else {
                Customization customization3 = (Customization) aVar.f17832b;
                aVar.f17831a = i10;
                customization2 = customization3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) customization).b().f();
            customization2.realmSet$id(customization.realmGet$id());
            customization2.realmSet$identifier(customization.realmGet$identifier());
            customization2.realmSet$category(customization.realmGet$category());
            customization2.realmSet$type(customization.realmGet$type());
            customization2.realmSet$notes(customization.realmGet$notes());
            customization2.realmSet$customizationSet(customization.realmGet$customizationSet());
            customization2.realmSet$customizationSetName(customization.realmGet$customizationSetName());
            customization2.realmSet$text(customization.realmGet$text());
            customization2.realmSet$isBuyable(customization.realmGet$isBuyable());
            customization2.realmSet$price(customization.realmGet$price());
            customization2.realmSet$setPrice(customization.realmGet$setPrice());
            customization2.realmSet$availableFrom(customization.realmGet$availableFrom());
            customization2.realmSet$availableUntil(customization.realmGet$availableUntil());
            return customization2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Customization", false, 13, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        bVar.b("", "identifier", realmFieldType, false, false, false);
        bVar.b("", "category", realmFieldType, false, false, false);
        bVar.b("", TaskFormActivity.TASK_TYPE_KEY, realmFieldType, false, false, false);
        bVar.b("", "notes", realmFieldType, false, false, false);
        bVar.b("", "customizationSet", realmFieldType, false, false, false);
        bVar.b("", "customizationSetName", realmFieldType, false, false, false);
        bVar.b("", "text", realmFieldType, false, false, false);
        bVar.b("", "isBuyable", RealmFieldType.BOOLEAN, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "price", realmFieldType2, false, false, false);
        bVar.b("", "setPrice", realmFieldType2, false, false, false);
        RealmFieldType realmFieldType3 = RealmFieldType.DATE;
        bVar.b("", "availableFrom", realmFieldType3, false, false, false);
        bVar.b("", "availableUntil", realmFieldType3, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17631r;
    }

    public static long i(o0 o0Var, Customization customization, Map<a1, Long> map) {
        long nativeFindFirstString;
        if ((customization instanceof io.realm.internal.o) && !d1.isFrozen(customization)) {
            io.realm.internal.o oVar = (io.realm.internal.o) customization;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Customization.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Customization.class);
        long j10 = aVar.f17634e;
        String realmGet$id = customization.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j10);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j10, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j10, realmGet$id);
        }
        long j11 = nativeFindFirstString;
        map.put(customization, Long.valueOf(j11));
        String realmGet$identifier = customization.realmGet$identifier();
        if (realmGet$identifier != null) {
            Table.nativeSetString(nativePtr, aVar.f17635f, j11, realmGet$identifier, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17635f, j11, false);
        }
        String realmGet$category = customization.realmGet$category();
        if (realmGet$category != null) {
            Table.nativeSetString(nativePtr, aVar.f17636g, j11, realmGet$category, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17636g, j11, false);
        }
        String realmGet$type = customization.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, aVar.f17637h, j11, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17637h, j11, false);
        }
        String realmGet$notes = customization.realmGet$notes();
        if (realmGet$notes != null) {
            Table.nativeSetString(nativePtr, aVar.f17638i, j11, realmGet$notes, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17638i, j11, false);
        }
        String realmGet$customizationSet = customization.realmGet$customizationSet();
        if (realmGet$customizationSet != null) {
            Table.nativeSetString(nativePtr, aVar.f17639j, j11, realmGet$customizationSet, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17639j, j11, false);
        }
        String realmGet$customizationSetName = customization.realmGet$customizationSetName();
        if (realmGet$customizationSetName != null) {
            Table.nativeSetString(nativePtr, aVar.f17640k, j11, realmGet$customizationSetName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17640k, j11, false);
        }
        String realmGet$text = customization.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar.f17641l, j11, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17641l, j11, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f17642m, j11, customization.realmGet$isBuyable(), false);
        Integer realmGet$price = customization.realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetLong(nativePtr, aVar.f17643n, j11, realmGet$price.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17643n, j11, false);
        }
        Integer realmGet$setPrice = customization.realmGet$setPrice();
        if (realmGet$setPrice != null) {
            Table.nativeSetLong(nativePtr, aVar.f17644o, j11, realmGet$setPrice.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17644o, j11, false);
        }
        Date realmGet$availableFrom = customization.realmGet$availableFrom();
        if (realmGet$availableFrom != null) {
            Table.nativeSetTimestamp(nativePtr, aVar.f17645p, j11, realmGet$availableFrom.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17645p, j11, false);
        }
        Date realmGet$availableUntil = customization.realmGet$availableUntil();
        if (realmGet$availableUntil != null) {
            Table.nativeSetTimestamp(nativePtr, aVar.f17646q, j11, realmGet$availableUntil.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17646q, j11, false);
        }
        return j11;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        long j11;
        Table c12 = o0Var.c1(Customization.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Customization.class);
        long j12 = aVar.f17634e;
        while (it.hasNext()) {
            Customization customization = (Customization) it.next();
            if (!map.containsKey(customization)) {
                if ((customization instanceof io.realm.internal.o) && !d1.isFrozen(customization)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) customization;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(customization, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$id = customization.realmGet$id();
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
                map.put(customization, Long.valueOf(j10));
                String realmGet$identifier = customization.realmGet$identifier();
                if (realmGet$identifier != null) {
                    j11 = j12;
                    Table.nativeSetString(nativePtr, aVar.f17635f, j10, realmGet$identifier, false);
                } else {
                    j11 = j12;
                    Table.nativeSetNull(nativePtr, aVar.f17635f, j10, false);
                }
                String realmGet$category = customization.realmGet$category();
                if (realmGet$category != null) {
                    Table.nativeSetString(nativePtr, aVar.f17636g, j10, realmGet$category, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17636g, j10, false);
                }
                String realmGet$type = customization.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, aVar.f17637h, j10, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17637h, j10, false);
                }
                String realmGet$notes = customization.realmGet$notes();
                if (realmGet$notes != null) {
                    Table.nativeSetString(nativePtr, aVar.f17638i, j10, realmGet$notes, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17638i, j10, false);
                }
                String realmGet$customizationSet = customization.realmGet$customizationSet();
                if (realmGet$customizationSet != null) {
                    Table.nativeSetString(nativePtr, aVar.f17639j, j10, realmGet$customizationSet, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17639j, j10, false);
                }
                String realmGet$customizationSetName = customization.realmGet$customizationSetName();
                if (realmGet$customizationSetName != null) {
                    Table.nativeSetString(nativePtr, aVar.f17640k, j10, realmGet$customizationSetName, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17640k, j10, false);
                }
                String realmGet$text = customization.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, aVar.f17641l, j10, realmGet$text, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17641l, j10, false);
                }
                Table.nativeSetBoolean(nativePtr, aVar.f17642m, j10, customization.realmGet$isBuyable(), false);
                Integer realmGet$price = customization.realmGet$price();
                if (realmGet$price != null) {
                    Table.nativeSetLong(nativePtr, aVar.f17643n, j10, realmGet$price.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17643n, j10, false);
                }
                Integer realmGet$setPrice = customization.realmGet$setPrice();
                if (realmGet$setPrice != null) {
                    Table.nativeSetLong(nativePtr, aVar.f17644o, j10, realmGet$setPrice.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17644o, j10, false);
                }
                Date realmGet$availableFrom = customization.realmGet$availableFrom();
                if (realmGet$availableFrom != null) {
                    Table.nativeSetTimestamp(nativePtr, aVar.f17645p, j10, realmGet$availableFrom.getTime(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17645p, j10, false);
                }
                Date realmGet$availableUntil = customization.realmGet$availableUntil();
                if (realmGet$availableUntil != null) {
                    Table.nativeSetTimestamp(nativePtr, aVar.f17646q, j10, realmGet$availableUntil.getTime(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17646q, j10, false);
                }
                j12 = j11;
            }
        }
    }

    static i2 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Customization.class), false, Collections.emptyList());
        i2 i2Var = new i2();
        cVar.a();
        return i2Var;
    }

    static Customization n(o0 o0Var, a aVar, Customization customization, Customization customization2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Customization.class), set);
        osObjectBuilder.c1(aVar.f17634e, customization2.realmGet$id());
        osObjectBuilder.c1(aVar.f17635f, customization2.realmGet$identifier());
        osObjectBuilder.c1(aVar.f17636g, customization2.realmGet$category());
        osObjectBuilder.c1(aVar.f17637h, customization2.realmGet$type());
        osObjectBuilder.c1(aVar.f17638i, customization2.realmGet$notes());
        osObjectBuilder.c1(aVar.f17639j, customization2.realmGet$customizationSet());
        osObjectBuilder.c1(aVar.f17640k, customization2.realmGet$customizationSetName());
        osObjectBuilder.c1(aVar.f17641l, customization2.realmGet$text());
        osObjectBuilder.F0(aVar.f17642m, Boolean.valueOf(customization2.realmGet$isBuyable()));
        osObjectBuilder.V0(aVar.f17643n, customization2.realmGet$price());
        osObjectBuilder.V0(aVar.f17644o, customization2.realmGet$setPrice());
        osObjectBuilder.I0(aVar.f17645p, customization2.realmGet$availableFrom());
        osObjectBuilder.I0(aVar.f17646q, customization2.realmGet$availableUntil());
        osObjectBuilder.g1();
        return customization;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17633q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17632p = (a) cVar.c();
        l0<Customization> l0Var = new l0<>(this);
        this.f17633q = l0Var;
        l0Var.r(cVar.e());
        this.f17633q.s(cVar.f());
        this.f17633q.o(cVar.b());
        this.f17633q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17633q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i2 i2Var = (i2) obj;
        io.realm.a f10 = this.f17633q.f();
        io.realm.a f11 = i2Var.f17633q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17633q.g().getTable().p();
        String p11 = i2Var.f17633q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17633q.g().getObjectKey() == i2Var.f17633q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17633q.f().getPath();
        String p10 = this.f17633q.g().getTable().p();
        long objectKey = this.f17633q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public Date realmGet$availableFrom() {
        this.f17633q.f().e();
        if (this.f17633q.g().isNull(this.f17632p.f17645p)) {
            return null;
        }
        return this.f17633q.g().getDate(this.f17632p.f17645p);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public Date realmGet$availableUntil() {
        this.f17633q.f().e();
        if (this.f17633q.g().isNull(this.f17632p.f17646q)) {
            return null;
        }
        return this.f17633q.g().getDate(this.f17632p.f17646q);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public String realmGet$category() {
        this.f17633q.f().e();
        return this.f17633q.g().getString(this.f17632p.f17636g);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public String realmGet$customizationSet() {
        this.f17633q.f().e();
        return this.f17633q.g().getString(this.f17632p.f17639j);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public String realmGet$customizationSetName() {
        this.f17633q.f().e();
        return this.f17633q.g().getString(this.f17632p.f17640k);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public String realmGet$id() {
        this.f17633q.f().e();
        return this.f17633q.g().getString(this.f17632p.f17634e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public String realmGet$identifier() {
        this.f17633q.f().e();
        return this.f17633q.g().getString(this.f17632p.f17635f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public boolean realmGet$isBuyable() {
        this.f17633q.f().e();
        return this.f17633q.g().getBoolean(this.f17632p.f17642m);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public String realmGet$notes() {
        this.f17633q.f().e();
        return this.f17633q.g().getString(this.f17632p.f17638i);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public Integer realmGet$price() {
        this.f17633q.f().e();
        if (this.f17633q.g().isNull(this.f17632p.f17643n)) {
            return null;
        }
        return Integer.valueOf((int) this.f17633q.g().getLong(this.f17632p.f17643n));
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public Integer realmGet$setPrice() {
        this.f17633q.f().e();
        if (this.f17633q.g().isNull(this.f17632p.f17644o)) {
            return null;
        }
        return Integer.valueOf((int) this.f17633q.g().getLong(this.f17632p.f17644o));
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public String realmGet$text() {
        this.f17633q.f().e();
        return this.f17633q.g().getString(this.f17632p.f17641l);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public String realmGet$type() {
        this.f17633q.f().e();
        return this.f17633q.g().getString(this.f17632p.f17637h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public void realmSet$availableFrom(Date date) {
        if (this.f17633q.i()) {
            if (!this.f17633q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17633q.g();
            if (date == null) {
                g10.getTable().F(this.f17632p.f17645p, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f17632p.f17645p, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f17633q.f().e();
        if (date == null) {
            this.f17633q.g().setNull(this.f17632p.f17645p);
        } else {
            this.f17633q.g().setDate(this.f17632p.f17645p, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public void realmSet$availableUntil(Date date) {
        if (this.f17633q.i()) {
            if (!this.f17633q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17633q.g();
            if (date == null) {
                g10.getTable().F(this.f17632p.f17646q, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f17632p.f17646q, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f17633q.f().e();
        if (date == null) {
            this.f17633q.g().setNull(this.f17632p.f17646q);
        } else {
            this.f17633q.g().setDate(this.f17632p.f17646q, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public void realmSet$category(String str) {
        if (this.f17633q.i()) {
            if (!this.f17633q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17633q.g();
            if (str == null) {
                g10.getTable().F(this.f17632p.f17636g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17632p.f17636g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17633q.f().e();
        if (str == null) {
            this.f17633q.g().setNull(this.f17632p.f17636g);
        } else {
            this.f17633q.g().setString(this.f17632p.f17636g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public void realmSet$customizationSet(String str) {
        if (this.f17633q.i()) {
            if (!this.f17633q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17633q.g();
            if (str == null) {
                g10.getTable().F(this.f17632p.f17639j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17632p.f17639j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17633q.f().e();
        if (str == null) {
            this.f17633q.g().setNull(this.f17632p.f17639j);
        } else {
            this.f17633q.g().setString(this.f17632p.f17639j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public void realmSet$customizationSetName(String str) {
        if (this.f17633q.i()) {
            if (!this.f17633q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17633q.g();
            if (str == null) {
                g10.getTable().F(this.f17632p.f17640k, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17632p.f17640k, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17633q.f().e();
        if (str == null) {
            this.f17633q.g().setNull(this.f17632p.f17640k);
        } else {
            this.f17633q.g().setString(this.f17632p.f17640k, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public void realmSet$id(String str) {
        if (this.f17633q.i()) {
            return;
        }
        this.f17633q.f().e();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public void realmSet$identifier(String str) {
        if (this.f17633q.i()) {
            if (!this.f17633q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17633q.g();
            if (str == null) {
                g10.getTable().F(this.f17632p.f17635f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17632p.f17635f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17633q.f().e();
        if (str == null) {
            this.f17633q.g().setNull(this.f17632p.f17635f);
        } else {
            this.f17633q.g().setString(this.f17632p.f17635f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public void realmSet$isBuyable(boolean z10) {
        if (this.f17633q.i()) {
            if (!this.f17633q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17633q.g();
            g10.getTable().z(this.f17632p.f17642m, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17633q.f().e();
        this.f17633q.g().setBoolean(this.f17632p.f17642m, z10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public void realmSet$notes(String str) {
        if (this.f17633q.i()) {
            if (!this.f17633q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17633q.g();
            if (str == null) {
                g10.getTable().F(this.f17632p.f17638i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17632p.f17638i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17633q.f().e();
        if (str == null) {
            this.f17633q.g().setNull(this.f17632p.f17638i);
        } else {
            this.f17633q.g().setString(this.f17632p.f17638i, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public void realmSet$price(Integer num) {
        if (this.f17633q.i()) {
            if (!this.f17633q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17633q.g();
            if (num == null) {
                g10.getTable().F(this.f17632p.f17643n, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f17632p.f17643n, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f17633q.f().e();
        if (num == null) {
            this.f17633q.g().setNull(this.f17632p.f17643n);
        } else {
            this.f17633q.g().setLong(this.f17632p.f17643n, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public void realmSet$setPrice(Integer num) {
        if (this.f17633q.i()) {
            if (!this.f17633q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17633q.g();
            if (num == null) {
                g10.getTable().F(this.f17632p.f17644o, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f17632p.f17644o, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f17633q.f().e();
        if (num == null) {
            this.f17633q.g().setNull(this.f17632p.f17644o);
        } else {
            this.f17633q.g().setLong(this.f17632p.f17644o, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public void realmSet$text(String str) {
        if (this.f17633q.i()) {
            if (!this.f17633q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17633q.g();
            if (str == null) {
                g10.getTable().F(this.f17632p.f17641l, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17632p.f17641l, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17633q.f().e();
        if (str == null) {
            this.f17633q.g().setNull(this.f17632p.f17641l);
        } else {
            this.f17633q.g().setString(this.f17632p.f17641l, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Customization, io.realm.j2
    public void realmSet$type(String str) {
        if (this.f17633q.i()) {
            if (!this.f17633q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17633q.g();
            if (str == null) {
                g10.getTable().F(this.f17632p.f17637h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17632p.f17637h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17633q.f().e();
        if (str == null) {
            this.f17633q.g().setNull(this.f17632p.f17637h);
        } else {
            this.f17633q.g().setString(this.f17632p.f17637h, str);
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
        Integer num;
        Integer num2;
        Date date;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Customization = proxy[");
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
        sb2.append("{identifier:");
        if (realmGet$identifier() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$identifier();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{category:");
        if (realmGet$category() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$category();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{type:");
        if (realmGet$type() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$type();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{notes:");
        if (realmGet$notes() == null) {
            str5 = "null";
        } else {
            str5 = realmGet$notes();
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{customizationSet:");
        if (realmGet$customizationSet() == null) {
            str6 = "null";
        } else {
            str6 = realmGet$customizationSet();
        }
        sb2.append(str6);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{customizationSetName:");
        if (realmGet$customizationSetName() == null) {
            str7 = "null";
        } else {
            str7 = realmGet$customizationSetName();
        }
        sb2.append(str7);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{text:");
        if (realmGet$text() == null) {
            str8 = "null";
        } else {
            str8 = realmGet$text();
        }
        sb2.append(str8);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{isBuyable:");
        sb2.append(realmGet$isBuyable());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{price:");
        if (realmGet$price() == null) {
            num = "null";
        } else {
            num = realmGet$price();
        }
        sb2.append(num);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{setPrice:");
        if (realmGet$setPrice() == null) {
            num2 = "null";
        } else {
            num2 = realmGet$setPrice();
        }
        sb2.append(num2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{availableFrom:");
        if (realmGet$availableFrom() == null) {
            date = "null";
        } else {
            date = realmGet$availableFrom();
        }
        sb2.append(date);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{availableUntil:");
        if (realmGet$availableUntil() != null) {
            obj = realmGet$availableUntil();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
