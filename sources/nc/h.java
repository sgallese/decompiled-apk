package nc;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import qc.q;

/* compiled from: ReadWrite.kt */
/* loaded from: classes4.dex */
public final class h {
    public static final long a(Reader reader, Writer writer, int i10) {
        q.i(reader, "<this>");
        q.i(writer, "out");
        char[] cArr = new char[i10];
        int read = reader.read(cArr);
        long j10 = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j10 += read;
            read = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(reader, writer, i10);
    }

    public static final String c(Reader reader) {
        q.i(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        q.h(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
