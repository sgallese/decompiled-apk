package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: DeviceProfileWriter.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f6452a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f6453b;

    /* renamed from: c  reason: collision with root package name */
    private final i.c f6454c;

    /* renamed from: e  reason: collision with root package name */
    private final File f6456e;

    /* renamed from: f  reason: collision with root package name */
    private final String f6457f;

    /* renamed from: g  reason: collision with root package name */
    private final String f6458g;

    /* renamed from: h  reason: collision with root package name */
    private final String f6459h;

    /* renamed from: j  reason: collision with root package name */
    private e[] f6461j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f6462k;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6460i = false;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f6455d = d();

    public d(AssetManager assetManager, Executor executor, i.c cVar, String str, String str2, String str3, File file) {
        this.f6452a = assetManager;
        this.f6453b = executor;
        this.f6454c = cVar;
        this.f6457f = str;
        this.f6458g = str2;
        this.f6459h = str3;
        this.f6456e = file;
    }

    private d b(e[] eVarArr, byte[] bArr) {
        InputStream h10;
        try {
            h10 = h(this.f6452a, this.f6459h);
        } catch (FileNotFoundException e10) {
            this.f6454c.b(9, e10);
        } catch (IOException e11) {
            this.f6454c.b(7, e11);
        } catch (IllegalStateException e12) {
            this.f6461j = null;
            this.f6454c.b(8, e12);
        }
        if (h10 != null) {
            try {
                this.f6461j = n.q(h10, n.o(h10, n.f6483b), bArr, eVarArr);
                h10.close();
                return this;
            } catch (Throwable th) {
                try {
                    h10.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (h10 != null) {
            h10.close();
        }
        return null;
    }

    private void c() {
        if (this.f6460i) {
            return;
        }
        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 34) {
            return null;
        }
        switch (i10) {
            case 24:
            case 25:
                return p.f6498e;
            case 26:
                return p.f6497d;
            case 27:
                return p.f6496c;
            case 28:
            case 29:
            case 30:
                return p.f6495b;
            case 31:
            case 32:
            case 33:
            case 34:
                return p.f6494a;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f6458g);
        } catch (FileNotFoundException e10) {
            this.f6454c.b(6, e10);
            return null;
        } catch (IOException e11) {
            this.f6454c.b(7, e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Object obj) {
        this.f6454c.b(i10, obj);
    }

    private InputStream h(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f6454c.a(5, null);
            }
            return null;
        }
    }

    private e[] j(InputStream inputStream) {
        try {
        } catch (IOException e10) {
            this.f6454c.b(7, e10);
        }
        try {
            try {
                e[] w10 = n.w(inputStream, n.o(inputStream, n.f6482a), this.f6457f);
                try {
                    inputStream.close();
                    return w10;
                } catch (IOException e11) {
                    this.f6454c.b(7, e11);
                    return w10;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    this.f6454c.b(7, e12);
                }
                throw th;
            }
        } catch (IOException e13) {
            this.f6454c.b(7, e13);
            inputStream.close();
            return null;
        } catch (IllegalStateException e14) {
            this.f6454c.b(8, e14);
            inputStream.close();
            return null;
        }
    }

    private static boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 34) {
            return false;
        }
        if (i10 != 24 && i10 != 25) {
            switch (i10) {
                case 31:
                case 32:
                case 33:
                case 34:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void l(final int i10, final Object obj) {
        this.f6453b.execute(new Runnable() { // from class: androidx.profileinstaller.c
            @Override // java.lang.Runnable
            public final void run() {
                d.this.g(i10, obj);
            }
        });
    }

    public boolean e() {
        if (this.f6455d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.f6456e.exists()) {
            if (!this.f6456e.canWrite()) {
                l(4, null);
                return false;
            }
        } else {
            try {
                this.f6456e.createNewFile();
            } catch (IOException unused) {
                l(4, null);
                return false;
            }
        }
        this.f6460i = true;
        return true;
    }

    public d i() {
        d b10;
        c();
        if (this.f6455d == null) {
            return this;
        }
        InputStream f10 = f(this.f6452a);
        if (f10 != null) {
            this.f6461j = j(f10);
        }
        e[] eVarArr = this.f6461j;
        if (eVarArr != null && k() && (b10 = b(eVarArr, this.f6455d)) != null) {
            return b10;
        }
        return this;
    }

    public d m() {
        ByteArrayOutputStream byteArrayOutputStream;
        e[] eVarArr = this.f6461j;
        byte[] bArr = this.f6455d;
        if (eVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    n.E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e10) {
                this.f6454c.b(7, e10);
            } catch (IllegalStateException e11) {
                this.f6454c.b(8, e11);
            }
            if (!n.B(byteArrayOutputStream, bArr, eVarArr)) {
                this.f6454c.b(5, null);
                this.f6461j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f6462k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f6461j = null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.profileinstaller.e[], byte[]] */
    public boolean n() {
        byte[] bArr = this.f6462k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f6456e);
                    try {
                        f.l(byteArrayInputStream, fileOutputStream);
                        l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.f6462k = null;
                this.f6461j = null;
            }
        } catch (FileNotFoundException e10) {
            l(6, e10);
            return false;
        } catch (IOException e11) {
            l(7, e11);
            return false;
        }
    }
}
