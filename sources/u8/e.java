package u8;

import com.google.firebase.crashlytics.internal.common.p;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import r8.b0;
import r8.c0;
import s8.h;
import w8.i;

/* compiled from: CrashlyticsReportPersistence.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f24199d = Charset.forName("UTF-8");

    /* renamed from: e  reason: collision with root package name */
    private static final int f24200e = 15;

    /* renamed from: f  reason: collision with root package name */
    private static final h f24201f = new h();

    /* renamed from: g  reason: collision with root package name */
    private static final Comparator<? super File> f24202g = new Comparator() { // from class: u8.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int u10;
            u10 = e.u((File) obj, (File) obj2);
            return u10;
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private static final FilenameFilter f24203h = new FilenameFilter() { // from class: u8.d
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean v10;
            v10 = e.v(file, str);
            return v10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f24204a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    private final f f24205b;

    /* renamed from: c  reason: collision with root package name */
    private final i f24206c;

    public e(f fVar, i iVar) {
        this.f24205b = fVar;
        this.f24206c = iVar;
    }

    private static String A(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f24199d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void B(File file, b0.d dVar, String str, b0.a aVar) {
        try {
            h hVar = f24201f;
            F(this.f24205b.g(str), hVar.G(hVar.F(A(file)).o(dVar).m(aVar)));
        } catch (IOException e10) {
            n8.f.f().l("Could not synthesize final native report file for " + file, e10);
        }
    }

    private void C(String str, long j10) {
        boolean z10;
        List<File> p10 = this.f24205b.p(str, f24203h);
        if (p10.isEmpty()) {
            n8.f.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(p10);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z10 = false;
            for (File file : p10) {
                try {
                    arrayList.add(f24201f.h(A(file)));
                } catch (IOException e10) {
                    n8.f.f().l("Could not add event to report for " + file, e10);
                }
                if (z10 || s(file.getName())) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            n8.f.f().k("Could not parse event files for session " + str);
            return;
        }
        D(this.f24205b.o(str, "report"), arrayList, j10, z10, q8.i.j(str, this.f24205b));
    }

    private void D(File file, List<b0.e.d> list, long j10, boolean z10, String str) {
        File l10;
        try {
            h hVar = f24201f;
            b0 n10 = hVar.F(A(file)).p(j10, z10, str).n(c0.a(list));
            b0.e k10 = n10.k();
            if (k10 == null) {
                return;
            }
            if (z10) {
                l10 = this.f24205b.j(k10.h());
            } else {
                l10 = this.f24205b.l(k10.h());
            }
            F(l10, hVar.G(n10));
        } catch (IOException e10) {
            n8.f.f().l("Could not synthesize final report file for " + file, e10);
        }
    }

    private int E(String str, int i10) {
        List<File> p10 = this.f24205b.p(str, new FilenameFilter() { // from class: u8.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean t10;
                t10 = e.t(file, str2);
                return t10;
            }
        });
        Collections.sort(p10, new Comparator() { // from class: u8.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int x10;
                x10 = e.x((File) obj, (File) obj2);
                return x10;
            }
        });
        return f(p10, i10);
    }

    private static void F(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f24199d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void G(File file, String str, long j10) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f24199d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j10));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SortedSet<String> e(String str) {
        this.f24205b.b();
        SortedSet<String> p10 = p();
        if (str != null) {
            p10.remove(str);
        }
        if (p10.size() <= 8) {
            return p10;
        }
        while (p10.size() > 8) {
            String last = p10.last();
            n8.f.f().b("Removing session over cap: " + last);
            this.f24205b.c(last);
            p10.remove(last);
        }
        return p10;
    }

    private static int f(List<File> list, int i10) {
        int size = list.size();
        for (File file : list) {
            if (size <= i10) {
                return size;
            }
            f.s(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i10 = this.f24206c.b().f25444a.f25456b;
        List<File> n10 = n();
        int size = n10.size();
        if (size <= i10) {
            return;
        }
        Iterator<File> it = n10.subList(i10, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static long h(long j10) {
        return j10 * 1000;
    }

    private void j(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static String m(int i10, boolean z10) {
        String str;
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i10));
        if (z10) {
            str = "_";
        } else {
            str = "";
        }
        return "event" + format + str;
    }

    private List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f24205b.k());
        arrayList.addAll(this.f24205b.h());
        Comparator<? super File> comparator = f24202g;
        Collections.sort(arrayList, comparator);
        List<File> m10 = this.f24205b.m();
        Collections.sort(m10, comparator);
        arrayList.addAll(m10);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, f24200e);
    }

    private static boolean s(String str) {
        if (str.startsWith("event") && str.endsWith("_")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(File file, String str) {
        if (str.startsWith("event") && !str.endsWith("_")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith("event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.f24205b.m());
        j(this.f24205b.k());
        j(this.f24205b.h());
    }

    public void k(String str, long j10) {
        for (String str2 : e(str)) {
            n8.f.f().i("Finalizing report for session " + str2);
            C(str2, j10);
            this.f24205b.c(str2);
        }
        g();
    }

    public void l(String str, b0.d dVar, b0.a aVar) {
        File o10 = this.f24205b.o(str, "report");
        n8.f.f().b("Writing native session report for " + str + " to file: " + o10);
        B(o10, dVar, str, aVar);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.f24205b.d()).descendingSet();
    }

    public long q(String str) {
        return this.f24205b.o(str, "start-time").lastModified();
    }

    public boolean r() {
        if (this.f24205b.m().isEmpty() && this.f24205b.k().isEmpty() && this.f24205b.h().isEmpty()) {
            return false;
        }
        return true;
    }

    public List<p> w() {
        List<File> n10 = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n10) {
            try {
                arrayList.add(p.a(f24201f.F(A(file)), file.getName(), file));
            } catch (IOException e10) {
                n8.f.f().l("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(b0.e.d dVar, String str, boolean z10) {
        int i10 = this.f24206c.b().f25444a.f25455a;
        try {
            F(this.f24205b.o(str, m(this.f24204a.getAndIncrement(), z10)), f24201f.i(dVar));
        } catch (IOException e10) {
            n8.f.f().l("Could not persist event for session " + str, e10);
        }
        E(str, i10);
    }

    public void z(b0 b0Var) {
        b0.e k10 = b0Var.k();
        if (k10 == null) {
            n8.f.f().b("Could not get session for report");
            return;
        }
        String h10 = k10.h();
        try {
            F(this.f24205b.o(h10, "report"), f24201f.G(b0Var));
            G(this.f24205b.o(h10, "start-time"), "", k10.k());
        } catch (IOException e10) {
            n8.f.f().c("Could not persist report for session " + h10, e10);
        }
    }
}
