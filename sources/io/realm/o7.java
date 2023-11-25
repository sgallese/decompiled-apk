package io.realm;

import com.habitrpg.android.habitica.models.user.Buffs;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.Training;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_StatsRealmProxy.java */
/* loaded from: classes4.dex */
public class o7 extends Stats implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18058r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18059p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Stats> f18060q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_StatsRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18061e;

        /* renamed from: f  reason: collision with root package name */
        long f18062f;

        /* renamed from: g  reason: collision with root package name */
        long f18063g;

        /* renamed from: h  reason: collision with root package name */
        long f18064h;

        /* renamed from: i  reason: collision with root package name */
        long f18065i;

        /* renamed from: j  reason: collision with root package name */
        long f18066j;

        /* renamed from: k  reason: collision with root package name */
        long f18067k;

        /* renamed from: l  reason: collision with root package name */
        long f18068l;

        /* renamed from: m  reason: collision with root package name */
        long f18069m;

        /* renamed from: n  reason: collision with root package name */
        long f18070n;

        /* renamed from: o  reason: collision with root package name */
        long f18071o;

        /* renamed from: p  reason: collision with root package name */
        long f18072p;

        /* renamed from: q  reason: collision with root package name */
        long f18073q;

        /* renamed from: r  reason: collision with root package name */
        long f18074r;

        /* renamed from: s  reason: collision with root package name */
        long f18075s;

        /* renamed from: t  reason: collision with root package name */
        long f18076t;

        a(OsSchemaInfo osSchemaInfo) {
            super(16);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Stats");
            this.f18061e = a("constitution", "constitution", b10);
            this.f18062f = a("strength", "strength", b10);
            this.f18063g = a("per", "per", b10);
            this.f18064h = a("intelligence", "intelligence", b10);
            this.f18065i = a("training", "training", b10);
            this.f18066j = a("buffs", "buffs", b10);
            this.f18067k = a("points", "points", b10);
            this.f18068l = a("lvl", "lvl", b10);
            this.f18069m = a("habitClass", "habitClass", b10);
            this.f18070n = a("gp", "gp", b10);
            this.f18071o = a("exp", "exp", b10);
            this.f18072p = a("mp", "mp", b10);
            this.f18073q = a("hp", "hp", b10);
            this.f18074r = a("toNextLevel", "toNextLevel", b10);
            this.f18075s = a("maxHealth", "maxHealth", b10);
            this.f18076t = a("maxMP", "maxMP", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18061e = aVar.f18061e;
            aVar2.f18062f = aVar.f18062f;
            aVar2.f18063g = aVar.f18063g;
            aVar2.f18064h = aVar.f18064h;
            aVar2.f18065i = aVar.f18065i;
            aVar2.f18066j = aVar.f18066j;
            aVar2.f18067k = aVar.f18067k;
            aVar2.f18068l = aVar.f18068l;
            aVar2.f18069m = aVar.f18069m;
            aVar2.f18070n = aVar.f18070n;
            aVar2.f18071o = aVar.f18071o;
            aVar2.f18072p = aVar.f18072p;
            aVar2.f18073q = aVar.f18073q;
            aVar2.f18074r = aVar.f18074r;
            aVar2.f18075s = aVar.f18075s;
            aVar2.f18076t = aVar.f18076t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o7() {
        this.f18060q.p();
    }

    public static Stats c(o0 o0Var, a aVar, Stats stats, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(stats);
        if (oVar != null) {
            return (Stats) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Stats.class), set);
        osObjectBuilder.V0(aVar.f18061e, stats.realmGet$constitution());
        osObjectBuilder.V0(aVar.f18062f, stats.realmGet$strength());
        osObjectBuilder.V0(aVar.f18063g, stats.realmGet$per());
        osObjectBuilder.V0(aVar.f18064h, stats.realmGet$intelligence());
        osObjectBuilder.V0(aVar.f18067k, stats.realmGet$points());
        osObjectBuilder.V0(aVar.f18068l, stats.realmGet$lvl());
        osObjectBuilder.c1(aVar.f18069m, stats.realmGet$habitClass());
        osObjectBuilder.N0(aVar.f18070n, stats.realmGet$gp());
        osObjectBuilder.N0(aVar.f18071o, stats.realmGet$exp());
        osObjectBuilder.N0(aVar.f18072p, stats.realmGet$mp());
        osObjectBuilder.N0(aVar.f18073q, stats.realmGet$hp());
        osObjectBuilder.V0(aVar.f18074r, stats.realmGet$toNextLevel());
        osObjectBuilder.V0(aVar.f18075s, stats.realmGet$maxHealth());
        osObjectBuilder.V0(aVar.f18076t, stats.realmGet$maxMP());
        o7 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(stats, k10);
        Training realmGet$training = stats.realmGet$training();
        if (realmGet$training == null) {
            k10.realmSet$training(null);
        } else if (((Training) map.get(realmGet$training)) == null) {
            w7 k11 = w7.k(o0Var, o0Var.c1(Training.class).s(k10.b().g().createEmbeddedObject(aVar.f18065i, RealmFieldType.OBJECT)));
            map.put(realmGet$training, k11);
            w7.n(o0Var, realmGet$training, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachetraining.toString()");
        }
        Buffs realmGet$buffs = stats.realmGet$buffs();
        if (realmGet$buffs == null) {
            k10.realmSet$buffs(null);
        } else if (((Buffs) map.get(realmGet$buffs)) == null) {
            c6 k12 = c6.k(o0Var, o0Var.c1(Buffs.class).s(k10.b().g().createEmbeddedObject(aVar.f18066j, RealmFieldType.OBJECT)));
            map.put(realmGet$buffs, k12);
            c6.n(o0Var, realmGet$buffs, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachebuffs.toString()");
        }
        return k10;
    }

    public static Stats d(o0 o0Var, a aVar, Stats stats, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((stats instanceof io.realm.internal.o) && !d1.isFrozen(stats)) {
            io.realm.internal.o oVar = (io.realm.internal.o) stats;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return stats;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(stats);
        if (oVar2 != null) {
            return (Stats) oVar2;
        }
        return c(o0Var, aVar, stats, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Stats f(Stats stats, int i10, int i11, Map<a1, o.a<a1>> map) {
        Stats stats2;
        if (i10 <= i11 && stats != null) {
            o.a<a1> aVar = map.get(stats);
            if (aVar == null) {
                stats2 = new Stats();
                map.put(stats, new o.a<>(i10, stats2));
            } else if (i10 >= aVar.f17831a) {
                return (Stats) aVar.f17832b;
            } else {
                Stats stats3 = (Stats) aVar.f17832b;
                aVar.f17831a = i10;
                stats2 = stats3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) stats).b().f();
            stats2.realmSet$constitution(stats.realmGet$constitution());
            stats2.realmSet$strength(stats.realmGet$strength());
            stats2.realmSet$per(stats.realmGet$per());
            stats2.realmSet$intelligence(stats.realmGet$intelligence());
            int i12 = i10 + 1;
            stats2.realmSet$training(w7.f(stats.realmGet$training(), i12, i11, map));
            stats2.realmSet$buffs(c6.f(stats.realmGet$buffs(), i12, i11, map));
            stats2.realmSet$points(stats.realmGet$points());
            stats2.realmSet$lvl(stats.realmGet$lvl());
            stats2.realmSet$habitClass(stats.realmGet$habitClass());
            stats2.realmSet$gp(stats.realmGet$gp());
            stats2.realmSet$exp(stats.realmGet$exp());
            stats2.realmSet$mp(stats.realmGet$mp());
            stats2.realmSet$hp(stats.realmGet$hp());
            stats2.realmSet$toNextLevel(stats.realmGet$toNextLevel());
            stats2.realmSet$maxHealth(stats.realmGet$maxHealth());
            stats2.realmSet$maxMP(stats.realmGet$maxMP());
            return stats2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Stats", true, 16, 0);
        RealmFieldType realmFieldType = RealmFieldType.INTEGER;
        bVar.b("", "constitution", realmFieldType, false, false, false);
        bVar.b("", "strength", realmFieldType, false, false, false);
        bVar.b("", "per", realmFieldType, false, false, false);
        bVar.b("", "intelligence", realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.OBJECT;
        bVar.a("", "training", realmFieldType2, "Training");
        bVar.a("", "buffs", realmFieldType2, "Buffs");
        bVar.b("", "points", realmFieldType, false, false, false);
        bVar.b("", "lvl", realmFieldType, false, false, false);
        bVar.b("", "habitClass", RealmFieldType.STRING, false, false, false);
        RealmFieldType realmFieldType3 = RealmFieldType.DOUBLE;
        bVar.b("", "gp", realmFieldType3, false, false, false);
        bVar.b("", "exp", realmFieldType3, false, false, false);
        bVar.b("", "mp", realmFieldType3, false, false, false);
        bVar.b("", "hp", realmFieldType3, false, false, false);
        bVar.b("", "toNextLevel", realmFieldType, false, false, false);
        bVar.b("", "maxHealth", realmFieldType, false, false, false);
        bVar.b("", "maxMP", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18058r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Stats stats, Map<a1, Long> map) {
        a aVar;
        if ((stats instanceof io.realm.internal.o) && !d1.isFrozen(stats)) {
            io.realm.internal.o oVar = (io.realm.internal.o) stats;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Stats.class);
        long nativePtr = c12.getNativePtr();
        a aVar2 = (a) o0Var.R().e(Stats.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(stats, Long.valueOf(createEmbeddedObject));
        Integer realmGet$constitution = stats.realmGet$constitution();
        if (realmGet$constitution != null) {
            Table.nativeSetLong(nativePtr, aVar2.f18061e, createEmbeddedObject, realmGet$constitution.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar2.f18061e, createEmbeddedObject, false);
        }
        Integer realmGet$strength = stats.realmGet$strength();
        if (realmGet$strength != null) {
            Table.nativeSetLong(nativePtr, aVar2.f18062f, createEmbeddedObject, realmGet$strength.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar2.f18062f, createEmbeddedObject, false);
        }
        Integer realmGet$per = stats.realmGet$per();
        if (realmGet$per != null) {
            Table.nativeSetLong(nativePtr, aVar2.f18063g, createEmbeddedObject, realmGet$per.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar2.f18063g, createEmbeddedObject, false);
        }
        Integer realmGet$intelligence = stats.realmGet$intelligence();
        if (realmGet$intelligence != null) {
            Table.nativeSetLong(nativePtr, aVar2.f18064h, createEmbeddedObject, realmGet$intelligence.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar2.f18064h, createEmbeddedObject, false);
        }
        Training realmGet$training = stats.realmGet$training();
        if (realmGet$training != null) {
            Long l10 = map.get(realmGet$training);
            if (l10 == null) {
                aVar = aVar2;
                w7.i(o0Var, c12, aVar2.f18065i, createEmbeddedObject, realmGet$training, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
            }
        } else {
            aVar = aVar2;
            Table.nativeNullifyLink(nativePtr, aVar.f18065i, createEmbeddedObject);
        }
        Buffs realmGet$buffs = stats.realmGet$buffs();
        if (realmGet$buffs != null) {
            Long l11 = map.get(realmGet$buffs);
            if (l11 == null) {
                c6.i(o0Var, c12, aVar.f18066j, createEmbeddedObject, realmGet$buffs, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l11.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f18066j, createEmbeddedObject);
        }
        Integer realmGet$points = stats.realmGet$points();
        if (realmGet$points != null) {
            Table.nativeSetLong(nativePtr, aVar.f18067k, createEmbeddedObject, realmGet$points.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18067k, createEmbeddedObject, false);
        }
        Integer realmGet$lvl = stats.realmGet$lvl();
        if (realmGet$lvl != null) {
            Table.nativeSetLong(nativePtr, aVar.f18068l, createEmbeddedObject, realmGet$lvl.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18068l, createEmbeddedObject, false);
        }
        String realmGet$habitClass = stats.realmGet$habitClass();
        if (realmGet$habitClass != null) {
            Table.nativeSetString(nativePtr, aVar.f18069m, createEmbeddedObject, realmGet$habitClass, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18069m, createEmbeddedObject, false);
        }
        Double realmGet$gp = stats.realmGet$gp();
        if (realmGet$gp != null) {
            Table.nativeSetDouble(nativePtr, aVar.f18070n, createEmbeddedObject, realmGet$gp.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18070n, createEmbeddedObject, false);
        }
        Double realmGet$exp = stats.realmGet$exp();
        if (realmGet$exp != null) {
            Table.nativeSetDouble(nativePtr, aVar.f18071o, createEmbeddedObject, realmGet$exp.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18071o, createEmbeddedObject, false);
        }
        Double realmGet$mp = stats.realmGet$mp();
        if (realmGet$mp != null) {
            Table.nativeSetDouble(nativePtr, aVar.f18072p, createEmbeddedObject, realmGet$mp.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18072p, createEmbeddedObject, false);
        }
        Double realmGet$hp = stats.realmGet$hp();
        if (realmGet$hp != null) {
            Table.nativeSetDouble(nativePtr, aVar.f18073q, createEmbeddedObject, realmGet$hp.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18073q, createEmbeddedObject, false);
        }
        Integer realmGet$toNextLevel = stats.realmGet$toNextLevel();
        if (realmGet$toNextLevel != null) {
            Table.nativeSetLong(nativePtr, aVar.f18074r, createEmbeddedObject, realmGet$toNextLevel.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18074r, createEmbeddedObject, false);
        }
        Integer realmGet$maxHealth = stats.realmGet$maxHealth();
        if (realmGet$maxHealth != null) {
            Table.nativeSetLong(nativePtr, aVar.f18075s, createEmbeddedObject, realmGet$maxHealth.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18075s, createEmbeddedObject, false);
        }
        Integer realmGet$maxMP = stats.realmGet$maxMP();
        if (realmGet$maxMP != null) {
            Table.nativeSetLong(nativePtr, aVar.f18076t, createEmbeddedObject, realmGet$maxMP.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18076t, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o7 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Stats.class), false, Collections.emptyList());
        o7 o7Var = new o7();
        cVar.a();
        return o7Var;
    }

    static Stats l(o0 o0Var, a aVar, Stats stats, Stats stats2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Stats.class), set);
        osObjectBuilder.V0(aVar.f18061e, stats2.realmGet$constitution());
        osObjectBuilder.V0(aVar.f18062f, stats2.realmGet$strength());
        osObjectBuilder.V0(aVar.f18063g, stats2.realmGet$per());
        osObjectBuilder.V0(aVar.f18064h, stats2.realmGet$intelligence());
        Training realmGet$training = stats2.realmGet$training();
        if (realmGet$training == null) {
            osObjectBuilder.Z0(aVar.f18065i);
        } else if (((Training) map.get(realmGet$training)) == null) {
            w7 k10 = w7.k(o0Var, o0Var.c1(Training.class).s(((io.realm.internal.o) stats).b().g().createEmbeddedObject(aVar.f18065i, RealmFieldType.OBJECT)));
            map.put(realmGet$training, k10);
            w7.n(o0Var, realmGet$training, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachetraining.toString()");
        }
        Buffs realmGet$buffs = stats2.realmGet$buffs();
        if (realmGet$buffs == null) {
            osObjectBuilder.Z0(aVar.f18066j);
        } else if (((Buffs) map.get(realmGet$buffs)) == null) {
            c6 k11 = c6.k(o0Var, o0Var.c1(Buffs.class).s(((io.realm.internal.o) stats).b().g().createEmbeddedObject(aVar.f18066j, RealmFieldType.OBJECT)));
            map.put(realmGet$buffs, k11);
            c6.n(o0Var, realmGet$buffs, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachebuffs.toString()");
        }
        osObjectBuilder.V0(aVar.f18067k, stats2.realmGet$points());
        osObjectBuilder.V0(aVar.f18068l, stats2.realmGet$lvl());
        osObjectBuilder.c1(aVar.f18069m, stats2.realmGet$habitClass());
        osObjectBuilder.N0(aVar.f18070n, stats2.realmGet$gp());
        osObjectBuilder.N0(aVar.f18071o, stats2.realmGet$exp());
        osObjectBuilder.N0(aVar.f18072p, stats2.realmGet$mp());
        osObjectBuilder.N0(aVar.f18073q, stats2.realmGet$hp());
        osObjectBuilder.V0(aVar.f18074r, stats2.realmGet$toNextLevel());
        osObjectBuilder.V0(aVar.f18075s, stats2.realmGet$maxHealth());
        osObjectBuilder.V0(aVar.f18076t, stats2.realmGet$maxMP());
        osObjectBuilder.f1((io.realm.internal.o) stats);
        return stats;
    }

    public static void n(o0 o0Var, Stats stats, Stats stats2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Stats.class), stats2, stats, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18060q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18059p = (a) cVar.c();
        l0<Stats> l0Var = new l0<>(this);
        this.f18060q = l0Var;
        l0Var.r(cVar.e());
        this.f18060q.s(cVar.f());
        this.f18060q.o(cVar.b());
        this.f18060q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18060q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o7 o7Var = (o7) obj;
        io.realm.a f10 = this.f18060q.f();
        io.realm.a f11 = o7Var.f18060q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18060q.g().getTable().p();
        String p11 = o7Var.f18060q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18060q.g().getObjectKey() == o7Var.f18060q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18060q.f().getPath();
        String p10 = this.f18060q.g().getTable().p();
        long objectKey = this.f18060q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public Buffs realmGet$buffs() {
        this.f18060q.f().e();
        if (this.f18060q.g().isNullLink(this.f18059p.f18066j)) {
            return null;
        }
        return (Buffs) this.f18060q.f().B(Buffs.class, this.f18060q.g().getLink(this.f18059p.f18066j), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public Integer realmGet$constitution() {
        this.f18060q.f().e();
        if (this.f18060q.g().isNull(this.f18059p.f18061e)) {
            return null;
        }
        return Integer.valueOf((int) this.f18060q.g().getLong(this.f18059p.f18061e));
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public Double realmGet$exp() {
        this.f18060q.f().e();
        if (this.f18060q.g().isNull(this.f18059p.f18071o)) {
            return null;
        }
        return Double.valueOf(this.f18060q.g().getDouble(this.f18059p.f18071o));
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public Double realmGet$gp() {
        this.f18060q.f().e();
        if (this.f18060q.g().isNull(this.f18059p.f18070n)) {
            return null;
        }
        return Double.valueOf(this.f18060q.g().getDouble(this.f18059p.f18070n));
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public String realmGet$habitClass() {
        this.f18060q.f().e();
        return this.f18060q.g().getString(this.f18059p.f18069m);
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public Double realmGet$hp() {
        this.f18060q.f().e();
        if (this.f18060q.g().isNull(this.f18059p.f18073q)) {
            return null;
        }
        return Double.valueOf(this.f18060q.g().getDouble(this.f18059p.f18073q));
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public Integer realmGet$intelligence() {
        this.f18060q.f().e();
        if (this.f18060q.g().isNull(this.f18059p.f18064h)) {
            return null;
        }
        return Integer.valueOf((int) this.f18060q.g().getLong(this.f18059p.f18064h));
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public Integer realmGet$lvl() {
        this.f18060q.f().e();
        if (this.f18060q.g().isNull(this.f18059p.f18068l)) {
            return null;
        }
        return Integer.valueOf((int) this.f18060q.g().getLong(this.f18059p.f18068l));
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public Integer realmGet$maxHealth() {
        this.f18060q.f().e();
        if (this.f18060q.g().isNull(this.f18059p.f18075s)) {
            return null;
        }
        return Integer.valueOf((int) this.f18060q.g().getLong(this.f18059p.f18075s));
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public Integer realmGet$maxMP() {
        this.f18060q.f().e();
        if (this.f18060q.g().isNull(this.f18059p.f18076t)) {
            return null;
        }
        return Integer.valueOf((int) this.f18060q.g().getLong(this.f18059p.f18076t));
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public Double realmGet$mp() {
        this.f18060q.f().e();
        if (this.f18060q.g().isNull(this.f18059p.f18072p)) {
            return null;
        }
        return Double.valueOf(this.f18060q.g().getDouble(this.f18059p.f18072p));
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public Integer realmGet$per() {
        this.f18060q.f().e();
        if (this.f18060q.g().isNull(this.f18059p.f18063g)) {
            return null;
        }
        return Integer.valueOf((int) this.f18060q.g().getLong(this.f18059p.f18063g));
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public Integer realmGet$points() {
        this.f18060q.f().e();
        if (this.f18060q.g().isNull(this.f18059p.f18067k)) {
            return null;
        }
        return Integer.valueOf((int) this.f18060q.g().getLong(this.f18059p.f18067k));
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public Integer realmGet$strength() {
        this.f18060q.f().e();
        if (this.f18060q.g().isNull(this.f18059p.f18062f)) {
            return null;
        }
        return Integer.valueOf((int) this.f18060q.g().getLong(this.f18059p.f18062f));
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public Integer realmGet$toNextLevel() {
        this.f18060q.f().e();
        if (this.f18060q.g().isNull(this.f18059p.f18074r)) {
            return null;
        }
        return Integer.valueOf((int) this.f18060q.g().getLong(this.f18059p.f18074r));
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public Training realmGet$training() {
        this.f18060q.f().e();
        if (this.f18060q.g().isNullLink(this.f18059p.f18065i)) {
            return null;
        }
        return (Training) this.f18060q.f().B(Training.class, this.f18060q.g().getLink(this.f18059p.f18065i), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$buffs(Buffs buffs) {
        o0 o0Var = (o0) this.f18060q.f();
        if (this.f18060q.i()) {
            if (!this.f18060q.d() || this.f18060q.e().contains("buffs")) {
                return;
            }
            if (buffs != null && !d1.isManaged(buffs)) {
                Buffs buffs2 = (Buffs) o0Var.J0(Buffs.class, this, "buffs");
                c6.n(o0Var, buffs, buffs2, new HashMap(), Collections.EMPTY_SET);
                buffs = buffs2;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (buffs == null) {
                g10.nullifyLink(this.f18059p.f18066j);
                return;
            }
            this.f18060q.c(buffs);
            g10.getTable().D(this.f18059p.f18066j, g10.getObjectKey(), ((io.realm.internal.o) buffs).b().g().getObjectKey(), true);
            return;
        }
        this.f18060q.f().e();
        if (buffs == null) {
            this.f18060q.g().nullifyLink(this.f18059p.f18066j);
            return;
        }
        if (d1.isManaged(buffs)) {
            this.f18060q.c(buffs);
        }
        c6.n(o0Var, buffs, (Buffs) o0Var.J0(Buffs.class, this, "buffs"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$constitution(Integer num) {
        if (this.f18060q.i()) {
            if (!this.f18060q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (num == null) {
                g10.getTable().F(this.f18059p.f18061e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18059p.f18061e, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f18060q.f().e();
        if (num == null) {
            this.f18060q.g().setNull(this.f18059p.f18061e);
        } else {
            this.f18060q.g().setLong(this.f18059p.f18061e, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$exp(Double d10) {
        if (this.f18060q.i()) {
            if (!this.f18060q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (d10 == null) {
                g10.getTable().F(this.f18059p.f18071o, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().B(this.f18059p.f18071o, g10.getObjectKey(), d10.doubleValue(), true);
                return;
            }
        }
        this.f18060q.f().e();
        if (d10 == null) {
            this.f18060q.g().setNull(this.f18059p.f18071o);
        } else {
            this.f18060q.g().setDouble(this.f18059p.f18071o, d10.doubleValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$gp(Double d10) {
        if (this.f18060q.i()) {
            if (!this.f18060q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (d10 == null) {
                g10.getTable().F(this.f18059p.f18070n, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().B(this.f18059p.f18070n, g10.getObjectKey(), d10.doubleValue(), true);
                return;
            }
        }
        this.f18060q.f().e();
        if (d10 == null) {
            this.f18060q.g().setNull(this.f18059p.f18070n);
        } else {
            this.f18060q.g().setDouble(this.f18059p.f18070n, d10.doubleValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$habitClass(String str) {
        if (this.f18060q.i()) {
            if (!this.f18060q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (str == null) {
                g10.getTable().F(this.f18059p.f18069m, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18059p.f18069m, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18060q.f().e();
        if (str == null) {
            this.f18060q.g().setNull(this.f18059p.f18069m);
        } else {
            this.f18060q.g().setString(this.f18059p.f18069m, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$hp(Double d10) {
        if (this.f18060q.i()) {
            if (!this.f18060q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (d10 == null) {
                g10.getTable().F(this.f18059p.f18073q, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().B(this.f18059p.f18073q, g10.getObjectKey(), d10.doubleValue(), true);
                return;
            }
        }
        this.f18060q.f().e();
        if (d10 == null) {
            this.f18060q.g().setNull(this.f18059p.f18073q);
        } else {
            this.f18060q.g().setDouble(this.f18059p.f18073q, d10.doubleValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$intelligence(Integer num) {
        if (this.f18060q.i()) {
            if (!this.f18060q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (num == null) {
                g10.getTable().F(this.f18059p.f18064h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18059p.f18064h, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f18060q.f().e();
        if (num == null) {
            this.f18060q.g().setNull(this.f18059p.f18064h);
        } else {
            this.f18060q.g().setLong(this.f18059p.f18064h, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$lvl(Integer num) {
        if (this.f18060q.i()) {
            if (!this.f18060q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (num == null) {
                g10.getTable().F(this.f18059p.f18068l, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18059p.f18068l, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f18060q.f().e();
        if (num == null) {
            this.f18060q.g().setNull(this.f18059p.f18068l);
        } else {
            this.f18060q.g().setLong(this.f18059p.f18068l, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$maxHealth(Integer num) {
        if (this.f18060q.i()) {
            if (!this.f18060q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (num == null) {
                g10.getTable().F(this.f18059p.f18075s, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18059p.f18075s, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f18060q.f().e();
        if (num == null) {
            this.f18060q.g().setNull(this.f18059p.f18075s);
        } else {
            this.f18060q.g().setLong(this.f18059p.f18075s, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$maxMP(Integer num) {
        if (this.f18060q.i()) {
            if (!this.f18060q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (num == null) {
                g10.getTable().F(this.f18059p.f18076t, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18059p.f18076t, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f18060q.f().e();
        if (num == null) {
            this.f18060q.g().setNull(this.f18059p.f18076t);
        } else {
            this.f18060q.g().setLong(this.f18059p.f18076t, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$mp(Double d10) {
        if (this.f18060q.i()) {
            if (!this.f18060q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (d10 == null) {
                g10.getTable().F(this.f18059p.f18072p, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().B(this.f18059p.f18072p, g10.getObjectKey(), d10.doubleValue(), true);
                return;
            }
        }
        this.f18060q.f().e();
        if (d10 == null) {
            this.f18060q.g().setNull(this.f18059p.f18072p);
        } else {
            this.f18060q.g().setDouble(this.f18059p.f18072p, d10.doubleValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$per(Integer num) {
        if (this.f18060q.i()) {
            if (!this.f18060q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (num == null) {
                g10.getTable().F(this.f18059p.f18063g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18059p.f18063g, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f18060q.f().e();
        if (num == null) {
            this.f18060q.g().setNull(this.f18059p.f18063g);
        } else {
            this.f18060q.g().setLong(this.f18059p.f18063g, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$points(Integer num) {
        if (this.f18060q.i()) {
            if (!this.f18060q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (num == null) {
                g10.getTable().F(this.f18059p.f18067k, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18059p.f18067k, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f18060q.f().e();
        if (num == null) {
            this.f18060q.g().setNull(this.f18059p.f18067k);
        } else {
            this.f18060q.g().setLong(this.f18059p.f18067k, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$strength(Integer num) {
        if (this.f18060q.i()) {
            if (!this.f18060q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (num == null) {
                g10.getTable().F(this.f18059p.f18062f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18059p.f18062f, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f18060q.f().e();
        if (num == null) {
            this.f18060q.g().setNull(this.f18059p.f18062f);
        } else {
            this.f18060q.g().setLong(this.f18059p.f18062f, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$toNextLevel(Integer num) {
        if (this.f18060q.i()) {
            if (!this.f18060q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (num == null) {
                g10.getTable().F(this.f18059p.f18074r, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18059p.f18074r, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f18060q.f().e();
        if (num == null) {
            this.f18060q.g().setNull(this.f18059p.f18074r);
        } else {
            this.f18060q.g().setLong(this.f18059p.f18074r, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Stats, io.realm.p7
    public void realmSet$training(Training training) {
        o0 o0Var = (o0) this.f18060q.f();
        if (this.f18060q.i()) {
            if (!this.f18060q.d() || this.f18060q.e().contains("training")) {
                return;
            }
            if (training != null && !d1.isManaged(training)) {
                Training training2 = (Training) o0Var.J0(Training.class, this, "training");
                w7.n(o0Var, training, training2, new HashMap(), Collections.EMPTY_SET);
                training = training2;
            }
            io.realm.internal.q g10 = this.f18060q.g();
            if (training == null) {
                g10.nullifyLink(this.f18059p.f18065i);
                return;
            }
            this.f18060q.c(training);
            g10.getTable().D(this.f18059p.f18065i, g10.getObjectKey(), ((io.realm.internal.o) training).b().g().getObjectKey(), true);
            return;
        }
        this.f18060q.f().e();
        if (training == null) {
            this.f18060q.g().nullifyLink(this.f18059p.f18065i);
            return;
        }
        if (d1.isManaged(training)) {
            this.f18060q.c(training);
        }
        w7.n(o0Var, training, (Training) o0Var.J0(Training.class, this, "training"), new HashMap(), Collections.EMPTY_SET);
    }

    public String toString() {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        String str;
        String str2;
        Integer num5;
        Integer num6;
        String str3;
        Double d10;
        Double d11;
        Double d12;
        Double d13;
        Integer num7;
        Integer num8;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Stats = proxy[");
        sb2.append("{constitution:");
        Object obj = "null";
        if (realmGet$constitution() == null) {
            num = "null";
        } else {
            num = realmGet$constitution();
        }
        sb2.append(num);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{strength:");
        if (realmGet$strength() == null) {
            num2 = "null";
        } else {
            num2 = realmGet$strength();
        }
        sb2.append(num2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{per:");
        if (realmGet$per() == null) {
            num3 = "null";
        } else {
            num3 = realmGet$per();
        }
        sb2.append(num3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{intelligence:");
        if (realmGet$intelligence() == null) {
            num4 = "null";
        } else {
            num4 = realmGet$intelligence();
        }
        sb2.append(num4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{training:");
        if (realmGet$training() == null) {
            str = "null";
        } else {
            str = "Training";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{buffs:");
        if (realmGet$buffs() == null) {
            str2 = "null";
        } else {
            str2 = "Buffs";
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{points:");
        if (realmGet$points() == null) {
            num5 = "null";
        } else {
            num5 = realmGet$points();
        }
        sb2.append(num5);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{lvl:");
        if (realmGet$lvl() == null) {
            num6 = "null";
        } else {
            num6 = realmGet$lvl();
        }
        sb2.append(num6);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{habitClass:");
        if (realmGet$habitClass() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$habitClass();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{gp:");
        if (realmGet$gp() == null) {
            d10 = "null";
        } else {
            d10 = realmGet$gp();
        }
        sb2.append(d10);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{exp:");
        if (realmGet$exp() == null) {
            d11 = "null";
        } else {
            d11 = realmGet$exp();
        }
        sb2.append(d11);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{mp:");
        if (realmGet$mp() == null) {
            d12 = "null";
        } else {
            d12 = realmGet$mp();
        }
        sb2.append(d12);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{hp:");
        if (realmGet$hp() == null) {
            d13 = "null";
        } else {
            d13 = realmGet$hp();
        }
        sb2.append(d13);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{toNextLevel:");
        if (realmGet$toNextLevel() == null) {
            num7 = "null";
        } else {
            num7 = realmGet$toNextLevel();
        }
        sb2.append(num7);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{maxHealth:");
        if (realmGet$maxHealth() == null) {
            num8 = "null";
        } else {
            num8 = realmGet$maxHealth();
        }
        sb2.append(num8);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{maxMP:");
        if (realmGet$maxMP() != null) {
            obj = realmGet$maxMP();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
