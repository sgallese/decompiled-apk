package io.realm;

import com.habitrpg.android.habitica.models.social.UserStyles;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
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

/* compiled from: com_habitrpg_android_habitica_models_social_UserStylesRealmProxy.java */
/* loaded from: classes4.dex */
public class g5 extends UserStyles implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17561r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17562p;

    /* renamed from: q  reason: collision with root package name */
    private l0<UserStyles> f17563q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_social_UserStylesRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17564e;

        /* renamed from: f  reason: collision with root package name */
        long f17565f;

        /* renamed from: g  reason: collision with root package name */
        long f17566g;

        /* renamed from: h  reason: collision with root package name */
        long f17567h;

        /* renamed from: i  reason: collision with root package name */
        long f17568i;

        /* renamed from: j  reason: collision with root package name */
        long f17569j;

        a(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("UserStyles");
            this.f17564e = a("balance", "balance", b10);
            this.f17565f = a("authentication", "authentication", b10);
            this.f17566g = a(NavigationDrawerFragment.SIDEBAR_STATS, NavigationDrawerFragment.SIDEBAR_STATS, b10);
            this.f17567h = a("preferences", "preferences", b10);
            this.f17568i = a("flags", "flags", b10);
            this.f17569j = a(NavigationDrawerFragment.SIDEBAR_ITEMS, NavigationDrawerFragment.SIDEBAR_ITEMS, b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17564e = aVar.f17564e;
            aVar2.f17565f = aVar.f17565f;
            aVar2.f17566g = aVar.f17566g;
            aVar2.f17567h = aVar.f17567h;
            aVar2.f17568i = aVar.f17568i;
            aVar2.f17569j = aVar.f17569j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g5() {
        this.f17563q.p();
    }

    public static UserStyles c(o0 o0Var, a aVar, UserStyles userStyles, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(userStyles);
        if (oVar != null) {
            return (UserStyles) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(UserStyles.class), set);
        osObjectBuilder.N0(aVar.f17564e, Double.valueOf(userStyles.realmGet$balance()));
        g5 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(userStyles, k10);
        Authentication realmGet$authentication = userStyles.realmGet$authentication();
        if (realmGet$authentication == null) {
            k10.realmSet$authentication(null);
        } else if (((Authentication) map.get(realmGet$authentication)) == null) {
            w5 k11 = w5.k(o0Var, o0Var.c1(Authentication.class).s(k10.b().g().createEmbeddedObject(aVar.f17565f, RealmFieldType.OBJECT)));
            map.put(realmGet$authentication, k11);
            w5.n(o0Var, realmGet$authentication, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheauthentication.toString()");
        }
        Stats realmGet$stats = userStyles.realmGet$stats();
        if (realmGet$stats == null) {
            k10.realmSet$stats(null);
        } else if (((Stats) map.get(realmGet$stats)) == null) {
            o7 k12 = o7.k(o0Var, o0Var.c1(Stats.class).s(k10.b().g().createEmbeddedObject(aVar.f17566g, RealmFieldType.OBJECT)));
            map.put(realmGet$stats, k12);
            o7.n(o0Var, realmGet$stats, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachestats.toString()");
        }
        Preferences realmGet$preferences = userStyles.realmGet$preferences();
        if (realmGet$preferences == null) {
            k10.realmSet$preferences(null);
        } else if (((Preferences) map.get(realmGet$preferences)) == null) {
            g7 k13 = g7.k(o0Var, o0Var.c1(Preferences.class).s(k10.b().g().createEmbeddedObject(aVar.f17567h, RealmFieldType.OBJECT)));
            map.put(realmGet$preferences, k13);
            g7.n(o0Var, realmGet$preferences, k13, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachepreferences.toString()");
        }
        Flags realmGet$flags = userStyles.realmGet$flags();
        if (realmGet$flags == null) {
            k10.realmSet$flags(null);
        } else if (((Flags) map.get(realmGet$flags)) == null) {
            i6 k14 = i6.k(o0Var, o0Var.c1(Flags.class).s(k10.b().g().createEmbeddedObject(aVar.f17568i, RealmFieldType.OBJECT)));
            map.put(realmGet$flags, k14);
            i6.n(o0Var, realmGet$flags, k14, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheflags.toString()");
        }
        Items realmGet$items = userStyles.realmGet$items();
        if (realmGet$items == null) {
            k10.realmSet$items(null);
        } else if (((Items) map.get(realmGet$items)) == null) {
            s6 k15 = s6.k(o0Var, o0Var.c1(Items.class).s(k10.b().g().createEmbeddedObject(aVar.f17569j, RealmFieldType.OBJECT)));
            map.put(realmGet$items, k15);
            s6.n(o0Var, realmGet$items, k15, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheitems.toString()");
        }
        return k10;
    }

    public static UserStyles d(o0 o0Var, a aVar, UserStyles userStyles, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((userStyles instanceof io.realm.internal.o) && !d1.isFrozen(userStyles)) {
            io.realm.internal.o oVar = (io.realm.internal.o) userStyles;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return userStyles;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(userStyles);
        if (oVar2 != null) {
            return (UserStyles) oVar2;
        }
        return c(o0Var, aVar, userStyles, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static UserStyles f(UserStyles userStyles, int i10, int i11, Map<a1, o.a<a1>> map) {
        UserStyles userStyles2;
        if (i10 <= i11 && userStyles != null) {
            o.a<a1> aVar = map.get(userStyles);
            if (aVar == null) {
                userStyles2 = new UserStyles();
                map.put(userStyles, new o.a<>(i10, userStyles2));
            } else if (i10 >= aVar.f17831a) {
                return (UserStyles) aVar.f17832b;
            } else {
                UserStyles userStyles3 = (UserStyles) aVar.f17832b;
                aVar.f17831a = i10;
                userStyles2 = userStyles3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) userStyles).b().f();
            userStyles2.realmSet$balance(userStyles.realmGet$balance());
            int i12 = i10 + 1;
            userStyles2.realmSet$authentication(w5.f(userStyles.realmGet$authentication(), i12, i11, map));
            userStyles2.realmSet$stats(o7.f(userStyles.realmGet$stats(), i12, i11, map));
            userStyles2.realmSet$preferences(g7.f(userStyles.realmGet$preferences(), i12, i11, map));
            userStyles2.realmSet$flags(i6.f(userStyles.realmGet$flags(), i12, i11, map));
            userStyles2.realmSet$items(s6.f(userStyles.realmGet$items(), i12, i11, map));
            return userStyles2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "UserStyles", true, 6, 0);
        bVar.b("", "balance", RealmFieldType.DOUBLE, false, false, true);
        RealmFieldType realmFieldType = RealmFieldType.OBJECT;
        bVar.a("", "authentication", realmFieldType, "Authentication");
        bVar.a("", NavigationDrawerFragment.SIDEBAR_STATS, realmFieldType, "Stats");
        bVar.a("", "preferences", realmFieldType, "Preferences");
        bVar.a("", "flags", realmFieldType, "Flags");
        bVar.a("", NavigationDrawerFragment.SIDEBAR_ITEMS, realmFieldType, "Items");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17561r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, UserStyles userStyles, Map<a1, Long> map) {
        a aVar;
        if ((userStyles instanceof io.realm.internal.o) && !d1.isFrozen(userStyles)) {
            io.realm.internal.o oVar = (io.realm.internal.o) userStyles;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(UserStyles.class);
        long nativePtr = c12.getNativePtr();
        a aVar2 = (a) o0Var.R().e(UserStyles.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(userStyles, Long.valueOf(createEmbeddedObject));
        Table.nativeSetDouble(nativePtr, aVar2.f17564e, createEmbeddedObject, userStyles.realmGet$balance(), false);
        Authentication realmGet$authentication = userStyles.realmGet$authentication();
        if (realmGet$authentication != null) {
            Long l10 = map.get(realmGet$authentication);
            if (l10 == null) {
                aVar = aVar2;
                w5.i(o0Var, c12, aVar2.f17565f, createEmbeddedObject, realmGet$authentication, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
            }
        } else {
            aVar = aVar2;
            Table.nativeNullifyLink(nativePtr, aVar.f17565f, createEmbeddedObject);
        }
        Stats realmGet$stats = userStyles.realmGet$stats();
        if (realmGet$stats != null) {
            Long l11 = map.get(realmGet$stats);
            if (l11 == null) {
                o7.i(o0Var, c12, aVar.f17566g, createEmbeddedObject, realmGet$stats, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l11.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17566g, createEmbeddedObject);
        }
        Preferences realmGet$preferences = userStyles.realmGet$preferences();
        if (realmGet$preferences != null) {
            Long l12 = map.get(realmGet$preferences);
            if (l12 == null) {
                g7.i(o0Var, c12, aVar.f17567h, createEmbeddedObject, realmGet$preferences, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l12.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17567h, createEmbeddedObject);
        }
        Flags realmGet$flags = userStyles.realmGet$flags();
        if (realmGet$flags != null) {
            Long l13 = map.get(realmGet$flags);
            if (l13 == null) {
                i6.i(o0Var, c12, aVar.f17568i, createEmbeddedObject, realmGet$flags, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l13.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17568i, createEmbeddedObject);
        }
        Items realmGet$items = userStyles.realmGet$items();
        if (realmGet$items != null) {
            Long l14 = map.get(realmGet$items);
            if (l14 == null) {
                s6.i(o0Var, c12, aVar.f17569j, createEmbeddedObject, realmGet$items, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l14.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17569j, createEmbeddedObject);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g5 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(UserStyles.class), false, Collections.emptyList());
        g5 g5Var = new g5();
        cVar.a();
        return g5Var;
    }

    static UserStyles l(o0 o0Var, a aVar, UserStyles userStyles, UserStyles userStyles2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(UserStyles.class), set);
        osObjectBuilder.N0(aVar.f17564e, Double.valueOf(userStyles2.realmGet$balance()));
        Authentication realmGet$authentication = userStyles2.realmGet$authentication();
        if (realmGet$authentication == null) {
            osObjectBuilder.Z0(aVar.f17565f);
        } else if (((Authentication) map.get(realmGet$authentication)) == null) {
            w5 k10 = w5.k(o0Var, o0Var.c1(Authentication.class).s(((io.realm.internal.o) userStyles).b().g().createEmbeddedObject(aVar.f17565f, RealmFieldType.OBJECT)));
            map.put(realmGet$authentication, k10);
            w5.n(o0Var, realmGet$authentication, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheauthentication.toString()");
        }
        Stats realmGet$stats = userStyles2.realmGet$stats();
        if (realmGet$stats == null) {
            osObjectBuilder.Z0(aVar.f17566g);
        } else if (((Stats) map.get(realmGet$stats)) == null) {
            o7 k11 = o7.k(o0Var, o0Var.c1(Stats.class).s(((io.realm.internal.o) userStyles).b().g().createEmbeddedObject(aVar.f17566g, RealmFieldType.OBJECT)));
            map.put(realmGet$stats, k11);
            o7.n(o0Var, realmGet$stats, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachestats.toString()");
        }
        Preferences realmGet$preferences = userStyles2.realmGet$preferences();
        if (realmGet$preferences == null) {
            osObjectBuilder.Z0(aVar.f17567h);
        } else if (((Preferences) map.get(realmGet$preferences)) == null) {
            g7 k12 = g7.k(o0Var, o0Var.c1(Preferences.class).s(((io.realm.internal.o) userStyles).b().g().createEmbeddedObject(aVar.f17567h, RealmFieldType.OBJECT)));
            map.put(realmGet$preferences, k12);
            g7.n(o0Var, realmGet$preferences, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachepreferences.toString()");
        }
        Flags realmGet$flags = userStyles2.realmGet$flags();
        if (realmGet$flags == null) {
            osObjectBuilder.Z0(aVar.f17568i);
        } else if (((Flags) map.get(realmGet$flags)) == null) {
            i6 k13 = i6.k(o0Var, o0Var.c1(Flags.class).s(((io.realm.internal.o) userStyles).b().g().createEmbeddedObject(aVar.f17568i, RealmFieldType.OBJECT)));
            map.put(realmGet$flags, k13);
            i6.n(o0Var, realmGet$flags, k13, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheflags.toString()");
        }
        Items realmGet$items = userStyles2.realmGet$items();
        if (realmGet$items == null) {
            osObjectBuilder.Z0(aVar.f17569j);
        } else if (((Items) map.get(realmGet$items)) == null) {
            s6 k14 = s6.k(o0Var, o0Var.c1(Items.class).s(((io.realm.internal.o) userStyles).b().g().createEmbeddedObject(aVar.f17569j, RealmFieldType.OBJECT)));
            map.put(realmGet$items, k14);
            s6.n(o0Var, realmGet$items, k14, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheitems.toString()");
        }
        osObjectBuilder.f1((io.realm.internal.o) userStyles);
        return userStyles;
    }

    public static void n(o0 o0Var, UserStyles userStyles, UserStyles userStyles2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(UserStyles.class), userStyles2, userStyles, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17563q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17562p = (a) cVar.c();
        l0<UserStyles> l0Var = new l0<>(this);
        this.f17563q = l0Var;
        l0Var.r(cVar.e());
        this.f17563q.s(cVar.f());
        this.f17563q.o(cVar.b());
        this.f17563q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17563q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g5 g5Var = (g5) obj;
        io.realm.a f10 = this.f17563q.f();
        io.realm.a f11 = g5Var.f17563q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17563q.g().getTable().p();
        String p11 = g5Var.f17563q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17563q.g().getObjectKey() == g5Var.f17563q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17563q.f().getPath();
        String p10 = this.f17563q.g().getTable().p();
        long objectKey = this.f17563q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.social.UserStyles, io.realm.h5
    public Authentication realmGet$authentication() {
        this.f17563q.f().e();
        if (this.f17563q.g().isNullLink(this.f17562p.f17565f)) {
            return null;
        }
        return (Authentication) this.f17563q.f().B(Authentication.class, this.f17563q.g().getLink(this.f17562p.f17565f), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.social.UserStyles, io.realm.h5
    public double realmGet$balance() {
        this.f17563q.f().e();
        return this.f17563q.g().getDouble(this.f17562p.f17564e);
    }

    @Override // com.habitrpg.android.habitica.models.social.UserStyles, io.realm.h5
    public Flags realmGet$flags() {
        this.f17563q.f().e();
        if (this.f17563q.g().isNullLink(this.f17562p.f17568i)) {
            return null;
        }
        return (Flags) this.f17563q.f().B(Flags.class, this.f17563q.g().getLink(this.f17562p.f17568i), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.social.UserStyles, io.realm.h5
    public Items realmGet$items() {
        this.f17563q.f().e();
        if (this.f17563q.g().isNullLink(this.f17562p.f17569j)) {
            return null;
        }
        return (Items) this.f17563q.f().B(Items.class, this.f17563q.g().getLink(this.f17562p.f17569j), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.social.UserStyles, io.realm.h5
    public Preferences realmGet$preferences() {
        this.f17563q.f().e();
        if (this.f17563q.g().isNullLink(this.f17562p.f17567h)) {
            return null;
        }
        return (Preferences) this.f17563q.f().B(Preferences.class, this.f17563q.g().getLink(this.f17562p.f17567h), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.social.UserStyles, io.realm.h5
    public Stats realmGet$stats() {
        this.f17563q.f().e();
        if (this.f17563q.g().isNullLink(this.f17562p.f17566g)) {
            return null;
        }
        return (Stats) this.f17563q.f().B(Stats.class, this.f17563q.g().getLink(this.f17562p.f17566g), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.social.UserStyles, io.realm.h5
    public void realmSet$authentication(Authentication authentication) {
        o0 o0Var = (o0) this.f17563q.f();
        if (this.f17563q.i()) {
            if (!this.f17563q.d() || this.f17563q.e().contains("authentication")) {
                return;
            }
            if (authentication != null && !d1.isManaged(authentication)) {
                Authentication authentication2 = (Authentication) o0Var.J0(Authentication.class, this, "authentication");
                w5.n(o0Var, authentication, authentication2, new HashMap(), Collections.EMPTY_SET);
                authentication = authentication2;
            }
            io.realm.internal.q g10 = this.f17563q.g();
            if (authentication == null) {
                g10.nullifyLink(this.f17562p.f17565f);
                return;
            }
            this.f17563q.c(authentication);
            g10.getTable().D(this.f17562p.f17565f, g10.getObjectKey(), ((io.realm.internal.o) authentication).b().g().getObjectKey(), true);
            return;
        }
        this.f17563q.f().e();
        if (authentication == null) {
            this.f17563q.g().nullifyLink(this.f17562p.f17565f);
            return;
        }
        if (d1.isManaged(authentication)) {
            this.f17563q.c(authentication);
        }
        w5.n(o0Var, authentication, (Authentication) o0Var.J0(Authentication.class, this, "authentication"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.social.UserStyles, io.realm.h5
    public void realmSet$balance(double d10) {
        if (this.f17563q.i()) {
            if (!this.f17563q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17563q.g();
            g10.getTable().B(this.f17562p.f17564e, g10.getObjectKey(), d10, true);
            return;
        }
        this.f17563q.f().e();
        this.f17563q.g().setDouble(this.f17562p.f17564e, d10);
    }

    @Override // com.habitrpg.android.habitica.models.social.UserStyles, io.realm.h5
    public void realmSet$flags(Flags flags) {
        o0 o0Var = (o0) this.f17563q.f();
        if (this.f17563q.i()) {
            if (!this.f17563q.d() || this.f17563q.e().contains("flags")) {
                return;
            }
            if (flags != null && !d1.isManaged(flags)) {
                Flags flags2 = (Flags) o0Var.J0(Flags.class, this, "flags");
                i6.n(o0Var, flags, flags2, new HashMap(), Collections.EMPTY_SET);
                flags = flags2;
            }
            io.realm.internal.q g10 = this.f17563q.g();
            if (flags == null) {
                g10.nullifyLink(this.f17562p.f17568i);
                return;
            }
            this.f17563q.c(flags);
            g10.getTable().D(this.f17562p.f17568i, g10.getObjectKey(), ((io.realm.internal.o) flags).b().g().getObjectKey(), true);
            return;
        }
        this.f17563q.f().e();
        if (flags == null) {
            this.f17563q.g().nullifyLink(this.f17562p.f17568i);
            return;
        }
        if (d1.isManaged(flags)) {
            this.f17563q.c(flags);
        }
        i6.n(o0Var, flags, (Flags) o0Var.J0(Flags.class, this, "flags"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.social.UserStyles, io.realm.h5
    public void realmSet$items(Items items) {
        o0 o0Var = (o0) this.f17563q.f();
        if (this.f17563q.i()) {
            if (!this.f17563q.d() || this.f17563q.e().contains(NavigationDrawerFragment.SIDEBAR_ITEMS)) {
                return;
            }
            if (items != null && !d1.isManaged(items)) {
                Items items2 = (Items) o0Var.J0(Items.class, this, NavigationDrawerFragment.SIDEBAR_ITEMS);
                s6.n(o0Var, items, items2, new HashMap(), Collections.EMPTY_SET);
                items = items2;
            }
            io.realm.internal.q g10 = this.f17563q.g();
            if (items == null) {
                g10.nullifyLink(this.f17562p.f17569j);
                return;
            }
            this.f17563q.c(items);
            g10.getTable().D(this.f17562p.f17569j, g10.getObjectKey(), ((io.realm.internal.o) items).b().g().getObjectKey(), true);
            return;
        }
        this.f17563q.f().e();
        if (items == null) {
            this.f17563q.g().nullifyLink(this.f17562p.f17569j);
            return;
        }
        if (d1.isManaged(items)) {
            this.f17563q.c(items);
        }
        s6.n(o0Var, items, (Items) o0Var.J0(Items.class, this, NavigationDrawerFragment.SIDEBAR_ITEMS), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.social.UserStyles, io.realm.h5
    public void realmSet$preferences(Preferences preferences) {
        o0 o0Var = (o0) this.f17563q.f();
        if (this.f17563q.i()) {
            if (!this.f17563q.d() || this.f17563q.e().contains("preferences")) {
                return;
            }
            if (preferences != null && !d1.isManaged(preferences)) {
                Preferences preferences2 = (Preferences) o0Var.J0(Preferences.class, this, "preferences");
                g7.n(o0Var, preferences, preferences2, new HashMap(), Collections.EMPTY_SET);
                preferences = preferences2;
            }
            io.realm.internal.q g10 = this.f17563q.g();
            if (preferences == null) {
                g10.nullifyLink(this.f17562p.f17567h);
                return;
            }
            this.f17563q.c(preferences);
            g10.getTable().D(this.f17562p.f17567h, g10.getObjectKey(), ((io.realm.internal.o) preferences).b().g().getObjectKey(), true);
            return;
        }
        this.f17563q.f().e();
        if (preferences == null) {
            this.f17563q.g().nullifyLink(this.f17562p.f17567h);
            return;
        }
        if (d1.isManaged(preferences)) {
            this.f17563q.c(preferences);
        }
        g7.n(o0Var, preferences, (Preferences) o0Var.J0(Preferences.class, this, "preferences"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.social.UserStyles, io.realm.h5
    public void realmSet$stats(Stats stats) {
        o0 o0Var = (o0) this.f17563q.f();
        if (this.f17563q.i()) {
            if (!this.f17563q.d() || this.f17563q.e().contains(NavigationDrawerFragment.SIDEBAR_STATS)) {
                return;
            }
            if (stats != null && !d1.isManaged(stats)) {
                Stats stats2 = (Stats) o0Var.J0(Stats.class, this, NavigationDrawerFragment.SIDEBAR_STATS);
                o7.n(o0Var, stats, stats2, new HashMap(), Collections.EMPTY_SET);
                stats = stats2;
            }
            io.realm.internal.q g10 = this.f17563q.g();
            if (stats == null) {
                g10.nullifyLink(this.f17562p.f17566g);
                return;
            }
            this.f17563q.c(stats);
            g10.getTable().D(this.f17562p.f17566g, g10.getObjectKey(), ((io.realm.internal.o) stats).b().g().getObjectKey(), true);
            return;
        }
        this.f17563q.f().e();
        if (stats == null) {
            this.f17563q.g().nullifyLink(this.f17562p.f17566g);
            return;
        }
        if (d1.isManaged(stats)) {
            this.f17563q.c(stats);
        }
        o7.n(o0Var, stats, (Stats) o0Var.J0(Stats.class, this, NavigationDrawerFragment.SIDEBAR_STATS), new HashMap(), Collections.EMPTY_SET);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("UserStyles = proxy[");
        sb2.append("{balance:");
        sb2.append(realmGet$balance());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{authentication:");
        String str5 = "null";
        if (realmGet$authentication() == null) {
            str = "null";
        } else {
            str = "Authentication";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{stats:");
        if (realmGet$stats() == null) {
            str2 = "null";
        } else {
            str2 = "Stats";
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{preferences:");
        if (realmGet$preferences() == null) {
            str3 = "null";
        } else {
            str3 = "Preferences";
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{flags:");
        if (realmGet$flags() == null) {
            str4 = "null";
        } else {
            str4 = "Flags";
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{items:");
        if (realmGet$items() != null) {
            str5 = "Items";
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
