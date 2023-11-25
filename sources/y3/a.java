package y3;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import x3.f;

/* compiled from: FrameworkSQLiteDatabase.java */
/* loaded from: classes.dex */
class a implements x3.b {

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f26254m = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: p  reason: collision with root package name */
    private static final String[] f26255p = new String[0];

    /* renamed from: f  reason: collision with root package name */
    private final SQLiteDatabase f26256f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrameworkSQLiteDatabase.java */
    /* renamed from: y3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0605a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x3.e f26257a;

        C0605a(x3.e eVar) {
            this.f26257a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f26257a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* compiled from: FrameworkSQLiteDatabase.java */
    /* loaded from: classes.dex */
    class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x3.e f26259a;

        b(x3.e eVar) {
            this.f26259a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f26259a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(SQLiteDatabase sQLiteDatabase) {
        this.f26256f = sQLiteDatabase;
    }

    @Override // x3.b
    public Cursor K0(x3.e eVar) {
        return this.f26256f.rawQueryWithFactory(new C0605a(eVar), eVar.c(), f26255p, null);
    }

    @Override // x3.b
    public void O() {
        this.f26256f.setTransactionSuccessful();
    }

    @Override // x3.b
    public void P(String str, Object[] objArr) throws SQLException {
        this.f26256f.execSQL(str, objArr);
    }

    @Override // x3.b
    public Cursor Z(String str) {
        return K0(new x3.a(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(SQLiteDatabase sQLiteDatabase) {
        if (this.f26256f == sQLiteDatabase) {
            return true;
        }
        return false;
    }

    @Override // x3.b
    public void beginTransaction() {
        this.f26256f.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f26256f.close();
    }

    @Override // x3.b
    public void e0() {
        this.f26256f.endTransaction();
    }

    @Override // x3.b
    public String getPath() {
        return this.f26256f.getPath();
    }

    @Override // x3.b
    public boolean isOpen() {
        return this.f26256f.isOpen();
    }

    @Override // x3.b
    public List<Pair<String, String>> k() {
        return this.f26256f.getAttachedDbs();
    }

    @Override // x3.b
    public Cursor n(x3.e eVar, CancellationSignal cancellationSignal) {
        return this.f26256f.rawQueryWithFactory(new b(eVar), eVar.c(), f26255p, null, cancellationSignal);
    }

    @Override // x3.b
    public void o(String str) throws SQLException {
        this.f26256f.execSQL(str);
    }

    @Override // x3.b
    public f v(String str) {
        return new e(this.f26256f.compileStatement(str));
    }

    @Override // x3.b
    public boolean w0() {
        return this.f26256f.inTransaction();
    }
}
