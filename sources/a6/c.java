package a6;

import a6.b;
import android.content.Context;
import android.util.Log;
import b6.i;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: ReLinkerInstance.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected final Set<String> f396a;

    /* renamed from: b  reason: collision with root package name */
    protected final b.InterfaceC0006b f397b;

    /* renamed from: c  reason: collision with root package name */
    protected final b.a f398c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f399d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f400e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReLinkerInstance.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f401f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f402m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ String f403p;

        a(Context context, String str, String str2, b.c cVar) {
            this.f401f = context;
            this.f402m = str;
            this.f403p = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r5 = this;
                r0 = 0
                a6.c r1 = a6.c.this     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                android.content.Context r2 = r5.f401f     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r3 = r5.f402m     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r4 = r5.f403p     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                a6.c.a(r1, r2, r3, r4)     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                throw r0
            Ld:
                throw r0
            Le:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a6.c.a.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReLinkerInstance.java */
    /* loaded from: classes.dex */
    public class b implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f405a;

        b(String str) {
            this.f405a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f405a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c() {
        this(new d(), new a6.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context, String str, String str2) {
        if (this.f396a.contains(str) && !this.f399d) {
            i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f397b.b(str);
            this.f396a.add(str);
            i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e10) {
            i("Loading the library normally failed: %s", Log.getStackTraceString(e10));
            i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File d10 = d(context, str, str2);
            if (!d10.exists() || this.f399d) {
                if (this.f399d) {
                    i("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                this.f398c.a(context, this.f397b.d(), this.f397b.a(str), d10, this);
            }
            try {
                if (this.f400e) {
                    i iVar = null;
                    try {
                        i iVar2 = new i(d10);
                        try {
                            List<String> d11 = iVar2.d();
                            iVar2.close();
                            Iterator<String> it = d11.iterator();
                            while (it.hasNext()) {
                                e(context, this.f397b.c(it.next()));
                            }
                        } catch (Throwable th) {
                            th = th;
                            iVar = iVar2;
                            iVar.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (IOException unused) {
            }
            this.f397b.e(d10.getAbsolutePath());
            this.f396a.add(str);
            i("%s (%s) was re-linked!", str, str2);
        }
    }

    protected void b(Context context, String str, String str2) {
        File c10 = c(context);
        File d10 = d(context, str, str2);
        File[] listFiles = c10.listFiles(new b(this.f397b.a(str)));
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (this.f399d || !file.getAbsolutePath().equals(d10.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    protected File c(Context context) {
        return context.getDir("lib", 0);
    }

    protected File d(Context context, String str, String str2) {
        String a10 = this.f397b.a(str);
        if (e.a(str2)) {
            return new File(c(context), a10);
        }
        return new File(c(context), a10 + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, b.c cVar) {
        if (context != null) {
            if (!e.a(str)) {
                i("Beginning load of %s...", str);
                if (cVar == null) {
                    g(context, str, str2);
                    return;
                } else {
                    new Thread(new a(context, str, str2, cVar)).start();
                    return;
                }
            }
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        throw new IllegalArgumentException("Given context is null");
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }

    protected c(b.InterfaceC0006b interfaceC0006b, b.a aVar) {
        this.f396a = new HashSet();
        if (interfaceC0006b == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar != null) {
            this.f397b = interfaceC0006b;
            this.f398c = aVar;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null library installer");
    }

    public void h(String str) {
    }
}
