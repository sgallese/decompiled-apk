package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import okio.c;
import qc.q;

/* compiled from: FileOperator.kt */
/* loaded from: classes4.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        q.i(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j10, c cVar, long j11) {
        q.i(cVar, "sink");
        if (j11 >= 0) {
            while (j11 > 0) {
                long transferTo = this.fileChannel.transferTo(j10, j11, cVar);
                j10 += transferTo;
                j11 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void write(long j10, c cVar, long j11) throws IOException {
        q.i(cVar, "source");
        if (j11 >= 0 && j11 <= cVar.s0()) {
            long j12 = j10;
            long j13 = j11;
            while (j13 > 0) {
                long transferFrom = this.fileChannel.transferFrom(cVar, j12, j13);
                j12 += transferFrom;
                j13 -= transferFrom;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
