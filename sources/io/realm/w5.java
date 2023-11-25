package io.realm;

import com.habitrpg.android.habitica.models.auth.LocalAuthentication;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.AuthenticationTimestamps;
import com.habitrpg.android.habitica.models.user.auth.SocialAuthentication;
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

/* compiled from: com_habitrpg_android_habitica_models_user_AuthenticationRealmProxy.java */
/* loaded from: classes4.dex */
public class w5 extends Authentication implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18383r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18384p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Authentication> f18385q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_AuthenticationRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18386e;

        /* renamed from: f  reason: collision with root package name */
        long f18387f;

        /* renamed from: g  reason: collision with root package name */
        long f18388g;

        /* renamed from: h  reason: collision with root package name */
        long f18389h;

        /* renamed from: i  reason: collision with root package name */
        long f18390i;

        /* renamed from: j  reason: collision with root package name */
        long f18391j;

        a(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Authentication");
            this.f18386e = a("blocked", "blocked", b10);
            this.f18387f = a("localAuthentication", "localAuthentication", b10);
            this.f18388g = a("googleAuthentication", "googleAuthentication", b10);
            this.f18389h = a("appleAuthentication", "appleAuthentication", b10);
            this.f18390i = a("facebookAuthentication", "facebookAuthentication", b10);
            this.f18391j = a("timestamps", "timestamps", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18386e = aVar.f18386e;
            aVar2.f18387f = aVar.f18387f;
            aVar2.f18388g = aVar.f18388g;
            aVar2.f18389h = aVar.f18389h;
            aVar2.f18390i = aVar.f18390i;
            aVar2.f18391j = aVar.f18391j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w5() {
        this.f18385q.p();
    }

    public static Authentication c(o0 o0Var, a aVar, Authentication authentication, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(authentication);
        if (oVar != null) {
            return (Authentication) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Authentication.class), set);
        osObjectBuilder.F0(aVar.f18386e, Boolean.valueOf(authentication.realmGet$blocked()));
        w5 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(authentication, k10);
        LocalAuthentication realmGet$localAuthentication = authentication.realmGet$localAuthentication();
        if (realmGet$localAuthentication == null) {
            k10.realmSet$localAuthentication(null);
        } else if (((LocalAuthentication) map.get(realmGet$localAuthentication)) == null) {
            g2 k11 = g2.k(o0Var, o0Var.c1(LocalAuthentication.class).s(k10.b().g().createEmbeddedObject(aVar.f18387f, RealmFieldType.OBJECT)));
            map.put(realmGet$localAuthentication, k11);
            g2.n(o0Var, realmGet$localAuthentication, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachelocalAuthentication.toString()");
        }
        SocialAuthentication realmGet$googleAuthentication = authentication.realmGet$googleAuthentication();
        if (realmGet$googleAuthentication == null) {
            k10.realmSet$googleAuthentication(null);
        } else if (((SocialAuthentication) map.get(realmGet$googleAuthentication)) == null) {
            e8 k12 = e8.k(o0Var, o0Var.c1(SocialAuthentication.class).s(k10.b().g().createEmbeddedObject(aVar.f18388g, RealmFieldType.OBJECT)));
            map.put(realmGet$googleAuthentication, k12);
            e8.n(o0Var, realmGet$googleAuthentication, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachegoogleAuthentication.toString()");
        }
        SocialAuthentication realmGet$appleAuthentication = authentication.realmGet$appleAuthentication();
        if (realmGet$appleAuthentication == null) {
            k10.realmSet$appleAuthentication(null);
        } else if (((SocialAuthentication) map.get(realmGet$appleAuthentication)) == null) {
            e8 k13 = e8.k(o0Var, o0Var.c1(SocialAuthentication.class).s(k10.b().g().createEmbeddedObject(aVar.f18389h, RealmFieldType.OBJECT)));
            map.put(realmGet$appleAuthentication, k13);
            e8.n(o0Var, realmGet$appleAuthentication, k13, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheappleAuthentication.toString()");
        }
        SocialAuthentication realmGet$facebookAuthentication = authentication.realmGet$facebookAuthentication();
        if (realmGet$facebookAuthentication == null) {
            k10.realmSet$facebookAuthentication(null);
        } else if (((SocialAuthentication) map.get(realmGet$facebookAuthentication)) == null) {
            e8 k14 = e8.k(o0Var, o0Var.c1(SocialAuthentication.class).s(k10.b().g().createEmbeddedObject(aVar.f18390i, RealmFieldType.OBJECT)));
            map.put(realmGet$facebookAuthentication, k14);
            e8.n(o0Var, realmGet$facebookAuthentication, k14, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachefacebookAuthentication.toString()");
        }
        AuthenticationTimestamps realmGet$timestamps = authentication.realmGet$timestamps();
        if (realmGet$timestamps == null) {
            k10.realmSet$timestamps(null);
        } else if (((AuthenticationTimestamps) map.get(realmGet$timestamps)) == null) {
            y5 k15 = y5.k(o0Var, o0Var.c1(AuthenticationTimestamps.class).s(k10.b().g().createEmbeddedObject(aVar.f18391j, RealmFieldType.OBJECT)));
            map.put(realmGet$timestamps, k15);
            y5.n(o0Var, realmGet$timestamps, k15, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachetimestamps.toString()");
        }
        return k10;
    }

    public static Authentication d(o0 o0Var, a aVar, Authentication authentication, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((authentication instanceof io.realm.internal.o) && !d1.isFrozen(authentication)) {
            io.realm.internal.o oVar = (io.realm.internal.o) authentication;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return authentication;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(authentication);
        if (oVar2 != null) {
            return (Authentication) oVar2;
        }
        return c(o0Var, aVar, authentication, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Authentication f(Authentication authentication, int i10, int i11, Map<a1, o.a<a1>> map) {
        Authentication authentication2;
        if (i10 <= i11 && authentication != null) {
            o.a<a1> aVar = map.get(authentication);
            if (aVar == null) {
                authentication2 = new Authentication();
                map.put(authentication, new o.a<>(i10, authentication2));
            } else if (i10 >= aVar.f17831a) {
                return (Authentication) aVar.f17832b;
            } else {
                Authentication authentication3 = (Authentication) aVar.f17832b;
                aVar.f17831a = i10;
                authentication2 = authentication3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) authentication).b().f();
            authentication2.realmSet$blocked(authentication.realmGet$blocked());
            int i12 = i10 + 1;
            authentication2.realmSet$localAuthentication(g2.f(authentication.realmGet$localAuthentication(), i12, i11, map));
            authentication2.realmSet$googleAuthentication(e8.f(authentication.realmGet$googleAuthentication(), i12, i11, map));
            authentication2.realmSet$appleAuthentication(e8.f(authentication.realmGet$appleAuthentication(), i12, i11, map));
            authentication2.realmSet$facebookAuthentication(e8.f(authentication.realmGet$facebookAuthentication(), i12, i11, map));
            authentication2.realmSet$timestamps(y5.f(authentication.realmGet$timestamps(), i12, i11, map));
            return authentication2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Authentication", true, 6, 0);
        bVar.b("", "blocked", RealmFieldType.BOOLEAN, false, false, true);
        RealmFieldType realmFieldType = RealmFieldType.OBJECT;
        bVar.a("", "localAuthentication", realmFieldType, "LocalAuthentication");
        bVar.a("", "googleAuthentication", realmFieldType, "SocialAuthentication");
        bVar.a("", "appleAuthentication", realmFieldType, "SocialAuthentication");
        bVar.a("", "facebookAuthentication", realmFieldType, "SocialAuthentication");
        bVar.a("", "timestamps", realmFieldType, "AuthenticationTimestamps");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18383r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Authentication authentication, Map<a1, Long> map) {
        a aVar;
        if ((authentication instanceof io.realm.internal.o) && !d1.isFrozen(authentication)) {
            io.realm.internal.o oVar = (io.realm.internal.o) authentication;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Authentication.class);
        long nativePtr = c12.getNativePtr();
        a aVar2 = (a) o0Var.R().e(Authentication.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(authentication, Long.valueOf(createEmbeddedObject));
        Table.nativeSetBoolean(nativePtr, aVar2.f18386e, createEmbeddedObject, authentication.realmGet$blocked(), false);
        LocalAuthentication realmGet$localAuthentication = authentication.realmGet$localAuthentication();
        if (realmGet$localAuthentication != null) {
            Long l10 = map.get(realmGet$localAuthentication);
            if (l10 == null) {
                aVar = aVar2;
                g2.i(o0Var, c12, aVar2.f18387f, createEmbeddedObject, realmGet$localAuthentication, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
            }
        } else {
            aVar = aVar2;
            Table.nativeNullifyLink(nativePtr, aVar.f18387f, createEmbeddedObject);
        }
        SocialAuthentication realmGet$googleAuthentication = authentication.realmGet$googleAuthentication();
        if (realmGet$googleAuthentication != null) {
            Long l11 = map.get(realmGet$googleAuthentication);
            if (l11 == null) {
                e8.i(o0Var, c12, aVar.f18388g, createEmbeddedObject, realmGet$googleAuthentication, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l11.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f18388g, createEmbeddedObject);
        }
        SocialAuthentication realmGet$appleAuthentication = authentication.realmGet$appleAuthentication();
        if (realmGet$appleAuthentication != null) {
            Long l12 = map.get(realmGet$appleAuthentication);
            if (l12 == null) {
                e8.i(o0Var, c12, aVar.f18389h, createEmbeddedObject, realmGet$appleAuthentication, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l12.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f18389h, createEmbeddedObject);
        }
        SocialAuthentication realmGet$facebookAuthentication = authentication.realmGet$facebookAuthentication();
        if (realmGet$facebookAuthentication != null) {
            Long l13 = map.get(realmGet$facebookAuthentication);
            if (l13 == null) {
                e8.i(o0Var, c12, aVar.f18390i, createEmbeddedObject, realmGet$facebookAuthentication, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l13.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f18390i, createEmbeddedObject);
        }
        AuthenticationTimestamps realmGet$timestamps = authentication.realmGet$timestamps();
        if (realmGet$timestamps != null) {
            Long l14 = map.get(realmGet$timestamps);
            if (l14 == null) {
                y5.i(o0Var, c12, aVar.f18391j, createEmbeddedObject, realmGet$timestamps, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l14.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f18391j, createEmbeddedObject);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w5 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Authentication.class), false, Collections.emptyList());
        w5 w5Var = new w5();
        cVar.a();
        return w5Var;
    }

    static Authentication l(o0 o0Var, a aVar, Authentication authentication, Authentication authentication2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Authentication.class), set);
        osObjectBuilder.F0(aVar.f18386e, Boolean.valueOf(authentication2.realmGet$blocked()));
        LocalAuthentication realmGet$localAuthentication = authentication2.realmGet$localAuthentication();
        if (realmGet$localAuthentication == null) {
            osObjectBuilder.Z0(aVar.f18387f);
        } else if (((LocalAuthentication) map.get(realmGet$localAuthentication)) == null) {
            g2 k10 = g2.k(o0Var, o0Var.c1(LocalAuthentication.class).s(((io.realm.internal.o) authentication).b().g().createEmbeddedObject(aVar.f18387f, RealmFieldType.OBJECT)));
            map.put(realmGet$localAuthentication, k10);
            g2.n(o0Var, realmGet$localAuthentication, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachelocalAuthentication.toString()");
        }
        SocialAuthentication realmGet$googleAuthentication = authentication2.realmGet$googleAuthentication();
        if (realmGet$googleAuthentication == null) {
            osObjectBuilder.Z0(aVar.f18388g);
        } else if (((SocialAuthentication) map.get(realmGet$googleAuthentication)) == null) {
            e8 k11 = e8.k(o0Var, o0Var.c1(SocialAuthentication.class).s(((io.realm.internal.o) authentication).b().g().createEmbeddedObject(aVar.f18388g, RealmFieldType.OBJECT)));
            map.put(realmGet$googleAuthentication, k11);
            e8.n(o0Var, realmGet$googleAuthentication, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachegoogleAuthentication.toString()");
        }
        SocialAuthentication realmGet$appleAuthentication = authentication2.realmGet$appleAuthentication();
        if (realmGet$appleAuthentication == null) {
            osObjectBuilder.Z0(aVar.f18389h);
        } else if (((SocialAuthentication) map.get(realmGet$appleAuthentication)) == null) {
            e8 k12 = e8.k(o0Var, o0Var.c1(SocialAuthentication.class).s(((io.realm.internal.o) authentication).b().g().createEmbeddedObject(aVar.f18389h, RealmFieldType.OBJECT)));
            map.put(realmGet$appleAuthentication, k12);
            e8.n(o0Var, realmGet$appleAuthentication, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheappleAuthentication.toString()");
        }
        SocialAuthentication realmGet$facebookAuthentication = authentication2.realmGet$facebookAuthentication();
        if (realmGet$facebookAuthentication == null) {
            osObjectBuilder.Z0(aVar.f18390i);
        } else if (((SocialAuthentication) map.get(realmGet$facebookAuthentication)) == null) {
            e8 k13 = e8.k(o0Var, o0Var.c1(SocialAuthentication.class).s(((io.realm.internal.o) authentication).b().g().createEmbeddedObject(aVar.f18390i, RealmFieldType.OBJECT)));
            map.put(realmGet$facebookAuthentication, k13);
            e8.n(o0Var, realmGet$facebookAuthentication, k13, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachefacebookAuthentication.toString()");
        }
        AuthenticationTimestamps realmGet$timestamps = authentication2.realmGet$timestamps();
        if (realmGet$timestamps == null) {
            osObjectBuilder.Z0(aVar.f18391j);
        } else if (((AuthenticationTimestamps) map.get(realmGet$timestamps)) == null) {
            y5 k14 = y5.k(o0Var, o0Var.c1(AuthenticationTimestamps.class).s(((io.realm.internal.o) authentication).b().g().createEmbeddedObject(aVar.f18391j, RealmFieldType.OBJECT)));
            map.put(realmGet$timestamps, k14);
            y5.n(o0Var, realmGet$timestamps, k14, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachetimestamps.toString()");
        }
        osObjectBuilder.f1((io.realm.internal.o) authentication);
        return authentication;
    }

    public static void n(o0 o0Var, Authentication authentication, Authentication authentication2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Authentication.class), authentication2, authentication, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18385q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18384p = (a) cVar.c();
        l0<Authentication> l0Var = new l0<>(this);
        this.f18385q = l0Var;
        l0Var.r(cVar.e());
        this.f18385q.s(cVar.f());
        this.f18385q.o(cVar.b());
        this.f18385q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18385q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w5 w5Var = (w5) obj;
        io.realm.a f10 = this.f18385q.f();
        io.realm.a f11 = w5Var.f18385q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18385q.g().getTable().p();
        String p11 = w5Var.f18385q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18385q.g().getObjectKey() == w5Var.f18385q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18385q.f().getPath();
        String p10 = this.f18385q.g().getTable().p();
        long objectKey = this.f18385q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.Authentication, io.realm.x5
    public SocialAuthentication realmGet$appleAuthentication() {
        this.f18385q.f().e();
        if (this.f18385q.g().isNullLink(this.f18384p.f18389h)) {
            return null;
        }
        return (SocialAuthentication) this.f18385q.f().B(SocialAuthentication.class, this.f18385q.g().getLink(this.f18384p.f18389h), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Authentication, io.realm.x5
    public boolean realmGet$blocked() {
        this.f18385q.f().e();
        return this.f18385q.g().getBoolean(this.f18384p.f18386e);
    }

    @Override // com.habitrpg.android.habitica.models.user.Authentication, io.realm.x5
    public SocialAuthentication realmGet$facebookAuthentication() {
        this.f18385q.f().e();
        if (this.f18385q.g().isNullLink(this.f18384p.f18390i)) {
            return null;
        }
        return (SocialAuthentication) this.f18385q.f().B(SocialAuthentication.class, this.f18385q.g().getLink(this.f18384p.f18390i), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Authentication, io.realm.x5
    public SocialAuthentication realmGet$googleAuthentication() {
        this.f18385q.f().e();
        if (this.f18385q.g().isNullLink(this.f18384p.f18388g)) {
            return null;
        }
        return (SocialAuthentication) this.f18385q.f().B(SocialAuthentication.class, this.f18385q.g().getLink(this.f18384p.f18388g), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Authentication, io.realm.x5
    public LocalAuthentication realmGet$localAuthentication() {
        this.f18385q.f().e();
        if (this.f18385q.g().isNullLink(this.f18384p.f18387f)) {
            return null;
        }
        return (LocalAuthentication) this.f18385q.f().B(LocalAuthentication.class, this.f18385q.g().getLink(this.f18384p.f18387f), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Authentication, io.realm.x5
    public AuthenticationTimestamps realmGet$timestamps() {
        this.f18385q.f().e();
        if (this.f18385q.g().isNullLink(this.f18384p.f18391j)) {
            return null;
        }
        return (AuthenticationTimestamps) this.f18385q.f().B(AuthenticationTimestamps.class, this.f18385q.g().getLink(this.f18384p.f18391j), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Authentication, io.realm.x5
    public void realmSet$appleAuthentication(SocialAuthentication socialAuthentication) {
        o0 o0Var = (o0) this.f18385q.f();
        if (this.f18385q.i()) {
            if (!this.f18385q.d() || this.f18385q.e().contains("appleAuthentication")) {
                return;
            }
            if (socialAuthentication != null && !d1.isManaged(socialAuthentication)) {
                SocialAuthentication socialAuthentication2 = (SocialAuthentication) o0Var.J0(SocialAuthentication.class, this, "appleAuthentication");
                e8.n(o0Var, socialAuthentication, socialAuthentication2, new HashMap(), Collections.EMPTY_SET);
                socialAuthentication = socialAuthentication2;
            }
            io.realm.internal.q g10 = this.f18385q.g();
            if (socialAuthentication == null) {
                g10.nullifyLink(this.f18384p.f18389h);
                return;
            }
            this.f18385q.c(socialAuthentication);
            g10.getTable().D(this.f18384p.f18389h, g10.getObjectKey(), ((io.realm.internal.o) socialAuthentication).b().g().getObjectKey(), true);
            return;
        }
        this.f18385q.f().e();
        if (socialAuthentication == null) {
            this.f18385q.g().nullifyLink(this.f18384p.f18389h);
            return;
        }
        if (d1.isManaged(socialAuthentication)) {
            this.f18385q.c(socialAuthentication);
        }
        e8.n(o0Var, socialAuthentication, (SocialAuthentication) o0Var.J0(SocialAuthentication.class, this, "appleAuthentication"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.Authentication, io.realm.x5
    public void realmSet$blocked(boolean z10) {
        if (this.f18385q.i()) {
            if (!this.f18385q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18385q.g();
            g10.getTable().z(this.f18384p.f18386e, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18385q.f().e();
        this.f18385q.g().setBoolean(this.f18384p.f18386e, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Authentication, io.realm.x5
    public void realmSet$facebookAuthentication(SocialAuthentication socialAuthentication) {
        o0 o0Var = (o0) this.f18385q.f();
        if (this.f18385q.i()) {
            if (!this.f18385q.d() || this.f18385q.e().contains("facebookAuthentication")) {
                return;
            }
            if (socialAuthentication != null && !d1.isManaged(socialAuthentication)) {
                SocialAuthentication socialAuthentication2 = (SocialAuthentication) o0Var.J0(SocialAuthentication.class, this, "facebookAuthentication");
                e8.n(o0Var, socialAuthentication, socialAuthentication2, new HashMap(), Collections.EMPTY_SET);
                socialAuthentication = socialAuthentication2;
            }
            io.realm.internal.q g10 = this.f18385q.g();
            if (socialAuthentication == null) {
                g10.nullifyLink(this.f18384p.f18390i);
                return;
            }
            this.f18385q.c(socialAuthentication);
            g10.getTable().D(this.f18384p.f18390i, g10.getObjectKey(), ((io.realm.internal.o) socialAuthentication).b().g().getObjectKey(), true);
            return;
        }
        this.f18385q.f().e();
        if (socialAuthentication == null) {
            this.f18385q.g().nullifyLink(this.f18384p.f18390i);
            return;
        }
        if (d1.isManaged(socialAuthentication)) {
            this.f18385q.c(socialAuthentication);
        }
        e8.n(o0Var, socialAuthentication, (SocialAuthentication) o0Var.J0(SocialAuthentication.class, this, "facebookAuthentication"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.Authentication, io.realm.x5
    public void realmSet$googleAuthentication(SocialAuthentication socialAuthentication) {
        o0 o0Var = (o0) this.f18385q.f();
        if (this.f18385q.i()) {
            if (!this.f18385q.d() || this.f18385q.e().contains("googleAuthentication")) {
                return;
            }
            if (socialAuthentication != null && !d1.isManaged(socialAuthentication)) {
                SocialAuthentication socialAuthentication2 = (SocialAuthentication) o0Var.J0(SocialAuthentication.class, this, "googleAuthentication");
                e8.n(o0Var, socialAuthentication, socialAuthentication2, new HashMap(), Collections.EMPTY_SET);
                socialAuthentication = socialAuthentication2;
            }
            io.realm.internal.q g10 = this.f18385q.g();
            if (socialAuthentication == null) {
                g10.nullifyLink(this.f18384p.f18388g);
                return;
            }
            this.f18385q.c(socialAuthentication);
            g10.getTable().D(this.f18384p.f18388g, g10.getObjectKey(), ((io.realm.internal.o) socialAuthentication).b().g().getObjectKey(), true);
            return;
        }
        this.f18385q.f().e();
        if (socialAuthentication == null) {
            this.f18385q.g().nullifyLink(this.f18384p.f18388g);
            return;
        }
        if (d1.isManaged(socialAuthentication)) {
            this.f18385q.c(socialAuthentication);
        }
        e8.n(o0Var, socialAuthentication, (SocialAuthentication) o0Var.J0(SocialAuthentication.class, this, "googleAuthentication"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.Authentication, io.realm.x5
    public void realmSet$localAuthentication(LocalAuthentication localAuthentication) {
        o0 o0Var = (o0) this.f18385q.f();
        if (this.f18385q.i()) {
            if (!this.f18385q.d() || this.f18385q.e().contains("localAuthentication")) {
                return;
            }
            if (localAuthentication != null && !d1.isManaged(localAuthentication)) {
                LocalAuthentication localAuthentication2 = (LocalAuthentication) o0Var.J0(LocalAuthentication.class, this, "localAuthentication");
                g2.n(o0Var, localAuthentication, localAuthentication2, new HashMap(), Collections.EMPTY_SET);
                localAuthentication = localAuthentication2;
            }
            io.realm.internal.q g10 = this.f18385q.g();
            if (localAuthentication == null) {
                g10.nullifyLink(this.f18384p.f18387f);
                return;
            }
            this.f18385q.c(localAuthentication);
            g10.getTable().D(this.f18384p.f18387f, g10.getObjectKey(), ((io.realm.internal.o) localAuthentication).b().g().getObjectKey(), true);
            return;
        }
        this.f18385q.f().e();
        if (localAuthentication == null) {
            this.f18385q.g().nullifyLink(this.f18384p.f18387f);
            return;
        }
        if (d1.isManaged(localAuthentication)) {
            this.f18385q.c(localAuthentication);
        }
        g2.n(o0Var, localAuthentication, (LocalAuthentication) o0Var.J0(LocalAuthentication.class, this, "localAuthentication"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.Authentication, io.realm.x5
    public void realmSet$timestamps(AuthenticationTimestamps authenticationTimestamps) {
        o0 o0Var = (o0) this.f18385q.f();
        if (this.f18385q.i()) {
            if (!this.f18385q.d() || this.f18385q.e().contains("timestamps")) {
                return;
            }
            if (authenticationTimestamps != null && !d1.isManaged(authenticationTimestamps)) {
                AuthenticationTimestamps authenticationTimestamps2 = (AuthenticationTimestamps) o0Var.J0(AuthenticationTimestamps.class, this, "timestamps");
                y5.n(o0Var, authenticationTimestamps, authenticationTimestamps2, new HashMap(), Collections.EMPTY_SET);
                authenticationTimestamps = authenticationTimestamps2;
            }
            io.realm.internal.q g10 = this.f18385q.g();
            if (authenticationTimestamps == null) {
                g10.nullifyLink(this.f18384p.f18391j);
                return;
            }
            this.f18385q.c(authenticationTimestamps);
            g10.getTable().D(this.f18384p.f18391j, g10.getObjectKey(), ((io.realm.internal.o) authenticationTimestamps).b().g().getObjectKey(), true);
            return;
        }
        this.f18385q.f().e();
        if (authenticationTimestamps == null) {
            this.f18385q.g().nullifyLink(this.f18384p.f18391j);
            return;
        }
        if (d1.isManaged(authenticationTimestamps)) {
            this.f18385q.c(authenticationTimestamps);
        }
        y5.n(o0Var, authenticationTimestamps, (AuthenticationTimestamps) o0Var.J0(AuthenticationTimestamps.class, this, "timestamps"), new HashMap(), Collections.EMPTY_SET);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Authentication = proxy[");
        sb2.append("{blocked:");
        sb2.append(realmGet$blocked());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{localAuthentication:");
        String str4 = "null";
        if (realmGet$localAuthentication() == null) {
            str = "null";
        } else {
            str = "LocalAuthentication";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{googleAuthentication:");
        String str5 = "SocialAuthentication";
        if (realmGet$googleAuthentication() == null) {
            str2 = "null";
        } else {
            str2 = "SocialAuthentication";
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{appleAuthentication:");
        if (realmGet$appleAuthentication() == null) {
            str3 = "null";
        } else {
            str3 = "SocialAuthentication";
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{facebookAuthentication:");
        if (realmGet$facebookAuthentication() == null) {
            str5 = "null";
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{timestamps:");
        if (realmGet$timestamps() != null) {
            str4 = "AuthenticationTimestamps";
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
