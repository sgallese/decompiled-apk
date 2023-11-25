package u8;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FileStore.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final File f24207a;

    /* renamed from: b  reason: collision with root package name */
    private final File f24208b;

    /* renamed from: c  reason: collision with root package name */
    private final File f24209c;

    /* renamed from: d  reason: collision with root package name */
    private final File f24210d;

    /* renamed from: e  reason: collision with root package name */
    private final File f24211e;

    /* renamed from: f  reason: collision with root package name */
    private final File f24212f;

    public f(Context context) {
        String str;
        String processName;
        File filesDir = context.getFilesDir();
        this.f24207a = filesDir;
        if (v()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(".com.google.firebase.crashlytics.files.v2");
            sb2.append(File.pathSeparator);
            processName = Application.getProcessName();
            sb2.append(u(processName));
            str = sb2.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File q10 = q(new File(filesDir, str));
        this.f24208b = q10;
        this.f24209c = q(new File(q10, "open-sessions"));
        this.f24210d = q(new File(q10, "reports"));
        this.f24211e = q(new File(q10, "priority-reports"));
        this.f24212f = q(new File(q10, "native-reports"));
    }

    private void a(File file) {
        if (file.exists() && s(file)) {
            n8.f.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private File n(String str) {
        return r(new File(this.f24209c, str));
    }

    private static synchronized File q(File file) {
        synchronized (f.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                n8.f.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                n8.f.f().d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        }
    }

    private static File r(File file) {
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                s(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> t(T[] tArr) {
        if (tArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(tArr);
    }

    static String u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    @SuppressLint({"AnnotateVersionCheck"})
    private static boolean v() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public void b() {
        a(new File(this.f24207a, ".com.google.firebase.crashlytics"));
        a(new File(this.f24207a, ".com.google.firebase.crashlytics-ndk"));
        if (v()) {
            a(new File(this.f24207a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    public boolean c(String str) {
        return s(new File(this.f24209c, str));
    }

    public List<String> d() {
        return t(this.f24209c.list());
    }

    public File e(String str) {
        return new File(this.f24208b, str);
    }

    public List<File> f(FilenameFilter filenameFilter) {
        return t(this.f24208b.listFiles(filenameFilter));
    }

    public File g(String str) {
        return new File(this.f24212f, str);
    }

    public List<File> h() {
        return t(this.f24212f.listFiles());
    }

    public File i(String str) {
        return r(new File(n(str), "native"));
    }

    public File j(String str) {
        return new File(this.f24211e, str);
    }

    public List<File> k() {
        return t(this.f24211e.listFiles());
    }

    public File l(String str) {
        return new File(this.f24210d, str);
    }

    public List<File> m() {
        return t(this.f24210d.listFiles());
    }

    public File o(String str, String str2) {
        return new File(n(str), str2);
    }

    public List<File> p(String str, FilenameFilter filenameFilter) {
        return t(n(str).listFiles(filenameFilter));
    }
}
