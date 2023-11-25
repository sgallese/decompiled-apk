package v3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: CopyLock.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, Lock> f24532e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final File f24533a;

    /* renamed from: b  reason: collision with root package name */
    private final Lock f24534b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f24535c;

    /* renamed from: d  reason: collision with root package name */
    private FileChannel f24536d;

    public a(String str, File file, boolean z10) {
        File file2 = new File(file, str + ".lck");
        this.f24533a = file2;
        this.f24534b = a(file2.getAbsolutePath());
        this.f24535c = z10;
    }

    private static Lock a(String str) {
        Lock lock;
        Map<String, Lock> map = f24532e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public void b() {
        this.f24534b.lock();
        if (this.f24535c) {
            try {
                FileChannel channel = new FileOutputStream(this.f24533a).getChannel();
                this.f24536d = channel;
                channel.lock();
            } catch (IOException e10) {
                throw new IllegalStateException("Unable to grab copy lock.", e10);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f24536d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f24534b.unlock();
    }
}
