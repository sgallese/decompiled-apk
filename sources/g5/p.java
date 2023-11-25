package g5;

import android.os.SystemClock;
import java.io.File;

/* compiled from: HardwareBitmaps.kt */
/* loaded from: classes.dex */
final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f16200a = new p();

    /* renamed from: b  reason: collision with root package name */
    private static final File f16201b = new File("/proc/self/fd");

    /* renamed from: c  reason: collision with root package name */
    private static int f16202c = 30;

    /* renamed from: d  reason: collision with root package name */
    private static long f16203d = SystemClock.uptimeMillis();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f16204e = true;

    private p() {
    }

    private final boolean a() {
        int i10 = f16202c;
        f16202c = i10 + 1;
        if (i10 < 30 && SystemClock.uptimeMillis() <= f16203d + 30000) {
            return false;
        }
        return true;
    }

    public final synchronized boolean b(u uVar) {
        if (a()) {
            boolean z10 = false;
            f16202c = 0;
            f16203d = SystemClock.uptimeMillis();
            String[] list = f16201b.list();
            if (list == null) {
                list = new String[0];
            }
            int length = list.length;
            if (length < 800) {
                z10 = true;
            }
            f16204e = z10;
            if (!z10 && uVar != null && uVar.a() <= 5) {
                uVar.b("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
            }
        }
        return f16204e;
    }
}
