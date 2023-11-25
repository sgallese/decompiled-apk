package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
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

/* compiled from: com_habitrpg_android_habitica_models_inventory_HatchingPotionRealmProxy.java */
/* loaded from: classes4.dex */
public class q2 extends HatchingPotion implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18087r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18088p;

    /* renamed from: q  reason: collision with root package name */
    private l0<HatchingPotion> f18089q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_HatchingPotionRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18090e;

        /* renamed from: f  reason: collision with root package name */
        long f18091f;

        /* renamed from: g  reason: collision with root package name */
        long f18092g;

        /* renamed from: h  reason: collision with root package name */
        long f18093h;

        /* renamed from: i  reason: collision with root package name */
        long f18094i;

        /* renamed from: j  reason: collision with root package name */
        long f18095j;

        /* renamed from: k  reason: collision with root package name */
        long f18096k;

        a(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("HatchingPotion");
            this.f18090e = a("key", "key", b10);
            this.f18091f = a("text", "text", b10);
            this.f18092g = a("event", "event", b10);
            this.f18093h = a("notes", "notes", b10);
            this.f18094i = a(AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.VALUE, b10);
            this.f18095j = a("limited", "limited", b10);
            this.f18096k = a("premium", "premium", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18090e = aVar.f18090e;
            aVar2.f18091f = aVar.f18091f;
            aVar2.f18092g = aVar.f18092g;
            aVar2.f18093h = aVar.f18093h;
            aVar2.f18094i = aVar.f18094i;
            aVar2.f18095j = aVar.f18095j;
            aVar2.f18096k = aVar.f18096k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q2() {
        this.f18089q.p();
    }

    public static HatchingPotion c(o0 o0Var, a aVar, HatchingPotion hatchingPotion, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(hatchingPotion);
        if (oVar != null) {
            return (HatchingPotion) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(HatchingPotion.class), set);
        osObjectBuilder.c1(aVar.f18090e, hatchingPotion.realmGet$key());
        osObjectBuilder.c1(aVar.f18091f, hatchingPotion.realmGet$text());
        osObjectBuilder.c1(aVar.f18093h, hatchingPotion.realmGet$notes());
        osObjectBuilder.V0(aVar.f18094i, Integer.valueOf(hatchingPotion.realmGet$value()));
        osObjectBuilder.F0(aVar.f18095j, hatchingPotion.realmGet$limited());
        osObjectBuilder.F0(aVar.f18096k, hatchingPotion.realmGet$premium());
        q2 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(hatchingPotion, l10);
        ItemEvent realmGet$event = hatchingPotion.realmGet$event();
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
    public static com.habitrpg.android.habitica.models.inventory.HatchingPotion d(io.realm.o0 r8, io.realm.q2.a r9, com.habitrpg.android.habitica.models.inventory.HatchingPotion r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.HatchingPotion r1 = (com.habitrpg.android.habitica.models.inventory.HatchingPotion) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.HatchingPotion> r2 = com.habitrpg.android.habitica.models.inventory.HatchingPotion.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18090e
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
            io.realm.q2 r1 = new io.realm.q2     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.inventory.HatchingPotion r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.inventory.HatchingPotion r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.q2.d(io.realm.o0, io.realm.q2$a, com.habitrpg.android.habitica.models.inventory.HatchingPotion, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.HatchingPotion");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static HatchingPotion f(HatchingPotion hatchingPotion, int i10, int i11, Map<a1, o.a<a1>> map) {
        HatchingPotion hatchingPotion2;
        if (i10 <= i11 && hatchingPotion != null) {
            o.a<a1> aVar = map.get(hatchingPotion);
            if (aVar == null) {
                hatchingPotion2 = new HatchingPotion();
                map.put(hatchingPotion, new o.a<>(i10, hatchingPotion2));
            } else if (i10 >= aVar.f17831a) {
                return (HatchingPotion) aVar.f17832b;
            } else {
                HatchingPotion hatchingPotion3 = (HatchingPotion) aVar.f17832b;
                aVar.f17831a = i10;
                hatchingPotion2 = hatchingPotion3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) hatchingPotion).b().f();
            hatchingPotion2.realmSet$key(hatchingPotion.realmGet$key());
            hatchingPotion2.realmSet$text(hatchingPotion.realmGet$text());
            hatchingPotion2.realmSet$event(s2.f(hatchingPotion.realmGet$event(), i10 + 1, i11, map));
            hatchingPotion2.realmSet$notes(hatchingPotion.realmGet$notes());
            hatchingPotion2.realmSet$value(hatchingPotion.realmGet$value());
            hatchingPotion2.realmSet$limited(hatchingPotion.realmGet$limited());
            hatchingPotion2.realmSet$premium(hatchingPotion.realmGet$premium());
            return hatchingPotion2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "HatchingPotion", false, 7, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, true, false, true);
        bVar.b("", "text", realmFieldType, false, false, true);
        bVar.a("", "event", RealmFieldType.OBJECT, "ItemEvent");
        bVar.b("", "notes", realmFieldType, false, false, false);
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.VALUE, RealmFieldType.INTEGER, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.BOOLEAN;
        bVar.b("", "limited", realmFieldType2, false, false, false);
        bVar.b("", "premium", realmFieldType2, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18087r;
    }

    public static long i(o0 o0Var, HatchingPotion hatchingPotion, Map<a1, Long> map) {
        long j10;
        if ((hatchingPotion instanceof io.realm.internal.o) && !d1.isFrozen(hatchingPotion)) {
            io.realm.internal.o oVar = (io.realm.internal.o) hatchingPotion;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(HatchingPotion.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(HatchingPotion.class);
        long j11 = aVar.f18090e;
        String realmGet$key = hatchingPotion.realmGet$key();
        if (realmGet$key != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j11, realmGet$key);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$key);
        }
        long j12 = j10;
        map.put(hatchingPotion, Long.valueOf(j12));
        String realmGet$text = hatchingPotion.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar.f18091f, j12, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18091f, j12, false);
        }
        ItemEvent realmGet$event = hatchingPotion.realmGet$event();
        if (realmGet$event != null) {
            Long l10 = map.get(realmGet$event);
            if (l10 == null) {
                l10 = Long.valueOf(s2.i(o0Var, realmGet$event, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f18092g, j12, l10.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f18092g, j12);
        }
        String realmGet$notes = hatchingPotion.realmGet$notes();
        if (realmGet$notes != null) {
            Table.nativeSetString(nativePtr, aVar.f18093h, j12, realmGet$notes, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18093h, j12, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f18094i, j12, hatchingPotion.realmGet$value(), false);
        Boolean realmGet$limited = hatchingPotion.realmGet$limited();
        if (realmGet$limited != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f18095j, j12, realmGet$limited.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18095j, j12, false);
        }
        Boolean realmGet$premium = hatchingPotion.realmGet$premium();
        if (realmGet$premium != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f18096k, j12, realmGet$premium.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18096k, j12, false);
        }
        return j12;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        Table c12 = o0Var.c1(HatchingPotion.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(HatchingPotion.class);
        long j13 = aVar.f18090e;
        while (it.hasNext()) {
            HatchingPotion hatchingPotion = (HatchingPotion) it.next();
            if (!map.containsKey(hatchingPotion)) {
                if ((hatchingPotion instanceof io.realm.internal.o) && !d1.isFrozen(hatchingPotion)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) hatchingPotion;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(hatchingPotion, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = hatchingPotion.realmGet$key();
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
                map.put(hatchingPotion, Long.valueOf(j11));
                String realmGet$text = hatchingPotion.realmGet$text();
                if (realmGet$text != null) {
                    j12 = j13;
                    Table.nativeSetString(nativePtr, aVar.f18091f, j11, realmGet$text, false);
                } else {
                    j12 = j13;
                    Table.nativeSetNull(nativePtr, aVar.f18091f, j11, false);
                }
                ItemEvent realmGet$event = hatchingPotion.realmGet$event();
                if (realmGet$event != null) {
                    Long l10 = map.get(realmGet$event);
                    if (l10 == null) {
                        l10 = Long.valueOf(s2.i(o0Var, realmGet$event, map));
                    }
                    Table.nativeSetLink(nativePtr, aVar.f18092g, j11, l10.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar.f18092g, j11);
                }
                String realmGet$notes = hatchingPotion.realmGet$notes();
                if (realmGet$notes != null) {
                    Table.nativeSetString(nativePtr, aVar.f18093h, j11, realmGet$notes, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18093h, j11, false);
                }
                Table.nativeSetLong(nativePtr, aVar.f18094i, j11, hatchingPotion.realmGet$value(), false);
                Boolean realmGet$limited = hatchingPotion.realmGet$limited();
                if (realmGet$limited != null) {
                    Table.nativeSetBoolean(nativePtr, aVar.f18095j, j11, realmGet$limited.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18095j, j11, false);
                }
                Boolean realmGet$premium = hatchingPotion.realmGet$premium();
                if (realmGet$premium != null) {
                    Table.nativeSetBoolean(nativePtr, aVar.f18096k, j11, realmGet$premium.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18096k, j11, false);
                }
                j13 = j12;
            }
        }
    }

    static q2 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(HatchingPotion.class), false, Collections.emptyList());
        q2 q2Var = new q2();
        cVar.a();
        return q2Var;
    }

    static HatchingPotion n(o0 o0Var, a aVar, HatchingPotion hatchingPotion, HatchingPotion hatchingPotion2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(HatchingPotion.class), set);
        osObjectBuilder.c1(aVar.f18090e, hatchingPotion2.realmGet$key());
        osObjectBuilder.c1(aVar.f18091f, hatchingPotion2.realmGet$text());
        ItemEvent realmGet$event = hatchingPotion2.realmGet$event();
        if (realmGet$event == null) {
            osObjectBuilder.Z0(aVar.f18092g);
        } else {
            ItemEvent itemEvent = (ItemEvent) map.get(realmGet$event);
            if (itemEvent != null) {
                osObjectBuilder.a1(aVar.f18092g, itemEvent);
            } else {
                osObjectBuilder.a1(aVar.f18092g, s2.d(o0Var, (s2.a) o0Var.R().e(ItemEvent.class), realmGet$event, true, map, set));
            }
        }
        osObjectBuilder.c1(aVar.f18093h, hatchingPotion2.realmGet$notes());
        osObjectBuilder.V0(aVar.f18094i, Integer.valueOf(hatchingPotion2.realmGet$value()));
        osObjectBuilder.F0(aVar.f18095j, hatchingPotion2.realmGet$limited());
        osObjectBuilder.F0(aVar.f18096k, hatchingPotion2.realmGet$premium());
        osObjectBuilder.g1();
        return hatchingPotion;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18089q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18088p = (a) cVar.c();
        l0<HatchingPotion> l0Var = new l0<>(this);
        this.f18089q = l0Var;
        l0Var.r(cVar.e());
        this.f18089q.s(cVar.f());
        this.f18089q.o(cVar.b());
        this.f18089q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18089q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q2 q2Var = (q2) obj;
        io.realm.a f10 = this.f18089q.f();
        io.realm.a f11 = q2Var.f18089q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18089q.g().getTable().p();
        String p11 = q2Var.f18089q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18089q.g().getObjectKey() == q2Var.f18089q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18089q.f().getPath();
        String p10 = this.f18089q.g().getTable().p();
        long objectKey = this.f18089q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.HatchingPotion, io.realm.r2
    public ItemEvent realmGet$event() {
        this.f18089q.f().e();
        if (this.f18089q.g().isNullLink(this.f18088p.f18092g)) {
            return null;
        }
        return (ItemEvent) this.f18089q.f().B(ItemEvent.class, this.f18089q.g().getLink(this.f18088p.f18092g), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.HatchingPotion, io.realm.r2
    public String realmGet$key() {
        this.f18089q.f().e();
        return this.f18089q.g().getString(this.f18088p.f18090e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.HatchingPotion, io.realm.r2
    public Boolean realmGet$limited() {
        this.f18089q.f().e();
        if (this.f18089q.g().isNull(this.f18088p.f18095j)) {
            return null;
        }
        return Boolean.valueOf(this.f18089q.g().getBoolean(this.f18088p.f18095j));
    }

    @Override // com.habitrpg.android.habitica.models.inventory.HatchingPotion, io.realm.r2
    public String realmGet$notes() {
        this.f18089q.f().e();
        return this.f18089q.g().getString(this.f18088p.f18093h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.HatchingPotion, io.realm.r2
    public Boolean realmGet$premium() {
        this.f18089q.f().e();
        if (this.f18089q.g().isNull(this.f18088p.f18096k)) {
            return null;
        }
        return Boolean.valueOf(this.f18089q.g().getBoolean(this.f18088p.f18096k));
    }

    @Override // com.habitrpg.android.habitica.models.inventory.HatchingPotion, io.realm.r2
    public String realmGet$text() {
        this.f18089q.f().e();
        return this.f18089q.g().getString(this.f18088p.f18091f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.HatchingPotion, io.realm.r2
    public int realmGet$value() {
        this.f18089q.f().e();
        return (int) this.f18089q.g().getLong(this.f18088p.f18094i);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.HatchingPotion, io.realm.r2
    public void realmSet$event(ItemEvent itemEvent) {
        o0 o0Var = (o0) this.f18089q.f();
        if (this.f18089q.i()) {
            if (!this.f18089q.d() || this.f18089q.e().contains("event")) {
                return;
            }
            if (itemEvent != null && !d1.isManaged(itemEvent)) {
                itemEvent = (ItemEvent) o0Var.D0(itemEvent, new v[0]);
            }
            io.realm.internal.q g10 = this.f18089q.g();
            if (itemEvent == null) {
                g10.nullifyLink(this.f18088p.f18092g);
                return;
            }
            this.f18089q.c(itemEvent);
            g10.getTable().D(this.f18088p.f18092g, g10.getObjectKey(), ((io.realm.internal.o) itemEvent).b().g().getObjectKey(), true);
            return;
        }
        this.f18089q.f().e();
        if (itemEvent == null) {
            this.f18089q.g().nullifyLink(this.f18088p.f18092g);
            return;
        }
        this.f18089q.c(itemEvent);
        this.f18089q.g().setLink(this.f18088p.f18092g, ((io.realm.internal.o) itemEvent).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.HatchingPotion, io.realm.r2
    public void realmSet$key(String str) {
        if (this.f18089q.i()) {
            return;
        }
        this.f18089q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.HatchingPotion, io.realm.r2
    public void realmSet$limited(Boolean bool) {
        if (this.f18089q.i()) {
            if (!this.f18089q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18089q.g();
            if (bool == null) {
                g10.getTable().F(this.f18088p.f18095j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f18088p.f18095j, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f18089q.f().e();
        if (bool == null) {
            this.f18089q.g().setNull(this.f18088p.f18095j);
        } else {
            this.f18089q.g().setBoolean(this.f18088p.f18095j, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.HatchingPotion, io.realm.r2
    public void realmSet$notes(String str) {
        if (this.f18089q.i()) {
            if (!this.f18089q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18089q.g();
            if (str == null) {
                g10.getTable().F(this.f18088p.f18093h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18088p.f18093h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18089q.f().e();
        if (str == null) {
            this.f18089q.g().setNull(this.f18088p.f18093h);
        } else {
            this.f18089q.g().setString(this.f18088p.f18093h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.HatchingPotion, io.realm.r2
    public void realmSet$premium(Boolean bool) {
        if (this.f18089q.i()) {
            if (!this.f18089q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18089q.g();
            if (bool == null) {
                g10.getTable().F(this.f18088p.f18096k, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f18088p.f18096k, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f18089q.f().e();
        if (bool == null) {
            this.f18089q.g().setNull(this.f18088p.f18096k);
        } else {
            this.f18089q.g().setBoolean(this.f18088p.f18096k, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.HatchingPotion, io.realm.r2
    public void realmSet$text(String str) {
        if (this.f18089q.i()) {
            if (!this.f18089q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18089q.g();
            if (str != null) {
                g10.getTable().G(this.f18088p.f18091f, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        this.f18089q.f().e();
        if (str != null) {
            this.f18089q.g().setString(this.f18088p.f18091f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.HatchingPotion, io.realm.r2
    public void realmSet$value(int i10) {
        if (this.f18089q.i()) {
            if (!this.f18089q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18089q.g();
            g10.getTable().E(this.f18088p.f18094i, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18089q.f().e();
        this.f18089q.g().setLong(this.f18088p.f18094i, i10);
    }

    public String toString() {
        String str;
        String str2;
        Boolean bool;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("HatchingPotion = proxy[");
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
        sb2.append("{limited:");
        if (realmGet$limited() == null) {
            bool = "null";
        } else {
            bool = realmGet$limited();
        }
        sb2.append(bool);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{premium:");
        if (realmGet$premium() != null) {
            obj = realmGet$premium();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
