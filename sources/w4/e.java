package w4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import c5.c;
import java.io.InputStream;
import java.util.List;
import kotlin.coroutines.Continuation;
import okio.l0;
import qc.q;
import t4.p0;
import w4.i;

/* compiled from: ContentUriFetcher.kt */
/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f25372a;

    /* renamed from: b  reason: collision with root package name */
    private final b5.l f25373b;

    /* compiled from: ContentUriFetcher.kt */
    /* loaded from: classes.dex */
    public static final class a implements i.a<Uri> {
        private final boolean c(Uri uri) {
            return q.d(uri.getScheme(), "content");
        }

        @Override // w4.i.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, b5.l lVar, q4.g gVar) {
            if (!c(uri)) {
                return null;
            }
            return new e(uri, lVar);
        }
    }

    public e(Uri uri, b5.l lVar) {
        this.f25372a = uri;
        this.f25373b = lVar;
    }

    private final Bundle d() {
        c.a aVar;
        c.a aVar2;
        c5.c b10 = this.f25373b.o().b();
        if (b10 instanceof c.a) {
            aVar = (c.a) b10;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        int i10 = aVar.f8840a;
        c5.c a10 = this.f25373b.o().a();
        if (a10 instanceof c.a) {
            aVar2 = (c.a) a10;
        } else {
            aVar2 = null;
        }
        if (aVar2 == null) {
            return null;
        }
        int i11 = aVar2.f8840a;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i10, i11));
        return bundle;
    }

    @Override // w4.i
    public Object a(Continuation<? super h> continuation) {
        AssetFileDescriptor openTypedAssetFile;
        ContentResolver contentResolver = this.f25373b.g().getContentResolver();
        InputStream inputStream = null;
        if (b(this.f25372a)) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f25372a, "r");
            if (openAssetFileDescriptor != null) {
                inputStream = openAssetFileDescriptor.createInputStream();
            }
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f25372a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT >= 29 && c(this.f25372a)) {
            openTypedAssetFile = contentResolver.openTypedAssetFile(this.f25372a, "image/*", d(), null);
            if (openTypedAssetFile != null) {
                inputStream = openTypedAssetFile.createInputStream();
            }
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f25372a + "'.").toString());
            }
        } else {
            inputStream = contentResolver.openInputStream(this.f25372a);
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f25372a + "'.").toString());
            }
        }
        return new m(p0.b(l0.d(l0.k(inputStream)), this.f25373b.g(), new t4.e(this.f25372a)), contentResolver.getType(this.f25372a), t4.f.DISK);
    }

    public final boolean b(Uri uri) {
        if (q.d(uri.getAuthority(), "com.android.contacts") && q.d(uri.getLastPathSegment(), "display_photo")) {
            return true;
        }
        return false;
    }

    public final boolean c(Uri uri) {
        List<String> pathSegments;
        int size;
        if (!q.d(uri.getAuthority(), "media") || (size = (pathSegments = uri.getPathSegments()).size()) < 3 || !q.d(pathSegments.get(size - 3), "audio") || !q.d(pathSegments.get(size - 2), "albums")) {
            return false;
        }
        return true;
    }
}
