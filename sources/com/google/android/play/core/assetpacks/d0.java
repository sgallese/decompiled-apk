package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: c  reason: collision with root package name */
    private static final x7.f f10744c = new x7.f("AssetPackStorage");

    /* renamed from: d  reason: collision with root package name */
    private static final long f10745d;

    /* renamed from: e  reason: collision with root package name */
    private static final long f10746e;

    /* renamed from: a  reason: collision with root package name */
    private final Context f10747a;

    /* renamed from: b  reason: collision with root package name */
    private final q2 f10748b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f10745d = timeUnit.toMillis(14L);
        f10746e = timeUnit.toMillis(28L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(Context context, q2 q2Var) {
        this.f10747a = context;
        this.f10748b = q2Var;
    }

    private static long g(File file, boolean z10) {
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        if (z10 && file.listFiles().length > 1) {
            f10744c.e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e10) {
            f10744c.c(e10, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    private final File h(String str) {
        return new File(k(), str);
    }

    private final File i(String str, int i10, long j10) {
        return new File(w(str, i10, j10), "merge.tmp");
    }

    private final File j(String str, int i10, long j10) {
        return new File(new File(new File(l(), str), String.valueOf(i10)), String.valueOf(j10));
    }

    private final File k() {
        return new File(this.f10747a.getFilesDir(), "assetpacks");
    }

    private final File l() {
        return new File(k(), "_tmp");
    }

    private final List m() {
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e10) {
            f10744c.b("Could not process directory while scanning installed packs. %s", e10);
        }
        if (k().exists() && k().listFiles() != null) {
            for (File file : k().listFiles()) {
                if (!file.getCanonicalPath().equals(l().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    private static void n(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long g10 = g(file, false);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(g10)) && !file2.getName().equals("stale.tmp")) {
                    o(file2);
                }
            }
        }
    }

    private static boolean o(File file) {
        File[] listFiles = file.listFiles();
        boolean z10 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z10 &= o(file2);
            }
        }
        if (!file.delete()) {
            return false;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File A(String str, int i10, long j10, String str2) {
        return new File(B(str, i10, j10, str2), "checkpoint.dat");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File B(String str, int i10, long j10, String str2) {
        return new File(y(str, i10, j10), str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File C(String str, int i10, long j10, String str2) {
        return new File(new File(new File(j(str, i10, j10), "_slices"), "_unverified"), str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File D(String str, int i10, long j10, String str2) {
        return new File(new File(new File(j(str, i10, j10), "_slices"), "_verified"), str2);
    }

    final String E(String str) throws IOException {
        int length;
        File file = new File(k(), str);
        if (!file.exists()) {
            f10744c.a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f10748b.a()));
        if (!file2.exists()) {
            f10744c.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f10748b.a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles != null && (length = listFiles.length) != 0) {
            if (length > 1) {
                f10744c.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f10748b.a()));
                return null;
            }
            return listFiles[0].getCanonicalPath();
        }
        f10744c.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f10748b.a()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map F() {
        HashMap hashMap = new HashMap();
        Iterator it = m().iterator();
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            int g10 = (int) g(h(name), true);
            long g11 = g(t(name, g10), true);
            if (u(name, g10, g11).exists()) {
                hashMap.put(name, Long.valueOf(g11));
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map G() {
        HashMap hashMap = new HashMap();
        for (String str : H().keySet()) {
            hashMap.put(str, Long.valueOf(r(str)));
        }
        return hashMap;
    }

    final Map H() {
        HashMap hashMap = new HashMap();
        try {
            for (File file : m()) {
                a s10 = s(file.getName());
                if (s10 != null) {
                    hashMap.put(file.getName(), s10);
                }
            }
        } catch (IOException e10) {
            f10744c.b("Could not process directory while scanning installed packs: %s", e10);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I() {
        for (File file : m()) {
            if (file.listFiles() != null) {
                n(file);
                long g10 = g(file, false);
                if (this.f10748b.a() != g10) {
                    try {
                        new File(new File(file, String.valueOf(g10)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f10744c.b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    n(file2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J() {
        o(k());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, int i10, long j10, int i11) throws IOException {
        File i12 = i(str, i10, j10);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i11));
        i12.getParentFile().mkdirs();
        i12.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(i12);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, int i10, long j10) {
        File h10 = h(str);
        if (!h10.exists()) {
            return;
        }
        for (File file : h10.listFiles()) {
            if (!file.getName().equals(String.valueOf(i10)) && !file.getName().equals("stale.tmp")) {
                o(file);
            } else if (file.getName().equals(String.valueOf(i10))) {
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().equals(String.valueOf(j10))) {
                        o(file2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(List list) {
        int a10 = this.f10748b.a();
        for (File file : m()) {
            if (!list.contains(file.getName()) && g(file, true) != a10) {
                o(file);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(String str, int i10, long j10) {
        if (!j(str, i10, j10).exists()) {
            return true;
        }
        return o(j(str, i10, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(String str, int i10, long j10) {
        if (!u(str, i10, j10).exists()) {
            return true;
        }
        return o(u(str, i10, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(String str) {
        if (E(str) == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int p(String str) {
        return (int) g(h(str), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int q(String str, int i10, long j10) throws IOException {
        File i11 = i(str, i10, j10);
        if (!i11.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(i11);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e10) {
                    throw new c1("Merge checkpoint file corrupt.", e10);
                }
            }
            throw new c1("Merge checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long r(String str) {
        return g(t(str, (int) g(h(str), true)), true);
    }

    final a s(String str) throws IOException {
        String E = E(str);
        if (E == null) {
            return null;
        }
        File file = new File(E, "assets");
        if (!file.isDirectory()) {
            f10744c.b("Failed to find assets directory: %s", file);
            return null;
        }
        return new h0(0, E, file.getCanonicalPath());
    }

    final File t(String str, int i10) {
        return new File(h(str), String.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File u(String str, int i10, long j10) {
        return new File(t(str, i10), String.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File v(String str, int i10, long j10) {
        return new File(u(str, i10, j10), "_metadata");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File w(String str, int i10, long j10) {
        return new File(j(str, i10, j10), "_packs");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File x(String str, int i10, long j10) {
        return new File(v(str, i10, j10), "properties.dat");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File y(String str, int i10, long j10) {
        return new File(new File(j(str, i10, j10), "_slices"), "_metadata");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File z(String str, int i10, long j10, String str2) {
        return new File(B(str, i10, j10, str2), "checkpoint_ext.dat");
    }
}
