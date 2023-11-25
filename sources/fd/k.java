package fd;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* compiled from: FastServiceLoader.kt */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f15642a = new k();

    private k() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        List<S> C0;
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            C0 = ec.b0.C0(ServiceLoader.load(cls, classLoader));
            return C0;
        }
    }

    private final List<String> e(URL url) {
        boolean F;
        BufferedReader bufferedReader;
        String I0;
        String N0;
        String I02;
        String url2 = url.toString();
        F = yc.v.F(url2, "jar", false, 2, null);
        if (F) {
            I0 = yc.w.I0(url2, "jar:file:", null, 2, null);
            N0 = yc.w.N0(I0, '!', null, 2, null);
            I02 = yc.w.I0(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(N0, false);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(I02)), "UTF-8"));
                try {
                    List<String> f10 = f15642a.f(bufferedReader);
                    nc.b.a(bufferedReader, null);
                    jarFile.close();
                    return f10;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        dc.b.a(th, th3);
                        throw th;
                    }
                }
            }
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(FirebasePerfUrlConnection.openStream(url)));
            try {
                List<String> f11 = f15642a.f(bufferedReader);
                nc.b.a(bufferedReader, null);
                return f11;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } finally {
                }
            }
        }
    }

    private final List<String> f(BufferedReader bufferedReader) {
        List<String> C0;
        String O0;
        CharSequence T0;
        boolean z10;
        boolean z11;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                C0 = ec.b0.C0(linkedHashSet);
                return C0;
            }
            O0 = yc.w.O0(readLine, "#", null, 2, null);
            T0 = yc.w.T0(O0);
            String obj = T0.toString();
            boolean z12 = false;
            int i10 = 0;
            while (true) {
                if (i10 < obj.length()) {
                    char charAt = obj.charAt(i10);
                    if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        z10 = false;
                        break;
                    }
                    i10++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                if (obj.length() > 0) {
                    z12 = true;
                }
                if (z12) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
        }
    }

    public final List<u> c() {
        u uVar;
        if (!l.a()) {
            return b(u.class, u.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            u uVar2 = null;
            try {
                uVar = (u) u.class.cast(Class.forName("bd.a", true, u.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                uVar = null;
            }
            if (uVar != null) {
                arrayList.add(uVar);
            }
            try {
                uVar2 = (u) u.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, u.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (uVar2 != null) {
                arrayList.add(uVar2);
                return arrayList;
            }
            return arrayList;
        } catch (Throwable unused3) {
            return b(u.class, u.class.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        Set H0;
        int s10;
        ArrayList list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        qc.q.h(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ec.y.w(arrayList, f15642a.e((URL) it.next()));
        }
        H0 = ec.b0.H0(arrayList);
        if ((!H0.isEmpty()) != false) {
            Set set = H0;
            s10 = ec.u.s(set, 10);
            ArrayList arrayList2 = new ArrayList(s10);
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList2.add(f15642a.a((String) it2.next(), classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
