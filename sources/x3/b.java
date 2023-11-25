package x3;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* compiled from: SupportSQLiteDatabase.java */
/* loaded from: classes.dex */
public interface b extends Closeable {
    Cursor K0(e eVar);

    void O();

    void P(String str, Object[] objArr) throws SQLException;

    Cursor Z(String str);

    void beginTransaction();

    void e0();

    String getPath();

    boolean isOpen();

    List<Pair<String, String>> k();

    Cursor n(e eVar, CancellationSignal cancellationSignal);

    void o(String str) throws SQLException;

    f v(String str);

    boolean w0();
}
