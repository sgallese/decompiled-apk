package androidx.room;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import x3.c;

/* compiled from: RoomOpenHelper.java */
/* loaded from: classes.dex */
public class k extends c.a {

    /* renamed from: b  reason: collision with root package name */
    private androidx.room.a f7053b;

    /* renamed from: c  reason: collision with root package name */
    private final a f7054c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7055d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7056e;

    /* compiled from: RoomOpenHelper.java */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f7057a;

        public a(int i10) {
            this.f7057a = i10;
        }

        protected abstract void a(x3.b bVar);

        protected abstract void b(x3.b bVar);

        protected abstract void c(x3.b bVar);

        protected abstract void d(x3.b bVar);

        protected abstract void e(x3.b bVar);

        protected abstract void f(x3.b bVar);

        protected abstract b g(x3.b bVar);
    }

    /* compiled from: RoomOpenHelper.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f7058a;

        /* renamed from: b  reason: collision with root package name */
        public final String f7059b;

        public b(boolean z10, String str) {
            this.f7058a = z10;
            this.f7059b = str;
        }
    }

    public k(androidx.room.a aVar, a aVar2, String str, String str2) {
        super(aVar2.f7057a);
        this.f7053b = aVar;
        this.f7054c = aVar2;
        this.f7055d = str;
        this.f7056e = str2;
    }

    private void h(x3.b bVar) {
        String str;
        if (k(bVar)) {
            Cursor K0 = bVar.K0(new x3.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (K0.moveToFirst()) {
                    str = K0.getString(0);
                } else {
                    str = null;
                }
                K0.close();
                if (!this.f7055d.equals(str) && !this.f7056e.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
                return;
            } catch (Throwable th) {
                K0.close();
                throw th;
            }
        }
        b g10 = this.f7054c.g(bVar);
        if (g10.f7058a) {
            this.f7054c.e(bVar);
            l(bVar);
            return;
        }
        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f7059b);
    }

    private void i(x3.b bVar) {
        bVar.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(x3.b bVar) {
        Cursor Z = bVar.Z("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (Z.moveToFirst()) {
                if (Z.getInt(0) == 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            Z.close();
        }
    }

    private static boolean k(x3.b bVar) {
        Cursor Z = bVar.Z("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = false;
            if (Z.moveToFirst()) {
                if (Z.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            Z.close();
        }
    }

    private void l(x3.b bVar) {
        i(bVar);
        bVar.o(j.a(this.f7055d));
    }

    @Override // x3.c.a
    public void b(x3.b bVar) {
        super.b(bVar);
    }

    @Override // x3.c.a
    public void d(x3.b bVar) {
        boolean j10 = j(bVar);
        this.f7054c.a(bVar);
        if (!j10) {
            b g10 = this.f7054c.g(bVar);
            if (!g10.f7058a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f7059b);
            }
        }
        l(bVar);
        this.f7054c.c(bVar);
    }

    @Override // x3.c.a
    public void e(x3.b bVar, int i10, int i11) {
        g(bVar, i10, i11);
    }

    @Override // x3.c.a
    public void f(x3.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f7054c.d(bVar);
        this.f7053b = null;
    }

    @Override // x3.c.a
    public void g(x3.b bVar, int i10, int i11) {
        boolean z10;
        List<u3.a> c10;
        androidx.room.a aVar = this.f7053b;
        if (aVar != null && (c10 = aVar.f6963d.c(i10, i11)) != null) {
            this.f7054c.f(bVar);
            Iterator<u3.a> it = c10.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
            b g10 = this.f7054c.g(bVar);
            if (g10.f7058a) {
                this.f7054c.e(bVar);
                l(bVar);
                z10 = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g10.f7059b);
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            androidx.room.a aVar2 = this.f7053b;
            if (aVar2 != null && !aVar2.a(i10, i11)) {
                this.f7054c.b(bVar);
                this.f7054c.a(bVar);
                return;
            }
            throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
    }
}
