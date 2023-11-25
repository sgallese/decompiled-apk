package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontProvider.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<byte[]> f3965a = new Comparator() { // from class: androidx.core.provider.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g10;
            g10 = d.g((byte[]) obj, (byte[]) obj2);
            return g10;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontProvider.java */
    /* loaded from: classes.dex */
    public static class a {
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(e eVar, Resources resources) {
        if (eVar.b() != null) {
            return eVar.b();
        }
        return androidx.core.content.res.e.c(resources, eVar.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g.a e(Context context, e eVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo f10 = f(context.getPackageManager(), eVar, context.getResources());
        if (f10 == null) {
            return g.a.a(1, null);
        }
        return g.a.a(0, h(context, eVar, f10.authority, cancellationSignal));
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) throws PackageManager.NameNotFoundException {
        String e10 = eVar.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e10, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(eVar.f())) {
                List<byte[]> b10 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(b10, f3965a);
                List<List<byte[]>> d10 = d(eVar, resources);
                for (int i10 = 0; i10 < d10.size(); i10++) {
                    ArrayList arrayList = new ArrayList(d10.get(i10));
                    Collections.sort(arrayList, f3965a);
                    if (c(b10, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + e10 + ", but package was not " + eVar.f());
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    static g.b[] h(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        int i10;
        int i11;
        Uri withAppendedId;
        int i12;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            Cursor a10 = a.a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
            if (a10 != null) {
                try {
                    if (a10.getCount() > 0) {
                        int columnIndex = a10.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = a10.getColumnIndex("_id");
                        int columnIndex3 = a10.getColumnIndex("file_id");
                        int columnIndex4 = a10.getColumnIndex("font_ttc_index");
                        int columnIndex5 = a10.getColumnIndex("font_weight");
                        int columnIndex6 = a10.getColumnIndex("font_italic");
                        while (a10.moveToNext()) {
                            if (columnIndex != -1) {
                                i10 = a10.getInt(columnIndex);
                            } else {
                                i10 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i11 = a10.getInt(columnIndex4);
                            } else {
                                i11 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, a10.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, a10.getLong(columnIndex3));
                            }
                            if (columnIndex5 != -1) {
                                i12 = a10.getInt(columnIndex5);
                            } else {
                                i12 = 400;
                            }
                            if (columnIndex6 != -1 && a10.getInt(columnIndex6) == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            arrayList.add(g.b.a(withAppendedId, i11, i12, z10, i10));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = a10;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (a10 != null) {
                a10.close();
            }
            return (g.b[]) arrayList.toArray(new g.b[0]);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
