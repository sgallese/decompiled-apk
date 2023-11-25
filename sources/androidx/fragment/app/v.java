package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback.java */
/* loaded from: classes.dex */
public abstract class v<E> extends s {

    /* renamed from: f  reason: collision with root package name */
    private final Activity f4839f;

    /* renamed from: m  reason: collision with root package name */
    private final Context f4840m;

    /* renamed from: p  reason: collision with root package name */
    private final Handler f4841p;

    /* renamed from: q  reason: collision with root package name */
    private final int f4842q;

    /* renamed from: r  reason: collision with root package name */
    final FragmentManager f4843r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(q qVar) {
        this(qVar, qVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.s
    public View c(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.s
    public boolean d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity e() {
        return this.f4839f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f4840m;
    }

    public Handler g() {
        return this.f4841p;
    }

    public abstract E i();

    public LayoutInflater j() {
        return LayoutInflater.from(this.f4840m);
    }

    public boolean l(String str) {
        return false;
    }

    public void m(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.content.a.m(this.f4840m, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    public void n(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            androidx.core.app.b.A(this.f4839f, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    v(Activity activity, Context context, Handler handler, int i10) {
        this.f4843r = new d0();
        this.f4839f = activity;
        this.f4840m = (Context) androidx.core.util.i.h(context, "context == null");
        this.f4841p = (Handler) androidx.core.util.i.h(handler, "handler == null");
        this.f4842q = i10;
    }

    public void o() {
    }

    @Deprecated
    public void k(Fragment fragment, String[] strArr, int i10) {
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
