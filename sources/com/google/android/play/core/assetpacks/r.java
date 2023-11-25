package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import x7.k0;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class r implements t3 {

    /* renamed from: g  reason: collision with root package name */
    private static final x7.f f10956g = new x7.f("AssetPackServiceImpl");

    /* renamed from: h  reason: collision with root package name */
    private static final Intent f10957h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a  reason: collision with root package name */
    private final String f10958a;

    /* renamed from: b  reason: collision with root package name */
    private final g1 f10959b;

    /* renamed from: c  reason: collision with root package name */
    private final o2 f10960c;

    /* renamed from: d  reason: collision with root package name */
    private x7.r f10961d;

    /* renamed from: e  reason: collision with root package name */
    private x7.r f10962e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f10963f = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Context context, g1 g1Var, o2 o2Var) {
        this.f10958a = context.getPackageName();
        this.f10959b = g1Var;
        this.f10960c = o2Var;
        if (x7.v.b(context)) {
            Context a10 = x7.t.a(context);
            x7.f fVar = f10956g;
            Intent intent = f10957h;
            u7.n nVar = new x7.m() { // from class: u7.n
                @Override // x7.m
                public final Object zza(IBinder iBinder) {
                    return k0.K(iBinder);
                }
            };
            this.f10961d = new x7.r(a10, fVar, "AssetPackService", intent, nVar, null);
            this.f10962e = new x7.r(x7.t.a(context), fVar, "AssetPackService-keepAlive", intent, nVar, null);
        }
        f10956g.a("AssetPackService initiated.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11003);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle g(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i10);
        return bundle;
    }

    private static c8.d h() {
        f10956g.b("onError(%d)", -11);
        return c8.f.b(new AssetPackException(-11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(int i10, String str, int i11) {
        if (this.f10961d != null) {
            f10956g.d("notifyModuleCompleted", new Object[0]);
            c8.o oVar = new c8.o();
            this.f10961d.q(new f(this, oVar, i10, str, oVar, i11), oVar);
            return;
        }
        throw new c1("The Play Store app is not installed or is an unofficial version.", i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Bundle j(int i10, String str, String str2, int i11) {
        Bundle w10 = w(i10, str);
        w10.putString("slice_id", str2);
        w10.putInt("chunk_number", i11);
        return w10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Bundle m(Map map) {
        Bundle f10 = f();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        f10.putParcelableArrayList("installed_asset_module", arrayList);
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ ArrayList s(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ List t(r rVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = b.c((Bundle) it.next(), rVar.f10959b, rVar.f10960c).a().values().iterator().next();
            if (next == null) {
                f10956g.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (c0.a(next.d())) {
                arrayList.add(next.c());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle w(int i10, String str) {
        Bundle g10 = g(i10);
        g10.putString("module_name", str);
        return g10;
    }

    @Override // com.google.android.play.core.assetpacks.t3
    public final void a(int i10, String str) {
        i(i10, str, 10);
    }

    @Override // com.google.android.play.core.assetpacks.t3
    public final c8.d b(int i10, String str, String str2, int i11) {
        if (this.f10961d == null) {
            return h();
        }
        f10956g.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i11), Integer.valueOf(i10));
        c8.o oVar = new c8.o();
        this.f10961d.q(new h(this, oVar, i10, str, str2, i11, oVar), oVar);
        return oVar.a();
    }

    @Override // com.google.android.play.core.assetpacks.t3
    public final void c(int i10, String str, String str2, int i11) {
        if (this.f10961d != null) {
            f10956g.d("notifyChunkTransferred", new Object[0]);
            c8.o oVar = new c8.o();
            this.f10961d.q(new e(this, oVar, i10, str, str2, i11, oVar), oVar);
            return;
        }
        throw new c1("The Play Store app is not installed or is an unofficial version.", i10);
    }

    @Override // com.google.android.play.core.assetpacks.t3
    public final c8.d d(Map map) {
        if (this.f10961d == null) {
            return h();
        }
        f10956g.d("syncPacks", new Object[0]);
        c8.o oVar = new c8.o();
        this.f10961d.q(new d(this, oVar, map, oVar), oVar);
        return oVar.a();
    }

    @Override // com.google.android.play.core.assetpacks.t3
    public final void e(List list) {
        if (this.f10961d == null) {
            return;
        }
        f10956g.d("cancelDownloads(%s)", list);
        c8.o oVar = new c8.o();
        this.f10961d.q(new c(this, oVar, list, oVar), oVar);
    }

    @Override // com.google.android.play.core.assetpacks.t3
    public final synchronized void zzf() {
        if (this.f10962e == null) {
            f10956g.e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        x7.f fVar = f10956g;
        fVar.d("keepAlive", new Object[0]);
        if (!this.f10963f.compareAndSet(false, true)) {
            fVar.d("Service is already kept alive.", new Object[0]);
            return;
        }
        c8.o oVar = new c8.o();
        this.f10962e.q(new i(this, oVar, oVar), oVar);
    }

    @Override // com.google.android.play.core.assetpacks.t3
    public final void zzi(int i10) {
        if (this.f10961d != null) {
            f10956g.d("notifySessionFailed", new Object[0]);
            c8.o oVar = new c8.o();
            this.f10961d.q(new g(this, oVar, i10, oVar), oVar);
            return;
        }
        throw new c1("The Play Store app is not installed or is an unofficial version.", i10);
    }
}
