package y3;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import x3.c;

/* compiled from: FrameworkSQLiteOpenHelper.java */
/* loaded from: classes.dex */
class b implements x3.c {

    /* renamed from: f  reason: collision with root package name */
    private final Context f26261f;

    /* renamed from: m  reason: collision with root package name */
    private final String f26262m;

    /* renamed from: p  reason: collision with root package name */
    private final c.a f26263p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f26264q;

    /* renamed from: r  reason: collision with root package name */
    private final Object f26265r = new Object();

    /* renamed from: s  reason: collision with root package name */
    private a f26266s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f26267t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrameworkSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: f  reason: collision with root package name */
        final y3.a[] f26268f;

        /* renamed from: m  reason: collision with root package name */
        final c.a f26269m;

        /* renamed from: p  reason: collision with root package name */
        private boolean f26270p;

        /* compiled from: FrameworkSQLiteOpenHelper.java */
        /* renamed from: y3.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0606a implements DatabaseErrorHandler {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.a f26271a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ y3.a[] f26272b;

            C0606a(c.a aVar, y3.a[] aVarArr) {
                this.f26271a = aVar;
                this.f26272b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f26271a.c(a.c(this.f26272b, sQLiteDatabase));
            }
        }

        a(Context context, String str, y3.a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.f25712a, new C0606a(aVar, aVarArr));
            this.f26269m = aVar;
            this.f26268f = aVarArr;
        }

        static y3.a c(y3.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            y3.a aVar = aVarArr[0];
            if (aVar == null || !aVar.b(sQLiteDatabase)) {
                aVarArr[0] = new y3.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        y3.a b(SQLiteDatabase sQLiteDatabase) {
            return c(this.f26268f, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f26268f[0] = null;
        }

        synchronized x3.b d() {
            this.f26270p = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f26270p) {
                close();
                return d();
            }
            return b(writableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f26269m.b(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f26269m.d(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f26270p = true;
            this.f26269m.e(b(sQLiteDatabase), i10, i11);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f26270p) {
                this.f26269m.f(b(sQLiteDatabase));
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f26270p = true;
            this.f26269m.g(b(sQLiteDatabase), i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, String str, c.a aVar, boolean z10) {
        this.f26261f = context;
        this.f26262m = str;
        this.f26263p = aVar;
        this.f26264q = z10;
    }

    private a b() {
        a aVar;
        synchronized (this.f26265r) {
            if (this.f26266s == null) {
                y3.a[] aVarArr = new y3.a[1];
                if (Build.VERSION.SDK_INT >= 23 && this.f26262m != null && this.f26264q) {
                    this.f26266s = new a(this.f26261f, new File(this.f26261f.getNoBackupFilesDir(), this.f26262m).getAbsolutePath(), aVarArr, this.f26263p);
                } else {
                    this.f26266s = new a(this.f26261f, this.f26262m, aVarArr, this.f26263p);
                }
                this.f26266s.setWriteAheadLoggingEnabled(this.f26267t);
            }
            aVar = this.f26266s;
        }
        return aVar;
    }

    @Override // x3.c
    public x3.b X() {
        return b().d();
    }

    @Override // x3.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b().close();
    }

    @Override // x3.c
    public String getDatabaseName() {
        return this.f26262m;
    }

    @Override // x3.c
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f26265r) {
            a aVar = this.f26266s;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z10);
            }
            this.f26267t = z10;
        }
    }
}
