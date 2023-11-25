package v3;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;

/* compiled from: DBUtil.java */
/* loaded from: classes.dex */
public class c {
    public static void a(x3.b bVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor Z = bVar.Z("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (Z.moveToNext()) {
            try {
                arrayList.add(Z.getString(0));
            } catch (Throwable th) {
                Z.close();
                throw th;
            }
        }
        Z.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.o("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(i iVar, x3.e eVar, boolean z10, CancellationSignal cancellationSignal) {
        int i10;
        Cursor q10 = iVar.q(eVar, cancellationSignal);
        if (z10 && (q10 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) q10;
            int count = abstractWindowedCursor.getCount();
            if (abstractWindowedCursor.hasWindow()) {
                i10 = abstractWindowedCursor.getWindow().getNumRows();
            } else {
                i10 = count;
            }
            if (Build.VERSION.SDK_INT < 23 || i10 < count) {
                return b.a(abstractWindowedCursor);
            }
            return q10;
        }
        return q10;
    }

    public static int c(File file) throws IOException {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i10 = allocate.getInt();
                channel.close();
                return i10;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th;
        }
    }
}
