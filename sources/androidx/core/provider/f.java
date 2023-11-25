package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    static final androidx.collection.f<String, Typeface> f3972a = new androidx.collection.f<>(16);

    /* renamed from: b  reason: collision with root package name */
    private static final ExecutorService f3973b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    static final Object f3974c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final androidx.collection.g<String, ArrayList<androidx.core.util.a<e>>> f3975d = new androidx.collection.g<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public class a implements Callable<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f3976a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f3977b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f3978c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3979d;

        a(String str, Context context, androidx.core.provider.e eVar, int i10) {
            this.f3976a = str;
            this.f3977b = context;
            this.f3978c = eVar;
            this.f3979d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f3976a, this.f3977b, this.f3978c, this.f3979d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public class b implements androidx.core.util.a<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.a f3980a;

        b(androidx.core.provider.a aVar) {
            this.f3980a = aVar;
        }

        @Override // androidx.core.util.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f3980a.b(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public class c implements Callable<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f3981a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f3982b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f3983c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3984d;

        c(String str, Context context, androidx.core.provider.e eVar, int i10) {
            this.f3981a = str;
            this.f3982b = context;
            this.f3983c = eVar;
            this.f3984d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f3981a, this.f3982b, this.f3983c, this.f3984d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public class d implements androidx.core.util.a<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f3985a;

        d(String str) {
            this.f3985a = str;
        }

        @Override // androidx.core.util.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(e eVar) {
            synchronized (f.f3974c) {
                androidx.collection.g<String, ArrayList<androidx.core.util.a<e>>> gVar = f.f3975d;
                ArrayList<androidx.core.util.a<e>> arrayList = gVar.get(this.f3985a);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.f3985a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).a(eVar);
                }
            }
        }
    }

    private static String a(androidx.core.provider.e eVar, int i10) {
        return eVar.d() + "-" + i10;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            if (aVar.c() != 1) {
                return -3;
            }
            return -2;
        }
        g.b[] b10 = aVar.b();
        if (b10 != null && b10.length != 0) {
            i10 = 0;
            for (g.b bVar : b10) {
                int b11 = bVar.b();
                if (b11 != 0) {
                    if (b11 < 0) {
                        return -3;
                    }
                    return b11;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, androidx.core.provider.e eVar, int i10) {
        androidx.collection.f<String, Typeface> fVar = f3972a;
        Typeface typeface = fVar.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a e10 = androidx.core.provider.d.e(context, eVar, null);
            int b10 = b(e10);
            if (b10 != 0) {
                return new e(b10);
            }
            Typeface b11 = androidx.core.graphics.e.b(context, null, e10.b(), i10);
            if (b11 != null) {
                fVar.put(str, b11);
                return new e(b11);
            }
            return new e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface d(Context context, androidx.core.provider.e eVar, int i10, Executor executor, androidx.core.provider.a aVar) {
        String a10 = a(eVar, i10);
        Typeface typeface = f3972a.get(a10);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f3974c) {
            androidx.collection.g<String, ArrayList<androidx.core.util.a<e>>> gVar = f3975d;
            ArrayList<androidx.core.util.a<e>> arrayList = gVar.get(a10);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<androidx.core.util.a<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            gVar.put(a10, arrayList2);
            c cVar = new c(a10, context, eVar, i10);
            if (executor == null) {
                executor = f3973b;
            }
            h.b(executor, cVar, new d(a10));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface e(Context context, androidx.core.provider.e eVar, androidx.core.provider.a aVar, int i10, int i11) {
        String a10 = a(eVar, i10);
        Typeface typeface = f3972a.get(a10);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        } else if (i11 == -1) {
            e c10 = c(a10, context, eVar, i10);
            aVar.b(c10);
            return c10.f3986a;
        } else {
            try {
                e eVar2 = (e) h.c(f3973b, new a(a10, context, eVar, i10), i11);
                aVar.b(eVar2);
                return eVar2.f3986a;
            } catch (InterruptedException unused) {
                aVar.b(new e(-3));
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        final Typeface f3986a;

        /* renamed from: b  reason: collision with root package name */
        final int f3987b;

        e(int i10) {
            this.f3986a = null;
            this.f3987b = i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean a() {
            if (this.f3987b == 0) {
                return true;
            }
            return false;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.f3986a = typeface;
            this.f3987b = 0;
        }
    }
}
