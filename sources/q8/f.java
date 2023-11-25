package q8;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import q8.e;

/* compiled from: QueueFileLogStore.java */
/* loaded from: classes3.dex */
class f implements q8.a {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f21591d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final File f21592a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21593b;

    /* renamed from: c  reason: collision with root package name */
    private e f21594c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFileLogStore.java */
    /* loaded from: classes3.dex */
    public class a implements e.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ byte[] f21595a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f21596b;

        a(byte[] bArr, int[] iArr) {
            this.f21595a = bArr;
            this.f21596b = iArr;
        }

        @Override // q8.e.d
        public void a(InputStream inputStream, int i10) throws IOException {
            try {
                inputStream.read(this.f21595a, this.f21596b[0], i10);
                int[] iArr = this.f21596b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QueueFileLogStore.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f21598a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21599b;

        b(byte[] bArr, int i10) {
            this.f21598a = bArr;
            this.f21599b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(File file, int i10) {
        this.f21592a = file;
        this.f21593b = i10;
    }

    private void f(long j10, String str) {
        if (this.f21594c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i10 = this.f21593b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f21594c.j(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f21591d));
            while (!this.f21594c.E() && this.f21594c.k0() > this.f21593b) {
                this.f21594c.Y();
            }
        } catch (IOException e10) {
            n8.f.f().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    private b g() {
        if (!this.f21592a.exists()) {
            return null;
        }
        h();
        e eVar = this.f21594c;
        if (eVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[eVar.k0()];
        try {
            this.f21594c.z(new a(bArr, iArr));
        } catch (IOException e10) {
            n8.f.f().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f21594c == null) {
            try {
                this.f21594c = new e(this.f21592a);
            } catch (IOException e10) {
                n8.f.f().e("Could not open log file: " + this.f21592a, e10);
            }
        }
    }

    @Override // q8.a
    public void a() {
        com.google.firebase.crashlytics.internal.common.h.e(this.f21594c, "There was a problem closing the Crashlytics log file.");
        this.f21594c = null;
    }

    @Override // q8.a
    public String b() {
        byte[] c10 = c();
        if (c10 != null) {
            return new String(c10, f21591d);
        }
        return null;
    }

    @Override // q8.a
    public byte[] c() {
        b g10 = g();
        if (g10 == null) {
            return null;
        }
        int i10 = g10.f21599b;
        byte[] bArr = new byte[i10];
        System.arraycopy(g10.f21598a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // q8.a
    public void d() {
        a();
        this.f21592a.delete();
    }

    @Override // q8.a
    public void e(long j10, String str) {
        h();
        f(j10, str);
    }
}
