package nc;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import qc.q;

/* compiled from: IOStreams.kt */
/* loaded from: classes4.dex */
public final class a {
    public static final long a(InputStream inputStream, OutputStream outputStream, int i10) {
        q.i(inputStream, "<this>");
        q.i(outputStream, "out");
        byte[] bArr = new byte[i10];
        int read = inputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j10 += read;
            read = inputStream.read(bArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(inputStream, outputStream, i10);
    }

    public static final byte[] c(InputStream inputStream) {
        q.i(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        q.h(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}
