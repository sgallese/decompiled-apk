package u4;

import ad.a1;
import ad.g0;
import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import okio.j;
import okio.r0;
import vc.l;

/* compiled from: DiskCache.kt */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: DiskCache.kt */
    /* renamed from: u4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0565a {

        /* renamed from: a  reason: collision with root package name */
        private r0 f24103a;

        /* renamed from: f  reason: collision with root package name */
        private long f24108f;

        /* renamed from: b  reason: collision with root package name */
        private j f24104b = j.f20647b;

        /* renamed from: c  reason: collision with root package name */
        private double f24105c = 0.02d;

        /* renamed from: d  reason: collision with root package name */
        private long f24106d = 10485760;

        /* renamed from: e  reason: collision with root package name */
        private long f24107e = 262144000;

        /* renamed from: g  reason: collision with root package name */
        private g0 f24109g = a1.b();

        public final a a() {
            long j10;
            r0 r0Var = this.f24103a;
            if (r0Var != null) {
                if (this.f24105c > 0.0d) {
                    try {
                        File p10 = r0Var.p();
                        p10.mkdir();
                        StatFs statFs = new StatFs(p10.getAbsolutePath());
                        j10 = l.n((long) (this.f24105c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f24106d, this.f24107e);
                    } catch (Exception unused) {
                        j10 = this.f24106d;
                    }
                } else {
                    j10 = this.f24108f;
                }
                return new d(j10, r0Var, this.f24104b, this.f24109g);
            }
            throw new IllegalStateException("directory == null".toString());
        }

        public final C0565a b(File file) {
            return c(r0.a.d(r0.f20670m, file, false, 1, null));
        }

        public final C0565a c(r0 r0Var) {
            this.f24103a = r0Var;
            return this;
        }
    }

    /* compiled from: DiskCache.kt */
    /* loaded from: classes.dex */
    public interface b {
        c a();

        void abort();

        r0 getData();

        r0 getMetadata();
    }

    /* compiled from: DiskCache.kt */
    /* loaded from: classes.dex */
    public interface c extends Closeable {
        b S();

        r0 getData();

        r0 getMetadata();
    }

    b a(String str);

    c b(String str);

    j c();
}
