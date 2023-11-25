package y3;

import android.database.sqlite.SQLiteStatement;
import x3.f;

/* compiled from: FrameworkSQLiteStatement.java */
/* loaded from: classes.dex */
class e extends d implements f {

    /* renamed from: m  reason: collision with root package name */
    private final SQLiteStatement f26274m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f26274m = sQLiteStatement;
    }

    @Override // x3.f
    public long Q0() {
        return this.f26274m.executeInsert();
    }

    @Override // x3.f
    public int u() {
        return this.f26274m.executeUpdateDelete();
    }
}
