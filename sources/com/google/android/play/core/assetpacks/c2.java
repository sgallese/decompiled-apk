package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.play.core.common.LocalTestingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class c2 implements t3 {

    /* renamed from: i  reason: collision with root package name */
    private static final x7.f f10730i = new x7.f("FakeAssetPackService");

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicInteger f10731j = new AtomicInteger(1);

    /* renamed from: a  reason: collision with root package name */
    private final String f10732a;

    /* renamed from: b  reason: collision with root package name */
    private final x f10733b;

    /* renamed from: c  reason: collision with root package name */
    private final g1 f10734c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f10735d;

    /* renamed from: e  reason: collision with root package name */
    private final q2 f10736e;

    /* renamed from: f  reason: collision with root package name */
    private final x7.b0 f10737f;

    /* renamed from: g  reason: collision with root package name */
    private final o2 f10738g;

    /* renamed from: h  reason: collision with root package name */
    private final Handler f10739h = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    public c2(File file, x xVar, g1 g1Var, Context context, q2 q2Var, x7.b0 b0Var, o2 o2Var) {
        this.f10732a = file.getAbsolutePath();
        this.f10733b = xVar;
        this.f10734c = g1Var;
        this.f10735d = context;
        this.f10736e = q2Var;
        this.f10737f = b0Var;
        this.f10738g = o2Var;
    }

    static long f(int i10, long j10) {
        if (i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                return 0L;
            }
            return j10;
        }
        return j10 / 2;
    }

    private final Bundle i(int i10, String str, int i11) throws LocalTestingException {
        Intent intent;
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f10736e.a());
        bundle.putInt("session_id", i10);
        File[] k10 = k(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j10 = 0;
        for (File file : k10) {
            j10 += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            if (i11 == 3) {
                intent = new Intent().setData(Uri.EMPTY);
            } else {
                intent = null;
            }
            arrayList2.add(intent);
            String a10 = x7.x.a(file);
            bundle.putParcelableArrayList(v7.b.b("chunk_intents", str, a10), arrayList2);
            bundle.putString(v7.b.b("uncompressed_hash_sha256", str, a10), j(file));
            bundle.putLong(v7.b.b("uncompressed_size", str, a10), file.length());
            arrayList.add(a10);
        }
        bundle.putStringArrayList(v7.b.a("slice_ids", str), arrayList);
        bundle.putLong(v7.b.a("pack_version", str), this.f10736e.a());
        bundle.putInt(v7.b.a("status", str), i11);
        bundle.putInt(v7.b.a("error_code", str), 0);
        bundle.putLong(v7.b.a("bytes_downloaded", str), f(i11, j10));
        bundle.putLong(v7.b.a("total_bytes_to_download", str), j10);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", f(i11, j10));
        bundle.putLong("total_bytes_to_download", j10);
        final Intent putExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f10739h.post(new Runnable() { // from class: com.google.android.play.core.assetpacks.b2
            @Override // java.lang.Runnable
            public final void run() {
                c2.this.g(putExtra);
            }
        });
        return bundle;
    }

    private static String j(File file) throws LocalTestingException {
        try {
            return e2.a(Arrays.asList(file));
        } catch (IOException e10) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", file), e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e11);
        }
    }

    private final File[] k(final String str) throws LocalTestingException {
        File file = new File(this.f10732a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new FilenameFilter() { // from class: u7.h
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    if (str2.startsWith(String.valueOf(str).concat("-")) && str2.endsWith(".apk")) {
                        return true;
                    }
                    return false;
                }
            });
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (x7.x.a(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No main slice available for pack '%s'.", str));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
    }

    @Override // com.google.android.play.core.assetpacks.t3
    public final void a(final int i10, final String str) {
        f10730i.d("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f10737f.zza()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.a2
            @Override // java.lang.Runnable
            public final void run() {
                c2.this.h(i10, str);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.t3
    public final c8.d b(int i10, String str, String str2, int i11) {
        int i12;
        f10730i.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i10), str, str2, Integer.valueOf(i11));
        c8.o oVar = new c8.o();
        try {
        } catch (LocalTestingException e10) {
            f10730i.e("getChunkFileDescriptor failed", e10);
            oVar.b(e10);
        } catch (FileNotFoundException e11) {
            f10730i.e("getChunkFileDescriptor failed", e11);
            oVar.b(new LocalTestingException("Asset Slice file not found.", e11));
        }
        for (File file : k(str)) {
            if (x7.x.a(file).equals(str2)) {
                oVar.c(ParcelFileDescriptor.open(file, 268435456));
                return oVar.a();
            }
        }
        throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // com.google.android.play.core.assetpacks.t3
    public final void c(int i10, String str, String str2, int i11) {
        f10730i.d("notifyChunkTransferred", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.t3
    public final c8.d d(Map map) {
        f10730i.d("syncPacks()", new Object[0]);
        return c8.f.c(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.t3
    public final void e(List list) {
        f10730i.d("cancelDownload(%s)", list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g(Intent intent) {
        this.f10733b.a(this.f10735d, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h(int i10, String str) {
        try {
            i(i10, str, 4);
        } catch (LocalTestingException e10) {
            f10730i.e("notifyModuleCompleted failed", e10);
        }
    }

    @Override // com.google.android.play.core.assetpacks.t3
    public final void zzf() {
        f10730i.d("keepAlive", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.t3
    public final void zzi(int i10) {
        f10730i.d("notifySessionFailed", new Object[0]);
    }
}
