package io.realm;

import com.habitrpg.android.habitica.models.user.auth.SocialAuthentication;
import com.habitrpg.android.habitica.ui.activities.GroupInviteActivity;
import io.realm.a;
import io.realm.internal.OsList;
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

/* compiled from: com_habitrpg_android_habitica_models_user_auth_SocialAuthenticationRealmProxy.java */
/* loaded from: classes4.dex */
public class e8 extends SocialAuthentication implements io.realm.internal.o {

    /* renamed from: u  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17505u = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17506p;

    /* renamed from: q  reason: collision with root package name */
    private l0<SocialAuthentication> f17507q;

    /* renamed from: r  reason: collision with root package name */
    private x0<String> f17508r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_auth_SocialAuthenticationRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17509e;

        a(OsSchemaInfo osSchemaInfo) {
            super(1);
            this.f17509e = a(GroupInviteActivity.EMAILS_KEY, GroupInviteActivity.EMAILS_KEY, osSchemaInfo.b("SocialAuthentication"));
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            ((a) cVar2).f17509e = ((a) cVar).f17509e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e8() {
        this.f17507q.p();
    }

    public static SocialAuthentication c(o0 o0Var, a aVar, SocialAuthentication socialAuthentication, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(socialAuthentication);
        if (oVar != null) {
            return (SocialAuthentication) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(SocialAuthentication.class), set);
        osObjectBuilder.d1(aVar.f17509e, socialAuthentication.realmGet$emails());
        e8 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(socialAuthentication, k10);
        return k10;
    }

    public static SocialAuthentication d(o0 o0Var, a aVar, SocialAuthentication socialAuthentication, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((socialAuthentication instanceof io.realm.internal.o) && !d1.isFrozen(socialAuthentication)) {
            io.realm.internal.o oVar = (io.realm.internal.o) socialAuthentication;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return socialAuthentication;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(socialAuthentication);
        if (oVar2 != null) {
            return (SocialAuthentication) oVar2;
        }
        return c(o0Var, aVar, socialAuthentication, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static SocialAuthentication f(SocialAuthentication socialAuthentication, int i10, int i11, Map<a1, o.a<a1>> map) {
        SocialAuthentication socialAuthentication2;
        if (i10 <= i11 && socialAuthentication != null) {
            o.a<a1> aVar = map.get(socialAuthentication);
            if (aVar == null) {
                socialAuthentication2 = new SocialAuthentication();
                map.put(socialAuthentication, new o.a<>(i10, socialAuthentication2));
            } else if (i10 >= aVar.f17831a) {
                return (SocialAuthentication) aVar.f17832b;
            } else {
                SocialAuthentication socialAuthentication3 = (SocialAuthentication) aVar.f17832b;
                aVar.f17831a = i10;
                socialAuthentication2 = socialAuthentication3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) socialAuthentication).b().f();
            socialAuthentication2.realmSet$emails(new x0<>());
            socialAuthentication2.realmGet$emails().addAll(socialAuthentication.realmGet$emails());
            return socialAuthentication2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "SocialAuthentication", true, 1, 0);
        bVar.c("", GroupInviteActivity.EMAILS_KEY, RealmFieldType.STRING_LIST, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17505u;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, SocialAuthentication socialAuthentication, Map<a1, Long> map) {
        if ((socialAuthentication instanceof io.realm.internal.o) && !d1.isFrozen(socialAuthentication)) {
            io.realm.internal.o oVar = (io.realm.internal.o) socialAuthentication;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(SocialAuthentication.class);
        c12.getNativePtr();
        a aVar = (a) o0Var.R().e(SocialAuthentication.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(socialAuthentication, Long.valueOf(createEmbeddedObject));
        OsList osList = new OsList(c12.s(createEmbeddedObject), aVar.f17509e);
        osList.K();
        x0<String> realmGet$emails = socialAuthentication.realmGet$emails();
        if (realmGet$emails != null) {
            Iterator<String> it = realmGet$emails.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.h();
                } else {
                    osList.l(next);
                }
            }
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e8 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(SocialAuthentication.class), false, Collections.emptyList());
        e8 e8Var = new e8();
        cVar.a();
        return e8Var;
    }

    static SocialAuthentication l(o0 o0Var, a aVar, SocialAuthentication socialAuthentication, SocialAuthentication socialAuthentication2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(SocialAuthentication.class), set);
        osObjectBuilder.d1(aVar.f17509e, socialAuthentication2.realmGet$emails());
        osObjectBuilder.f1((io.realm.internal.o) socialAuthentication);
        return socialAuthentication;
    }

    public static void n(o0 o0Var, SocialAuthentication socialAuthentication, SocialAuthentication socialAuthentication2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(SocialAuthentication.class), socialAuthentication2, socialAuthentication, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17507q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17506p = (a) cVar.c();
        l0<SocialAuthentication> l0Var = new l0<>(this);
        this.f17507q = l0Var;
        l0Var.r(cVar.e());
        this.f17507q.s(cVar.f());
        this.f17507q.o(cVar.b());
        this.f17507q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17507q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e8 e8Var = (e8) obj;
        io.realm.a f10 = this.f17507q.f();
        io.realm.a f11 = e8Var.f17507q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17507q.g().getTable().p();
        String p11 = e8Var.f17507q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17507q.g().getObjectKey() == e8Var.f17507q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17507q.f().getPath();
        String p10 = this.f17507q.g().getTable().p();
        long objectKey = this.f17507q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.auth.SocialAuthentication, io.realm.f8
    public x0<String> realmGet$emails() {
        this.f17507q.f().e();
        x0<String> x0Var = this.f17508r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<String> x0Var2 = new x0<>(String.class, this.f17507q.g().getValueList(this.f17506p.f17509e, RealmFieldType.STRING_LIST), this.f17507q.f());
        this.f17508r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.auth.SocialAuthentication, io.realm.f8
    public void realmSet$emails(x0<String> x0Var) {
        if (this.f17507q.i() && (!this.f17507q.d() || this.f17507q.e().contains(GroupInviteActivity.EMAILS_KEY))) {
            return;
        }
        this.f17507q.f().e();
        OsList valueList = this.f17507q.g().getValueList(this.f17506p.f17509e, RealmFieldType.STRING_LIST);
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

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "SocialAuthentication = proxy[{emails:RealmList<String>[" + realmGet$emails().size() + "]}]";
    }
}
