package x7;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.google.android.play.core.internal.zzck;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.internal.http2.Http2;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class y {
    public static long a(z zVar, InputStream inputStream, OutputStream outputStream, long j10) throws IOException {
        String str;
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", Integer.valueOf(readInt)));
            if (valueOf.length() != 0) {
                str = "Unexpected magic=".concat(valueOf);
            } else {
                str = new String("Unexpected magic=");
            }
            throw new zzck(str);
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j11 = 0;
            while (true) {
                long j12 = j10 - j11;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 != -1) {
                        if (read2 != 0) {
                            switch (read2) {
                                case 247:
                                    read2 = dataInputStream.readUnsignedShort();
                                    c(bArr, dataInputStream, outputStream, read2, j12);
                                    break;
                                case 248:
                                    read2 = dataInputStream.readInt();
                                    c(bArr, dataInputStream, outputStream, read2, j12);
                                    break;
                                case 249:
                                    long readUnsignedShort = dataInputStream.readUnsignedShort();
                                    read2 = dataInputStream.read();
                                    if (read2 != -1) {
                                        b(bArr, zVar, outputStream, readUnsignedShort, read2, j12);
                                        break;
                                    } else {
                                        throw new IOException("Unexpected end of patch");
                                    }
                                case m.e.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                    long readUnsignedShort2 = dataInputStream.readUnsignedShort();
                                    read2 = dataInputStream.readUnsignedShort();
                                    b(bArr, zVar, outputStream, readUnsignedShort2, read2, j12);
                                    break;
                                case 251:
                                    long readUnsignedShort3 = dataInputStream.readUnsignedShort();
                                    read2 = dataInputStream.readInt();
                                    b(bArr, zVar, outputStream, readUnsignedShort3, read2, j12);
                                    break;
                                case 252:
                                    long readInt2 = dataInputStream.readInt();
                                    read2 = dataInputStream.read();
                                    if (read2 != -1) {
                                        b(bArr, zVar, outputStream, readInt2, read2, j12);
                                        break;
                                    } else {
                                        throw new IOException("Unexpected end of patch");
                                    }
                                case 253:
                                    long readInt3 = dataInputStream.readInt();
                                    read2 = dataInputStream.readUnsignedShort();
                                    b(bArr, zVar, outputStream, readInt3, read2, j12);
                                    break;
                                case 254:
                                    long readInt4 = dataInputStream.readInt();
                                    read2 = dataInputStream.readInt();
                                    b(bArr, zVar, outputStream, readInt4, read2, j12);
                                    break;
                                case 255:
                                    long readLong = dataInputStream.readLong();
                                    read2 = dataInputStream.readInt();
                                    b(bArr, zVar, outputStream, readLong, read2, j12);
                                    break;
                                default:
                                    c(bArr, dataInputStream, outputStream, read2, j12);
                                    break;
                            }
                            j11 += read2;
                        } else {
                            return j11;
                        }
                    } else {
                        throw new IOException("Patch file overrun");
                    }
                } finally {
                    outputStream.flush();
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Unexpected version=");
            sb2.append(read);
            throw new zzck(sb2.toString());
        }
    }

    private static void b(byte[] bArr, z zVar, OutputStream outputStream, long j10, int i10, long j11) throws IOException {
        int i11 = i10;
        if (i11 >= 0) {
            if (j10 >= 0) {
                long j12 = i11;
                if (j12 <= j11) {
                    try {
                        InputStream d10 = new a0(zVar, j10, j12).d();
                        while (i11 > 0) {
                            try {
                                int min = Math.min(i11, (int) Http2.INITIAL_MAX_FRAME_SIZE);
                                int i12 = 0;
                                while (i12 < min) {
                                    int read = d10.read(bArr, i12, min - i12);
                                    if (read != -1) {
                                        i12 += read;
                                    } else {
                                        throw new IOException("truncated input stream");
                                    }
                                }
                                outputStream.write(bArr, 0, min);
                                i11 -= min;
                            } catch (Throwable th) {
                                try {
                                    d10.close();
                                } catch (Throwable unused) {
                                }
                                throw th;
                            }
                        }
                        d10.close();
                        return;
                    } catch (EOFException e10) {
                        throw new IOException("patch underrun", e10);
                    }
                }
                throw new IOException("Output length overrun");
            }
            throw new IOException("inputOffset negative");
        }
        throw new IOException("copyLength negative");
    }

    private static void c(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i10, long j10) throws IOException {
        if (i10 >= 0) {
            if (i10 <= j10) {
                while (i10 > 0) {
                    try {
                        int min = Math.min(i10, (int) Http2.INITIAL_MAX_FRAME_SIZE);
                        dataInputStream.readFully(bArr, 0, min);
                        outputStream.write(bArr, 0, min);
                        i10 -= min;
                    } catch (EOFException unused) {
                        throw new IOException("patch underrun");
                    }
                }
                return;
            }
            throw new IOException("Output length overrun");
        }
        throw new IOException("copyLength negative");
    }
}
