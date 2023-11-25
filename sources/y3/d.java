package y3;

import android.database.sqlite.SQLiteProgram;

/* compiled from: FrameworkSQLiteProgram.java */
/* loaded from: classes.dex */
class d implements x3.d {

    /* renamed from: f  reason: collision with root package name */
    private final SQLiteProgram f26273f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(SQLiteProgram sQLiteProgram) {
        this.f26273f = sQLiteProgram;
    }

    @Override // x3.d
    public void N(int i10, long j10) {
        this.f26273f.bindLong(i10, j10);
    }

    @Override // x3.d
    public void U(int i10, byte[] bArr) {
        this.f26273f.bindBlob(i10, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26273f.close();
    }

    @Override // x3.d
    public void p(int i10, String str) {
        this.f26273f.bindString(i10, str);
    }

    @Override // x3.d
    public void r0(int i10) {
        this.f26273f.bindNull(i10);
    }

    @Override // x3.d
    public void y(int i10, double d10) {
        this.f26273f.bindDouble(i10, d10);
    }
}
