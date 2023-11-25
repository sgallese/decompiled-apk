package io.realm;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.Tag;
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

/* compiled from: com_habitrpg_android_habitica_models_TagRealmProxy.java */
/* loaded from: classes4.dex */
public class w1 extends Tag implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18350r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18351p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Tag> f18352q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_TagRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18353e;

        /* renamed from: f  reason: collision with root package name */
        long f18354f;

        /* renamed from: g  reason: collision with root package name */
        long f18355g;

        /* renamed from: h  reason: collision with root package name */
        long f18356h;

        /* renamed from: i  reason: collision with root package name */
        long f18357i;

        a(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Tag");
            this.f18353e = a("id", "id", b10);
            this.f18354f = a(TaskFormActivity.USER_ID_KEY, TaskFormActivity.USER_ID_KEY, b10);
            this.f18355g = a(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, b10);
            this.f18356h = a("group", "group", b10);
            this.f18357i = a(ClientData.KEY_CHALLENGE, ClientData.KEY_CHALLENGE, b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18353e = aVar.f18353e;
            aVar2.f18354f = aVar.f18354f;
            aVar2.f18355g = aVar.f18355g;
            aVar2.f18356h = aVar.f18356h;
            aVar2.f18357i = aVar.f18357i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w1() {
        this.f18352q.p();
    }

    public static Tag c(o0 o0Var, a aVar, Tag tag, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(tag);
        if (oVar != null) {
            return (Tag) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Tag.class), set);
        osObjectBuilder.c1(aVar.f18353e, tag.realmGet$id());
        osObjectBuilder.c1(aVar.f18354f, tag.realmGet$userId());
        osObjectBuilder.c1(aVar.f18355g, tag.realmGet$name());
        osObjectBuilder.c1(aVar.f18356h, tag.realmGet$group());
        osObjectBuilder.F0(aVar.f18357i, Boolean.valueOf(tag.realmGet$challenge()));
        w1 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(tag, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.Tag d(io.realm.o0 r8, io.realm.w1.a r9, com.habitrpg.android.habitica.models.Tag r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.Tag r1 = (com.habitrpg.android.habitica.models.Tag) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.Tag> r2 = com.habitrpg.android.habitica.models.Tag.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18353e
            java.lang.String r5 = r10.realmGet$id()
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
            io.realm.w1 r1 = new io.realm.w1     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.Tag r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.Tag r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.w1.d(io.realm.o0, io.realm.w1$a, com.habitrpg.android.habitica.models.Tag, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.Tag");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Tag f(Tag tag, int i10, int i11, Map<a1, o.a<a1>> map) {
        Tag tag2;
        if (i10 <= i11 && tag != null) {
            o.a<a1> aVar = map.get(tag);
            if (aVar == null) {
                tag2 = new Tag();
                map.put(tag, new o.a<>(i10, tag2));
            } else if (i10 >= aVar.f17831a) {
                return (Tag) aVar.f17832b;
            } else {
                Tag tag3 = (Tag) aVar.f17832b;
                aVar.f17831a = i10;
                tag2 = tag3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) tag).b().f();
            tag2.realmSet$id(tag.realmGet$id());
            tag2.realmSet$userId(tag.realmGet$userId());
            tag2.realmSet$name(tag.realmGet$name());
            tag2.realmSet$group(tag.realmGet$group());
            tag2.realmSet$challenge(tag.realmGet$challenge());
            return tag2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Tag", false, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, true);
        bVar.b("", TaskFormActivity.USER_ID_KEY, realmFieldType, false, false, false);
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.NAME, realmFieldType, false, false, true);
        bVar.b("", "group", realmFieldType, false, false, false);
        bVar.b("", ClientData.KEY_CHALLENGE, RealmFieldType.BOOLEAN, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18350r;
    }

    public static long i(o0 o0Var, Tag tag, Map<a1, Long> map) {
        long j10;
        if ((tag instanceof io.realm.internal.o) && !d1.isFrozen(tag)) {
            io.realm.internal.o oVar = (io.realm.internal.o) tag;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Tag.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Tag.class);
        long j11 = aVar.f18353e;
        String realmGet$id = tag.realmGet$id();
        if (realmGet$id != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j11, realmGet$id);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$id);
        }
        long j12 = j10;
        map.put(tag, Long.valueOf(j12));
        String realmGet$userId = tag.realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(nativePtr, aVar.f18354f, j12, realmGet$userId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18354f, j12, false);
        }
        String realmGet$name = tag.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.f18355g, j12, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18355g, j12, false);
        }
        String realmGet$group = tag.realmGet$group();
        if (realmGet$group != null) {
            Table.nativeSetString(nativePtr, aVar.f18356h, j12, realmGet$group, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18356h, j12, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f18357i, j12, tag.realmGet$challenge(), false);
        return j12;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        Tag tag;
        Table c12 = o0Var.c1(Tag.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Tag.class);
        long j12 = aVar.f18353e;
        while (it.hasNext()) {
            Tag tag2 = (Tag) it.next();
            if (!map.containsKey(tag2)) {
                if ((tag2 instanceof io.realm.internal.o) && !d1.isFrozen(tag2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) tag2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(tag2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$id = tag2.realmGet$id();
                if (realmGet$id != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j12, realmGet$id);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j11 = OsObject.createRowWithPrimaryKey(c12, j12, realmGet$id);
                } else {
                    j11 = j10;
                }
                map.put(tag2, Long.valueOf(j11));
                String realmGet$userId = tag2.realmGet$userId();
                if (realmGet$userId != null) {
                    tag = tag2;
                    Table.nativeSetString(nativePtr, aVar.f18354f, j11, realmGet$userId, false);
                } else {
                    tag = tag2;
                    Table.nativeSetNull(nativePtr, aVar.f18354f, j11, false);
                }
                String realmGet$name = tag.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, aVar.f18355g, j11, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18355g, j11, false);
                }
                String realmGet$group = tag.realmGet$group();
                if (realmGet$group != null) {
                    Table.nativeSetString(nativePtr, aVar.f18356h, j11, realmGet$group, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18356h, j11, false);
                }
                Table.nativeSetBoolean(nativePtr, aVar.f18357i, j11, tag.realmGet$challenge(), false);
            }
        }
    }

    static w1 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Tag.class), false, Collections.emptyList());
        w1 w1Var = new w1();
        cVar.a();
        return w1Var;
    }

    static Tag n(o0 o0Var, a aVar, Tag tag, Tag tag2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Tag.class), set);
        osObjectBuilder.c1(aVar.f18353e, tag2.realmGet$id());
        osObjectBuilder.c1(aVar.f18354f, tag2.realmGet$userId());
        osObjectBuilder.c1(aVar.f18355g, tag2.realmGet$name());
        osObjectBuilder.c1(aVar.f18356h, tag2.realmGet$group());
        osObjectBuilder.F0(aVar.f18357i, Boolean.valueOf(tag2.realmGet$challenge()));
        osObjectBuilder.g1();
        return tag;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18352q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18351p = (a) cVar.c();
        l0<Tag> l0Var = new l0<>(this);
        this.f18352q = l0Var;
        l0Var.r(cVar.e());
        this.f18352q.s(cVar.f());
        this.f18352q.o(cVar.b());
        this.f18352q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18352q;
    }

    @Override // com.habitrpg.android.habitica.models.Tag, io.realm.x1
    public boolean realmGet$challenge() {
        this.f18352q.f().e();
        return this.f18352q.g().getBoolean(this.f18351p.f18357i);
    }

    @Override // com.habitrpg.android.habitica.models.Tag, io.realm.x1
    public String realmGet$group() {
        this.f18352q.f().e();
        return this.f18352q.g().getString(this.f18351p.f18356h);
    }

    @Override // com.habitrpg.android.habitica.models.Tag, io.realm.x1
    public String realmGet$id() {
        this.f18352q.f().e();
        return this.f18352q.g().getString(this.f18351p.f18353e);
    }

    @Override // com.habitrpg.android.habitica.models.Tag, io.realm.x1
    public String realmGet$name() {
        this.f18352q.f().e();
        return this.f18352q.g().getString(this.f18351p.f18355g);
    }

    @Override // com.habitrpg.android.habitica.models.Tag, io.realm.x1
    public String realmGet$userId() {
        this.f18352q.f().e();
        return this.f18352q.g().getString(this.f18351p.f18354f);
    }

    @Override // com.habitrpg.android.habitica.models.Tag, io.realm.x1
    public void realmSet$challenge(boolean z10) {
        if (this.f18352q.i()) {
            if (!this.f18352q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18352q.g();
            g10.getTable().z(this.f18351p.f18357i, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18352q.f().e();
        this.f18352q.g().setBoolean(this.f18351p.f18357i, z10);
    }

    @Override // com.habitrpg.android.habitica.models.Tag, io.realm.x1
    public void realmSet$group(String str) {
        if (this.f18352q.i()) {
            if (!this.f18352q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18352q.g();
            if (str == null) {
                g10.getTable().F(this.f18351p.f18356h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18351p.f18356h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18352q.f().e();
        if (str == null) {
            this.f18352q.g().setNull(this.f18351p.f18356h);
        } else {
            this.f18352q.g().setString(this.f18351p.f18356h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.Tag, io.realm.x1
    public void realmSet$id(String str) {
        if (this.f18352q.i()) {
            return;
        }
        this.f18352q.f().e();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.Tag, io.realm.x1
    public void realmSet$name(String str) {
        if (this.f18352q.i()) {
            if (!this.f18352q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18352q.g();
            if (str != null) {
                g10.getTable().G(this.f18351p.f18355g, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        this.f18352q.f().e();
        if (str != null) {
            this.f18352q.g().setString(this.f18351p.f18355g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.Tag, io.realm.x1
    public void realmSet$userId(String str) {
        if (this.f18352q.i()) {
            if (!this.f18352q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18352q.g();
            if (str == null) {
                g10.getTable().F(this.f18351p.f18354f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18351p.f18354f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18352q.f().e();
        if (str == null) {
            this.f18352q.g().setNull(this.f18351p.f18354f);
        } else {
            this.f18352q.g().setString(this.f18351p.f18354f, str);
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Tag = proxy[");
        sb2.append("{id:");
        sb2.append(realmGet$id());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{userId:");
        String str2 = "null";
        if (realmGet$userId() == null) {
            str = "null";
        } else {
            str = realmGet$userId();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{name:");
        sb2.append(realmGet$name());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{group:");
        if (realmGet$group() != null) {
            str2 = realmGet$group();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{challenge:");
        sb2.append(realmGet$challenge());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
