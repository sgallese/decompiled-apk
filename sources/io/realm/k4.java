package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.inventory.ItemEvent;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.shops.ShopItemUnlockCondition;
import io.realm.a;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.s2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_shops_ShopItemRealmProxy.java */
/* loaded from: classes4.dex */
public class k4 extends ShopItem implements io.realm.internal.o {

    /* renamed from: u  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17886u = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17887p;

    /* renamed from: q  reason: collision with root package name */
    private l0<ShopItem> f17888q;

    /* renamed from: r  reason: collision with root package name */
    private x0<String> f17889r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_shops_ShopItemRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17890e;

        /* renamed from: f  reason: collision with root package name */
        long f17891f;

        /* renamed from: g  reason: collision with root package name */
        long f17892g;

        /* renamed from: h  reason: collision with root package name */
        long f17893h;

        /* renamed from: i  reason: collision with root package name */
        long f17894i;

        /* renamed from: j  reason: collision with root package name */
        long f17895j;

        /* renamed from: k  reason: collision with root package name */
        long f17896k;

        /* renamed from: l  reason: collision with root package name */
        long f17897l;

        /* renamed from: m  reason: collision with root package name */
        long f17898m;

        /* renamed from: n  reason: collision with root package name */
        long f17899n;

        /* renamed from: o  reason: collision with root package name */
        long f17900o;

        /* renamed from: p  reason: collision with root package name */
        long f17901p;

        /* renamed from: q  reason: collision with root package name */
        long f17902q;

        /* renamed from: r  reason: collision with root package name */
        long f17903r;

        /* renamed from: s  reason: collision with root package name */
        long f17904s;

        /* renamed from: t  reason: collision with root package name */
        long f17905t;

        /* renamed from: u  reason: collision with root package name */
        long f17906u;

        /* renamed from: v  reason: collision with root package name */
        long f17907v;

        /* renamed from: w  reason: collision with root package name */
        long f17908w;

        /* renamed from: x  reason: collision with root package name */
        long f17909x;

        /* renamed from: y  reason: collision with root package name */
        long f17910y;

