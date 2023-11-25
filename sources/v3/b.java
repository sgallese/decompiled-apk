package v3;

import android.database.Cursor;
import android.database.MatrixCursor;

/* compiled from: CursorUtil.java */
/* loaded from: classes.dex */
public class b {
    public static Cursor a(Cursor cursor) {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                for (int i10 = 0; i10 < cursor.getColumnCount(); i10++) {
                    int type = cursor.getType(i10);
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 2) {
                                if (type != 3) {
                                    if (type == 4) {
                                        objArr[i10] = cursor.getBlob(i10);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    objArr[i10] = cursor.getString(i10);
                                }
                            } else {
                                objArr[i10] = Double.valueOf(cursor.getDouble(i10));
                            }
                        } else {
                            objArr[i10] = Long.valueOf(cursor.getLong(i10));
                        }
                    } else {
                        objArr[i10] = null;
                    }
                }
                matrixCursor.addRow(objArr);
            }
            return matrixCursor;
        } finally {
            cursor.close();
        }
    }

    public static int b(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }
}
