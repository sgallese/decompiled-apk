package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class a3 {

    /* renamed from: h  reason: collision with root package name */
    private static final x7.f f10713h = new x7.f("SliceMetadataManager");

    /* renamed from: b  reason: collision with root package name */
    private final d0 f10715b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10716c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10717d;

    /* renamed from: e  reason: collision with root package name */
    private final long f10718e;

    /* renamed from: f  reason: collision with root package name */
    private final String f10719f;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f10714a = new byte[8192];

    /* renamed from: g  reason: collision with root package name */
    private int f10720g = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a3(d0 d0Var, String str, int i10, long j10, String str2) {
        this.f10715b = d0Var;
        this.f10716c = str;
        this.f10717d = i10;
        this.f10718e = j10;
        this.f10719f = str2;
    }

    private final File n() {
        File B = this.f10715b.B(this.f10716c, this.f10717d, this.f10718e, this.f10719f);
        if (!B.exists()) {
            B.mkdirs();
        }
        return B;
    }

    private final File o() throws IOException {
        File A = this.f10715b.A(this.f10716c, this.f10717d, this.f10718e, this.f10719f);
        A.getParentFile().mkdirs();
        A.createNewFile();
        return A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() throws IOException {
        File A = this.f10715b.A(this.f10716c, this.f10717d, this.f10718e, this.f10719f);
        if (!A.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(A);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new c1("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final z2 b() throws IOException {
        File A = this.f10715b.A(this.f10716c, this.f10717d, this.f10718e, this.f10719f);
        if (A.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(A);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null && properties.getProperty("previousChunk") != null) {
                    try {
                        int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                        String property = properties.getProperty("fileName");
                        long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                        long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                        int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                        this.f10720g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                        return new k0(parseInt, property, parseLong, parseLong2, parseInt2);
                    } catch (NumberFormatException e10) {
                        throw new c1("Slice checkpoint file corrupt.", e10);
                    }
                }
                throw new c1("Slice checkpoint file corrupt.");
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        throw new c1("Slice checkpoint file does not exist.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File c() {
        return new File(n(), String.format("%s-NAM.dat", Integer.valueOf(this.f10720g)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(InputStream inputStream, long j10) throws IOException {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j10);
            do {
                read = inputStream.read(this.f10714a);
                if (read > 0) {
                    randomAccessFile.write(this.f10714a, 0, read);
                }
            } while (read == 8192);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(long j10, byte[] bArr, int i10, int i11) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j10);
            randomAccessFile.write(bArr, i10, i11);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(c().length()));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f10720g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(String str, long j10, long j11, int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j10));
        properties.put("remainingBytes", String.valueOf(j11));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f10720g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(byte[] bArr, int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f10720g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File z10 = this.f10715b.z(this.f10716c, this.f10717d, this.f10718e, this.f10719f);
            if (z10.exists()) {
                z10.delete();
            }
            fileOutputStream = new FileOutputStream(z10);
            try {
                fileOutputStream.write(bArr);
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f10720g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(byte[] bArr) throws IOException {
        this.f10720g++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(n(), String.format("%s-LFH.dat", Integer.valueOf(this.f10720g))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e10) {
            throw new c1("Could not write metadata file.", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(byte[] bArr, InputStream inputStream) throws IOException {
        this.f10720g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f10714a);
            while (read > 0) {
                fileOutputStream.write(this.f10714a, 0, read);
                read = inputStream.read(this.f10714a);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(byte[] bArr, int i10, int i11) throws IOException {
        this.f10720g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr, 0, i11);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        File A = this.f10715b.A(this.f10716c, this.f10717d, this.f10718e, this.f10719f);
        if (!A.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(A);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null) {
                    f10713h.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                    return false;
                } else if (Integer.parseInt(properties.getProperty("fileStatus")) != 4) {
                    return false;
                } else {
                    return true;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e10) {
            f10713h.b("Could not read checkpoint while checking if extraction finished. %s", e10);
            return false;
        }
    }
}
