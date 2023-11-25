package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.inventory.Egg;
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

/* compiled from: com_habitrpg_android_habitica_models_inventory_EggRealmProxy.java */
/* loaded from: classes4.dex */
public class k2 extends Egg implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17867r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17868p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Egg> f17869q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_EggRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17870e;

        /* renamed from: f  reason: collision with root package name */
        long f17871f;

        /* renamed from: g  reason: collision with root package name */
        long f17872g;

        /* renamed from: h  reason: collision with root package name */
        long f17873h;

        /* renamed from: i  reason: collision with root package name */
        long f17874i;

        /* renamed from: j  reason: collision with root package name */
        long f17875j;

        /* renamed from: k  reason: collision with root package name */
        long f17876k;

        a(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Egg");
            this.f17870e = a("key", "key", b10);
            this.f17871f = a("text", "text", b10);
            this.f17872g = a("notes", "notes", b10);
            this.f17873h = a(AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.VALUE, b10);
            this.f17874i = a("adjective", "adjective", b10);
            this.f17875j = a("mountText", "mountText", b10);
            this.f17876k = a("event", "event", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17870e = aVar.f17870e;
            aVar2.f17871f = aVar.f17871f;
            aVar2.f17872g = aVar.f17872g;
            aVar2.f17873h = aVar.f17873h;
            aVar2.f17874i = aVar.f17874i;
            aVar2.f17875j = aVar.f17875j;
            aVar2.f17876k = aVar.f17876k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k2() {
        this.f17869q.p();
    }

    public static Egg c(o0 o0Var, a aVar, Egg egg, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(egg);
        if (oVar != null) {
            return (Egg) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Egg.class), set);
        osObjectBuilder.c1(aVar.f17870e, egg.realmGet$key());
        osObjectBuilder.c1(aVar.f17871f, egg.realmGet$text());
        osObjectBuilder.c1(aVar.f17872g, egg.realmGet$notes());
        osObjectBuilder.V0(aVar.f17873h, Integer.valueOf(egg.realmGet$value()));
        osObjectBuilder.c1(aVar.f17874i, egg.realmGet$adjective());
        osObjectBuilder.c1(aVar.f17875j, egg.realmGet$mountText());
        k2 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(egg, l10);
        ItemEvent realmGet$event = egg.realmGet$event();
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
    public static com.habitrpg.android.habitica.models.inventory.Egg d(io.realm.o0 r8, io.realm.k2.a r9, com.habitrpg.android.habitica.models.inventory.Egg r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.Egg r1 = (com.habitrpg.android.habitica.models.inventory.Egg) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.Egg> r2 = com.habitrpg.android.habitica.models.inventory.Egg.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17870e
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
            io.realm.k2 r1 = new io.realm.k2     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.inventory.Egg r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.inventory.Egg r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.k2.d(io.realm.o0, io.realm.k2$a, com.habitrpg.android.habitica.models.inventory.Egg, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.Egg");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Egg f(Egg egg, int i10, int i11, Map<a1, o.a<a1>> map) {
        Egg egg2;
        if (i10 <= i11 && egg != null) {
            o.a<a1> aVar = map.get(egg);
            if (aVar == null) {
                egg2 = new Egg();
                map.put(egg, new o.a<>(i10, egg2));
            } else if (i10 >= aVar.f17831a) {
                return (Egg) aVar.f17832b;
            } else {
                Egg egg3 = (Egg) aVar.f17832b;
                aVar.f17831a = i10;
                egg2 = egg3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) egg).b().f();
            egg2.realmSet$key(egg.realmGet$key());
            egg2.realmSet$text(egg.realmGet$text());
            egg2.realmSet$notes(egg.realmGet$notes());
            egg2.realmSet$value(egg.realmGet$value());
            egg2.realmSet$adjective(egg.realmGet$adjective());
            egg2.realmSet$mountText(egg.realmGet$mountText());
            egg2.realmSet$event(s2.f(egg.realmGet$event(), i10 + 1, i11, map));
            return egg2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Egg", false, 7, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, true, false, true);
        bVar.b("", "text", realmFieldType, false, false, true);
        bVar.b("", "notes", realmFieldType, false, false, false);
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.VALUE, RealmFieldType.INTEGER, false, false, true);
        bVar.b("", "adjective", realmFieldType, false, false, false);
        bVar.b("", "mountText", realmFieldType, false, false, false);
        bVar.a("", "event", RealmFieldType.OBJECT, "ItemEvent");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17867r;
    }

    public static long i(o0 o0Var, Egg egg, Map<a1, Long> map) {
        long j10;
        if ((egg instanceof io.realm.internal.o) && !d1.isFrozen(egg)) {
            io.realm.internal.o oVar = (io.realm.internal.o) egg;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Egg.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Egg.class);
        long j11 = aVar.f17870e;
        String realmGet$key = egg.realmGet$key();
        if (realmGet$key != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j11, realmGet$key);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$key);
        }
        long j12 = j10;
        map.put(egg, Long.valueOf(j12));
        String realmGet$text = egg.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar.f17871f, j12, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17871f, j12, false);
        }
        String realmGet$notes = egg.realmGet$notes();
        if (realmGet$notes != null) {
            Table.nativeSetString(nativePtr, aVar.f17872g, j12, realmGet$notes, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17872g, j12, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f17873h, j12, egg.realmGet$value(), false);
        String realmGet$adjective = egg.realmGet$adjective();
        if (realmGet$adjective != null) {
            Table.nativeSetString(nativePtr, aVar.f17874i, j12, realmGet$adjective, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17874i, j12, false);
        }
        String realmGet$mountText = egg.realmGet$mountText();
        if (realmGet$mountText != null) {
            Table.nativeSetString(nativePtr, aVar.f17875j, j12, realmGet$mountText, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17875j, j12, false);
        }
        ItemEvent realmGet$event = egg.realmGet$event();
        if (realmGet$event != null) {
            Long l10 = map.get(realmGet$event);
            if (l10 == null) {
                l10 = Long.valueOf(s2.i(o0Var, realmGet$event, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f17876k, j12, l10.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17876k, j12);
        }
        return j12;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        Table c12 = o0Var.c1(Egg.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Egg.class);
        long j13 = aVar.f17870e;
        while (it.hasNext()) {
            Egg egg = (Egg) it.next();
            if (!map.containsKey(egg)) {
                if ((egg instanceof io.realm.internal.o) && !d1.isFrozen(egg)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) egg;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(egg, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = egg.realmGet$key();
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
                map.put(egg, Long.valueOf(j11));
                String realmGet$text = egg.realmGet$text();
                if (realmGet$text != null) {
                    j12 = j13;
                    Table.nativeSetString(nativePtr, aVar.f17871f, j11, realmGet$text, false);
                } else {
                    j12 = j13;
                    Table.nativeSetNull(nativePtr, aVar.f17871f, j11, false);
                }
                String realmGet$notes = egg.realmGet$notes();
                if (realmGet$notes != null) {
                    Table.nativeSetString(nativePtr, aVar.f17872g, j11, realmGet$notes, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17872g, j11, false);
                }
                Table.nativeSetLong(nativePtr, aVar.f17873h, j11, egg.realmGet$value(), false);
                String realmGet$adjective = egg.realmGet$adjective();
                if (realmGet$adjective != null) {
                    Table.nativeSetString(nativePtr, aVar.f17874i, j11, realmGet$adjective, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17874i, j11, false);
                }
                String realmGet$mountText = egg.realmGet$mountText();
                if (realmGet$mountText != null) {
                    Table.nativeSetString(nativePtr, aVar.f17875j, j11, realmGet$mountText, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17875j, j11, false);
                }
                ItemEvent realmGet$event = egg.realmGet$event();
                if (realmGet$event != null) {
                    Long l10 = map.get(realmGet$event);
                    if (l10 == null) {
                        l10 = Long.valueOf(s2.i(o0Var, realmGet$event, map));
                    }
                    Table.nativeSetLink(nativePtr, aVar.f17876k, j11, l10.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, aVar.f17876k, j11);
                }
                j13 = j12;
            }
        }
    }

    static k2 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Egg.class), false, Collections.emptyList());
        k2 k2Var = new k2();
        cVar.a();
        return k2Var;
    }

    static Egg n(o0 o0Var, a aVar, Egg egg, Egg egg2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Egg.class), set);
        osObjectBuilder.c1(aVar.f17870e, egg2.realmGet$key());
        osObjectBuilder.c1(aVar.f17871f, egg2.realmGet$text());
        osObjectBuilder.c1(aVar.f17872g, egg2.realmGet$notes());
        osObjectBuilder.V0(aVar.f17873h, Integer.valueOf(egg2.realmGet$value()));
        osObjectBuilder.c1(aVar.f17874i, egg2.realmGet$adjective());
        osObjectBuilder.c1(aVar.f17875j, egg2.realmGet$mountText());
        ItemEvent realmGet$event = egg2.realmGet$event();
        if (realmGet$event == null) {
            osObjectBuilder.Z0(aVar.f17876k);
        } else {
            ItemEvent itemEvent = (ItemEvent) map.get(realmGet$event);
            if (itemEvent != null) {
                osObjectBuilder.a1(aVar.f17876k, itemEvent);
            } else {
                osObjectBuilder.a1(aVar.f17876k, s2.d(o0Var, (s2.a) o0Var.R().e(ItemEvent.class), realmGet$event, true, map, set));
            }
        }
        osObjectBuilder.g1();
        return egg;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17869q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17868p = (a) cVar.c();
        l0<Egg> l0Var = new l0<>(this);
        this.f17869q = l0Var;
        l0Var.r(cVar.e());
        this.f17869q.s(cVar.f());
        this.f17869q.o(cVar.b());
        this.f17869q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17869q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k2 k2Var = (k2) obj;
        io.realm.a f10 = this.f17869q.f();
        io.realm.a f11 = k2Var.f17869q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17869q.g().getTable().p();
        String p11 = k2Var.f17869q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17869q.g().getObjectKey() == k2Var.f17869q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17869q.f().getPath();
        String p10 = this.f17869q.g().getTable().p();
        long objectKey = this.f17869q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.Egg, io.realm.l2
    public String realmGet$adjective() {
        this.f17869q.f().e();
        return this.f17869q.g().getString(this.f17868p.f17874i);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Egg, io.realm.l2
    public ItemEvent realmGet$event() {
        this.f17869q.f().e();
        if (this.f17869q.g().isNullLink(this.f17868p.f17876k)) {
            return null;
        }
        return (ItemEvent) this.f17869q.f().B(ItemEvent.class, this.f17869q.g().getLink(this.f17868p.f17876k), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Egg, io.realm.l2
    public String realmGet$key() {
        this.f17869q.f().e();
        return this.f17869q.g().getString(this.f17868p.f17870e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Egg, io.realm.l2
    public String realmGet$mountText() {
        this.f17869q.f().e();
        return this.f17869q.g().getString(this.f17868p.f17875j);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Egg, io.realm.l2
    public String realmGet$notes() {
        this.f17869q.f().e();
        return this.f17869q.g().getString(this.f17868p.f17872g);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Egg, io.realm.l2
    public String realmGet$text() {
        this.f17869q.f().e();
        return this.f17869q.g().getString(this.f17868p.f17871f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Egg, io.realm.l2
    public int realmGet$value() {
        this.f17869q.f().e();
        return (int) this.f17869q.g().getLong(this.f17868p.f17873h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Egg, io.realm.l2
    public void realmSet$adjective(String str) {
        if (this.f17869q.i()) {
            if (!this.f17869q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17869q.g();
            if (str == null) {
                g10.getTable().F(this.f17868p.f17874i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17868p.f17874i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17869q.f().e();
        if (str == null) {
            this.f17869q.g().setNull(this.f17868p.f17874i);
        } else {
            this.f17869q.g().setString(this.f17868p.f17874i, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Egg, io.realm.l2
    public void realmSet$event(ItemEvent itemEvent) {
        o0 o0Var = (o0) this.f17869q.f();
        if (this.f17869q.i()) {
            if (!this.f17869q.d() || this.f17869q.e().contains("event")) {
                return;
            }
            if (itemEvent != null && !d1.isManaged(itemEvent)) {
                itemEvent = (ItemEvent) o0Var.D0(itemEvent, new v[0]);
            }
            io.realm.internal.q g10 = this.f17869q.g();
            if (itemEvent == null) {
                g10.nullifyLink(this.f17868p.f17876k);
                return;
            }
            this.f17869q.c(itemEvent);
            g10.getTable().D(this.f17868p.f17876k, g10.getObjectKey(), ((io.realm.internal.o) itemEvent).b().g().getObjectKey(), true);
            return;
        }
        this.f17869q.f().e();
        if (itemEvent == null) {
            this.f17869q.g().nullifyLink(this.f17868p.f17876k);
            return;
        }
        this.f17869q.c(itemEvent);
        this.f17869q.g().setLink(this.f17868p.f17876k, ((io.realm.internal.o) itemEvent).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Egg, io.realm.l2
    public void realmSet$key(String str) {
        if (this.f17869q.i()) {
            return;
        }
        this.f17869q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Egg, io.realm.l2
    public void realmSet$mountText(String str) {
        if (this.f17869q.i()) {
            if (!this.f17869q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17869q.g();
            if (str == null) {
                g10.getTable().F(this.f17868p.f17875j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17868p.f17875j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17869q.f().e();
        if (str == null) {
            this.f17869q.g().setNull(this.f17868p.f17875j);
        } else {
            this.f17869q.g().setString(this.f17868p.f17875j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Egg, io.realm.l2
    public void realmSet$notes(String str) {
        if (this.f17869q.i()) {
            if (!this.f17869q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17869q.g();
            if (str == null) {
                g10.getTable().F(this.f17868p.f17872g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17868p.f17872g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17869q.f().e();
        if (str == null) {
            this.f17869q.g().setNull(this.f17868p.f17872g);
        } else {
            this.f17869q.g().setString(this.f17868p.f17872g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Egg, io.realm.l2
    public void realmSet$text(String str) {
        if (this.f17869q.i()) {
            if (!this.f17869q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17869q.g();
            if (str != null) {
                g10.getTable().G(this.f17868p.f17871f, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        this.f17869q.f().e();
        if (str != null) {
            this.f17869q.g().setString(this.f17868p.f17871f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Egg, io.realm.l2
    public void realmSet$value(int i10) {
        if (this.f17869q.i()) {
            if (!this.f17869q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17869q.g();
            g10.getTable().E(this.f17868p.f17873h, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17869q.f().e();
        this.f17869q.g().setLong(this.f17868p.f17873h, i10);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Egg = proxy[");
        sb2.append("{key:");
        sb2.append(realmGet$key());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{text:");
        sb2.append(realmGet$text());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{notes:");
        String str4 = "null";
        if (realmGet$notes() == null) {
            str = "null";
        } else {
            str = realmGet$notes();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{value:");
        sb2.append(realmGet$value());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{adjective:");
        if (realmGet$adjective() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$adjective();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{mountText:");
        if (realmGet$mountText() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$mountText();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{event:");
        if (realmGet$event() != null) {
            str4 = "ItemEvent";
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
