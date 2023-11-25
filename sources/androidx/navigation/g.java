package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.y;
import ec.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NavDeepLinkBuilder.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private final Context f5295a;

    /* renamed from: b */
    private final Intent f5296b;

    /* renamed from: c */
    private j f5297c;

    /* renamed from: d */
    private final List<a> f5298d;

    /* renamed from: e */
    private Bundle f5299e;

    /* compiled from: NavDeepLinkBuilder.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final int f5300a;

        /* renamed from: b */
        private final Bundle f5301b;

        public a(int i10, Bundle bundle) {
            this.f5300a = i10;
            this.f5301b = bundle;
        }

        public final Bundle a() {
            return this.f5301b;
        }

        public final int b() {
            return this.f5300a;
        }
    }

    public g(Context context) {
        Intent launchIntentForPackage;
        qc.q.i(context, "context");
        this.f5295a = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f5296b = launchIntentForPackage;
        this.f5298d = new ArrayList();
    }

    private final void c() {
        int[] B0;
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        i iVar = null;
        for (a aVar : this.f5298d) {
            int b10 = aVar.b();
            Bundle a10 = aVar.a();
            i d10 = d(b10);
            if (d10 != null) {
                for (int i10 : d10.i(iVar)) {
                    arrayList.add(Integer.valueOf(i10));
                    arrayList2.add(a10);
                }
                iVar = d10;
            } else {
                throw new IllegalArgumentException("Navigation destination " + i.f5309w.b(this.f5295a, b10) + " cannot be found in the navigation graph " + this.f5297c);
            }
        }
        B0 = b0.B0(arrayList);
        this.f5296b.putExtra("android-support-nav:controller:deepLinkIds", B0);
        this.f5296b.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
    }

    private final i d(int i10) {
        ec.k kVar = new ec.k();
        j jVar = this.f5297c;
        qc.q.f(jVar);
        kVar.add(jVar);
        while (!kVar.isEmpty()) {
            i iVar = (i) kVar.s();
            if (iVar.n() == i10) {
                return iVar;
            }
            if (iVar instanceof j) {
                Iterator<i> it = ((j) iVar).iterator();
                while (it.hasNext()) {
                    kVar.add(it.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ g g(g gVar, int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return gVar.f(i10, bundle);
    }

    private final void h() {
        Iterator<a> it = this.f5298d.iterator();
        while (it.hasNext()) {
            int b10 = it.next().b();
            if (d(b10) == null) {
                throw new IllegalArgumentException("Navigation destination " + i.f5309w.b(this.f5295a, b10) + " cannot be found in the navigation graph " + this.f5297c);
            }
        }
    }

    public final g a(int i10, Bundle bundle) {
        this.f5298d.add(new a(i10, bundle));
        if (this.f5297c != null) {
            h();
        }
        return this;
    }

    public final y b() {
        if (this.f5297c != null) {
            if ((!this.f5298d.isEmpty()) != false) {
                c();
                y e10 = y.h(this.f5295a).e(new Intent(this.f5296b));
                qc.q.h(e10, "create(context)\n        …rentStack(Intent(intent))");
                int j10 = e10.j();
                for (int i10 = 0; i10 < j10; i10++) {
                    Intent i11 = e10.i(i10);
                    if (i11 != null) {
                        i11.putExtra("android-support-nav:controller:deepLinkIntent", this.f5296b);
                    }
                }
                return e10;
            }
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
        throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
    }

    public final g e(Bundle bundle) {
        this.f5299e = bundle;
        this.f5296b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public final g f(int i10, Bundle bundle) {
        this.f5298d.clear();
        this.f5298d.add(new a(i10, bundle));
        if (this.f5297c != null) {
            h();
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(d dVar) {
        this(dVar.B());
        qc.q.i(dVar, "navController");
        this.f5297c = dVar.F();
    }
}
