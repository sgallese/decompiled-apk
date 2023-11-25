package io.realm;

import com.habitrpg.android.habitica.models.inventory.Pet;
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

/* compiled from: com_habitrpg_android_habitica_models_inventory_PetRealmProxy.java */
/* loaded from: classes4.dex */
public class w2 extends Pet implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18358r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18359p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Pet> f18360q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_PetRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18361e;

        /* renamed from: f  reason: collision with root package name */
        long f18362f;

        /* renamed from: g  reason: collision with root package name */
        long f18363g;

        /* renamed from: h  reason: collision with root package name */
        long f18364h;

        /* renamed from: i  reason: collision with root package name */
        long f18365i;

        /* renamed from: j  reason: collision with root package name */
        long f18366j;

        a(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Pet");
            this.f18361e = a("key", "key", b10);
            this.f18362f = a("animal", "animal", b10);
            this.f18363g = a("color", "color", b10);
            this.f18364h = a("text", "text", b10);
            this.f18365i = a(TaskFormActivity.TASK_TYPE_KEY, TaskFormActivity.TASK_TYPE_KEY, b10);
            this.f18366j = a("premium", "premium", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18361e = aVar.f18361e;
            aVar2.f18362f = aVar.f18362f;
            aVar2.f18363g = aVar.f18363g;
            aVar2.f18364h = aVar.f18364h;
            aVar2.f18365i = aVar.f18365i;
            aVar2.f18366j = aVar.f18366j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w2() {
        this.f18360q.p();
    }

    public static Pet c(o0 o0Var, a aVar, Pet pet, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(pet);
        if (oVar != null) {
            return (Pet) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Pet.class), set);
        osObjectBuilder.c1(aVar.f18361e, pet.realmGet$key());
        osObjectBuilder.c1(aVar.f18362f, pet.realmGet$animal());
        osObjectBuilder.c1(aVar.f18363g, pet.realmGet$color());
        osObjectBuilder.c1(aVar.f18364h, pet.realmGet$text());
        osObjectBuilder.c1(aVar.f18365i, pet.realmGet$type());
        osObjectBuilder.F0(aVar.f18366j, Boolean.valueOf(pet.realmGet$premium()));
        w2 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(pet, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.inventory.Pet d(io.realm.o0 r8, io.realm.w2.a r9, com.habitrpg.android.habitica.models.inventory.Pet r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.Pet r1 = (com.habitrpg.android.habitica.models.inventory.Pet) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.Pet> r2 = com.habitrpg.android.habitica.models.inventory.Pet.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18361e
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
            io.realm.w2 r1 = new io.realm.w2     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.inventory.Pet r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.inventory.Pet r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.w2.d(io.realm.o0, io.realm.w2$a, com.habitrpg.android.habitica.models.inventory.Pet, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.Pet");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Pet f(Pet pet, int i10, int i11, Map<a1, o.a<a1>> map) {
        Pet pet2;
        if (i10 <= i11 && pet != null) {
            o.a<a1> aVar = map.get(pet);
            if (aVar == null) {
                pet2 = new Pet();
                map.put(pet, new o.a<>(i10, pet2));
            } else if (i10 >= aVar.f17831a) {
                return (Pet) aVar.f17832b;
            } else {
                Pet pet3 = (Pet) aVar.f17832b;
                aVar.f17831a = i10;
                pet2 = pet3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) pet).b().f();
            pet2.realmSet$key(pet.realmGet$key());
            pet2.realmSet$animal(pet.realmGet$animal());
            pet2.realmSet$color(pet.realmGet$color());
            pet2.realmSet$text(pet.realmGet$text());
            pet2.realmSet$type(pet.realmGet$type());
            pet2.realmSet$premium(pet.realmGet$premium());
            return pet2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Pet", false, 6, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, true, false, true);
        bVar.b("", "animal", realmFieldType, false, false, true);
        bVar.b("", "color", realmFieldType, false, false, true);
        bVar.b("", "text", realmFieldType, false, false, false);
        bVar.b("", TaskFormActivity.TASK_TYPE_KEY, realmFieldType, false, false, false);
        bVar.b("", "premium", RealmFieldType.BOOLEAN, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18358r;
    }

    public static long i(o0 o0Var, Pet pet, Map<a1, Long> map) {
        long j10;
        if ((pet instanceof io.realm.internal.o) && !d1.isFrozen(pet)) {
            io.realm.internal.o oVar = (io.realm.internal.o) pet;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Pet.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Pet.class);
        long j11 = aVar.f18361e;
        String realmGet$key = pet.realmGet$key();
        if (realmGet$key != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j11, realmGet$key);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$key);
        }
        long j12 = j10;
        map.put(pet, Long.valueOf(j12));
        String realmGet$animal = pet.realmGet$animal();
        if (realmGet$animal != null) {
            Table.nativeSetString(nativePtr, aVar.f18362f, j12, realmGet$animal, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18362f, j12, false);
        }
        String realmGet$color = pet.realmGet$color();
        if (realmGet$color != null) {
            Table.nativeSetString(nativePtr, aVar.f18363g, j12, realmGet$color, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18363g, j12, false);
        }
        String realmGet$text = pet.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar.f18364h, j12, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18364h, j12, false);
        }
        String realmGet$type = pet.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, aVar.f18365i, j12, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18365i, j12, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f18366j, j12, pet.realmGet$premium(), false);
        return j12;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        Pet pet;
        Table c12 = o0Var.c1(Pet.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Pet.class);
        long j12 = aVar.f18361e;
        while (it.hasNext()) {
            Pet pet2 = (Pet) it.next();
            if (!map.containsKey(pet2)) {
                if ((pet2 instanceof io.realm.internal.o) && !d1.isFrozen(pet2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) pet2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(pet2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = pet2.realmGet$key();
                if (realmGet$key != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j12, realmGet$key);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j11 = OsObject.createRowWithPrimaryKey(c12, j12, realmGet$key);
                } else {
                    j11 = j10;
                }
                map.put(pet2, Long.valueOf(j11));
                String realmGet$animal = pet2.realmGet$animal();
                if (realmGet$animal != null) {
                    pet = pet2;
                    Table.nativeSetString(nativePtr, aVar.f18362f, j11, realmGet$animal, false);
                } else {
                    pet = pet2;
                    Table.nativeSetNull(nativePtr, aVar.f18362f, j11, false);
                }
                String realmGet$color = pet.realmGet$color();
                if (realmGet$color != null) {
                    Table.nativeSetString(nativePtr, aVar.f18363g, j11, realmGet$color, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18363g, j11, false);
                }
                String realmGet$text = pet.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, aVar.f18364h, j11, realmGet$text, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18364h, j11, false);
                }
                String realmGet$type = pet.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, aVar.f18365i, j11, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18365i, j11, false);
                }
                Table.nativeSetBoolean(nativePtr, aVar.f18366j, j11, pet.realmGet$premium(), false);
            }
        }
    }

    static w2 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Pet.class), false, Collections.emptyList());
        w2 w2Var = new w2();
        cVar.a();
        return w2Var;
    }

    static Pet n(o0 o0Var, a aVar, Pet pet, Pet pet2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Pet.class), set);
        osObjectBuilder.c1(aVar.f18361e, pet2.realmGet$key());
        osObjectBuilder.c1(aVar.f18362f, pet2.realmGet$animal());
        osObjectBuilder.c1(aVar.f18363g, pet2.realmGet$color());
        osObjectBuilder.c1(aVar.f18364h, pet2.realmGet$text());
        osObjectBuilder.c1(aVar.f18365i, pet2.realmGet$type());
        osObjectBuilder.F0(aVar.f18366j, Boolean.valueOf(pet2.realmGet$premium()));
        osObjectBuilder.g1();
        return pet;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18360q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18359p = (a) cVar.c();
        l0<Pet> l0Var = new l0<>(this);
        this.f18360q = l0Var;
        l0Var.r(cVar.e());
        this.f18360q.s(cVar.f());
        this.f18360q.o(cVar.b());
        this.f18360q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18360q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w2 w2Var = (w2) obj;
        io.realm.a f10 = this.f18360q.f();
        io.realm.a f11 = w2Var.f18360q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18360q.g().getTable().p();
        String p11 = w2Var.f18360q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18360q.g().getObjectKey() == w2Var.f18360q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18360q.f().getPath();
        String p10 = this.f18360q.g().getTable().p();
        long objectKey = this.f18360q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.Pet, io.realm.x2
    public String realmGet$animal() {
        this.f18360q.f().e();
        return this.f18360q.g().getString(this.f18359p.f18362f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Pet, io.realm.x2
    public String realmGet$color() {
        this.f18360q.f().e();
        return this.f18360q.g().getString(this.f18359p.f18363g);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Pet, io.realm.x2
    public String realmGet$key() {
        this.f18360q.f().e();
        return this.f18360q.g().getString(this.f18359p.f18361e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Pet, io.realm.x2
    public boolean realmGet$premium() {
        this.f18360q.f().e();
        return this.f18360q.g().getBoolean(this.f18359p.f18366j);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Pet, io.realm.x2
    public String realmGet$text() {
        this.f18360q.f().e();
        return this.f18360q.g().getString(this.f18359p.f18364h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Pet, io.realm.x2
    public String realmGet$type() {
        this.f18360q.f().e();
        return this.f18360q.g().getString(this.f18359p.f18365i);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Pet, io.realm.x2
    public void realmSet$animal(String str) {
        if (this.f18360q.i()) {
            if (!this.f18360q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18360q.g();
            if (str != null) {
                g10.getTable().G(this.f18359p.f18362f, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'animal' to null.");
        }
        this.f18360q.f().e();
        if (str != null) {
            this.f18360q.g().setString(this.f18359p.f18362f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'animal' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Pet, io.realm.x2
    public void realmSet$color(String str) {
        if (this.f18360q.i()) {
            if (!this.f18360q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18360q.g();
            if (str != null) {
                g10.getTable().G(this.f18359p.f18363g, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'color' to null.");
        }
        this.f18360q.f().e();
        if (str != null) {
            this.f18360q.g().setString(this.f18359p.f18363g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'color' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Pet, io.realm.x2
    public void realmSet$key(String str) {
        if (this.f18360q.i()) {
            return;
        }
        this.f18360q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Pet, io.realm.x2
    public void realmSet$premium(boolean z10) {
        if (this.f18360q.i()) {
            if (!this.f18360q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18360q.g();
            g10.getTable().z(this.f18359p.f18366j, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18360q.f().e();
        this.f18360q.g().setBoolean(this.f18359p.f18366j, z10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Pet, io.realm.x2
    public void realmSet$text(String str) {
        if (this.f18360q.i()) {
            if (!this.f18360q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18360q.g();
            if (str == null) {
                g10.getTable().F(this.f18359p.f18364h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18359p.f18364h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18360q.f().e();
        if (str == null) {
            this.f18360q.g().setNull(this.f18359p.f18364h);
        } else {
            this.f18360q.g().setString(this.f18359p.f18364h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Pet, io.realm.x2
    public void realmSet$type(String str) {
        if (this.f18360q.i()) {
            if (!this.f18360q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18360q.g();
            if (str == null) {
                g10.getTable().F(this.f18359p.f18365i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18359p.f18365i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18360q.f().e();
        if (str == null) {
            this.f18360q.g().setNull(this.f18359p.f18365i);
        } else {
            this.f18360q.g().setString(this.f18359p.f18365i, str);
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Pet = proxy[");
        sb2.append("{key:");
        sb2.append(realmGet$key());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{animal:");
        sb2.append(realmGet$animal());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{color:");
        sb2.append(realmGet$color());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{text:");
        String str2 = "null";
        if (realmGet$text() == null) {
            str = "null";
        } else {
            str = realmGet$text();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{type:");
        if (realmGet$type() != null) {
            str2 = realmGet$type();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{premium:");
        sb2.append(realmGet$premium());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
