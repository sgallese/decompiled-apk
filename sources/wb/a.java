package wb;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* compiled from: RealmThreadPoolExecutor.java */
/* loaded from: classes4.dex */
public class a extends ThreadPoolExecutor {

    /* renamed from: q  reason: collision with root package name */
    private static final int f25495q = a();

    /* renamed from: f  reason: collision with root package name */
    private boolean f25496f;

    /* renamed from: m  reason: collision with root package name */
    private ReentrantLock f25497m;

    /* renamed from: p  reason: collision with root package name */
    private Condition f25498p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealmThreadPoolExecutor.java */
    /* renamed from: wb.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0583a implements FileFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Pattern f25499a;

        C0583a(Pattern pattern) {
            this.f25499a = pattern;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return this.f25499a.matcher(file.getName()).matches();
        }
    }

    private a(int i10, int i11) {
        super(i10, i11, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f25497m = reentrantLock;
        this.f25498p = reentrantLock.newCondition();
    }

    @SuppressFBWarnings({"DMI_HARDCODED_ABSOLUTE_FILENAME"})
    private static int a() {
        int b10 = b("/sys/devices/system/cpu/", "cpu[0-9]+");
        if (b10 <= 0) {
            b10 = Runtime.getRuntime().availableProcessors();
        }
        if (b10 <= 0) {
            return 1;
        }
        return 1 + (b10 * 2);
    }

    private static int b(String str, String str2) {
        try {
            File[] listFiles = new File(str).listFiles(new C0583a(Pattern.compile(str2)));
            if (listFiles == null) {
                return 0;
            }
            return listFiles.length;
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static a c() {
        int i10 = f25495q;
        return new a(i10, i10);
    }

    public static a e() {
        return new a(1, 1);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.f25497m.lock();
        while (this.f25496f) {
            try {
                try {
                    this.f25498p.await();
                } catch (InterruptedException unused) {
                    thread.interrupt();
                }
            } finally {
                this.f25497m.unlock();
            }
        }
    }
}
