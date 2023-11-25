package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.h;
import androidx.lifecycle.b1;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.loader.app.a;
import androidx.loader.content.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes.dex */
public class b extends androidx.loader.app.a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f5087c = false;

    /* renamed from: a  reason: collision with root package name */
    private final v f5088a;

    /* renamed from: b  reason: collision with root package name */
    private final c f5089b;

    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class a<D> extends f0<D> implements b.InterfaceC0107b<D> {

        /* renamed from: l  reason: collision with root package name */
        private final int f5090l;

        /* renamed from: m  reason: collision with root package name */
        private final Bundle f5091m;

        /* renamed from: n  reason: collision with root package name */
        private final androidx.loader.content.b<D> f5092n;

        /* renamed from: o  reason: collision with root package name */
        private v f5093o;

        /* renamed from: p  reason: collision with root package name */
        private C0105b<D> f5094p;

        /* renamed from: q  reason: collision with root package name */
        private androidx.loader.content.b<D> f5095q;

        a(int i10, Bundle bundle, androidx.loader.content.b<D> bVar, androidx.loader.content.b<D> bVar2) {
            this.f5090l = i10;
            this.f5091m = bundle;
            this.f5092n = bVar;
            this.f5095q = bVar2;
            bVar.registerListener(i10, this);
        }

        @Override // androidx.loader.content.b.InterfaceC0107b
        public void a(androidx.loader.content.b<D> bVar, D d10) {
            if (b.f5087c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                p(d10);
                return;
            }
            if (b.f5087c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            n(d10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void l() {
            if (b.f5087c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f5092n.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        protected void m() {
            if (b.f5087c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f5092n.stopLoading();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void o(g0<? super D> g0Var) {
            super.o(g0Var);
            this.f5093o = null;
            this.f5094p = null;
        }

        @Override // androidx.lifecycle.f0, androidx.lifecycle.LiveData
        public void p(D d10) {
            super.p(d10);
            androidx.loader.content.b<D> bVar = this.f5095q;
            if (bVar != null) {
                bVar.reset();
                this.f5095q = null;
            }
        }

        androidx.loader.content.b<D> q(boolean z10) {
            if (b.f5087c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f5092n.cancelLoad();
            this.f5092n.abandon();
            C0105b<D> c0105b = this.f5094p;
            if (c0105b != null) {
                o(c0105b);
                if (z10) {
                    c0105b.c();
                }
            }
            this.f5092n.unregisterListener(this);
            if ((c0105b != null && !c0105b.b()) || z10) {
                this.f5092n.reset();
                return this.f5095q;
            }
            return this.f5092n;
        }

        public void r(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f5090l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f5091m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f5092n);
            this.f5092n.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f5094p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f5094p);
                this.f5094p.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(s().dataToString(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        androidx.loader.content.b<D> s() {
            return this.f5092n;
        }

        void t() {
            v vVar = this.f5093o;
            C0105b<D> c0105b = this.f5094p;
            if (vVar != null && c0105b != null) {
                super.o(c0105b);
                j(vVar, c0105b);
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f5090l);
            sb2.append(" : ");
            androidx.core.util.b.a(this.f5092n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }

        androidx.loader.content.b<D> u(v vVar, a.InterfaceC0104a<D> interfaceC0104a) {
            C0105b<D> c0105b = new C0105b<>(this.f5092n, interfaceC0104a);
            j(vVar, c0105b);
            C0105b<D> c0105b2 = this.f5094p;
            if (c0105b2 != null) {
                o(c0105b2);
            }
            this.f5093o = vVar;
            this.f5094p = c0105b;
            return this.f5092n;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: androidx.loader.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0105b<D> implements g0<D> {

        /* renamed from: f  reason: collision with root package name */
        private final androidx.loader.content.b<D> f5096f;

        /* renamed from: m  reason: collision with root package name */
        private final a.InterfaceC0104a<D> f5097m;

        /* renamed from: p  reason: collision with root package name */
        private boolean f5098p = false;

        C0105b(androidx.loader.content.b<D> bVar, a.InterfaceC0104a<D> interfaceC0104a) {
            this.f5096f = bVar;
            this.f5097m = interfaceC0104a;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f5098p);
        }

        boolean b() {
            return this.f5098p;
        }

        void c() {
            if (this.f5098p) {
                if (b.f5087c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f5096f);
                }
                this.f5097m.onLoaderReset(this.f5096f);
            }
        }

        @Override // androidx.lifecycle.g0
        public void onChanged(D d10) {
            if (b.f5087c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f5096f + ": " + this.f5096f.dataToString(d10));
            }
            this.f5097m.onLoadFinished(this.f5096f, d10);
            this.f5098p = true;
        }

        public String toString() {
            return this.f5097m.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class c extends v0 {

        /* renamed from: c  reason: collision with root package name */
        private static final y0.b f5099c = new a();

        /* renamed from: a  reason: collision with root package name */
        private h<a> f5100a = new h<>();

        /* renamed from: b  reason: collision with root package name */
        private boolean f5101b = false;

        /* compiled from: LoaderManagerImpl.java */
        /* loaded from: classes.dex */
        static class a implements y0.b {
            a() {
            }

            @Override // androidx.lifecycle.y0.b
            public <T extends v0> T a(Class<T> cls) {
                return new c();
            }

            @Override // androidx.lifecycle.y0.b
            public /* synthetic */ v0 b(Class cls, j3.a aVar) {
                return z0.b(this, cls, aVar);
            }
        }

        c() {
        }

        static c d(b1 b1Var) {
            return (c) new y0(b1Var, f5099c).a(c.class);
        }

        public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f5100a.q() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f5100a.q(); i10++) {
                    a r10 = this.f5100a.r(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f5100a.l(i10));
                    printWriter.print(": ");
                    printWriter.println(r10.toString());
                    r10.r(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void c() {
            this.f5101b = false;
        }

        <D> a<D> e(int i10) {
            return this.f5100a.g(i10);
        }

        boolean f() {
            return this.f5101b;
        }

        void g() {
            int q10 = this.f5100a.q();
            for (int i10 = 0; i10 < q10; i10++) {
                this.f5100a.r(i10).t();
            }
        }

        void h(int i10, a aVar) {
            this.f5100a.n(i10, aVar);
        }

        void i() {
            this.f5101b = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.v0
        public void onCleared() {
            super.onCleared();
            int q10 = this.f5100a.q();
            for (int i10 = 0; i10 < q10; i10++) {
                this.f5100a.r(i10).q(true);
            }
            this.f5100a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(v vVar, b1 b1Var) {
        this.f5088a = vVar;
        this.f5089b = c.d(b1Var);
    }

    private <D> androidx.loader.content.b<D> e(int i10, Bundle bundle, a.InterfaceC0104a<D> interfaceC0104a, androidx.loader.content.b<D> bVar) {
        try {
            this.f5089b.i();
            androidx.loader.content.b<D> onCreateLoader = interfaceC0104a.onCreateLoader(i10, bundle);
            if (onCreateLoader != null) {
                if (onCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                }
                a aVar = new a(i10, bundle, onCreateLoader, bVar);
                if (f5087c) {
                    Log.v("LoaderManager", "  Created new loader " + aVar);
                }
                this.f5089b.h(i10, aVar);
                this.f5089b.c();
                return aVar.u(this.f5088a, interfaceC0104a);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f5089b.c();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f5089b.b(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public <D> androidx.loader.content.b<D> c(int i10, Bundle bundle, a.InterfaceC0104a<D> interfaceC0104a) {
        if (!this.f5089b.f()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                a<D> e10 = this.f5089b.e(i10);
                if (f5087c) {
                    Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
                }
                if (e10 == null) {
                    return e(i10, bundle, interfaceC0104a, null);
                }
                if (f5087c) {
                    Log.v("LoaderManager", "  Re-using existing loader " + e10);
                }
                return e10.u(this.f5088a, interfaceC0104a);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f5089b.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        androidx.core.util.b.a(this.f5088a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
