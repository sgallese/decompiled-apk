package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: ProfileVerifier.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final androidx.concurrent.futures.d<c> f6484a = androidx.concurrent.futures.d.w();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f6485b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static c f6486c = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProfileVerifier.java */
    /* loaded from: classes.dex */
    public static class a {
        static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* compiled from: ProfileVerifier.java */
    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f6487a;

        /* renamed from: b  reason: collision with root package name */
        final int f6488b;

        /* renamed from: c  reason: collision with root package name */
        final long f6489c;

        /* renamed from: d  reason: collision with root package name */
        final long f6490d;

        b(int i10, int i11, long j10, long j11) {
            this.f6487a = i10;
            this.f6488b = i11;
            this.f6489c = j10;
            this.f6490d = j11;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f6487a);
                dataOutputStream.writeInt(this.f6488b);
                dataOutputStream.writeLong(this.f6489c);
                dataOutputStream.writeLong(this.f6490d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f6488b == bVar.f6488b && this.f6489c == bVar.f6489c && this.f6487a == bVar.f6487a && this.f6490d == bVar.f6490d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f6488b), Long.valueOf(this.f6489c), Integer.valueOf(this.f6487a), Long.valueOf(this.f6490d));
        }
    }

    /* compiled from: ProfileVerifier.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final int f6491a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f6492b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f6493c;

        c(int i10, boolean z10, boolean z11) {
            this.f6491a = i10;
            this.f6493c = z11;
            this.f6492b = z10;
        }
    }

    private static long a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return a.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11) {
        c cVar = new c(i10, z10, z11);
        f6486c = cVar;
        f6484a.s(cVar);
        return f6486c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(20:14|(1:78)(1:18)|19|(1:77)(1:23)|24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009d, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cc, code lost:
    
        r3 = 196608;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.profileinstaller.o.c c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.o.c(android.content.Context, boolean):androidx.profileinstaller.o$c");
    }
}
