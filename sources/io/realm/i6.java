package io.realm;

import com.habitrpg.android.habitica.models.TutorialStep;
import com.habitrpg.android.habitica.models.user.Flags;
import io.realm.a;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_FlagsRealmProxy.java */
/* loaded from: classes4.dex */
public class i6 extends Flags implements io.realm.internal.o {

    /* renamed from: u  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17678u = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17679p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Flags> f17680q;

    /* renamed from: r  reason: collision with root package name */
    private x0<TutorialStep> f17681r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_FlagsRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17682e;

        /* renamed from: f  reason: collision with root package name */
        long f17683f;

        /* renamed from: g  reason: collision with root package name */
        long f17684g;

        /* renamed from: h  reason: collision with root package name */
        long f17685h;

        /* renamed from: i  reason: collision with root package name */
        long f17686i;

        /* renamed from: j  reason: collision with root package name */
        long f17687j;

        /* renamed from: k  reason: collision with root package name */
        long f17688k;

        /* renamed from: l  reason: collision with root package name */
        long f17689l;

        /* renamed from: m  reason: collision with root package name */
        long f17690m;

        /* renamed from: n  reason: collision with root package name */
        long f17691n;

        /* renamed from: o  reason: collision with root package name */
        long f17692o;

        /* renamed from: p  reason: collision with root package name */
        long f17693p;

        /* renamed from: q  reason: collision with root package name */
        long f17694q;

        /* renamed from: r  reason: collision with root package name */
        long f17695r;

        /* renamed from: s  reason: collision with root package name */
        long f17696s;