        a(OsSchemaInfo osSchemaInfo) {
            super(21);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("ShopItem");
            this.f17890e = a("key", "key", b10);
            this.f17891f = a("text", "text", b10);
            this.f17892g = a("notes", "notes", b10);
            this.f17893h = a("imageName", "imageName", b10);
            this.f17894i = a(AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.VALUE, b10);
            this.f17895j = a("locked", "locked", b10);
            this.f17896k = a("isLimited", "isLimited", b10);
            this.f17897l = a("currency", "currency", b10);
            this.f17898m = a("purchaseType", "purchaseType", b10);
            this.f17899n = a("categoryIdentifier", "categoryIdentifier", b10);
            this.f17900o = a("limitedNumberLeft", "limitedNumberLeft", b10);
            this.f17901p = a("unlockCondition", "unlockCondition", b10);
            this.f17902q = a("path", "path", b10);
            this.f17903r = a("unlockPath", "unlockPath", b10);
            this.f17904s = a("isSuggested", "isSuggested", b10);
            this.f17905t = a("pinType", "pinType", b10);
            this.f17906u = a("habitClass", "habitClass", b10);
            this.f17907v = a("previous", "previous", b10);
            this.f17908w = a("level", "level", b10);
            this.f17909x = a("event", "event", b10);
            this.f17910y = a("setImageNames", "setImageNames", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17890e = aVar.f17890e;
            aVar2.f17891f = aVar.f17891f;
            aVar2.f17892g = aVar.f17892g;
            aVar2.f17893h = aVar.f17893h;
            aVar2.f17894i = aVar.f17894i;
            aVar2.f17895j = aVar.f17895j;
            aVar2.f17896k = aVar.f17896k;
            aVar2.f17897l = aVar.f17897l;
            aVar2.f17898m = aVar.f17898m;
            aVar2.f17899n = aVar.f17899n;
            aVar2.f17900o = aVar.f17900o;
            aVar2.f17901p = aVar.f17901p;
            aVar2.f17902q = aVar.f17902q;
            aVar2.f17903r = aVar.f17903r;
            aVar2.f17904s = aVar.f17904s;
            aVar2.f17905t = aVar.f17905t;
            aVar2.f17906u = aVar.f17906u;
            aVar2.f17907v = aVar.f17907v;
            aVar2.f17908w = aVar.f17908w;
            aVar2.f17909x = aVar.f17909x;
            aVar2.f17910y = aVar.f17910y;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k4() {
        this.f17888q.p();
    }

    public static ShopItem c(o0 o0Var, a aVar, ShopItem shopItem, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(shopItem);
        if (oVar != null) {
            return (ShopItem) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ShopItem.class), set);
        osObjectBuilder.c1(aVar.f17890e, shopItem.realmGet$key());
        osObjectBuilder.c1(aVar.f17891f, shopItem.realmGet$text());
        osObjectBuilder.c1(aVar.f17892g, shopItem.realmGet$notes());
        osObjectBuilder.c1(aVar.f17893h, shopItem.realmGet$imageName());
        osObjectBuilder.V0(aVar.f17894i, Integer.valueOf(shopItem.realmGet$value()));
        osObjectBuilder.F0(aVar.f17895j, Boolean.valueOf(shopItem.realmGet$locked()));
        osObjectBuilder.F0(aVar.f17896k, Boolean.valueOf(shopItem.realmGet$isLimited()));
        osObjectBuilder.c1(aVar.f17897l, shopItem.realmGet$currency());
        osObjectBuilder.c1(aVar.f17898m, shopItem.realmGet$purchaseType());
        osObjectBuilder.c1(aVar.f17899n, shopItem.realmGet$categoryIdentifier());
        osObjectBuilder.V0(aVar.f17900o, shopItem.realmGet$limitedNumberLeft());
        osObjectBuilder.c1(aVar.f17902q, shopItem.realmGet$path());
        osObjectBuilder.c1(aVar.f17903r, shopItem.realmGet$unlockPath());
        osObjectBuilder.c1(aVar.f17904s, shopItem.realmGet$isSuggested());
        osObjectBuilder.c1(aVar.f17905t, shopItem.realmGet$pinType());
        osObjectBuilder.c1(aVar.f17906u, shopItem.realmGet$habitClass());
        osObjectBuilder.c1(aVar.f17907v, shopItem.realmGet$previous());
        osObjectBuilder.V0(aVar.f17908w, shopItem.realmGet$level());
        osObjectBuilder.d1(aVar.f17910y, shopItem.realmGet$setImageNames());
        k4 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(shopItem, l10);
        ShopItemUnlockCondition realmGet$unlockCondition = shopItem.realmGet$unlockCondition();
        if (realmGet$unlockCondition == null) {
            l10.realmSet$unlockCondition(null);
        } else if (((ShopItemUnlockCondition) map.get(realmGet$unlockCondition)) == null) {
            m4 k10 = m4.k(o0Var, o0Var.c1(ShopItemUnlockCondition.class).s(l10.b().g().createEmbeddedObject(aVar.f17901p, RealmFieldType.OBJECT)));
            map.put(realmGet$unlockCondition, k10);
            m4.n(o0Var, realmGet$unlockCondition, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheunlockCondition.toString()");
        }
        ItemEvent realmGet$event = shopItem.realmGet$event();
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
    public static com.habitrpg.android.habitica.models.shops.ShopItem d(io.realm.o0 r8, io.realm.k4.a r9, com.habitrpg.android.habitica.models.shops.ShopItem r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.shops.ShopItem r1 = (com.habitrpg.android.habitica.models.shops.ShopItem) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.shops.ShopItem> r2 = com.habitrpg.android.habitica.models.shops.ShopItem.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17890e
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
            io.realm.k4 r1 = new io.realm.k4     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.shops.ShopItem r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.shops.ShopItem r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.k4.d(io.realm.o0, io.realm.k4$a, com.habitrpg.android.habitica.models.shops.ShopItem, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.shops.ShopItem");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ShopItem f(ShopItem shopItem, int i10, int i11, Map<a1, o.a<a1>> map) {
        ShopItem shopItem2;
        if (i10 <= i11 && shopItem != null) {
            o.a<a1> aVar = map.get(shopItem);
            if (aVar == null) {
                shopItem2 = new ShopItem();
                map.put(shopItem, new o.a<>(i10, shopItem2));
            } else if (i10 >= aVar.f17831a) {
                return (ShopItem) aVar.f17832b;
            } else {
                ShopItem shopItem3 = (ShopItem) aVar.f17832b;
                aVar.f17831a = i10;
                shopItem2 = shopItem3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) shopItem).b().f();
            shopItem2.realmSet$key(shopItem.realmGet$key());
            shopItem2.realmSet$text(shopItem.realmGet$text());
            shopItem2.realmSet$notes(shopItem.realmGet$notes());
            shopItem2.realmSet$imageName(shopItem.realmGet$imageName());
            shopItem2.realmSet$value(shopItem.realmGet$value());
            shopItem2.realmSet$locked(shopItem.realmGet$locked());
            shopItem2.realmSet$isLimited(shopItem.realmGet$isLimited());
            shopItem2.realmSet$currency(shopItem.realmGet$currency());
            shopItem2.realmSet$purchaseType(shopItem.realmGet$purchaseType());
            shopItem2.realmSet$categoryIdentifier(shopItem.realmGet$categoryIdentifier());
            shopItem2.realmSet$limitedNumberLeft(shopItem.realmGet$limitedNumberLeft());
            int i12 = i10 + 1;
            shopItem2.realmSet$unlockCondition(m4.f(shopItem.realmGet$unlockCondition(), i12, i11, map));
            shopItem2.realmSet$path(shopItem.realmGet$path());
            shopItem2.realmSet$unlockPath(shopItem.realmGet$unlockPath());
            shopItem2.realmSet$isSuggested(shopItem.realmGet$isSuggested());
            shopItem2.realmSet$pinType(shopItem.realmGet$pinType());
            shopItem2.realmSet$habitClass(shopItem.realmGet$habitClass());
            shopItem2.realmSet$previous(shopItem.realmGet$previous());
            shopItem2.realmSet$level(shopItem.realmGet$level());
            shopItem2.realmSet$event(s2.f(shopItem.realmGet$event(), i12, i11, map));
            shopItem2.realmSet$setImageNames(new x0<>());
            shopItem2.realmGet$setImageNames().addAll(shopItem.realmGet$setImageNames());
            return shopItem2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ShopItem", false, 21, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, true, false, true);
        bVar.b("", "text", realmFieldType, false, false, false);
        bVar.b("", "notes", realmFieldType, false, false, false);
        bVar.b("", "imageName", realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.VALUE, realmFieldType2, false, false, true);
        RealmFieldType realmFieldType3 = RealmFieldType.BOOLEAN;
        bVar.b("", "locked", realmFieldType3, false, false, true);
        bVar.b("", "isLimited", realmFieldType3, false, false, true);
        bVar.b("", "currency", realmFieldType, false, false, false);
        bVar.b("", "purchaseType", realmFieldType, false, false, true);
        bVar.b("", "categoryIdentifier", realmFieldType, false, false, true);
        bVar.b("", "limitedNumberLeft", realmFieldType2, false, false, false);
        RealmFieldType realmFieldType4 = RealmFieldType.OBJECT;
        bVar.a("", "unlockCondition", realmFieldType4, "ShopItemUnlockCondition");
        bVar.b("", "path", realmFieldType, false, false, false);
        bVar.b("", "unlockPath", realmFieldType, false, false, false);
        bVar.b("", "isSuggested", realmFieldType, false, false, false);
        bVar.b("", "pinType", realmFieldType, false, false, false);
        bVar.b("", "habitClass", realmFieldType, false, false, false);
        bVar.b("", "previous", realmFieldType, false, false, false);
        bVar.b("", "level", realmFieldType2, false, false, false);
        bVar.a("", "event", realmFieldType4, "ItemEvent");
        bVar.c("", "setImageNames", RealmFieldType.STRING_LIST, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17886u;
    }

    public static long i(o0 o0Var, ShopItem shopItem, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        long j13;
        a aVar;
        a aVar2;
        long j14;
        if ((shopItem instanceof io.realm.internal.o) && !d1.isFrozen(shopItem)) {
            io.realm.internal.o oVar = (io.realm.internal.o) shopItem;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(ShopItem.class);
        long nativePtr = c12.getNativePtr();
        a aVar3 = (a) o0Var.R().e(ShopItem.class);
        long j15 = aVar3.f17890e;
        String realmGet$key = shopItem.realmGet$key();
        if (realmGet$key != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j15, realmGet$key);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j15, realmGet$key);
        }
        long j16 = j10;
        map.put(shopItem, Long.valueOf(j16));
        String realmGet$text = shopItem.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar3.f17891f, j16, realmGet$text, false);
            j11 = j16;
            j12 = nativePtr;
        } else {
            j11 = j16;
            j12 = nativePtr;
            Table.nativeSetNull(nativePtr, aVar3.f17891f, j11, false);
        }
        String realmGet$notes = shopItem.realmGet$notes();
        if (realmGet$notes != null) {
            long j17 = j11;
            Table.nativeSetString(j12, aVar3.f17892g, j17, realmGet$notes, false);
            j11 = j17;
        } else {
            Table.nativeSetNull(j12, aVar3.f17892g, j11, false);
        }
        String realmGet$imageName = shopItem.realmGet$imageName();
        if (realmGet$imageName != null) {
            long j18 = j11;
            Table.nativeSetString(j12, aVar3.f17893h, j18, realmGet$imageName, false);
            j11 = j18;
        } else {
            Table.nativeSetNull(j12, aVar3.f17893h, j11, false);
        }
        long j19 = j12;
        long j20 = j11;
        Table.nativeSetLong(j19, aVar3.f17894i, j20, shopItem.realmGet$value(), false);
        Table.nativeSetBoolean(j19, aVar3.f17895j, j20, shopItem.realmGet$locked(), false);
        Table.nativeSetBoolean(j19, aVar3.f17896k, j20, shopItem.realmGet$isLimited(), false);
        String realmGet$currency = shopItem.realmGet$currency();
        if (realmGet$currency != null) {
            Table.nativeSetString(j12, aVar3.f17897l, j20, realmGet$currency, false);
            j13 = j20;
        } else {
            j13 = j20;
            Table.nativeSetNull(j12, aVar3.f17897l, j20, false);
        }
        String realmGet$purchaseType = shopItem.realmGet$purchaseType();
        if (realmGet$purchaseType != null) {
            long j21 = j13;
            Table.nativeSetString(j12, aVar3.f17898m, j21, realmGet$purchaseType, false);
            j13 = j21;
        } else {
            Table.nativeSetNull(j12, aVar3.f17898m, j13, false);
        }
        String realmGet$categoryIdentifier = shopItem.realmGet$categoryIdentifier();
        if (realmGet$categoryIdentifier != null) {
            long j22 = j13;
            Table.nativeSetString(j12, aVar3.f17899n, j22, realmGet$categoryIdentifier, false);
            j13 = j22;
        } else {
            Table.nativeSetNull(j12, aVar3.f17899n, j13, false);
        }
        Integer realmGet$limitedNumberLeft = shopItem.realmGet$limitedNumberLeft();
        if (realmGet$limitedNumberLeft != null) {
            long j23 = j13;
            Table.nativeSetLong(j12, aVar3.f17900o, j23, realmGet$limitedNumberLeft.longValue(), false);
            j13 = j23;
        } else {
            Table.nativeSetNull(j12, aVar3.f17900o, j13, false);
        }
        ShopItemUnlockCondition realmGet$unlockCondition = shopItem.realmGet$unlockCondition();
        if (realmGet$unlockCondition != null) {
            Long l10 = map.get(realmGet$unlockCondition);
            if (l10 == null) {
                aVar = aVar3;
                m4.i(o0Var, c12, aVar3.f17901p, j13, realmGet$unlockCondition, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
            }
        } else {
            aVar = aVar3;
            Table.nativeNullifyLink(j12, aVar.f17901p, j13);
        }
        String realmGet$path = shopItem.realmGet$path();
        if (realmGet$path != null) {
            long j24 = j13;
            Table.nativeSetString(j12, aVar.f17902q, j24, realmGet$path, false);
            j13 = j24;
            aVar = aVar;
        } else {
            Table.nativeSetNull(j12, aVar.f17902q, j13, false);
        }
        String realmGet$unlockPath = shopItem.realmGet$unlockPath();
        if (realmGet$unlockPath != null) {
            long j25 = j13;
            Table.nativeSetString(j12, aVar.f17903r, j25, realmGet$unlockPath, false);
            j13 = j25;
            aVar = aVar;
        } else {
            Table.nativeSetNull(j12, aVar.f17903r, j13, false);
        }
        String realmGet$isSuggested = shopItem.realmGet$isSuggested();
        if (realmGet$isSuggested != null) {
            long j26 = j13;
            Table.nativeSetString(j12, aVar.f17904s, j26, realmGet$isSuggested, false);
            j13 = j26;
            aVar = aVar;
        } else {
            Table.nativeSetNull(j12, aVar.f17904s, j13, false);
        }
        String realmGet$pinType = shopItem.realmGet$pinType();
        if (realmGet$pinType != null) {
            long j27 = j13;
            Table.nativeSetString(j12, aVar.f17905t, j27, realmGet$pinType, false);
            j13 = j27;
            aVar = aVar;
        } else {
            Table.nativeSetNull(j12, aVar.f17905t, j13, false);
        }
        String realmGet$habitClass = shopItem.realmGet$habitClass();
        if (realmGet$habitClass != null) {
            long j28 = j13;
            Table.nativeSetString(j12, aVar.f17906u, j28, realmGet$habitClass, false);
            j13 = j28;
            aVar = aVar;
        } else {
            Table.nativeSetNull(j12, aVar.f17906u, j13, false);
        }
        String realmGet$previous = shopItem.realmGet$previous();
        if (realmGet$previous != null) {
            long j29 = j13;
            Table.nativeSetString(j12, aVar.f17907v, j29, realmGet$previous, false);
            j13 = j29;
            aVar = aVar;
        } else {
            Table.nativeSetNull(j12, aVar.f17907v, j13, false);
        }
        Integer realmGet$level = shopItem.realmGet$level();
        if (realmGet$level != null) {
            long j30 = aVar.f17908w;
            long longValue = realmGet$level.longValue();
            aVar2 = aVar;
            long j31 = j13;
            Table.nativeSetLong(j12, j30, j31, longValue, false);
            j13 = j31;
        } else {
            aVar2 = aVar;
            Table.nativeSetNull(j12, aVar2.f17908w, j13, false);
        }
        ItemEvent realmGet$event = shopItem.realmGet$event();
        if (realmGet$event != null) {
            Long l11 = map.get(realmGet$event);
            if (l11 == null) {
                l11 = Long.valueOf(s2.i(o0Var, realmGet$event, map));
            }
            j14 = j13;
            Table.nativeSetLink(j12, aVar2.f17909x, j14, l11.longValue(), false);
        } else {
            j14 = j13;
            Table.nativeNullifyLink(j12, aVar2.f17909x, j14);
        }
        OsList osList = new OsList(c12.s(j14), aVar2.f17910y);
        osList.K();
        x0<String> realmGet$setImageNames = shopItem.realmGet$setImageNames();
        if (realmGet$setImageNames != null) {
            Iterator<String> it = realmGet$setImageNames.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.h();
                } else {
                    osList.l(next);
                }
            }
        }
        return j14;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        long j13;
        ShopItem shopItem;
        long j14;
        long j15;
        a aVar;
        Table c12 = o0Var.c1(ShopItem.class);
        long nativePtr = c12.getNativePtr();
        a aVar2 = (a) o0Var.R().e(ShopItem.class);
        long j16 = aVar2.f17890e;
        while (it.hasNext()) {
            ShopItem shopItem2 = (ShopItem) it.next();
            if (!map.containsKey(shopItem2)) {
                if ((shopItem2 instanceof io.realm.internal.o) && !d1.isFrozen(shopItem2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) shopItem2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(shopItem2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = shopItem2.realmGet$key();
                if (realmGet$key != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j16, realmGet$key);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j10 = OsObject.createRowWithPrimaryKey(c12, j16, realmGet$key);
                }
                long j17 = j10;
                map.put(shopItem2, Long.valueOf(j17));
                String realmGet$text = shopItem2.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, aVar2.f17891f, j17, realmGet$text, false);
                    j11 = j17;
                    j12 = j16;
                    j13 = nativePtr;
                    shopItem = shopItem2;
                } else {
                    j11 = j17;
                    j12 = j16;
                    j13 = nativePtr;
                    shopItem = shopItem2;
                    Table.nativeSetNull(nativePtr, aVar2.f17891f, j11, false);
                }
                String realmGet$notes = shopItem.realmGet$notes();
                if (realmGet$notes != null) {
                    long j18 = j11;
                    Table.nativeSetString(j13, aVar2.f17892g, j18, realmGet$notes, false);
                    j14 = j18;
                } else {
                    long j19 = j11;
                    j14 = j19;
                    Table.nativeSetNull(j13, aVar2.f17892g, j19, false);
                }
                String realmGet$imageName = shopItem.realmGet$imageName();
                if (realmGet$imageName != null) {
                    long j20 = j14;
                    Table.nativeSetString(j13, aVar2.f17893h, j20, realmGet$imageName, false);
                    j14 = j20;
                } else {
                    Table.nativeSetNull(j13, aVar2.f17893h, j14, false);
                }
                long j21 = j13;
                long j22 = j14;
                Table.nativeSetLong(j21, aVar2.f17894i, j22, shopItem.realmGet$value(), false);
                Table.nativeSetBoolean(j21, aVar2.f17895j, j22, shopItem.realmGet$locked(), false);
                Table.nativeSetBoolean(j21, aVar2.f17896k, j22, shopItem.realmGet$isLimited(), false);
                String realmGet$currency = shopItem.realmGet$currency();
                if (realmGet$currency != null) {
                    Table.nativeSetString(j13, aVar2.f17897l, j22, realmGet$currency, false);
                    j15 = j22;
                } else {
                    j15 = j22;
                    Table.nativeSetNull(j13, aVar2.f17897l, j22, false);
                }
                String realmGet$purchaseType = shopItem.realmGet$purchaseType();
                if (realmGet$purchaseType != null) {
                    long j23 = j15;
                    Table.nativeSetString(j13, aVar2.f17898m, j23, realmGet$purchaseType, false);
                    j15 = j23;
                } else {
                    Table.nativeSetNull(j13, aVar2.f17898m, j15, false);
                }
                String realmGet$categoryIdentifier = shopItem.realmGet$categoryIdentifier();
                if (realmGet$categoryIdentifier != null) {
                    long j24 = j15;
                    Table.nativeSetString(j13, aVar2.f17899n, j24, realmGet$categoryIdentifier, false);
                    j15 = j24;
                } else {
                    Table.nativeSetNull(j13, aVar2.f17899n, j15, false);
                }
                Integer realmGet$limitedNumberLeft = shopItem.realmGet$limitedNumberLeft();
                if (realmGet$limitedNumberLeft != null) {
                    long j25 = j15;
                    Table.nativeSetLong(j13, aVar2.f17900o, j25, realmGet$limitedNumberLeft.longValue(), false);
                    j15 = j25;
                } else {
                    Table.nativeSetNull(j13, aVar2.f17900o, j15, false);
                }
                ShopItemUnlockCondition realmGet$unlockCondition = shopItem.realmGet$unlockCondition();
                if (realmGet$unlockCondition != null) {
                    Long l10 = map.get(realmGet$unlockCondition);
                    if (l10 == null) {
                        aVar = aVar2;
                        m4.i(o0Var, c12, aVar2.f17901p, j15, realmGet$unlockCondition, map);
                    } else {
                        throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
                    }
                } else {
                    aVar = aVar2;
                    Table.nativeNullifyLink(j13, aVar.f17901p, j15);
                }
                String realmGet$path = shopItem.realmGet$path();
                if (realmGet$path != null) {
                    long j26 = j15;
                    aVar2 = aVar;
                    Table.nativeSetString(j13, aVar.f17902q, j26, realmGet$path, false);
                    j15 = j26;
                } else {
                    aVar2 = aVar;
                    Table.nativeSetNull(j13, aVar2.f17902q, j15, false);
                }
                String realmGet$unlockPath = shopItem.realmGet$unlockPath();
                if (realmGet$unlockPath != null) {
                    long j27 = j15;
                    Table.nativeSetString(j13, aVar2.f17903r, j27, realmGet$unlockPath, false);
                    j15 = j27;
                } else {
                    Table.nativeSetNull(j13, aVar2.f17903r, j15, false);
                }
                String realmGet$isSuggested = shopItem.realmGet$isSuggested();
                if (realmGet$isSuggested != null) {
                    long j28 = j15;
                    Table.nativeSetString(j13, aVar2.f17904s, j28, realmGet$isSuggested, false);
                    j15 = j28;
                } else {
                    Table.nativeSetNull(j13, aVar2.f17904s, j15, false);
                }
                String realmGet$pinType = shopItem.realmGet$pinType();
                if (realmGet$pinType != null) {
                    long j29 = j15;
                    Table.nativeSetString(j13, aVar2.f17905t, j29, realmGet$pinType, false);
                    j15 = j29;
                } else {
                    Table.nativeSetNull(j13, aVar2.f17905t, j15, false);
                }
                String realmGet$habitClass = shopItem.realmGet$habitClass();
                if (realmGet$habitClass != null) {
                    long j30 = j15;
                    Table.nativeSetString(j13, aVar2.f17906u, j30, realmGet$habitClass, false);
                    j15 = j30;
                } else {
                    Table.nativeSetNull(j13, aVar2.f17906u, j15, false);
                }
                String realmGet$previous = shopItem.realmGet$previous();
                if (realmGet$previous != null) {
                    long j31 = j15;
                    Table.nativeSetString(j13, aVar2.f17907v, j31, realmGet$previous, false);
                    j15 = j31;
                } else {
                    Table.nativeSetNull(j13, aVar2.f17907v, j15, false);
                }
                Integer realmGet$level = shopItem.realmGet$level();
                if (realmGet$level != null) {
                    long j32 = j15;
                    Table.nativeSetLong(j13, aVar2.f17908w, j32, realmGet$level.longValue(), false);
                    j15 = j32;
                } else {
                    Table.nativeSetNull(j13, aVar2.f17908w, j15, false);
                }
                ItemEvent realmGet$event = shopItem.realmGet$event();
                if (realmGet$event != null) {
                    Long l11 = map.get(realmGet$event);
                    if (l11 == null) {
                        l11 = Long.valueOf(s2.i(o0Var, realmGet$event, map));
                    }
                    long j33 = j15;
                    Table.nativeSetLink(j13, aVar2.f17909x, j33, l11.longValue(), false);
                    j15 = j33;
                } else {
                    Table.nativeNullifyLink(j13, aVar2.f17909x, j15);
                }
                OsList osList = new OsList(c12.s(j15), aVar2.f17910y);
                osList.K();
                x0<String> realmGet$setImageNames = shopItem.realmGet$setImageNames();
                if (realmGet$setImageNames != null) {
                    Iterator<String> it2 = realmGet$setImageNames.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.h();
                        } else {
                            osList.l(next);
                        }
                    }
                }
                j16 = j12;
                nativePtr = j13;
            }
        }
    }

    static k4 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(ShopItem.class), false, Collections.emptyList());
        k4 k4Var = new k4();
        cVar.a();
        return k4Var;
    }

    static ShopItem n(o0 o0Var, a aVar, ShopItem shopItem, ShopItem shopItem2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ShopItem.class), set);
        osObjectBuilder.c1(aVar.f17890e, shopItem2.realmGet$key());
        osObjectBuilder.c1(aVar.f17891f, shopItem2.realmGet$text());
        osObjectBuilder.c1(aVar.f17892g, shopItem2.realmGet$notes());
        osObjectBuilder.c1(aVar.f17893h, shopItem2.realmGet$imageName());
        osObjectBuilder.V0(aVar.f17894i, Integer.valueOf(shopItem2.realmGet$value()));
        osObjectBuilder.F0(aVar.f17895j, Boolean.valueOf(shopItem2.realmGet$locked()));
        osObjectBuilder.F0(aVar.f17896k, Boolean.valueOf(shopItem2.realmGet$isLimited()));
        osObjectBuilder.c1(aVar.f17897l, shopItem2.realmGet$currency());
        osObjectBuilder.c1(aVar.f17898m, shopItem2.realmGet$purchaseType());
        osObjectBuilder.c1(aVar.f17899n, shopItem2.realmGet$categoryIdentifier());
        osObjectBuilder.V0(aVar.f17900o, shopItem2.realmGet$limitedNumberLeft());
        ShopItemUnlockCondition realmGet$unlockCondition = shopItem2.realmGet$unlockCondition();
        if (realmGet$unlockCondition == null) {
            osObjectBuilder.Z0(aVar.f17901p);
        } else if (((ShopItemUnlockCondition) map.get(realmGet$unlockCondition)) == null) {
            m4 k10 = m4.k(o0Var, o0Var.c1(ShopItemUnlockCondition.class).s(((io.realm.internal.o) shopItem).b().g().createEmbeddedObject(aVar.f17901p, RealmFieldType.OBJECT)));
            map.put(realmGet$unlockCondition, k10);
            m4.n(o0Var, realmGet$unlockCondition, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheunlockCondition.toString()");
        }
        osObjectBuilder.c1(aVar.f17902q, shopItem2.realmGet$path());
        osObjectBuilder.c1(aVar.f17903r, shopItem2.realmGet$unlockPath());
        osObjectBuilder.c1(aVar.f17904s, shopItem2.realmGet$isSuggested());
        osObjectBuilder.c1(aVar.f17905t, shopItem2.realmGet$pinType());
        osObjectBuilder.c1(aVar.f17906u, shopItem2.realmGet$habitClass());
        osObjectBuilder.c1(aVar.f17907v, shopItem2.realmGet$previous());
        osObjectBuilder.V0(aVar.f17908w, shopItem2.realmGet$level());
        ItemEvent realmGet$event = shopItem2.realmGet$event();
        if (realmGet$event == null) {
            osObjectBuilder.Z0(aVar.f17909x);
        } else {
            ItemEvent itemEvent = (ItemEvent) map.get(realmGet$event);
            if (itemEvent != null) {
                osObjectBuilder.a1(aVar.f17909x, itemEvent);
            } else {
                osObjectBuilder.a1(aVar.f17909x, s2.d(o0Var, (s2.a) o0Var.R().e(ItemEvent.class), realmGet$event, true, map, set));
            }
        }
        osObjectBuilder.d1(aVar.f17910y, shopItem2.realmGet$setImageNames());
        osObjectBuilder.g1();
        return shopItem;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17888q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17887p = (a) cVar.c();
        l0<ShopItem> l0Var = new l0<>(this);
        this.f17888q = l0Var;
        l0Var.r(cVar.e());
        this.f17888q.s(cVar.f());
        this.f17888q.o(cVar.b());
        this.f17888q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17888q;
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public String realmGet$categoryIdentifier() {
        this.f17888q.f().e();
        return this.f17888q.g().getString(this.f17887p.f17899n);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public String realmGet$currency() {
        this.f17888q.f().e();
        return this.f17888q.g().getString(this.f17887p.f17897l);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public ItemEvent realmGet$event() {
        this.f17888q.f().e();
        if (this.f17888q.g().isNullLink(this.f17887p.f17909x)) {
            return null;
        }
        return (ItemEvent) this.f17888q.f().B(ItemEvent.class, this.f17888q.g().getLink(this.f17887p.f17909x), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public String realmGet$habitClass() {
        this.f17888q.f().e();
        return this.f17888q.g().getString(this.f17887p.f17906u);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public String realmGet$imageName() {
        this.f17888q.f().e();
        return this.f17888q.g().getString(this.f17887p.f17893h);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public boolean realmGet$isLimited() {
        this.f17888q.f().e();
        return this.f17888q.g().getBoolean(this.f17887p.f17896k);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public String realmGet$isSuggested() {
        this.f17888q.f().e();
        return this.f17888q.g().getString(this.f17887p.f17904s);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public String realmGet$key() {
        this.f17888q.f().e();
        return this.f17888q.g().getString(this.f17887p.f17890e);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public Integer realmGet$level() {
        this.f17888q.f().e();
        if (this.f17888q.g().isNull(this.f17887p.f17908w)) {
            return null;
        }
        return Integer.valueOf((int) this.f17888q.g().getLong(this.f17887p.f17908w));
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public Integer realmGet$limitedNumberLeft() {
        this.f17888q.f().e();
        if (this.f17888q.g().isNull(this.f17887p.f17900o)) {
            return null;
        }
        return Integer.valueOf((int) this.f17888q.g().getLong(this.f17887p.f17900o));
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public boolean realmGet$locked() {
        this.f17888q.f().e();
        return this.f17888q.g().getBoolean(this.f17887p.f17895j);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public String realmGet$notes() {
        this.f17888q.f().e();
        return this.f17888q.g().getString(this.f17887p.f17892g);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public String realmGet$path() {
        this.f17888q.f().e();
        return this.f17888q.g().getString(this.f17887p.f17902q);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public String realmGet$pinType() {
        this.f17888q.f().e();
        return this.f17888q.g().getString(this.f17887p.f17905t);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public String realmGet$previous() {
        this.f17888q.f().e();
        return this.f17888q.g().getString(this.f17887p.f17907v);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public String realmGet$purchaseType() {
        this.f17888q.f().e();
        return this.f17888q.g().getString(this.f17887p.f17898m);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public x0<String> realmGet$setImageNames() {
        this.f17888q.f().e();
        x0<String> x0Var = this.f17889r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<String> x0Var2 = new x0<>(String.class, this.f17888q.g().getValueList(this.f17887p.f17910y, RealmFieldType.STRING_LIST), this.f17888q.f());
        this.f17889r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public String realmGet$text() {
        this.f17888q.f().e();
        return this.f17888q.g().getString(this.f17887p.f17891f);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public ShopItemUnlockCondition realmGet$unlockCondition() {
        this.f17888q.f().e();
        if (this.f17888q.g().isNullLink(this.f17887p.f17901p)) {
            return null;
        }
        return (ShopItemUnlockCondition) this.f17888q.f().B(ShopItemUnlockCondition.class, this.f17888q.g().getLink(this.f17887p.f17901p), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public String realmGet$unlockPath() {
        this.f17888q.f().e();
        return this.f17888q.g().getString(this.f17887p.f17903r);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public int realmGet$value() {
        this.f17888q.f().e();
        return (int) this.f17888q.g().getLong(this.f17887p.f17894i);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$categoryIdentifier(String str) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (str != null) {
                g10.getTable().G(this.f17887p.f17899n, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'categoryIdentifier' to null.");
        }
        this.f17888q.f().e();
        if (str != null) {
            this.f17888q.g().setString(this.f17887p.f17899n, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'categoryIdentifier' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$currency(String str) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (str == null) {
                g10.getTable().F(this.f17887p.f17897l, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17887p.f17897l, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17888q.f().e();
        if (str == null) {
            this.f17888q.g().setNull(this.f17887p.f17897l);
        } else {
            this.f17888q.g().setString(this.f17887p.f17897l, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$event(ItemEvent itemEvent) {
        o0 o0Var = (o0) this.f17888q.f();
        if (this.f17888q.i()) {
            if (!this.f17888q.d() || this.f17888q.e().contains("event")) {
                return;
            }
            if (itemEvent != null && !d1.isManaged(itemEvent)) {
                itemEvent = (ItemEvent) o0Var.D0(itemEvent, new v[0]);
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (itemEvent == null) {
                g10.nullifyLink(this.f17887p.f17909x);
                return;
            }
            this.f17888q.c(itemEvent);
            g10.getTable().D(this.f17887p.f17909x, g10.getObjectKey(), ((io.realm.internal.o) itemEvent).b().g().getObjectKey(), true);
            return;
        }
        this.f17888q.f().e();
        if (itemEvent == null) {
            this.f17888q.g().nullifyLink(this.f17887p.f17909x);
            return;
        }
        this.f17888q.c(itemEvent);
        this.f17888q.g().setLink(this.f17887p.f17909x, ((io.realm.internal.o) itemEvent).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$habitClass(String str) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (str == null) {
                g10.getTable().F(this.f17887p.f17906u, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17887p.f17906u, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17888q.f().e();
        if (str == null) {
            this.f17888q.g().setNull(this.f17887p.f17906u);
        } else {
            this.f17888q.g().setString(this.f17887p.f17906u, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$imageName(String str) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (str == null) {
                g10.getTable().F(this.f17887p.f17893h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17887p.f17893h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17888q.f().e();
        if (str == null) {
            this.f17888q.g().setNull(this.f17887p.f17893h);
        } else {
            this.f17888q.g().setString(this.f17887p.f17893h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$isLimited(boolean z10) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            g10.getTable().z(this.f17887p.f17896k, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17888q.f().e();
        this.f17888q.g().setBoolean(this.f17887p.f17896k, z10);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$isSuggested(String str) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (str == null) {
                g10.getTable().F(this.f17887p.f17904s, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17887p.f17904s, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17888q.f().e();
        if (str == null) {
            this.f17888q.g().setNull(this.f17887p.f17904s);
        } else {
            this.f17888q.g().setString(this.f17887p.f17904s, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$key(String str) {
        if (this.f17888q.i()) {
            return;
        }
        this.f17888q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$level(Integer num) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (num == null) {
                g10.getTable().F(this.f17887p.f17908w, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f17887p.f17908w, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f17888q.f().e();
        if (num == null) {
            this.f17888q.g().setNull(this.f17887p.f17908w);
        } else {
            this.f17888q.g().setLong(this.f17887p.f17908w, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$limitedNumberLeft(Integer num) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (num == null) {
                g10.getTable().F(this.f17887p.f17900o, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f17887p.f17900o, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f17888q.f().e();
        if (num == null) {
            this.f17888q.g().setNull(this.f17887p.f17900o);
        } else {
            this.f17888q.g().setLong(this.f17887p.f17900o, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$locked(boolean z10) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            g10.getTable().z(this.f17887p.f17895j, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17888q.f().e();
        this.f17888q.g().setBoolean(this.f17887p.f17895j, z10);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$notes(String str) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (str == null) {
                g10.getTable().F(this.f17887p.f17892g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17887p.f17892g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17888q.f().e();
        if (str == null) {
            this.f17888q.g().setNull(this.f17887p.f17892g);
        } else {
            this.f17888q.g().setString(this.f17887p.f17892g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$path(String str) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (str == null) {
                g10.getTable().F(this.f17887p.f17902q, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17887p.f17902q, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17888q.f().e();
        if (str == null) {
            this.f17888q.g().setNull(this.f17887p.f17902q);
        } else {
            this.f17888q.g().setString(this.f17887p.f17902q, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$pinType(String str) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (str == null) {
                g10.getTable().F(this.f17887p.f17905t, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17887p.f17905t, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17888q.f().e();
        if (str == null) {
            this.f17888q.g().setNull(this.f17887p.f17905t);
        } else {
            this.f17888q.g().setString(this.f17887p.f17905t, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$previous(String str) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (str == null) {
                g10.getTable().F(this.f17887p.f17907v, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17887p.f17907v, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17888q.f().e();
        if (str == null) {
            this.f17888q.g().setNull(this.f17887p.f17907v);
        } else {
            this.f17888q.g().setString(this.f17887p.f17907v, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$purchaseType(String str) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (str != null) {
                g10.getTable().G(this.f17887p.f17898m, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'purchaseType' to null.");
        }
        this.f17888q.f().e();
        if (str != null) {
            this.f17888q.g().setString(this.f17887p.f17898m, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'purchaseType' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$setImageNames(x0<String> x0Var) {
        if (this.f17888q.i() && (!this.f17888q.d() || this.f17888q.e().contains("setImageNames"))) {
            return;
        }
        this.f17888q.f().e();
        OsList valueList = this.f17888q.g().getValueList(this.f17887p.f17910y, RealmFieldType.STRING_LIST);
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

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$text(String str) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (str == null) {
                g10.getTable().F(this.f17887p.f17891f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17887p.f17891f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17888q.f().e();
        if (str == null) {
            this.f17888q.g().setNull(this.f17887p.f17891f);
        } else {
            this.f17888q.g().setString(this.f17887p.f17891f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$unlockCondition(ShopItemUnlockCondition shopItemUnlockCondition) {
        o0 o0Var = (o0) this.f17888q.f();
        if (this.f17888q.i()) {
            if (!this.f17888q.d() || this.f17888q.e().contains("unlockCondition")) {
                return;
            }
            if (shopItemUnlockCondition != null && !d1.isManaged(shopItemUnlockCondition)) {
                ShopItemUnlockCondition shopItemUnlockCondition2 = (ShopItemUnlockCondition) o0Var.J0(ShopItemUnlockCondition.class, this, "unlockCondition");
                m4.n(o0Var, shopItemUnlockCondition, shopItemUnlockCondition2, new HashMap(), Collections.EMPTY_SET);
                shopItemUnlockCondition = shopItemUnlockCondition2;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (shopItemUnlockCondition == null) {
                g10.nullifyLink(this.f17887p.f17901p);
                return;
            }
            this.f17888q.c(shopItemUnlockCondition);
            g10.getTable().D(this.f17887p.f17901p, g10.getObjectKey(), ((io.realm.internal.o) shopItemUnlockCondition).b().g().getObjectKey(), true);
            return;
        }
        this.f17888q.f().e();
        if (shopItemUnlockCondition == null) {
            this.f17888q.g().nullifyLink(this.f17887p.f17901p);
            return;
        }
        if (d1.isManaged(shopItemUnlockCondition)) {
            this.f17888q.c(shopItemUnlockCondition);
        }
        m4.n(o0Var, shopItemUnlockCondition, (ShopItemUnlockCondition) o0Var.J0(ShopItemUnlockCondition.class, this, "unlockCondition"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$unlockPath(String str) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            if (str == null) {
                g10.getTable().F(this.f17887p.f17903r, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17887p.f17903r, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17888q.f().e();
        if (str == null) {
            this.f17888q.g().setNull(this.f17887p.f17903r);
        } else {
            this.f17888q.g().setString(this.f17887p.f17903r, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.shops.ShopItem, io.realm.l4
    public void realmSet$value(int i10) {
        if (this.f17888q.i()) {
            if (!this.f17888q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17888q.g();
            g10.getTable().E(this.f17887p.f17894i, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17888q.f().e();
        this.f17888q.g().setLong(this.f17887p.f17894i, i10);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Integer num2;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("ShopItem = proxy[");
        sb2.append("{key:");
        sb2.append(realmGet$key());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{text:");
        String str12 = "null";
        if (realmGet$text() == null) {
            str = "null";
        } else {
            str = realmGet$text();
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
        sb2.append("{imageName:");
        if (realmGet$imageName() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$imageName();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{value:");
        sb2.append(realmGet$value());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{locked:");
        sb2.append(realmGet$locked());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{isLimited:");
        sb2.append(realmGet$isLimited());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{currency:");
        if (realmGet$currency() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$currency();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{purchaseType:");
        sb2.append(realmGet$purchaseType());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{categoryIdentifier:");
        sb2.append(realmGet$categoryIdentifier());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{limitedNumberLeft:");
        if (realmGet$limitedNumberLeft() == null) {
            num = "null";
        } else {
            num = realmGet$limitedNumberLeft();
        }
        sb2.append(num);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{unlockCondition:");
        if (realmGet$unlockCondition() == null) {
            str5 = "null";
        } else {
            str5 = "ShopItemUnlockCondition";
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{path:");
        if (realmGet$path() == null) {
            str6 = "null";
        } else {
            str6 = realmGet$path();
        }
        sb2.append(str6);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{unlockPath:");
        if (realmGet$unlockPath() == null) {
            str7 = "null";
        } else {
            str7 = realmGet$unlockPath();
        }
        sb2.append(str7);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{isSuggested:");
        if (realmGet$isSuggested() == null) {
            str8 = "null";
        } else {
            str8 = realmGet$isSuggested();
        }
        sb2.append(str8);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{pinType:");
        if (realmGet$pinType() == null) {
            str9 = "null";
        } else {
            str9 = realmGet$pinType();
        }
        sb2.append(str9);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{habitClass:");
        if (realmGet$habitClass() == null) {
            str10 = "null";
        } else {
            str10 = realmGet$habitClass();
        }
        sb2.append(str10);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{previous:");
        if (realmGet$previous() == null) {
            str11 = "null";
        } else {
            str11 = realmGet$previous();
        }
        sb2.append(str11);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{level:");
        if (realmGet$level() == null) {
            num2 = "null";
        } else {
            num2 = realmGet$level();
        }
        sb2.append(num2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{event:");
        if (realmGet$event() != null) {
            str12 = "ItemEvent";
        }
        sb2.append(str12);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{setImageNames:");
        sb2.append("RealmList<String>[");
        sb2.append(realmGet$setImageNames().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
