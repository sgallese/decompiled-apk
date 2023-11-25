package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.User;
import io.realm.a;
import io.realm.a8;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_ProfileRealmProxy.java */
/* loaded from: classes4.dex */
public class i7 extends Profile implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17697r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17698p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Profile> f17699q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_ProfileRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17700e;

        /* renamed from: f  reason: collision with root package name */
        long f17701f;

        /* renamed from: g  reason: collision with root package name */
        long f17702g;

        /* renamed from: h  reason: collision with root package name */
        long f17703h;

        a(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Profile");
            this.f17700e = a("user", "user", b10);
            this.f17701f = a(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, b10);
            this.f17702g = a("blurb", "blurb", b10);
            this.f17703h = a("imageUrl", "imageUrl", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17700e = aVar.f17700e;
            aVar2.f17701f = aVar.f17701f;
            aVar2.f17702g = aVar.f17702g;
            aVar2.f17703h = aVar.f17703h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i7() {
        this.f17699q.p();
    }

    public static Profile c(o0 o0Var, a aVar, Profile profile, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(profile);
        if (oVar != null) {
            return (Profile) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Profile.class), set);
        osObjectBuilder.c1(aVar.f17701f, profile.realmGet$name());
        osObjectBuilder.c1(aVar.f17702g, profile.realmGet$blurb());
        osObjectBuilder.c1(aVar.f17703h, profile.realmGet$imageUrl());
        i7 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(profile, k10);
        User realmGet$user = profile.realmGet$user();
        if (realmGet$user == null) {
            k10.realmSet$user(null);
        } else {
            User user = (User) map.get(realmGet$user);
            if (user != null) {
                k10.realmSet$user(user);
            } else {
                k10.realmSet$user(a8.d(o0Var, (a8.a) o0Var.R().e(User.class), realmGet$user, z10, map, set));
            }
        }
        return k10;
    }

    public static Profile d(o0 o0Var, a aVar, Profile profile, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((profile instanceof io.realm.internal.o) && !d1.isFrozen(profile)) {
            io.realm.internal.o oVar = (io.realm.internal.o) profile;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return profile;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(profile);
        if (oVar2 != null) {
            return (Profile) oVar2;
        }
        return c(o0Var, aVar, profile, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Profile f(Profile profile, int i10, int i11, Map<a1, o.a<a1>> map) {
        Profile profile2;
        if (i10 <= i11 && profile != null) {
            o.a<a1> aVar = map.get(profile);
            if (aVar == null) {
                profile2 = new Profile();
                map.put(profile, new o.a<>(i10, profile2));
            } else if (i10 >= aVar.f17831a) {
                return (Profile) aVar.f17832b;
            } else {
                Profile profile3 = (Profile) aVar.f17832b;
                aVar.f17831a = i10;
                profile2 = profile3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) profile).b().f();
            profile2.realmSet$user(a8.f(profile.realmGet$user(), i10 + 1, i11, map));
            profile2.realmSet$name(profile.realmGet$name());
            profile2.realmSet$blurb(profile.realmGet$blurb());
            profile2.realmSet$imageUrl(profile.realmGet$imageUrl());
            return profile2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Profile", true, 4, 0);
        bVar.a("", "user", RealmFieldType.OBJECT, "User");
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.NAME, realmFieldType, false, false, false);
        bVar.b("", "blurb", realmFieldType, false, false, false);
        bVar.b("", "imageUrl", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17697r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Profile profile, Map<a1, Long> map) {
        if ((profile instanceof io.realm.internal.o) && !d1.isFrozen(profile)) {
            io.realm.internal.o oVar = (io.realm.internal.o) profile;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(Profile.class).getNativePtr();
        a aVar = (a) o0Var.R().e(Profile.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(profile, Long.valueOf(createEmbeddedObject));
        User realmGet$user = profile.realmGet$user();
        if (realmGet$user != null) {
            Long l10 = map.get(realmGet$user);
            if (l10 == null) {
                l10 = Long.valueOf(a8.i(o0Var, realmGet$user, map));
            }
            Table.nativeSetLink(nativePtr, aVar.f17700e, createEmbeddedObject, l10.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f17700e, createEmbeddedObject);
        }
        String realmGet$name = profile.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.f17701f, createEmbeddedObject, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17701f, createEmbeddedObject, false);
        }
        String realmGet$blurb = profile.realmGet$blurb();
        if (realmGet$blurb != null) {
            Table.nativeSetString(nativePtr, aVar.f17702g, createEmbeddedObject, realmGet$blurb, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17702g, createEmbeddedObject, false);
        }
        String realmGet$imageUrl = profile.realmGet$imageUrl();
        if (realmGet$imageUrl != null) {
            Table.nativeSetString(nativePtr, aVar.f17703h, createEmbeddedObject, realmGet$imageUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17703h, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i7 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Profile.class), false, Collections.emptyList());
        i7 i7Var = new i7();
        cVar.a();
        return i7Var;
    }

    static Profile l(o0 o0Var, a aVar, Profile profile, Profile profile2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Profile.class), set);
        User realmGet$user = profile2.realmGet$user();
        if (realmGet$user == null) {
            osObjectBuilder.Z0(aVar.f17700e);
        } else {
            User user = (User) map.get(realmGet$user);
            if (user != null) {
                osObjectBuilder.a1(aVar.f17700e, user);
            } else {
                osObjectBuilder.a1(aVar.f17700e, a8.d(o0Var, (a8.a) o0Var.R().e(User.class), realmGet$user, true, map, set));
            }
        }
        osObjectBuilder.c1(aVar.f17701f, profile2.realmGet$name());
        osObjectBuilder.c1(aVar.f17702g, profile2.realmGet$blurb());
        osObjectBuilder.c1(aVar.f17703h, profile2.realmGet$imageUrl());
        osObjectBuilder.f1((io.realm.internal.o) profile);
        return profile;
    }

    public static void n(o0 o0Var, Profile profile, Profile profile2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Profile.class), profile2, profile, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17699q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17698p = (a) cVar.c();
        l0<Profile> l0Var = new l0<>(this);
        this.f17699q = l0Var;
        l0Var.r(cVar.e());
        this.f17699q.s(cVar.f());
        this.f17699q.o(cVar.b());
        this.f17699q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17699q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i7 i7Var = (i7) obj;
        io.realm.a f10 = this.f17699q.f();
        io.realm.a f11 = i7Var.f17699q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17699q.g().getTable().p();
        String p11 = i7Var.f17699q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17699q.g().getObjectKey() == i7Var.f17699q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17699q.f().getPath();
        String p10 = this.f17699q.g().getTable().p();
        long objectKey = this.f17699q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.Profile, io.realm.j7
    public String realmGet$blurb() {
        this.f17699q.f().e();
        return this.f17699q.g().getString(this.f17698p.f17702g);
    }

    @Override // com.habitrpg.android.habitica.models.user.Profile, io.realm.j7
    public String realmGet$imageUrl() {
        this.f17699q.f().e();
        return this.f17699q.g().getString(this.f17698p.f17703h);
    }

    @Override // com.habitrpg.android.habitica.models.user.Profile, io.realm.j7
    public String realmGet$name() {
        this.f17699q.f().e();
        return this.f17699q.g().getString(this.f17698p.f17701f);
    }

    @Override // com.habitrpg.android.habitica.models.user.Profile, io.realm.j7
    public User realmGet$user() {
        this.f17699q.f().e();
        if (this.f17699q.g().isNullLink(this.f17698p.f17700e)) {
            return null;
        }
        return (User) this.f17699q.f().B(User.class, this.f17699q.g().getLink(this.f17698p.f17700e), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Profile, io.realm.j7
    public void realmSet$blurb(String str) {
        if (this.f17699q.i()) {
            if (!this.f17699q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17699q.g();
            if (str == null) {
                g10.getTable().F(this.f17698p.f17702g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17698p.f17702g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17699q.f().e();
        if (str == null) {
            this.f17699q.g().setNull(this.f17698p.f17702g);
        } else {
            this.f17699q.g().setString(this.f17698p.f17702g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Profile, io.realm.j7
    public void realmSet$imageUrl(String str) {
        if (this.f17699q.i()) {
            if (!this.f17699q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17699q.g();
            if (str == null) {
                g10.getTable().F(this.f17698p.f17703h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17698p.f17703h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17699q.f().e();
        if (str == null) {
            this.f17699q.g().setNull(this.f17698p.f17703h);
        } else {
            this.f17699q.g().setString(this.f17698p.f17703h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Profile, io.realm.j7
    public void realmSet$name(String str) {
        if (this.f17699q.i()) {
            if (!this.f17699q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17699q.g();
            if (str == null) {
                g10.getTable().F(this.f17698p.f17701f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17698p.f17701f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17699q.f().e();
        if (str == null) {
            this.f17699q.g().setNull(this.f17698p.f17701f);
        } else {
            this.f17699q.g().setString(this.f17698p.f17701f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Profile, io.realm.j7
    public void realmSet$user(User user) {
        o0 o0Var = (o0) this.f17699q.f();
        if (this.f17699q.i()) {
            if (!this.f17699q.d() || this.f17699q.e().contains("user")) {
                return;
            }
            if (user != null && !d1.isManaged(user)) {
                user = (User) o0Var.F0(user, new v[0]);
            }
            io.realm.internal.q g10 = this.f17699q.g();
            if (user == null) {
                g10.nullifyLink(this.f17698p.f17700e);
                return;
            }
            this.f17699q.c(user);
            g10.getTable().D(this.f17698p.f17700e, g10.getObjectKey(), ((io.realm.internal.o) user).b().g().getObjectKey(), true);
            return;
        }
        this.f17699q.f().e();
        if (user == null) {
            this.f17699q.g().nullifyLink(this.f17698p.f17700e);
            return;
        }
        this.f17699q.c(user);
        this.f17699q.g().setLink(this.f17698p.f17700e, ((io.realm.internal.o) user).b().g().getObjectKey());
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Profile = proxy[");
        sb2.append("{user:");
        String str4 = "null";
        if (realmGet$user() == null) {
            str = "null";
        } else {
            str = "User";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{name:");
        if (realmGet$name() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$name();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{blurb:");
        if (realmGet$blurb() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$blurb();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{imageUrl:");
        if (realmGet$imageUrl() != null) {
            str4 = realmGet$imageUrl();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
