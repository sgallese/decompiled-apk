package io.realm;

import com.habitrpg.android.habitica.models.social.ChatMessageLike;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_social_ChatMessageLikeRealmProxy.java */
/* loaded from: classes4.dex */
public class s4 extends ChatMessageLike implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18172r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18173p;

    /* renamed from: q  reason: collision with root package name */
    private l0<ChatMessageLike> f18174q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_social_ChatMessageLikeRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18175e;

        a(OsSchemaInfo osSchemaInfo) {
            super(1);
            this.f18175e = a("id", "id", osSchemaInfo.b("ChatMessageLike"));
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            ((a) cVar2).f18175e = ((a) cVar).f18175e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s4() {
        this.f18174q.p();
    }

    public static ChatMessageLike c(o0 o0Var, a aVar, ChatMessageLike chatMessageLike, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(chatMessageLike);
        if (oVar != null) {
            return (ChatMessageLike) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ChatMessageLike.class), set);
        osObjectBuilder.c1(aVar.f18175e, chatMessageLike.realmGet$id());
        s4 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(chatMessageLike, k10);
        return k10;
    }

    public static ChatMessageLike d(o0 o0Var, a aVar, ChatMessageLike chatMessageLike, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((chatMessageLike instanceof io.realm.internal.o) && !d1.isFrozen(chatMessageLike)) {
            io.realm.internal.o oVar = (io.realm.internal.o) chatMessageLike;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return chatMessageLike;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(chatMessageLike);
        if (oVar2 != null) {
            return (ChatMessageLike) oVar2;
        }
        return c(o0Var, aVar, chatMessageLike, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ChatMessageLike f(ChatMessageLike chatMessageLike, int i10, int i11, Map<a1, o.a<a1>> map) {
        ChatMessageLike chatMessageLike2;
        if (i10 <= i11 && chatMessageLike != null) {
            o.a<a1> aVar = map.get(chatMessageLike);
            if (aVar == null) {
                chatMessageLike2 = new ChatMessageLike();
                map.put(chatMessageLike, new o.a<>(i10, chatMessageLike2));
            } else if (i10 >= aVar.f17831a) {
                return (ChatMessageLike) aVar.f17832b;
            } else {
                ChatMessageLike chatMessageLike3 = (ChatMessageLike) aVar.f17832b;
                aVar.f17831a = i10;
                chatMessageLike2 = chatMessageLike3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) chatMessageLike).b().f();
            chatMessageLike2.realmSet$id(chatMessageLike.realmGet$id());
            return chatMessageLike2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ChatMessageLike", true, 1, 0);
        bVar.b("", "id", RealmFieldType.STRING, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18172r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, ChatMessageLike chatMessageLike, Map<a1, Long> map) {
        if ((chatMessageLike instanceof io.realm.internal.o) && !d1.isFrozen(chatMessageLike)) {
            io.realm.internal.o oVar = (io.realm.internal.o) chatMessageLike;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(ChatMessageLike.class).getNativePtr();
        a aVar = (a) o0Var.R().e(ChatMessageLike.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(chatMessageLike, Long.valueOf(createEmbeddedObject));
        String realmGet$id = chatMessageLike.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, aVar.f18175e, createEmbeddedObject, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18175e, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s4 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(ChatMessageLike.class), false, Collections.emptyList());
        s4 s4Var = new s4();
        cVar.a();
        return s4Var;
    }

    static ChatMessageLike l(o0 o0Var, a aVar, ChatMessageLike chatMessageLike, ChatMessageLike chatMessageLike2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ChatMessageLike.class), set);
        osObjectBuilder.c1(aVar.f18175e, chatMessageLike2.realmGet$id());
        osObjectBuilder.f1((io.realm.internal.o) chatMessageLike);
        return chatMessageLike;
    }

    public static void n(o0 o0Var, ChatMessageLike chatMessageLike, ChatMessageLike chatMessageLike2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(ChatMessageLike.class), chatMessageLike2, chatMessageLike, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18174q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18173p = (a) cVar.c();
        l0<ChatMessageLike> l0Var = new l0<>(this);
        this.f18174q = l0Var;
        l0Var.r(cVar.e());
        this.f18174q.s(cVar.f());
        this.f18174q.o(cVar.b());
        this.f18174q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18174q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s4 s4Var = (s4) obj;
        io.realm.a f10 = this.f18174q.f();
        io.realm.a f11 = s4Var.f18174q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18174q.g().getTable().p();
        String p11 = s4Var.f18174q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18174q.g().getObjectKey() == s4Var.f18174q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18174q.f().getPath();
        String p10 = this.f18174q.g().getTable().p();
        long objectKey = this.f18174q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.social.ChatMessageLike, io.realm.t4
    public String realmGet$id() {
        this.f18174q.f().e();
        return this.f18174q.g().getString(this.f18173p.f18175e);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessageLike, io.realm.t4
    public void realmSet$id(String str) {
        if (this.f18174q.i()) {
            if (!this.f18174q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18174q.g();
            if (str != null) {
                g10.getTable().G(this.f18173p.f18175e, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
        }
        this.f18174q.f().e();
        if (str != null) {
            this.f18174q.g().setString(this.f18173p.f18175e, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
    }

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "ChatMessageLike = proxy[{id:" + realmGet$id() + "}]";
    }
}