        a(OsSchemaInfo osSchemaInfo) {
            super(15);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Flags");
            this.f17682e = a("tutorial", "tutorial", b10);
            this.f17683f = a("showTour", "showTour", b10);
            this.f17684g = a("dropsEnabled", "dropsEnabled", b10);
            this.f17685h = a("itemsEnabled", "itemsEnabled", b10);
            this.f17686i = a("newStuff", "newStuff", b10);
            this.f17687j = a("lastNewStuffRead", "lastNewStuffRead", b10);
            this.f17688k = a("classSelected", "classSelected", b10);
            this.f17689l = a("rebirthEnabled", "rebirthEnabled", b10);
            this.f17690m = a("welcomed", "welcomed", b10);
            this.f17691n = a("armoireEnabled", "armoireEnabled", b10);
            this.f17692o = a("armoireOpened", "armoireOpened", b10);
            this.f17693p = a("armoireEmpty", "armoireEmpty", b10);
            this.f17694q = a("communityGuidelinesAccepted", "communityGuidelinesAccepted", b10);
            this.f17695r = a("verifiedUsername", "verifiedUsername", b10);
            this.f17696s = a("isWarnedLowHealth", "isWarnedLowHealth", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17682e = aVar.f17682e;
            aVar2.f17683f = aVar.f17683f;
            aVar2.f17684g = aVar.f17684g;
            aVar2.f17685h = aVar.f17685h;
            aVar2.f17686i = aVar.f17686i;
            aVar2.f17687j = aVar.f17687j;
            aVar2.f17688k = aVar.f17688k;
            aVar2.f17689l = aVar.f17689l;
            aVar2.f17690m = aVar.f17690m;
            aVar2.f17691n = aVar.f17691n;
            aVar2.f17692o = aVar.f17692o;
            aVar2.f17693p = aVar.f17693p;
            aVar2.f17694q = aVar.f17694q;
            aVar2.f17695r = aVar.f17695r;
            aVar2.f17696s = aVar.f17696s;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i6() {
        this.f17680q.p();
    }

    public static Flags c(o0 o0Var, a aVar, Flags flags, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(flags);
        if (oVar != null) {
            return (Flags) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Flags.class), set);
        osObjectBuilder.F0(aVar.f17683f, Boolean.valueOf(flags.realmGet$showTour()));
        osObjectBuilder.F0(aVar.f17684g, Boolean.valueOf(flags.realmGet$dropsEnabled()));
        osObjectBuilder.F0(aVar.f17685h, Boolean.valueOf(flags.realmGet$itemsEnabled()));
        osObjectBuilder.F0(aVar.f17686i, Boolean.valueOf(flags.realmGet$newStuff()));
        osObjectBuilder.c1(aVar.f17687j, flags.realmGet$lastNewStuffRead());
        osObjectBuilder.F0(aVar.f17688k, Boolean.valueOf(flags.realmGet$classSelected()));
        osObjectBuilder.F0(aVar.f17689l, Boolean.valueOf(flags.realmGet$rebirthEnabled()));
        osObjectBuilder.F0(aVar.f17690m, Boolean.valueOf(flags.realmGet$welcomed()));
        osObjectBuilder.F0(aVar.f17691n, Boolean.valueOf(flags.realmGet$armoireEnabled()));
        osObjectBuilder.F0(aVar.f17692o, Boolean.valueOf(flags.realmGet$armoireOpened()));
        osObjectBuilder.F0(aVar.f17693p, Boolean.valueOf(flags.realmGet$armoireEmpty()));
        osObjectBuilder.F0(aVar.f17694q, Boolean.valueOf(flags.realmGet$communityGuidelinesAccepted()));
        osObjectBuilder.F0(aVar.f17695r, Boolean.valueOf(flags.realmGet$verifiedUsername()));
        osObjectBuilder.F0(aVar.f17696s, Boolean.valueOf(flags.realmGet$isWarnedLowHealth()));
        i6 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(flags, k10);
        x0<TutorialStep> realmGet$tutorial = flags.realmGet$tutorial();
        if (realmGet$tutorial != null) {
            x0<TutorialStep> realmGet$tutorial2 = k10.realmGet$tutorial();
            realmGet$tutorial2.clear();
            for (int i10 = 0; i10 < realmGet$tutorial.size(); i10++) {
                TutorialStep tutorialStep = realmGet$tutorial.get(i10);
                if (((TutorialStep) map.get(tutorialStep)) == null) {
                    a2 k11 = a2.k(o0Var, o0Var.c1(TutorialStep.class).s(realmGet$tutorial2.m().n()));
                    map.put(tutorialStep, k11);
                    a2.n(o0Var, tutorialStep, k11, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachetutorial.toString()");
                }
            }
        }
        return k10;
    }

    public static Flags d(o0 o0Var, a aVar, Flags flags, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((flags instanceof io.realm.internal.o) && !d1.isFrozen(flags)) {
            io.realm.internal.o oVar = (io.realm.internal.o) flags;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return flags;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(flags);
        if (oVar2 != null) {
            return (Flags) oVar2;
        }
        return c(o0Var, aVar, flags, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Flags f(Flags flags, int i10, int i11, Map<a1, o.a<a1>> map) {
        Flags flags2;
        if (i10 > i11 || flags == null) {
            return null;
        }
        o.a<a1> aVar = map.get(flags);
        if (aVar == null) {
            flags2 = new Flags();
            map.put(flags, new o.a<>(i10, flags2));
        } else if (i10 >= aVar.f17831a) {
            return (Flags) aVar.f17832b;
        } else {
            Flags flags3 = (Flags) aVar.f17832b;
            aVar.f17831a = i10;
            flags2 = flags3;
        }
        o0 o0Var = (o0) ((io.realm.internal.o) flags).b().f();
        if (i10 == i11) {
            flags2.realmSet$tutorial(null);
        } else {
            x0<TutorialStep> realmGet$tutorial = flags.realmGet$tutorial();
            x0<TutorialStep> x0Var = new x0<>();
            flags2.realmSet$tutorial(x0Var);
            int i12 = i10 + 1;
            int size = realmGet$tutorial.size();
            for (int i13 = 0; i13 < size; i13++) {
                x0Var.add(a2.f(realmGet$tutorial.get(i13), i12, i11, map));
            }
        }
        flags2.realmSet$showTour(flags.realmGet$showTour());
        flags2.realmSet$dropsEnabled(flags.realmGet$dropsEnabled());
        flags2.realmSet$itemsEnabled(flags.realmGet$itemsEnabled());
        flags2.realmSet$newStuff(flags.realmGet$newStuff());
        flags2.realmSet$lastNewStuffRead(flags.realmGet$lastNewStuffRead());
        flags2.realmSet$classSelected(flags.realmGet$classSelected());
        flags2.realmSet$rebirthEnabled(flags.realmGet$rebirthEnabled());
        flags2.realmSet$welcomed(flags.realmGet$welcomed());
        flags2.realmSet$armoireEnabled(flags.realmGet$armoireEnabled());
        flags2.realmSet$armoireOpened(flags.realmGet$armoireOpened());
        flags2.realmSet$armoireEmpty(flags.realmGet$armoireEmpty());
        flags2.realmSet$communityGuidelinesAccepted(flags.realmGet$communityGuidelinesAccepted());
        flags2.realmSet$verifiedUsername(flags.realmGet$verifiedUsername());
        flags2.realmSet$isWarnedLowHealth(flags.realmGet$isWarnedLowHealth());
        return flags2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Flags", true, 15, 0);
        bVar.a("", "tutorial", RealmFieldType.LIST, "TutorialStep");
        RealmFieldType realmFieldType = RealmFieldType.BOOLEAN;
        bVar.b("", "showTour", realmFieldType, false, false, true);
        bVar.b("", "dropsEnabled", realmFieldType, false, false, true);
        bVar.b("", "itemsEnabled", realmFieldType, false, false, true);
        bVar.b("", "newStuff", realmFieldType, false, false, true);
        bVar.b("", "lastNewStuffRead", RealmFieldType.STRING, false, false, false);
        bVar.b("", "classSelected", realmFieldType, false, false, true);
        bVar.b("", "rebirthEnabled", realmFieldType, false, false, true);
        bVar.b("", "welcomed", realmFieldType, false, false, true);
        bVar.b("", "armoireEnabled", realmFieldType, false, false, true);
        bVar.b("", "armoireOpened", realmFieldType, false, false, true);
        bVar.b("", "armoireEmpty", realmFieldType, false, false, true);
        bVar.b("", "communityGuidelinesAccepted", realmFieldType, false, false, true);
        bVar.b("", "verifiedUsername", realmFieldType, false, false, true);
        bVar.b("", "isWarnedLowHealth", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17678u;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Flags flags, Map<a1, Long> map) {
        if ((flags instanceof io.realm.internal.o) && !d1.isFrozen(flags)) {
            io.realm.internal.o oVar = (io.realm.internal.o) flags;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Flags.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Flags.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(flags, Long.valueOf(createEmbeddedObject));
        OsList osList = new OsList(c12.s(createEmbeddedObject), aVar.f17682e);
        x0<TutorialStep> realmGet$tutorial = flags.realmGet$tutorial();
        osList.K();
        if (realmGet$tutorial != null) {
            Iterator<TutorialStep> it = realmGet$tutorial.iterator();
            while (it.hasNext()) {
                TutorialStep next = it.next();
                Long l10 = map.get(next);
                if (l10 == null) {
                    a2.i(o0Var, c12, aVar.f17682e, createEmbeddedObject, next, map);
                    createEmbeddedObject = createEmbeddedObject;
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
                }
            }
        }
        long j12 = createEmbeddedObject;
        Table.nativeSetBoolean(nativePtr, aVar.f17683f, j12, flags.realmGet$showTour(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17684g, j12, flags.realmGet$dropsEnabled(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17685h, j12, flags.realmGet$itemsEnabled(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17686i, j12, flags.realmGet$newStuff(), false);
        String realmGet$lastNewStuffRead = flags.realmGet$lastNewStuffRead();
        if (realmGet$lastNewStuffRead != null) {
            Table.nativeSetString(nativePtr, aVar.f17687j, j12, realmGet$lastNewStuffRead, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17687j, j12, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f17688k, j12, flags.realmGet$classSelected(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17689l, j12, flags.realmGet$rebirthEnabled(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17690m, j12, flags.realmGet$welcomed(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17691n, j12, flags.realmGet$armoireEnabled(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17692o, j12, flags.realmGet$armoireOpened(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17693p, j12, flags.realmGet$armoireEmpty(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17694q, j12, flags.realmGet$communityGuidelinesAccepted(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17695r, j12, flags.realmGet$verifiedUsername(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17696s, j12, flags.realmGet$isWarnedLowHealth(), false);
        return j12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i6 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Flags.class), false, Collections.emptyList());
        i6 i6Var = new i6();
        cVar.a();
        return i6Var;
    }

    static Flags l(o0 o0Var, a aVar, Flags flags, Flags flags2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Flags.class), set);
        x0<TutorialStep> realmGet$tutorial = flags2.realmGet$tutorial();
        if (realmGet$tutorial != null) {
            x0 x0Var = new x0();
            OsList m10 = flags.realmGet$tutorial().m();
            m10.q();
            for (int i10 = 0; i10 < realmGet$tutorial.size(); i10++) {
                TutorialStep tutorialStep = realmGet$tutorial.get(i10);
                if (((TutorialStep) map.get(tutorialStep)) == null) {
                    a2 k10 = a2.k(o0Var, o0Var.c1(TutorialStep.class).s(m10.n()));
                    map.put(tutorialStep, k10);
                    x0Var.add(k10);
                    a2.n(o0Var, tutorialStep, k10, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachetutorial.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f17682e, new x0());
        }
        osObjectBuilder.F0(aVar.f17683f, Boolean.valueOf(flags2.realmGet$showTour()));
        osObjectBuilder.F0(aVar.f17684g, Boolean.valueOf(flags2.realmGet$dropsEnabled()));
        osObjectBuilder.F0(aVar.f17685h, Boolean.valueOf(flags2.realmGet$itemsEnabled()));
        osObjectBuilder.F0(aVar.f17686i, Boolean.valueOf(flags2.realmGet$newStuff()));
        osObjectBuilder.c1(aVar.f17687j, flags2.realmGet$lastNewStuffRead());
        osObjectBuilder.F0(aVar.f17688k, Boolean.valueOf(flags2.realmGet$classSelected()));
        osObjectBuilder.F0(aVar.f17689l, Boolean.valueOf(flags2.realmGet$rebirthEnabled()));
        osObjectBuilder.F0(aVar.f17690m, Boolean.valueOf(flags2.realmGet$welcomed()));
        osObjectBuilder.F0(aVar.f17691n, Boolean.valueOf(flags2.realmGet$armoireEnabled()));
        osObjectBuilder.F0(aVar.f17692o, Boolean.valueOf(flags2.realmGet$armoireOpened()));
        osObjectBuilder.F0(aVar.f17693p, Boolean.valueOf(flags2.realmGet$armoireEmpty()));
        osObjectBuilder.F0(aVar.f17694q, Boolean.valueOf(flags2.realmGet$communityGuidelinesAccepted()));
        osObjectBuilder.F0(aVar.f17695r, Boolean.valueOf(flags2.realmGet$verifiedUsername()));
        osObjectBuilder.F0(aVar.f17696s, Boolean.valueOf(flags2.realmGet$isWarnedLowHealth()));
        osObjectBuilder.f1((io.realm.internal.o) flags);
        return flags;
    }

    public static void n(o0 o0Var, Flags flags, Flags flags2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Flags.class), flags2, flags, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17680q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17679p = (a) cVar.c();
        l0<Flags> l0Var = new l0<>(this);
        this.f17680q = l0Var;
        l0Var.r(cVar.e());
        this.f17680q.s(cVar.f());
        this.f17680q.o(cVar.b());
        this.f17680q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17680q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i6 i6Var = (i6) obj;
        io.realm.a f10 = this.f17680q.f();
        io.realm.a f11 = i6Var.f17680q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17680q.g().getTable().p();
        String p11 = i6Var.f17680q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17680q.g().getObjectKey() == i6Var.f17680q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17680q.f().getPath();
        String p10 = this.f17680q.g().getTable().p();
        long objectKey = this.f17680q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public boolean realmGet$armoireEmpty() {
        this.f17680q.f().e();
        return this.f17680q.g().getBoolean(this.f17679p.f17693p);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public boolean realmGet$armoireEnabled() {
        this.f17680q.f().e();
        return this.f17680q.g().getBoolean(this.f17679p.f17691n);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public boolean realmGet$armoireOpened() {
        this.f17680q.f().e();
        return this.f17680q.g().getBoolean(this.f17679p.f17692o);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public boolean realmGet$classSelected() {
        this.f17680q.f().e();
        return this.f17680q.g().getBoolean(this.f17679p.f17688k);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public boolean realmGet$communityGuidelinesAccepted() {
        this.f17680q.f().e();
        return this.f17680q.g().getBoolean(this.f17679p.f17694q);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public boolean realmGet$dropsEnabled() {
        this.f17680q.f().e();
        return this.f17680q.g().getBoolean(this.f17679p.f17684g);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public boolean realmGet$isWarnedLowHealth() {
        this.f17680q.f().e();
        return this.f17680q.g().getBoolean(this.f17679p.f17696s);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public boolean realmGet$itemsEnabled() {
        this.f17680q.f().e();
        return this.f17680q.g().getBoolean(this.f17679p.f17685h);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public String realmGet$lastNewStuffRead() {
        this.f17680q.f().e();
        return this.f17680q.g().getString(this.f17679p.f17687j);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public boolean realmGet$newStuff() {
        this.f17680q.f().e();
        return this.f17680q.g().getBoolean(this.f17679p.f17686i);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public boolean realmGet$rebirthEnabled() {
        this.f17680q.f().e();
        return this.f17680q.g().getBoolean(this.f17679p.f17689l);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public boolean realmGet$showTour() {
        this.f17680q.f().e();
        return this.f17680q.g().getBoolean(this.f17679p.f17683f);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public x0<TutorialStep> realmGet$tutorial() {
        this.f17680q.f().e();
        x0<TutorialStep> x0Var = this.f17681r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<TutorialStep> x0Var2 = new x0<>(TutorialStep.class, this.f17680q.g().getModelList(this.f17679p.f17682e), this.f17680q.f());
        this.f17681r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public boolean realmGet$verifiedUsername() {
        this.f17680q.f().e();
        return this.f17680q.g().getBoolean(this.f17679p.f17695r);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public boolean realmGet$welcomed() {
        this.f17680q.f().e();
        return this.f17680q.g().getBoolean(this.f17679p.f17690m);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public void realmSet$armoireEmpty(boolean z10) {
        if (this.f17680q.i()) {
            if (!this.f17680q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17680q.g();
            g10.getTable().z(this.f17679p.f17693p, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17680q.f().e();
        this.f17680q.g().setBoolean(this.f17679p.f17693p, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public void realmSet$armoireEnabled(boolean z10) {
        if (this.f17680q.i()) {
            if (!this.f17680q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17680q.g();
            g10.getTable().z(this.f17679p.f17691n, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17680q.f().e();
        this.f17680q.g().setBoolean(this.f17679p.f17691n, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public void realmSet$armoireOpened(boolean z10) {
        if (this.f17680q.i()) {
            if (!this.f17680q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17680q.g();
            g10.getTable().z(this.f17679p.f17692o, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17680q.f().e();
        this.f17680q.g().setBoolean(this.f17679p.f17692o, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public void realmSet$classSelected(boolean z10) {
        if (this.f17680q.i()) {
            if (!this.f17680q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17680q.g();
            g10.getTable().z(this.f17679p.f17688k, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17680q.f().e();
        this.f17680q.g().setBoolean(this.f17679p.f17688k, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public void realmSet$communityGuidelinesAccepted(boolean z10) {
        if (this.f17680q.i()) {
            if (!this.f17680q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17680q.g();
            g10.getTable().z(this.f17679p.f17694q, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17680q.f().e();
        this.f17680q.g().setBoolean(this.f17679p.f17694q, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public void realmSet$dropsEnabled(boolean z10) {
        if (this.f17680q.i()) {
            if (!this.f17680q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17680q.g();
            g10.getTable().z(this.f17679p.f17684g, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17680q.f().e();
        this.f17680q.g().setBoolean(this.f17679p.f17684g, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public void realmSet$isWarnedLowHealth(boolean z10) {
        if (this.f17680q.i()) {
            if (!this.f17680q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17680q.g();
            g10.getTable().z(this.f17679p.f17696s, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17680q.f().e();
        this.f17680q.g().setBoolean(this.f17679p.f17696s, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public void realmSet$itemsEnabled(boolean z10) {
        if (this.f17680q.i()) {
            if (!this.f17680q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17680q.g();
            g10.getTable().z(this.f17679p.f17685h, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17680q.f().e();
        this.f17680q.g().setBoolean(this.f17679p.f17685h, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public void realmSet$lastNewStuffRead(String str) {
        if (this.f17680q.i()) {
            if (!this.f17680q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17680q.g();
            if (str == null) {
                g10.getTable().F(this.f17679p.f17687j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17679p.f17687j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17680q.f().e();
        if (str == null) {
            this.f17680q.g().setNull(this.f17679p.f17687j);
        } else {
            this.f17680q.g().setString(this.f17679p.f17687j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public void realmSet$newStuff(boolean z10) {
        if (this.f17680q.i()) {
            if (!this.f17680q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17680q.g();
            g10.getTable().z(this.f17679p.f17686i, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17680q.f().e();
        this.f17680q.g().setBoolean(this.f17679p.f17686i, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public void realmSet$rebirthEnabled(boolean z10) {
        if (this.f17680q.i()) {
            if (!this.f17680q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17680q.g();
            g10.getTable().z(this.f17679p.f17689l, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17680q.f().e();
        this.f17680q.g().setBoolean(this.f17679p.f17689l, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public void realmSet$showTour(boolean z10) {
        if (this.f17680q.i()) {
            if (!this.f17680q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17680q.g();
            g10.getTable().z(this.f17679p.f17683f, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17680q.f().e();
        this.f17680q.g().setBoolean(this.f17679p.f17683f, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public void realmSet$tutorial(x0<TutorialStep> x0Var) {
        int i10 = 0;
        if (this.f17680q.i()) {
            if (!this.f17680q.d() || this.f17680q.e().contains("tutorial")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17680q.f();
                x0<TutorialStep> x0Var2 = new x0<>();
                Iterator<TutorialStep> it = x0Var.iterator();
                while (it.hasNext()) {
                    TutorialStep next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((TutorialStep) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17680q.f().e();
        OsList modelList = this.f17680q.g().getModelList(this.f17679p.f17682e);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                TutorialStep tutorialStep = x0Var.get(i10);
                this.f17680q.c(tutorialStep);
                modelList.V(i10, ((io.realm.internal.o) tutorialStep).b().g().getObjectKey());
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
            TutorialStep tutorialStep2 = x0Var.get(i10);
            this.f17680q.c(tutorialStep2);
            modelList.k(((io.realm.internal.o) tutorialStep2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public void realmSet$verifiedUsername(boolean z10) {
        if (this.f17680q.i()) {
            if (!this.f17680q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17680q.g();
            g10.getTable().z(this.f17679p.f17695r, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17680q.f().e();
        this.f17680q.g().setBoolean(this.f17679p.f17695r, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Flags, io.realm.j6
    public void realmSet$welcomed(boolean z10) {
        if (this.f17680q.i()) {
            if (!this.f17680q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17680q.g();
            g10.getTable().z(this.f17679p.f17690m, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17680q.f().e();
        this.f17680q.g().setBoolean(this.f17679p.f17690m, z10);
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Flags = proxy[");
        sb2.append("{tutorial:");
        sb2.append("RealmList<TutorialStep>[");
        sb2.append(realmGet$tutorial().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{showTour:");
        sb2.append(realmGet$showTour());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{dropsEnabled:");
        sb2.append(realmGet$dropsEnabled());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{itemsEnabled:");
        sb2.append(realmGet$itemsEnabled());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{newStuff:");
        sb2.append(realmGet$newStuff());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{lastNewStuffRead:");
        if (realmGet$lastNewStuffRead() != null) {
            str = realmGet$lastNewStuffRead();
        } else {
            str = "null";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{classSelected:");
        sb2.append(realmGet$classSelected());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{rebirthEnabled:");
        sb2.append(realmGet$rebirthEnabled());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{welcomed:");
        sb2.append(realmGet$welcomed());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{armoireEnabled:");
        sb2.append(realmGet$armoireEnabled());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{armoireOpened:");
        sb2.append(realmGet$armoireOpened());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{armoireEmpty:");
        sb2.append(realmGet$armoireEmpty());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{communityGuidelinesAccepted:");
        sb2.append(realmGet$communityGuidelinesAccepted());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{verifiedUsername:");
        sb2.append(realmGet$verifiedUsername());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{isWarnedLowHealth:");
        sb2.append(realmGet$isWarnedLowHealth());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
