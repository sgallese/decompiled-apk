package q8;

import java.io.File;

/* compiled from: LogFileManager.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    private static final b f21569c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final u8.f f21570a;

    /* renamed from: b  reason: collision with root package name */
    private q8.a f21571b;

    public c(u8.f fVar) {
        this.f21570a = fVar;
        this.f21571b = f21569c;
    }

    private File d(String str) {
        return this.f21570a.o(str, "userlog");
    }

    public void a() {
        this.f21571b.d();
    }

    public byte[] b() {
        return this.f21571b.c();
    }

    public String c() {
        return this.f21571b.b();
    }

    public final void e(String str) {
        this.f21571b.a();
        this.f21571b = f21569c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i10) {
        this.f21571b = new f(file, i10);
    }

    public void g(long j10, String str) {
        this.f21571b.e(j10, str);
    }

    public c(u8.f fVar, String str) {
        this(fVar);
        e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LogFileManager.java */
    /* loaded from: classes3.dex */
    public static final class b implements q8.a {
        private b() {
        }

        @Override // q8.a
        public String b() {
            return null;
        }

        @Override // q8.a
        public byte[] c() {
            return null;
        }

        @Override // q8.a
        public void a() {
        }

        @Override // q8.a
        public void d() {
        }

        @Override // q8.a
        public void e(long j10, String str) {
        }
    }
}
