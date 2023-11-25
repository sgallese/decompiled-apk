package x3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: SupportSQLiteOpenHelper.java */
/* loaded from: classes.dex */
public interface c extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f25713a;

        /* renamed from: b  reason: collision with root package name */
        public final String f25714b;

        /* renamed from: c  reason: collision with root package name */
        public final a f25715c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f25716d;

        /* compiled from: SupportSQLiteOpenHelper.java */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            Context f25717a;

            /* renamed from: b  reason: collision with root package name */
            String f25718b;

            /* renamed from: c  reason: collision with root package name */
            a f25719c;

            /* renamed from: d  reason: collision with root package name */
            boolean f25720d;

            a(Context context) {
                this.f25717a = context;
            }

            public b a() {
                if (this.f25719c != null) {
                    if (this.f25717a != null) {
                        if (this.f25720d && TextUtils.isEmpty(this.f25718b)) {
                            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                        }
                        return new b(this.f25717a, this.f25718b, this.f25719c, this.f25720d);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            public a b(a aVar) {
                this.f25719c = aVar;
                return this;
            }

            public a c(String str) {
                this.f25718b = str;
                return this;
            }

            public a d(boolean z10) {
                this.f25720d = z10;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z10) {
            this.f25713a = context;
            this.f25714b = str;
            this.f25715c = aVar;
            this.f25716d = z10;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* renamed from: x3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0584c {
        c a(b bVar);
    }

    x3.b X();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f25712a;

        public a(int i10) {
            this.f25712a = i10;
        }

        private void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e10) {
                    Log.w("SupportSQLite", "delete failed: ", e10);
                }
            }
        }

        public void c(x3.b bVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar.getPath());
            if (!bVar.isOpen()) {
                a(bVar.getPath());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = bVar.k();
                } catch (SQLiteException unused) {
                }
                try {
                    bVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    Iterator<Pair<String, String>> it = list.iterator();
                    while (it.hasNext()) {
                        a((String) it.next().second);
                    }
                } else {
                    a(bVar.getPath());
                }
            }
        }

        public abstract void d(x3.b bVar);

        public abstract void e(x3.b bVar, int i10, int i11);

        public abstract void g(x3.b bVar, int i10, int i11);

        public void b(x3.b bVar) {
        }

        public void f(x3.b bVar) {
        }
    }
}
