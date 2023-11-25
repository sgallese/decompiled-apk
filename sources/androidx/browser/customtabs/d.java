package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import androidx.core.app.g;
import java.util.ArrayList;

/* compiled from: CustomTabsIntent.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f1758a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f1759b;

    d(Intent intent, Bundle bundle) {
        this.f1758a = intent;
        this.f1759b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f1758a.setData(uri);
        androidx.core.content.a.m(context, this.f1758a, this.f1759b);
    }

    /* compiled from: CustomTabsIntent.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<Bundle> f1762c;

        /* renamed from: d  reason: collision with root package name */
        private Bundle f1763d;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<Bundle> f1764e;

        /* renamed from: f  reason: collision with root package name */
        private SparseArray<Bundle> f1765f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f1766g;

        /* renamed from: a  reason: collision with root package name */
        private final Intent f1760a = new Intent("android.intent.action.VIEW");

        /* renamed from: b  reason: collision with root package name */
        private final a.C0016a f1761b = new a.C0016a();

        /* renamed from: h  reason: collision with root package name */
        private int f1767h = 0;

        /* renamed from: i  reason: collision with root package name */
        private boolean f1768i = true;

        public a() {
        }

        private void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            g.a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1760a.putExtras(bundle);
        }

        public d a() {
            if (!this.f1760a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c(null, null);
            }
            ArrayList<Bundle> arrayList = this.f1762c;
            if (arrayList != null) {
                this.f1760a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1764e;
            if (arrayList2 != null) {
                this.f1760a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1760a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1768i);
            this.f1760a.putExtras(this.f1761b.a().a());
            Bundle bundle = this.f1766g;
            if (bundle != null) {
                this.f1760a.putExtras(bundle);
            }
            if (this.f1765f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1765f);
                this.f1760a.putExtras(bundle2);
            }
            this.f1760a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1767h);
            return new d(this.f1760a, this.f1763d);
        }

        public a b(f fVar) {
            this.f1760a.setPackage(fVar.b().getPackageName());
            c(fVar.a(), fVar.c());
            return this;
        }

        public a(f fVar) {
            if (fVar != null) {
                b(fVar);
            }
        }
    }
}
