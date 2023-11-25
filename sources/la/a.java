package la;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import la.b;

/* compiled from: DeviceDatabase.java */
/* loaded from: classes4.dex */
public class a extends SQLiteOpenHelper {

    /* renamed from: f  reason: collision with root package name */
    private final File f19630f;

    /* renamed from: m  reason: collision with root package name */
    private final Context f19631m;

    public a(Context context) {
        super(context, "android-devices.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f19631m = context.getApplicationContext();
        File databasePath = context.getDatabasePath("android-devices.db");
        this.f19630f = databasePath;
        if (!databasePath.exists()) {
            c();
        }
    }

    private void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private void c() throws SQLException {
        try {
            getReadableDatabase();
            close();
            e();
        } catch (IOException e10) {
            throw new SQLException("Error creating android-devices.db database", e10);
        }
    }

    private void e() throws IOException {
        InputStream open = this.f19631m.getAssets().open("android-devices.db");
        FileOutputStream fileOutputStream = new FileOutputStream(this.f19630f);
        byte[] bArr = new byte[RecyclerView.m.FLAG_MOVED];
        while (true) {
            int read = open.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                fileOutputStream.flush();
                b(fileOutputStream);
                b(open);
                return;
            }
        }
    }

    public b.c d(String str, String str2) {
        String[] strArr;
        String str3;
        SQLiteDatabase readableDatabase = getReadableDatabase();
        String[] strArr2 = {AppMeasurementSdk.ConditionalUserProperty.NAME, "codename", "model"};
        b.c cVar = null;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            strArr = new String[]{str, str2};
            str3 = "codename LIKE ? OR model LIKE ?";
        } else if (!TextUtils.isEmpty(str)) {
            strArr = new String[]{str};
            str3 = "codename LIKE ?";
        } else {
            if (TextUtils.isEmpty(str2)) {
                strArr = new String[]{str2};
                str3 = "model LIKE ?";
            }
            return cVar;
        }
        Cursor query = readableDatabase.query("devices", strArr2, str3, strArr, null, null, null);
        if (query.moveToFirst()) {
            cVar = new b.c(query.getString(query.getColumnIndexOrThrow(AppMeasurementSdk.ConditionalUserProperty.NAME)), query.getString(query.getColumnIndexOrThrow("codename")), query.getString(query.getColumnIndexOrThrow("model")));
        }
        b(query);
        b(readableDatabase);
        return cVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i11 > i10) {
            if (this.f19631m.deleteDatabase("android-devices.db") || this.f19630f.delete() || !this.f19630f.exists()) {
                c();
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }
}
