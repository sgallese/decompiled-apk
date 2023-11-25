package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.inventory.Equipment;
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
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_inventory_EquipmentRealmProxy.java */
/* loaded from: classes4.dex */
public class m2 extends Equipment implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17945r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17946p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Equipment> f17947q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_EquipmentRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17948e;

        /* renamed from: f  reason: collision with root package name */
        long f17949f;

        /* renamed from: g  reason: collision with root package name */
        long f17950g;

        /* renamed from: h  reason: collision with root package name */
        long f17951h;

        /* renamed from: i  reason: collision with root package name */
        long f17952i;

        /* renamed from: j  reason: collision with root package name */
        long f17953j;

        /* renamed from: k  reason: collision with root package name */
        long f17954k;

        /* renamed from: l  reason: collision with root package name */
        long f17955l;

        /* renamed from: m  reason: collision with root package name */
        long f17956m;

        /* renamed from: n  reason: collision with root package name */
        long f17957n;

        /* renamed from: o  reason: collision with root package name */
        long f17958o;

        /* renamed from: p  reason: collision with root package name */
        long f17959p;

        /* renamed from: q  reason: collision with root package name */
        long f17960q;

        /* renamed from: r  reason: collision with root package name */
        long f17961r;

        /* renamed from: s  reason: collision with root package name */
        long f17962s;

        /* renamed from: t  reason: collision with root package name */
        long f17963t;

        a(OsSchemaInfo osSchemaInfo) {
            super(16);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Equipment");
            this.f17948e = a(AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.VALUE, b10);
            this.f17949f = a(TaskFormActivity.TASK_TYPE_KEY, TaskFormActivity.TASK_TYPE_KEY, b10);
            this.f17950g = a("key", "key", b10);
            this.f17951h = a("klass", "klass", b10);
            this.f17952i = a("specialClass", "specialClass", b10);
            this.f17953j = a("index", "index", b10);
            this.f17954k = a("text", "text", b10);
            this.f17955l = a("notes", "notes", b10);
            this.f17956m = a("con", "con", b10);
            this.f17957n = a("str", "str", b10);
            this.f17958o = a("per", "per", b10);
            this.f17959p = a("_int", "_int", b10);
            this.f17960q = a("owned", "owned", b10);
            this.f17961r = a("twoHanded", "twoHanded", b10);
            this.f17962s = a("mystery", "mystery", b10);
            this.f17963t = a("gearSet", "gearSet", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17948e = aVar.f17948e;
            aVar2.f17949f = aVar.f17949f;
            aVar2.f17950g = aVar.f17950g;
            aVar2.f17951h = aVar.f17951h;
            aVar2.f17952i = aVar.f17952i;
            aVar2.f17953j = aVar.f17953j;
            aVar2.f17954k = aVar.f17954k;
            aVar2.f17955l = aVar.f17955l;
            aVar2.f17956m = aVar.f17956m;
            aVar2.f17957n = aVar.f17957n;
            aVar2.f17958o = aVar.f17958o;
            aVar2.f17959p = aVar.f17959p;
            aVar2.f17960q = aVar.f17960q;
            aVar2.f17961r = aVar.f17961r;
            aVar2.f17962s = aVar.f17962s;
            aVar2.f17963t = aVar.f17963t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m2() {
        this.f17947q.p();
    }

    public static Equipment c(o0 o0Var, a aVar, Equipment equipment, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(equipment);
        if (oVar != null) {
            return (Equipment) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Equipment.class), set);
        osObjectBuilder.N0(aVar.f17948e, Double.valueOf(equipment.realmGet$value()));
        osObjectBuilder.c1(aVar.f17949f, equipment.realmGet$type());
        osObjectBuilder.c1(aVar.f17950g, equipment.realmGet$key());
        osObjectBuilder.c1(aVar.f17951h, equipment.realmGet$klass());
        osObjectBuilder.c1(aVar.f17952i, equipment.realmGet$specialClass());
        osObjectBuilder.c1(aVar.f17953j, equipment.realmGet$index());
        osObjectBuilder.c1(aVar.f17954k, equipment.realmGet$text());
        osObjectBuilder.c1(aVar.f17955l, equipment.realmGet$notes());
        osObjectBuilder.V0(aVar.f17956m, Integer.valueOf(equipment.realmGet$con()));
        osObjectBuilder.V0(aVar.f17957n, Integer.valueOf(equipment.realmGet$str()));
        osObjectBuilder.V0(aVar.f17958o, Integer.valueOf(equipment.realmGet$per()));
        osObjectBuilder.V0(aVar.f17959p, Integer.valueOf(equipment.realmGet$_int()));
        osObjectBuilder.F0(aVar.f17960q, equipment.realmGet$owned());
        osObjectBuilder.F0(aVar.f17961r, Boolean.valueOf(equipment.realmGet$twoHanded()));
        osObjectBuilder.c1(aVar.f17962s, equipment.realmGet$mystery());
        osObjectBuilder.c1(aVar.f17963t, equipment.realmGet$gearSet());
        m2 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(equipment, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.inventory.Equipment d(io.realm.o0 r8, io.realm.m2.a r9, com.habitrpg.android.habitica.models.inventory.Equipment r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.Equipment r1 = (com.habitrpg.android.habitica.models.inventory.Equipment) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.Equipment> r2 = com.habitrpg.android.habitica.models.inventory.Equipment.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17950g
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
            io.realm.m2 r1 = new io.realm.m2     // Catch: java.lang.Throwable -> L8e
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
            com.habitrpg.android.habitica.models.inventory.Equipment r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.inventory.Equipment r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.m2.d(io.realm.o0, io.realm.m2$a, com.habitrpg.android.habitica.models.inventory.Equipment, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.Equipment");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Equipment f(Equipment equipment, int i10, int i11, Map<a1, o.a<a1>> map) {
        Equipment equipment2;
        if (i10 <= i11 && equipment != null) {
            o.a<a1> aVar = map.get(equipment);
            if (aVar == null) {
                equipment2 = new Equipment();
                map.put(equipment, new o.a<>(i10, equipment2));
            } else if (i10 >= aVar.f17831a) {
                return (Equipment) aVar.f17832b;
            } else {
                Equipment equipment3 = (Equipment) aVar.f17832b;
                aVar.f17831a = i10;
                equipment2 = equipment3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) equipment).b().f();
            equipment2.realmSet$value(equipment.realmGet$value());
            equipment2.realmSet$type(equipment.realmGet$type());
            equipment2.realmSet$key(equipment.realmGet$key());
            equipment2.realmSet$klass(equipment.realmGet$klass());
            equipment2.realmSet$specialClass(equipment.realmGet$specialClass());
            equipment2.realmSet$index(equipment.realmGet$index());
            equipment2.realmSet$text(equipment.realmGet$text());
            equipment2.realmSet$notes(equipment.realmGet$notes());
            equipment2.realmSet$con(equipment.realmGet$con());
            equipment2.realmSet$str(equipment.realmGet$str());
            equipment2.realmSet$per(equipment.realmGet$per());
            equipment2.realmSet$_int(equipment.realmGet$_int());
            equipment2.realmSet$owned(equipment.realmGet$owned());
            equipment2.realmSet$twoHanded(equipment.realmGet$twoHanded());
            equipment2.realmSet$mystery(equipment.realmGet$mystery());
            equipment2.realmSet$gearSet(equipment.realmGet$gearSet());
            return equipment2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Equipment", false, 16, 0);
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.VALUE, RealmFieldType.DOUBLE, false, false, true);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", TaskFormActivity.TASK_TYPE_KEY, realmFieldType, false, false, false);
        bVar.b("", "key", realmFieldType, true, false, false);
        bVar.b("", "klass", realmFieldType, false, false, true);
        bVar.b("", "specialClass", realmFieldType, false, false, true);
        bVar.b("", "index", realmFieldType, false, false, true);
        bVar.b("", "text", realmFieldType, false, false, true);
        bVar.b("", "notes", realmFieldType, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "con", realmFieldType2, false, false, true);
        bVar.b("", "str", realmFieldType2, false, false, true);
        bVar.b("", "per", realmFieldType2, false, false, true);
        bVar.b("", "_int", realmFieldType2, false, false, true);
        RealmFieldType realmFieldType3 = RealmFieldType.BOOLEAN;
        bVar.b("", "owned", realmFieldType3, false, false, false);
        bVar.b("", "twoHanded", realmFieldType3, false, false, true);
        bVar.b("", "mystery", realmFieldType, false, false, true);
        bVar.b("", "gearSet", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17945r;
    }

    public static long i(o0 o0Var, Equipment equipment, Map<a1, Long> map) {
        long nativeFindFirstString;
        if ((equipment instanceof io.realm.internal.o) && !d1.isFrozen(equipment)) {
            io.realm.internal.o oVar = (io.realm.internal.o) equipment;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Equipment.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Equipment.class);
        long j10 = aVar.f17950g;
        String realmGet$key = equipment.realmGet$key();
        if (realmGet$key == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j10);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j10, realmGet$key);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j10, realmGet$key);
        }
        long j11 = nativeFindFirstString;
        map.put(equipment, Long.valueOf(j11));
        Table.nativeSetDouble(nativePtr, aVar.f17948e, j11, equipment.realmGet$value(), false);
        String realmGet$type = equipment.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, aVar.f17949f, j11, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17949f, j11, false);
        }
        String realmGet$klass = equipment.realmGet$klass();
        if (realmGet$klass != null) {
            Table.nativeSetString(nativePtr, aVar.f17951h, j11, realmGet$klass, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17951h, j11, false);
        }
        String realmGet$specialClass = equipment.realmGet$specialClass();
        if (realmGet$specialClass != null) {
            Table.nativeSetString(nativePtr, aVar.f17952i, j11, realmGet$specialClass, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17952i, j11, false);
        }
        String realmGet$index = equipment.realmGet$index();
        if (realmGet$index != null) {
            Table.nativeSetString(nativePtr, aVar.f17953j, j11, realmGet$index, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17953j, j11, false);
        }
        String realmGet$text = equipment.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar.f17954k, j11, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17954k, j11, false);
        }
        String realmGet$notes = equipment.realmGet$notes();
        if (realmGet$notes != null) {
            Table.nativeSetString(nativePtr, aVar.f17955l, j11, realmGet$notes, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17955l, j11, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f17956m, j11, equipment.realmGet$con(), false);
        Table.nativeSetLong(nativePtr, aVar.f17957n, j11, equipment.realmGet$str(), false);
        Table.nativeSetLong(nativePtr, aVar.f17958o, j11, equipment.realmGet$per(), false);
        Table.nativeSetLong(nativePtr, aVar.f17959p, j11, equipment.realmGet$_int(), false);
        Boolean realmGet$owned = equipment.realmGet$owned();
        if (realmGet$owned != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f17960q, j11, realmGet$owned.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17960q, j11, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f17961r, j11, equipment.realmGet$twoHanded(), false);
        String realmGet$mystery = equipment.realmGet$mystery();
        if (realmGet$mystery != null) {
            Table.nativeSetString(nativePtr, aVar.f17962s, j11, realmGet$mystery, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17962s, j11, false);
        }
        String realmGet$gearSet = equipment.realmGet$gearSet();
        if (realmGet$gearSet != null) {
            Table.nativeSetString(nativePtr, aVar.f17963t, j11, realmGet$gearSet, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17963t, j11, false);
        }
        return j11;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        Table c12 = o0Var.c1(Equipment.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Equipment.class);
        long j11 = aVar.f17950g;
        while (it.hasNext()) {
            Equipment equipment = (Equipment) it.next();
            if (!map.containsKey(equipment)) {
                if ((equipment instanceof io.realm.internal.o) && !d1.isFrozen(equipment)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) equipment;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(equipment, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = equipment.realmGet$key();
                if (realmGet$key == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j11);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j11, realmGet$key);
                }
                if (nativeFindFirstString == -1) {
                    j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$key);
                } else {
                    j10 = nativeFindFirstString;
                }
                map.put(equipment, Long.valueOf(j10));
                long j12 = j11;
                Table.nativeSetDouble(nativePtr, aVar.f17948e, j10, equipment.realmGet$value(), false);
                String realmGet$type = equipment.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, aVar.f17949f, j10, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17949f, j10, false);
                }
                String realmGet$klass = equipment.realmGet$klass();
                if (realmGet$klass != null) {
                    Table.nativeSetString(nativePtr, aVar.f17951h, j10, realmGet$klass, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17951h, j10, false);
                }
                String realmGet$specialClass = equipment.realmGet$specialClass();
                if (realmGet$specialClass != null) {
                    Table.nativeSetString(nativePtr, aVar.f17952i, j10, realmGet$specialClass, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17952i, j10, false);
                }
                String realmGet$index = equipment.realmGet$index();
                if (realmGet$index != null) {
                    Table.nativeSetString(nativePtr, aVar.f17953j, j10, realmGet$index, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17953j, j10, false);
                }
                String realmGet$text = equipment.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, aVar.f17954k, j10, realmGet$text, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17954k, j10, false);
                }
                String realmGet$notes = equipment.realmGet$notes();
                if (realmGet$notes != null) {
                    Table.nativeSetString(nativePtr, aVar.f17955l, j10, realmGet$notes, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17955l, j10, false);
                }
                long j13 = j10;
                Table.nativeSetLong(nativePtr, aVar.f17956m, j13, equipment.realmGet$con(), false);
                Table.nativeSetLong(nativePtr, aVar.f17957n, j13, equipment.realmGet$str(), false);
                Table.nativeSetLong(nativePtr, aVar.f17958o, j13, equipment.realmGet$per(), false);
                Table.nativeSetLong(nativePtr, aVar.f17959p, j13, equipment.realmGet$_int(), false);
                Boolean realmGet$owned = equipment.realmGet$owned();
                if (realmGet$owned != null) {
                    Table.nativeSetBoolean(nativePtr, aVar.f17960q, j10, realmGet$owned.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17960q, j10, false);
                }
                Table.nativeSetBoolean(nativePtr, aVar.f17961r, j10, equipment.realmGet$twoHanded(), false);
                String realmGet$mystery = equipment.realmGet$mystery();
                if (realmGet$mystery != null) {
                    Table.nativeSetString(nativePtr, aVar.f17962s, j10, realmGet$mystery, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17962s, j10, false);
                }
                String realmGet$gearSet = equipment.realmGet$gearSet();
                if (realmGet$gearSet != null) {
                    Table.nativeSetString(nativePtr, aVar.f17963t, j10, realmGet$gearSet, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17963t, j10, false);
                }
                j11 = j12;
            }
        }
    }

    static m2 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Equipment.class), false, Collections.emptyList());
        m2 m2Var = new m2();
        cVar.a();
        return m2Var;
    }

    static Equipment n(o0 o0Var, a aVar, Equipment equipment, Equipment equipment2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Equipment.class), set);
        osObjectBuilder.N0(aVar.f17948e, Double.valueOf(equipment2.realmGet$value()));
        osObjectBuilder.c1(aVar.f17949f, equipment2.realmGet$type());
        osObjectBuilder.c1(aVar.f17950g, equipment2.realmGet$key());
        osObjectBuilder.c1(aVar.f17951h, equipment2.realmGet$klass());
        osObjectBuilder.c1(aVar.f17952i, equipment2.realmGet$specialClass());
        osObjectBuilder.c1(aVar.f17953j, equipment2.realmGet$index());
        osObjectBuilder.c1(aVar.f17954k, equipment2.realmGet$text());
        osObjectBuilder.c1(aVar.f17955l, equipment2.realmGet$notes());
        osObjectBuilder.V0(aVar.f17956m, Integer.valueOf(equipment2.realmGet$con()));
        osObjectBuilder.V0(aVar.f17957n, Integer.valueOf(equipment2.realmGet$str()));
        osObjectBuilder.V0(aVar.f17958o, Integer.valueOf(equipment2.realmGet$per()));
        osObjectBuilder.V0(aVar.f17959p, Integer.valueOf(equipment2.realmGet$_int()));
        osObjectBuilder.F0(aVar.f17960q, equipment2.realmGet$owned());
        osObjectBuilder.F0(aVar.f17961r, Boolean.valueOf(equipment2.realmGet$twoHanded()));
        osObjectBuilder.c1(aVar.f17962s, equipment2.realmGet$mystery());
        osObjectBuilder.c1(aVar.f17963t, equipment2.realmGet$gearSet());
        osObjectBuilder.g1();
        return equipment;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17947q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17946p = (a) cVar.c();
        l0<Equipment> l0Var = new l0<>(this);
        this.f17947q = l0Var;
        l0Var.r(cVar.e());
        this.f17947q.s(cVar.f());
        this.f17947q.o(cVar.b());
        this.f17947q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17947q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m2 m2Var = (m2) obj;
        io.realm.a f10 = this.f17947q.f();
        io.realm.a f11 = m2Var.f17947q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17947q.g().getTable().p();
        String p11 = m2Var.f17947q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17947q.g().getObjectKey() == m2Var.f17947q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17947q.f().getPath();
        String p10 = this.f17947q.g().getTable().p();
        long objectKey = this.f17947q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public int realmGet$_int() {
        this.f17947q.f().e();
        return (int) this.f17947q.g().getLong(this.f17946p.f17959p);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public int realmGet$con() {
        this.f17947q.f().e();
        return (int) this.f17947q.g().getLong(this.f17946p.f17956m);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public String realmGet$gearSet() {
        this.f17947q.f().e();
        return this.f17947q.g().getString(this.f17946p.f17963t);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public String realmGet$index() {
        this.f17947q.f().e();
        return this.f17947q.g().getString(this.f17946p.f17953j);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public String realmGet$key() {
        this.f17947q.f().e();
        return this.f17947q.g().getString(this.f17946p.f17950g);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public String realmGet$klass() {
        this.f17947q.f().e();
        return this.f17947q.g().getString(this.f17946p.f17951h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public String realmGet$mystery() {
        this.f17947q.f().e();
        return this.f17947q.g().getString(this.f17946p.f17962s);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public String realmGet$notes() {
        this.f17947q.f().e();
        return this.f17947q.g().getString(this.f17946p.f17955l);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public Boolean realmGet$owned() {
        this.f17947q.f().e();
        if (this.f17947q.g().isNull(this.f17946p.f17960q)) {
            return null;
        }
        return Boolean.valueOf(this.f17947q.g().getBoolean(this.f17946p.f17960q));
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public int realmGet$per() {
        this.f17947q.f().e();
        return (int) this.f17947q.g().getLong(this.f17946p.f17958o);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public String realmGet$specialClass() {
        this.f17947q.f().e();
        return this.f17947q.g().getString(this.f17946p.f17952i);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public int realmGet$str() {
        this.f17947q.f().e();
        return (int) this.f17947q.g().getLong(this.f17946p.f17957n);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public String realmGet$text() {
        this.f17947q.f().e();
        return this.f17947q.g().getString(this.f17946p.f17954k);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public boolean realmGet$twoHanded() {
        this.f17947q.f().e();
        return this.f17947q.g().getBoolean(this.f17946p.f17961r);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public String realmGet$type() {
        this.f17947q.f().e();
        return this.f17947q.g().getString(this.f17946p.f17949f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public double realmGet$value() {
        this.f17947q.f().e();
        return this.f17947q.g().getDouble(this.f17946p.f17948e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$_int(int i10) {
        if (this.f17947q.i()) {
            if (!this.f17947q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17947q.g();
            g10.getTable().E(this.f17946p.f17959p, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17947q.f().e();
        this.f17947q.g().setLong(this.f17946p.f17959p, i10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$con(int i10) {
        if (this.f17947q.i()) {
            if (!this.f17947q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17947q.g();
            g10.getTable().E(this.f17946p.f17956m, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17947q.f().e();
        this.f17947q.g().setLong(this.f17946p.f17956m, i10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$gearSet(String str) {
        if (this.f17947q.i()) {
            if (!this.f17947q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17947q.g();
            if (str != null) {
                g10.getTable().G(this.f17946p.f17963t, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'gearSet' to null.");
        }
        this.f17947q.f().e();
        if (str != null) {
            this.f17947q.g().setString(this.f17946p.f17963t, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'gearSet' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$index(String str) {
        if (this.f17947q.i()) {
            if (!this.f17947q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17947q.g();
            if (str != null) {
                g10.getTable().G(this.f17946p.f17953j, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'index' to null.");
        }
        this.f17947q.f().e();
        if (str != null) {
            this.f17947q.g().setString(this.f17946p.f17953j, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'index' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$key(String str) {
        if (this.f17947q.i()) {
            return;
        }
        this.f17947q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$klass(String str) {
        if (this.f17947q.i()) {
            if (!this.f17947q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17947q.g();
            if (str != null) {
                g10.getTable().G(this.f17946p.f17951h, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'klass' to null.");
        }
        this.f17947q.f().e();
        if (str != null) {
            this.f17947q.g().setString(this.f17946p.f17951h, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'klass' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$mystery(String str) {
        if (this.f17947q.i()) {
            if (!this.f17947q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17947q.g();
            if (str != null) {
                g10.getTable().G(this.f17946p.f17962s, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'mystery' to null.");
        }
        this.f17947q.f().e();
        if (str != null) {
            this.f17947q.g().setString(this.f17946p.f17962s, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'mystery' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$notes(String str) {
        if (this.f17947q.i()) {
            if (!this.f17947q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17947q.g();
            if (str != null) {
                g10.getTable().G(this.f17946p.f17955l, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'notes' to null.");
        }
        this.f17947q.f().e();
        if (str != null) {
            this.f17947q.g().setString(this.f17946p.f17955l, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'notes' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$owned(Boolean bool) {
        if (this.f17947q.i()) {
            if (!this.f17947q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17947q.g();
            if (bool == null) {
                g10.getTable().F(this.f17946p.f17960q, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f17946p.f17960q, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f17947q.f().e();
        if (bool == null) {
            this.f17947q.g().setNull(this.f17946p.f17960q);
        } else {
            this.f17947q.g().setBoolean(this.f17946p.f17960q, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$per(int i10) {
        if (this.f17947q.i()) {
            if (!this.f17947q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17947q.g();
            g10.getTable().E(this.f17946p.f17958o, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17947q.f().e();
        this.f17947q.g().setLong(this.f17946p.f17958o, i10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$specialClass(String str) {
        if (this.f17947q.i()) {
            if (!this.f17947q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17947q.g();
            if (str != null) {
                g10.getTable().G(this.f17946p.f17952i, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'specialClass' to null.");
        }
        this.f17947q.f().e();
        if (str != null) {
            this.f17947q.g().setString(this.f17946p.f17952i, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'specialClass' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$str(int i10) {
        if (this.f17947q.i()) {
            if (!this.f17947q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17947q.g();
            g10.getTable().E(this.f17946p.f17957n, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17947q.f().e();
        this.f17947q.g().setLong(this.f17946p.f17957n, i10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$text(String str) {
        if (this.f17947q.i()) {
            if (!this.f17947q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17947q.g();
            if (str != null) {
                g10.getTable().G(this.f17946p.f17954k, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        this.f17947q.f().e();
        if (str != null) {
            this.f17947q.g().setString(this.f17946p.f17954k, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$twoHanded(boolean z10) {
        if (this.f17947q.i()) {
            if (!this.f17947q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17947q.g();
            g10.getTable().z(this.f17946p.f17961r, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17947q.f().e();
        this.f17947q.g().setBoolean(this.f17946p.f17961r, z10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$type(String str) {
        if (this.f17947q.i()) {
            if (!this.f17947q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17947q.g();
            if (str == null) {
                g10.getTable().F(this.f17946p.f17949f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17946p.f17949f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17947q.f().e();
        if (str == null) {
            this.f17947q.g().setNull(this.f17946p.f17949f);
        } else {
            this.f17947q.g().setString(this.f17946p.f17949f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Equipment, io.realm.n2
    public void realmSet$value(double d10) {
        if (this.f17947q.i()) {
            if (!this.f17947q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17947q.g();
            g10.getTable().B(this.f17946p.f17948e, g10.getObjectKey(), d10, true);
            return;
        }
        this.f17947q.f().e();
        this.f17947q.g().setDouble(this.f17946p.f17948e, d10);
    }

    public String toString() {
        String str;
        String str2;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Equipment = proxy[");
        sb2.append("{value:");
        sb2.append(realmGet$value());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{type:");
        Object obj = "null";
        if (realmGet$type() == null) {
            str = "null";
        } else {
            str = realmGet$type();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{key:");
        if (realmGet$key() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$key();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{klass:");
        sb2.append(realmGet$klass());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{specialClass:");
        sb2.append(realmGet$specialClass());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{index:");
        sb2.append(realmGet$index());
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
        sb2.append("{con:");
        sb2.append(realmGet$con());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{str:");
        sb2.append(realmGet$str());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{per:");
        sb2.append(realmGet$per());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{_int:");
        sb2.append(realmGet$_int());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{owned:");
        if (realmGet$owned() != null) {
            obj = realmGet$owned();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{twoHanded:");
        sb2.append(realmGet$twoHanded());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{mystery:");
        sb2.append(realmGet$mystery());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{gearSet:");
        sb2.append(realmGet$gearSet());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
