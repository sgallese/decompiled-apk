package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.c1;
import androidx.lifecycle.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: LoaderManager.java */
    /* renamed from: androidx.loader.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0104a<D> {
        androidx.loader.content.b<D> onCreateLoader(int i10, Bundle bundle);

        void onLoadFinished(androidx.loader.content.b<D> bVar, D d10);

        void onLoaderReset(androidx.loader.content.b<D> bVar);
    }

    public static <T extends v & c1> a b(T t10) {
        return new b(t10, t10.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> androidx.loader.content.b<D> c(int i10, Bundle bundle, InterfaceC0104a<D> interfaceC0104a);

    public abstract void d();
}
