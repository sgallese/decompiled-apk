package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import b.a;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final b.b f1753a;

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f1754b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1755c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b.b bVar, ComponentName componentName, Context context) {
        this.f1753a = bVar;
        this.f1754b = componentName;
        this.f1755c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private a.AbstractBinderC0173a b(b bVar) {
        return new a(bVar);
    }

    private f d(b bVar, PendingIntent pendingIntent) {
        boolean m10;
        a.AbstractBinderC0173a b10 = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                m10 = this.f1753a.t(b10, bundle);
            } else {
                m10 = this.f1753a.m(b10);
            }
            if (!m10) {
                return null;
            }
            return new f(this.f1753a, b10, this.f1754b, pendingIntent);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f c(b bVar) {
        return d(bVar, null);
    }

    public boolean e(long j10) {
        try {
            return this.f1753a.k(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CustomTabsClient.java */
    /* loaded from: classes.dex */
    public class a extends a.AbstractBinderC0173a {

        /* renamed from: f  reason: collision with root package name */
        private Handler f1756f = new Handler(Looper.getMainLooper());

        a(b bVar) {
        }

        @Override // b.a
        public Bundle h(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // b.a
        public void C(Bundle bundle) throws RemoteException {
        }

        @Override // b.a
        public void s(String str, Bundle bundle) throws RemoteException {
        }

        @Override // b.a
        public void v(int i10, Bundle bundle) {
        }

        @Override // b.a
        public void x(String str, Bundle bundle) throws RemoteException {
        }

        @Override // b.a
        public void F(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
        }
    }
}
